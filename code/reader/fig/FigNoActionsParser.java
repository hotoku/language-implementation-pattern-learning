// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g 2020-10-28 21:00:17

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FigNoActionsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "STRING", "INT", "WS", "SLCMT", "CMT", "'{'", "'}'", "'.'", "'='", "';'", "'$'", "'['", "','", "']'"
    };
    public static final int SLCMT=8;
    public static final int CMT=9;
    public static final int INT=6;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int STRING=5;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int ID=4;
    public static final int WS=7;
    public static final int EOF=-1;
    public static final int T__10=10;

    // delegates
    // delegators


        public FigNoActionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FigNoActionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return FigNoActionsParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g"; }



    // $ANTLR start "file"
    // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:4:1: file : ( object )+ ;
    public final void file() throws RecognitionException {
        try {
            // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:4:6: ( ( object )+ )
            // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:4:8: ( object )+
            {
            // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:4:8: ( object )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:4:8: object
            	    {
            	    pushFollow(FOLLOW_object_in_file11);
            	    object();

            	    state._fsp--;


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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "file"


    // $ANTLR start "object"
    // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:6:1: object : type ID '{' ( property )* '}' ;
    public final void object() throws RecognitionException {
        try {
            // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:7:5: ( type ID '{' ( property )* '}' )
            // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:7:9: type ID '{' ( property )* '}'
            {
            pushFollow(FOLLOW_type_in_object28);
            type();

            state._fsp--;

            match(input,ID,FOLLOW_ID_in_object30); 
            match(input,10,FOLLOW_10_in_object32); 
            // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:7:21: ( property )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:7:21: property
            	    {
            	    pushFollow(FOLLOW_property_in_object34);
            	    property();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,11,FOLLOW_11_in_object37); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "object"


    // $ANTLR start "type"
    // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:10:1: type : ID ( '.' ID )* ;
    public final void type() throws RecognitionException {
        try {
            // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:10:5: ( ID ( '.' ID )* )
            // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:10:9: ID ( '.' ID )*
            {
            match(input,ID,FOLLOW_ID_in_type52); 
            // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:10:12: ( '.' ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:10:13: '.' ID
            	    {
            	    match(input,12,FOLLOW_12_in_type55); 
            	    match(input,ID,FOLLOW_ID_in_type57); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type"


    // $ANTLR start "property"
    // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:14:1: property : ID '=' expr ';' ;
    public final void property() throws RecognitionException {
        try {
            // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:15:5: ( ID '=' expr ';' )
            // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:15:9: ID '=' expr ';'
            {
            match(input,ID,FOLLOW_ID_in_property77); 
            match(input,13,FOLLOW_13_in_property79); 
            pushFollow(FOLLOW_expr_in_property81);
            expr();

            state._fsp--;

            match(input,14,FOLLOW_14_in_property83); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "property"


    // $ANTLR start "expr"
    // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:18:1: expr : ( STRING | INT | '$' ID | list );
    public final void expr() throws RecognitionException {
        try {
            // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:18:5: ( STRING | INT | '$' ID | list )
            int alt4=4;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt4=1;
                }
                break;
            case INT:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:18:9: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_expr101); 

                    }
                    break;
                case 2 :
                    // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:19:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_expr111); 

                    }
                    break;
                case 3 :
                    // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:20:9: '$' ID
                    {
                    match(input,15,FOLLOW_15_in_expr121); 
                    match(input,ID,FOLLOW_ID_in_expr123); 

                    }
                    break;
                case 4 :
                    // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:21:9: list
                    {
                    pushFollow(FOLLOW_list_in_expr134);
                    list();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr"


    // $ANTLR start "list"
    // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:24:1: list : ( '[' expr ( ',' expr )* ']' | '[' ']' );
    public final void list() throws RecognitionException {
        try {
            // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:24:5: ( '[' expr ( ',' expr )* ']' | '[' ']' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==18) ) {
                    alt6=2;
                }
                else if ( ((LA6_1>=STRING && LA6_1<=INT)||(LA6_1>=15 && LA6_1<=16)) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:24:9: '[' expr ( ',' expr )* ']'
                    {
                    match(input,16,FOLLOW_16_in_list148); 
                    pushFollow(FOLLOW_expr_in_list150);
                    expr();

                    state._fsp--;

                    // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:24:18: ( ',' expr )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:24:19: ',' expr
                    	    {
                    	    match(input,17,FOLLOW_17_in_list153); 
                    	    pushFollow(FOLLOW_expr_in_list155);
                    	    expr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_list159); 

                    }
                    break;
                case 2 :
                    // /Users/hotoku/projects/lip/code/reader/fig/FigNoActions.g:25:9: '[' ']'
                    {
                    match(input,16,FOLLOW_16_in_list170); 
                    match(input,18,FOLLOW_18_in_list172); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "list"

    // Delegated rules


 

    public static final BitSet FOLLOW_object_in_file11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_type_in_object28 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_object30 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_object32 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_property_in_object34 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_11_in_object37 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type52 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_type55 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_type57 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ID_in_property77 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_property79 = new BitSet(new long[]{0x0000000000018060L});
    public static final BitSet FOLLOW_expr_in_property81 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_property83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expr101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_expr121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_expr123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_expr134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_list148 = new BitSet(new long[]{0x0000000000018060L});
    public static final BitSet FOLLOW_expr_in_list150 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_list153 = new BitSet(new long[]{0x0000000000018060L});
    public static final BitSet FOLLOW_expr_in_list155 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_list159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_list170 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_list172 = new BitSet(new long[]{0x0000000000000002L});

}