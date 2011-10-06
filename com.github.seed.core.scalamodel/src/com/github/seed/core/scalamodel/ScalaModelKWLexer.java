package com.github.seed.core.scalamodel;


    //#line 58 "KeywordTemplateF.gi
import lpg.runtime.*;

    //#line 63 "KeywordTemplateF.gi

public class ScalaModelKWLexer extends ScalaModelKWLexerprs
{
    private char[] inputChars;
    private final int keywordKind[] = new int[49 + 1];

    public int[] getKeywordKinds() { return keywordKind; }

    public int lexer(int curtok, int lasttok)
    {
        int current_kind = getKind(inputChars[curtok]),
            act;

        for (act = tAction(START_STATE, current_kind);
             act > NUM_RULES && act < ACCEPT_ACTION;
             act = tAction(act, current_kind))
        {
            curtok++;
            current_kind = (curtok > lasttok
                                   ? ScalaModelKWLexersym.Char_EOF
                                   : getKind(inputChars[curtok]));
        }

        if (act > ERROR_ACTION)
        {
            curtok++;
            act -= ERROR_ACTION;
        }

        return keywordKind[act == ERROR_ACTION  || curtok <= lasttok ? 0 : act];
    }

    public void setInputChars(char[] inputChars) { this.inputChars = inputChars; }


    //#line 18 "KWLexerLowerCaseMapS.gi

    final static int tokenKind[] = new int[128];
    static
    {
        tokenKind['$'] = ScalaModelKWLexersym.Char_DollarSign;
        tokenKind['%'] = ScalaModelKWLexersym.Char_Percent;
        tokenKind['-'] = ScalaModelKWLexersym.Char_Minus;
        tokenKind[':'] = ScalaModelKWLexersym.Char_Colon;
        tokenKind['='] = ScalaModelKWLexersym.Char_Equal;
        tokenKind['<'] = ScalaModelKWLexersym.Char_LessThan;
        tokenKind['>'] = ScalaModelKWLexersym.Char_GreaterThan;
        tokenKind['#'] = ScalaModelKWLexersym.Char_Sharp;
        tokenKind['@'] = ScalaModelKWLexersym.Char_AtSign;
        tokenKind['_'] = ScalaModelKWLexersym.Char__;
        
        tokenKind['a'] = ScalaModelKWLexersym.Char_a;
        tokenKind['b'] = ScalaModelKWLexersym.Char_b;
        tokenKind['c'] = ScalaModelKWLexersym.Char_c;
        tokenKind['d'] = ScalaModelKWLexersym.Char_d;
        tokenKind['e'] = ScalaModelKWLexersym.Char_e;
        tokenKind['f'] = ScalaModelKWLexersym.Char_f;
        tokenKind['g'] = ScalaModelKWLexersym.Char_g;
        tokenKind['h'] = ScalaModelKWLexersym.Char_h;
        tokenKind['i'] = ScalaModelKWLexersym.Char_i;
        tokenKind['j'] = ScalaModelKWLexersym.Char_j;
        tokenKind['k'] = ScalaModelKWLexersym.Char_k;
        tokenKind['l'] = ScalaModelKWLexersym.Char_l;
        tokenKind['m'] = ScalaModelKWLexersym.Char_m;
        tokenKind['n'] = ScalaModelKWLexersym.Char_n;
        tokenKind['o'] = ScalaModelKWLexersym.Char_o;
        tokenKind['p'] = ScalaModelKWLexersym.Char_p;
        tokenKind['q'] = ScalaModelKWLexersym.Char_q;
        tokenKind['r'] = ScalaModelKWLexersym.Char_r;
        tokenKind['s'] = ScalaModelKWLexersym.Char_s;
        tokenKind['t'] = ScalaModelKWLexersym.Char_t;
        tokenKind['u'] = ScalaModelKWLexersym.Char_u;
        tokenKind['v'] = ScalaModelKWLexersym.Char_v;
        tokenKind['w'] = ScalaModelKWLexersym.Char_w;
        tokenKind['x'] = ScalaModelKWLexersym.Char_x;
        tokenKind['y'] = ScalaModelKWLexersym.Char_y;
        tokenKind['z'] = ScalaModelKWLexersym.Char_z;
    };

    final int getKind(int c)
    {
        return ((c & 0xFFFFFF80) == 0 /* 0 <= c < 128? */ ? tokenKind[c] : 0);
    }

    //#line 101 "KeywordTemplateF.gi


    public ScalaModelKWLexer(char[] inputChars, int identifierKind)
    {
        this.inputChars = inputChars;
        keywordKind[0] = identifierKind;

        //
        // Rule 1:  KeyWord ::= i f
        //
        keywordKind[1] = (ScalaModelLexerexp.IF);

        //
        // Rule 2:  KeyWord ::= f o r
        //
        keywordKind[2] = (ScalaModelLexerexp.FOR);

        //
        // Rule 3:  KeyWord ::= e l s e
        //
        keywordKind[3] = (ScalaModelLexerexp.ELSE);

        //
        // Rule 4:  KeyWord ::= t h i s
        //
        keywordKind[4] = (ScalaModelLexerexp.THIS);

        //
        // Rule 5:  KeyWord ::= n u l l
        //
        keywordKind[5] = (ScalaModelLexerexp.NULL);

        //
        // Rule 6:  KeyWord ::= n e w
        //
        keywordKind[6] = (ScalaModelLexerexp.NEW);

        //
        // Rule 7:  KeyWord ::= w i t h
        //
        keywordKind[7] = (ScalaModelLexerexp.WITH);

        //
        // Rule 8:  KeyWord ::= s u p e r
        //
        keywordKind[8] = (ScalaModelLexerexp.SUPER);

        //
        // Rule 9:  KeyWord ::= c a s e
        //
        keywordKind[9] = (ScalaModelLexerexp.CASE);

        //
        // Rule 10:  KeyWord ::= v a l
        //
        keywordKind[10] = (ScalaModelLexerexp.VAL);

        //
        // Rule 11:  KeyWord ::= a b s t r a c t
        //
        keywordKind[11] = (ScalaModelLexerexp.ABSTRACT);

        //
        // Rule 12:  KeyWord ::= f i n a l
        //
        keywordKind[12] = (ScalaModelLexerexp.FINAL);

        //
        // Rule 13:  KeyWord ::= p r i v a t e
        //
        keywordKind[13] = (ScalaModelLexerexp.PRIVATE);

        //
        // Rule 14:  KeyWord ::= p r o t e c t e d
        //
        keywordKind[14] = (ScalaModelLexerexp.PROTECTED);

        //
        // Rule 15:  KeyWord ::= o v e r r i d e
        //
        keywordKind[15] = (ScalaModelLexerexp.OVERRIDE);

        //
        // Rule 16:  KeyWord ::= i m p l i c i t
        //
        keywordKind[16] = (ScalaModelLexerexp.IMPLICIT);

        //
        // Rule 17:  KeyWord ::= v a r
        //
        keywordKind[17] = (ScalaModelLexerexp.VAR);

        //
        // Rule 18:  KeyWord ::= d e f
        //
        keywordKind[18] = (ScalaModelLexerexp.DEF);

        //
        // Rule 19:  KeyWord ::= t y p e
        //
        keywordKind[19] = (ScalaModelLexerexp.TYPE);

        //
        // Rule 20:  KeyWord ::= e x t e n d s
        //
        keywordKind[20] = (ScalaModelLexerexp.EXTENDS);

        //
        // Rule 21:  KeyWord ::= t r u e
        //
        keywordKind[21] = (ScalaModelLexerexp.TRUE);

        //
        // Rule 22:  KeyWord ::= f a l s e
        //
        keywordKind[22] = (ScalaModelLexerexp.FALSE);

        //
        // Rule 23:  KeyWord ::= o b j e c t
        //
        keywordKind[23] = (ScalaModelLexerexp.OBJECT);

        //
        // Rule 24:  KeyWord ::= c l a s s
        //
        keywordKind[24] = (ScalaModelLexerexp.CLASS);

        //
        // Rule 25:  KeyWord ::= i m p o r t
        //
        keywordKind[25] = (ScalaModelLexerexp.IMPORT);

        //
        // Rule 26:  KeyWord ::= p a c k a g e
        //
        keywordKind[26] = (ScalaModelLexerexp.PACKAGE);

        //
        // Rule 27:  KeyWord ::= y i e l d
        //
        keywordKind[27] = (ScalaModelLexerexp.YIELD);

        //
        // Rule 28:  KeyWord ::= d o
        //
        keywordKind[28] = (ScalaModelLexerexp.DO);

        //
        // Rule 29:  KeyWord ::= t r a i t
        //
        keywordKind[29] = (ScalaModelLexerexp.TRAIT);

        //
        // Rule 30:  KeyWord ::= s e a l e d
        //
        keywordKind[30] = (ScalaModelLexerexp.SEALED);

        //
        // Rule 31:  KeyWord ::= t h r o w
        //
        keywordKind[31] = (ScalaModelLexerexp.THROW);

        //
        // Rule 32:  KeyWord ::= t r y
        //
        keywordKind[32] = (ScalaModelLexerexp.TRY);

        //
        // Rule 33:  KeyWord ::= c a t c h
        //
        keywordKind[33] = (ScalaModelLexerexp.CATCH);

        //
        // Rule 34:  KeyWord ::= f i n a l l y
        //
        keywordKind[34] = (ScalaModelLexerexp.FINALLY);

        //
        // Rule 35:  KeyWord ::= w h i l e
        //
        keywordKind[35] = (ScalaModelLexerexp.WHILE);

        //
        // Rule 36:  KeyWord ::= r e t u r n
        //
        keywordKind[36] = (ScalaModelLexerexp.RETURN);

        //
        // Rule 37:  KeyWord ::= m a t c h
        //
        keywordKind[37] = (ScalaModelLexerexp.MATCH);

        //
        // Rule 38:  KeyWord ::= f o r s o m e
        //
        keywordKind[38] = (ScalaModelLexerexp.FORSOME);

        //
        // Rule 39:  KeyWord ::= l a z y
        //
        keywordKind[39] = (ScalaModelLexerexp.LAZY);

        //
        // Rule 40:  KeyWord ::= _
        //
        keywordKind[40] = (ScalaModelLexerexp.RW_UNDERSCORE);

        //
        // Rule 41:  KeyWord ::= :
        //
        keywordKind[41] = (ScalaModelLexerexp.RW_COLON);

        //
        // Rule 42:  KeyWord ::= =
        //
        keywordKind[42] = (ScalaModelLexerexp.RW_ASSIGNMENT);

        //
        // Rule 43:  KeyWord ::= = >
        //
        keywordKind[43] = (ScalaModelLexerexp.RW_ROCKET);

        //
        // Rule 44:  KeyWord ::= < -
        //
        keywordKind[44] = (ScalaModelLexerexp.RW_IN);

        //
        // Rule 45:  KeyWord ::= < :
        //
        keywordKind[45] = (ScalaModelLexerexp.RW_UPPERBOUND);

        //
        // Rule 46:  KeyWord ::= < %
        //
        keywordKind[46] = (ScalaModelLexerexp.RW_VIEWBOUND);

        //
        // Rule 47:  KeyWord ::= > :
        //
        keywordKind[47] = (ScalaModelLexerexp.RW_LOWERBOUND);

        //
        // Rule 48:  KeyWord ::= #
        //
        keywordKind[48] = (ScalaModelLexerexp.RW_POUND);

        //
        // Rule 49:  KeyWord ::= @
        //
        keywordKind[49] = (ScalaModelLexerexp.RW_AT);

    //#line 111 "KeywordTemplateF.gi

        for (int i = 0; i < keywordKind.length; i++)
        {
            if (keywordKind[i] == 0)
                keywordKind[i] = identifierKind;
        }
    }
}

