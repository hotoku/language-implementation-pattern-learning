// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g 2020-10-28 21:00:42

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class VecMathHeteroParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VEC", "ASSIGN", "PRINT", "PLUS", "MULT", "DOT", "ID", "INT", "WS", "'['", "','", "']'"
    };
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


        public VecMathHeteroParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public VecMathHeteroParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return VecMathHeteroParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:15:1: prog : ( stat )+ ;
    public final VecMathHeteroParser.prog_return prog() throws RecognitionException {
        VecMathHeteroParser.prog_return retval = new VecMathHeteroParser.prog_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        VecMathHeteroParser.stat_return stat1 = null;



        try {
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:15:5: ( ( stat )+ )
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:15:7: ( stat )+
            {
            root_0 = (Object)adaptor.nil();

            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:15:7: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==PRINT||LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:15:7: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog68);
            	    stat1=stat();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stat1.getTree());

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

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class stat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stat"
    // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:16:1: stat : ( ID '=' expr -> ^( '=' ID expr ) | 'print' expr -> ^( 'print' expr ) );
    public final VecMathHeteroParser.stat_return stat() throws RecognitionException {
        VecMathHeteroParser.stat_return retval = new VecMathHeteroParser.stat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID2=null;
        Token char_literal3=null;
        Token string_literal5=null;
        VecMathHeteroParser.expr_return expr4 = null;

        VecMathHeteroParser.expr_return expr6 = null;


        Object ID2_tree=null;
        Object char_literal3_tree=null;
        Object string_literal5_tree=null;
        RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:16:5: ( ID '=' expr -> ^( '=' ID expr ) | 'print' expr -> ^( 'print' expr ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==PRINT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:16:7: ID '=' expr
                    {
                    ID2=(Token)match(input,ID,FOLLOW_ID_in_stat101);  
                    stream_ID.add(ID2);

                    char_literal3=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stat103);  
                    stream_ASSIGN.add(char_literal3);

                    pushFollow(FOLLOW_expr_in_stat105);
                    expr4=expr();

                    state._fsp--;

                    stream_expr.add(expr4.getTree());


                    // AST REWRITE
                    // elements: expr, ASSIGN, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 16:20: -> ^( '=' ID expr )
                    {
                        // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:16:23: ^( '=' ID expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);

                        adaptor.addChild(root_1, new VarNode(stream_ID.nextToken()));
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:17:7: 'print' expr
                    {
                    string_literal5=(Token)match(input,PRINT,FOLLOW_PRINT_in_stat129);  
                    stream_PRINT.add(string_literal5);

                    pushFollow(FOLLOW_expr_in_stat131);
                    expr6=expr();

                    state._fsp--;

                    stream_expr.add(expr6.getTree());


                    // AST REWRITE
                    // elements: PRINT, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 17:20: -> ^( 'print' expr )
                    {
                        // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:17:23: ^( 'print' expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PRINT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stat"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:22:1: expr : multExpr ( '+' multExpr )* ;
    public final VecMathHeteroParser.expr_return expr() throws RecognitionException {
        VecMathHeteroParser.expr_return retval = new VecMathHeteroParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal8=null;
        VecMathHeteroParser.multExpr_return multExpr7 = null;

        VecMathHeteroParser.multExpr_return multExpr9 = null;


        Object char_literal8_tree=null;

        try {
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:22:5: ( multExpr ( '+' multExpr )* )
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:22:9: multExpr ( '+' multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multExpr_in_expr156);
            multExpr7=multExpr();

            state._fsp--;

            adaptor.addChild(root_0, multExpr7.getTree());
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:22:18: ( '+' multExpr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==PLUS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:22:19: '+' multExpr
            	    {
            	    char_literal8=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr159); 
            	    char_literal8_tree = new AddNode(char_literal8) ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal8_tree, root_0);

            	    pushFollow(FOLLOW_multExpr_in_expr165);
            	    multExpr9=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr9.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class multExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpr"
    // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:23:1: multExpr : primary ( ( '*' | '.' ) primary )* ;
    public final VecMathHeteroParser.multExpr_return multExpr() throws RecognitionException {
        VecMathHeteroParser.multExpr_return retval = new VecMathHeteroParser.multExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal11=null;
        Token char_literal12=null;
        VecMathHeteroParser.primary_return primary10 = null;

        VecMathHeteroParser.primary_return primary13 = null;


        Object char_literal11_tree=null;
        Object char_literal12_tree=null;

        try {
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:23:9: ( primary ( ( '*' | '.' ) primary )* )
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:23:11: primary ( ( '*' | '.' ) primary )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_primary_in_multExpr182);
            primary10=primary();

            state._fsp--;

            adaptor.addChild(root_0, primary10.getTree());
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:23:19: ( ( '*' | '.' ) primary )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=MULT && LA5_0<=DOT)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:23:20: ( '*' | '.' ) primary
            	    {
            	    // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:23:20: ( '*' | '.' )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==MULT) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==DOT) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:23:21: '*'
            	            {
            	            char_literal11=(Token)match(input,MULT,FOLLOW_MULT_in_multExpr186); 
            	            char_literal11_tree = new MultNode(char_literal11) ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal11_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:23:36: '.'
            	            {
            	            char_literal12=(Token)match(input,DOT,FOLLOW_DOT_in_multExpr192); 
            	            char_literal12_tree = new DotProductNode(char_literal12) ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal12_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_primary_in_multExpr199);
            	    primary13=primary();

            	    state._fsp--;

            	    adaptor.addChild(root_0, primary13.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multExpr"

    public static class primary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary"
    // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:24:1: primary : ( INT | ID | '[' expr ( ',' expr )* ']' -> ^( VEC ( expr )+ ) );
    public final VecMathHeteroParser.primary_return primary() throws RecognitionException {
        VecMathHeteroParser.primary_return retval = new VecMathHeteroParser.primary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT14=null;
        Token ID15=null;
        Token char_literal16=null;
        Token char_literal18=null;
        Token char_literal20=null;
        VecMathHeteroParser.expr_return expr17 = null;

        VecMathHeteroParser.expr_return expr19 = null;


        Object INT14_tree=null;
        Object ID15_tree=null;
        Object char_literal16_tree=null;
        Object char_literal18_tree=null;
        Object char_literal20_tree=null;
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:25:5: ( INT | ID | '[' expr ( ',' expr )* ']' -> ^( VEC ( expr )+ ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt7=1;
                }
                break;
            case ID:
                {
                alt7=2;
                }
                break;
            case 13:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:25:9: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT14=(Token)match(input,INT,FOLLOW_INT_in_primary216); 
                    INT14_tree = new IntNode(INT14) ;
                    adaptor.addChild(root_0, INT14_tree);


                    }
                    break;
                case 2 :
                    // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:26:9: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID15=(Token)match(input,ID,FOLLOW_ID_in_primary229); 
                    ID15_tree = new VarNode(ID15) ;
                    adaptor.addChild(root_0, ID15_tree);


                    }
                    break;
                case 3 :
                    // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:27:9: '[' expr ( ',' expr )* ']'
                    {
                    char_literal16=(Token)match(input,13,FOLLOW_13_in_primary242);  
                    stream_13.add(char_literal16);

                    pushFollow(FOLLOW_expr_in_primary244);
                    expr17=expr();

                    state._fsp--;

                    stream_expr.add(expr17.getTree());
                    // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:27:18: ( ',' expr )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:27:19: ',' expr
                    	    {
                    	    char_literal18=(Token)match(input,14,FOLLOW_14_in_primary247);  
                    	    stream_14.add(char_literal18);

                    	    pushFollow(FOLLOW_expr_in_primary249);
                    	    expr19=expr();

                    	    state._fsp--;

                    	    stream_expr.add(expr19.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    char_literal20=(Token)match(input,15,FOLLOW_15_in_primary253);  
                    stream_15.add(char_literal20);



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 27:34: -> ^( VEC ( expr )+ )
                    {
                        // /Users/hotoku/projects/lip/code/walking/tree-grammar/VecMathHetero.g:27:37: ^( VEC ( expr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VectorNode(VEC), root_1);

                        if ( !(stream_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primary"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog68 = new BitSet(new long[]{0x0000000000000442L});
    public static final BitSet FOLLOW_ID_in_stat101 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_stat103 = new BitSet(new long[]{0x0000000000002C00L});
    public static final BitSet FOLLOW_expr_in_stat105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_stat129 = new BitSet(new long[]{0x0000000000002C00L});
    public static final BitSet FOLLOW_expr_in_stat131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr156 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_PLUS_in_expr159 = new BitSet(new long[]{0x0000000000002C00L});
    public static final BitSet FOLLOW_multExpr_in_expr165 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_primary_in_multExpr182 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_MULT_in_multExpr186 = new BitSet(new long[]{0x0000000000002C00L});
    public static final BitSet FOLLOW_DOT_in_multExpr192 = new BitSet(new long[]{0x0000000000002C00L});
    public static final BitSet FOLLOW_primary_in_multExpr199 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_INT_in_primary216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_primary242 = new BitSet(new long[]{0x0000000000002C00L});
    public static final BitSet FOLLOW_expr_in_primary244 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_primary247 = new BitSet(new long[]{0x0000000000002C00L});
    public static final BitSet FOLLOW_expr_in_primary249 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_primary253 = new BitSet(new long[]{0x0000000000000002L});

}