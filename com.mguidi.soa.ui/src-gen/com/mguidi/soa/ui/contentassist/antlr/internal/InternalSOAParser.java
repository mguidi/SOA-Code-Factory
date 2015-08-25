package com.mguidi.soa.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.mguidi.soa.services.SOAGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSOAParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_COMMENTS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@String'", "'@Short'", "'@Integer'", "'@Long'", "'@Float'", "'@Double'", "'@Boolean'", "'@Byte'", "'@Date'", "'@Datetime'", "'@Timestamp'", "'@Decimal'", "'@applicationId'", "':'", "'@moduleName'", "'@version'", "'.'", "'-'", "'@import'", "'@model'", "'{'", "'}'", "'@enum'", "'@entity'", "'@List'", "'<'", "'>'", "'@exceptions'", "'@exception'", "'@msg'", "'@service'", "'@operation'", "'@input'", "'@output'", "','", "'@authenticated'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_COMMENTS=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalSOAParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSOAParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSOAParser.tokenNames; }
    public String getGrammarFileName() { return "../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g"; }


     
     	private SOAGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SOAGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleArchitecture"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:60:1: entryRuleArchitecture : ruleArchitecture EOF ;
    public final void entryRuleArchitecture() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:61:1: ( ruleArchitecture EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:62:1: ruleArchitecture EOF
            {
             before(grammarAccess.getArchitectureRule()); 
            pushFollow(FOLLOW_ruleArchitecture_in_entryRuleArchitecture61);
            ruleArchitecture();

            state._fsp--;

             after(grammarAccess.getArchitectureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitecture68); 

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
    // $ANTLR end "entryRuleArchitecture"


    // $ANTLR start "ruleArchitecture"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:69:1: ruleArchitecture : ( ( rule__Architecture__Group__0 ) ) ;
    public final void ruleArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:73:2: ( ( ( rule__Architecture__Group__0 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:74:1: ( ( rule__Architecture__Group__0 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:74:1: ( ( rule__Architecture__Group__0 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:75:1: ( rule__Architecture__Group__0 )
            {
             before(grammarAccess.getArchitectureAccess().getGroup()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:76:1: ( rule__Architecture__Group__0 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:76:2: rule__Architecture__Group__0
            {
            pushFollow(FOLLOW_rule__Architecture__Group__0_in_ruleArchitecture94);
            rule__Architecture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getGroup()); 

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
    // $ANTLR end "ruleArchitecture"


    // $ANTLR start "entryRuleModule"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:88:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:89:1: ( ruleModule EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:90:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule121);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule128); 

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:97:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:101:2: ( ( ( rule__Module__Group__0 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:102:1: ( ( rule__Module__Group__0 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:102:1: ( ( rule__Module__Group__0 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:103:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:104:1: ( rule__Module__Group__0 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:104:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_rule__Module__Group__0_in_ruleModule154);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:116:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:117:1: ( ruleQualifiedName EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:118:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName181);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName188); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:125:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:129:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:130:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:130:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:131:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:132:1: ( rule__QualifiedName__Group__0 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:132:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName214);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleVersion"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:144:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:145:1: ( ruleVersion EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:146:1: ruleVersion EOF
            {
             before(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion241);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getVersionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion248); 

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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:153:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:157:2: ( ( ( rule__Version__Group__0 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:158:1: ( ( rule__Version__Group__0 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:158:1: ( ( rule__Version__Group__0 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:159:1: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:160:1: ( rule__Version__Group__0 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:160:2: rule__Version__Group__0
            {
            pushFollow(FOLLOW_rule__Version__Group__0_in_ruleVersion274);
            rule__Version__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getGroup()); 

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
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleImport"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:172:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:173:1: ( ruleImport EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:174:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport301);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport308); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:181:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:185:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:186:1: ( ( rule__Import__Group__0 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:186:1: ( ( rule__Import__Group__0 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:187:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:188:1: ( rule__Import__Group__0 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:188:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport334);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleModel"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:200:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:201:1: ( ruleModel EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:202:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel361);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel368); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:209:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:213:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:214:1: ( ( rule__Model__Group__0 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:214:1: ( ( rule__Model__Group__0 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:215:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:216:1: ( rule__Model__Group__0 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:216:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel394);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleComment"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:228:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:229:1: ( ruleComment EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:230:1: ruleComment EOF
            {
             before(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment421);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getCommentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment428); 

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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:237:1: ruleComment : ( ( rule__Comment__ValueAssignment ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:241:2: ( ( ( rule__Comment__ValueAssignment ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:242:1: ( ( rule__Comment__ValueAssignment ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:242:1: ( ( rule__Comment__ValueAssignment ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:243:1: ( rule__Comment__ValueAssignment )
            {
             before(grammarAccess.getCommentAccess().getValueAssignment()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:244:1: ( rule__Comment__ValueAssignment )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:244:2: rule__Comment__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Comment__ValueAssignment_in_ruleComment454);
            rule__Comment__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleEntities"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:256:1: entryRuleEntities : ruleEntities EOF ;
    public final void entryRuleEntities() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:257:1: ( ruleEntities EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:258:1: ruleEntities EOF
            {
             before(grammarAccess.getEntitiesRule()); 
            pushFollow(FOLLOW_ruleEntities_in_entryRuleEntities481);
            ruleEntities();

            state._fsp--;

             after(grammarAccess.getEntitiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntities488); 

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
    // $ANTLR end "entryRuleEntities"


    // $ANTLR start "ruleEntities"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:265:1: ruleEntities : ( ( rule__Entities__Alternatives ) ) ;
    public final void ruleEntities() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:269:2: ( ( ( rule__Entities__Alternatives ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:270:1: ( ( rule__Entities__Alternatives ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:270:1: ( ( rule__Entities__Alternatives ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:271:1: ( rule__Entities__Alternatives )
            {
             before(grammarAccess.getEntitiesAccess().getAlternatives()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:272:1: ( rule__Entities__Alternatives )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:272:2: rule__Entities__Alternatives
            {
            pushFollow(FOLLOW_rule__Entities__Alternatives_in_ruleEntities514);
            rule__Entities__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntitiesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEntities"


    // $ANTLR start "entryRuleEnum"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:284:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:285:1: ( ruleEnum EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:286:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum541);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum548); 

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:293:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:297:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:298:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:298:1: ( ( rule__Enum__Group__0 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:299:1: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:300:1: ( rule__Enum__Group__0 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:300:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum574);
            rule__Enum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getGroup()); 

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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEntity"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:312:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:313:1: ( ruleEntity EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:314:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity601);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity608); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:321:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:325:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:326:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:326:1: ( ( rule__Entity__Group__0 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:327:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:328:1: ( rule__Entity__Group__0 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:328:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity634);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:340:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:341:1: ( ruleFeature EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:342:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature661);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature668); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:349:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:353:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:354:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:354:1: ( ( rule__Feature__Group__0 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:355:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:356:1: ( rule__Feature__Group__0 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:356:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature694);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleFeatureType"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:368:1: entryRuleFeatureType : ruleFeatureType EOF ;
    public final void entryRuleFeatureType() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:369:1: ( ruleFeatureType EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:370:1: ruleFeatureType EOF
            {
             before(grammarAccess.getFeatureTypeRule()); 
            pushFollow(FOLLOW_ruleFeatureType_in_entryRuleFeatureType721);
            ruleFeatureType();

            state._fsp--;

             after(grammarAccess.getFeatureTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureType728); 

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
    // $ANTLR end "entryRuleFeatureType"


    // $ANTLR start "ruleFeatureType"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:377:1: ruleFeatureType : ( ( rule__FeatureType__Alternatives ) ) ;
    public final void ruleFeatureType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:381:2: ( ( ( rule__FeatureType__Alternatives ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:382:1: ( ( rule__FeatureType__Alternatives ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:382:1: ( ( rule__FeatureType__Alternatives ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:383:1: ( rule__FeatureType__Alternatives )
            {
             before(grammarAccess.getFeatureTypeAccess().getAlternatives()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:384:1: ( rule__FeatureType__Alternatives )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:384:2: rule__FeatureType__Alternatives
            {
            pushFollow(FOLLOW_rule__FeatureType__Alternatives_in_ruleFeatureType754);
            rule__FeatureType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFeatureType"


    // $ANTLR start "entryRuleEntitiesFeature"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:396:1: entryRuleEntitiesFeature : ruleEntitiesFeature EOF ;
    public final void entryRuleEntitiesFeature() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:397:1: ( ruleEntitiesFeature EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:398:1: ruleEntitiesFeature EOF
            {
             before(grammarAccess.getEntitiesFeatureRule()); 
            pushFollow(FOLLOW_ruleEntitiesFeature_in_entryRuleEntitiesFeature781);
            ruleEntitiesFeature();

            state._fsp--;

             after(grammarAccess.getEntitiesFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntitiesFeature788); 

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
    // $ANTLR end "entryRuleEntitiesFeature"


    // $ANTLR start "ruleEntitiesFeature"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:405:1: ruleEntitiesFeature : ( ( rule__EntitiesFeature__TypeAssignment ) ) ;
    public final void ruleEntitiesFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:409:2: ( ( ( rule__EntitiesFeature__TypeAssignment ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:410:1: ( ( rule__EntitiesFeature__TypeAssignment ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:410:1: ( ( rule__EntitiesFeature__TypeAssignment ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:411:1: ( rule__EntitiesFeature__TypeAssignment )
            {
             before(grammarAccess.getEntitiesFeatureAccess().getTypeAssignment()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:412:1: ( rule__EntitiesFeature__TypeAssignment )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:412:2: rule__EntitiesFeature__TypeAssignment
            {
            pushFollow(FOLLOW_rule__EntitiesFeature__TypeAssignment_in_ruleEntitiesFeature814);
            rule__EntitiesFeature__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEntitiesFeatureAccess().getTypeAssignment()); 

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
    // $ANTLR end "ruleEntitiesFeature"


    // $ANTLR start "entryRulePrimitiveFeature"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:424:1: entryRulePrimitiveFeature : rulePrimitiveFeature EOF ;
    public final void entryRulePrimitiveFeature() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:425:1: ( rulePrimitiveFeature EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:426:1: rulePrimitiveFeature EOF
            {
             before(grammarAccess.getPrimitiveFeatureRule()); 
            pushFollow(FOLLOW_rulePrimitiveFeature_in_entryRulePrimitiveFeature841);
            rulePrimitiveFeature();

            state._fsp--;

             after(grammarAccess.getPrimitiveFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveFeature848); 

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
    // $ANTLR end "entryRulePrimitiveFeature"


    // $ANTLR start "rulePrimitiveFeature"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:433:1: rulePrimitiveFeature : ( ( rule__PrimitiveFeature__TypeAssignment ) ) ;
    public final void rulePrimitiveFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:437:2: ( ( ( rule__PrimitiveFeature__TypeAssignment ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:438:1: ( ( rule__PrimitiveFeature__TypeAssignment ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:438:1: ( ( rule__PrimitiveFeature__TypeAssignment ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:439:1: ( rule__PrimitiveFeature__TypeAssignment )
            {
             before(grammarAccess.getPrimitiveFeatureAccess().getTypeAssignment()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:440:1: ( rule__PrimitiveFeature__TypeAssignment )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:440:2: rule__PrimitiveFeature__TypeAssignment
            {
            pushFollow(FOLLOW_rule__PrimitiveFeature__TypeAssignment_in_rulePrimitiveFeature874);
            rule__PrimitiveFeature__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveFeatureAccess().getTypeAssignment()); 

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
    // $ANTLR end "rulePrimitiveFeature"


    // $ANTLR start "entryRuleGenericListFeature"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:452:1: entryRuleGenericListFeature : ruleGenericListFeature EOF ;
    public final void entryRuleGenericListFeature() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:453:1: ( ruleGenericListFeature EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:454:1: ruleGenericListFeature EOF
            {
             before(grammarAccess.getGenericListFeatureRule()); 
            pushFollow(FOLLOW_ruleGenericListFeature_in_entryRuleGenericListFeature901);
            ruleGenericListFeature();

            state._fsp--;

             after(grammarAccess.getGenericListFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericListFeature908); 

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
    // $ANTLR end "entryRuleGenericListFeature"


    // $ANTLR start "ruleGenericListFeature"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:461:1: ruleGenericListFeature : ( ( rule__GenericListFeature__Group__0 ) ) ;
    public final void ruleGenericListFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:465:2: ( ( ( rule__GenericListFeature__Group__0 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:466:1: ( ( rule__GenericListFeature__Group__0 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:466:1: ( ( rule__GenericListFeature__Group__0 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:467:1: ( rule__GenericListFeature__Group__0 )
            {
             before(grammarAccess.getGenericListFeatureAccess().getGroup()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:468:1: ( rule__GenericListFeature__Group__0 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:468:2: rule__GenericListFeature__Group__0
            {
            pushFollow(FOLLOW_rule__GenericListFeature__Group__0_in_ruleGenericListFeature934);
            rule__GenericListFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGenericListFeatureAccess().getGroup()); 

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
    // $ANTLR end "ruleGenericListFeature"


    // $ANTLR start "entryRuleExceptions"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:480:1: entryRuleExceptions : ruleExceptions EOF ;
    public final void entryRuleExceptions() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:481:1: ( ruleExceptions EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:482:1: ruleExceptions EOF
            {
             before(grammarAccess.getExceptionsRule()); 
            pushFollow(FOLLOW_ruleExceptions_in_entryRuleExceptions961);
            ruleExceptions();

            state._fsp--;

             after(grammarAccess.getExceptionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptions968); 

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
    // $ANTLR end "entryRuleExceptions"


    // $ANTLR start "ruleExceptions"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:489:1: ruleExceptions : ( ( rule__Exceptions__Group__0 ) ) ;
    public final void ruleExceptions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:493:2: ( ( ( rule__Exceptions__Group__0 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:494:1: ( ( rule__Exceptions__Group__0 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:494:1: ( ( rule__Exceptions__Group__0 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:495:1: ( rule__Exceptions__Group__0 )
            {
             before(grammarAccess.getExceptionsAccess().getGroup()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:496:1: ( rule__Exceptions__Group__0 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:496:2: rule__Exceptions__Group__0
            {
            pushFollow(FOLLOW_rule__Exceptions__Group__0_in_ruleExceptions994);
            rule__Exceptions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExceptionsAccess().getGroup()); 

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
    // $ANTLR end "ruleExceptions"


    // $ANTLR start "entryRuleException"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:508:1: entryRuleException : ruleException EOF ;
    public final void entryRuleException() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:509:1: ( ruleException EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:510:1: ruleException EOF
            {
             before(grammarAccess.getExceptionRule()); 
            pushFollow(FOLLOW_ruleException_in_entryRuleException1021);
            ruleException();

            state._fsp--;

             after(grammarAccess.getExceptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleException1028); 

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
    // $ANTLR end "entryRuleException"


    // $ANTLR start "ruleException"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:517:1: ruleException : ( ( rule__Exception__Group__0 ) ) ;
    public final void ruleException() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:521:2: ( ( ( rule__Exception__Group__0 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:522:1: ( ( rule__Exception__Group__0 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:522:1: ( ( rule__Exception__Group__0 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:523:1: ( rule__Exception__Group__0 )
            {
             before(grammarAccess.getExceptionAccess().getGroup()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:524:1: ( rule__Exception__Group__0 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:524:2: rule__Exception__Group__0
            {
            pushFollow(FOLLOW_rule__Exception__Group__0_in_ruleException1054);
            rule__Exception__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExceptionAccess().getGroup()); 

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
    // $ANTLR end "ruleException"


    // $ANTLR start "entryRuleService"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:536:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:537:1: ( ruleService EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:538:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService1081);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService1088); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:545:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:549:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:550:1: ( ( rule__Service__Group__0 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:550:1: ( ( rule__Service__Group__0 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:551:1: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:552:1: ( rule__Service__Group__0 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:552:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService1114);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleOperation"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:564:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:565:1: ( ruleOperation EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:566:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation1141);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation1148); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:573:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:577:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:578:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:578:1: ( ( rule__Operation__Group__0 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:579:1: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:580:1: ( rule__Operation__Group__0 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:580:2: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_rule__Operation__Group__0_in_ruleOperation1174);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "rulePrimitiveType"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:593:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:597:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:598:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:598:1: ( ( rule__PrimitiveType__Alternatives ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:599:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:600:1: ( rule__PrimitiveType__Alternatives )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:600:2: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType1211);
            rule__PrimitiveType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "rule__Entities__Alternatives"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:611:1: rule__Entities__Alternatives : ( ( ruleEntity ) | ( ruleEnum ) );
    public final void rule__Entities__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:615:1: ( ( ruleEntity ) | ( ruleEnum ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==35) ) {
                alt1=1;
            }
            else if ( (LA1_0==34) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:616:1: ( ruleEntity )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:616:1: ( ruleEntity )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:617:1: ruleEntity
                    {
                     before(grammarAccess.getEntitiesAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Entities__Alternatives1246);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getEntitiesAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:622:6: ( ruleEnum )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:622:6: ( ruleEnum )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:623:1: ruleEnum
                    {
                     before(grammarAccess.getEntitiesAccess().getEnumParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnum_in_rule__Entities__Alternatives1263);
                    ruleEnum();

                    state._fsp--;

                     after(grammarAccess.getEntitiesAccess().getEnumParserRuleCall_1()); 

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
    // $ANTLR end "rule__Entities__Alternatives"


    // $ANTLR start "rule__FeatureType__Alternatives"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:633:1: rule__FeatureType__Alternatives : ( ( ruleEntitiesFeature ) | ( rulePrimitiveFeature ) | ( ruleGenericListFeature ) );
    public final void rule__FeatureType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:637:1: ( ( ruleEntitiesFeature ) | ( rulePrimitiveFeature ) | ( ruleGenericListFeature ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                {
                alt2=2;
                }
                break;
            case 36:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:638:1: ( ruleEntitiesFeature )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:638:1: ( ruleEntitiesFeature )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:639:1: ruleEntitiesFeature
                    {
                     before(grammarAccess.getFeatureTypeAccess().getEntitiesFeatureParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntitiesFeature_in_rule__FeatureType__Alternatives1295);
                    ruleEntitiesFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureTypeAccess().getEntitiesFeatureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:644:6: ( rulePrimitiveFeature )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:644:6: ( rulePrimitiveFeature )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:645:1: rulePrimitiveFeature
                    {
                     before(grammarAccess.getFeatureTypeAccess().getPrimitiveFeatureParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePrimitiveFeature_in_rule__FeatureType__Alternatives1312);
                    rulePrimitiveFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureTypeAccess().getPrimitiveFeatureParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:650:6: ( ruleGenericListFeature )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:650:6: ( ruleGenericListFeature )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:651:1: ruleGenericListFeature
                    {
                     before(grammarAccess.getFeatureTypeAccess().getGenericListFeatureParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGenericListFeature_in_rule__FeatureType__Alternatives1329);
                    ruleGenericListFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureTypeAccess().getGenericListFeatureParserRuleCall_2()); 

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
    // $ANTLR end "rule__FeatureType__Alternatives"


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:661:1: rule__PrimitiveType__Alternatives : ( ( ( '@String' ) ) | ( ( '@Short' ) ) | ( ( '@Integer' ) ) | ( ( '@Long' ) ) | ( ( '@Float' ) ) | ( ( '@Double' ) ) | ( ( '@Boolean' ) ) | ( ( '@Byte' ) ) | ( ( '@Date' ) ) | ( ( '@Datetime' ) ) | ( ( '@Timestamp' ) ) | ( ( '@Decimal' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:665:1: ( ( ( '@String' ) ) | ( ( '@Short' ) ) | ( ( '@Integer' ) ) | ( ( '@Long' ) ) | ( ( '@Float' ) ) | ( ( '@Double' ) ) | ( ( '@Boolean' ) ) | ( ( '@Byte' ) ) | ( ( '@Date' ) ) | ( ( '@Datetime' ) ) | ( ( '@Timestamp' ) ) | ( ( '@Decimal' ) ) )
            int alt3=12;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            case 18:
                {
                alt3=7;
                }
                break;
            case 19:
                {
                alt3=8;
                }
                break;
            case 20:
                {
                alt3=9;
                }
                break;
            case 21:
                {
                alt3=10;
                }
                break;
            case 22:
                {
                alt3=11;
                }
                break;
            case 23:
                {
                alt3=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:666:1: ( ( '@String' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:666:1: ( ( '@String' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:667:1: ( '@String' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:668:1: ( '@String' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:668:3: '@String'
                    {
                    match(input,12,FOLLOW_12_in_rule__PrimitiveType__Alternatives1362); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:673:6: ( ( '@Short' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:673:6: ( ( '@Short' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:674:1: ( '@Short' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getShortEnumLiteralDeclaration_1()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:675:1: ( '@Short' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:675:3: '@Short'
                    {
                    match(input,13,FOLLOW_13_in_rule__PrimitiveType__Alternatives1383); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getShortEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:680:6: ( ( '@Integer' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:680:6: ( ( '@Integer' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:681:1: ( '@Integer' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getIntegerEnumLiteralDeclaration_2()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:682:1: ( '@Integer' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:682:3: '@Integer'
                    {
                    match(input,14,FOLLOW_14_in_rule__PrimitiveType__Alternatives1404); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getIntegerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:687:6: ( ( '@Long' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:687:6: ( ( '@Long' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:688:1: ( '@Long' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getLongEnumLiteralDeclaration_3()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:689:1: ( '@Long' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:689:3: '@Long'
                    {
                    match(input,15,FOLLOW_15_in_rule__PrimitiveType__Alternatives1425); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getLongEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:694:6: ( ( '@Float' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:694:6: ( ( '@Float' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:695:1: ( '@Float' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getFloatEnumLiteralDeclaration_4()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:696:1: ( '@Float' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:696:3: '@Float'
                    {
                    match(input,16,FOLLOW_16_in_rule__PrimitiveType__Alternatives1446); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getFloatEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:701:6: ( ( '@Double' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:701:6: ( ( '@Double' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:702:1: ( '@Double' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDoubleEnumLiteralDeclaration_5()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:703:1: ( '@Double' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:703:3: '@Double'
                    {
                    match(input,17,FOLLOW_17_in_rule__PrimitiveType__Alternatives1467); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getDoubleEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:708:6: ( ( '@Boolean' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:708:6: ( ( '@Boolean' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:709:1: ( '@Boolean' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_6()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:710:1: ( '@Boolean' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:710:3: '@Boolean'
                    {
                    match(input,18,FOLLOW_18_in_rule__PrimitiveType__Alternatives1488); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:715:6: ( ( '@Byte' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:715:6: ( ( '@Byte' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:716:1: ( '@Byte' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getByteEnumLiteralDeclaration_7()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:717:1: ( '@Byte' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:717:3: '@Byte'
                    {
                    match(input,19,FOLLOW_19_in_rule__PrimitiveType__Alternatives1509); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getByteEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:722:6: ( ( '@Date' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:722:6: ( ( '@Date' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:723:1: ( '@Date' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDateEnumLiteralDeclaration_8()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:724:1: ( '@Date' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:724:3: '@Date'
                    {
                    match(input,20,FOLLOW_20_in_rule__PrimitiveType__Alternatives1530); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getDateEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:729:6: ( ( '@Datetime' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:729:6: ( ( '@Datetime' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:730:1: ( '@Datetime' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDatetimeEnumLiteralDeclaration_9()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:731:1: ( '@Datetime' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:731:3: '@Datetime'
                    {
                    match(input,21,FOLLOW_21_in_rule__PrimitiveType__Alternatives1551); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getDatetimeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:736:6: ( ( '@Timestamp' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:736:6: ( ( '@Timestamp' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:737:1: ( '@Timestamp' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getTimestampEnumLiteralDeclaration_10()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:738:1: ( '@Timestamp' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:738:3: '@Timestamp'
                    {
                    match(input,22,FOLLOW_22_in_rule__PrimitiveType__Alternatives1572); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getTimestampEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:743:6: ( ( '@Decimal' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:743:6: ( ( '@Decimal' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:744:1: ( '@Decimal' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDecimalEnumLiteralDeclaration_11()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:745:1: ( '@Decimal' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:745:3: '@Decimal'
                    {
                    match(input,23,FOLLOW_23_in_rule__PrimitiveType__Alternatives1593); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getDecimalEnumLiteralDeclaration_11()); 

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
    // $ANTLR end "rule__PrimitiveType__Alternatives"


    // $ANTLR start "rule__Architecture__Group__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:757:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:761:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:762:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
            {
            pushFollow(FOLLOW_rule__Architecture__Group__0__Impl_in_rule__Architecture__Group__01626);
            rule__Architecture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Architecture__Group__1_in_rule__Architecture__Group__01629);
            rule__Architecture__Group__1();

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
    // $ANTLR end "rule__Architecture__Group__0"


    // $ANTLR start "rule__Architecture__Group__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:769:1: rule__Architecture__Group__0__Impl : ( '@applicationId' ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:773:1: ( ( '@applicationId' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:774:1: ( '@applicationId' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:774:1: ( '@applicationId' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:775:1: '@applicationId'
            {
             before(grammarAccess.getArchitectureAccess().getApplicationIdKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Architecture__Group__0__Impl1657); 
             after(grammarAccess.getArchitectureAccess().getApplicationIdKeyword_0()); 

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
    // $ANTLR end "rule__Architecture__Group__0__Impl"


    // $ANTLR start "rule__Architecture__Group__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:788:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:792:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:793:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
            {
            pushFollow(FOLLOW_rule__Architecture__Group__1__Impl_in_rule__Architecture__Group__11688);
            rule__Architecture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Architecture__Group__2_in_rule__Architecture__Group__11691);
            rule__Architecture__Group__2();

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
    // $ANTLR end "rule__Architecture__Group__1"


    // $ANTLR start "rule__Architecture__Group__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:800:1: rule__Architecture__Group__1__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:804:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:805:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:805:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:806:1: ':'
            {
             before(grammarAccess.getArchitectureAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Architecture__Group__1__Impl1719); 
             after(grammarAccess.getArchitectureAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Architecture__Group__1__Impl"


    // $ANTLR start "rule__Architecture__Group__2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:819:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl rule__Architecture__Group__3 ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:823:1: ( rule__Architecture__Group__2__Impl rule__Architecture__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:824:2: rule__Architecture__Group__2__Impl rule__Architecture__Group__3
            {
            pushFollow(FOLLOW_rule__Architecture__Group__2__Impl_in_rule__Architecture__Group__21750);
            rule__Architecture__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Architecture__Group__3_in_rule__Architecture__Group__21753);
            rule__Architecture__Group__3();

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
    // $ANTLR end "rule__Architecture__Group__2"


    // $ANTLR start "rule__Architecture__Group__2__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:831:1: rule__Architecture__Group__2__Impl : ( ( rule__Architecture__NameAssignment_2 ) ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:835:1: ( ( ( rule__Architecture__NameAssignment_2 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:836:1: ( ( rule__Architecture__NameAssignment_2 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:836:1: ( ( rule__Architecture__NameAssignment_2 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:837:1: ( rule__Architecture__NameAssignment_2 )
            {
             before(grammarAccess.getArchitectureAccess().getNameAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:838:1: ( rule__Architecture__NameAssignment_2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:838:2: rule__Architecture__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Architecture__NameAssignment_2_in_rule__Architecture__Group__2__Impl1780);
            rule__Architecture__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Architecture__Group__2__Impl"


    // $ANTLR start "rule__Architecture__Group__3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:848:1: rule__Architecture__Group__3 : rule__Architecture__Group__3__Impl ;
    public final void rule__Architecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:852:1: ( rule__Architecture__Group__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:853:2: rule__Architecture__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Architecture__Group__3__Impl_in_rule__Architecture__Group__31810);
            rule__Architecture__Group__3__Impl();

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
    // $ANTLR end "rule__Architecture__Group__3"


    // $ANTLR start "rule__Architecture__Group__3__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:859:1: rule__Architecture__Group__3__Impl : ( ( rule__Architecture__ModuleAssignment_3 ) ) ;
    public final void rule__Architecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:863:1: ( ( ( rule__Architecture__ModuleAssignment_3 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:864:1: ( ( rule__Architecture__ModuleAssignment_3 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:864:1: ( ( rule__Architecture__ModuleAssignment_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:865:1: ( rule__Architecture__ModuleAssignment_3 )
            {
             before(grammarAccess.getArchitectureAccess().getModuleAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:866:1: ( rule__Architecture__ModuleAssignment_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:866:2: rule__Architecture__ModuleAssignment_3
            {
            pushFollow(FOLLOW_rule__Architecture__ModuleAssignment_3_in_rule__Architecture__Group__3__Impl1837);
            rule__Architecture__ModuleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArchitectureAccess().getModuleAssignment_3()); 

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
    // $ANTLR end "rule__Architecture__Group__3__Impl"


    // $ANTLR start "rule__Module__Group__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:884:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:888:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:889:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__01875);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__01878);
            rule__Module__Group__1();

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
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:896:1: rule__Module__Group__0__Impl : ( '@moduleName' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:900:1: ( ( '@moduleName' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:901:1: ( '@moduleName' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:901:1: ( '@moduleName' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:902:1: '@moduleName'
            {
             before(grammarAccess.getModuleAccess().getModuleNameKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Module__Group__0__Impl1906); 
             after(grammarAccess.getModuleAccess().getModuleNameKeyword_0()); 

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
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:915:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:919:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:920:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__11937);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__11940);
            rule__Module__Group__2();

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
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:927:1: rule__Module__Group__1__Impl : ( ':' ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:931:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:932:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:932:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:933:1: ':'
            {
             before(grammarAccess.getModuleAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Module__Group__1__Impl1968); 
             after(grammarAccess.getModuleAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:946:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:950:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:951:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21999);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__3_in_rule__Module__Group__22002);
            rule__Module__Group__3();

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
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:958:1: rule__Module__Group__2__Impl : ( ( rule__Module__NameAssignment_2 ) ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:962:1: ( ( ( rule__Module__NameAssignment_2 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:963:1: ( ( rule__Module__NameAssignment_2 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:963:1: ( ( rule__Module__NameAssignment_2 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:964:1: ( rule__Module__NameAssignment_2 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:965:1: ( rule__Module__NameAssignment_2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:965:2: rule__Module__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl2029);
            rule__Module__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:975:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:979:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:980:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__32059);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__4_in_rule__Module__Group__32062);
            rule__Module__Group__4();

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
    // $ANTLR end "rule__Module__Group__3"


    // $ANTLR start "rule__Module__Group__3__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:987:1: rule__Module__Group__3__Impl : ( '@version' ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:991:1: ( ( '@version' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:992:1: ( '@version' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:992:1: ( '@version' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:993:1: '@version'
            {
             before(grammarAccess.getModuleAccess().getVersionKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__Module__Group__3__Impl2090); 
             after(grammarAccess.getModuleAccess().getVersionKeyword_3()); 

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
    // $ANTLR end "rule__Module__Group__3__Impl"


    // $ANTLR start "rule__Module__Group__4"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1006:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1010:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1011:2: rule__Module__Group__4__Impl rule__Module__Group__5
            {
            pushFollow(FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__42121);
            rule__Module__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__5_in_rule__Module__Group__42124);
            rule__Module__Group__5();

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
    // $ANTLR end "rule__Module__Group__4"


    // $ANTLR start "rule__Module__Group__4__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1018:1: rule__Module__Group__4__Impl : ( ':' ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1022:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1023:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1023:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1024:1: ':'
            {
             before(grammarAccess.getModuleAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Module__Group__4__Impl2152); 
             after(grammarAccess.getModuleAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__Module__Group__4__Impl"


    // $ANTLR start "rule__Module__Group__5"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1037:1: rule__Module__Group__5 : rule__Module__Group__5__Impl rule__Module__Group__6 ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1041:1: ( rule__Module__Group__5__Impl rule__Module__Group__6 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1042:2: rule__Module__Group__5__Impl rule__Module__Group__6
            {
            pushFollow(FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__52183);
            rule__Module__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__6_in_rule__Module__Group__52186);
            rule__Module__Group__6();

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
    // $ANTLR end "rule__Module__Group__5"


    // $ANTLR start "rule__Module__Group__5__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1049:1: rule__Module__Group__5__Impl : ( ( rule__Module__VersionAssignment_5 ) ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1053:1: ( ( ( rule__Module__VersionAssignment_5 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1054:1: ( ( rule__Module__VersionAssignment_5 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1054:1: ( ( rule__Module__VersionAssignment_5 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1055:1: ( rule__Module__VersionAssignment_5 )
            {
             before(grammarAccess.getModuleAccess().getVersionAssignment_5()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1056:1: ( rule__Module__VersionAssignment_5 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1056:2: rule__Module__VersionAssignment_5
            {
            pushFollow(FOLLOW_rule__Module__VersionAssignment_5_in_rule__Module__Group__5__Impl2213);
            rule__Module__VersionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getVersionAssignment_5()); 

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
    // $ANTLR end "rule__Module__Group__5__Impl"


    // $ANTLR start "rule__Module__Group__6"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1066:1: rule__Module__Group__6 : rule__Module__Group__6__Impl rule__Module__Group__7 ;
    public final void rule__Module__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1070:1: ( rule__Module__Group__6__Impl rule__Module__Group__7 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1071:2: rule__Module__Group__6__Impl rule__Module__Group__7
            {
            pushFollow(FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__62243);
            rule__Module__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__7_in_rule__Module__Group__62246);
            rule__Module__Group__7();

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
    // $ANTLR end "rule__Module__Group__6"


    // $ANTLR start "rule__Module__Group__6__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1078:1: rule__Module__Group__6__Impl : ( ( rule__Module__ImportsAssignment_6 )* ) ;
    public final void rule__Module__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1082:1: ( ( ( rule__Module__ImportsAssignment_6 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1083:1: ( ( rule__Module__ImportsAssignment_6 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1083:1: ( ( rule__Module__ImportsAssignment_6 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1084:1: ( rule__Module__ImportsAssignment_6 )*
            {
             before(grammarAccess.getModuleAccess().getImportsAssignment_6()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1085:1: ( rule__Module__ImportsAssignment_6 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==30) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1085:2: rule__Module__ImportsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Module__ImportsAssignment_6_in_rule__Module__Group__6__Impl2273);
            	    rule__Module__ImportsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getImportsAssignment_6()); 

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
    // $ANTLR end "rule__Module__Group__6__Impl"


    // $ANTLR start "rule__Module__Group__7"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1095:1: rule__Module__Group__7 : rule__Module__Group__7__Impl rule__Module__Group__8 ;
    public final void rule__Module__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1099:1: ( rule__Module__Group__7__Impl rule__Module__Group__8 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1100:2: rule__Module__Group__7__Impl rule__Module__Group__8
            {
            pushFollow(FOLLOW_rule__Module__Group__7__Impl_in_rule__Module__Group__72304);
            rule__Module__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__8_in_rule__Module__Group__72307);
            rule__Module__Group__8();

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
    // $ANTLR end "rule__Module__Group__7"


    // $ANTLR start "rule__Module__Group__7__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1107:1: rule__Module__Group__7__Impl : ( ( rule__Module__ModelAssignment_7 )? ) ;
    public final void rule__Module__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1111:1: ( ( ( rule__Module__ModelAssignment_7 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1112:1: ( ( rule__Module__ModelAssignment_7 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1112:1: ( ( rule__Module__ModelAssignment_7 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1113:1: ( rule__Module__ModelAssignment_7 )?
            {
             before(grammarAccess.getModuleAccess().getModelAssignment_7()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1114:1: ( rule__Module__ModelAssignment_7 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1114:2: rule__Module__ModelAssignment_7
                    {
                    pushFollow(FOLLOW_rule__Module__ModelAssignment_7_in_rule__Module__Group__7__Impl2334);
                    rule__Module__ModelAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getModelAssignment_7()); 

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
    // $ANTLR end "rule__Module__Group__7__Impl"


    // $ANTLR start "rule__Module__Group__8"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1124:1: rule__Module__Group__8 : rule__Module__Group__8__Impl rule__Module__Group__9 ;
    public final void rule__Module__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1128:1: ( rule__Module__Group__8__Impl rule__Module__Group__9 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1129:2: rule__Module__Group__8__Impl rule__Module__Group__9
            {
            pushFollow(FOLLOW_rule__Module__Group__8__Impl_in_rule__Module__Group__82365);
            rule__Module__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__9_in_rule__Module__Group__82368);
            rule__Module__Group__9();

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
    // $ANTLR end "rule__Module__Group__8"


    // $ANTLR start "rule__Module__Group__8__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1136:1: rule__Module__Group__8__Impl : ( ( rule__Module__ExceptionsAssignment_8 )? ) ;
    public final void rule__Module__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1140:1: ( ( ( rule__Module__ExceptionsAssignment_8 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1141:1: ( ( rule__Module__ExceptionsAssignment_8 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1141:1: ( ( rule__Module__ExceptionsAssignment_8 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1142:1: ( rule__Module__ExceptionsAssignment_8 )?
            {
             before(grammarAccess.getModuleAccess().getExceptionsAssignment_8()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1143:1: ( rule__Module__ExceptionsAssignment_8 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==39) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1143:2: rule__Module__ExceptionsAssignment_8
                    {
                    pushFollow(FOLLOW_rule__Module__ExceptionsAssignment_8_in_rule__Module__Group__8__Impl2395);
                    rule__Module__ExceptionsAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getExceptionsAssignment_8()); 

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
    // $ANTLR end "rule__Module__Group__8__Impl"


    // $ANTLR start "rule__Module__Group__9"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1153:1: rule__Module__Group__9 : rule__Module__Group__9__Impl ;
    public final void rule__Module__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1157:1: ( rule__Module__Group__9__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1158:2: rule__Module__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__9__Impl_in_rule__Module__Group__92426);
            rule__Module__Group__9__Impl();

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
    // $ANTLR end "rule__Module__Group__9"


    // $ANTLR start "rule__Module__Group__9__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1164:1: rule__Module__Group__9__Impl : ( ( rule__Module__ServicesAssignment_9 )* ) ;
    public final void rule__Module__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1168:1: ( ( ( rule__Module__ServicesAssignment_9 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1169:1: ( ( rule__Module__ServicesAssignment_9 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1169:1: ( ( rule__Module__ServicesAssignment_9 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1170:1: ( rule__Module__ServicesAssignment_9 )*
            {
             before(grammarAccess.getModuleAccess().getServicesAssignment_9()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1171:1: ( rule__Module__ServicesAssignment_9 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==42) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1171:2: rule__Module__ServicesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Module__ServicesAssignment_9_in_rule__Module__Group__9__Impl2453);
            	    rule__Module__ServicesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getServicesAssignment_9()); 

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
    // $ANTLR end "rule__Module__Group__9__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1201:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1205:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1206:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02504);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02507);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1213:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1217:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1218:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1218:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1219:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2534); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1230:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1234:1: ( rule__QualifiedName__Group__1__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1235:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12563);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1241:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1245:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1246:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1246:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1247:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1248:1: ( rule__QualifiedName__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1248:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2590);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1262:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1266:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1267:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02625);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02628);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1274:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1278:1: ( ( '.' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1279:1: ( '.' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1279:1: ( '.' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1280:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__QualifiedName__Group_1__0__Impl2656); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1293:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1297:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1298:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12687);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1304:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1308:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1309:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1309:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1310:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2714); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Version__Group__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1325:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1329:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1330:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__02747);
            rule__Version__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group__1_in_rule__Version__Group__02750);
            rule__Version__Group__1();

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
    // $ANTLR end "rule__Version__Group__0"


    // $ANTLR start "rule__Version__Group__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1337:1: rule__Version__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1341:1: ( ( RULE_INT ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1342:1: ( RULE_INT )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1342:1: ( RULE_INT )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1343:1: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Version__Group__0__Impl2777); 
             after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Version__Group__0__Impl"


    // $ANTLR start "rule__Version__Group__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1354:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1358:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1359:2: rule__Version__Group__1__Impl rule__Version__Group__2
            {
            pushFollow(FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__12806);
            rule__Version__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group__2_in_rule__Version__Group__12809);
            rule__Version__Group__2();

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
    // $ANTLR end "rule__Version__Group__1"


    // $ANTLR start "rule__Version__Group__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1366:1: rule__Version__Group__1__Impl : ( '.' ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1370:1: ( ( '.' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1371:1: ( '.' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1371:1: ( '.' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1372:1: '.'
            {
             before(grammarAccess.getVersionAccess().getFullStopKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__Version__Group__1__Impl2837); 
             after(grammarAccess.getVersionAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__Version__Group__1__Impl"


    // $ANTLR start "rule__Version__Group__2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1385:1: rule__Version__Group__2 : rule__Version__Group__2__Impl rule__Version__Group__3 ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1389:1: ( rule__Version__Group__2__Impl rule__Version__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1390:2: rule__Version__Group__2__Impl rule__Version__Group__3
            {
            pushFollow(FOLLOW_rule__Version__Group__2__Impl_in_rule__Version__Group__22868);
            rule__Version__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group__3_in_rule__Version__Group__22871);
            rule__Version__Group__3();

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
    // $ANTLR end "rule__Version__Group__2"


    // $ANTLR start "rule__Version__Group__2__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1397:1: rule__Version__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1401:1: ( ( RULE_INT ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1402:1: ( RULE_INT )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1402:1: ( RULE_INT )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1403:1: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Version__Group__2__Impl2898); 
             after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Version__Group__2__Impl"


    // $ANTLR start "rule__Version__Group__3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1414:1: rule__Version__Group__3 : rule__Version__Group__3__Impl rule__Version__Group__4 ;
    public final void rule__Version__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1418:1: ( rule__Version__Group__3__Impl rule__Version__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1419:2: rule__Version__Group__3__Impl rule__Version__Group__4
            {
            pushFollow(FOLLOW_rule__Version__Group__3__Impl_in_rule__Version__Group__32927);
            rule__Version__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group__4_in_rule__Version__Group__32930);
            rule__Version__Group__4();

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
    // $ANTLR end "rule__Version__Group__3"


    // $ANTLR start "rule__Version__Group__3__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1426:1: rule__Version__Group__3__Impl : ( '.' ) ;
    public final void rule__Version__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1430:1: ( ( '.' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1431:1: ( '.' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1431:1: ( '.' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1432:1: '.'
            {
             before(grammarAccess.getVersionAccess().getFullStopKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__Version__Group__3__Impl2958); 
             after(grammarAccess.getVersionAccess().getFullStopKeyword_3()); 

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
    // $ANTLR end "rule__Version__Group__3__Impl"


    // $ANTLR start "rule__Version__Group__4"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1445:1: rule__Version__Group__4 : rule__Version__Group__4__Impl rule__Version__Group__5 ;
    public final void rule__Version__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1449:1: ( rule__Version__Group__4__Impl rule__Version__Group__5 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1450:2: rule__Version__Group__4__Impl rule__Version__Group__5
            {
            pushFollow(FOLLOW_rule__Version__Group__4__Impl_in_rule__Version__Group__42989);
            rule__Version__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group__5_in_rule__Version__Group__42992);
            rule__Version__Group__5();

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
    // $ANTLR end "rule__Version__Group__4"


    // $ANTLR start "rule__Version__Group__4__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1457:1: rule__Version__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1461:1: ( ( RULE_INT ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1462:1: ( RULE_INT )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1462:1: ( RULE_INT )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1463:1: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Version__Group__4__Impl3019); 
             after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Version__Group__4__Impl"


    // $ANTLR start "rule__Version__Group__5"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1474:1: rule__Version__Group__5 : rule__Version__Group__5__Impl ;
    public final void rule__Version__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1478:1: ( rule__Version__Group__5__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1479:2: rule__Version__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group__5__Impl_in_rule__Version__Group__53048);
            rule__Version__Group__5__Impl();

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
    // $ANTLR end "rule__Version__Group__5"


    // $ANTLR start "rule__Version__Group__5__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1485:1: rule__Version__Group__5__Impl : ( ( rule__Version__Group_5__0 )? ) ;
    public final void rule__Version__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1489:1: ( ( ( rule__Version__Group_5__0 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1490:1: ( ( rule__Version__Group_5__0 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1490:1: ( ( rule__Version__Group_5__0 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1491:1: ( rule__Version__Group_5__0 )?
            {
             before(grammarAccess.getVersionAccess().getGroup_5()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1492:1: ( rule__Version__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1492:2: rule__Version__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Version__Group_5__0_in_rule__Version__Group__5__Impl3075);
                    rule__Version__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVersionAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Version__Group__5__Impl"


    // $ANTLR start "rule__Version__Group_5__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1514:1: rule__Version__Group_5__0 : rule__Version__Group_5__0__Impl rule__Version__Group_5__1 ;
    public final void rule__Version__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1518:1: ( rule__Version__Group_5__0__Impl rule__Version__Group_5__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1519:2: rule__Version__Group_5__0__Impl rule__Version__Group_5__1
            {
            pushFollow(FOLLOW_rule__Version__Group_5__0__Impl_in_rule__Version__Group_5__03118);
            rule__Version__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group_5__1_in_rule__Version__Group_5__03121);
            rule__Version__Group_5__1();

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
    // $ANTLR end "rule__Version__Group_5__0"


    // $ANTLR start "rule__Version__Group_5__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1526:1: rule__Version__Group_5__0__Impl : ( '-' ) ;
    public final void rule__Version__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1530:1: ( ( '-' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1531:1: ( '-' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1531:1: ( '-' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1532:1: '-'
            {
             before(grammarAccess.getVersionAccess().getHyphenMinusKeyword_5_0()); 
            match(input,29,FOLLOW_29_in_rule__Version__Group_5__0__Impl3149); 
             after(grammarAccess.getVersionAccess().getHyphenMinusKeyword_5_0()); 

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
    // $ANTLR end "rule__Version__Group_5__0__Impl"


    // $ANTLR start "rule__Version__Group_5__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1545:1: rule__Version__Group_5__1 : rule__Version__Group_5__1__Impl ;
    public final void rule__Version__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1549:1: ( rule__Version__Group_5__1__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1550:2: rule__Version__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group_5__1__Impl_in_rule__Version__Group_5__13180);
            rule__Version__Group_5__1__Impl();

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
    // $ANTLR end "rule__Version__Group_5__1"


    // $ANTLR start "rule__Version__Group_5__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1556:1: rule__Version__Group_5__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1560:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1561:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1561:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1562:1: RULE_ID
            {
             before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_5_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Version__Group_5__1__Impl3207); 
             after(grammarAccess.getVersionAccess().getIDTerminalRuleCall_5_1()); 

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
    // $ANTLR end "rule__Version__Group_5__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1577:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1581:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1582:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03240);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03243);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1589:1: rule__Import__Group__0__Impl : ( '@import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1593:1: ( ( '@import' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1594:1: ( '@import' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1594:1: ( '@import' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1595:1: '@import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Import__Group__0__Impl3271); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1608:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1612:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1613:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13302);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__2_in_rule__Import__Group__13305);
            rule__Import__Group__2();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1620:1: rule__Import__Group__1__Impl : ( ':' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1624:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1625:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1625:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1626:1: ':'
            {
             before(grammarAccess.getImportAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Import__Group__1__Impl3333); 
             after(grammarAccess.getImportAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1639:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1643:1: ( rule__Import__Group__2__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1644:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__23364);
            rule__Import__Group__2__Impl();

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
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1650:1: rule__Import__Group__2__Impl : ( ( rule__Import__ImportedNamespaceAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1654:1: ( ( ( rule__Import__ImportedNamespaceAssignment_2 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1655:1: ( ( rule__Import__ImportedNamespaceAssignment_2 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1655:1: ( ( rule__Import__ImportedNamespaceAssignment_2 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1656:1: ( rule__Import__ImportedNamespaceAssignment_2 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1657:1: ( rule__Import__ImportedNamespaceAssignment_2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1657:2: rule__Import__ImportedNamespaceAssignment_2
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_2_in_rule__Import__Group__2__Impl3391);
            rule__Import__ImportedNamespaceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_2()); 

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
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1673:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1677:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1678:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03427);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03430);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1685:1: rule__Model__Group__0__Impl : ( '@model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1689:1: ( ( '@model' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1690:1: ( '@model' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1690:1: ( '@model' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1691:1: '@model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Model__Group__0__Impl3458); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1704:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1708:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1709:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13489);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13492);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1716:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1720:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1721:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1721:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1722:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Model__Group__1__Impl3520); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1735:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1739:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1740:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23551);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__23554);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1747:1: rule__Model__Group__2__Impl : ( ( ( rule__Model__EntitiesAssignment_2 ) ) ( ( rule__Model__EntitiesAssignment_2 )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1751:1: ( ( ( ( rule__Model__EntitiesAssignment_2 ) ) ( ( rule__Model__EntitiesAssignment_2 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1752:1: ( ( ( rule__Model__EntitiesAssignment_2 ) ) ( ( rule__Model__EntitiesAssignment_2 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1752:1: ( ( ( rule__Model__EntitiesAssignment_2 ) ) ( ( rule__Model__EntitiesAssignment_2 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1753:1: ( ( rule__Model__EntitiesAssignment_2 ) ) ( ( rule__Model__EntitiesAssignment_2 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1753:1: ( ( rule__Model__EntitiesAssignment_2 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1754:1: ( rule__Model__EntitiesAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1755:1: ( rule__Model__EntitiesAssignment_2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1755:2: rule__Model__EntitiesAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__EntitiesAssignment_2_in_rule__Model__Group__2__Impl3583);
            rule__Model__EntitiesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getEntitiesAssignment_2()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1758:1: ( ( rule__Model__EntitiesAssignment_2 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1759:1: ( rule__Model__EntitiesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1760:1: ( rule__Model__EntitiesAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=34 && LA10_0<=35)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1760:2: rule__Model__EntitiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__EntitiesAssignment_2_in_rule__Model__Group__2__Impl3595);
            	    rule__Model__EntitiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEntitiesAssignment_2()); 

            }


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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1771:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1775:1: ( rule__Model__Group__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1776:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33628);
            rule__Model__Group__3__Impl();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1782:1: rule__Model__Group__3__Impl : ( '}' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1786:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1787:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1787:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1788:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__Model__Group__3__Impl3656); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1809:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1813:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1814:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__03695);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__03698);
            rule__Enum__Group__1();

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
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1821:1: rule__Enum__Group__0__Impl : ( '@enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1825:1: ( ( '@enum' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1826:1: ( '@enum' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1826:1: ( '@enum' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1827:1: '@enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Enum__Group__0__Impl3726); 
             after(grammarAccess.getEnumAccess().getEnumKeyword_0()); 

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
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1840:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1844:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1845:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__13757);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__13760);
            rule__Enum__Group__2();

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
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1852:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1856:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1857:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1857:1: ( ( rule__Enum__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1858:1: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1859:1: ( rule__Enum__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1859:2: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl3787);
            rule__Enum__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Enum__Group__2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1869:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1873:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1874:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__23817);
            rule__Enum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__23820);
            rule__Enum__Group__3();

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
    // $ANTLR end "rule__Enum__Group__2"


    // $ANTLR start "rule__Enum__Group__2__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1881:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1885:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1886:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1886:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1887:1: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Enum__Group__2__Impl3848); 
             after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Enum__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group__3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1900:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1904:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1905:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__33879);
            rule__Enum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__33882);
            rule__Enum__Group__4();

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
    // $ANTLR end "rule__Enum__Group__3"


    // $ANTLR start "rule__Enum__Group__3__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1912:1: rule__Enum__Group__3__Impl : ( ( ( rule__Enum__FeaturesAssignment_3 ) ) ( ( rule__Enum__FeaturesAssignment_3 )* ) ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1916:1: ( ( ( ( rule__Enum__FeaturesAssignment_3 ) ) ( ( rule__Enum__FeaturesAssignment_3 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1917:1: ( ( ( rule__Enum__FeaturesAssignment_3 ) ) ( ( rule__Enum__FeaturesAssignment_3 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1917:1: ( ( ( rule__Enum__FeaturesAssignment_3 ) ) ( ( rule__Enum__FeaturesAssignment_3 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1918:1: ( ( rule__Enum__FeaturesAssignment_3 ) ) ( ( rule__Enum__FeaturesAssignment_3 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1918:1: ( ( rule__Enum__FeaturesAssignment_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1919:1: ( rule__Enum__FeaturesAssignment_3 )
            {
             before(grammarAccess.getEnumAccess().getFeaturesAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1920:1: ( rule__Enum__FeaturesAssignment_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1920:2: rule__Enum__FeaturesAssignment_3
            {
            pushFollow(FOLLOW_rule__Enum__FeaturesAssignment_3_in_rule__Enum__Group__3__Impl3911);
            rule__Enum__FeaturesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getFeaturesAssignment_3()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1923:1: ( ( rule__Enum__FeaturesAssignment_3 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1924:1: ( rule__Enum__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getEnumAccess().getFeaturesAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1925:1: ( rule__Enum__FeaturesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1925:2: rule__Enum__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enum__FeaturesAssignment_3_in_rule__Enum__Group__3__Impl3923);
            	    rule__Enum__FeaturesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEnumAccess().getFeaturesAssignment_3()); 

            }


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
    // $ANTLR end "rule__Enum__Group__3__Impl"


    // $ANTLR start "rule__Enum__Group__4"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1936:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1940:1: ( rule__Enum__Group__4__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1941:2: rule__Enum__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__43956);
            rule__Enum__Group__4__Impl();

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
    // $ANTLR end "rule__Enum__Group__4"


    // $ANTLR start "rule__Enum__Group__4__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1947:1: rule__Enum__Group__4__Impl : ( '}' ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1951:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1952:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1952:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1953:1: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__Enum__Group__4__Impl3984); 
             after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Enum__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1976:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1980:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1981:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__04025);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__04028);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1988:1: rule__Entity__Group__0__Impl : ( '@entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1992:1: ( ( '@entity' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1993:1: ( '@entity' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1993:1: ( '@entity' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1994:1: '@entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Entity__Group__0__Impl4056); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2007:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2011:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2012:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__14087);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__14090);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2019:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2023:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2024:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2024:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2025:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2026:1: ( rule__Entity__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2026:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl4117);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2036:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2040:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2041:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__24147);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__24150);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2048:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2052:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2053:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2053:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2054:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Entity__Group__2__Impl4178); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2067:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2071:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2072:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__34209);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__34212);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2079:1: rule__Entity__Group__3__Impl : ( ( ( rule__Entity__FeaturesAssignment_3 ) ) ( ( rule__Entity__FeaturesAssignment_3 )* ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2083:1: ( ( ( ( rule__Entity__FeaturesAssignment_3 ) ) ( ( rule__Entity__FeaturesAssignment_3 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2084:1: ( ( ( rule__Entity__FeaturesAssignment_3 ) ) ( ( rule__Entity__FeaturesAssignment_3 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2084:1: ( ( ( rule__Entity__FeaturesAssignment_3 ) ) ( ( rule__Entity__FeaturesAssignment_3 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2085:1: ( ( rule__Entity__FeaturesAssignment_3 ) ) ( ( rule__Entity__FeaturesAssignment_3 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2085:1: ( ( rule__Entity__FeaturesAssignment_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2086:1: ( rule__Entity__FeaturesAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2087:1: ( rule__Entity__FeaturesAssignment_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2087:2: rule__Entity__FeaturesAssignment_3
            {
            pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl4241);
            rule__Entity__FeaturesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2090:1: ( ( rule__Entity__FeaturesAssignment_3 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2091:1: ( rule__Entity__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2092:1: ( rule__Entity__FeaturesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==RULE_COMMENTS) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2092:2: rule__Entity__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl4253);
            	    rule__Entity__FeaturesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); 

            }


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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2103:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2107:1: ( rule__Entity__Group__4__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2108:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__44286);
            rule__Entity__Group__4__Impl();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2114:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2118:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2119:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2119:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2120:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__Entity__Group__4__Impl4314); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2143:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2147:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2148:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__04355);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__04358);
            rule__Feature__Group__1();

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
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2155:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__FeatureCommentAssignment_0 )* ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2159:1: ( ( ( rule__Feature__FeatureCommentAssignment_0 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2160:1: ( ( rule__Feature__FeatureCommentAssignment_0 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2160:1: ( ( rule__Feature__FeatureCommentAssignment_0 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2161:1: ( rule__Feature__FeatureCommentAssignment_0 )*
            {
             before(grammarAccess.getFeatureAccess().getFeatureCommentAssignment_0()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2162:1: ( rule__Feature__FeatureCommentAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_COMMENTS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2162:2: rule__Feature__FeatureCommentAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Feature__FeatureCommentAssignment_0_in_rule__Feature__Group__0__Impl4385);
            	    rule__Feature__FeatureCommentAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getFeatureCommentAssignment_0()); 

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
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2172:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2176:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2177:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__14416);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__14419);
            rule__Feature__Group__2();

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
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2184:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2188:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2189:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2189:1: ( ( rule__Feature__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2190:1: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2191:1: ( rule__Feature__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2191:2: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl4446);
            rule__Feature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2201:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2205:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2206:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__24476);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__24479);
            rule__Feature__Group__3();

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
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2213:1: rule__Feature__Group__2__Impl : ( ':' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2217:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2218:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2218:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2219:1: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Feature__Group__2__Impl4507); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2232:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2236:1: ( rule__Feature__Group__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2237:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__34538);
            rule__Feature__Group__3__Impl();

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
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2243:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2247:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2248:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2248:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2249:1: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2250:1: ( rule__Feature__TypeAssignment_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2250:2: rule__Feature__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl4565);
            rule__Feature__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__GenericListFeature__Group__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2268:1: rule__GenericListFeature__Group__0 : rule__GenericListFeature__Group__0__Impl rule__GenericListFeature__Group__1 ;
    public final void rule__GenericListFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2272:1: ( rule__GenericListFeature__Group__0__Impl rule__GenericListFeature__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2273:2: rule__GenericListFeature__Group__0__Impl rule__GenericListFeature__Group__1
            {
            pushFollow(FOLLOW_rule__GenericListFeature__Group__0__Impl_in_rule__GenericListFeature__Group__04603);
            rule__GenericListFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericListFeature__Group__1_in_rule__GenericListFeature__Group__04606);
            rule__GenericListFeature__Group__1();

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
    // $ANTLR end "rule__GenericListFeature__Group__0"


    // $ANTLR start "rule__GenericListFeature__Group__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2280:1: rule__GenericListFeature__Group__0__Impl : ( '@List' ) ;
    public final void rule__GenericListFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2284:1: ( ( '@List' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2285:1: ( '@List' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2285:1: ( '@List' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2286:1: '@List'
            {
             before(grammarAccess.getGenericListFeatureAccess().getListKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__GenericListFeature__Group__0__Impl4634); 
             after(grammarAccess.getGenericListFeatureAccess().getListKeyword_0()); 

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
    // $ANTLR end "rule__GenericListFeature__Group__0__Impl"


    // $ANTLR start "rule__GenericListFeature__Group__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2299:1: rule__GenericListFeature__Group__1 : rule__GenericListFeature__Group__1__Impl rule__GenericListFeature__Group__2 ;
    public final void rule__GenericListFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2303:1: ( rule__GenericListFeature__Group__1__Impl rule__GenericListFeature__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2304:2: rule__GenericListFeature__Group__1__Impl rule__GenericListFeature__Group__2
            {
            pushFollow(FOLLOW_rule__GenericListFeature__Group__1__Impl_in_rule__GenericListFeature__Group__14665);
            rule__GenericListFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericListFeature__Group__2_in_rule__GenericListFeature__Group__14668);
            rule__GenericListFeature__Group__2();

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
    // $ANTLR end "rule__GenericListFeature__Group__1"


    // $ANTLR start "rule__GenericListFeature__Group__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2311:1: rule__GenericListFeature__Group__1__Impl : ( '<' ) ;
    public final void rule__GenericListFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2315:1: ( ( '<' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2316:1: ( '<' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2316:1: ( '<' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2317:1: '<'
            {
             before(grammarAccess.getGenericListFeatureAccess().getLessThanSignKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__GenericListFeature__Group__1__Impl4696); 
             after(grammarAccess.getGenericListFeatureAccess().getLessThanSignKeyword_1()); 

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
    // $ANTLR end "rule__GenericListFeature__Group__1__Impl"


    // $ANTLR start "rule__GenericListFeature__Group__2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2330:1: rule__GenericListFeature__Group__2 : rule__GenericListFeature__Group__2__Impl rule__GenericListFeature__Group__3 ;
    public final void rule__GenericListFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2334:1: ( rule__GenericListFeature__Group__2__Impl rule__GenericListFeature__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2335:2: rule__GenericListFeature__Group__2__Impl rule__GenericListFeature__Group__3
            {
            pushFollow(FOLLOW_rule__GenericListFeature__Group__2__Impl_in_rule__GenericListFeature__Group__24727);
            rule__GenericListFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericListFeature__Group__3_in_rule__GenericListFeature__Group__24730);
            rule__GenericListFeature__Group__3();

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
    // $ANTLR end "rule__GenericListFeature__Group__2"


    // $ANTLR start "rule__GenericListFeature__Group__2__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2342:1: rule__GenericListFeature__Group__2__Impl : ( ( rule__GenericListFeature__TypeAssignment_2 ) ) ;
    public final void rule__GenericListFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2346:1: ( ( ( rule__GenericListFeature__TypeAssignment_2 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2347:1: ( ( rule__GenericListFeature__TypeAssignment_2 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2347:1: ( ( rule__GenericListFeature__TypeAssignment_2 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2348:1: ( rule__GenericListFeature__TypeAssignment_2 )
            {
             before(grammarAccess.getGenericListFeatureAccess().getTypeAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2349:1: ( rule__GenericListFeature__TypeAssignment_2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2349:2: rule__GenericListFeature__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__GenericListFeature__TypeAssignment_2_in_rule__GenericListFeature__Group__2__Impl4757);
            rule__GenericListFeature__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGenericListFeatureAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__GenericListFeature__Group__2__Impl"


    // $ANTLR start "rule__GenericListFeature__Group__3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2359:1: rule__GenericListFeature__Group__3 : rule__GenericListFeature__Group__3__Impl ;
    public final void rule__GenericListFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2363:1: ( rule__GenericListFeature__Group__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2364:2: rule__GenericListFeature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GenericListFeature__Group__3__Impl_in_rule__GenericListFeature__Group__34787);
            rule__GenericListFeature__Group__3__Impl();

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
    // $ANTLR end "rule__GenericListFeature__Group__3"


    // $ANTLR start "rule__GenericListFeature__Group__3__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2370:1: rule__GenericListFeature__Group__3__Impl : ( '>' ) ;
    public final void rule__GenericListFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2374:1: ( ( '>' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2375:1: ( '>' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2375:1: ( '>' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2376:1: '>'
            {
             before(grammarAccess.getGenericListFeatureAccess().getGreaterThanSignKeyword_3()); 
            match(input,38,FOLLOW_38_in_rule__GenericListFeature__Group__3__Impl4815); 
             after(grammarAccess.getGenericListFeatureAccess().getGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__GenericListFeature__Group__3__Impl"


    // $ANTLR start "rule__Exceptions__Group__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2397:1: rule__Exceptions__Group__0 : rule__Exceptions__Group__0__Impl rule__Exceptions__Group__1 ;
    public final void rule__Exceptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2401:1: ( rule__Exceptions__Group__0__Impl rule__Exceptions__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2402:2: rule__Exceptions__Group__0__Impl rule__Exceptions__Group__1
            {
            pushFollow(FOLLOW_rule__Exceptions__Group__0__Impl_in_rule__Exceptions__Group__04854);
            rule__Exceptions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exceptions__Group__1_in_rule__Exceptions__Group__04857);
            rule__Exceptions__Group__1();

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
    // $ANTLR end "rule__Exceptions__Group__0"


    // $ANTLR start "rule__Exceptions__Group__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2409:1: rule__Exceptions__Group__0__Impl : ( '@exceptions' ) ;
    public final void rule__Exceptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2413:1: ( ( '@exceptions' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2414:1: ( '@exceptions' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2414:1: ( '@exceptions' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2415:1: '@exceptions'
            {
             before(grammarAccess.getExceptionsAccess().getExceptionsKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Exceptions__Group__0__Impl4885); 
             after(grammarAccess.getExceptionsAccess().getExceptionsKeyword_0()); 

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
    // $ANTLR end "rule__Exceptions__Group__0__Impl"


    // $ANTLR start "rule__Exceptions__Group__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2428:1: rule__Exceptions__Group__1 : rule__Exceptions__Group__1__Impl rule__Exceptions__Group__2 ;
    public final void rule__Exceptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2432:1: ( rule__Exceptions__Group__1__Impl rule__Exceptions__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2433:2: rule__Exceptions__Group__1__Impl rule__Exceptions__Group__2
            {
            pushFollow(FOLLOW_rule__Exceptions__Group__1__Impl_in_rule__Exceptions__Group__14916);
            rule__Exceptions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exceptions__Group__2_in_rule__Exceptions__Group__14919);
            rule__Exceptions__Group__2();

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
    // $ANTLR end "rule__Exceptions__Group__1"


    // $ANTLR start "rule__Exceptions__Group__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2440:1: rule__Exceptions__Group__1__Impl : ( '{' ) ;
    public final void rule__Exceptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2444:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2445:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2445:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2446:1: '{'
            {
             before(grammarAccess.getExceptionsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Exceptions__Group__1__Impl4947); 
             after(grammarAccess.getExceptionsAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Exceptions__Group__1__Impl"


    // $ANTLR start "rule__Exceptions__Group__2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2459:1: rule__Exceptions__Group__2 : rule__Exceptions__Group__2__Impl rule__Exceptions__Group__3 ;
    public final void rule__Exceptions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2463:1: ( rule__Exceptions__Group__2__Impl rule__Exceptions__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2464:2: rule__Exceptions__Group__2__Impl rule__Exceptions__Group__3
            {
            pushFollow(FOLLOW_rule__Exceptions__Group__2__Impl_in_rule__Exceptions__Group__24978);
            rule__Exceptions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exceptions__Group__3_in_rule__Exceptions__Group__24981);
            rule__Exceptions__Group__3();

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
    // $ANTLR end "rule__Exceptions__Group__2"


    // $ANTLR start "rule__Exceptions__Group__2__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2471:1: rule__Exceptions__Group__2__Impl : ( ( ( rule__Exceptions__ExceptionsAssignment_2 ) ) ( ( rule__Exceptions__ExceptionsAssignment_2 )* ) ) ;
    public final void rule__Exceptions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2475:1: ( ( ( ( rule__Exceptions__ExceptionsAssignment_2 ) ) ( ( rule__Exceptions__ExceptionsAssignment_2 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2476:1: ( ( ( rule__Exceptions__ExceptionsAssignment_2 ) ) ( ( rule__Exceptions__ExceptionsAssignment_2 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2476:1: ( ( ( rule__Exceptions__ExceptionsAssignment_2 ) ) ( ( rule__Exceptions__ExceptionsAssignment_2 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2477:1: ( ( rule__Exceptions__ExceptionsAssignment_2 ) ) ( ( rule__Exceptions__ExceptionsAssignment_2 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2477:1: ( ( rule__Exceptions__ExceptionsAssignment_2 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2478:1: ( rule__Exceptions__ExceptionsAssignment_2 )
            {
             before(grammarAccess.getExceptionsAccess().getExceptionsAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2479:1: ( rule__Exceptions__ExceptionsAssignment_2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2479:2: rule__Exceptions__ExceptionsAssignment_2
            {
            pushFollow(FOLLOW_rule__Exceptions__ExceptionsAssignment_2_in_rule__Exceptions__Group__2__Impl5010);
            rule__Exceptions__ExceptionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExceptionsAccess().getExceptionsAssignment_2()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2482:1: ( ( rule__Exceptions__ExceptionsAssignment_2 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2483:1: ( rule__Exceptions__ExceptionsAssignment_2 )*
            {
             before(grammarAccess.getExceptionsAccess().getExceptionsAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2484:1: ( rule__Exceptions__ExceptionsAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==40) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2484:2: rule__Exceptions__ExceptionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Exceptions__ExceptionsAssignment_2_in_rule__Exceptions__Group__2__Impl5022);
            	    rule__Exceptions__ExceptionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getExceptionsAccess().getExceptionsAssignment_2()); 

            }


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
    // $ANTLR end "rule__Exceptions__Group__2__Impl"


    // $ANTLR start "rule__Exceptions__Group__3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2495:1: rule__Exceptions__Group__3 : rule__Exceptions__Group__3__Impl ;
    public final void rule__Exceptions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2499:1: ( rule__Exceptions__Group__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2500:2: rule__Exceptions__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Exceptions__Group__3__Impl_in_rule__Exceptions__Group__35055);
            rule__Exceptions__Group__3__Impl();

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
    // $ANTLR end "rule__Exceptions__Group__3"


    // $ANTLR start "rule__Exceptions__Group__3__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2506:1: rule__Exceptions__Group__3__Impl : ( '}' ) ;
    public final void rule__Exceptions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2510:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2511:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2511:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2512:1: '}'
            {
             before(grammarAccess.getExceptionsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__Exceptions__Group__3__Impl5083); 
             after(grammarAccess.getExceptionsAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Exceptions__Group__3__Impl"


    // $ANTLR start "rule__Exception__Group__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2533:1: rule__Exception__Group__0 : rule__Exception__Group__0__Impl rule__Exception__Group__1 ;
    public final void rule__Exception__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2537:1: ( rule__Exception__Group__0__Impl rule__Exception__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2538:2: rule__Exception__Group__0__Impl rule__Exception__Group__1
            {
            pushFollow(FOLLOW_rule__Exception__Group__0__Impl_in_rule__Exception__Group__05122);
            rule__Exception__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__1_in_rule__Exception__Group__05125);
            rule__Exception__Group__1();

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
    // $ANTLR end "rule__Exception__Group__0"


    // $ANTLR start "rule__Exception__Group__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2545:1: rule__Exception__Group__0__Impl : ( '@exception' ) ;
    public final void rule__Exception__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2549:1: ( ( '@exception' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2550:1: ( '@exception' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2550:1: ( '@exception' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2551:1: '@exception'
            {
             before(grammarAccess.getExceptionAccess().getExceptionKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Exception__Group__0__Impl5153); 
             after(grammarAccess.getExceptionAccess().getExceptionKeyword_0()); 

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
    // $ANTLR end "rule__Exception__Group__0__Impl"


    // $ANTLR start "rule__Exception__Group__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2564:1: rule__Exception__Group__1 : rule__Exception__Group__1__Impl rule__Exception__Group__2 ;
    public final void rule__Exception__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2568:1: ( rule__Exception__Group__1__Impl rule__Exception__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2569:2: rule__Exception__Group__1__Impl rule__Exception__Group__2
            {
            pushFollow(FOLLOW_rule__Exception__Group__1__Impl_in_rule__Exception__Group__15184);
            rule__Exception__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__2_in_rule__Exception__Group__15187);
            rule__Exception__Group__2();

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
    // $ANTLR end "rule__Exception__Group__1"


    // $ANTLR start "rule__Exception__Group__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2576:1: rule__Exception__Group__1__Impl : ( ( rule__Exception__NameAssignment_1 ) ) ;
    public final void rule__Exception__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2580:1: ( ( ( rule__Exception__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2581:1: ( ( rule__Exception__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2581:1: ( ( rule__Exception__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2582:1: ( rule__Exception__NameAssignment_1 )
            {
             before(grammarAccess.getExceptionAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2583:1: ( rule__Exception__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2583:2: rule__Exception__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Exception__NameAssignment_1_in_rule__Exception__Group__1__Impl5214);
            rule__Exception__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExceptionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Exception__Group__1__Impl"


    // $ANTLR start "rule__Exception__Group__2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2593:1: rule__Exception__Group__2 : rule__Exception__Group__2__Impl rule__Exception__Group__3 ;
    public final void rule__Exception__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2597:1: ( rule__Exception__Group__2__Impl rule__Exception__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2598:2: rule__Exception__Group__2__Impl rule__Exception__Group__3
            {
            pushFollow(FOLLOW_rule__Exception__Group__2__Impl_in_rule__Exception__Group__25244);
            rule__Exception__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__3_in_rule__Exception__Group__25247);
            rule__Exception__Group__3();

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
    // $ANTLR end "rule__Exception__Group__2"


    // $ANTLR start "rule__Exception__Group__2__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2605:1: rule__Exception__Group__2__Impl : ( '{' ) ;
    public final void rule__Exception__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2609:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2610:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2610:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2611:1: '{'
            {
             before(grammarAccess.getExceptionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Exception__Group__2__Impl5275); 
             after(grammarAccess.getExceptionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Exception__Group__2__Impl"


    // $ANTLR start "rule__Exception__Group__3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2624:1: rule__Exception__Group__3 : rule__Exception__Group__3__Impl rule__Exception__Group__4 ;
    public final void rule__Exception__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2628:1: ( rule__Exception__Group__3__Impl rule__Exception__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2629:2: rule__Exception__Group__3__Impl rule__Exception__Group__4
            {
            pushFollow(FOLLOW_rule__Exception__Group__3__Impl_in_rule__Exception__Group__35306);
            rule__Exception__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__4_in_rule__Exception__Group__35309);
            rule__Exception__Group__4();

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
    // $ANTLR end "rule__Exception__Group__3"


    // $ANTLR start "rule__Exception__Group__3__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2636:1: rule__Exception__Group__3__Impl : ( '@msg' ) ;
    public final void rule__Exception__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2640:1: ( ( '@msg' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2641:1: ( '@msg' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2641:1: ( '@msg' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2642:1: '@msg'
            {
             before(grammarAccess.getExceptionAccess().getMsgKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__Exception__Group__3__Impl5337); 
             after(grammarAccess.getExceptionAccess().getMsgKeyword_3()); 

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
    // $ANTLR end "rule__Exception__Group__3__Impl"


    // $ANTLR start "rule__Exception__Group__4"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2655:1: rule__Exception__Group__4 : rule__Exception__Group__4__Impl rule__Exception__Group__5 ;
    public final void rule__Exception__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2659:1: ( rule__Exception__Group__4__Impl rule__Exception__Group__5 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2660:2: rule__Exception__Group__4__Impl rule__Exception__Group__5
            {
            pushFollow(FOLLOW_rule__Exception__Group__4__Impl_in_rule__Exception__Group__45368);
            rule__Exception__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__5_in_rule__Exception__Group__45371);
            rule__Exception__Group__5();

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
    // $ANTLR end "rule__Exception__Group__4"


    // $ANTLR start "rule__Exception__Group__4__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2667:1: rule__Exception__Group__4__Impl : ( ':' ) ;
    public final void rule__Exception__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2671:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2672:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2672:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2673:1: ':'
            {
             before(grammarAccess.getExceptionAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Exception__Group__4__Impl5399); 
             after(grammarAccess.getExceptionAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__Exception__Group__4__Impl"


    // $ANTLR start "rule__Exception__Group__5"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2686:1: rule__Exception__Group__5 : rule__Exception__Group__5__Impl rule__Exception__Group__6 ;
    public final void rule__Exception__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2690:1: ( rule__Exception__Group__5__Impl rule__Exception__Group__6 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2691:2: rule__Exception__Group__5__Impl rule__Exception__Group__6
            {
            pushFollow(FOLLOW_rule__Exception__Group__5__Impl_in_rule__Exception__Group__55430);
            rule__Exception__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__6_in_rule__Exception__Group__55433);
            rule__Exception__Group__6();

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
    // $ANTLR end "rule__Exception__Group__5"


    // $ANTLR start "rule__Exception__Group__5__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2698:1: rule__Exception__Group__5__Impl : ( ( rule__Exception__MsgAssignment_5 ) ) ;
    public final void rule__Exception__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2702:1: ( ( ( rule__Exception__MsgAssignment_5 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2703:1: ( ( rule__Exception__MsgAssignment_5 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2703:1: ( ( rule__Exception__MsgAssignment_5 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2704:1: ( rule__Exception__MsgAssignment_5 )
            {
             before(grammarAccess.getExceptionAccess().getMsgAssignment_5()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2705:1: ( rule__Exception__MsgAssignment_5 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2705:2: rule__Exception__MsgAssignment_5
            {
            pushFollow(FOLLOW_rule__Exception__MsgAssignment_5_in_rule__Exception__Group__5__Impl5460);
            rule__Exception__MsgAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getExceptionAccess().getMsgAssignment_5()); 

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
    // $ANTLR end "rule__Exception__Group__5__Impl"


    // $ANTLR start "rule__Exception__Group__6"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2715:1: rule__Exception__Group__6 : rule__Exception__Group__6__Impl ;
    public final void rule__Exception__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2719:1: ( rule__Exception__Group__6__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2720:2: rule__Exception__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Exception__Group__6__Impl_in_rule__Exception__Group__65490);
            rule__Exception__Group__6__Impl();

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
    // $ANTLR end "rule__Exception__Group__6"


    // $ANTLR start "rule__Exception__Group__6__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2726:1: rule__Exception__Group__6__Impl : ( '}' ) ;
    public final void rule__Exception__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2730:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2731:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2731:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2732:1: '}'
            {
             before(grammarAccess.getExceptionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_33_in_rule__Exception__Group__6__Impl5518); 
             after(grammarAccess.getExceptionAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Exception__Group__6__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2759:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2763:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2764:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__05563);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__05566);
            rule__Service__Group__1();

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
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2771:1: rule__Service__Group__0__Impl : ( '@service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2775:1: ( ( '@service' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2776:1: ( '@service' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2776:1: ( '@service' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2777:1: '@service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Service__Group__0__Impl5594); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

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
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2790:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2794:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2795:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__15625);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__15628);
            rule__Service__Group__2();

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
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2802:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2806:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2807:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2807:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2808:1: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2809:1: ( rule__Service__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2809:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl5655);
            rule__Service__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2819:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2823:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2824:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__25685);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__25688);
            rule__Service__Group__3();

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
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2831:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2835:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2836:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2836:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2837:1: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Service__Group__2__Impl5716); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2850:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2854:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2855:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__35747);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__35750);
            rule__Service__Group__4();

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
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2862:1: rule__Service__Group__3__Impl : ( ( ( rule__Service__OperationsAssignment_3 ) ) ( ( rule__Service__OperationsAssignment_3 )* ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2866:1: ( ( ( ( rule__Service__OperationsAssignment_3 ) ) ( ( rule__Service__OperationsAssignment_3 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2867:1: ( ( ( rule__Service__OperationsAssignment_3 ) ) ( ( rule__Service__OperationsAssignment_3 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2867:1: ( ( ( rule__Service__OperationsAssignment_3 ) ) ( ( rule__Service__OperationsAssignment_3 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2868:1: ( ( rule__Service__OperationsAssignment_3 ) ) ( ( rule__Service__OperationsAssignment_3 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2868:1: ( ( rule__Service__OperationsAssignment_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2869:1: ( rule__Service__OperationsAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getOperationsAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2870:1: ( rule__Service__OperationsAssignment_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2870:2: rule__Service__OperationsAssignment_3
            {
            pushFollow(FOLLOW_rule__Service__OperationsAssignment_3_in_rule__Service__Group__3__Impl5779);
            rule__Service__OperationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getOperationsAssignment_3()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2873:1: ( ( rule__Service__OperationsAssignment_3 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2874:1: ( rule__Service__OperationsAssignment_3 )*
            {
             before(grammarAccess.getServiceAccess().getOperationsAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2875:1: ( rule__Service__OperationsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==43) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2875:2: rule__Service__OperationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Service__OperationsAssignment_3_in_rule__Service__Group__3__Impl5791);
            	    rule__Service__OperationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getOperationsAssignment_3()); 

            }


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
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2886:1: rule__Service__Group__4 : rule__Service__Group__4__Impl ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2890:1: ( rule__Service__Group__4__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2891:2: rule__Service__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__45824);
            rule__Service__Group__4__Impl();

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
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2897:1: rule__Service__Group__4__Impl : ( '}' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2901:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2902:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2902:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2903:1: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__Service__Group__4__Impl5852); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2926:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2930:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2931:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__05893);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__05896);
            rule__Operation__Group__1();

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
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2938:1: rule__Operation__Group__0__Impl : ( '@operation' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2942:1: ( ( '@operation' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2943:1: ( '@operation' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2943:1: ( '@operation' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2944:1: '@operation'
            {
             before(grammarAccess.getOperationAccess().getOperationKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__Operation__Group__0__Impl5924); 
             after(grammarAccess.getOperationAccess().getOperationKeyword_0()); 

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
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2957:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2961:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2962:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__15955);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__15958);
            rule__Operation__Group__2();

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
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2969:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2973:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2974:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2974:1: ( ( rule__Operation__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2975:1: ( rule__Operation__NameAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2976:1: ( rule__Operation__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2976:2: rule__Operation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl5985);
            rule__Operation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2986:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2990:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2991:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__26015);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__26018);
            rule__Operation__Group__3();

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
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2998:1: rule__Operation__Group__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3002:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3003:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3003:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3004:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Operation__Group__2__Impl6046); 
             after(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3017:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3021:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3022:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__36077);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__36080);
            rule__Operation__Group__4();

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
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3029:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__AuthenticatedAssignment_3 )? ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3033:1: ( ( ( rule__Operation__AuthenticatedAssignment_3 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3034:1: ( ( rule__Operation__AuthenticatedAssignment_3 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3034:1: ( ( rule__Operation__AuthenticatedAssignment_3 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3035:1: ( rule__Operation__AuthenticatedAssignment_3 )?
            {
             before(grammarAccess.getOperationAccess().getAuthenticatedAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3036:1: ( rule__Operation__AuthenticatedAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==47) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3036:2: rule__Operation__AuthenticatedAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Operation__AuthenticatedAssignment_3_in_rule__Operation__Group__3__Impl6107);
                    rule__Operation__AuthenticatedAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getAuthenticatedAssignment_3()); 

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
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3046:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3050:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3051:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__46138);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__46141);
            rule__Operation__Group__5();

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
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3058:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3062:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3063:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3063:1: ( ( rule__Operation__Group_4__0 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3064:1: ( rule__Operation__Group_4__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3065:1: ( rule__Operation__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==44) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3065:2: rule__Operation__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl6168);
                    rule__Operation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__5"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3075:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3079:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3080:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__56199);
            rule__Operation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__56202);
            rule__Operation__Group__6();

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
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3087:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__Group_5__0 )? ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3091:1: ( ( ( rule__Operation__Group_5__0 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3092:1: ( ( rule__Operation__Group_5__0 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3092:1: ( ( rule__Operation__Group_5__0 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3093:1: ( rule__Operation__Group_5__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_5()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3094:1: ( rule__Operation__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==45) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3094:2: rule__Operation__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl6229);
                    rule__Operation__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group__6"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3104:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl rule__Operation__Group__7 ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3108:1: ( rule__Operation__Group__6__Impl rule__Operation__Group__7 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3109:2: rule__Operation__Group__6__Impl rule__Operation__Group__7
            {
            pushFollow(FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__66260);
            rule__Operation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__7_in_rule__Operation__Group__66263);
            rule__Operation__Group__7();

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
    // $ANTLR end "rule__Operation__Group__6"


    // $ANTLR start "rule__Operation__Group__6__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3116:1: rule__Operation__Group__6__Impl : ( ( rule__Operation__Group_6__0 )? ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3120:1: ( ( ( rule__Operation__Group_6__0 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3121:1: ( ( rule__Operation__Group_6__0 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3121:1: ( ( rule__Operation__Group_6__0 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3122:1: ( rule__Operation__Group_6__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_6()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3123:1: ( rule__Operation__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3123:2: rule__Operation__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_6__0_in_rule__Operation__Group__6__Impl6290);
                    rule__Operation__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Operation__Group__6__Impl"


    // $ANTLR start "rule__Operation__Group__7"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3133:1: rule__Operation__Group__7 : rule__Operation__Group__7__Impl ;
    public final void rule__Operation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3137:1: ( rule__Operation__Group__7__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3138:2: rule__Operation__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__7__Impl_in_rule__Operation__Group__76321);
            rule__Operation__Group__7__Impl();

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
    // $ANTLR end "rule__Operation__Group__7"


    // $ANTLR start "rule__Operation__Group__7__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3144:1: rule__Operation__Group__7__Impl : ( '}' ) ;
    public final void rule__Operation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3148:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3149:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3149:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3150:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,33,FOLLOW_33_in_rule__Operation__Group__7__Impl6349); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Operation__Group__7__Impl"


    // $ANTLR start "rule__Operation__Group_4__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3179:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3183:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3184:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__06396);
            rule__Operation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__06399);
            rule__Operation__Group_4__1();

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
    // $ANTLR end "rule__Operation__Group_4__0"


    // $ANTLR start "rule__Operation__Group_4__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3191:1: rule__Operation__Group_4__0__Impl : ( '@input' ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3195:1: ( ( '@input' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3196:1: ( '@input' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3196:1: ( '@input' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3197:1: '@input'
            {
             before(grammarAccess.getOperationAccess().getInputKeyword_4_0()); 
            match(input,44,FOLLOW_44_in_rule__Operation__Group_4__0__Impl6427); 
             after(grammarAccess.getOperationAccess().getInputKeyword_4_0()); 

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
    // $ANTLR end "rule__Operation__Group_4__0__Impl"


    // $ANTLR start "rule__Operation__Group_4__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3210:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2 ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3214:1: ( rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3215:2: rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__16458);
            rule__Operation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__2_in_rule__Operation__Group_4__16461);
            rule__Operation__Group_4__2();

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
    // $ANTLR end "rule__Operation__Group_4__1"


    // $ANTLR start "rule__Operation__Group_4__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3222:1: rule__Operation__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3226:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3227:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3227:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3228:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_4_1()); 
            match(input,25,FOLLOW_25_in_rule__Operation__Group_4__1__Impl6489); 
             after(grammarAccess.getOperationAccess().getColonKeyword_4_1()); 

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
    // $ANTLR end "rule__Operation__Group_4__1__Impl"


    // $ANTLR start "rule__Operation__Group_4__2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3241:1: rule__Operation__Group_4__2 : rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3 ;
    public final void rule__Operation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3245:1: ( rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3246:2: rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__2__Impl_in_rule__Operation__Group_4__26520);
            rule__Operation__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__3_in_rule__Operation__Group_4__26523);
            rule__Operation__Group_4__3();

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
    // $ANTLR end "rule__Operation__Group_4__2"


    // $ANTLR start "rule__Operation__Group_4__2__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3253:1: rule__Operation__Group_4__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3257:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3258:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3258:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3259:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_4_2()); 
            match(input,32,FOLLOW_32_in_rule__Operation__Group_4__2__Impl6551); 
             after(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_4_2()); 

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
    // $ANTLR end "rule__Operation__Group_4__2__Impl"


    // $ANTLR start "rule__Operation__Group_4__3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3272:1: rule__Operation__Group_4__3 : rule__Operation__Group_4__3__Impl rule__Operation__Group_4__4 ;
    public final void rule__Operation__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3276:1: ( rule__Operation__Group_4__3__Impl rule__Operation__Group_4__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3277:2: rule__Operation__Group_4__3__Impl rule__Operation__Group_4__4
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__3__Impl_in_rule__Operation__Group_4__36582);
            rule__Operation__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__4_in_rule__Operation__Group_4__36585);
            rule__Operation__Group_4__4();

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
    // $ANTLR end "rule__Operation__Group_4__3"


    // $ANTLR start "rule__Operation__Group_4__3__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3284:1: rule__Operation__Group_4__3__Impl : ( ( ( rule__Operation__FeaturesInputAssignment_4_3 ) ) ( ( rule__Operation__FeaturesInputAssignment_4_3 )* ) ) ;
    public final void rule__Operation__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3288:1: ( ( ( ( rule__Operation__FeaturesInputAssignment_4_3 ) ) ( ( rule__Operation__FeaturesInputAssignment_4_3 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3289:1: ( ( ( rule__Operation__FeaturesInputAssignment_4_3 ) ) ( ( rule__Operation__FeaturesInputAssignment_4_3 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3289:1: ( ( ( rule__Operation__FeaturesInputAssignment_4_3 ) ) ( ( rule__Operation__FeaturesInputAssignment_4_3 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3290:1: ( ( rule__Operation__FeaturesInputAssignment_4_3 ) ) ( ( rule__Operation__FeaturesInputAssignment_4_3 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3290:1: ( ( rule__Operation__FeaturesInputAssignment_4_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3291:1: ( rule__Operation__FeaturesInputAssignment_4_3 )
            {
             before(grammarAccess.getOperationAccess().getFeaturesInputAssignment_4_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3292:1: ( rule__Operation__FeaturesInputAssignment_4_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3292:2: rule__Operation__FeaturesInputAssignment_4_3
            {
            pushFollow(FOLLOW_rule__Operation__FeaturesInputAssignment_4_3_in_rule__Operation__Group_4__3__Impl6614);
            rule__Operation__FeaturesInputAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getFeaturesInputAssignment_4_3()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3295:1: ( ( rule__Operation__FeaturesInputAssignment_4_3 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3296:1: ( rule__Operation__FeaturesInputAssignment_4_3 )*
            {
             before(grammarAccess.getOperationAccess().getFeaturesInputAssignment_4_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3297:1: ( rule__Operation__FeaturesInputAssignment_4_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==RULE_COMMENTS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3297:2: rule__Operation__FeaturesInputAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_rule__Operation__FeaturesInputAssignment_4_3_in_rule__Operation__Group_4__3__Impl6626);
            	    rule__Operation__FeaturesInputAssignment_4_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getFeaturesInputAssignment_4_3()); 

            }


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
    // $ANTLR end "rule__Operation__Group_4__3__Impl"


    // $ANTLR start "rule__Operation__Group_4__4"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3308:1: rule__Operation__Group_4__4 : rule__Operation__Group_4__4__Impl ;
    public final void rule__Operation__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3312:1: ( rule__Operation__Group_4__4__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3313:2: rule__Operation__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__4__Impl_in_rule__Operation__Group_4__46659);
            rule__Operation__Group_4__4__Impl();

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
    // $ANTLR end "rule__Operation__Group_4__4"


    // $ANTLR start "rule__Operation__Group_4__4__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3319:1: rule__Operation__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Operation__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3323:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3324:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3324:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3325:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,33,FOLLOW_33_in_rule__Operation__Group_4__4__Impl6687); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Operation__Group_4__4__Impl"


    // $ANTLR start "rule__Operation__Group_5__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3348:1: rule__Operation__Group_5__0 : rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 ;
    public final void rule__Operation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3352:1: ( rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3353:2: rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__06728);
            rule__Operation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__06731);
            rule__Operation__Group_5__1();

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
    // $ANTLR end "rule__Operation__Group_5__0"


    // $ANTLR start "rule__Operation__Group_5__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3360:1: rule__Operation__Group_5__0__Impl : ( '@output' ) ;
    public final void rule__Operation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3364:1: ( ( '@output' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3365:1: ( '@output' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3365:1: ( '@output' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3366:1: '@output'
            {
             before(grammarAccess.getOperationAccess().getOutputKeyword_5_0()); 
            match(input,45,FOLLOW_45_in_rule__Operation__Group_5__0__Impl6759); 
             after(grammarAccess.getOperationAccess().getOutputKeyword_5_0()); 

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
    // $ANTLR end "rule__Operation__Group_5__0__Impl"


    // $ANTLR start "rule__Operation__Group_5__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3379:1: rule__Operation__Group_5__1 : rule__Operation__Group_5__1__Impl rule__Operation__Group_5__2 ;
    public final void rule__Operation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3383:1: ( rule__Operation__Group_5__1__Impl rule__Operation__Group_5__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3384:2: rule__Operation__Group_5__1__Impl rule__Operation__Group_5__2
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__16790);
            rule__Operation__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_5__2_in_rule__Operation__Group_5__16793);
            rule__Operation__Group_5__2();

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
    // $ANTLR end "rule__Operation__Group_5__1"


    // $ANTLR start "rule__Operation__Group_5__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3391:1: rule__Operation__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Operation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3395:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3396:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3396:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3397:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_5_1()); 
            match(input,25,FOLLOW_25_in_rule__Operation__Group_5__1__Impl6821); 
             after(grammarAccess.getOperationAccess().getColonKeyword_5_1()); 

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
    // $ANTLR end "rule__Operation__Group_5__1__Impl"


    // $ANTLR start "rule__Operation__Group_5__2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3410:1: rule__Operation__Group_5__2 : rule__Operation__Group_5__2__Impl rule__Operation__Group_5__3 ;
    public final void rule__Operation__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3414:1: ( rule__Operation__Group_5__2__Impl rule__Operation__Group_5__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3415:2: rule__Operation__Group_5__2__Impl rule__Operation__Group_5__3
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__2__Impl_in_rule__Operation__Group_5__26852);
            rule__Operation__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_5__3_in_rule__Operation__Group_5__26855);
            rule__Operation__Group_5__3();

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
    // $ANTLR end "rule__Operation__Group_5__2"


    // $ANTLR start "rule__Operation__Group_5__2__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3422:1: rule__Operation__Group_5__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3426:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3427:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3427:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3428:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_5_2()); 
            match(input,32,FOLLOW_32_in_rule__Operation__Group_5__2__Impl6883); 
             after(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_5_2()); 

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
    // $ANTLR end "rule__Operation__Group_5__2__Impl"


    // $ANTLR start "rule__Operation__Group_5__3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3441:1: rule__Operation__Group_5__3 : rule__Operation__Group_5__3__Impl rule__Operation__Group_5__4 ;
    public final void rule__Operation__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3445:1: ( rule__Operation__Group_5__3__Impl rule__Operation__Group_5__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3446:2: rule__Operation__Group_5__3__Impl rule__Operation__Group_5__4
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__3__Impl_in_rule__Operation__Group_5__36914);
            rule__Operation__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_5__4_in_rule__Operation__Group_5__36917);
            rule__Operation__Group_5__4();

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
    // $ANTLR end "rule__Operation__Group_5__3"


    // $ANTLR start "rule__Operation__Group_5__3__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3453:1: rule__Operation__Group_5__3__Impl : ( ( ( rule__Operation__FeaturesOutputAssignment_5_3 ) ) ( ( rule__Operation__FeaturesOutputAssignment_5_3 )* ) ) ;
    public final void rule__Operation__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3457:1: ( ( ( ( rule__Operation__FeaturesOutputAssignment_5_3 ) ) ( ( rule__Operation__FeaturesOutputAssignment_5_3 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3458:1: ( ( ( rule__Operation__FeaturesOutputAssignment_5_3 ) ) ( ( rule__Operation__FeaturesOutputAssignment_5_3 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3458:1: ( ( ( rule__Operation__FeaturesOutputAssignment_5_3 ) ) ( ( rule__Operation__FeaturesOutputAssignment_5_3 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3459:1: ( ( rule__Operation__FeaturesOutputAssignment_5_3 ) ) ( ( rule__Operation__FeaturesOutputAssignment_5_3 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3459:1: ( ( rule__Operation__FeaturesOutputAssignment_5_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3460:1: ( rule__Operation__FeaturesOutputAssignment_5_3 )
            {
             before(grammarAccess.getOperationAccess().getFeaturesOutputAssignment_5_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3461:1: ( rule__Operation__FeaturesOutputAssignment_5_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3461:2: rule__Operation__FeaturesOutputAssignment_5_3
            {
            pushFollow(FOLLOW_rule__Operation__FeaturesOutputAssignment_5_3_in_rule__Operation__Group_5__3__Impl6946);
            rule__Operation__FeaturesOutputAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getFeaturesOutputAssignment_5_3()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3464:1: ( ( rule__Operation__FeaturesOutputAssignment_5_3 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3465:1: ( rule__Operation__FeaturesOutputAssignment_5_3 )*
            {
             before(grammarAccess.getOperationAccess().getFeaturesOutputAssignment_5_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3466:1: ( rule__Operation__FeaturesOutputAssignment_5_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==RULE_COMMENTS) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3466:2: rule__Operation__FeaturesOutputAssignment_5_3
            	    {
            	    pushFollow(FOLLOW_rule__Operation__FeaturesOutputAssignment_5_3_in_rule__Operation__Group_5__3__Impl6958);
            	    rule__Operation__FeaturesOutputAssignment_5_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getFeaturesOutputAssignment_5_3()); 

            }


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
    // $ANTLR end "rule__Operation__Group_5__3__Impl"


    // $ANTLR start "rule__Operation__Group_5__4"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3477:1: rule__Operation__Group_5__4 : rule__Operation__Group_5__4__Impl ;
    public final void rule__Operation__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3481:1: ( rule__Operation__Group_5__4__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3482:2: rule__Operation__Group_5__4__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__4__Impl_in_rule__Operation__Group_5__46991);
            rule__Operation__Group_5__4__Impl();

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
    // $ANTLR end "rule__Operation__Group_5__4"


    // $ANTLR start "rule__Operation__Group_5__4__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3488:1: rule__Operation__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Operation__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3492:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3493:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3493:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3494:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,33,FOLLOW_33_in_rule__Operation__Group_5__4__Impl7019); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Operation__Group_5__4__Impl"


    // $ANTLR start "rule__Operation__Group_6__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3517:1: rule__Operation__Group_6__0 : rule__Operation__Group_6__0__Impl rule__Operation__Group_6__1 ;
    public final void rule__Operation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3521:1: ( rule__Operation__Group_6__0__Impl rule__Operation__Group_6__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3522:2: rule__Operation__Group_6__0__Impl rule__Operation__Group_6__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_6__0__Impl_in_rule__Operation__Group_6__07060);
            rule__Operation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_6__1_in_rule__Operation__Group_6__07063);
            rule__Operation__Group_6__1();

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
    // $ANTLR end "rule__Operation__Group_6__0"


    // $ANTLR start "rule__Operation__Group_6__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3529:1: rule__Operation__Group_6__0__Impl : ( '@exception' ) ;
    public final void rule__Operation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3533:1: ( ( '@exception' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3534:1: ( '@exception' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3534:1: ( '@exception' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3535:1: '@exception'
            {
             before(grammarAccess.getOperationAccess().getExceptionKeyword_6_0()); 
            match(input,40,FOLLOW_40_in_rule__Operation__Group_6__0__Impl7091); 
             after(grammarAccess.getOperationAccess().getExceptionKeyword_6_0()); 

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
    // $ANTLR end "rule__Operation__Group_6__0__Impl"


    // $ANTLR start "rule__Operation__Group_6__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3548:1: rule__Operation__Group_6__1 : rule__Operation__Group_6__1__Impl rule__Operation__Group_6__2 ;
    public final void rule__Operation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3552:1: ( rule__Operation__Group_6__1__Impl rule__Operation__Group_6__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3553:2: rule__Operation__Group_6__1__Impl rule__Operation__Group_6__2
            {
            pushFollow(FOLLOW_rule__Operation__Group_6__1__Impl_in_rule__Operation__Group_6__17122);
            rule__Operation__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_6__2_in_rule__Operation__Group_6__17125);
            rule__Operation__Group_6__2();

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
    // $ANTLR end "rule__Operation__Group_6__1"


    // $ANTLR start "rule__Operation__Group_6__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3560:1: rule__Operation__Group_6__1__Impl : ( ':' ) ;
    public final void rule__Operation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3564:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3565:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3565:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3566:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_6_1()); 
            match(input,25,FOLLOW_25_in_rule__Operation__Group_6__1__Impl7153); 
             after(grammarAccess.getOperationAccess().getColonKeyword_6_1()); 

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
    // $ANTLR end "rule__Operation__Group_6__1__Impl"


    // $ANTLR start "rule__Operation__Group_6__2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3579:1: rule__Operation__Group_6__2 : rule__Operation__Group_6__2__Impl rule__Operation__Group_6__3 ;
    public final void rule__Operation__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3583:1: ( rule__Operation__Group_6__2__Impl rule__Operation__Group_6__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3584:2: rule__Operation__Group_6__2__Impl rule__Operation__Group_6__3
            {
            pushFollow(FOLLOW_rule__Operation__Group_6__2__Impl_in_rule__Operation__Group_6__27184);
            rule__Operation__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_6__3_in_rule__Operation__Group_6__27187);
            rule__Operation__Group_6__3();

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
    // $ANTLR end "rule__Operation__Group_6__2"


    // $ANTLR start "rule__Operation__Group_6__2__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3591:1: rule__Operation__Group_6__2__Impl : ( ( rule__Operation__ExceptiontsAssignment_6_2 ) ) ;
    public final void rule__Operation__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3595:1: ( ( ( rule__Operation__ExceptiontsAssignment_6_2 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3596:1: ( ( rule__Operation__ExceptiontsAssignment_6_2 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3596:1: ( ( rule__Operation__ExceptiontsAssignment_6_2 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3597:1: ( rule__Operation__ExceptiontsAssignment_6_2 )
            {
             before(grammarAccess.getOperationAccess().getExceptiontsAssignment_6_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3598:1: ( rule__Operation__ExceptiontsAssignment_6_2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3598:2: rule__Operation__ExceptiontsAssignment_6_2
            {
            pushFollow(FOLLOW_rule__Operation__ExceptiontsAssignment_6_2_in_rule__Operation__Group_6__2__Impl7214);
            rule__Operation__ExceptiontsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getExceptiontsAssignment_6_2()); 

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
    // $ANTLR end "rule__Operation__Group_6__2__Impl"


    // $ANTLR start "rule__Operation__Group_6__3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3608:1: rule__Operation__Group_6__3 : rule__Operation__Group_6__3__Impl ;
    public final void rule__Operation__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3612:1: ( rule__Operation__Group_6__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3613:2: rule__Operation__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_6__3__Impl_in_rule__Operation__Group_6__37244);
            rule__Operation__Group_6__3__Impl();

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
    // $ANTLR end "rule__Operation__Group_6__3"


    // $ANTLR start "rule__Operation__Group_6__3__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3619:1: rule__Operation__Group_6__3__Impl : ( ( rule__Operation__Group_6_3__0 )* ) ;
    public final void rule__Operation__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3623:1: ( ( ( rule__Operation__Group_6_3__0 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3624:1: ( ( rule__Operation__Group_6_3__0 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3624:1: ( ( rule__Operation__Group_6_3__0 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3625:1: ( rule__Operation__Group_6_3__0 )*
            {
             before(grammarAccess.getOperationAccess().getGroup_6_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3626:1: ( rule__Operation__Group_6_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==46) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3626:2: rule__Operation__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Operation__Group_6_3__0_in_rule__Operation__Group_6__3__Impl7271);
            	    rule__Operation__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__Operation__Group_6__3__Impl"


    // $ANTLR start "rule__Operation__Group_6_3__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3644:1: rule__Operation__Group_6_3__0 : rule__Operation__Group_6_3__0__Impl rule__Operation__Group_6_3__1 ;
    public final void rule__Operation__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3648:1: ( rule__Operation__Group_6_3__0__Impl rule__Operation__Group_6_3__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3649:2: rule__Operation__Group_6_3__0__Impl rule__Operation__Group_6_3__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_6_3__0__Impl_in_rule__Operation__Group_6_3__07310);
            rule__Operation__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_6_3__1_in_rule__Operation__Group_6_3__07313);
            rule__Operation__Group_6_3__1();

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
    // $ANTLR end "rule__Operation__Group_6_3__0"


    // $ANTLR start "rule__Operation__Group_6_3__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3656:1: rule__Operation__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3660:1: ( ( ',' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3661:1: ( ',' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3661:1: ( ',' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3662:1: ','
            {
             before(grammarAccess.getOperationAccess().getCommaKeyword_6_3_0()); 
            match(input,46,FOLLOW_46_in_rule__Operation__Group_6_3__0__Impl7341); 
             after(grammarAccess.getOperationAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__Operation__Group_6_3__0__Impl"


    // $ANTLR start "rule__Operation__Group_6_3__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3675:1: rule__Operation__Group_6_3__1 : rule__Operation__Group_6_3__1__Impl ;
    public final void rule__Operation__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3679:1: ( rule__Operation__Group_6_3__1__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3680:2: rule__Operation__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_6_3__1__Impl_in_rule__Operation__Group_6_3__17372);
            rule__Operation__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Operation__Group_6_3__1"


    // $ANTLR start "rule__Operation__Group_6_3__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3686:1: rule__Operation__Group_6_3__1__Impl : ( ( rule__Operation__ExceptiontsAssignment_6_3_1 ) ) ;
    public final void rule__Operation__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3690:1: ( ( ( rule__Operation__ExceptiontsAssignment_6_3_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3691:1: ( ( rule__Operation__ExceptiontsAssignment_6_3_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3691:1: ( ( rule__Operation__ExceptiontsAssignment_6_3_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3692:1: ( rule__Operation__ExceptiontsAssignment_6_3_1 )
            {
             before(grammarAccess.getOperationAccess().getExceptiontsAssignment_6_3_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3693:1: ( rule__Operation__ExceptiontsAssignment_6_3_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3693:2: rule__Operation__ExceptiontsAssignment_6_3_1
            {
            pushFollow(FOLLOW_rule__Operation__ExceptiontsAssignment_6_3_1_in_rule__Operation__Group_6_3__1__Impl7399);
            rule__Operation__ExceptiontsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getExceptiontsAssignment_6_3_1()); 

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
    // $ANTLR end "rule__Operation__Group_6_3__1__Impl"


    // $ANTLR start "rule__Architecture__NameAssignment_2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3708:1: rule__Architecture__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Architecture__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3712:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3713:1: ( ruleQualifiedName )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3713:1: ( ruleQualifiedName )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3714:1: ruleQualifiedName
            {
             before(grammarAccess.getArchitectureAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Architecture__NameAssignment_27438);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getArchitectureAccess().getNameQualifiedNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Architecture__NameAssignment_2"


    // $ANTLR start "rule__Architecture__ModuleAssignment_3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3723:1: rule__Architecture__ModuleAssignment_3 : ( ruleModule ) ;
    public final void rule__Architecture__ModuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3727:1: ( ( ruleModule ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3728:1: ( ruleModule )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3728:1: ( ruleModule )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3729:1: ruleModule
            {
             before(grammarAccess.getArchitectureAccess().getModuleModuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleModule_in_rule__Architecture__ModuleAssignment_37469);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getArchitectureAccess().getModuleModuleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Architecture__ModuleAssignment_3"


    // $ANTLR start "rule__Module__NameAssignment_2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3738:1: rule__Module__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3742:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3743:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3743:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3744:1: RULE_ID
            {
             before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Module__NameAssignment_27500); 
             after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Module__NameAssignment_2"


    // $ANTLR start "rule__Module__VersionAssignment_5"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3753:1: rule__Module__VersionAssignment_5 : ( ruleVersion ) ;
    public final void rule__Module__VersionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3757:1: ( ( ruleVersion ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3758:1: ( ruleVersion )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3758:1: ( ruleVersion )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3759:1: ruleVersion
            {
             before(grammarAccess.getModuleAccess().getVersionVersionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleVersion_in_rule__Module__VersionAssignment_57531);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getVersionVersionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Module__VersionAssignment_5"


    // $ANTLR start "rule__Module__ImportsAssignment_6"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3768:1: rule__Module__ImportsAssignment_6 : ( ruleImport ) ;
    public final void rule__Module__ImportsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3772:1: ( ( ruleImport ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3773:1: ( ruleImport )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3773:1: ( ruleImport )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3774:1: ruleImport
            {
             before(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Module__ImportsAssignment_67562);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Module__ImportsAssignment_6"


    // $ANTLR start "rule__Module__ModelAssignment_7"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3783:1: rule__Module__ModelAssignment_7 : ( ruleModel ) ;
    public final void rule__Module__ModelAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3787:1: ( ( ruleModel ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3788:1: ( ruleModel )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3788:1: ( ruleModel )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3789:1: ruleModel
            {
             before(grammarAccess.getModuleAccess().getModelModelParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleModel_in_rule__Module__ModelAssignment_77593);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getModelModelParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Module__ModelAssignment_7"


    // $ANTLR start "rule__Module__ExceptionsAssignment_8"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3798:1: rule__Module__ExceptionsAssignment_8 : ( ruleExceptions ) ;
    public final void rule__Module__ExceptionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3802:1: ( ( ruleExceptions ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3803:1: ( ruleExceptions )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3803:1: ( ruleExceptions )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3804:1: ruleExceptions
            {
             before(grammarAccess.getModuleAccess().getExceptionsExceptionsParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleExceptions_in_rule__Module__ExceptionsAssignment_87624);
            ruleExceptions();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getExceptionsExceptionsParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Module__ExceptionsAssignment_8"


    // $ANTLR start "rule__Module__ServicesAssignment_9"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3813:1: rule__Module__ServicesAssignment_9 : ( ruleService ) ;
    public final void rule__Module__ServicesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3817:1: ( ( ruleService ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3818:1: ( ruleService )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3818:1: ( ruleService )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3819:1: ruleService
            {
             before(grammarAccess.getModuleAccess().getServicesServiceParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleService_in_rule__Module__ServicesAssignment_97655);
            ruleService();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getServicesServiceParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Module__ServicesAssignment_9"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3828:1: rule__Import__ImportedNamespaceAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Import__ImportedNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3832:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3833:1: ( ruleQualifiedName )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3833:1: ( ruleQualifiedName )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3834:1: ruleQualifiedName
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_27686);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_2"


    // $ANTLR start "rule__Model__EntitiesAssignment_2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3843:1: rule__Model__EntitiesAssignment_2 : ( ruleEntities ) ;
    public final void rule__Model__EntitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3847:1: ( ( ruleEntities ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3848:1: ( ruleEntities )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3848:1: ( ruleEntities )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3849:1: ruleEntities
            {
             before(grammarAccess.getModelAccess().getEntitiesEntitiesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEntities_in_rule__Model__EntitiesAssignment_27717);
            ruleEntities();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntitiesEntitiesParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__EntitiesAssignment_2"


    // $ANTLR start "rule__Comment__ValueAssignment"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3858:1: rule__Comment__ValueAssignment : ( RULE_COMMENTS ) ;
    public final void rule__Comment__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3862:1: ( ( RULE_COMMENTS ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3863:1: ( RULE_COMMENTS )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3863:1: ( RULE_COMMENTS )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3864:1: RULE_COMMENTS
            {
             before(grammarAccess.getCommentAccess().getValueCOMMENTSTerminalRuleCall_0()); 
            match(input,RULE_COMMENTS,FOLLOW_RULE_COMMENTS_in_rule__Comment__ValueAssignment7748); 
             after(grammarAccess.getCommentAccess().getValueCOMMENTSTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Comment__ValueAssignment"


    // $ANTLR start "rule__Enum__NameAssignment_1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3873:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3877:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3878:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3878:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3879:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_17779); 
             after(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Enum__NameAssignment_1"


    // $ANTLR start "rule__Enum__FeaturesAssignment_3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3888:1: rule__Enum__FeaturesAssignment_3 : ( RULE_ID ) ;
    public final void rule__Enum__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3892:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3893:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3893:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3894:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getFeaturesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__FeaturesAssignment_37810); 
             after(grammarAccess.getEnumAccess().getFeaturesIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Enum__FeaturesAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3903:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3907:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3908:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3908:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3909:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_17841); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3918:1: rule__Entity__FeaturesAssignment_3 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3922:1: ( ( ruleFeature ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3923:1: ( ruleFeature )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3923:1: ( ruleFeature )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3924:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_37872);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Entity__FeaturesAssignment_3"


    // $ANTLR start "rule__Feature__FeatureCommentAssignment_0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3933:1: rule__Feature__FeatureCommentAssignment_0 : ( ruleComment ) ;
    public final void rule__Feature__FeatureCommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3937:1: ( ( ruleComment ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3938:1: ( ruleComment )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3938:1: ( ruleComment )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3939:1: ruleComment
            {
             before(grammarAccess.getFeatureAccess().getFeatureCommentCommentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleComment_in_rule__Feature__FeatureCommentAssignment_07903);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getFeatureCommentCommentParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Feature__FeatureCommentAssignment_0"


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3948:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3952:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3953:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3953:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3954:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_17934); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Feature__NameAssignment_1"


    // $ANTLR start "rule__Feature__TypeAssignment_3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3963:1: rule__Feature__TypeAssignment_3 : ( ruleFeatureType ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3967:1: ( ( ruleFeatureType ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3968:1: ( ruleFeatureType )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3968:1: ( ruleFeatureType )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3969:1: ruleFeatureType
            {
             before(grammarAccess.getFeatureAccess().getTypeFeatureTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFeatureType_in_rule__Feature__TypeAssignment_37965);
            ruleFeatureType();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTypeFeatureTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Feature__TypeAssignment_3"


    // $ANTLR start "rule__EntitiesFeature__TypeAssignment"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3978:1: rule__EntitiesFeature__TypeAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__EntitiesFeature__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3982:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3983:1: ( ( ruleQualifiedName ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3983:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3984:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntitiesFeatureAccess().getTypeEntitiesCrossReference_0()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3985:1: ( ruleQualifiedName )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3986:1: ruleQualifiedName
            {
             before(grammarAccess.getEntitiesFeatureAccess().getTypeEntitiesQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EntitiesFeature__TypeAssignment8000);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEntitiesFeatureAccess().getTypeEntitiesQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getEntitiesFeatureAccess().getTypeEntitiesCrossReference_0()); 

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
    // $ANTLR end "rule__EntitiesFeature__TypeAssignment"


    // $ANTLR start "rule__PrimitiveFeature__TypeAssignment"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3997:1: rule__PrimitiveFeature__TypeAssignment : ( rulePrimitiveType ) ;
    public final void rule__PrimitiveFeature__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4001:1: ( ( rulePrimitiveType ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4002:1: ( rulePrimitiveType )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4002:1: ( rulePrimitiveType )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4003:1: rulePrimitiveType
            {
             before(grammarAccess.getPrimitiveFeatureAccess().getTypePrimitiveTypeEnumRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_rule__PrimitiveFeature__TypeAssignment8035);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveFeatureAccess().getTypePrimitiveTypeEnumRuleCall_0()); 

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
    // $ANTLR end "rule__PrimitiveFeature__TypeAssignment"


    // $ANTLR start "rule__GenericListFeature__TypeAssignment_2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4012:1: rule__GenericListFeature__TypeAssignment_2 : ( ruleFeatureType ) ;
    public final void rule__GenericListFeature__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4016:1: ( ( ruleFeatureType ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4017:1: ( ruleFeatureType )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4017:1: ( ruleFeatureType )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4018:1: ruleFeatureType
            {
             before(grammarAccess.getGenericListFeatureAccess().getTypeFeatureTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFeatureType_in_rule__GenericListFeature__TypeAssignment_28066);
            ruleFeatureType();

            state._fsp--;

             after(grammarAccess.getGenericListFeatureAccess().getTypeFeatureTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__GenericListFeature__TypeAssignment_2"


    // $ANTLR start "rule__Exceptions__ExceptionsAssignment_2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4027:1: rule__Exceptions__ExceptionsAssignment_2 : ( ruleException ) ;
    public final void rule__Exceptions__ExceptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4031:1: ( ( ruleException ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4032:1: ( ruleException )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4032:1: ( ruleException )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4033:1: ruleException
            {
             before(grammarAccess.getExceptionsAccess().getExceptionsExceptionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleException_in_rule__Exceptions__ExceptionsAssignment_28097);
            ruleException();

            state._fsp--;

             after(grammarAccess.getExceptionsAccess().getExceptionsExceptionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Exceptions__ExceptionsAssignment_2"


    // $ANTLR start "rule__Exception__NameAssignment_1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4042:1: rule__Exception__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Exception__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4046:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4047:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4047:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4048:1: RULE_ID
            {
             before(grammarAccess.getExceptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Exception__NameAssignment_18128); 
             after(grammarAccess.getExceptionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Exception__NameAssignment_1"


    // $ANTLR start "rule__Exception__MsgAssignment_5"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4057:1: rule__Exception__MsgAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Exception__MsgAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4061:1: ( ( RULE_STRING ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4062:1: ( RULE_STRING )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4062:1: ( RULE_STRING )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4063:1: RULE_STRING
            {
             before(grammarAccess.getExceptionAccess().getMsgSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Exception__MsgAssignment_58159); 
             after(grammarAccess.getExceptionAccess().getMsgSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Exception__MsgAssignment_5"


    // $ANTLR start "rule__Service__NameAssignment_1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4072:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4076:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4077:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4077:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4078:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_18190); 
             after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Service__NameAssignment_1"


    // $ANTLR start "rule__Service__OperationsAssignment_3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4087:1: rule__Service__OperationsAssignment_3 : ( ruleOperation ) ;
    public final void rule__Service__OperationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4091:1: ( ( ruleOperation ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4092:1: ( ruleOperation )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4092:1: ( ruleOperation )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4093:1: ruleOperation
            {
             before(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__Service__OperationsAssignment_38221);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Service__OperationsAssignment_3"


    // $ANTLR start "rule__Operation__NameAssignment_1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4102:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4106:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4107:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4107:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4108:1: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_18252); 
             after(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Operation__NameAssignment_1"


    // $ANTLR start "rule__Operation__AuthenticatedAssignment_3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4117:1: rule__Operation__AuthenticatedAssignment_3 : ( ( '@authenticated' ) ) ;
    public final void rule__Operation__AuthenticatedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4121:1: ( ( ( '@authenticated' ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4122:1: ( ( '@authenticated' ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4122:1: ( ( '@authenticated' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4123:1: ( '@authenticated' )
            {
             before(grammarAccess.getOperationAccess().getAuthenticatedAuthenticatedKeyword_3_0()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4124:1: ( '@authenticated' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4125:1: '@authenticated'
            {
             before(grammarAccess.getOperationAccess().getAuthenticatedAuthenticatedKeyword_3_0()); 
            match(input,47,FOLLOW_47_in_rule__Operation__AuthenticatedAssignment_38288); 
             after(grammarAccess.getOperationAccess().getAuthenticatedAuthenticatedKeyword_3_0()); 

            }

             after(grammarAccess.getOperationAccess().getAuthenticatedAuthenticatedKeyword_3_0()); 

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
    // $ANTLR end "rule__Operation__AuthenticatedAssignment_3"


    // $ANTLR start "rule__Operation__FeaturesInputAssignment_4_3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4140:1: rule__Operation__FeaturesInputAssignment_4_3 : ( ruleFeature ) ;
    public final void rule__Operation__FeaturesInputAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4144:1: ( ( ruleFeature ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4145:1: ( ruleFeature )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4145:1: ( ruleFeature )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4146:1: ruleFeature
            {
             before(grammarAccess.getOperationAccess().getFeaturesInputFeatureParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Operation__FeaturesInputAssignment_4_38327);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getFeaturesInputFeatureParserRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__Operation__FeaturesInputAssignment_4_3"


    // $ANTLR start "rule__Operation__FeaturesOutputAssignment_5_3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4155:1: rule__Operation__FeaturesOutputAssignment_5_3 : ( ruleFeature ) ;
    public final void rule__Operation__FeaturesOutputAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4159:1: ( ( ruleFeature ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4160:1: ( ruleFeature )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4160:1: ( ruleFeature )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4161:1: ruleFeature
            {
             before(grammarAccess.getOperationAccess().getFeaturesOutputFeatureParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Operation__FeaturesOutputAssignment_5_38358);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getFeaturesOutputFeatureParserRuleCall_5_3_0()); 

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
    // $ANTLR end "rule__Operation__FeaturesOutputAssignment_5_3"


    // $ANTLR start "rule__Operation__ExceptiontsAssignment_6_2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4170:1: rule__Operation__ExceptiontsAssignment_6_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Operation__ExceptiontsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4174:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4175:1: ( ( ruleQualifiedName ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4175:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4176:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getOperationAccess().getExceptiontsExceptionCrossReference_6_2_0()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4177:1: ( ruleQualifiedName )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4178:1: ruleQualifiedName
            {
             before(grammarAccess.getOperationAccess().getExceptiontsExceptionQualifiedNameParserRuleCall_6_2_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Operation__ExceptiontsAssignment_6_28393);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getExceptiontsExceptionQualifiedNameParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getExceptiontsExceptionCrossReference_6_2_0()); 

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
    // $ANTLR end "rule__Operation__ExceptiontsAssignment_6_2"


    // $ANTLR start "rule__Operation__ExceptiontsAssignment_6_3_1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4189:1: rule__Operation__ExceptiontsAssignment_6_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Operation__ExceptiontsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4193:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4194:1: ( ( ruleQualifiedName ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4194:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4195:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getOperationAccess().getExceptiontsExceptionCrossReference_6_3_1_0()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4196:1: ( ruleQualifiedName )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4197:1: ruleQualifiedName
            {
             before(grammarAccess.getOperationAccess().getExceptiontsExceptionQualifiedNameParserRuleCall_6_3_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Operation__ExceptiontsAssignment_6_3_18432);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getExceptiontsExceptionQualifiedNameParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getExceptiontsExceptionCrossReference_6_3_1_0()); 

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
    // $ANTLR end "rule__Operation__ExceptiontsAssignment_6_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleArchitecture_in_entryRuleArchitecture61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitecture68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__Group__0_in_ruleArchitecture94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0_in_ruleVersion274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__ValueAssignment_in_ruleComment454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntities_in_entryRuleEntities481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntities488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entities__Alternatives_in_ruleEntities514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureType_in_entryRuleFeatureType721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureType728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureType__Alternatives_in_ruleFeatureType754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntitiesFeature_in_entryRuleEntitiesFeature781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntitiesFeature788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntitiesFeature__TypeAssignment_in_ruleEntitiesFeature814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveFeature_in_entryRulePrimitiveFeature841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveFeature848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveFeature__TypeAssignment_in_rulePrimitiveFeature874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListFeature_in_entryRuleGenericListFeature901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericListFeature908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__0_in_ruleGenericListFeature934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptions_in_entryRuleExceptions961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptions968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__0_in_ruleExceptions994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleException_in_entryRuleException1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleException1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__0_in_ruleException1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Entities__Alternatives1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__Entities__Alternatives1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntitiesFeature_in_rule__FeatureType__Alternatives1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveFeature_in_rule__FeatureType__Alternatives1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListFeature_in_rule__FeatureType__Alternatives1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PrimitiveType__Alternatives1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PrimitiveType__Alternatives1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PrimitiveType__Alternatives1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PrimitiveType__Alternatives1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PrimitiveType__Alternatives1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PrimitiveType__Alternatives1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PrimitiveType__Alternatives1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PrimitiveType__Alternatives1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PrimitiveType__Alternatives1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PrimitiveType__Alternatives1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PrimitiveType__Alternatives1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PrimitiveType__Alternatives1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__Group__0__Impl_in_rule__Architecture__Group__01626 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Architecture__Group__1_in_rule__Architecture__Group__01629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Architecture__Group__0__Impl1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__Group__1__Impl_in_rule__Architecture__Group__11688 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Architecture__Group__2_in_rule__Architecture__Group__11691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Architecture__Group__1__Impl1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__Group__2__Impl_in_rule__Architecture__Group__21750 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Architecture__Group__3_in_rule__Architecture__Group__21753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__NameAssignment_2_in_rule__Architecture__Group__2__Impl1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__Group__3__Impl_in_rule__Architecture__Group__31810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__ModuleAssignment_3_in_rule__Architecture__Group__3__Impl1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__01875 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__01878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Module__Group__0__Impl1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__11937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__11940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Module__Group__1__Impl1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21999 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__22002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__32059 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Module__Group__4_in_rule__Module__Group__32062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Module__Group__3__Impl2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__42121 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Module__Group__5_in_rule__Module__Group__42124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Module__Group__4__Impl2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__52183 = new BitSet(new long[]{0x00000480C0000000L});
    public static final BitSet FOLLOW_rule__Module__Group__6_in_rule__Module__Group__52186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__VersionAssignment_5_in_rule__Module__Group__5__Impl2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__62243 = new BitSet(new long[]{0x00000480C0000000L});
    public static final BitSet FOLLOW_rule__Module__Group__7_in_rule__Module__Group__62246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ImportsAssignment_6_in_rule__Module__Group__6__Impl2273 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Module__Group__7__Impl_in_rule__Module__Group__72304 = new BitSet(new long[]{0x00000480C0000000L});
    public static final BitSet FOLLOW_rule__Module__Group__8_in_rule__Module__Group__72307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ModelAssignment_7_in_rule__Module__Group__7__Impl2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__8__Impl_in_rule__Module__Group__82365 = new BitSet(new long[]{0x00000480C0000000L});
    public static final BitSet FOLLOW_rule__Module__Group__9_in_rule__Module__Group__82368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ExceptionsAssignment_8_in_rule__Module__Group__8__Impl2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__9__Impl_in_rule__Module__Group__92426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ServicesAssignment_9_in_rule__Module__Group__9__Impl2453 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02504 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2590 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__QualifiedName__Group_1__0__Impl2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__02747 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__02750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group__0__Impl2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__12806 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Version__Group__2_in_rule__Version__Group__12809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Version__Group__1__Impl2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__2__Impl_in_rule__Version__Group__22868 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Version__Group__3_in_rule__Version__Group__22871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group__2__Impl2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__3__Impl_in_rule__Version__Group__32927 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Version__Group__4_in_rule__Version__Group__32930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Version__Group__3__Impl2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__4__Impl_in_rule__Version__Group__42989 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Version__Group__5_in_rule__Version__Group__42992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group__4__Impl3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__5__Impl_in_rule__Version__Group__53048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_5__0_in_rule__Version__Group__5__Impl3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_5__0__Impl_in_rule__Version__Group_5__03118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Version__Group_5__1_in_rule__Version__Group_5__03121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Version__Group_5__0__Impl3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_5__1__Impl_in_rule__Version__Group_5__13180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Version__Group_5__1__Impl3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03240 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Import__Group__0__Impl3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__13305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Import__Group__1__Impl3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__23364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_2_in_rule__Import__Group__2__Impl3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03427 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Model__Group__0__Impl3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13489 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Model__Group__1__Impl3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23551 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__23554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__EntitiesAssignment_2_in_rule__Model__Group__2__Impl3583 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_rule__Model__EntitiesAssignment_2_in_rule__Model__Group__2__Impl3595 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Model__Group__3__Impl3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__03695 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__03698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Enum__Group__0__Impl3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__13757 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__13760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__23817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__23820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Enum__Group__2__Impl3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__33879 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__33882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__FeaturesAssignment_3_in_rule__Enum__Group__3__Impl3911 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enum__FeaturesAssignment_3_in_rule__Enum__Group__3__Impl3923 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__43956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Enum__Group__4__Impl3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__04025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__04028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Entity__Group__0__Impl4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__14087 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__14090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__24147 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__24150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Entity__Group__2__Impl4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__34209 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__34212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl4241 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl4253 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__44286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Entity__Group__4__Impl4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__04355 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__04358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__FeatureCommentAssignment_0_in_rule__Feature__Group__0__Impl4385 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__14416 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__14419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__24476 = new BitSet(new long[]{0x0000001000FFF010L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__24479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Feature__Group__2__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__34538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__0__Impl_in_rule__GenericListFeature__Group__04603 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__1_in_rule__GenericListFeature__Group__04606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__GenericListFeature__Group__0__Impl4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__1__Impl_in_rule__GenericListFeature__Group__14665 = new BitSet(new long[]{0x0000001000FFF010L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__2_in_rule__GenericListFeature__Group__14668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__GenericListFeature__Group__1__Impl4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__2__Impl_in_rule__GenericListFeature__Group__24727 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__3_in_rule__GenericListFeature__Group__24730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__TypeAssignment_2_in_rule__GenericListFeature__Group__2__Impl4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__3__Impl_in_rule__GenericListFeature__Group__34787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__GenericListFeature__Group__3__Impl4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__0__Impl_in_rule__Exceptions__Group__04854 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__1_in_rule__Exceptions__Group__04857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Exceptions__Group__0__Impl4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__1__Impl_in_rule__Exceptions__Group__14916 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__2_in_rule__Exceptions__Group__14919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Exceptions__Group__1__Impl4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__2__Impl_in_rule__Exceptions__Group__24978 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__3_in_rule__Exceptions__Group__24981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exceptions__ExceptionsAssignment_2_in_rule__Exceptions__Group__2__Impl5010 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Exceptions__ExceptionsAssignment_2_in_rule__Exceptions__Group__2__Impl5022 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__3__Impl_in_rule__Exceptions__Group__35055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Exceptions__Group__3__Impl5083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__0__Impl_in_rule__Exception__Group__05122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exception__Group__1_in_rule__Exception__Group__05125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Exception__Group__0__Impl5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__1__Impl_in_rule__Exception__Group__15184 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Exception__Group__2_in_rule__Exception__Group__15187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__NameAssignment_1_in_rule__Exception__Group__1__Impl5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__2__Impl_in_rule__Exception__Group__25244 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Exception__Group__3_in_rule__Exception__Group__25247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Exception__Group__2__Impl5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__3__Impl_in_rule__Exception__Group__35306 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Exception__Group__4_in_rule__Exception__Group__35309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Exception__Group__3__Impl5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__4__Impl_in_rule__Exception__Group__45368 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Exception__Group__5_in_rule__Exception__Group__45371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Exception__Group__4__Impl5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__5__Impl_in_rule__Exception__Group__55430 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Exception__Group__6_in_rule__Exception__Group__55433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__MsgAssignment_5_in_rule__Exception__Group__5__Impl5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__6__Impl_in_rule__Exception__Group__65490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Exception__Group__6__Impl5518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__05563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__05566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Service__Group__0__Impl5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__15625 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__15628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl5655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__25685 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__25688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Service__Group__2__Impl5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__35747 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__35750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__OperationsAssignment_3_in_rule__Service__Group__3__Impl5779 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Service__OperationsAssignment_3_in_rule__Service__Group__3__Impl5791 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__45824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Service__Group__4__Impl5852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__05893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__05896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Operation__Group__0__Impl5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__15955 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__15958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__26015 = new BitSet(new long[]{0x0000B10200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__26018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Operation__Group__2__Impl6046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__36077 = new BitSet(new long[]{0x0000B10200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__36080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__AuthenticatedAssignment_3_in_rule__Operation__Group__3__Impl6107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__46138 = new BitSet(new long[]{0x0000B10200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__46141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl6168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__56199 = new BitSet(new long[]{0x0000B10200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__56202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__66260 = new BitSet(new long[]{0x0000B10200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__7_in_rule__Operation__Group__66263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_6__0_in_rule__Operation__Group__6__Impl6290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__7__Impl_in_rule__Operation__Group__76321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Operation__Group__7__Impl6349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__06396 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__06399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Operation__Group_4__0__Impl6427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__16458 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__2_in_rule__Operation__Group_4__16461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operation__Group_4__1__Impl6489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__2__Impl_in_rule__Operation__Group_4__26520 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__3_in_rule__Operation__Group_4__26523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Operation__Group_4__2__Impl6551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__3__Impl_in_rule__Operation__Group_4__36582 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__4_in_rule__Operation__Group_4__36585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__FeaturesInputAssignment_4_3_in_rule__Operation__Group_4__3__Impl6614 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Operation__FeaturesInputAssignment_4_3_in_rule__Operation__Group_4__3__Impl6626 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__4__Impl_in_rule__Operation__Group_4__46659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Operation__Group_4__4__Impl6687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__06728 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__06731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Operation__Group_5__0__Impl6759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__16790 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__2_in_rule__Operation__Group_5__16793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operation__Group_5__1__Impl6821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__2__Impl_in_rule__Operation__Group_5__26852 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__3_in_rule__Operation__Group_5__26855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Operation__Group_5__2__Impl6883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__3__Impl_in_rule__Operation__Group_5__36914 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__4_in_rule__Operation__Group_5__36917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__FeaturesOutputAssignment_5_3_in_rule__Operation__Group_5__3__Impl6946 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Operation__FeaturesOutputAssignment_5_3_in_rule__Operation__Group_5__3__Impl6958 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__4__Impl_in_rule__Operation__Group_5__46991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Operation__Group_5__4__Impl7019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_6__0__Impl_in_rule__Operation__Group_6__07060 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_6__1_in_rule__Operation__Group_6__07063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Operation__Group_6__0__Impl7091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_6__1__Impl_in_rule__Operation__Group_6__17122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group_6__2_in_rule__Operation__Group_6__17125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operation__Group_6__1__Impl7153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_6__2__Impl_in_rule__Operation__Group_6__27184 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_6__3_in_rule__Operation__Group_6__27187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ExceptiontsAssignment_6_2_in_rule__Operation__Group_6__2__Impl7214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_6__3__Impl_in_rule__Operation__Group_6__37244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_6_3__0_in_rule__Operation__Group_6__3__Impl7271 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_6_3__0__Impl_in_rule__Operation__Group_6_3__07310 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group_6_3__1_in_rule__Operation__Group_6_3__07313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Operation__Group_6_3__0__Impl7341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_6_3__1__Impl_in_rule__Operation__Group_6_3__17372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ExceptiontsAssignment_6_3_1_in_rule__Operation__Group_6_3__1__Impl7399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Architecture__NameAssignment_27438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__Architecture__ModuleAssignment_37469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Module__NameAssignment_27500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__Module__VersionAssignment_57531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Module__ImportsAssignment_67562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_rule__Module__ModelAssignment_77593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptions_in_rule__Module__ExceptionsAssignment_87624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__Module__ServicesAssignment_97655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_27686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntities_in_rule__Model__EntitiesAssignment_27717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENTS_in_rule__Comment__ValueAssignment7748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_17779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__FeaturesAssignment_37810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_17841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_37872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_rule__Feature__FeatureCommentAssignment_07903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_17934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureType_in_rule__Feature__TypeAssignment_37965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EntitiesFeature__TypeAssignment8000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__PrimitiveFeature__TypeAssignment8035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureType_in_rule__GenericListFeature__TypeAssignment_28066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleException_in_rule__Exceptions__ExceptionsAssignment_28097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Exception__NameAssignment_18128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Exception__MsgAssignment_58159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_18190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Service__OperationsAssignment_38221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_18252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Operation__AuthenticatedAssignment_38288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Operation__FeaturesInputAssignment_4_38327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Operation__FeaturesOutputAssignment_5_38358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Operation__ExceptiontsAssignment_6_28393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Operation__ExceptiontsAssignment_6_3_18432 = new BitSet(new long[]{0x0000000000000002L});

}