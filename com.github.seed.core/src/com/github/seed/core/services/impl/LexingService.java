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
	//XXX: now the key is just the filePath of one scu
	private String key;
    private boolean[] fIsKeyword;
    private ScalaModelLexer fLexer;
    private IPrsStream fParseStream;

    
    public String getKey() {
    	return this.key;
    }
    
    /*
     * NOTE: re-new lexer/parseStream for some unwanted state cache in LPG
     */
	private void lexing(String key, int startOffset, int endOffset) {
		try {
			this.fLexer = new ScalaModelLexer(key);
			this.fParseStream = new PrsStream();
			this.fLexer.lexer(this.fParseStream,startOffset,endOffset);
			cacheKeywordsOnce();
//			this.fParseStream.dumpTokens();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    @Override
    public List getTokens(String key, final int regionOffset, final int regionLength) {
    	lexing(key, regionOffset, regionOffset + regionLength - 1);
        return fParseStream.getTokens(); 
    }

    @Override
    public boolean isKeyword(Object token) {
    	assert token instanceof IToken;
    	int kind = ((IToken)token).getKind();
        return kind >= 0 && kind < fIsKeyword.length && fIsKeyword[kind];
    }

    protected void cacheKeywordsOnce() {
        if (fIsKeyword == null) {
            String tokenKindNames[] = ScalaModelLexerexp.orderedTerminalSymbols;

            fIsKeyword= new boolean[tokenKindNames.length];

            int[] keywordKinds= this.fLexer.getKeywordKinds();
            for(int i= 1; i < keywordKinds.length; i++) {
                int index= this.fParseStream.mapKind(keywordKinds[i]);
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
