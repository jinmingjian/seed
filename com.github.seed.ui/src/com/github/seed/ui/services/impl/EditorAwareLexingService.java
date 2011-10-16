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

package com.github.seed.ui.services.impl;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.filebuffers.FileBuffers;
import org.eclipse.core.filebuffers.ITextFileBuffer;
import org.eclipse.core.filebuffers.ITextFileBufferManager;
import org.eclipse.jface.text.IDocument;

import com.github.seed.core.services.ILexingService;
import com.github.seed.ui.editor.ScalaEditor;
import com.github.seed.ui.services.IEditorAwareLexingService;

public class EditorAwareLexingService implements IEditorAwareLexingService {
	
	private final ILexingService lexingSerivce;

	@Inject
	public EditorAwareLexingService(ILexingService lexingSerivce) {
		this.lexingSerivce = lexingSerivce;
	}

//	public ILexingService getLexingSerivce() {
//		return lexingSerivce;
//	}

    @Override
    public List getTokens(ScalaEditor editor, final int regionOffset, final int regionLength) {
    	return lexingSerivce.getTokens(null, regionOffset, regionLength);
    }

}
