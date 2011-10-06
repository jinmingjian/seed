package lpg.runtime;

import java.util.ArrayList;

public interface IPrsStream extends TokenStream
{
    /**
     * 
     * @author pcharles
     *
     */
    class Range {
        public Range(IPrsStream iprs_stream, IToken start_token, IToken end_token) {
        	this.iprsStream = iprs_stream;
            this.startToken = start_token;
            this.endToken = end_token;
        }

        private IPrsStream iprsStream;
        private IToken startToken;
        private IToken endToken;
        private ArrayList<IToken> list = null;

        public IToken getStartToken() { return startToken; }
        public IToken getEndToken() { return endToken; }
        
        public ArrayList<IToken> getTokenList() {
        	if (list == null) {
        		list = new ArrayList<IToken>();
        		iprsStream.addTokensInRangeToList(list, startToken, endToken);
        	}
        	return list;
        }
    }

    IMessageHandler getMessageHandler();
    void setMessageHandler(IMessageHandler errMsg);

    ILexStream getILexStream();

    /**
     * @deprecated replaced by {@link #getILexStream()}
     */
    ILexStream getLexStream();
    
    void setLexStream(ILexStream lexStream);
    
    /**
     * @deprecated replaced by {@link #getFirstRealToken()}
     *
     */
    int getFirstErrorToken(int i);

    /**
     * @deprecated replaced by {@link #getLastRealToken()}
     *
     */
    int getLastErrorToken(int i);

    void makeToken(int startLoc, int endLoc, int kind);

    void makeToken(IToken token, int offset_adjustment);

    void makeAdjunct(int startLoc, int endLoc, int kind);
    
    void makeAdjunct(IToken token, int offset_adjustment);

    void removeLastToken();

    void addTokensInRangeToList(ArrayList<IToken> list, IToken start_token, IToken end_token);

    int getLineCount();

    int getSize();
    
    void remapTerminalSymbols(String[] ordered_parser_symbols, int eof_symbol)
         throws UndefinedEofSymbolException,
                NullExportedSymbolsException,
                NullTerminalSymbolsException,
                UnimplementedTerminalsException;
    String[] orderedTerminalSymbols();
    
    int mapKind(int kind);
    
    void resetTokenStream();

    int getStreamIndex();
    
    void setStreamIndex(int index);

    void setStreamLength();

    void setStreamLength(int len);

    void addToken(IToken token);
    
    void addAdjunct(IToken adjunct);
    
    String[] orderedExportedSymbols();

    java.util.List<IToken> getTokens();
    
    java.util.List<IToken> getAdjuncts();

    IToken[] getFollowingAdjuncts(int i);

    IToken[] getPrecedingAdjuncts(int i);

    IToken getIToken(int i);

    String getTokenText(int i);
    
    int getStartOffset(int i);
    
    int getEndOffset(int i);
    
    /**
     * @deprecated Use function getLineOffsetOfLine()
     * 
     * This function was deprecated because it exposes an implementation detail that
     * should be hidden. I.e., lines are numbered from 1..MAX_LINE_NUMBER, whereas
     * the line offset table is indexed from 0..MAX_LINE_NUMBER-1.
     * 
     * Thus, if a user has a call that reads:
     * 
     *     ... getLineOffset(line_number - 1) ...
     *     
     *  it should be replaced by:
     * 
     *     ... getLineOffsetofLine(line_number) ...
     *     
     */
    int getLineOffset(int i);
    
    /**
     * 
     * @param i
     * @return
     * 
     * Note that 1 is subtracted from the line number before indexing the lineOffsets array.
     * That is because lines are numbered from 1..MAX_LINE_NUMBER, whereas the lineOffsets
     * table is indexed from 0..MAX_LINE_NUMBER-1.
     */
    public int getLineOffsetOfLine(int line_number);
    
    int getLineNumberOfCharAt(int i);

    int getColumnOfCharAt(int i);
    
    int getTokenLength(int i);

    int getLineNumberOfTokenAt(int i);

    int getEndLineNumberOfTokenAt(int i);

    int getColumnOfTokenAt(int i);

    int getEndColumnOfTokenAt(int i);

    ArrayList<IToken> incrementalResetAtCharacterOffset(int damage_offset);

    char [] getInputChars();

    byte [] getInputBytes();
    
    String toString(int first_token, int last_token);

    String toString(IToken t1, IToken t2);

    int getTokenIndexAtCharacter(int offset);
    
    IToken getTokenAtCharacter(int offset);
    
    IToken getTokenAt(int i);
    
    IToken getAdjunctAt(int i);
    
    void dumpTokens();
    
    void dumpToken(int i);
    
    int makeErrorToken(int first, int last, int error, int kind);
}
