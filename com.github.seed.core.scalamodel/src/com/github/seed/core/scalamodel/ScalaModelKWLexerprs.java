package com.github.seed.core.scalamodel;

public class ScalaModelKWLexerprs implements lpg.runtime.ParseTable, ScalaModelKWLexersym {
    public final static int ERROR_SYMBOL = 0;
    public final int getErrorSymbol() { return ERROR_SYMBOL; }

    public final static int SCOPE_UBOUND = 0;
    public final int getScopeUbound() { return SCOPE_UBOUND; }

    public final static int SCOPE_SIZE = 0;
    public final int getScopeSize() { return SCOPE_SIZE; }

    public final static int MAX_NAME_LENGTH = 0;
    public final int getMaxNameLength() { return MAX_NAME_LENGTH; }

    public final static int NUM_STATES = 128;
    public final int getNumStates() { return NUM_STATES; }

    public final static int NT_OFFSET = 37;
    public final int getNtOffset() { return NT_OFFSET; }

    public final static int LA_STATE_OFFSET = 230;
    public final int getLaStateOffset() { return LA_STATE_OFFSET; }

    public final static int MAX_LA = 1;
    public final int getMaxLa() { return MAX_LA; }

    public final static int NUM_RULES = 49;
    public final int getNumRules() { return NUM_RULES; }

    public final static int NUM_NONTERMINALS = 2;
    public final int getNumNonterminals() { return NUM_NONTERMINALS; }

    public final static int NUM_SYMBOLS = 39;
    public final int getNumSymbols() { return NUM_SYMBOLS; }

    public final static int SEGMENT_SIZE = 8192;
    public final int getSegmentSize() { return SEGMENT_SIZE; }

    public final static int START_STATE = 50;
    public final int getStartState() { return START_STATE; }

    public final static int IDENTIFIER_SYMBOL = 0;
    public final int getIdentifier_SYMBOL() { return IDENTIFIER_SYMBOL; }

    public final static int EOFT_SYMBOL = 35;
    public final int getEoftSymbol() { return EOFT_SYMBOL; }

    public final static int EOLT_SYMBOL = 38;
    public final int getEoltSymbol() { return EOLT_SYMBOL; }

    public final static int ACCEPT_ACTION = 180;
    public final int getAcceptAction() { return ACCEPT_ACTION; }

    public final static int ERROR_ACTION = 181;
    public final int getErrorAction() { return ERROR_ACTION; }

    public final static boolean BACKTRACK = false;
    public final boolean getBacktrack() { return BACKTRACK; }

    public final int getStartSymbol() { return lhs(0); }
    public final boolean isValidForParser() { return ScalaModelKWLexersym.isValidForParser; }


    public interface IsNullable {
        public final static byte isNullable[] = {0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0
        };
    };
    public final static byte isNullable[] = IsNullable.isNullable;
    public final boolean isNullable(int index) { return isNullable[index] != 0; }

    public interface ProsthesesIndex {
        public final static byte prosthesesIndex[] = {0,
            2,1
        };
    };
    public final static byte prosthesesIndex[] = ProsthesesIndex.prosthesesIndex;
    public final int prosthesesIndex(int index) { return prosthesesIndex[index]; }

    public interface IsKeyword {
        public final static byte isKeyword[] = {0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0
        };
    };
    public final static byte isKeyword[] = IsKeyword.isKeyword;
    public final boolean isKeyword(int index) { return isKeyword[index] != 0; }

    public interface BaseCheck {
        public final static byte baseCheck[] = {0,
            2,3,4,4,4,3,4,5,4,3,
            8,5,7,9,8,8,3,3,4,7,
            4,5,6,5,6,7,5,2,5,6,
            5,3,5,7,5,6,5,7,4,1,
            1,1,2,2,2,2,2,1,1
        };
    };
    public final static byte baseCheck[] = BaseCheck.baseCheck;
    public final int baseCheck(int index) { return baseCheck[index]; }
    public final static byte rhs[] = baseCheck;
    public final int rhs(int index) { return rhs[index]; };

    public interface BaseAction {
        public final static char baseAction[] = {
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,52,53,79,16,48,73,96,100,66,
            24,45,47,86,103,51,56,59,60,31,
            58,35,63,94,105,109,112,98,104,116,
            110,68,114,78,119,85,120,124,125,127,
            126,130,34,133,84,137,136,140,132,148,
            141,142,149,150,152,158,161,151,160,163,
            167,164,168,172,170,177,175,12,180,181,
            185,188,190,191,192,194,196,197,201,93,
            202,204,205,206,207,216,210,217,218,221,
            222,224,226,229,232,227,235,236,238,240,
            239,245,241,250,253,243,255,256,257,261,
            262,264,265,267,266,270,275,277,281,278,
            284,285,287,289,292,298,294,300,301,181,
            181
        };
    };
    public final static char baseAction[] = BaseAction.baseAction;
    public final int baseAction(int index) { return baseAction[index]; }
    public final static char lhs[] = baseAction;
    public final int lhs(int index) { return lhs[index]; };

    public interface TermCheck {
        public final static byte termCheck[] = {0,
            0,1,2,3,4,5,6,7,8,9,
            10,0,12,13,14,0,16,17,18,19,
            20,21,11,0,1,25,26,27,28,29,
            0,16,9,0,0,5,3,3,23,24,
            6,11,12,9,0,12,0,0,15,3,
            0,5,0,3,4,0,1,0,0,0,
            1,4,0,19,6,0,22,0,21,11,
            15,6,0,6,15,3,9,0,0,17,
            18,4,5,0,0,0,2,35,5,6,
            33,7,0,0,16,0,4,0,3,0,
            1,9,0,0,0,3,2,22,0,0,
            2,0,1,0,17,0,1,8,0,0,
            7,3,3,0,0,0,0,34,2,0,
            6,0,0,4,31,0,0,14,2,0,
            0,0,7,4,13,20,14,0,0,0,
            0,0,5,12,14,4,8,0,1,0,
            0,2,0,0,15,5,0,0,2,0,
            7,0,1,4,0,8,0,1,4,0,
            0,19,32,4,0,1,6,0,1,0,
            0,0,1,0,1,0,0,7,9,3,
            0,0,7,0,0,0,0,7,5,0,
            1,5,11,8,10,0,0,0,3,3,
            0,0,5,0,1,0,0,7,0,1,
            5,0,11,2,0,0,1,0,0,0,
            0,4,0,5,0,0,20,13,9,0,
            6,2,0,13,0,0,0,2,6,3,
            0,0,8,0,0,0,0,4,2,0,
            10,10,30,8,0,1,0,0,2,10,
            0,1,18,0,0,8,0,1,0,0,
            7,0,1,0,6,2,12,0,1,0,
            0,2,0,0,0,0,0,0,0,0,
            10,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0
        };
    };
    public final static byte termCheck[] = TermCheck.termCheck;
    public final int termCheck(int index) { return termCheck[index]; }

    public interface TermAction {
        public final static char termAction[] = {0,
            181,70,69,63,56,58,72,66,65,61,
            60,181,59,68,62,181,222,71,57,64,
            67,53,188,181,77,55,54,229,230,221,
            181,226,209,181,181,92,119,97,227,225,
            98,94,93,99,181,213,181,42,120,80,
            181,81,181,85,84,181,86,181,181,181,
            90,96,181,79,89,181,78,181,224,88,
            87,76,181,109,91,73,108,181,181,182,
            100,191,198,181,181,181,112,180,122,123,
            95,113,181,181,228,181,151,181,74,181,
            75,150,181,181,181,83,102,82,181,181,
            103,181,104,181,199,181,106,107,181,181,
            110,111,114,181,181,181,181,101,117,181,
            116,181,181,118,105,181,181,115,124,181,
            181,181,125,126,127,187,121,181,181,181,
            181,181,128,220,129,132,130,181,133,181,
            181,136,181,181,131,134,181,181,138,181,
            139,181,190,141,181,140,181,142,143,181,
            181,137,135,186,181,202,144,181,200,181,
            181,181,146,181,184,181,181,185,145,148,
            2,181,147,181,181,181,181,149,152,181,
            156,154,218,153,208,181,181,181,155,157,
            181,181,158,181,159,181,181,205,181,216,
            189,181,214,210,181,181,203,181,181,181,
            181,161,181,163,181,181,212,160,162,181,
            164,204,181,217,181,181,181,168,165,169,
            181,181,167,12,181,181,181,171,206,181,
            211,170,166,173,181,207,181,181,175,174,
            181,194,172,181,181,176,181,219,181,181,
            201,181,196,181,177,192,215,181,178,181,
            181,197,181,181,181,181,181,181,181,181,
            195
        };
    };
    public final static char termAction[] = TermAction.termAction;
    public final int termAction(int index) { return termAction[index]; }
    public final int asb(int index) { return 0; }
    public final int asr(int index) { return 0; }
    public final int nasb(int index) { return 0; }
    public final int nasr(int index) { return 0; }
    public final int terminalIndex(int index) { return 0; }
    public final int nonterminalIndex(int index) { return 0; }
    public final int scopePrefix(int index) { return 0;}
    public final int scopeSuffix(int index) { return 0;}
    public final int scopeLhs(int index) { return 0;}
    public final int scopeLa(int index) { return 0;}
    public final int scopeStateSet(int index) { return 0;}
    public final int scopeRhs(int index) { return 0;}
    public final int scopeState(int index) { return 0;}
    public final int inSymb(int index) { return 0;}
    public final String name(int index) { return null; }
    public final int originalState(int state) { return 0; }
    public final int asi(int state) { return 0; }
    public final int nasi(int state) { return 0; }
    public final int inSymbol(int state) { return 0; }

    /**
     * assert(! goto_default);
     */
    public final int ntAction(int state, int sym) {
        return baseAction[state + sym];
    }

    /**
     * assert(! shift_default);
     */
    public final int tAction(int state, int sym) {
        int i = baseAction[state],
            k = i + sym;
        return termAction[termCheck[k] == sym ? k : i];
    }
    public final int lookAhead(int la_state, int sym) {
        int k = la_state + sym;
        return termAction[termCheck[k] == sym ? k : la_state];
    }
}
