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

package com.github.seed.core.services;

import java.util.List;

import static com.github.seed.core.scalamodel.ScalaModelLexerexp.*;

public interface ILexingService {
	int TK_IDENTIFIER = IDENTIFIER;
	int TK_SLCOMMENT = SlComment;
	int TK_MLCOMMENT = MlComment;
	int TK_STRINGLITERAL = StringLiteral;
	int TK_SYMBOLLITERAL = SymbolLiteral;
	int TK_EOF_TOKEN = EOF_TOKEN;
	int TK_COLON = COLON;
	
	String getKey();
	List getTokens(final String filePath, final int regionOffset, final int regionLength);
	int getStartOffset(Object token);
    int getEndOffset(Object token);
    int getKind(Object token);
    boolean isKeyword(Object token);
}
