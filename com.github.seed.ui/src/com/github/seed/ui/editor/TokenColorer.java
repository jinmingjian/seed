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

import org.eclipse.swt.SWT;

import org.eclipse.jface.text.TextAttribute;

import com.github.seed.core.services.ILexingService;
import com.github.seed.ui.ColorManager;

import static com.github.seed.core.services.ILexingService.*;

public class TokenColorer {
	
	private final ILexingService lexingService;

	private static final TextAttribute Attribute_DEFAULT;
	private static final TextAttribute Attribute_COMMENT;
	private static final TextAttribute Attribute_STRINGLITERAL;
	private static final TextAttribute Attribute_KEYWORD;
	static {
		Attribute_DEFAULT = new TextAttribute(ColorManager.SCALA_DEFAULT, null, SWT.NORMAL);
		Attribute_COMMENT = new TextAttribute(ColorManager.SCALA_COMMENT, null, SWT.ITALIC);
		Attribute_STRINGLITERAL = new TextAttribute(ColorManager.SCALA_STRINGLITERAL, null, SWT.NORMAL);
		Attribute_KEYWORD = new TextAttribute(ColorManager.SCALA_KEYWORD, null, SWT.BOLD);
	}

	public TextAttribute getColoring(Object token) {
		if (lexingService.getKind(token) == TK_EOF_TOKEN)
	        return null;
		switch (lexingService.getKind(token)) {
		case TK_STRINGLITERAL:
		    return Attribute_STRINGLITERAL;
		case TK_SLCOMMENT:
		case TK_MLCOMMENT:
			return Attribute_COMMENT;
		case TK_COLON:
			return Attribute_KEYWORD;
		default:
		    if (lexingService.isKeyword(token))
		        return Attribute_KEYWORD;
		    return Attribute_DEFAULT;
		}
	}

	public TokenColorer(ILexingService lexingService) {
		this.lexingService = lexingService;
	}
}
