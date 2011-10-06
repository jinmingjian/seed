package com.github.seed.core.scalamodel;

public class ScalaModelLexerprs implements lpg.runtime.ParseTable, ScalaModelLexersym {
    public final static int ERROR_SYMBOL = 0;
    public final int getErrorSymbol() { return ERROR_SYMBOL; }

    public final static int SCOPE_UBOUND = 0;
    public final int getScopeUbound() { return SCOPE_UBOUND; }

    public final static int SCOPE_SIZE = 0;
    public final int getScopeSize() { return SCOPE_SIZE; }

    public final static int MAX_NAME_LENGTH = 0;
    public final int getMaxNameLength() { return MAX_NAME_LENGTH; }

    public final static int NUM_STATES = 79;
    public final int getNumStates() { return NUM_STATES; }

    public final static int NT_OFFSET = 102;
    public final int getNtOffset() { return NT_OFFSET; }

    public final static int LA_STATE_OFFSET = 1064;
    public final int getLaStateOffset() { return LA_STATE_OFFSET; }

    public final static int MAX_LA = 2;
    public final int getMaxLa() { return MAX_LA; }

    public final static int NUM_RULES = 398;
    public final int getNumRules() { return NUM_RULES; }

    public final static int NUM_NONTERMINALS = 49;
    public final int getNumNonterminals() { return NUM_NONTERMINALS; }

    public final static int NUM_SYMBOLS = 151;
    public final int getNumSymbols() { return NUM_SYMBOLS; }

    public final static int SEGMENT_SIZE = 8192;
    public final int getSegmentSize() { return SEGMENT_SIZE; }

    public final static int START_STATE = 399;
    public final int getStartState() { return START_STATE; }

    public final static int IDENTIFIER_SYMBOL = 0;
    public final int getIdentifier_SYMBOL() { return IDENTIFIER_SYMBOL; }

    public final static int EOFT_SYMBOL = 102;
    public final int getEoftSymbol() { return EOFT_SYMBOL; }

    public final static int EOLT_SYMBOL = 103;
    public final int getEoltSymbol() { return EOLT_SYMBOL; }

    public final static int ACCEPT_ACTION = 665;
    public final int getAcceptAction() { return ACCEPT_ACTION; }

    public final static int ERROR_ACTION = 666;
    public final int getErrorAction() { return ERROR_ACTION; }

    public final static boolean BACKTRACK = false;
    public final boolean getBacktrack() { return BACKTRACK; }

    public final int getStartSymbol() { return lhs(0); }
    public final boolean isValidForParser() { return ScalaModelLexersym.isValidForParser; }


    public interface IsNullable {
        public final static byte isNullable[] = {0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,1,0,0,0,0,0,0,0,
            1,0,1,0,0,1,0,0,0,0,
            0
        };
    };
    public final static byte isNullable[] = IsNullable.isNullable;
    public final boolean isNullable(int index) { return isNullable[index] != 0; }

    public interface ProsthesesIndex {
        public final static byte prosthesesIndex[] = {0,
            28,29,36,32,33,34,14,35,43,19,
            21,31,49,42,15,20,22,30,38,41,
            45,46,2,3,4,5,6,7,8,9,
            10,11,12,13,16,17,18,23,24,25,
            26,27,37,39,40,44,47,48,1
        };
    };
    public final static byte prosthesesIndex[] = ProsthesesIndex.prosthesesIndex;
    public final int prosthesesIndex(int index) { return prosthesesIndex[index]; }

    public interface IsKeyword {
        public final static byte isKeyword[] = {0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0
        };
    };
    public final static byte isKeyword[] = IsKeyword.isKeyword;
    public final boolean isKeyword(int index) { return isKeyword[index] != 0; }

    public interface BaseCheck {
        public final static byte baseCheck[] = {0,
            1,1,1,3,1,1,1,5,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,2,3,4,1,2,2,3,2,3,
            2,2,3,3,2,3,2,2,0,1,
            2,2,2,0,2,0,2,3,7,1,
            2,1,2,2,2,3,2,3,3,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,2,3,1,1,1,1,
            1,1,1,1,1,1,1,2,1,3,
            0,2,1,1,3,1,2,2,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,2,3,3,3,2,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,6,2,
            1,1,1,1,1,1,1,1,6,2,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,6,
            2,1,1,1,1,1,1,1,6,2,
            2,2,2,2,2,2,2,2
        };
    };
    public final static byte baseCheck[] = BaseCheck.baseCheck;
    public final int baseCheck(int index) { return baseCheck[index]; }
    public final static byte rhs[] = baseCheck;
    public final int rhs(int index) { return rhs[index]; };

    public interface BaseAction {
        public final static char baseAction[] = {
            23,23,23,23,23,23,23,23,23,23,
            23,23,23,23,23,23,23,23,23,23,
            23,28,28,28,28,30,30,30,30,30,
            30,30,29,29,29,29,31,31,31,31,
            32,32,33,33,39,39,41,41,25,25,
            7,7,36,36,37,37,37,16,16,16,
            12,12,12,12,12,4,4,4,4,4,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,6,6,6,6,
            6,6,6,6,6,6,6,6,6,6,
            6,6,6,6,6,6,6,6,6,6,
            6,6,1,1,1,1,1,1,1,1,
            1,1,8,8,8,8,8,8,8,8,
            3,3,3,3,3,3,3,3,3,3,
            3,3,2,2,43,43,43,10,10,11,
            11,15,15,18,18,35,35,34,34,24,
            24,44,44,19,19,19,20,20,20,9,
            9,9,9,9,9,9,9,9,9,9,
            9,9,14,14,14,14,14,14,14,14,
            26,46,46,46,46,46,46,46,46,46,
            46,46,46,46,46,46,46,46,46,46,
            46,46,46,46,46,46,46,46,46,46,
            21,21,21,21,21,21,21,21,21,21,
            21,21,21,21,21,21,21,21,21,21,
            21,21,21,21,21,21,21,21,22,22,
            22,22,22,22,22,22,22,22,22,22,
            22,22,22,22,22,22,22,22,22,22,
            22,22,22,22,22,22,47,47,47,47,
            47,47,47,47,47,47,47,47,47,47,
            47,47,47,47,47,47,47,47,47,47,
            47,47,47,47,48,48,48,48,48,48,
            48,48,48,48,48,48,48,48,48,48,
            48,48,48,48,48,48,48,48,48,48,
            48,48,45,45,45,45,45,45,45,45,
            45,42,42,42,42,42,42,42,42,42,
            42,17,17,17,17,38,38,38,38,38,
            38,38,38,40,40,40,40,40,40,40,
            40,40,27,27,27,27,27,27,27,27,
            27,13,13,13,13,13,13,13,13,203,
            50,989,816,176,65,66,534,935,192,452,
            1281,167,404,538,922,152,515,153,169,536,
            28,33,426,1,2,3,301,5,6,7,
            837,50,527,495,704,383,486,498,650,65,
            66,463,470,192,390,1,362,388,538,361,
            65,66,1270,200,536,942,474,364,1171,50,
            636,482,38,506,374,523,363,373,65,66,
            922,152,52,153,605,343,379,508,342,65,
            66,384,852,1198,50,375,1131,348,406,352,
            566,1077,351,65,66,1059,26,32,1183,51,
            192,358,410,45,458,539,553,168,102,362,
            353,908,361,65,66,922,152,569,153,172,
            364,910,344,1222,51,36,913,304,366,363,
            47,365,65,66,955,51,803,178,1099,1126,
            177,65,66,1013,31,35,943,653,653,22,
            618,381,458,888,152,53,153,922,152,574,
            153,922,152,578,153,43,1234,51,24,922,
            152,582,153,369,922,152,590,153,922,152,
            594,153,922,152,389,153,922,152,598,153,
            922,152,602,153,922,152,606,153,922,152,
            610,153,922,152,380,153,922,152,349,153,
            922,152,614,153,922,152,359,153,1290,1210,
            50,705,804,1210,50,1043,631,947,30,34,
            634,1246,51,350,1258,51,1280,1067,968,975,
            977,980,999,1004,156,360,1023,1028,1037,1039,
            1053,1083,445,1060,1084,1093,666,666,666,666,
            666,666,666,488,666,666
        };
    };
    public final static char baseAction[] = BaseAction.baseAction;
    public final int baseAction(int index) { return baseAction[index]; }
    public final static char lhs[] = baseAction;
    public final int lhs(int index) { return lhs[index]; };

    public interface TermCheck {
        public final static byte termCheck[] = {0,
            0,1,2,3,4,5,6,7,8,9,
            10,11,12,13,14,15,16,17,18,19,
            20,21,22,23,24,25,26,27,28,29,
            30,31,32,33,34,35,36,37,38,39,
            40,41,42,43,44,45,46,47,48,49,
            50,51,52,53,54,55,56,57,58,59,
            60,61,62,63,64,65,66,67,68,69,
            70,71,72,73,74,75,76,77,78,79,
            80,81,82,83,84,85,86,87,88,89,
            90,91,92,93,94,95,96,97,98,99,
            100,0,1,2,3,4,5,6,7,8,
            9,10,11,12,13,14,15,16,17,18,
            19,20,21,22,23,24,25,26,27,28,
            29,30,31,32,33,34,35,36,37,38,
            39,40,41,42,43,44,45,46,47,48,
            49,50,51,52,53,54,55,56,57,58,
            59,60,61,62,63,64,65,66,67,68,
            69,70,71,72,73,74,75,76,77,78,
            79,80,81,82,83,84,85,86,87,88,
            89,90,91,92,93,94,95,96,97,98,
            99,100,0,1,2,3,4,5,6,7,
            8,9,10,11,12,13,14,15,16,17,
            18,19,20,21,22,23,24,25,26,27,
            28,29,30,31,32,33,34,35,36,37,
            38,39,40,41,42,43,44,45,46,47,
            48,49,50,51,52,53,54,55,56,57,
            58,59,60,61,62,63,64,65,66,67,
            68,69,70,71,72,73,74,75,76,77,
            78,79,80,81,82,83,84,85,86,87,
            88,89,90,91,92,93,94,95,96,97,
            0,99,100,0,1,2,3,4,5,6,
            7,8,9,10,11,12,13,14,15,16,
            17,18,19,20,21,22,23,24,25,26,
            27,28,29,30,31,32,33,34,35,36,
            37,38,39,40,41,42,43,44,45,46,
            47,48,49,50,51,52,53,54,55,56,
            57,58,59,60,61,62,63,64,65,66,
            67,68,69,70,71,72,73,74,75,76,
            77,78,79,80,81,82,83,84,85,86,
            87,88,89,90,91,92,93,94,95,96,
            97,98,102,0,101,0,1,2,3,4,
            5,6,7,8,9,10,11,12,13,14,
            15,16,17,18,19,20,21,22,23,24,
            25,26,27,28,29,30,31,32,33,34,
            35,36,37,38,39,40,41,42,43,44,
            45,46,47,48,49,50,51,52,53,54,
            55,56,57,58,59,60,61,62,63,64,
            65,66,67,68,69,70,71,72,73,74,
            75,76,77,78,79,80,81,82,83,84,
            85,86,87,88,89,90,91,92,93,94,
            95,96,97,98,99,0,1,2,3,4,
            5,6,7,8,9,10,11,12,13,14,
            15,16,17,18,19,20,21,22,23,24,
            25,26,27,28,29,30,31,32,33,34,
            35,36,37,38,39,40,41,42,43,44,
            45,46,47,48,49,50,51,52,53,54,
            55,56,57,58,59,60,61,62,63,64,
            65,66,67,68,69,70,71,72,73,74,
            75,76,77,78,79,80,81,82,83,84,
            85,86,87,88,89,90,91,92,93,94,
            95,96,97,98,0,1,2,3,4,5,
            6,7,8,9,10,11,12,13,14,15,
            16,17,18,19,20,21,22,23,24,25,
            26,27,28,29,30,31,32,33,34,35,
            36,37,38,39,40,41,42,43,44,45,
            46,47,48,49,50,51,52,53,54,55,
            56,57,58,59,60,61,62,63,64,65,
            66,67,68,69,70,71,72,73,74,75,
            76,77,78,79,80,81,82,83,84,85,
            86,87,88,89,90,91,92,93,94,95,
            96,97,98,0,0,2,3,4,5,6,
            7,8,9,10,11,12,13,14,15,16,
            17,18,19,20,21,22,23,24,25,26,
            27,28,29,30,31,32,33,34,35,36,
            37,38,39,40,41,42,43,44,45,46,
            47,48,49,50,51,52,53,54,55,56,
            57,58,59,60,61,62,63,64,65,66,
            67,68,69,70,71,72,73,74,75,76,
            77,78,79,80,81,82,83,84,85,86,
            87,88,89,90,91,92,93,94,95,96,
            97,98,0,0,2,3,4,5,6,7,
            8,9,10,11,12,0,14,15,16,17,
            0,19,20,21,22,23,24,0,13,27,
            28,29,30,31,32,33,0,0,2,3,
            4,5,6,7,8,9,10,11,0,47,
            48,0,1,51,52,53,54,55,56,57,
            58,59,60,61,62,63,64,65,66,67,
            68,69,70,71,72,73,74,75,76,77,
            78,79,80,81,82,83,84,0,86,2,
            3,4,5,6,7,8,9,10,11,12,
            0,14,15,16,17,0,19,0,1,0,
            1,24,0,1,27,28,29,30,31,32,
            33,0,0,2,3,4,5,6,7,8,
            9,10,11,12,0,14,15,16,17,0,
            19,0,0,1,0,24,0,1,27,28,
            0,30,31,32,0,0,2,3,4,5,
            6,7,8,9,10,11,12,0,1,15,
            16,17,0,19,0,1,0,1,24,0,
            1,47,48,29,0,44,45,33,0,1,
            2,3,4,5,6,7,8,9,0,1,
            12,13,14,0,1,0,18,0,20,21,
            22,23,0,1,2,3,4,5,6,7,
            8,9,0,1,12,13,14,0,1,0,
            18,0,20,21,22,23,0,1,0,1,
            0,87,0,1,2,3,4,5,6,7,
            8,9,0,1,12,13,14,0,0,0,
            18,0,20,21,22,23,0,1,2,3,
            4,5,6,7,8,9,0,18,12,13,
            14,0,0,0,18,0,20,21,22,23,
            0,0,0,0,18,13,13,0,0,0,
            0,25,26,44,45,13,13,49,50,0,
            34,35,36,37,38,39,40,41,42,43,
            44,45,46,25,26,0,0,0,0,0,
            0,0,34,35,36,37,38,39,40,41,
            42,43,12,85,46,15,16,17,0,19,
            25,26,0,0,24,0,0,99,100,34,
            35,36,37,38,39,40,41,42,43,0,
            0,46,2,3,4,5,6,7,8,9,
            10,11,0,0,2,3,4,5,6,7,
            8,9,10,11,0,25,26,0,0,2,
            3,4,5,6,7,8,9,10,11,0,
            0,2,3,4,5,6,7,8,9,10,
            11,0,0,2,3,4,5,6,7,8,
            9,10,11,0,0,2,3,4,5,6,
            7,8,9,10,11,0,0,2,3,4,
            5,6,7,8,9,10,11,0,0,2,
            3,4,5,6,7,8,9,10,11,0,
            0,2,3,4,5,6,7,8,9,0,
            0,2,3,4,5,6,7,8,9,0,
            0,0,12,0,0,15,16,17,0,0,
            0,12,0,0,15,16,17,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0
        };
    };
    public final static byte termCheck[] = TermCheck.termCheck;
    public final int termCheck(int index) { return termCheck[index]; }

    public interface TermAction {
        public final static char termAction[] = {0,
            666,910,788,789,790,791,792,793,794,795,
            796,797,741,900,737,739,765,767,911,740,
            749,753,755,756,766,896,897,736,738,747,
            762,763,764,773,905,912,901,902,904,906,
            907,917,920,921,703,706,922,759,785,729,
            730,742,743,744,745,746,748,750,751,752,
            754,757,758,760,761,733,768,769,770,771,
            772,774,775,776,777,778,779,780,781,782,
            783,784,786,787,735,726,734,919,903,908,
            909,913,914,915,916,918,898,899,923,727,
            728,666,910,788,789,790,791,792,793,794,
            795,796,797,741,900,737,739,765,767,911,
            740,749,753,755,756,766,896,897,736,738,
            747,762,763,764,773,905,912,901,902,904,
            906,907,917,920,921,674,707,922,759,785,
            729,730,742,743,744,745,746,748,750,751,
            752,754,757,758,760,761,733,768,769,770,
            771,772,774,775,776,777,778,779,780,781,
            782,783,784,786,787,735,726,734,919,903,
            908,909,913,914,915,916,918,898,899,923,
            727,728,666,434,407,789,790,791,792,793,
            794,795,796,797,741,402,737,739,765,767,
            860,740,749,753,755,756,766,845,846,736,
            738,747,762,763,764,773,851,854,847,848,
            849,852,853,855,856,857,455,861,850,759,
            785,729,730,742,743,744,745,746,748,750,
            751,752,754,757,758,760,761,733,768,769,
            770,771,772,774,775,776,777,778,779,780,
            781,782,783,784,786,787,735,726,734,430,
            412,679,681,685,686,683,684,680,677,678,
            666,727,728,9,882,788,789,790,791,792,
            793,794,795,796,797,741,872,737,739,765,
            767,883,740,749,753,755,756,766,867,868,
            736,738,747,762,763,764,773,877,884,873,
            874,876,878,879,889,892,893,869,1034,894,
            759,785,1036,1037,742,743,744,745,746,748,
            750,751,752,754,757,758,760,761,733,768,
            769,770,771,772,774,775,776,777,778,779,
            780,781,782,783,784,786,787,735,1033,734,
            891,875,880,881,885,886,887,888,890,870,
            871,895,665,171,1038,666,939,788,789,790,
            791,792,793,794,795,796,797,741,654,737,
            739,765,767,637,740,749,753,755,756,766,
            924,925,736,738,747,762,763,764,773,934,
            940,930,931,933,935,936,945,948,949,926,
            929,950,759,785,1021,1022,742,743,744,745,
            746,748,750,751,752,754,757,758,760,761,
            733,768,769,770,771,772,774,775,776,777,
            778,779,780,781,782,783,784,786,787,735,
            1020,734,947,932,937,938,941,942,943,944,
            946,927,928,951,1023,666,939,788,789,790,
            791,792,793,794,795,796,797,741,714,737,
            739,765,767,543,740,749,753,755,756,766,
            924,925,736,738,747,762,763,764,773,934,
            940,930,931,933,935,936,945,948,949,926,
            929,950,759,785,1043,1044,742,743,744,745,
            746,748,750,751,752,754,757,758,760,761,
            733,768,769,770,771,772,774,775,776,777,
            778,779,780,781,782,783,784,786,787,735,
            1042,734,947,932,937,938,941,942,943,944,
            946,927,928,951,666,995,788,789,790,791,
            792,793,794,795,796,797,741,988,737,739,
            765,767,625,740,749,753,755,756,766,980,
            981,736,738,747,762,763,764,773,990,996,
            986,987,989,991,992,1001,1004,1005,982,985,
            1006,759,785,1012,1013,742,743,744,745,746,
            748,750,751,752,754,757,758,760,761,733,
            768,769,770,771,772,774,775,776,777,778,
            779,780,781,782,783,784,786,787,735,1011,
            734,1003,836,993,994,997,998,999,1000,1002,
            983,984,1007,666,39,788,789,790,791,792,
            793,794,795,796,797,741,957,737,739,765,
            767,401,740,749,753,755,756,766,647,646,
            736,738,747,762,763,764,773,639,546,643,
            642,641,638,627,526,521,511,649,648,640,
            759,785,1052,1053,742,743,744,745,746,748,
            750,751,752,754,757,758,760,761,733,768,
            769,770,771,772,774,775,776,777,778,779,
            780,781,782,783,784,786,787,735,1051,734,
            975,960,965,966,969,970,971,972,974,955,
            956,979,173,46,788,789,790,791,792,793,
            794,795,796,797,741,44,737,739,765,767,
            666,740,749,753,755,756,766,666,2158,736,
            738,747,762,763,764,773,16,666,788,789,
            790,791,792,793,794,795,796,797,666,759,
            785,666,670,742,743,744,745,746,748,750,
            751,752,754,757,758,760,761,491,768,769,
            770,771,772,774,775,776,777,778,779,780,
            781,782,783,784,786,787,735,23,734,788,
            789,790,791,792,793,794,795,796,797,811,
            666,807,809,815,817,666,810,191,311,190,
            310,816,189,307,806,808,828,812,813,814,
            827,666,666,788,789,790,791,792,793,794,
            795,796,797,811,122,807,809,815,817,666,
            810,193,188,302,666,816,187,298,806,808,
            666,812,813,814,21,666,788,789,790,791,
            792,793,794,795,796,797,826,186,297,824,
            823,825,666,830,185,296,184,312,829,183,
            295,832,831,828,666,708,621,827,194,1063,
            798,799,800,801,802,803,804,805,182,293,
            1060,1062,1057,181,292,666,1064,666,1059,1061,
            1058,414,666,1063,798,799,800,801,802,803,
            804,805,180,287,1060,1062,1057,179,286,666,
            1064,666,1059,1061,1058,557,195,288,193,301,
            666,483,666,1063,798,799,800,801,802,803,
            804,805,176,382,1060,1062,1057,666,10,196,
            1064,666,1059,1061,1058,561,666,1063,798,799,
            800,801,802,803,804,805,67,864,1060,1062,
            1057,666,666,666,1064,666,1059,1061,1058,586,
            666,666,666,44,860,622,655,666,174,666,
            666,845,846,863,865,715,651,729,730,666,
            851,854,847,848,849,852,853,855,856,857,
            859,861,850,845,846,175,666,666,666,666,
            25,666,851,854,847,848,849,852,853,855,
            856,857,826,726,850,824,823,825,666,830,
            845,846,666,666,829,666,666,727,728,851,
            854,847,848,849,852,853,855,856,857,666,
            666,850,788,789,790,791,792,793,794,795,
            796,797,54,666,788,789,790,791,792,793,
            794,795,796,797,666,619,623,55,666,788,
            789,790,791,792,793,794,795,796,797,666,
            666,788,789,790,791,792,793,794,795,796,
            797,57,666,788,789,790,791,792,793,794,
            795,796,797,56,666,788,789,790,791,792,
            793,794,795,796,797,59,666,788,789,790,
            791,792,793,794,795,796,797,58,666,788,
            789,790,791,792,793,794,795,796,797,154,
            666,798,799,800,801,802,803,804,805,155,
            27,798,799,800,801,802,803,804,805,29,
            666,666,826,666,666,824,823,825,666,666,
            666,826,666,666,824,823,825
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