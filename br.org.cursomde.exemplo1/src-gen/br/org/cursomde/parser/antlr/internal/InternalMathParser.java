package br.org.cursomde.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.org.cursomde.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Problema'", "'Armazene'", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }



     	private MathGrammarAccess grammarAccess;

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Problema";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProblema"
    // InternalMath.g:65:1: entryRuleProblema returns [EObject current=null] : iv_ruleProblema= ruleProblema EOF ;
    public final EObject entryRuleProblema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblema = null;


        try {
            // InternalMath.g:65:49: (iv_ruleProblema= ruleProblema EOF )
            // InternalMath.g:66:2: iv_ruleProblema= ruleProblema EOF
            {
             newCompositeNode(grammarAccess.getProblemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProblema=ruleProblema();

            state._fsp--;

             current =iv_ruleProblema; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProblema"


    // $ANTLR start "ruleProblema"
    // InternalMath.g:72:1: ruleProblema returns [EObject current=null] : (otherlv_0= 'Problema' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expressoes_2_0= ruleExpressao ) )* ) ;
    public final EObject ruleProblema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_expressoes_2_0 = null;



        	enterRule();

        try {
            // InternalMath.g:78:2: ( (otherlv_0= 'Problema' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expressoes_2_0= ruleExpressao ) )* ) )
            // InternalMath.g:79:2: (otherlv_0= 'Problema' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expressoes_2_0= ruleExpressao ) )* )
            {
            // InternalMath.g:79:2: (otherlv_0= 'Problema' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expressoes_2_0= ruleExpressao ) )* )
            // InternalMath.g:80:3: otherlv_0= 'Problema' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expressoes_2_0= ruleExpressao ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProblemaAccess().getProblemaKeyword_0());
            		
            // InternalMath.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProblemaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProblemaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMath.g:102:3: ( (lv_expressoes_2_0= ruleExpressao ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:103:4: (lv_expressoes_2_0= ruleExpressao )
            	    {
            	    // InternalMath.g:103:4: (lv_expressoes_2_0= ruleExpressao )
            	    // InternalMath.g:104:5: lv_expressoes_2_0= ruleExpressao
            	    {

            	    					newCompositeNode(grammarAccess.getProblemaAccess().getExpressoesExpressaoParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_expressoes_2_0=ruleExpressao();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProblemaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"expressoes",
            	    						lv_expressoes_2_0,
            	    						"br.org.cursomde.Math.Expressao");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProblema"


    // $ANTLR start "entryRuleExpressao"
    // InternalMath.g:125:1: entryRuleExpressao returns [EObject current=null] : iv_ruleExpressao= ruleExpressao EOF ;
    public final EObject entryRuleExpressao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressao = null;


        try {
            // InternalMath.g:125:50: (iv_ruleExpressao= ruleExpressao EOF )
            // InternalMath.g:126:2: iv_ruleExpressao= ruleExpressao EOF
            {
             newCompositeNode(grammarAccess.getExpressaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressao=ruleExpressao();

            state._fsp--;

             current =iv_ruleExpressao; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressao"


    // $ANTLR start "ruleExpressao"
    // InternalMath.g:132:1: ruleExpressao returns [EObject current=null] : (this_Armazena_0= ruleArmazena | this_Operacao_1= ruleOperacao ) ;
    public final EObject ruleExpressao() throws RecognitionException {
        EObject current = null;

        EObject this_Armazena_0 = null;

        EObject this_Operacao_1 = null;



        	enterRule();

        try {
            // InternalMath.g:138:2: ( (this_Armazena_0= ruleArmazena | this_Operacao_1= ruleOperacao ) )
            // InternalMath.g:139:2: (this_Armazena_0= ruleArmazena | this_Operacao_1= ruleOperacao )
            {
            // InternalMath.g:139:2: (this_Armazena_0= ruleArmazena | this_Operacao_1= ruleOperacao )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=13 && LA2_0<=16)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMath.g:140:3: this_Armazena_0= ruleArmazena
                    {

                    			newCompositeNode(grammarAccess.getExpressaoAccess().getArmazenaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Armazena_0=ruleArmazena();

                    state._fsp--;


                    			current = this_Armazena_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMath.g:149:3: this_Operacao_1= ruleOperacao
                    {

                    			newCompositeNode(grammarAccess.getExpressaoAccess().getOperacaoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operacao_1=ruleOperacao();

                    state._fsp--;


                    			current = this_Operacao_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressao"


    // $ANTLR start "entryRuleArmazena"
    // InternalMath.g:161:1: entryRuleArmazena returns [EObject current=null] : iv_ruleArmazena= ruleArmazena EOF ;
    public final EObject entryRuleArmazena() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArmazena = null;


        try {
            // InternalMath.g:161:49: (iv_ruleArmazena= ruleArmazena EOF )
            // InternalMath.g:162:2: iv_ruleArmazena= ruleArmazena EOF
            {
             newCompositeNode(grammarAccess.getArmazenaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArmazena=ruleArmazena();

            state._fsp--;

             current =iv_ruleArmazena; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArmazena"


    // $ANTLR start "ruleArmazena"
    // InternalMath.g:168:1: ruleArmazena returns [EObject current=null] : (otherlv_0= 'Armazene' ( (lv_termo_1_0= RULE_INT ) ) ) ;
    public final EObject ruleArmazena() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_termo_1_0=null;


        	enterRule();

        try {
            // InternalMath.g:174:2: ( (otherlv_0= 'Armazene' ( (lv_termo_1_0= RULE_INT ) ) ) )
            // InternalMath.g:175:2: (otherlv_0= 'Armazene' ( (lv_termo_1_0= RULE_INT ) ) )
            {
            // InternalMath.g:175:2: (otherlv_0= 'Armazene' ( (lv_termo_1_0= RULE_INT ) ) )
            // InternalMath.g:176:3: otherlv_0= 'Armazene' ( (lv_termo_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getArmazenaAccess().getArmazeneKeyword_0());
            		
            // InternalMath.g:180:3: ( (lv_termo_1_0= RULE_INT ) )
            // InternalMath.g:181:4: (lv_termo_1_0= RULE_INT )
            {
            // InternalMath.g:181:4: (lv_termo_1_0= RULE_INT )
            // InternalMath.g:182:5: lv_termo_1_0= RULE_INT
            {
            lv_termo_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_termo_1_0, grammarAccess.getArmazenaAccess().getTermoINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArmazenaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"termo",
            						lv_termo_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArmazena"


    // $ANTLR start "entryRuleOperacao"
    // InternalMath.g:202:1: entryRuleOperacao returns [EObject current=null] : iv_ruleOperacao= ruleOperacao EOF ;
    public final EObject entryRuleOperacao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacao = null;


        try {
            // InternalMath.g:202:49: (iv_ruleOperacao= ruleOperacao EOF )
            // InternalMath.g:203:2: iv_ruleOperacao= ruleOperacao EOF
            {
             newCompositeNode(grammarAccess.getOperacaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperacao=ruleOperacao();

            state._fsp--;

             current =iv_ruleOperacao; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperacao"


    // $ANTLR start "ruleOperacao"
    // InternalMath.g:209:1: ruleOperacao returns [EObject current=null] : ( ( (lv_sinal_0_0= ruleSinalMatematico ) ) ( (lv_termo_1_0= RULE_INT ) ) ) ;
    public final EObject ruleOperacao() throws RecognitionException {
        EObject current = null;

        Token lv_termo_1_0=null;
        Enumerator lv_sinal_0_0 = null;



        	enterRule();

        try {
            // InternalMath.g:215:2: ( ( ( (lv_sinal_0_0= ruleSinalMatematico ) ) ( (lv_termo_1_0= RULE_INT ) ) ) )
            // InternalMath.g:216:2: ( ( (lv_sinal_0_0= ruleSinalMatematico ) ) ( (lv_termo_1_0= RULE_INT ) ) )
            {
            // InternalMath.g:216:2: ( ( (lv_sinal_0_0= ruleSinalMatematico ) ) ( (lv_termo_1_0= RULE_INT ) ) )
            // InternalMath.g:217:3: ( (lv_sinal_0_0= ruleSinalMatematico ) ) ( (lv_termo_1_0= RULE_INT ) )
            {
            // InternalMath.g:217:3: ( (lv_sinal_0_0= ruleSinalMatematico ) )
            // InternalMath.g:218:4: (lv_sinal_0_0= ruleSinalMatematico )
            {
            // InternalMath.g:218:4: (lv_sinal_0_0= ruleSinalMatematico )
            // InternalMath.g:219:5: lv_sinal_0_0= ruleSinalMatematico
            {

            					newCompositeNode(grammarAccess.getOperacaoAccess().getSinalSinalMatematicoEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_sinal_0_0=ruleSinalMatematico();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperacaoRule());
            					}
            					set(
            						current,
            						"sinal",
            						lv_sinal_0_0,
            						"br.org.cursomde.Math.SinalMatematico");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMath.g:236:3: ( (lv_termo_1_0= RULE_INT ) )
            // InternalMath.g:237:4: (lv_termo_1_0= RULE_INT )
            {
            // InternalMath.g:237:4: (lv_termo_1_0= RULE_INT )
            // InternalMath.g:238:5: lv_termo_1_0= RULE_INT
            {
            lv_termo_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_termo_1_0, grammarAccess.getOperacaoAccess().getTermoINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperacaoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"termo",
            						lv_termo_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperacao"


    // $ANTLR start "ruleSinalMatematico"
    // InternalMath.g:258:1: ruleSinalMatematico returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) ;
    public final Enumerator ruleSinalMatematico() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMath.g:264:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) )
            // InternalMath.g:265:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            {
            // InternalMath.g:265:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMath.g:266:3: (enumLiteral_0= '+' )
                    {
                    // InternalMath.g:266:3: (enumLiteral_0= '+' )
                    // InternalMath.g:267:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,13,FOLLOW_2); 

                    				current = grammarAccess.getSinalMatematicoAccess().getSOMAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSinalMatematicoAccess().getSOMAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:274:3: (enumLiteral_1= '-' )
                    {
                    // InternalMath.g:274:3: (enumLiteral_1= '-' )
                    // InternalMath.g:275:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,14,FOLLOW_2); 

                    				current = grammarAccess.getSinalMatematicoAccess().getSUBTRACAOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSinalMatematicoAccess().getSUBTRACAOEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:282:3: (enumLiteral_2= '*' )
                    {
                    // InternalMath.g:282:3: (enumLiteral_2= '*' )
                    // InternalMath.g:283:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,15,FOLLOW_2); 

                    				current = grammarAccess.getSinalMatematicoAccess().getMULTIPLICACAOEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSinalMatematicoAccess().getMULTIPLICACAOEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMath.g:290:3: (enumLiteral_3= '/' )
                    {
                    // InternalMath.g:290:3: (enumLiteral_3= '/' )
                    // InternalMath.g:291:4: enumLiteral_3= '/'
                    {
                    enumLiteral_3=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getSinalMatematicoAccess().getDIVISAOEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSinalMatematicoAccess().getDIVISAOEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSinalMatematico"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001F002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});

}