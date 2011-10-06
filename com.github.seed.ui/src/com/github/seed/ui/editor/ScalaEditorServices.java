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

import javax.inject.Inject;

import com.github.seed.core.services.ILexingService;

public class ScalaEditorServices {
	
	private final ILexingService lexingSerivce;

	@Inject
	public ScalaEditorServices(ILexingService lexingSerivce) {
		this.lexingSerivce = lexingSerivce;
	}

	public ILexingService getLexingSerivce() {
		return lexingSerivce;
	}
	
	private ScalaEditor editor;
	public void setEditor(ScalaEditor editor){
		this.editor = editor;
	}
	public ScalaEditor getEditor(){
		return this.editor;
	}

}
