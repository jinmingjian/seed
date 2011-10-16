/*******************************************************************************
 * Copyright (c) 2011. All rights reserved by the authors. 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Authors:
 *     Jin Mingjian (jin.phd@gmail.com) - initial API and implementation
 *******************************************************************************/

package com.github.seed.ui.editor;

import java.util.List;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.jface.text.presentation.IPresentationDamager;
import org.eclipse.jface.text.presentation.IPresentationRepairer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;

import com.github.seed.core.services.ILexingService;
import com.github.seed.ui.services.ScalaEditorServices;

public class ScalaDamagerRepairer implements IPresentationDamager,
		IPresentationRepairer {

	/** The document this object works on */
	private IDocument fDocument;
	
	private ILexingService lexingService;
	private String key;
	private TokenColorer fColorer;

	/**
	 * Constructor for ScalaDamagerRepairer.
	 */
	public ScalaDamagerRepairer(ScalaEditorServices services) {
		assert services != null;
		this.lexingService = services.getLexingSerivce();
		this.fColorer = new TokenColorer(lexingService);
		this.key = services.getEditor().getInputPath();
	}

	/**
	 * @see IPresentationRepairer#setDocument(IDocument)
	 */
	public void setDocument(IDocument document) {
		fDocument = document;
	}

	/**
	 * Returns the end offset of the line that contains the specified offset or
	 * if the offset is inside a line delimiter, the end offset of the next
	 * line.
	 * 
	 * @param offset
	 *            the offset whose line end offset must be computed
	 * @return the line end offset for the given offset
	 * @exception BadLocationException
	 *                if offset is invalid in the current document
	 */
	protected int endOfLineOf(int offset) throws BadLocationException {

		IRegion info = fDocument.getLineInformationOfOffset(offset);
		if (offset <= info.getOffset() + info.getLength())
			return info.getOffset() + info.getLength();

		int line = fDocument.getLineOfOffset(offset);
		try {
			info = fDocument.getLineInformation(line + 1);
			return info.getOffset() + info.getLength();
		} catch (BadLocationException x) {
			return fDocument.getLength();
		}
	}

	/**
	 * @see IPresentationDamager#getDamageRegion(ITypedRegion, DocumentEvent,
	 *      boolean)
	 */
	public IRegion getDamageRegion(ITypedRegion partition, DocumentEvent event,
			boolean documentPartitioningChanged) {
		if (!documentPartitioningChanged) {
			try {

				IRegion info = fDocument.getLineInformationOfOffset(event
						.getOffset());
				int start = Math.max(partition.getOffset(), info.getOffset());

				int end = event.getOffset()
						+ (event.getText() == null ? event.getLength() : event
								.getText().length());

				if (info.getOffset() <= end
						&& end <= info.getOffset() + info.getLength()) {
					// optimize the case of the same line
					end = info.getOffset() + info.getLength();
				} else
					end = endOfLineOf(end);

				end = Math.min(partition.getOffset() + partition.getLength(),
						end);
				return new Region(start, end - start);

			} catch (BadLocationException x) {
			}
		}

		return partition;
	}

	/**
	 * @see IPresentationRepairer#createPresentation(TextPresentation,
	 *      ITypedRegion)
	 */
	public void createPresentation(TextPresentation presentation,
			ITypedRegion region) {
		int prevOffset = -1;
		int prevEnd = -1;
		List tokens = lexingService.getTokens(fDocument.get().toCharArray(), 
				region.getOffset(), region.getLength());
		if (tokens == null) {
			return;
		}
		for (Object token : tokens) {
			int offset = lexingService.getStartOffset(token);
			int end = lexingService.getEndOffset(token);

			if (offset <= prevEnd && end >= prevOffset) {
				continue;
			}
			changeTokenPresentation(presentation, token);
			prevOffset = offset;
			prevEnd = end;
		}
	}

	private void changeTokenPresentation(TextPresentation presentation,
			Object token) {
		TextAttribute attribute = fColorer.getColoring(token);

		StyleRange styleRange = new StyleRange(
				lexingService.getStartOffset(token),
				lexingService.getEndOffset(token)
						- lexingService.getStartOffset(token) + 1,
				attribute == null ? null : attribute.getForeground(),
				attribute == null ? null : attribute.getBackground(),
				attribute == null ? SWT.NORMAL : attribute.getStyle());

		if (styleRange.length <= 0
				|| styleRange.start + styleRange.length > fDocument.getLength()) {
		} else {
			presentation.addStyleRange(styleRange);
		}
	}

}
