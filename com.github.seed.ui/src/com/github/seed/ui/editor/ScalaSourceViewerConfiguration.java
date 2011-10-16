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

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;

import com.github.seed.ui.services.ScalaEditorServices;

/**
 * 
 *
 */
public class ScalaSourceViewerConfiguration extends TextSourceViewerConfiguration {
	
	private ScalaEditorServices services;

	@Override
    public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();
		ScalaDamagerRepairer sdr = new ScalaDamagerRepairer(services);
		reconciler.setDamager(sdr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(sdr, IDocument.DEFAULT_CONTENT_TYPE);
		return reconciler;
    }

	public void setServices(ScalaEditorServices services) {
		this.services = services;
	}

}
