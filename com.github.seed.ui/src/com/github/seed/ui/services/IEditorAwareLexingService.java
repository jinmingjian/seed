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

package com.github.seed.ui.services;

import java.util.List;

import com.github.seed.ui.editor.ScalaEditor;

public interface IEditorAwareLexingService {
	List getTokens(final ScalaEditor editor, final int regionOffset, final int regionLength);
}
