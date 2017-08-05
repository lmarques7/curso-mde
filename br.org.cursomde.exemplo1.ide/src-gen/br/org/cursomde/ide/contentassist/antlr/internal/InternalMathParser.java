package br.org.cursomde.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import br.org.cursomde.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'Problema'", "'Armazene'"
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

    	public void setGrammarAccess(MathGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProblema"
    // InternalMath.g:53:1: entryRuleProblema : ruleProblema EOF ;
    public final void entryRuleProblema() throws RecognitionException {
        try {
            // InternalMath.g:54:1: ( ruleProblema EOF )
            // InternalMath.g:55:1: ruleProblema EOF
            {
             before(grammarAccess.getProblemaRule()); 
            pushFollow(FOLLOW_1);
            ruleProblema();

            state._fsp--;

             after(grammarAccess.getProblemaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProblema"


    // $ANTLR start "ruleProblema"
    // InternalMath.g:62:1: ruleProblema : ( ( rule__Problema__Group__0 ) ) ;
    public final void ruleProblema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:66:2: ( ( ( rule__Problema__Group__0 ) ) )
            // InternalMath.g:67:2: ( ( rule__Problema__Group__0 ) )
            {
            // InternalMath.g:67:2: ( ( rule__Problema__Group__0 ) )
            // InternalMath.g:68:3: ( rule__Problema__Group__0 )
            {
             before(grammarAccess.getProblemaAccess().getGroup()); 
            // InternalMath.g:69:3: ( rule__Problema__Group__0 )
            // InternalMath.g:69:4: rule__Problema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Problema__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProblemaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProblema"


    // $ANTLR start "entryRuleExpressao"
    // InternalMath.g:78:1: entryRuleExpressao : ruleExpressao EOF ;
    public final void entryRuleExpressao() throws RecognitionException {
        try {
            // InternalMath.g:79:1: ( ruleExpressao EOF )
            // InternalMath.g:80:1: ruleExpressao EOF
            {
             before(grammarAccess.getExpressaoRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getExpressaoRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpressao"


    // $ANTLR start "ruleExpressao"
    // InternalMath.g:87:1: ruleExpressao : ( ( rule__Expressao__Alternatives ) ) ;
    public final void ruleExpressao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:91:2: ( ( ( rule__Expressao__Alternatives ) ) )
            // InternalMath.g:92:2: ( ( rule__Expressao__Alternatives ) )
            {
            // InternalMath.g:92:2: ( ( rule__Expressao__Alternatives ) )
            // InternalMath.g:93:3: ( rule__Expressao__Alternatives )
            {
             before(grammarAccess.getExpressaoAccess().getAlternatives()); 
            // InternalMath.g:94:3: ( rule__Expressao__Alternatives )
            // InternalMath.g:94:4: rule__Expressao__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expressao__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressaoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressao"


    // $ANTLR start "entryRuleArmazena"
    // InternalMath.g:103:1: entryRuleArmazena : ruleArmazena EOF ;
    public final void entryRuleArmazena() throws RecognitionException {
        try {
            // InternalMath.g:104:1: ( ruleArmazena EOF )
            // InternalMath.g:105:1: ruleArmazena EOF
            {
             before(grammarAccess.getArmazenaRule()); 
            pushFollow(FOLLOW_1);
            ruleArmazena();

            state._fsp--;

             after(grammarAccess.getArmazenaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArmazena"


    // $ANTLR start "ruleArmazena"
    // InternalMath.g:112:1: ruleArmazena : ( ( rule__Armazena__Group__0 ) ) ;
    public final void ruleArmazena() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:116:2: ( ( ( rule__Armazena__Group__0 ) ) )
            // InternalMath.g:117:2: ( ( rule__Armazena__Group__0 ) )
            {
            // InternalMath.g:117:2: ( ( rule__Armazena__Group__0 ) )
            // InternalMath.g:118:3: ( rule__Armazena__Group__0 )
            {
             before(grammarAccess.getArmazenaAccess().getGroup()); 
            // InternalMath.g:119:3: ( rule__Armazena__Group__0 )
            // InternalMath.g:119:4: rule__Armazena__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Armazena__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArmazenaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArmazena"


    // $ANTLR start "entryRuleOperacao"
    // InternalMath.g:128:1: entryRuleOperacao : ruleOperacao EOF ;
    public final void entryRuleOperacao() throws RecognitionException {
        try {
            // InternalMath.g:129:1: ( ruleOperacao EOF )
            // InternalMath.g:130:1: ruleOperacao EOF
            {
             before(grammarAccess.getOperacaoRule()); 
            pushFollow(FOLLOW_1);
            ruleOperacao();

            state._fsp--;

             after(grammarAccess.getOperacaoRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOperacao"


    // $ANTLR start "ruleOperacao"
    // InternalMath.g:137:1: ruleOperacao : ( ( rule__Operacao__Group__0 ) ) ;
    public final void ruleOperacao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:141:2: ( ( ( rule__Operacao__Group__0 ) ) )
            // InternalMath.g:142:2: ( ( rule__Operacao__Group__0 ) )
            {
            // InternalMath.g:142:2: ( ( rule__Operacao__Group__0 ) )
            // InternalMath.g:143:3: ( rule__Operacao__Group__0 )
            {
             before(grammarAccess.getOperacaoAccess().getGroup()); 
            // InternalMath.g:144:3: ( rule__Operacao__Group__0 )
            // InternalMath.g:144:4: rule__Operacao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operacao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperacaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperacao"


    // $ANTLR start "ruleSinalMatematico"
    // InternalMath.g:153:1: ruleSinalMatematico : ( ( rule__SinalMatematico__Alternatives ) ) ;
    public final void ruleSinalMatematico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:157:1: ( ( ( rule__SinalMatematico__Alternatives ) ) )
            // InternalMath.g:158:2: ( ( rule__SinalMatematico__Alternatives ) )
            {
            // InternalMath.g:158:2: ( ( rule__SinalMatematico__Alternatives ) )
            // InternalMath.g:159:3: ( rule__SinalMatematico__Alternatives )
            {
             before(grammarAccess.getSinalMatematicoAccess().getAlternatives()); 
            // InternalMath.g:160:3: ( rule__SinalMatematico__Alternatives )
            // InternalMath.g:160:4: rule__SinalMatematico__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SinalMatematico__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSinalMatematicoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSinalMatematico"


    // $ANTLR start "rule__Expressao__Alternatives"
    // InternalMath.g:168:1: rule__Expressao__Alternatives : ( ( ruleArmazena ) | ( ruleOperacao ) );
    public final void rule__Expressao__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:172:1: ( ( ruleArmazena ) | ( ruleOperacao ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=11 && LA1_0<=14)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMath.g:173:2: ( ruleArmazena )
                    {
                    // InternalMath.g:173:2: ( ruleArmazena )
                    // InternalMath.g:174:3: ruleArmazena
                    {
                     before(grammarAccess.getExpressaoAccess().getArmazenaParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleArmazena();

                    state._fsp--;

                     after(grammarAccess.getExpressaoAccess().getArmazenaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:179:2: ( ruleOperacao )
                    {
                    // InternalMath.g:179:2: ( ruleOperacao )
                    // InternalMath.g:180:3: ruleOperacao
                    {
                     before(grammarAccess.getExpressaoAccess().getOperacaoParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOperacao();

                    state._fsp--;

                     after(grammarAccess.getExpressaoAccess().getOperacaoParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Alternatives"


    // $ANTLR start "rule__SinalMatematico__Alternatives"
    // InternalMath.g:189:1: rule__SinalMatematico__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__SinalMatematico__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:193:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMath.g:194:2: ( ( '+' ) )
                    {
                    // InternalMath.g:194:2: ( ( '+' ) )
                    // InternalMath.g:195:3: ( '+' )
                    {
                     before(grammarAccess.getSinalMatematicoAccess().getSOMAEnumLiteralDeclaration_0()); 
                    // InternalMath.g:196:3: ( '+' )
                    // InternalMath.g:196:4: '+'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSinalMatematicoAccess().getSOMAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:200:2: ( ( '-' ) )
                    {
                    // InternalMath.g:200:2: ( ( '-' ) )
                    // InternalMath.g:201:3: ( '-' )
                    {
                     before(grammarAccess.getSinalMatematicoAccess().getSUBTRACAOEnumLiteralDeclaration_1()); 
                    // InternalMath.g:202:3: ( '-' )
                    // InternalMath.g:202:4: '-'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getSinalMatematicoAccess().getSUBTRACAOEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:206:2: ( ( '*' ) )
                    {
                    // InternalMath.g:206:2: ( ( '*' ) )
                    // InternalMath.g:207:3: ( '*' )
                    {
                     before(grammarAccess.getSinalMatematicoAccess().getMULTIPLICACAOEnumLiteralDeclaration_2()); 
                    // InternalMath.g:208:3: ( '*' )
                    // InternalMath.g:208:4: '*'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSinalMatematicoAccess().getMULTIPLICACAOEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMath.g:212:2: ( ( '/' ) )
                    {
                    // InternalMath.g:212:2: ( ( '/' ) )
                    // InternalMath.g:213:3: ( '/' )
                    {
                     before(grammarAccess.getSinalMatematicoAccess().getDIVISAOEnumLiteralDeclaration_3()); 
                    // InternalMath.g:214:3: ( '/' )
                    // InternalMath.g:214:4: '/'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSinalMatematicoAccess().getDIVISAOEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SinalMatematico__Alternatives"


    // $ANTLR start "rule__Problema__Group__0"
    // InternalMath.g:222:1: rule__Problema__Group__0 : rule__Problema__Group__0__Impl rule__Problema__Group__1 ;
    public final void rule__Problema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:226:1: ( rule__Problema__Group__0__Impl rule__Problema__Group__1 )
            // InternalMath.g:227:2: rule__Problema__Group__0__Impl rule__Problema__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Problema__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Problema__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problema__Group__0"


    // $ANTLR start "rule__Problema__Group__0__Impl"
    // InternalMath.g:234:1: rule__Problema__Group__0__Impl : ( 'Problema' ) ;
    public final void rule__Problema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:238:1: ( ( 'Problema' ) )
            // InternalMath.g:239:1: ( 'Problema' )
            {
            // InternalMath.g:239:1: ( 'Problema' )
            // InternalMath.g:240:2: 'Problema'
            {
             before(grammarAccess.getProblemaAccess().getProblemaKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProblemaAccess().getProblemaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problema__Group__0__Impl"


    // $ANTLR start "rule__Problema__Group__1"
    // InternalMath.g:249:1: rule__Problema__Group__1 : rule__Problema__Group__1__Impl rule__Problema__Group__2 ;
    public final void rule__Problema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:253:1: ( rule__Problema__Group__1__Impl rule__Problema__Group__2 )
            // InternalMath.g:254:2: rule__Problema__Group__1__Impl rule__Problema__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Problema__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Problema__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problema__Group__1"


    // $ANTLR start "rule__Problema__Group__1__Impl"
    // InternalMath.g:261:1: rule__Problema__Group__1__Impl : ( ( rule__Problema__NameAssignment_1 ) ) ;
    public final void rule__Problema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:265:1: ( ( ( rule__Problema__NameAssignment_1 ) ) )
            // InternalMath.g:266:1: ( ( rule__Problema__NameAssignment_1 ) )
            {
            // InternalMath.g:266:1: ( ( rule__Problema__NameAssignment_1 ) )
            // InternalMath.g:267:2: ( rule__Problema__NameAssignment_1 )
            {
             before(grammarAccess.getProblemaAccess().getNameAssignment_1()); 
            // InternalMath.g:268:2: ( rule__Problema__NameAssignment_1 )
            // InternalMath.g:268:3: rule__Problema__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Problema__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProblemaAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problema__Group__1__Impl"


    // $ANTLR start "rule__Problema__Group__2"
    // InternalMath.g:276:1: rule__Problema__Group__2 : rule__Problema__Group__2__Impl ;
    public final void rule__Problema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:280:1: ( rule__Problema__Group__2__Impl )
            // InternalMath.g:281:2: rule__Problema__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Problema__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problema__Group__2"


    // $ANTLR start "rule__Problema__Group__2__Impl"
    // InternalMath.g:287:1: rule__Problema__Group__2__Impl : ( ( rule__Problema__ExpressoesAssignment_2 )* ) ;
    public final void rule__Problema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:291:1: ( ( ( rule__Problema__ExpressoesAssignment_2 )* ) )
            // InternalMath.g:292:1: ( ( rule__Problema__ExpressoesAssignment_2 )* )
            {
            // InternalMath.g:292:1: ( ( rule__Problema__ExpressoesAssignment_2 )* )
            // InternalMath.g:293:2: ( rule__Problema__ExpressoesAssignment_2 )*
            {
             before(grammarAccess.getProblemaAccess().getExpressoesAssignment_2()); 
            // InternalMath.g:294:2: ( rule__Problema__ExpressoesAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=11 && LA3_0<=14)||LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMath.g:294:3: rule__Problema__ExpressoesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Problema__ExpressoesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProblemaAccess().getExpressoesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problema__Group__2__Impl"


    // $ANTLR start "rule__Armazena__Group__0"
    // InternalMath.g:303:1: rule__Armazena__Group__0 : rule__Armazena__Group__0__Impl rule__Armazena__Group__1 ;
    public final void rule__Armazena__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:307:1: ( rule__Armazena__Group__0__Impl rule__Armazena__Group__1 )
            // InternalMath.g:308:2: rule__Armazena__Group__0__Impl rule__Armazena__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Armazena__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Armazena__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Armazena__Group__0"


    // $ANTLR start "rule__Armazena__Group__0__Impl"
    // InternalMath.g:315:1: rule__Armazena__Group__0__Impl : ( 'Armazene' ) ;
    public final void rule__Armazena__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:319:1: ( ( 'Armazene' ) )
            // InternalMath.g:320:1: ( 'Armazene' )
            {
            // InternalMath.g:320:1: ( 'Armazene' )
            // InternalMath.g:321:2: 'Armazene'
            {
             before(grammarAccess.getArmazenaAccess().getArmazeneKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getArmazenaAccess().getArmazeneKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Armazena__Group__0__Impl"


    // $ANTLR start "rule__Armazena__Group__1"
    // InternalMath.g:330:1: rule__Armazena__Group__1 : rule__Armazena__Group__1__Impl ;
    public final void rule__Armazena__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:334:1: ( rule__Armazena__Group__1__Impl )
            // InternalMath.g:335:2: rule__Armazena__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Armazena__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Armazena__Group__1"


    // $ANTLR start "rule__Armazena__Group__1__Impl"
    // InternalMath.g:341:1: rule__Armazena__Group__1__Impl : ( ( rule__Armazena__TermoAssignment_1 ) ) ;
    public final void rule__Armazena__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:345:1: ( ( ( rule__Armazena__TermoAssignment_1 ) ) )
            // InternalMath.g:346:1: ( ( rule__Armazena__TermoAssignment_1 ) )
            {
            // InternalMath.g:346:1: ( ( rule__Armazena__TermoAssignment_1 ) )
            // InternalMath.g:347:2: ( rule__Armazena__TermoAssignment_1 )
            {
             before(grammarAccess.getArmazenaAccess().getTermoAssignment_1()); 
            // InternalMath.g:348:2: ( rule__Armazena__TermoAssignment_1 )
            // InternalMath.g:348:3: rule__Armazena__TermoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Armazena__TermoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArmazenaAccess().getTermoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Armazena__Group__1__Impl"


    // $ANTLR start "rule__Operacao__Group__0"
    // InternalMath.g:357:1: rule__Operacao__Group__0 : rule__Operacao__Group__0__Impl rule__Operacao__Group__1 ;
    public final void rule__Operacao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:361:1: ( rule__Operacao__Group__0__Impl rule__Operacao__Group__1 )
            // InternalMath.g:362:2: rule__Operacao__Group__0__Impl rule__Operacao__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Operacao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operacao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacao__Group__0"


    // $ANTLR start "rule__Operacao__Group__0__Impl"
    // InternalMath.g:369:1: rule__Operacao__Group__0__Impl : ( ( rule__Operacao__SinalAssignment_0 ) ) ;
    public final void rule__Operacao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:373:1: ( ( ( rule__Operacao__SinalAssignment_0 ) ) )
            // InternalMath.g:374:1: ( ( rule__Operacao__SinalAssignment_0 ) )
            {
            // InternalMath.g:374:1: ( ( rule__Operacao__SinalAssignment_0 ) )
            // InternalMath.g:375:2: ( rule__Operacao__SinalAssignment_0 )
            {
             before(grammarAccess.getOperacaoAccess().getSinalAssignment_0()); 
            // InternalMath.g:376:2: ( rule__Operacao__SinalAssignment_0 )
            // InternalMath.g:376:3: rule__Operacao__SinalAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Operacao__SinalAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOperacaoAccess().getSinalAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacao__Group__0__Impl"


    // $ANTLR start "rule__Operacao__Group__1"
    // InternalMath.g:384:1: rule__Operacao__Group__1 : rule__Operacao__Group__1__Impl ;
    public final void rule__Operacao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:388:1: ( rule__Operacao__Group__1__Impl )
            // InternalMath.g:389:2: rule__Operacao__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operacao__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacao__Group__1"


    // $ANTLR start "rule__Operacao__Group__1__Impl"
    // InternalMath.g:395:1: rule__Operacao__Group__1__Impl : ( ( rule__Operacao__TermoAssignment_1 ) ) ;
    public final void rule__Operacao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:399:1: ( ( ( rule__Operacao__TermoAssignment_1 ) ) )
            // InternalMath.g:400:1: ( ( rule__Operacao__TermoAssignment_1 ) )
            {
            // InternalMath.g:400:1: ( ( rule__Operacao__TermoAssignment_1 ) )
            // InternalMath.g:401:2: ( rule__Operacao__TermoAssignment_1 )
            {
             before(grammarAccess.getOperacaoAccess().getTermoAssignment_1()); 
            // InternalMath.g:402:2: ( rule__Operacao__TermoAssignment_1 )
            // InternalMath.g:402:3: rule__Operacao__TermoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Operacao__TermoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperacaoAccess().getTermoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacao__Group__1__Impl"


    // $ANTLR start "rule__Problema__NameAssignment_1"
    // InternalMath.g:411:1: rule__Problema__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Problema__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:415:1: ( ( RULE_ID ) )
            // InternalMath.g:416:2: ( RULE_ID )
            {
            // InternalMath.g:416:2: ( RULE_ID )
            // InternalMath.g:417:3: RULE_ID
            {
             before(grammarAccess.getProblemaAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProblemaAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problema__NameAssignment_1"


    // $ANTLR start "rule__Problema__ExpressoesAssignment_2"
    // InternalMath.g:426:1: rule__Problema__ExpressoesAssignment_2 : ( ruleExpressao ) ;
    public final void rule__Problema__ExpressoesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:430:1: ( ( ruleExpressao ) )
            // InternalMath.g:431:2: ( ruleExpressao )
            {
            // InternalMath.g:431:2: ( ruleExpressao )
            // InternalMath.g:432:3: ruleExpressao
            {
             before(grammarAccess.getProblemaAccess().getExpressoesExpressaoParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getProblemaAccess().getExpressoesExpressaoParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problema__ExpressoesAssignment_2"


    // $ANTLR start "rule__Armazena__TermoAssignment_1"
    // InternalMath.g:441:1: rule__Armazena__TermoAssignment_1 : ( RULE_INT ) ;
    public final void rule__Armazena__TermoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:445:1: ( ( RULE_INT ) )
            // InternalMath.g:446:2: ( RULE_INT )
            {
            // InternalMath.g:446:2: ( RULE_INT )
            // InternalMath.g:447:3: RULE_INT
            {
             before(grammarAccess.getArmazenaAccess().getTermoINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getArmazenaAccess().getTermoINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Armazena__TermoAssignment_1"


    // $ANTLR start "rule__Operacao__SinalAssignment_0"
    // InternalMath.g:456:1: rule__Operacao__SinalAssignment_0 : ( ruleSinalMatematico ) ;
    public final void rule__Operacao__SinalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:460:1: ( ( ruleSinalMatematico ) )
            // InternalMath.g:461:2: ( ruleSinalMatematico )
            {
            // InternalMath.g:461:2: ( ruleSinalMatematico )
            // InternalMath.g:462:3: ruleSinalMatematico
            {
             before(grammarAccess.getOperacaoAccess().getSinalSinalMatematicoEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSinalMatematico();

            state._fsp--;

             after(grammarAccess.getOperacaoAccess().getSinalSinalMatematicoEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacao__SinalAssignment_0"


    // $ANTLR start "rule__Operacao__TermoAssignment_1"
    // InternalMath.g:471:1: rule__Operacao__TermoAssignment_1 : ( RULE_INT ) ;
    public final void rule__Operacao__TermoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:475:1: ( ( RULE_INT ) )
            // InternalMath.g:476:2: ( RULE_INT )
            {
            // InternalMath.g:476:2: ( RULE_INT )
            // InternalMath.g:477:3: RULE_INT
            {
             before(grammarAccess.getOperacaoAccess().getTermoINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOperacaoAccess().getTermoINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operacao__TermoAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000017800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000017802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});

}