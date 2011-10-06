package lpg.runtime;

public interface ILexStream extends TokenStream
{
    IPrsStream getIPrsStream();

    /**
     * @deprecated replaced by {@link #getIPrsStream()}
     */
    IPrsStream getPrsStream();
    
    void setPrsStream(IPrsStream stream);

    int getLineCount();

    String[] orderedExportedSymbols();

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
    
    char getCharValue(int i);

    int getIntValue(int i);

    void makeToken(int startLoc, int endLoc, int kind);
    
    void setMessageHandler(IMessageHandler errMsg);
    IMessageHandler getMessageHandler();

    /**
     * See IMessaageHandler for a description of the int[] return value.
     */
    int[] getLocation(int left_loc, int right_loc);

    void reportLexicalError(int left, int right);

    void reportLexicalError(int errorCode, int left_loc, int right_loc, int error_left_loc, int error_right_loc, String errorInfo[]);

    String toString(int startOffset, int endOffset);
}
