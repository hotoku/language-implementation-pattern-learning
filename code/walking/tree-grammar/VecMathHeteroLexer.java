// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g 2020-10-28 21:00:42

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class VecMathHeteroLexer extends Lexer {
    public static final int PRINT=6;
    public static final int DOT=9;
    public static final int ASSIGN=5;
    public static final int INT=11;
    public static final int T__15=15;
    public static final int MULT=8;
    public static final int VEC=4;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int ID=10;
    public static final int WS=12;
    public static final int EOF=-1;
    public static final int PLUS=7;

    // delegates
    // delegators

    public VecMathHeteroLexer() {;} 
    public VecMathHeteroLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public VecMathHeteroLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g"; }

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:3:8: ( '=' )
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:3:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:4:7: ( 'print' )
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:4:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:5:6: ( '+' )
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:5:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:6:6: ( '*' )
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:6:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:7:5: ( '.' )
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:7:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:8:7: ( '[' )
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:8:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:9:7: ( ',' )
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:10:7: ( ']' )
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:10:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:31:5: ( ( 'a' .. 'z' )+ )
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:31:9: ( 'a' .. 'z' )+
            {
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:31:9: ( 'a' .. 'z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:31:9: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:32:5: ( ( '0' .. '9' )+ )
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:32:9: ( '0' .. '9' )+
            {
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:32:9: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:32:9: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:33:5: ( ( ' ' | '\\r' | '\\n' )+ )
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:33:9: ( ' ' | '\\r' | '\\n' )+
            {
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:33:9: ( ' ' | '\\r' | '\\n' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\n'||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:1:8: ( ASSIGN | PRINT | PLUS | MULT | DOT | T__13 | T__14 | T__15 | ID | INT | WS )
        int alt4=11;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:1:10: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 2 :
                // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:1:17: PRINT
                {
                mPRINT(); 

                }
                break;
            case 3 :
                // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:1:23: PLUS
                {
                mPLUS(); 

                }
                break;
            case 4 :
                // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:1:28: MULT
                {
                mMULT(); 

                }
                break;
            case 5 :
                // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:1:33: DOT
                {
                mDOT(); 

                }
                break;
            case 6 :
                // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:1:37: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:1:43: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:1:49: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:1:55: ID
                {
                mID(); 

                }
                break;
            case 10 :
                // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:1:58: INT
                {
                mINT(); 

                }
                break;
            case 11 :
                // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:1:62: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\2\uffff\1\11\11\uffff\3\11\1\20\1\uffff";
    static final String DFA4_eofS =
        "\21\uffff";
    static final String DFA4_minS =
        "\1\12\1\uffff\1\162\11\uffff\1\151\1\156\1\164\1\141\1\uffff";
    static final String DFA4_maxS =
        "\1\172\1\uffff\1\162\11\uffff\1\151\1\156\1\164\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\4\uffff"+
        "\1\2";
    static final String DFA4_specialS =
        "\21\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\13\2\uffff\1\13\22\uffff\1\13\11\uffff\1\4\1\3\1\7\1\uffff"+
            "\1\5\1\uffff\12\12\3\uffff\1\1\35\uffff\1\6\1\uffff\1\10\3\uffff"+
            "\17\11\1\2\12\11",
            "",
            "\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\17",
            "\32\11",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ASSIGN | PRINT | PLUS | MULT | DOT | T__13 | T__14 | T__15 | ID | INT | WS );";
        }
    }
 

}