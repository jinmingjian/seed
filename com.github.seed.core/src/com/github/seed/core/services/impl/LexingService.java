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

package com.github.seed.core.services.impl;

import java.io.IOException;
import java.util.List;

import lpg.runtime.IPrsStream;
import lpg.runtime.IToken;
import lpg.runtime.PrsStream;

import com.github.seed.core.scalamodel.ScalaModelLexer;
import com.github.seed.core.scalamodel.ScalaModelLexerexp;
import com.github.seed.core.services.ILexingService;

public class LexingService implements ILexingService {
	private final static int ECLIPSE_TAB_VALUE = 4;
    private boolean[] fIsKeyword;
    
    /*
     * NOTE: re-new lexer/parseStream for some unwanted state cache in LPG
     */
	private void lexing(char[] contents, int startOffset, int endOffset) {
		
	}

    @Override
    public List getTokens(final char[] contents, final int regionOffset, final int regionLength) {
    	ScalaModelLexer lexer = new ScalaModelLexer();
		lexer.reset(contents, null, ECLIPSE_TAB_VALUE);
		IPrsStream parseStream = new PrsStream();
		lexer.getILexStream().setPrsStream(parseStream);
		lexer.lexer(parseStream, regionOffset, regionOffset+regionLength-1);
		cacheKeywordsOnce(lexer,parseStream);
//		this.fParseStream.dumpTokens();
        return parseStream.getTokens(); 
    }

    @Override
    public boolean isKeyword(Object token) {
    	assert token instanceof IToken;
    	int kind = ((IToken)token).getKind();
        return kind >= 0 && kind < fIsKeyword.length && fIsKeyword[kind];
    }

    protected void cacheKeywordsOnce(ScalaModelLexer lexer, IPrsStream parseStream) {
        if (fIsKeyword == null) {
            String tokenKindNames[] = ScalaModelLexerexp.orderedTerminalSymbols;

            fIsKeyword= new boolean[tokenKindNames.length];

            int[] keywordKinds= lexer.getKeywordKinds();
            for(int i= 1; i < keywordKinds.length; i++) {
                int index= parseStream.mapKind(keywordKinds[i]);
                fIsKeyword[index]= true;
            }
        }
    }

	@Override
	public int getStartOffset(Object token) {
		assert token instanceof IToken;
		return ((IToken)token).getStartOffset();
	}

	@Override
	public int getEndOffset(Object token) {
		assert token instanceof IToken;
		return ((IToken)token).getEndOffset();
	}

	@Override
	public int getKind(Object token) {
		assert token instanceof IToken;
		return ((IToken)token).getKind();
	}

}
