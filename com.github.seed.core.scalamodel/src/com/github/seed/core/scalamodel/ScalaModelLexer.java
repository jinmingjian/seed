package com.github.seed.core.scalamodel;


    //#line 123 "LexerTemplateF.gi
import lpg.runtime.*;

    //#line 128 "LexerTemplateF.gi

public class ScalaModelLexer extends Object implements RuleAction
{
    private ScalaModelLexerLpgLexStream lexStream;
    
    private static ParseTable prs = new ScalaModelLexerprs();
    public ParseTable getParseTable() { return prs; }

    private LexParser lexParser = new LexParser();
    public LexParser getParser() { return lexParser; }

    public int getToken(int i) { return lexParser.getToken(i); }
    public int getRhsFirstTokenIndex(int i) { return lexParser.getFirstToken(i); }
    public int getRhsLastTokenIndex(int i) { return lexParser.getLastToken(i); }

    public int getLeftSpan() { return lexParser.getToken(1); }
    public int getRightSpan() { return lexParser.getLastToken(); }

    public void resetKeywordLexer()
    {
        if (kwLexer == null)
              this.kwLexer = new ScalaModelKWLexer(lexStream.getInputChars(), ScalaModelLexerexp.IDENTIFIER);
        else this.kwLexer.setInputChars(lexStream.getInputChars());
    }

    public void reset(String filename, int tab) throws java.io.IOException
    {
        lexStream = new ScalaModelLexerLpgLexStream(filename, tab);
        lexParser.reset((ILexStream) lexStream, prs, (RuleAction) this);
        resetKeywordLexer();
    }

    public void reset(char[] input_chars, String filename)
    {
        reset(input_chars, filename, 1);
    }
    
    public void reset(char[] input_chars, String filename, int tab)
    {
        lexStream = new ScalaModelLexerLpgLexStream(input_chars, filename, tab);
        lexParser.reset((ILexStream) lexStream, prs, (RuleAction) this);
        resetKeywordLexer();
    }
    
    public ScalaModelLexer(String filename, int tab) throws java.io.IOException 
    {
        reset(filename, tab);
    }

    public ScalaModelLexer(char[] input_chars, String filename, int tab)
    {
        reset(input_chars, filename, tab);
    }

    public ScalaModelLexer(char[] input_chars, String filename)
    {
        reset(input_chars, filename, 1);
    }

    public ScalaModelLexer() {}

    public ILexStream getILexStream() { return lexStream; }

    /**
     * @deprecated replaced by {@link #getILexStream()}
     */
    public ILexStream getLexStream() { return lexStream; }

    private void initializeLexer(IPrsStream prsStream, int start_offset, int end_offset)
    {
        if (lexStream.getInputChars() == null)
            throw new NullPointerException("LexStream was not initialized");
        lexStream.setPrsStream(prsStream);
        prsStream.makeToken(start_offset, end_offset, 0); // Token list must start with a bad token
    }

    private void addEOF(IPrsStream prsStream, int end_offset)
    {
        prsStream.makeToken(end_offset, end_offset, ScalaModelLexerexp.EOF_TOKEN); // and end with the end of file token
        prsStream.setStreamLength(prsStream.getSize());
    }

    public void lexer(IPrsStream prsStream)
    {
        lexer(null, prsStream);
    }
    
    public void lexer(Monitor monitor, IPrsStream prsStream)
    {
        initializeLexer(prsStream, 0, -1);
        lexParser.parseCharacters(monitor);  // Lex the input characters
        addEOF(prsStream, lexStream.getStreamIndex());
    }

    public void lexer(IPrsStream prsStream, int start_offset, int end_offset)
    {
        lexer(null, prsStream, start_offset, end_offset);
    }
    
    public void lexer(Monitor monitor, IPrsStream prsStream, int start_offset, int end_offset)
    {
        if (start_offset <= 1)
             initializeLexer(prsStream, 0, -1);
        else initializeLexer(prsStream, start_offset - 1, start_offset - 1);

        lexParser.parseCharacters(monitor, start_offset, end_offset);

        addEOF(prsStream, (end_offset >= lexStream.getStreamIndex() ? lexStream.getStreamIndex() : end_offset + 1));
    }
    
    public IPrsStream.Range incrementalLexer(char[] input_chars, int start_change_offset, int end_change_offset) {
        int offset_adjustment = input_chars.length - lexStream.getStreamLength();
//*System.out.println("The offset adjustment is " + offset_adjustment);
        if (start_change_offset <= 0 && start_change_offset < input_chars.length)
            throw new IndexOutOfBoundsException("The start offset " + start_change_offset +
                                                " is out of bounds for range 0.." + (input_chars.length - 1));
        if (end_change_offset <= 0 && end_change_offset < input_chars.length)
            throw new IndexOutOfBoundsException("The end offset " + end_change_offset +
                                                " is out of bounds for range 0.." + (input_chars.length - 1));
        
        //
        // Get the potential list of tokens to be rescanned
        //
        java.util.ArrayList<IToken> affected_tokens = lexStream.getIPrsStream().incrementalResetAtCharacterOffset(start_change_offset); 
        
        //
        // If the change occured between the first two affected tokens (or adjunct) and not immediately
        // on the characted after the first token (or adjunct), restart the scanning after the first
        // affected token. Otherwise, rescan the first token.
        //
        int affected_index = 0;
        int repair_offset = start_change_offset;
        if (affected_tokens.size() > 0) {
            if (affected_tokens.get(0).getEndOffset() + 1 < start_change_offset) {
                 repair_offset = affected_tokens.get(0).getEndOffset() + 1;
                 if (affected_tokens.get(0) instanceof Token)
                     lexStream.getIPrsStream().makeToken(affected_tokens.get(0), 0);
                else lexStream.getIPrsStream().makeAdjunct(affected_tokens.get(0), 0);
                affected_index++;                    
            }
            else repair_offset = affected_tokens.get(0).getStartOffset();
        } 

        lexStream.setInputChars(input_chars);
        lexStream.setStreamLength(input_chars.length);
        lexStream.computeLineOffsets(repair_offset);

        int first_new_token_index = lexStream.getIPrsStream().getTokens().size(),
            first_new_adjunct_index = lexStream.getIPrsStream().getAdjuncts().size();
        
        resetKeywordLexer();
        lexParser.resetTokenStream(repair_offset);
        int next_offset;
        do {
//*System.out.println("Scanning token starting at " + (lexStream.peek() - 1));            
            next_offset = lexParser.incrementalParseCharacters();
//*System.out.print("***Remaining string: \"");
//*for (int i = next_offset; i < input_chars.length; i++)
//*System.out.print(input_chars[i]);
//*System.out.println("\"");                    
            while (affected_index < affected_tokens.size() && 
                   affected_tokens.get(affected_index).getStartOffset() + offset_adjustment < next_offset)
//*{
//*System.out.println("---Skipping token " + affected_index + ": \"" + affected_tokens.get(affected_index).toString() +
//*"\" starting at adjusted offset " + (affected_tokens.get(affected_index).getStartOffset() + offset_adjustment));                           
                affected_index++;
//*}
        } while(next_offset <= end_change_offset &&          // still in the damage region and ...
                (affected_index < affected_tokens.size() &&  // not resynchronized with a token in the list of affected tokens
                 affected_tokens.get(affected_index).getStartOffset() + offset_adjustment != next_offset));

        //
        // If any new tokens were added, compute the first and the last one.
        //
        IToken first_new_token = null,
               last_new_token = null;
        if (first_new_token_index < lexStream.getIPrsStream().getTokens().size()) {
            first_new_token = lexStream.getIPrsStream().getTokenAt(first_new_token_index);
            last_new_token = lexStream.getIPrsStream().getTokenAt(lexStream.getIPrsStream().getTokens().size() - 1);
        }
        //
        // If an adjunct was added prior to the first real token, chose it instead as the first token.
        // Similarly, if adjucts were added after the last token, chose the last adjunct added as the last token.
        //
        if (first_new_adjunct_index < lexStream.getIPrsStream().getAdjuncts().size()) {
            if (first_new_token == null ||
                lexStream.getIPrsStream().getAdjunctAt(first_new_adjunct_index).getStartOffset() <
                first_new_token.getStartOffset()) {
                first_new_token = lexStream.getIPrsStream().getAdjunctAt(first_new_adjunct_index);
            }
            if (last_new_token == null ||
                lexStream.getIPrsStream().getAdjunctAt(lexStream.getIPrsStream().getAdjuncts().size() - 1).getEndOffset() >
                last_new_token.getEndOffset()) {
                last_new_token = lexStream.getIPrsStream().getAdjunctAt(lexStream.getIPrsStream().getAdjuncts().size() - 1);
            }
        }
        
        //
        // For all remainng tokens (and adjuncts) in the list of affected tokens add them to the
        // list of tokens (and adjuncts).
        //
        for (int i = affected_index; i < affected_tokens.size(); i++) {
            if (affected_tokens.get(i) instanceof Token)
                 lexStream.getIPrsStream().makeToken(affected_tokens.get(i), offset_adjustment);
            else lexStream.getIPrsStream().makeAdjunct(affected_tokens.get(i), offset_adjustment);
//*System.out.println("+++Added affected token " + i + ": \"" + affected_tokens.get(i).toString() +
//*"\" starting at adjusted offset " + (affected_tokens.get(i).getStartOffset() + offset_adjustment));                           
        }
        
        return new IPrsStream.Range(lexStream.getIPrsStream(), first_new_token, last_new_token);
    }

    /**
     * If a parse stream was not passed to this Lexical analyser then we
     * simply report a lexical error. Otherwise, we produce a bad token.
     */
    public void reportLexicalError(int startLoc, int endLoc) {
        IPrsStream prs_stream = lexStream.getIPrsStream();
        if (prs_stream == null)
            lexStream.reportLexicalError(startLoc, endLoc);
        else {
            //
            // Remove any token that may have been processed that fall in the
            // range of the lexical error... then add one error token that spans
            // the error range.
            //
            for (int i = prs_stream.getSize() - 1; i > 0; i--) {
                if (prs_stream.getStartOffset(i) >= startLoc)
                     prs_stream.removeLastToken();
                else break;
            }
            prs_stream.makeToken(startLoc, endLoc, 0); // add an error token to the prsStream
        }        
    }

    //#line 5 "LexerBasicMapF.gi

    //
    // The Lexer contains an array of characters as the input stream to be parsed.
    // There are methods to retrieve and classify characters.
    // The lexparser "token" is implemented simply as the index of the next character in the array.
    // The Lexer extends the abstract class LpgLexStream with an implementation of the abstract
    // method getKind.  The template defines the Lexer class and the lexer() method.
    // A driver creates the action class, "Lexer", passing an Option object to the constructor.
    //
    ScalaModelKWLexer kwLexer;
    boolean printTokens;
    private final static int ECLIPSE_TAB_VALUE = 4;

    public int [] getKeywordKinds() { return kwLexer.getKeywordKinds(); }

    public ScalaModelLexer(String filename) throws java.io.IOException
    {
        this(filename, ECLIPSE_TAB_VALUE);
        this.kwLexer = new ScalaModelKWLexer(lexStream.getInputChars(), ScalaModelLexerexp.IDENTIFIER);
    }

    /**
     * @deprecated function replaced by {@link #reset(char [] content, String filename)}
     */
    public void initialize(char [] content, String filename)
    {
        reset(content, filename);
    }
    
    final void makeToken(int left_token, int right_token, int kind)
    {
        lexStream.makeToken(left_token, right_token, kind);
    }
    
    final void makeToken(int kind)
    {
        int startOffset = getLeftSpan(),
            endOffset = getRightSpan();
        lexStream.makeToken(startOffset, endOffset, kind);
        if (printTokens) printValue(startOffset, endOffset);
    }

    final void makeComment(int kind)
    {
        int startOffset = getLeftSpan(),
            endOffset = getRightSpan();
        lexStream.getIPrsStream().makeAdjunct(startOffset, endOffset, kind);
    }

    final void skipToken()
    {
        if (printTokens) printValue(getLeftSpan(), getRightSpan());
    }
    
    final void checkForKeyWord()
    {
        int startOffset = getLeftSpan(),
            endOffset = getRightSpan(),
            kwKind = kwLexer.lexer(startOffset, endOffset);
        lexStream.makeToken(startOffset, endOffset, kwKind);
        if (printTokens) printValue(startOffset, endOffset);
    }
    
    //
    // This flavor of checkForKeyWord is necessary when the default kind
    // (which is returned when the keyword filter doesn't match) is something
    // other than _IDENTIFIER.
    //
    final void checkForKeyWord(int defaultKind)
    {
        int startOffset = getLeftSpan(),
            endOffset = getRightSpan(),
            kwKind = kwLexer.lexer(startOffset, endOffset);
        if (kwKind == ScalaModelLexerexp.IDENTIFIER)
            kwKind = defaultKind;
        lexStream.makeToken(startOffset, endOffset, kwKind);
        if (printTokens) printValue(startOffset, endOffset);
    }
    
    final void printValue(int startOffset, int endOffset)
    {
        String s = new String(lexStream.getInputChars(), startOffset, endOffset - startOffset + 1);
        System.out.print(s);
    }

    //
    //
    //
    static class ScalaModelLexerLpgLexStream extends LpgLexStream
    {
    public final static int tokenKind[] =
    {
        ScalaModelLexersym.Char_CtlCharNotWS,    // 000    0x00
        ScalaModelLexersym.Char_CtlCharNotWS,    // 001    0x01
        ScalaModelLexersym.Char_CtlCharNotWS,    // 002    0x02
        ScalaModelLexersym.Char_CtlCharNotWS,    // 003    0x03
        ScalaModelLexersym.Char_CtlCharNotWS,    // 004    0x04
        ScalaModelLexersym.Char_CtlCharNotWS,    // 005    0x05
        ScalaModelLexersym.Char_CtlCharNotWS,    // 006    0x06
        ScalaModelLexersym.Char_CtlCharNotWS,    // 007    0x07
        ScalaModelLexersym.Char_CtlCharNotWS,    // 008    0x08
        ScalaModelLexersym.Char_HT,              // 009    0x09
        ScalaModelLexersym.Char_LF,              // 010    0x0A
        ScalaModelLexersym.Char_CtlCharNotWS,    // 011    0x0B
        ScalaModelLexersym.Char_FF,              // 012    0x0C
        ScalaModelLexersym.Char_CR,              // 013    0x0D
        ScalaModelLexersym.Char_CtlCharNotWS,    // 014    0x0E
        ScalaModelLexersym.Char_CtlCharNotWS,    // 015    0x0F
        ScalaModelLexersym.Char_CtlCharNotWS,    // 016    0x10
        ScalaModelLexersym.Char_CtlCharNotWS,    // 017    0x11
        ScalaModelLexersym.Char_CtlCharNotWS,    // 018    0x12
        ScalaModelLexersym.Char_CtlCharNotWS,    // 019    0x13
        ScalaModelLexersym.Char_CtlCharNotWS,    // 020    0x14
        ScalaModelLexersym.Char_CtlCharNotWS,    // 021    0x15
        ScalaModelLexersym.Char_CtlCharNotWS,    // 022    0x16
        ScalaModelLexersym.Char_CtlCharNotWS,    // 023    0x17
        ScalaModelLexersym.Char_CtlCharNotWS,    // 024    0x18
        ScalaModelLexersym.Char_CtlCharNotWS,    // 025    0x19
        ScalaModelLexersym.Char_CtlCharNotWS,    // 026    0x1A
        ScalaModelLexersym.Char_CtlCharNotWS,    // 027    0x1B
        ScalaModelLexersym.Char_CtlCharNotWS,    // 028    0x1C
        ScalaModelLexersym.Char_CtlCharNotWS,    // 029    0x1D
        ScalaModelLexersym.Char_CtlCharNotWS,    // 030    0x1E
        ScalaModelLexersym.Char_CtlCharNotWS,    // 031    0x1F
        ScalaModelLexersym.Char_Space,           // 032    0x20
        ScalaModelLexersym.Char_Exclamation,     // 033    0x21
        ScalaModelLexersym.Char_DoubleQuote,     // 034    0x22
        ScalaModelLexersym.Char_Sharp,           // 035    0x23
        ScalaModelLexersym.Char_DollarSign,      // 036    0x24
        ScalaModelLexersym.Char_Percent,         // 037    0x25
        ScalaModelLexersym.Char_Ampersand,       // 038    0x26
        ScalaModelLexersym.Char_SingleQuote,     // 039    0x27
        ScalaModelLexersym.Char_LeftParen,       // 040    0x28
        ScalaModelLexersym.Char_RightParen,      // 041    0x29
        ScalaModelLexersym.Char_Star,            // 042    0x2A
        ScalaModelLexersym.Char_Plus,            // 043    0x2B
        ScalaModelLexersym.Char_Comma,           // 044    0x2C
        ScalaModelLexersym.Char_Minus,           // 045    0x2D
        ScalaModelLexersym.Char_Dot,             // 046    0x2E
        ScalaModelLexersym.Char_Slash,           // 047    0x2F
        ScalaModelLexersym.Char_0,               // 048    0x30
        ScalaModelLexersym.Char_1,               // 049    0x31
        ScalaModelLexersym.Char_2,               // 050    0x32
        ScalaModelLexersym.Char_3,               // 051    0x33
        ScalaModelLexersym.Char_4,               // 052    0x34
        ScalaModelLexersym.Char_5,               // 053    0x35
        ScalaModelLexersym.Char_6,               // 054    0x36
        ScalaModelLexersym.Char_7,               // 055    0x37
        ScalaModelLexersym.Char_8,               // 056    0x38
        ScalaModelLexersym.Char_9,               // 057    0x39
        ScalaModelLexersym.Char_Colon,           // 058    0x3A
        ScalaModelLexersym.Char_SemiColon,       // 059    0x3B
        ScalaModelLexersym.Char_LessThan,        // 060    0x3C
        ScalaModelLexersym.Char_Equal,           // 061    0x3D
        ScalaModelLexersym.Char_GreaterThan,     // 062    0x3E
        ScalaModelLexersym.Char_QuestionMark,    // 063    0x3F
        ScalaModelLexersym.Char_AtSign,          // 064    0x40
        ScalaModelLexersym.Char_A,               // 065    0x41
        ScalaModelLexersym.Char_B,               // 066    0x42
        ScalaModelLexersym.Char_C,               // 067    0x43
        ScalaModelLexersym.Char_D,               // 068    0x44
        ScalaModelLexersym.Char_E,               // 069    0x45
        ScalaModelLexersym.Char_F,               // 070    0x46
        ScalaModelLexersym.Char_G,               // 071    0x47
        ScalaModelLexersym.Char_H,               // 072    0x48
        ScalaModelLexersym.Char_I,               // 073    0x49
        ScalaModelLexersym.Char_J,               // 074    0x4A
        ScalaModelLexersym.Char_K,               // 075    0x4B
        ScalaModelLexersym.Char_L,               // 076    0x4C
        ScalaModelLexersym.Char_M,               // 077    0x4D
        ScalaModelLexersym.Char_N,               // 078    0x4E
        ScalaModelLexersym.Char_O,               // 079    0x4F
        ScalaModelLexersym.Char_P,               // 080    0x50
        ScalaModelLexersym.Char_Q,               // 081    0x51
        ScalaModelLexersym.Char_R,               // 082    0x52
        ScalaModelLexersym.Char_S,               // 083    0x53
        ScalaModelLexersym.Char_T,               // 084    0x54
        ScalaModelLexersym.Char_U,               // 085    0x55
        ScalaModelLexersym.Char_V,               // 086    0x56
        ScalaModelLexersym.Char_W,               // 087    0x57
        ScalaModelLexersym.Char_X,               // 088    0x58
        ScalaModelLexersym.Char_Y,               // 089    0x59
        ScalaModelLexersym.Char_Z,               // 090    0x5A
        ScalaModelLexersym.Char_LeftBracket,     // 091    0x5B
        ScalaModelLexersym.Char_BackSlash,       // 092    0x5C
        ScalaModelLexersym.Char_RightBracket,    // 093    0x5D
        ScalaModelLexersym.Char_Caret,           // 094    0x5E
        ScalaModelLexersym.Char__,               // 095    0x5F
        ScalaModelLexersym.Char_BackQuote,       // 096    0x60
        ScalaModelLexersym.Char_a,               // 097    0x61
        ScalaModelLexersym.Char_b,               // 098    0x62
        ScalaModelLexersym.Char_c,               // 099    0x63
        ScalaModelLexersym.Char_d,               // 100    0x64
        ScalaModelLexersym.Char_e,               // 101    0x65
        ScalaModelLexersym.Char_f,               // 102    0x66
        ScalaModelLexersym.Char_g,               // 103    0x67
        ScalaModelLexersym.Char_h,               // 104    0x68
        ScalaModelLexersym.Char_i,               // 105    0x69
        ScalaModelLexersym.Char_j,               // 106    0x6A
        ScalaModelLexersym.Char_k,               // 107    0x6B
        ScalaModelLexersym.Char_l,               // 108    0x6C
        ScalaModelLexersym.Char_m,               // 109    0x6D
        ScalaModelLexersym.Char_n,               // 110    0x6E
        ScalaModelLexersym.Char_o,               // 111    0x6F
        ScalaModelLexersym.Char_p,               // 112    0x70
        ScalaModelLexersym.Char_q,               // 113    0x71
        ScalaModelLexersym.Char_r,               // 114    0x72
        ScalaModelLexersym.Char_s,               // 115    0x73
        ScalaModelLexersym.Char_t,               // 116    0x74
        ScalaModelLexersym.Char_u,               // 117    0x75
        ScalaModelLexersym.Char_v,               // 118    0x76
        ScalaModelLexersym.Char_w,               // 119    0x77
        ScalaModelLexersym.Char_x,               // 120    0x78
        ScalaModelLexersym.Char_y,               // 121    0x79
        ScalaModelLexersym.Char_z,               // 122    0x7A
        ScalaModelLexersym.Char_LeftBrace,       // 123    0x7B
        ScalaModelLexersym.Char_VerticalBar,     // 124    0x7C
        ScalaModelLexersym.Char_RightBrace,      // 125    0x7D
        ScalaModelLexersym.Char_Tilde,           // 126    0x7E

        ScalaModelLexersym.Char_AfterASCII,      // for all chars in range 128..65534
        ScalaModelLexersym.Char_EOF              // for '\uffff' or 65535 
    };
            
    public final int getKind(int i)  // Classify character at ith location
    {
        int c = (i >= getStreamLength() ? '\uffff' : getCharValue(i));
        return (c < 128 // ASCII Character
                  ? tokenKind[c]
                  : c == '\uffff'
                       ? ScalaModelLexersym.Char_EOF
                       : ScalaModelLexersym.Char_AfterASCII);
    }

    public String[] orderedExportedSymbols() { return ScalaModelLexerexp.orderedTerminalSymbols; }

    public ScalaModelLexerLpgLexStream(String filename, int tab) throws java.io.IOException
    {
        super(filename, tab);
    }

    public ScalaModelLexerLpgLexStream(char[] input_chars, String filename, int tab)
    {
        super(input_chars, filename, tab);
    }

    public ScalaModelLexerLpgLexStream(char[] input_chars, String filename)
    {
        super(input_chars, filename, 1);
    }
    }

    //#line 366 "LexerTemplateF.gi

    public void ruleAction(int ruleNumber)
    {
        switch(ruleNumber)
        {

            //
            // Rule 1:  Token ::= Identifier
            //
            case 1: { 
            
                checkForKeyWord();
                break;
            }
            //
            // Rule 2:  Token ::= StringLiteral
            //
            case 2: { 
            
                makeToken(ScalaModelLexerexp.StringLiteral);
                break;
            }
            //
            // Rule 3:  Token ::= SymbolLiteral
            //
            case 3: { 
            
                makeToken(ScalaModelLexerexp.SymbolLiteral);
                break;
            }
            //
            // Rule 4:  Token ::= ' NotSQ '
            //
            case 4: { 
            
                makeToken(ScalaModelLexerexp.CharacterLiteral);
                break;
            }
            //
            // Rule 5:  Token ::= IntegerLiteral
            //
            case 5: { 
            
                makeToken(ScalaModelLexerexp.IntegerLiteral);
                break;
            }
            //
            // Rule 6:  Token ::= FloatingPointLiteral
            //
            case 6: { 
            
                makeToken(ScalaModelLexerexp.FloatingPointLiteral);
                break;
            }
            //
            // Rule 7:  Token ::= DoubleLiteral
            //
            case 7: { 
            
                makeToken(ScalaModelLexerexp.DoubleLiteral);
                break;
            }
            //
            // Rule 8:  Token ::= / * Inside Stars /
            //
            case 8: { 
            
                if (getILexStream().getKind(getRhsFirstTokenIndex(3)) == ScalaModelLexersym.Char_Star)
                     makeComment(ScalaModelLexerexp.DocComment);
                else makeComment(ScalaModelLexerexp.MlComment);
                break;
            }
            //
            // Rule 9:  Token ::= SLC
            //
            case 9: { 
            
                makeComment(ScalaModelLexerexp.SlComment);
                break;
            }
            //
            // Rule 10:  Token ::= WS
            //
            case 10: { 
            
                skipToken();
                break;
            }
            //
            // Rule 11:  Token ::= (
            //
            case 11: { 
            
                makeToken(ScalaModelLexerexp.LPAREN);
                break;
            }
            //
            // Rule 12:  Token ::= )
            //
            case 12: { 
            
                makeToken(ScalaModelLexerexp.RPAREN);
                break;
            }
            //
            // Rule 13:  Token ::= :
            //
            case 13: { 
            
                makeToken(ScalaModelLexerexp.COLON);
                break;
            }
            //
            // Rule 14:  Token ::= ,
            //
            case 14: { 
            
                makeToken(ScalaModelLexerexp.COMMA);
                break;
            }
            //
            // Rule 15:  Token ::= ;
            //
            case 15: { 
            
                makeToken(ScalaModelLexerexp.SEMICOLON);
                break;
            }
            //
            // Rule 16:  Token ::= .
            //
            case 16: { 
            
                makeToken(ScalaModelLexerexp.DOT);
                break;
            }
            //
            // Rule 17:  Token ::= [
            //
            case 17: { 
            
                makeToken(ScalaModelLexerexp.LBRACKET);
                break;
            }
            //
            // Rule 18:  Token ::= ]
            //
            case 18: { 
            
                makeToken(ScalaModelLexerexp.RBRACKET);
                break;
            }
            //
            // Rule 19:  Token ::= {
            //
            case 19: { 
            
                makeToken(ScalaModelLexerexp.LBRACE);
                break;
            }
            //
            // Rule 20:  Token ::= }
            //
            case 20: { 
            
                makeToken(ScalaModelLexerexp.RBRACE);
                break;
            }
    //#line 370 "LexerTemplateF.gi

    
            default:
                break;
        }
        return;
    }
}

