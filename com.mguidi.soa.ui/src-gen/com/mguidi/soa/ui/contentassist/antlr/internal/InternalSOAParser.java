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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_COMMENTS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@String'", "'@Short'", "'@Integer'", "'@Long'", "'@Float'", "'@Double'", "'@Boolean'", "'@Byte'", "'@Date'", "'@Datetime'", "'@Timestamp'", "'@Decimal'", "'@applicationId'", "':'", "'@moduleName'", "'@version'", "'.'", "'-'", "'@import'", "'@model'", "'{'", "'}'", "'@enum'", "'@entity'", "'@List'", "'<'", "'>'", "'@exceptions'", "'@exception'", "'@msg'", "'@service'", "'@operation'", "'@input'", "'@output'", "','", "'@event'"
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


    // $ANTLR start "entryRuleEvent"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:592:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:593:1: ( ruleEvent EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:594:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent1201);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent1208); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:601:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:605:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:606:1: ( ( rule__Event__Group__0 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:606:1: ( ( rule__Event__Group__0 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:607:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:608:1: ( rule__Event__Group__0 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:608:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_rule__Event__Group__0_in_ruleEvent1234);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "rulePrimitiveType"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:621:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:625:1: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:626:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:626:1: ( ( rule__PrimitiveType__Alternatives ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:627:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:628:1: ( rule__PrimitiveType__Alternatives )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:628:2: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType1271);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:639:1: rule__Entities__Alternatives : ( ( ruleEntity ) | ( ruleEnum ) );
    public final void rule__Entities__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:643:1: ( ( ruleEntity ) | ( ruleEnum ) )
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
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:644:1: ( ruleEntity )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:644:1: ( ruleEntity )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:645:1: ruleEntity
                    {
                     before(grammarAccess.getEntitiesAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Entities__Alternatives1306);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getEntitiesAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:650:6: ( ruleEnum )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:650:6: ( ruleEnum )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:651:1: ruleEnum
                    {
                     before(grammarAccess.getEntitiesAccess().getEnumParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnum_in_rule__Entities__Alternatives1323);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:661:1: rule__FeatureType__Alternatives : ( ( ruleEntitiesFeature ) | ( rulePrimitiveFeature ) | ( ruleGenericListFeature ) );
    public final void rule__FeatureType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:665:1: ( ( ruleEntitiesFeature ) | ( rulePrimitiveFeature ) | ( ruleGenericListFeature ) )
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
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:666:1: ( ruleEntitiesFeature )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:666:1: ( ruleEntitiesFeature )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:667:1: ruleEntitiesFeature
                    {
                     before(grammarAccess.getFeatureTypeAccess().getEntitiesFeatureParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntitiesFeature_in_rule__FeatureType__Alternatives1355);
                    ruleEntitiesFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureTypeAccess().getEntitiesFeatureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:672:6: ( rulePrimitiveFeature )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:672:6: ( rulePrimitiveFeature )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:673:1: rulePrimitiveFeature
                    {
                     before(grammarAccess.getFeatureTypeAccess().getPrimitiveFeatureParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePrimitiveFeature_in_rule__FeatureType__Alternatives1372);
                    rulePrimitiveFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureTypeAccess().getPrimitiveFeatureParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:678:6: ( ruleGenericListFeature )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:678:6: ( ruleGenericListFeature )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:679:1: ruleGenericListFeature
                    {
                     before(grammarAccess.getFeatureTypeAccess().getGenericListFeatureParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGenericListFeature_in_rule__FeatureType__Alternatives1389);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:689:1: rule__PrimitiveType__Alternatives : ( ( ( '@String' ) ) | ( ( '@Short' ) ) | ( ( '@Integer' ) ) | ( ( '@Long' ) ) | ( ( '@Float' ) ) | ( ( '@Double' ) ) | ( ( '@Boolean' ) ) | ( ( '@Byte' ) ) | ( ( '@Date' ) ) | ( ( '@Datetime' ) ) | ( ( '@Timestamp' ) ) | ( ( '@Decimal' ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:693:1: ( ( ( '@String' ) ) | ( ( '@Short' ) ) | ( ( '@Integer' ) ) | ( ( '@Long' ) ) | ( ( '@Float' ) ) | ( ( '@Double' ) ) | ( ( '@Boolean' ) ) | ( ( '@Byte' ) ) | ( ( '@Date' ) ) | ( ( '@Datetime' ) ) | ( ( '@Timestamp' ) ) | ( ( '@Decimal' ) ) )
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
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:694:1: ( ( '@String' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:694:1: ( ( '@String' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:695:1: ( '@String' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:696:1: ( '@String' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:696:3: '@String'
                    {
                    match(input,12,FOLLOW_12_in_rule__PrimitiveType__Alternatives1422); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:701:6: ( ( '@Short' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:701:6: ( ( '@Short' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:702:1: ( '@Short' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getShortEnumLiteralDeclaration_1()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:703:1: ( '@Short' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:703:3: '@Short'
                    {
                    match(input,13,FOLLOW_13_in_rule__PrimitiveType__Alternatives1443); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getShortEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:708:6: ( ( '@Integer' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:708:6: ( ( '@Integer' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:709:1: ( '@Integer' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getIntegerEnumLiteralDeclaration_2()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:710:1: ( '@Integer' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:710:3: '@Integer'
                    {
                    match(input,14,FOLLOW_14_in_rule__PrimitiveType__Alternatives1464); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getIntegerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:715:6: ( ( '@Long' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:715:6: ( ( '@Long' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:716:1: ( '@Long' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getLongEnumLiteralDeclaration_3()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:717:1: ( '@Long' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:717:3: '@Long'
                    {
                    match(input,15,FOLLOW_15_in_rule__PrimitiveType__Alternatives1485); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getLongEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:722:6: ( ( '@Float' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:722:6: ( ( '@Float' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:723:1: ( '@Float' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getFloatEnumLiteralDeclaration_4()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:724:1: ( '@Float' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:724:3: '@Float'
                    {
                    match(input,16,FOLLOW_16_in_rule__PrimitiveType__Alternatives1506); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getFloatEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:729:6: ( ( '@Double' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:729:6: ( ( '@Double' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:730:1: ( '@Double' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDoubleEnumLiteralDeclaration_5()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:731:1: ( '@Double' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:731:3: '@Double'
                    {
                    match(input,17,FOLLOW_17_in_rule__PrimitiveType__Alternatives1527); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getDoubleEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:736:6: ( ( '@Boolean' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:736:6: ( ( '@Boolean' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:737:1: ( '@Boolean' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_6()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:738:1: ( '@Boolean' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:738:3: '@Boolean'
                    {
                    match(input,18,FOLLOW_18_in_rule__PrimitiveType__Alternatives1548); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:743:6: ( ( '@Byte' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:743:6: ( ( '@Byte' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:744:1: ( '@Byte' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getByteEnumLiteralDeclaration_7()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:745:1: ( '@Byte' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:745:3: '@Byte'
                    {
                    match(input,19,FOLLOW_19_in_rule__PrimitiveType__Alternatives1569); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getByteEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:750:6: ( ( '@Date' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:750:6: ( ( '@Date' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:751:1: ( '@Date' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDateEnumLiteralDeclaration_8()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:752:1: ( '@Date' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:752:3: '@Date'
                    {
                    match(input,20,FOLLOW_20_in_rule__PrimitiveType__Alternatives1590); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getDateEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:757:6: ( ( '@Datetime' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:757:6: ( ( '@Datetime' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:758:1: ( '@Datetime' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDatetimeEnumLiteralDeclaration_9()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:759:1: ( '@Datetime' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:759:3: '@Datetime'
                    {
                    match(input,21,FOLLOW_21_in_rule__PrimitiveType__Alternatives1611); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getDatetimeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:764:6: ( ( '@Timestamp' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:764:6: ( ( '@Timestamp' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:765:1: ( '@Timestamp' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getTimestampEnumLiteralDeclaration_10()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:766:1: ( '@Timestamp' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:766:3: '@Timestamp'
                    {
                    match(input,22,FOLLOW_22_in_rule__PrimitiveType__Alternatives1632); 

                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getTimestampEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:771:6: ( ( '@Decimal' ) )
                    {
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:771:6: ( ( '@Decimal' ) )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:772:1: ( '@Decimal' )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDecimalEnumLiteralDeclaration_11()); 
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:773:1: ( '@Decimal' )
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:773:3: '@Decimal'
                    {
                    match(input,23,FOLLOW_23_in_rule__PrimitiveType__Alternatives1653); 

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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:785:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:789:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:790:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
            {
            pushFollow(FOLLOW_rule__Architecture__Group__0__Impl_in_rule__Architecture__Group__01686);
            rule__Architecture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Architecture__Group__1_in_rule__Architecture__Group__01689);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:797:1: rule__Architecture__Group__0__Impl : ( '@applicationId' ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:801:1: ( ( '@applicationId' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:802:1: ( '@applicationId' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:802:1: ( '@applicationId' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:803:1: '@applicationId'
            {
             before(grammarAccess.getArchitectureAccess().getApplicationIdKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Architecture__Group__0__Impl1717); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:816:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:820:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:821:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
            {
            pushFollow(FOLLOW_rule__Architecture__Group__1__Impl_in_rule__Architecture__Group__11748);
            rule__Architecture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Architecture__Group__2_in_rule__Architecture__Group__11751);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:828:1: rule__Architecture__Group__1__Impl : ( ':' ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:832:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:833:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:833:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:834:1: ':'
            {
             before(grammarAccess.getArchitectureAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Architecture__Group__1__Impl1779); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:847:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl rule__Architecture__Group__3 ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:851:1: ( rule__Architecture__Group__2__Impl rule__Architecture__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:852:2: rule__Architecture__Group__2__Impl rule__Architecture__Group__3
            {
            pushFollow(FOLLOW_rule__Architecture__Group__2__Impl_in_rule__Architecture__Group__21810);
            rule__Architecture__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Architecture__Group__3_in_rule__Architecture__Group__21813);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:859:1: rule__Architecture__Group__2__Impl : ( ( rule__Architecture__NameAssignment_2 ) ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:863:1: ( ( ( rule__Architecture__NameAssignment_2 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:864:1: ( ( rule__Architecture__NameAssignment_2 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:864:1: ( ( rule__Architecture__NameAssignment_2 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:865:1: ( rule__Architecture__NameAssignment_2 )
            {
             before(grammarAccess.getArchitectureAccess().getNameAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:866:1: ( rule__Architecture__NameAssignment_2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:866:2: rule__Architecture__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Architecture__NameAssignment_2_in_rule__Architecture__Group__2__Impl1840);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:876:1: rule__Architecture__Group__3 : rule__Architecture__Group__3__Impl ;
    public final void rule__Architecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:880:1: ( rule__Architecture__Group__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:881:2: rule__Architecture__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Architecture__Group__3__Impl_in_rule__Architecture__Group__31870);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:887:1: rule__Architecture__Group__3__Impl : ( ( rule__Architecture__ModuleAssignment_3 ) ) ;
    public final void rule__Architecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:891:1: ( ( ( rule__Architecture__ModuleAssignment_3 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:892:1: ( ( rule__Architecture__ModuleAssignment_3 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:892:1: ( ( rule__Architecture__ModuleAssignment_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:893:1: ( rule__Architecture__ModuleAssignment_3 )
            {
             before(grammarAccess.getArchitectureAccess().getModuleAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:894:1: ( rule__Architecture__ModuleAssignment_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:894:2: rule__Architecture__ModuleAssignment_3
            {
            pushFollow(FOLLOW_rule__Architecture__ModuleAssignment_3_in_rule__Architecture__Group__3__Impl1897);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:912:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:916:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:917:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__01935);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__01938);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:924:1: rule__Module__Group__0__Impl : ( '@moduleName' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:928:1: ( ( '@moduleName' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:929:1: ( '@moduleName' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:929:1: ( '@moduleName' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:930:1: '@moduleName'
            {
             before(grammarAccess.getModuleAccess().getModuleNameKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Module__Group__0__Impl1966); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:943:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:947:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:948:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__11997);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__12000);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:955:1: rule__Module__Group__1__Impl : ( ':' ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:959:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:960:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:960:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:961:1: ':'
            {
             before(grammarAccess.getModuleAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Module__Group__1__Impl2028); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:974:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:978:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:979:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__22059);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__3_in_rule__Module__Group__22062);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:986:1: rule__Module__Group__2__Impl : ( ( rule__Module__NameAssignment_2 ) ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:990:1: ( ( ( rule__Module__NameAssignment_2 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:991:1: ( ( rule__Module__NameAssignment_2 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:991:1: ( ( rule__Module__NameAssignment_2 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:992:1: ( rule__Module__NameAssignment_2 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:993:1: ( rule__Module__NameAssignment_2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:993:2: rule__Module__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl2089);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1003:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1007:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1008:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__32119);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__4_in_rule__Module__Group__32122);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1015:1: rule__Module__Group__3__Impl : ( '@version' ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1019:1: ( ( '@version' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1020:1: ( '@version' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1020:1: ( '@version' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1021:1: '@version'
            {
             before(grammarAccess.getModuleAccess().getVersionKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__Module__Group__3__Impl2150); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1034:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1038:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1039:2: rule__Module__Group__4__Impl rule__Module__Group__5
            {
            pushFollow(FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__42181);
            rule__Module__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__5_in_rule__Module__Group__42184);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1046:1: rule__Module__Group__4__Impl : ( ':' ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1050:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1051:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1051:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1052:1: ':'
            {
             before(grammarAccess.getModuleAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Module__Group__4__Impl2212); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1065:1: rule__Module__Group__5 : rule__Module__Group__5__Impl rule__Module__Group__6 ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1069:1: ( rule__Module__Group__5__Impl rule__Module__Group__6 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1070:2: rule__Module__Group__5__Impl rule__Module__Group__6
            {
            pushFollow(FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__52243);
            rule__Module__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__6_in_rule__Module__Group__52246);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1077:1: rule__Module__Group__5__Impl : ( ( rule__Module__VersionAssignment_5 ) ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1081:1: ( ( ( rule__Module__VersionAssignment_5 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1082:1: ( ( rule__Module__VersionAssignment_5 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1082:1: ( ( rule__Module__VersionAssignment_5 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1083:1: ( rule__Module__VersionAssignment_5 )
            {
             before(grammarAccess.getModuleAccess().getVersionAssignment_5()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1084:1: ( rule__Module__VersionAssignment_5 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1084:2: rule__Module__VersionAssignment_5
            {
            pushFollow(FOLLOW_rule__Module__VersionAssignment_5_in_rule__Module__Group__5__Impl2273);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1094:1: rule__Module__Group__6 : rule__Module__Group__6__Impl rule__Module__Group__7 ;
    public final void rule__Module__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1098:1: ( rule__Module__Group__6__Impl rule__Module__Group__7 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1099:2: rule__Module__Group__6__Impl rule__Module__Group__7
            {
            pushFollow(FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__62303);
            rule__Module__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__7_in_rule__Module__Group__62306);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1106:1: rule__Module__Group__6__Impl : ( ( rule__Module__ImportsAssignment_6 )* ) ;
    public final void rule__Module__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1110:1: ( ( ( rule__Module__ImportsAssignment_6 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1111:1: ( ( rule__Module__ImportsAssignment_6 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1111:1: ( ( rule__Module__ImportsAssignment_6 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1112:1: ( rule__Module__ImportsAssignment_6 )*
            {
             before(grammarAccess.getModuleAccess().getImportsAssignment_6()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1113:1: ( rule__Module__ImportsAssignment_6 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==30) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1113:2: rule__Module__ImportsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Module__ImportsAssignment_6_in_rule__Module__Group__6__Impl2333);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1123:1: rule__Module__Group__7 : rule__Module__Group__7__Impl rule__Module__Group__8 ;
    public final void rule__Module__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1127:1: ( rule__Module__Group__7__Impl rule__Module__Group__8 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1128:2: rule__Module__Group__7__Impl rule__Module__Group__8
            {
            pushFollow(FOLLOW_rule__Module__Group__7__Impl_in_rule__Module__Group__72364);
            rule__Module__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__8_in_rule__Module__Group__72367);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1135:1: rule__Module__Group__7__Impl : ( ( rule__Module__ModelAssignment_7 )? ) ;
    public final void rule__Module__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1139:1: ( ( ( rule__Module__ModelAssignment_7 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1140:1: ( ( rule__Module__ModelAssignment_7 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1140:1: ( ( rule__Module__ModelAssignment_7 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1141:1: ( rule__Module__ModelAssignment_7 )?
            {
             before(grammarAccess.getModuleAccess().getModelAssignment_7()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1142:1: ( rule__Module__ModelAssignment_7 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1142:2: rule__Module__ModelAssignment_7
                    {
                    pushFollow(FOLLOW_rule__Module__ModelAssignment_7_in_rule__Module__Group__7__Impl2394);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1152:1: rule__Module__Group__8 : rule__Module__Group__8__Impl rule__Module__Group__9 ;
    public final void rule__Module__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1156:1: ( rule__Module__Group__8__Impl rule__Module__Group__9 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1157:2: rule__Module__Group__8__Impl rule__Module__Group__9
            {
            pushFollow(FOLLOW_rule__Module__Group__8__Impl_in_rule__Module__Group__82425);
            rule__Module__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__9_in_rule__Module__Group__82428);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1164:1: rule__Module__Group__8__Impl : ( ( rule__Module__ExceptionsAssignment_8 )? ) ;
    public final void rule__Module__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1168:1: ( ( ( rule__Module__ExceptionsAssignment_8 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1169:1: ( ( rule__Module__ExceptionsAssignment_8 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1169:1: ( ( rule__Module__ExceptionsAssignment_8 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1170:1: ( rule__Module__ExceptionsAssignment_8 )?
            {
             before(grammarAccess.getModuleAccess().getExceptionsAssignment_8()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1171:1: ( rule__Module__ExceptionsAssignment_8 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==39) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1171:2: rule__Module__ExceptionsAssignment_8
                    {
                    pushFollow(FOLLOW_rule__Module__ExceptionsAssignment_8_in_rule__Module__Group__8__Impl2455);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1181:1: rule__Module__Group__9 : rule__Module__Group__9__Impl rule__Module__Group__10 ;
    public final void rule__Module__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1185:1: ( rule__Module__Group__9__Impl rule__Module__Group__10 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1186:2: rule__Module__Group__9__Impl rule__Module__Group__10
            {
            pushFollow(FOLLOW_rule__Module__Group__9__Impl_in_rule__Module__Group__92486);
            rule__Module__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__10_in_rule__Module__Group__92489);
            rule__Module__Group__10();

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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1193:1: rule__Module__Group__9__Impl : ( ( rule__Module__ServicesAssignment_9 )* ) ;
    public final void rule__Module__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1197:1: ( ( ( rule__Module__ServicesAssignment_9 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1198:1: ( ( rule__Module__ServicesAssignment_9 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1198:1: ( ( rule__Module__ServicesAssignment_9 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1199:1: ( rule__Module__ServicesAssignment_9 )*
            {
             before(grammarAccess.getModuleAccess().getServicesAssignment_9()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1200:1: ( rule__Module__ServicesAssignment_9 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==42) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1200:2: rule__Module__ServicesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Module__ServicesAssignment_9_in_rule__Module__Group__9__Impl2516);
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


    // $ANTLR start "rule__Module__Group__10"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1210:1: rule__Module__Group__10 : rule__Module__Group__10__Impl ;
    public final void rule__Module__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1214:1: ( rule__Module__Group__10__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1215:2: rule__Module__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__10__Impl_in_rule__Module__Group__102547);
            rule__Module__Group__10__Impl();

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
    // $ANTLR end "rule__Module__Group__10"


    // $ANTLR start "rule__Module__Group__10__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1221:1: rule__Module__Group__10__Impl : ( ( rule__Module__EventAssignment_10 )? ) ;
    public final void rule__Module__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1225:1: ( ( ( rule__Module__EventAssignment_10 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1226:1: ( ( rule__Module__EventAssignment_10 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1226:1: ( ( rule__Module__EventAssignment_10 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1227:1: ( rule__Module__EventAssignment_10 )?
            {
             before(grammarAccess.getModuleAccess().getEventAssignment_10()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1228:1: ( rule__Module__EventAssignment_10 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==47) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1228:2: rule__Module__EventAssignment_10
                    {
                    pushFollow(FOLLOW_rule__Module__EventAssignment_10_in_rule__Module__Group__10__Impl2574);
                    rule__Module__EventAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getEventAssignment_10()); 

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
    // $ANTLR end "rule__Module__Group__10__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1260:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1264:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1265:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02627);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02630);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1272:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1276:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1277:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1277:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1278:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2657); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1289:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1293:1: ( rule__QualifiedName__Group__1__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1294:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12686);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1300:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1304:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1305:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1305:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1306:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1307:1: ( rule__QualifiedName__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1307:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2713);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1321:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1325:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1326:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02748);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02751);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1333:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1337:1: ( ( '.' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1338:1: ( '.' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1338:1: ( '.' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1339:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__QualifiedName__Group_1__0__Impl2779); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1352:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1356:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1357:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12810);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1363:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1367:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1368:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1368:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1369:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2837); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1384:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1388:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1389:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__02870);
            rule__Version__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group__1_in_rule__Version__Group__02873);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1396:1: rule__Version__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1400:1: ( ( RULE_INT ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1401:1: ( RULE_INT )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1401:1: ( RULE_INT )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1402:1: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Version__Group__0__Impl2900); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1413:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1417:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1418:2: rule__Version__Group__1__Impl rule__Version__Group__2
            {
            pushFollow(FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__12929);
            rule__Version__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group__2_in_rule__Version__Group__12932);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1425:1: rule__Version__Group__1__Impl : ( '.' ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1429:1: ( ( '.' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1430:1: ( '.' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1430:1: ( '.' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1431:1: '.'
            {
             before(grammarAccess.getVersionAccess().getFullStopKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__Version__Group__1__Impl2960); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1444:1: rule__Version__Group__2 : rule__Version__Group__2__Impl rule__Version__Group__3 ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1448:1: ( rule__Version__Group__2__Impl rule__Version__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1449:2: rule__Version__Group__2__Impl rule__Version__Group__3
            {
            pushFollow(FOLLOW_rule__Version__Group__2__Impl_in_rule__Version__Group__22991);
            rule__Version__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group__3_in_rule__Version__Group__22994);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1456:1: rule__Version__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1460:1: ( ( RULE_INT ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1461:1: ( RULE_INT )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1461:1: ( RULE_INT )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1462:1: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Version__Group__2__Impl3021); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1473:1: rule__Version__Group__3 : rule__Version__Group__3__Impl rule__Version__Group__4 ;
    public final void rule__Version__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1477:1: ( rule__Version__Group__3__Impl rule__Version__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1478:2: rule__Version__Group__3__Impl rule__Version__Group__4
            {
            pushFollow(FOLLOW_rule__Version__Group__3__Impl_in_rule__Version__Group__33050);
            rule__Version__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group__4_in_rule__Version__Group__33053);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1485:1: rule__Version__Group__3__Impl : ( '.' ) ;
    public final void rule__Version__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1489:1: ( ( '.' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1490:1: ( '.' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1490:1: ( '.' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1491:1: '.'
            {
             before(grammarAccess.getVersionAccess().getFullStopKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__Version__Group__3__Impl3081); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1504:1: rule__Version__Group__4 : rule__Version__Group__4__Impl rule__Version__Group__5 ;
    public final void rule__Version__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1508:1: ( rule__Version__Group__4__Impl rule__Version__Group__5 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1509:2: rule__Version__Group__4__Impl rule__Version__Group__5
            {
            pushFollow(FOLLOW_rule__Version__Group__4__Impl_in_rule__Version__Group__43112);
            rule__Version__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group__5_in_rule__Version__Group__43115);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1516:1: rule__Version__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1520:1: ( ( RULE_INT ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1521:1: ( RULE_INT )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1521:1: ( RULE_INT )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1522:1: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Version__Group__4__Impl3142); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1533:1: rule__Version__Group__5 : rule__Version__Group__5__Impl ;
    public final void rule__Version__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1537:1: ( rule__Version__Group__5__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1538:2: rule__Version__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group__5__Impl_in_rule__Version__Group__53171);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1544:1: rule__Version__Group__5__Impl : ( ( rule__Version__Group_5__0 )? ) ;
    public final void rule__Version__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1548:1: ( ( ( rule__Version__Group_5__0 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1549:1: ( ( rule__Version__Group_5__0 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1549:1: ( ( rule__Version__Group_5__0 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1550:1: ( rule__Version__Group_5__0 )?
            {
             before(grammarAccess.getVersionAccess().getGroup_5()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1551:1: ( rule__Version__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1551:2: rule__Version__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Version__Group_5__0_in_rule__Version__Group__5__Impl3198);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1573:1: rule__Version__Group_5__0 : rule__Version__Group_5__0__Impl rule__Version__Group_5__1 ;
    public final void rule__Version__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1577:1: ( rule__Version__Group_5__0__Impl rule__Version__Group_5__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1578:2: rule__Version__Group_5__0__Impl rule__Version__Group_5__1
            {
            pushFollow(FOLLOW_rule__Version__Group_5__0__Impl_in_rule__Version__Group_5__03241);
            rule__Version__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group_5__1_in_rule__Version__Group_5__03244);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1585:1: rule__Version__Group_5__0__Impl : ( '-' ) ;
    public final void rule__Version__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1589:1: ( ( '-' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1590:1: ( '-' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1590:1: ( '-' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1591:1: '-'
            {
             before(grammarAccess.getVersionAccess().getHyphenMinusKeyword_5_0()); 
            match(input,29,FOLLOW_29_in_rule__Version__Group_5__0__Impl3272); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1604:1: rule__Version__Group_5__1 : rule__Version__Group_5__1__Impl ;
    public final void rule__Version__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1608:1: ( rule__Version__Group_5__1__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1609:2: rule__Version__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group_5__1__Impl_in_rule__Version__Group_5__13303);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1615:1: rule__Version__Group_5__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1619:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1620:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1620:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1621:1: RULE_ID
            {
             before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_5_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Version__Group_5__1__Impl3330); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1636:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1640:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1641:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03363);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03366);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1648:1: rule__Import__Group__0__Impl : ( '@import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1652:1: ( ( '@import' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1653:1: ( '@import' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1653:1: ( '@import' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1654:1: '@import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Import__Group__0__Impl3394); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1667:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1671:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1672:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13425);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__2_in_rule__Import__Group__13428);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1679:1: rule__Import__Group__1__Impl : ( ':' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1683:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1684:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1684:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1685:1: ':'
            {
             before(grammarAccess.getImportAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Import__Group__1__Impl3456); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1698:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1702:1: ( rule__Import__Group__2__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1703:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__23487);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1709:1: rule__Import__Group__2__Impl : ( ( rule__Import__ImportedNamespaceAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1713:1: ( ( ( rule__Import__ImportedNamespaceAssignment_2 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1714:1: ( ( rule__Import__ImportedNamespaceAssignment_2 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1714:1: ( ( rule__Import__ImportedNamespaceAssignment_2 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1715:1: ( rule__Import__ImportedNamespaceAssignment_2 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1716:1: ( rule__Import__ImportedNamespaceAssignment_2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1716:2: rule__Import__ImportedNamespaceAssignment_2
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_2_in_rule__Import__Group__2__Impl3514);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1732:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1736:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1737:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03550);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03553);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1744:1: rule__Model__Group__0__Impl : ( '@model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1748:1: ( ( '@model' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1749:1: ( '@model' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1749:1: ( '@model' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1750:1: '@model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Model__Group__0__Impl3581); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1763:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1767:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1768:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13612);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13615);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1775:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1779:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1780:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1780:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1781:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Model__Group__1__Impl3643); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1794:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1798:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1799:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23674);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__23677);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1806:1: rule__Model__Group__2__Impl : ( ( ( rule__Model__EntitiesAssignment_2 ) ) ( ( rule__Model__EntitiesAssignment_2 )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1810:1: ( ( ( ( rule__Model__EntitiesAssignment_2 ) ) ( ( rule__Model__EntitiesAssignment_2 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1811:1: ( ( ( rule__Model__EntitiesAssignment_2 ) ) ( ( rule__Model__EntitiesAssignment_2 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1811:1: ( ( ( rule__Model__EntitiesAssignment_2 ) ) ( ( rule__Model__EntitiesAssignment_2 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1812:1: ( ( rule__Model__EntitiesAssignment_2 ) ) ( ( rule__Model__EntitiesAssignment_2 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1812:1: ( ( rule__Model__EntitiesAssignment_2 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1813:1: ( rule__Model__EntitiesAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1814:1: ( rule__Model__EntitiesAssignment_2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1814:2: rule__Model__EntitiesAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__EntitiesAssignment_2_in_rule__Model__Group__2__Impl3706);
            rule__Model__EntitiesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getEntitiesAssignment_2()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1817:1: ( ( rule__Model__EntitiesAssignment_2 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1818:1: ( rule__Model__EntitiesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1819:1: ( rule__Model__EntitiesAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=34 && LA11_0<=35)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1819:2: rule__Model__EntitiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__EntitiesAssignment_2_in_rule__Model__Group__2__Impl3718);
            	    rule__Model__EntitiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1830:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1834:1: ( rule__Model__Group__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1835:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33751);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1841:1: rule__Model__Group__3__Impl : ( '}' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1845:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1846:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1846:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1847:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__Model__Group__3__Impl3779); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1868:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1872:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1873:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__03818);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__03821);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1880:1: rule__Enum__Group__0__Impl : ( '@enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1884:1: ( ( '@enum' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1885:1: ( '@enum' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1885:1: ( '@enum' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1886:1: '@enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Enum__Group__0__Impl3849); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1899:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1903:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1904:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__13880);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__13883);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1911:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1915:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1916:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1916:1: ( ( rule__Enum__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1917:1: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1918:1: ( rule__Enum__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1918:2: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl3910);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1928:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1932:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1933:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__23940);
            rule__Enum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__23943);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1940:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1944:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1945:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1945:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1946:1: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Enum__Group__2__Impl3971); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1959:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1963:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1964:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__34002);
            rule__Enum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__34005);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1971:1: rule__Enum__Group__3__Impl : ( ( ( rule__Enum__FeaturesAssignment_3 ) ) ( ( rule__Enum__FeaturesAssignment_3 )* ) ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1975:1: ( ( ( ( rule__Enum__FeaturesAssignment_3 ) ) ( ( rule__Enum__FeaturesAssignment_3 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1976:1: ( ( ( rule__Enum__FeaturesAssignment_3 ) ) ( ( rule__Enum__FeaturesAssignment_3 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1976:1: ( ( ( rule__Enum__FeaturesAssignment_3 ) ) ( ( rule__Enum__FeaturesAssignment_3 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1977:1: ( ( rule__Enum__FeaturesAssignment_3 ) ) ( ( rule__Enum__FeaturesAssignment_3 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1977:1: ( ( rule__Enum__FeaturesAssignment_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1978:1: ( rule__Enum__FeaturesAssignment_3 )
            {
             before(grammarAccess.getEnumAccess().getFeaturesAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1979:1: ( rule__Enum__FeaturesAssignment_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1979:2: rule__Enum__FeaturesAssignment_3
            {
            pushFollow(FOLLOW_rule__Enum__FeaturesAssignment_3_in_rule__Enum__Group__3__Impl4034);
            rule__Enum__FeaturesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getFeaturesAssignment_3()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1982:1: ( ( rule__Enum__FeaturesAssignment_3 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1983:1: ( rule__Enum__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getEnumAccess().getFeaturesAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1984:1: ( rule__Enum__FeaturesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1984:2: rule__Enum__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enum__FeaturesAssignment_3_in_rule__Enum__Group__3__Impl4046);
            	    rule__Enum__FeaturesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1995:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1999:1: ( rule__Enum__Group__4__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2000:2: rule__Enum__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__44079);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2006:1: rule__Enum__Group__4__Impl : ( '}' ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2010:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2011:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2011:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2012:1: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__Enum__Group__4__Impl4107); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2035:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2039:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2040:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__04148);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__04151);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2047:1: rule__Entity__Group__0__Impl : ( '@entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2051:1: ( ( '@entity' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2052:1: ( '@entity' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2052:1: ( '@entity' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2053:1: '@entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Entity__Group__0__Impl4179); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2066:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2070:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2071:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__14210);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__14213);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2078:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2082:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2083:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2083:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2084:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2085:1: ( rule__Entity__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2085:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl4240);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2095:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2099:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2100:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__24270);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__24273);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2107:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2111:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2112:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2112:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2113:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Entity__Group__2__Impl4301); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2126:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2130:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2131:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__34332);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__34335);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2138:1: rule__Entity__Group__3__Impl : ( ( ( rule__Entity__FeaturesAssignment_3 ) ) ( ( rule__Entity__FeaturesAssignment_3 )* ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2142:1: ( ( ( ( rule__Entity__FeaturesAssignment_3 ) ) ( ( rule__Entity__FeaturesAssignment_3 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2143:1: ( ( ( rule__Entity__FeaturesAssignment_3 ) ) ( ( rule__Entity__FeaturesAssignment_3 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2143:1: ( ( ( rule__Entity__FeaturesAssignment_3 ) ) ( ( rule__Entity__FeaturesAssignment_3 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2144:1: ( ( rule__Entity__FeaturesAssignment_3 ) ) ( ( rule__Entity__FeaturesAssignment_3 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2144:1: ( ( rule__Entity__FeaturesAssignment_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2145:1: ( rule__Entity__FeaturesAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2146:1: ( rule__Entity__FeaturesAssignment_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2146:2: rule__Entity__FeaturesAssignment_3
            {
            pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl4364);
            rule__Entity__FeaturesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2149:1: ( ( rule__Entity__FeaturesAssignment_3 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2150:1: ( rule__Entity__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2151:1: ( rule__Entity__FeaturesAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==RULE_COMMENTS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2151:2: rule__Entity__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl4376);
            	    rule__Entity__FeaturesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2162:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2166:1: ( rule__Entity__Group__4__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2167:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__44409);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2173:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2177:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2178:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2178:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2179:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__Entity__Group__4__Impl4437); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2202:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2206:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2207:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__04478);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__04481);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2214:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__FeatureCommentAssignment_0 )* ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2218:1: ( ( ( rule__Feature__FeatureCommentAssignment_0 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2219:1: ( ( rule__Feature__FeatureCommentAssignment_0 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2219:1: ( ( rule__Feature__FeatureCommentAssignment_0 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2220:1: ( rule__Feature__FeatureCommentAssignment_0 )*
            {
             before(grammarAccess.getFeatureAccess().getFeatureCommentAssignment_0()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2221:1: ( rule__Feature__FeatureCommentAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMENTS) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2221:2: rule__Feature__FeatureCommentAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Feature__FeatureCommentAssignment_0_in_rule__Feature__Group__0__Impl4508);
            	    rule__Feature__FeatureCommentAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2231:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2235:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2236:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__14539);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__14542);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2243:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2247:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2248:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2248:1: ( ( rule__Feature__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2249:1: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2250:1: ( rule__Feature__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2250:2: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl4569);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2260:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2264:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2265:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__24599);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__24602);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2272:1: rule__Feature__Group__2__Impl : ( ':' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2276:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2277:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2277:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2278:1: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Feature__Group__2__Impl4630); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2291:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2295:1: ( rule__Feature__Group__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2296:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__34661);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2302:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2306:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2307:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2307:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2308:1: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2309:1: ( rule__Feature__TypeAssignment_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2309:2: rule__Feature__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl4688);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2327:1: rule__GenericListFeature__Group__0 : rule__GenericListFeature__Group__0__Impl rule__GenericListFeature__Group__1 ;
    public final void rule__GenericListFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2331:1: ( rule__GenericListFeature__Group__0__Impl rule__GenericListFeature__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2332:2: rule__GenericListFeature__Group__0__Impl rule__GenericListFeature__Group__1
            {
            pushFollow(FOLLOW_rule__GenericListFeature__Group__0__Impl_in_rule__GenericListFeature__Group__04726);
            rule__GenericListFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericListFeature__Group__1_in_rule__GenericListFeature__Group__04729);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2339:1: rule__GenericListFeature__Group__0__Impl : ( '@List' ) ;
    public final void rule__GenericListFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2343:1: ( ( '@List' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2344:1: ( '@List' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2344:1: ( '@List' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2345:1: '@List'
            {
             before(grammarAccess.getGenericListFeatureAccess().getListKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__GenericListFeature__Group__0__Impl4757); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2358:1: rule__GenericListFeature__Group__1 : rule__GenericListFeature__Group__1__Impl rule__GenericListFeature__Group__2 ;
    public final void rule__GenericListFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2362:1: ( rule__GenericListFeature__Group__1__Impl rule__GenericListFeature__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2363:2: rule__GenericListFeature__Group__1__Impl rule__GenericListFeature__Group__2
            {
            pushFollow(FOLLOW_rule__GenericListFeature__Group__1__Impl_in_rule__GenericListFeature__Group__14788);
            rule__GenericListFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericListFeature__Group__2_in_rule__GenericListFeature__Group__14791);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2370:1: rule__GenericListFeature__Group__1__Impl : ( '<' ) ;
    public final void rule__GenericListFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2374:1: ( ( '<' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2375:1: ( '<' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2375:1: ( '<' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2376:1: '<'
            {
             before(grammarAccess.getGenericListFeatureAccess().getLessThanSignKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__GenericListFeature__Group__1__Impl4819); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2389:1: rule__GenericListFeature__Group__2 : rule__GenericListFeature__Group__2__Impl rule__GenericListFeature__Group__3 ;
    public final void rule__GenericListFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2393:1: ( rule__GenericListFeature__Group__2__Impl rule__GenericListFeature__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2394:2: rule__GenericListFeature__Group__2__Impl rule__GenericListFeature__Group__3
            {
            pushFollow(FOLLOW_rule__GenericListFeature__Group__2__Impl_in_rule__GenericListFeature__Group__24850);
            rule__GenericListFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericListFeature__Group__3_in_rule__GenericListFeature__Group__24853);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2401:1: rule__GenericListFeature__Group__2__Impl : ( ( rule__GenericListFeature__TypeAssignment_2 ) ) ;
    public final void rule__GenericListFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2405:1: ( ( ( rule__GenericListFeature__TypeAssignment_2 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2406:1: ( ( rule__GenericListFeature__TypeAssignment_2 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2406:1: ( ( rule__GenericListFeature__TypeAssignment_2 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2407:1: ( rule__GenericListFeature__TypeAssignment_2 )
            {
             before(grammarAccess.getGenericListFeatureAccess().getTypeAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2408:1: ( rule__GenericListFeature__TypeAssignment_2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2408:2: rule__GenericListFeature__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__GenericListFeature__TypeAssignment_2_in_rule__GenericListFeature__Group__2__Impl4880);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2418:1: rule__GenericListFeature__Group__3 : rule__GenericListFeature__Group__3__Impl ;
    public final void rule__GenericListFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2422:1: ( rule__GenericListFeature__Group__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2423:2: rule__GenericListFeature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GenericListFeature__Group__3__Impl_in_rule__GenericListFeature__Group__34910);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2429:1: rule__GenericListFeature__Group__3__Impl : ( '>' ) ;
    public final void rule__GenericListFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2433:1: ( ( '>' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2434:1: ( '>' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2434:1: ( '>' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2435:1: '>'
            {
             before(grammarAccess.getGenericListFeatureAccess().getGreaterThanSignKeyword_3()); 
            match(input,38,FOLLOW_38_in_rule__GenericListFeature__Group__3__Impl4938); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2456:1: rule__Exceptions__Group__0 : rule__Exceptions__Group__0__Impl rule__Exceptions__Group__1 ;
    public final void rule__Exceptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2460:1: ( rule__Exceptions__Group__0__Impl rule__Exceptions__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2461:2: rule__Exceptions__Group__0__Impl rule__Exceptions__Group__1
            {
            pushFollow(FOLLOW_rule__Exceptions__Group__0__Impl_in_rule__Exceptions__Group__04977);
            rule__Exceptions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exceptions__Group__1_in_rule__Exceptions__Group__04980);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2468:1: rule__Exceptions__Group__0__Impl : ( '@exceptions' ) ;
    public final void rule__Exceptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2472:1: ( ( '@exceptions' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2473:1: ( '@exceptions' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2473:1: ( '@exceptions' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2474:1: '@exceptions'
            {
             before(grammarAccess.getExceptionsAccess().getExceptionsKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Exceptions__Group__0__Impl5008); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2487:1: rule__Exceptions__Group__1 : rule__Exceptions__Group__1__Impl rule__Exceptions__Group__2 ;
    public final void rule__Exceptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2491:1: ( rule__Exceptions__Group__1__Impl rule__Exceptions__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2492:2: rule__Exceptions__Group__1__Impl rule__Exceptions__Group__2
            {
            pushFollow(FOLLOW_rule__Exceptions__Group__1__Impl_in_rule__Exceptions__Group__15039);
            rule__Exceptions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exceptions__Group__2_in_rule__Exceptions__Group__15042);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2499:1: rule__Exceptions__Group__1__Impl : ( '{' ) ;
    public final void rule__Exceptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2503:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2504:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2504:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2505:1: '{'
            {
             before(grammarAccess.getExceptionsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Exceptions__Group__1__Impl5070); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2518:1: rule__Exceptions__Group__2 : rule__Exceptions__Group__2__Impl rule__Exceptions__Group__3 ;
    public final void rule__Exceptions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2522:1: ( rule__Exceptions__Group__2__Impl rule__Exceptions__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2523:2: rule__Exceptions__Group__2__Impl rule__Exceptions__Group__3
            {
            pushFollow(FOLLOW_rule__Exceptions__Group__2__Impl_in_rule__Exceptions__Group__25101);
            rule__Exceptions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exceptions__Group__3_in_rule__Exceptions__Group__25104);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2530:1: rule__Exceptions__Group__2__Impl : ( ( ( rule__Exceptions__ExceptionsAssignment_2 ) ) ( ( rule__Exceptions__ExceptionsAssignment_2 )* ) ) ;
    public final void rule__Exceptions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2534:1: ( ( ( ( rule__Exceptions__ExceptionsAssignment_2 ) ) ( ( rule__Exceptions__ExceptionsAssignment_2 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2535:1: ( ( ( rule__Exceptions__ExceptionsAssignment_2 ) ) ( ( rule__Exceptions__ExceptionsAssignment_2 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2535:1: ( ( ( rule__Exceptions__ExceptionsAssignment_2 ) ) ( ( rule__Exceptions__ExceptionsAssignment_2 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2536:1: ( ( rule__Exceptions__ExceptionsAssignment_2 ) ) ( ( rule__Exceptions__ExceptionsAssignment_2 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2536:1: ( ( rule__Exceptions__ExceptionsAssignment_2 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2537:1: ( rule__Exceptions__ExceptionsAssignment_2 )
            {
             before(grammarAccess.getExceptionsAccess().getExceptionsAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2538:1: ( rule__Exceptions__ExceptionsAssignment_2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2538:2: rule__Exceptions__ExceptionsAssignment_2
            {
            pushFollow(FOLLOW_rule__Exceptions__ExceptionsAssignment_2_in_rule__Exceptions__Group__2__Impl5133);
            rule__Exceptions__ExceptionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExceptionsAccess().getExceptionsAssignment_2()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2541:1: ( ( rule__Exceptions__ExceptionsAssignment_2 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2542:1: ( rule__Exceptions__ExceptionsAssignment_2 )*
            {
             before(grammarAccess.getExceptionsAccess().getExceptionsAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2543:1: ( rule__Exceptions__ExceptionsAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==40) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2543:2: rule__Exceptions__ExceptionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Exceptions__ExceptionsAssignment_2_in_rule__Exceptions__Group__2__Impl5145);
            	    rule__Exceptions__ExceptionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2554:1: rule__Exceptions__Group__3 : rule__Exceptions__Group__3__Impl ;
    public final void rule__Exceptions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2558:1: ( rule__Exceptions__Group__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2559:2: rule__Exceptions__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Exceptions__Group__3__Impl_in_rule__Exceptions__Group__35178);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2565:1: rule__Exceptions__Group__3__Impl : ( '}' ) ;
    public final void rule__Exceptions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2569:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2570:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2570:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2571:1: '}'
            {
             before(grammarAccess.getExceptionsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__Exceptions__Group__3__Impl5206); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2592:1: rule__Exception__Group__0 : rule__Exception__Group__0__Impl rule__Exception__Group__1 ;
    public final void rule__Exception__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2596:1: ( rule__Exception__Group__0__Impl rule__Exception__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2597:2: rule__Exception__Group__0__Impl rule__Exception__Group__1
            {
            pushFollow(FOLLOW_rule__Exception__Group__0__Impl_in_rule__Exception__Group__05245);
            rule__Exception__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__1_in_rule__Exception__Group__05248);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2604:1: rule__Exception__Group__0__Impl : ( '@exception' ) ;
    public final void rule__Exception__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2608:1: ( ( '@exception' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2609:1: ( '@exception' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2609:1: ( '@exception' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2610:1: '@exception'
            {
             before(grammarAccess.getExceptionAccess().getExceptionKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Exception__Group__0__Impl5276); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2623:1: rule__Exception__Group__1 : rule__Exception__Group__1__Impl rule__Exception__Group__2 ;
    public final void rule__Exception__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2627:1: ( rule__Exception__Group__1__Impl rule__Exception__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2628:2: rule__Exception__Group__1__Impl rule__Exception__Group__2
            {
            pushFollow(FOLLOW_rule__Exception__Group__1__Impl_in_rule__Exception__Group__15307);
            rule__Exception__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__2_in_rule__Exception__Group__15310);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2635:1: rule__Exception__Group__1__Impl : ( ( rule__Exception__NameAssignment_1 ) ) ;
    public final void rule__Exception__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2639:1: ( ( ( rule__Exception__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2640:1: ( ( rule__Exception__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2640:1: ( ( rule__Exception__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2641:1: ( rule__Exception__NameAssignment_1 )
            {
             before(grammarAccess.getExceptionAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2642:1: ( rule__Exception__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2642:2: rule__Exception__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Exception__NameAssignment_1_in_rule__Exception__Group__1__Impl5337);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2652:1: rule__Exception__Group__2 : rule__Exception__Group__2__Impl rule__Exception__Group__3 ;
    public final void rule__Exception__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2656:1: ( rule__Exception__Group__2__Impl rule__Exception__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2657:2: rule__Exception__Group__2__Impl rule__Exception__Group__3
            {
            pushFollow(FOLLOW_rule__Exception__Group__2__Impl_in_rule__Exception__Group__25367);
            rule__Exception__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__3_in_rule__Exception__Group__25370);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2664:1: rule__Exception__Group__2__Impl : ( '{' ) ;
    public final void rule__Exception__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2668:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2669:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2669:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2670:1: '{'
            {
             before(grammarAccess.getExceptionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Exception__Group__2__Impl5398); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2683:1: rule__Exception__Group__3 : rule__Exception__Group__3__Impl rule__Exception__Group__4 ;
    public final void rule__Exception__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2687:1: ( rule__Exception__Group__3__Impl rule__Exception__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2688:2: rule__Exception__Group__3__Impl rule__Exception__Group__4
            {
            pushFollow(FOLLOW_rule__Exception__Group__3__Impl_in_rule__Exception__Group__35429);
            rule__Exception__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__4_in_rule__Exception__Group__35432);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2695:1: rule__Exception__Group__3__Impl : ( '@msg' ) ;
    public final void rule__Exception__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2699:1: ( ( '@msg' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2700:1: ( '@msg' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2700:1: ( '@msg' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2701:1: '@msg'
            {
             before(grammarAccess.getExceptionAccess().getMsgKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__Exception__Group__3__Impl5460); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2714:1: rule__Exception__Group__4 : rule__Exception__Group__4__Impl rule__Exception__Group__5 ;
    public final void rule__Exception__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2718:1: ( rule__Exception__Group__4__Impl rule__Exception__Group__5 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2719:2: rule__Exception__Group__4__Impl rule__Exception__Group__5
            {
            pushFollow(FOLLOW_rule__Exception__Group__4__Impl_in_rule__Exception__Group__45491);
            rule__Exception__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__5_in_rule__Exception__Group__45494);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2726:1: rule__Exception__Group__4__Impl : ( ':' ) ;
    public final void rule__Exception__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2730:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2731:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2731:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2732:1: ':'
            {
             before(grammarAccess.getExceptionAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Exception__Group__4__Impl5522); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2745:1: rule__Exception__Group__5 : rule__Exception__Group__5__Impl rule__Exception__Group__6 ;
    public final void rule__Exception__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2749:1: ( rule__Exception__Group__5__Impl rule__Exception__Group__6 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2750:2: rule__Exception__Group__5__Impl rule__Exception__Group__6
            {
            pushFollow(FOLLOW_rule__Exception__Group__5__Impl_in_rule__Exception__Group__55553);
            rule__Exception__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__6_in_rule__Exception__Group__55556);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2757:1: rule__Exception__Group__5__Impl : ( ( rule__Exception__MsgAssignment_5 ) ) ;
    public final void rule__Exception__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2761:1: ( ( ( rule__Exception__MsgAssignment_5 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2762:1: ( ( rule__Exception__MsgAssignment_5 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2762:1: ( ( rule__Exception__MsgAssignment_5 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2763:1: ( rule__Exception__MsgAssignment_5 )
            {
             before(grammarAccess.getExceptionAccess().getMsgAssignment_5()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2764:1: ( rule__Exception__MsgAssignment_5 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2764:2: rule__Exception__MsgAssignment_5
            {
            pushFollow(FOLLOW_rule__Exception__MsgAssignment_5_in_rule__Exception__Group__5__Impl5583);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2774:1: rule__Exception__Group__6 : rule__Exception__Group__6__Impl ;
    public final void rule__Exception__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2778:1: ( rule__Exception__Group__6__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2779:2: rule__Exception__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Exception__Group__6__Impl_in_rule__Exception__Group__65613);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2785:1: rule__Exception__Group__6__Impl : ( '}' ) ;
    public final void rule__Exception__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2789:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2790:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2790:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2791:1: '}'
            {
             before(grammarAccess.getExceptionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_33_in_rule__Exception__Group__6__Impl5641); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2818:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2822:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2823:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__05686);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__05689);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2830:1: rule__Service__Group__0__Impl : ( '@service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2834:1: ( ( '@service' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2835:1: ( '@service' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2835:1: ( '@service' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2836:1: '@service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Service__Group__0__Impl5717); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2849:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2853:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2854:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__15748);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__15751);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2861:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2865:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2866:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2866:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2867:1: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2868:1: ( rule__Service__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2868:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl5778);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2878:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2882:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2883:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__25808);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__25811);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2890:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2894:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2895:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2895:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2896:1: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Service__Group__2__Impl5839); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2909:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2913:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2914:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__35870);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__35873);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2921:1: rule__Service__Group__3__Impl : ( ( ( rule__Service__OperationsAssignment_3 ) ) ( ( rule__Service__OperationsAssignment_3 )* ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2925:1: ( ( ( ( rule__Service__OperationsAssignment_3 ) ) ( ( rule__Service__OperationsAssignment_3 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2926:1: ( ( ( rule__Service__OperationsAssignment_3 ) ) ( ( rule__Service__OperationsAssignment_3 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2926:1: ( ( ( rule__Service__OperationsAssignment_3 ) ) ( ( rule__Service__OperationsAssignment_3 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2927:1: ( ( rule__Service__OperationsAssignment_3 ) ) ( ( rule__Service__OperationsAssignment_3 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2927:1: ( ( rule__Service__OperationsAssignment_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2928:1: ( rule__Service__OperationsAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getOperationsAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2929:1: ( rule__Service__OperationsAssignment_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2929:2: rule__Service__OperationsAssignment_3
            {
            pushFollow(FOLLOW_rule__Service__OperationsAssignment_3_in_rule__Service__Group__3__Impl5902);
            rule__Service__OperationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getOperationsAssignment_3()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2932:1: ( ( rule__Service__OperationsAssignment_3 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2933:1: ( rule__Service__OperationsAssignment_3 )*
            {
             before(grammarAccess.getServiceAccess().getOperationsAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2934:1: ( rule__Service__OperationsAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==43) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2934:2: rule__Service__OperationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Service__OperationsAssignment_3_in_rule__Service__Group__3__Impl5914);
            	    rule__Service__OperationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2945:1: rule__Service__Group__4 : rule__Service__Group__4__Impl ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2949:1: ( rule__Service__Group__4__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2950:2: rule__Service__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__45947);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2956:1: rule__Service__Group__4__Impl : ( '}' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2960:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2961:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2961:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2962:1: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__Service__Group__4__Impl5975); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2985:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2989:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2990:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__06016);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__06019);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2997:1: rule__Operation__Group__0__Impl : ( '@operation' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3001:1: ( ( '@operation' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3002:1: ( '@operation' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3002:1: ( '@operation' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3003:1: '@operation'
            {
             before(grammarAccess.getOperationAccess().getOperationKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__Operation__Group__0__Impl6047); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3016:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3020:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3021:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__16078);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__16081);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3028:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3032:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3033:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3033:1: ( ( rule__Operation__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3034:1: ( rule__Operation__NameAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3035:1: ( rule__Operation__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3035:2: rule__Operation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl6108);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3045:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3049:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3050:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__26138);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__26141);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3057:1: rule__Operation__Group__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3061:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3062:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3062:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3063:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Operation__Group__2__Impl6169); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3076:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3080:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3081:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__36200);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__36203);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3088:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )? ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3092:1: ( ( ( rule__Operation__Group_3__0 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3093:1: ( ( rule__Operation__Group_3__0 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3093:1: ( ( rule__Operation__Group_3__0 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3094:1: ( rule__Operation__Group_3__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3095:1: ( rule__Operation__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==44) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3095:2: rule__Operation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl6230);
                    rule__Operation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_3()); 

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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3105:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3109:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3110:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__46261);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__46264);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3117:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3121:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3122:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3122:1: ( ( rule__Operation__Group_4__0 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3123:1: ( rule__Operation__Group_4__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3124:1: ( rule__Operation__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==45) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3124:2: rule__Operation__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl6291);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3134:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3138:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3139:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__56322);
            rule__Operation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__56325);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3146:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__Group_5__0 )? ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3150:1: ( ( ( rule__Operation__Group_5__0 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3151:1: ( ( rule__Operation__Group_5__0 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3151:1: ( ( rule__Operation__Group_5__0 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3152:1: ( rule__Operation__Group_5__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_5()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3153:1: ( rule__Operation__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3153:2: rule__Operation__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl6352);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3163:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3167:1: ( rule__Operation__Group__6__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3168:2: rule__Operation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__66383);
            rule__Operation__Group__6__Impl();

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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3174:1: rule__Operation__Group__6__Impl : ( '}' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3178:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3179:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3179:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3180:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_33_in_rule__Operation__Group__6__Impl6411); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_6()); 

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


    // $ANTLR start "rule__Operation__Group_3__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3207:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
    public final void rule__Operation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3211:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3212:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__06456);
            rule__Operation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__06459);
            rule__Operation__Group_3__1();

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
    // $ANTLR end "rule__Operation__Group_3__0"


    // $ANTLR start "rule__Operation__Group_3__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3219:1: rule__Operation__Group_3__0__Impl : ( '@input' ) ;
    public final void rule__Operation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3223:1: ( ( '@input' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3224:1: ( '@input' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3224:1: ( '@input' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3225:1: '@input'
            {
             before(grammarAccess.getOperationAccess().getInputKeyword_3_0()); 
            match(input,44,FOLLOW_44_in_rule__Operation__Group_3__0__Impl6487); 
             after(grammarAccess.getOperationAccess().getInputKeyword_3_0()); 

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
    // $ANTLR end "rule__Operation__Group_3__0__Impl"


    // $ANTLR start "rule__Operation__Group_3__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3238:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2 ;
    public final void rule__Operation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3242:1: ( rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3243:2: rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__16518);
            rule__Operation__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__2_in_rule__Operation__Group_3__16521);
            rule__Operation__Group_3__2();

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
    // $ANTLR end "rule__Operation__Group_3__1"


    // $ANTLR start "rule__Operation__Group_3__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3250:1: rule__Operation__Group_3__1__Impl : ( ':' ) ;
    public final void rule__Operation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3254:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3255:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3255:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3256:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_3_1()); 
            match(input,25,FOLLOW_25_in_rule__Operation__Group_3__1__Impl6549); 
             after(grammarAccess.getOperationAccess().getColonKeyword_3_1()); 

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
    // $ANTLR end "rule__Operation__Group_3__1__Impl"


    // $ANTLR start "rule__Operation__Group_3__2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3269:1: rule__Operation__Group_3__2 : rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3 ;
    public final void rule__Operation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3273:1: ( rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3274:2: rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__2__Impl_in_rule__Operation__Group_3__26580);
            rule__Operation__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__3_in_rule__Operation__Group_3__26583);
            rule__Operation__Group_3__3();

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
    // $ANTLR end "rule__Operation__Group_3__2"


    // $ANTLR start "rule__Operation__Group_3__2__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3281:1: rule__Operation__Group_3__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3285:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3286:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3286:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3287:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3_2()); 
            match(input,32,FOLLOW_32_in_rule__Operation__Group_3__2__Impl6611); 
             after(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3_2()); 

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
    // $ANTLR end "rule__Operation__Group_3__2__Impl"


    // $ANTLR start "rule__Operation__Group_3__3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3300:1: rule__Operation__Group_3__3 : rule__Operation__Group_3__3__Impl rule__Operation__Group_3__4 ;
    public final void rule__Operation__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3304:1: ( rule__Operation__Group_3__3__Impl rule__Operation__Group_3__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3305:2: rule__Operation__Group_3__3__Impl rule__Operation__Group_3__4
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__3__Impl_in_rule__Operation__Group_3__36642);
            rule__Operation__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__4_in_rule__Operation__Group_3__36645);
            rule__Operation__Group_3__4();

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
    // $ANTLR end "rule__Operation__Group_3__3"


    // $ANTLR start "rule__Operation__Group_3__3__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3312:1: rule__Operation__Group_3__3__Impl : ( ( ( rule__Operation__FeaturesInputAssignment_3_3 ) ) ( ( rule__Operation__FeaturesInputAssignment_3_3 )* ) ) ;
    public final void rule__Operation__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3316:1: ( ( ( ( rule__Operation__FeaturesInputAssignment_3_3 ) ) ( ( rule__Operation__FeaturesInputAssignment_3_3 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3317:1: ( ( ( rule__Operation__FeaturesInputAssignment_3_3 ) ) ( ( rule__Operation__FeaturesInputAssignment_3_3 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3317:1: ( ( ( rule__Operation__FeaturesInputAssignment_3_3 ) ) ( ( rule__Operation__FeaturesInputAssignment_3_3 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3318:1: ( ( rule__Operation__FeaturesInputAssignment_3_3 ) ) ( ( rule__Operation__FeaturesInputAssignment_3_3 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3318:1: ( ( rule__Operation__FeaturesInputAssignment_3_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3319:1: ( rule__Operation__FeaturesInputAssignment_3_3 )
            {
             before(grammarAccess.getOperationAccess().getFeaturesInputAssignment_3_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3320:1: ( rule__Operation__FeaturesInputAssignment_3_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3320:2: rule__Operation__FeaturesInputAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Operation__FeaturesInputAssignment_3_3_in_rule__Operation__Group_3__3__Impl6674);
            rule__Operation__FeaturesInputAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getFeaturesInputAssignment_3_3()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3323:1: ( ( rule__Operation__FeaturesInputAssignment_3_3 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3324:1: ( rule__Operation__FeaturesInputAssignment_3_3 )*
            {
             before(grammarAccess.getOperationAccess().getFeaturesInputAssignment_3_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3325:1: ( rule__Operation__FeaturesInputAssignment_3_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==RULE_COMMENTS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3325:2: rule__Operation__FeaturesInputAssignment_3_3
            	    {
            	    pushFollow(FOLLOW_rule__Operation__FeaturesInputAssignment_3_3_in_rule__Operation__Group_3__3__Impl6686);
            	    rule__Operation__FeaturesInputAssignment_3_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getFeaturesInputAssignment_3_3()); 

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
    // $ANTLR end "rule__Operation__Group_3__3__Impl"


    // $ANTLR start "rule__Operation__Group_3__4"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3336:1: rule__Operation__Group_3__4 : rule__Operation__Group_3__4__Impl ;
    public final void rule__Operation__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3340:1: ( rule__Operation__Group_3__4__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3341:2: rule__Operation__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__4__Impl_in_rule__Operation__Group_3__46719);
            rule__Operation__Group_3__4__Impl();

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
    // $ANTLR end "rule__Operation__Group_3__4"


    // $ANTLR start "rule__Operation__Group_3__4__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3347:1: rule__Operation__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Operation__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3351:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3352:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3352:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3353:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,33,FOLLOW_33_in_rule__Operation__Group_3__4__Impl6747); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__Operation__Group_3__4__Impl"


    // $ANTLR start "rule__Operation__Group_4__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3376:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3380:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3381:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__06788);
            rule__Operation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__06791);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3388:1: rule__Operation__Group_4__0__Impl : ( '@output' ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3392:1: ( ( '@output' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3393:1: ( '@output' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3393:1: ( '@output' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3394:1: '@output'
            {
             before(grammarAccess.getOperationAccess().getOutputKeyword_4_0()); 
            match(input,45,FOLLOW_45_in_rule__Operation__Group_4__0__Impl6819); 
             after(grammarAccess.getOperationAccess().getOutputKeyword_4_0()); 

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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3407:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2 ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3411:1: ( rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3412:2: rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__16850);
            rule__Operation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__2_in_rule__Operation__Group_4__16853);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3419:1: rule__Operation__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3423:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3424:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3424:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3425:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_4_1()); 
            match(input,25,FOLLOW_25_in_rule__Operation__Group_4__1__Impl6881); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3438:1: rule__Operation__Group_4__2 : rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3 ;
    public final void rule__Operation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3442:1: ( rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3443:2: rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__2__Impl_in_rule__Operation__Group_4__26912);
            rule__Operation__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__3_in_rule__Operation__Group_4__26915);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3450:1: rule__Operation__Group_4__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3454:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3455:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3455:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3456:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_4_2()); 
            match(input,32,FOLLOW_32_in_rule__Operation__Group_4__2__Impl6943); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3469:1: rule__Operation__Group_4__3 : rule__Operation__Group_4__3__Impl rule__Operation__Group_4__4 ;
    public final void rule__Operation__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3473:1: ( rule__Operation__Group_4__3__Impl rule__Operation__Group_4__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3474:2: rule__Operation__Group_4__3__Impl rule__Operation__Group_4__4
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__3__Impl_in_rule__Operation__Group_4__36974);
            rule__Operation__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__4_in_rule__Operation__Group_4__36977);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3481:1: rule__Operation__Group_4__3__Impl : ( ( ( rule__Operation__FeaturesOutputAssignment_4_3 ) ) ( ( rule__Operation__FeaturesOutputAssignment_4_3 )* ) ) ;
    public final void rule__Operation__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3485:1: ( ( ( ( rule__Operation__FeaturesOutputAssignment_4_3 ) ) ( ( rule__Operation__FeaturesOutputAssignment_4_3 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3486:1: ( ( ( rule__Operation__FeaturesOutputAssignment_4_3 ) ) ( ( rule__Operation__FeaturesOutputAssignment_4_3 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3486:1: ( ( ( rule__Operation__FeaturesOutputAssignment_4_3 ) ) ( ( rule__Operation__FeaturesOutputAssignment_4_3 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3487:1: ( ( rule__Operation__FeaturesOutputAssignment_4_3 ) ) ( ( rule__Operation__FeaturesOutputAssignment_4_3 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3487:1: ( ( rule__Operation__FeaturesOutputAssignment_4_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3488:1: ( rule__Operation__FeaturesOutputAssignment_4_3 )
            {
             before(grammarAccess.getOperationAccess().getFeaturesOutputAssignment_4_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3489:1: ( rule__Operation__FeaturesOutputAssignment_4_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3489:2: rule__Operation__FeaturesOutputAssignment_4_3
            {
            pushFollow(FOLLOW_rule__Operation__FeaturesOutputAssignment_4_3_in_rule__Operation__Group_4__3__Impl7006);
            rule__Operation__FeaturesOutputAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getFeaturesOutputAssignment_4_3()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3492:1: ( ( rule__Operation__FeaturesOutputAssignment_4_3 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3493:1: ( rule__Operation__FeaturesOutputAssignment_4_3 )*
            {
             before(grammarAccess.getOperationAccess().getFeaturesOutputAssignment_4_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3494:1: ( rule__Operation__FeaturesOutputAssignment_4_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==RULE_COMMENTS) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3494:2: rule__Operation__FeaturesOutputAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_rule__Operation__FeaturesOutputAssignment_4_3_in_rule__Operation__Group_4__3__Impl7018);
            	    rule__Operation__FeaturesOutputAssignment_4_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getFeaturesOutputAssignment_4_3()); 

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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3505:1: rule__Operation__Group_4__4 : rule__Operation__Group_4__4__Impl ;
    public final void rule__Operation__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3509:1: ( rule__Operation__Group_4__4__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3510:2: rule__Operation__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__4__Impl_in_rule__Operation__Group_4__47051);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3516:1: rule__Operation__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Operation__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3520:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3521:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3521:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3522:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,33,FOLLOW_33_in_rule__Operation__Group_4__4__Impl7079); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3545:1: rule__Operation__Group_5__0 : rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 ;
    public final void rule__Operation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3549:1: ( rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3550:2: rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__07120);
            rule__Operation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__07123);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3557:1: rule__Operation__Group_5__0__Impl : ( '@exception' ) ;
    public final void rule__Operation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3561:1: ( ( '@exception' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3562:1: ( '@exception' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3562:1: ( '@exception' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3563:1: '@exception'
            {
             before(grammarAccess.getOperationAccess().getExceptionKeyword_5_0()); 
            match(input,40,FOLLOW_40_in_rule__Operation__Group_5__0__Impl7151); 
             after(grammarAccess.getOperationAccess().getExceptionKeyword_5_0()); 

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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3576:1: rule__Operation__Group_5__1 : rule__Operation__Group_5__1__Impl rule__Operation__Group_5__2 ;
    public final void rule__Operation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3580:1: ( rule__Operation__Group_5__1__Impl rule__Operation__Group_5__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3581:2: rule__Operation__Group_5__1__Impl rule__Operation__Group_5__2
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__17182);
            rule__Operation__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_5__2_in_rule__Operation__Group_5__17185);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3588:1: rule__Operation__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Operation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3592:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3593:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3593:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3594:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_5_1()); 
            match(input,25,FOLLOW_25_in_rule__Operation__Group_5__1__Impl7213); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3607:1: rule__Operation__Group_5__2 : rule__Operation__Group_5__2__Impl rule__Operation__Group_5__3 ;
    public final void rule__Operation__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3611:1: ( rule__Operation__Group_5__2__Impl rule__Operation__Group_5__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3612:2: rule__Operation__Group_5__2__Impl rule__Operation__Group_5__3
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__2__Impl_in_rule__Operation__Group_5__27244);
            rule__Operation__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_5__3_in_rule__Operation__Group_5__27247);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3619:1: rule__Operation__Group_5__2__Impl : ( ( rule__Operation__ExceptiontsAssignment_5_2 ) ) ;
    public final void rule__Operation__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3623:1: ( ( ( rule__Operation__ExceptiontsAssignment_5_2 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3624:1: ( ( rule__Operation__ExceptiontsAssignment_5_2 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3624:1: ( ( rule__Operation__ExceptiontsAssignment_5_2 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3625:1: ( rule__Operation__ExceptiontsAssignment_5_2 )
            {
             before(grammarAccess.getOperationAccess().getExceptiontsAssignment_5_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3626:1: ( rule__Operation__ExceptiontsAssignment_5_2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3626:2: rule__Operation__ExceptiontsAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Operation__ExceptiontsAssignment_5_2_in_rule__Operation__Group_5__2__Impl7274);
            rule__Operation__ExceptiontsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getExceptiontsAssignment_5_2()); 

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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3636:1: rule__Operation__Group_5__3 : rule__Operation__Group_5__3__Impl ;
    public final void rule__Operation__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3640:1: ( rule__Operation__Group_5__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3641:2: rule__Operation__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__3__Impl_in_rule__Operation__Group_5__37304);
            rule__Operation__Group_5__3__Impl();

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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3647:1: rule__Operation__Group_5__3__Impl : ( ( rule__Operation__Group_5_3__0 )* ) ;
    public final void rule__Operation__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3651:1: ( ( ( rule__Operation__Group_5_3__0 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3652:1: ( ( rule__Operation__Group_5_3__0 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3652:1: ( ( rule__Operation__Group_5_3__0 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3653:1: ( rule__Operation__Group_5_3__0 )*
            {
             before(grammarAccess.getOperationAccess().getGroup_5_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3654:1: ( rule__Operation__Group_5_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==46) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3654:2: rule__Operation__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Operation__Group_5_3__0_in_rule__Operation__Group_5__3__Impl7331);
            	    rule__Operation__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getGroup_5_3()); 

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


    // $ANTLR start "rule__Operation__Group_5_3__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3672:1: rule__Operation__Group_5_3__0 : rule__Operation__Group_5_3__0__Impl rule__Operation__Group_5_3__1 ;
    public final void rule__Operation__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3676:1: ( rule__Operation__Group_5_3__0__Impl rule__Operation__Group_5_3__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3677:2: rule__Operation__Group_5_3__0__Impl rule__Operation__Group_5_3__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_5_3__0__Impl_in_rule__Operation__Group_5_3__07370);
            rule__Operation__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_5_3__1_in_rule__Operation__Group_5_3__07373);
            rule__Operation__Group_5_3__1();

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
    // $ANTLR end "rule__Operation__Group_5_3__0"


    // $ANTLR start "rule__Operation__Group_5_3__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3684:1: rule__Operation__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3688:1: ( ( ',' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3689:1: ( ',' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3689:1: ( ',' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3690:1: ','
            {
             before(grammarAccess.getOperationAccess().getCommaKeyword_5_3_0()); 
            match(input,46,FOLLOW_46_in_rule__Operation__Group_5_3__0__Impl7401); 
             after(grammarAccess.getOperationAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Operation__Group_5_3__0__Impl"


    // $ANTLR start "rule__Operation__Group_5_3__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3703:1: rule__Operation__Group_5_3__1 : rule__Operation__Group_5_3__1__Impl ;
    public final void rule__Operation__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3707:1: ( rule__Operation__Group_5_3__1__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3708:2: rule__Operation__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_5_3__1__Impl_in_rule__Operation__Group_5_3__17432);
            rule__Operation__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Operation__Group_5_3__1"


    // $ANTLR start "rule__Operation__Group_5_3__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3714:1: rule__Operation__Group_5_3__1__Impl : ( ( rule__Operation__ExceptiontsAssignment_5_3_1 ) ) ;
    public final void rule__Operation__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3718:1: ( ( ( rule__Operation__ExceptiontsAssignment_5_3_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3719:1: ( ( rule__Operation__ExceptiontsAssignment_5_3_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3719:1: ( ( rule__Operation__ExceptiontsAssignment_5_3_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3720:1: ( rule__Operation__ExceptiontsAssignment_5_3_1 )
            {
             before(grammarAccess.getOperationAccess().getExceptiontsAssignment_5_3_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3721:1: ( rule__Operation__ExceptiontsAssignment_5_3_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3721:2: rule__Operation__ExceptiontsAssignment_5_3_1
            {
            pushFollow(FOLLOW_rule__Operation__ExceptiontsAssignment_5_3_1_in_rule__Operation__Group_5_3__1__Impl7459);
            rule__Operation__ExceptiontsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getExceptiontsAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Operation__Group_5_3__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3735:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3739:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3740:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__07493);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__07496);
            rule__Event__Group__1();

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
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3747:1: rule__Event__Group__0__Impl : ( '@event' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3751:1: ( ( '@event' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3752:1: ( '@event' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3752:1: ( '@event' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3753:1: '@event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__Event__Group__0__Impl7524); 
             after(grammarAccess.getEventAccess().getEventKeyword_0()); 

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
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3766:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3770:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3771:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__17555);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__2_in_rule__Event__Group__17558);
            rule__Event__Group__2();

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
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3778:1: rule__Event__Group__1__Impl : ( '{' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3782:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3783:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3783:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3784:1: '{'
            {
             before(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Event__Group__1__Impl7586); 
             after(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3797:1: rule__Event__Group__2 : rule__Event__Group__2__Impl ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3801:1: ( rule__Event__Group__2__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3802:2: rule__Event__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__27617);
            rule__Event__Group__2__Impl();

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
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3808:1: rule__Event__Group__2__Impl : ( '}' ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3812:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3813:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3813:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3814:1: '}'
            {
             before(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__Event__Group__2__Impl7645); 
             after(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Architecture__NameAssignment_2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3834:1: rule__Architecture__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Architecture__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3838:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3839:1: ( ruleQualifiedName )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3839:1: ( ruleQualifiedName )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3840:1: ruleQualifiedName
            {
             before(grammarAccess.getArchitectureAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Architecture__NameAssignment_27687);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3849:1: rule__Architecture__ModuleAssignment_3 : ( ruleModule ) ;
    public final void rule__Architecture__ModuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3853:1: ( ( ruleModule ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3854:1: ( ruleModule )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3854:1: ( ruleModule )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3855:1: ruleModule
            {
             before(grammarAccess.getArchitectureAccess().getModuleModuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleModule_in_rule__Architecture__ModuleAssignment_37718);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3864:1: rule__Module__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3868:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3869:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3869:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3870:1: RULE_ID
            {
             before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Module__NameAssignment_27749); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3879:1: rule__Module__VersionAssignment_5 : ( ruleVersion ) ;
    public final void rule__Module__VersionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3883:1: ( ( ruleVersion ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3884:1: ( ruleVersion )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3884:1: ( ruleVersion )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3885:1: ruleVersion
            {
             before(grammarAccess.getModuleAccess().getVersionVersionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleVersion_in_rule__Module__VersionAssignment_57780);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3894:1: rule__Module__ImportsAssignment_6 : ( ruleImport ) ;
    public final void rule__Module__ImportsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3898:1: ( ( ruleImport ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3899:1: ( ruleImport )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3899:1: ( ruleImport )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3900:1: ruleImport
            {
             before(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Module__ImportsAssignment_67811);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3909:1: rule__Module__ModelAssignment_7 : ( ruleModel ) ;
    public final void rule__Module__ModelAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3913:1: ( ( ruleModel ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3914:1: ( ruleModel )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3914:1: ( ruleModel )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3915:1: ruleModel
            {
             before(grammarAccess.getModuleAccess().getModelModelParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleModel_in_rule__Module__ModelAssignment_77842);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3924:1: rule__Module__ExceptionsAssignment_8 : ( ruleExceptions ) ;
    public final void rule__Module__ExceptionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3928:1: ( ( ruleExceptions ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3929:1: ( ruleExceptions )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3929:1: ( ruleExceptions )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3930:1: ruleExceptions
            {
             before(grammarAccess.getModuleAccess().getExceptionsExceptionsParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleExceptions_in_rule__Module__ExceptionsAssignment_87873);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3939:1: rule__Module__ServicesAssignment_9 : ( ruleService ) ;
    public final void rule__Module__ServicesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3943:1: ( ( ruleService ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3944:1: ( ruleService )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3944:1: ( ruleService )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3945:1: ruleService
            {
             before(grammarAccess.getModuleAccess().getServicesServiceParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleService_in_rule__Module__ServicesAssignment_97904);
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


    // $ANTLR start "rule__Module__EventAssignment_10"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3954:1: rule__Module__EventAssignment_10 : ( ruleEvent ) ;
    public final void rule__Module__EventAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3958:1: ( ( ruleEvent ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3959:1: ( ruleEvent )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3959:1: ( ruleEvent )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3960:1: ruleEvent
            {
             before(grammarAccess.getModuleAccess().getEventEventParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Module__EventAssignment_107935);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getEventEventParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Module__EventAssignment_10"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3969:1: rule__Import__ImportedNamespaceAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Import__ImportedNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3973:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3974:1: ( ruleQualifiedName )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3974:1: ( ruleQualifiedName )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3975:1: ruleQualifiedName
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_27966);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3984:1: rule__Model__EntitiesAssignment_2 : ( ruleEntities ) ;
    public final void rule__Model__EntitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3988:1: ( ( ruleEntities ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3989:1: ( ruleEntities )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3989:1: ( ruleEntities )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3990:1: ruleEntities
            {
             before(grammarAccess.getModelAccess().getEntitiesEntitiesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEntities_in_rule__Model__EntitiesAssignment_27997);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3999:1: rule__Comment__ValueAssignment : ( RULE_COMMENTS ) ;
    public final void rule__Comment__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4003:1: ( ( RULE_COMMENTS ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4004:1: ( RULE_COMMENTS )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4004:1: ( RULE_COMMENTS )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4005:1: RULE_COMMENTS
            {
             before(grammarAccess.getCommentAccess().getValueCOMMENTSTerminalRuleCall_0()); 
            match(input,RULE_COMMENTS,FOLLOW_RULE_COMMENTS_in_rule__Comment__ValueAssignment8028); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4014:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4018:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4019:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4019:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4020:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_18059); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4029:1: rule__Enum__FeaturesAssignment_3 : ( RULE_ID ) ;
    public final void rule__Enum__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4033:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4034:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4034:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4035:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getFeaturesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__FeaturesAssignment_38090); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4044:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4048:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4049:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4049:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4050:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_18121); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4059:1: rule__Entity__FeaturesAssignment_3 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4063:1: ( ( ruleFeature ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4064:1: ( ruleFeature )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4064:1: ( ruleFeature )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4065:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_38152);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4074:1: rule__Feature__FeatureCommentAssignment_0 : ( ruleComment ) ;
    public final void rule__Feature__FeatureCommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4078:1: ( ( ruleComment ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4079:1: ( ruleComment )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4079:1: ( ruleComment )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4080:1: ruleComment
            {
             before(grammarAccess.getFeatureAccess().getFeatureCommentCommentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleComment_in_rule__Feature__FeatureCommentAssignment_08183);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4089:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4093:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4094:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4094:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4095:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_18214); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4104:1: rule__Feature__TypeAssignment_3 : ( ruleFeatureType ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4108:1: ( ( ruleFeatureType ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4109:1: ( ruleFeatureType )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4109:1: ( ruleFeatureType )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4110:1: ruleFeatureType
            {
             before(grammarAccess.getFeatureAccess().getTypeFeatureTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFeatureType_in_rule__Feature__TypeAssignment_38245);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4119:1: rule__EntitiesFeature__TypeAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__EntitiesFeature__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4123:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4124:1: ( ( ruleQualifiedName ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4124:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4125:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntitiesFeatureAccess().getTypeEntitiesCrossReference_0()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4126:1: ( ruleQualifiedName )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4127:1: ruleQualifiedName
            {
             before(grammarAccess.getEntitiesFeatureAccess().getTypeEntitiesQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EntitiesFeature__TypeAssignment8280);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4138:1: rule__PrimitiveFeature__TypeAssignment : ( rulePrimitiveType ) ;
    public final void rule__PrimitiveFeature__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4142:1: ( ( rulePrimitiveType ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4143:1: ( rulePrimitiveType )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4143:1: ( rulePrimitiveType )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4144:1: rulePrimitiveType
            {
             before(grammarAccess.getPrimitiveFeatureAccess().getTypePrimitiveTypeEnumRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_rule__PrimitiveFeature__TypeAssignment8315);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4153:1: rule__GenericListFeature__TypeAssignment_2 : ( ruleFeatureType ) ;
    public final void rule__GenericListFeature__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4157:1: ( ( ruleFeatureType ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4158:1: ( ruleFeatureType )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4158:1: ( ruleFeatureType )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4159:1: ruleFeatureType
            {
             before(grammarAccess.getGenericListFeatureAccess().getTypeFeatureTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFeatureType_in_rule__GenericListFeature__TypeAssignment_28346);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4168:1: rule__Exceptions__ExceptionsAssignment_2 : ( ruleException ) ;
    public final void rule__Exceptions__ExceptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4172:1: ( ( ruleException ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4173:1: ( ruleException )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4173:1: ( ruleException )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4174:1: ruleException
            {
             before(grammarAccess.getExceptionsAccess().getExceptionsExceptionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleException_in_rule__Exceptions__ExceptionsAssignment_28377);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4183:1: rule__Exception__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Exception__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4187:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4188:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4188:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4189:1: RULE_ID
            {
             before(grammarAccess.getExceptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Exception__NameAssignment_18408); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4198:1: rule__Exception__MsgAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Exception__MsgAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4202:1: ( ( RULE_STRING ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4203:1: ( RULE_STRING )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4203:1: ( RULE_STRING )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4204:1: RULE_STRING
            {
             before(grammarAccess.getExceptionAccess().getMsgSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Exception__MsgAssignment_58439); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4213:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4217:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4218:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4218:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4219:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_18470); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4228:1: rule__Service__OperationsAssignment_3 : ( ruleOperation ) ;
    public final void rule__Service__OperationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4232:1: ( ( ruleOperation ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4233:1: ( ruleOperation )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4233:1: ( ruleOperation )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4234:1: ruleOperation
            {
             before(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__Service__OperationsAssignment_38501);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4243:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4247:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4248:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4248:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4249:1: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_18532); 
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


    // $ANTLR start "rule__Operation__FeaturesInputAssignment_3_3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4258:1: rule__Operation__FeaturesInputAssignment_3_3 : ( ruleFeature ) ;
    public final void rule__Operation__FeaturesInputAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4262:1: ( ( ruleFeature ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4263:1: ( ruleFeature )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4263:1: ( ruleFeature )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4264:1: ruleFeature
            {
             before(grammarAccess.getOperationAccess().getFeaturesInputFeatureParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Operation__FeaturesInputAssignment_3_38563);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getFeaturesInputFeatureParserRuleCall_3_3_0()); 

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
    // $ANTLR end "rule__Operation__FeaturesInputAssignment_3_3"


    // $ANTLR start "rule__Operation__FeaturesOutputAssignment_4_3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4273:1: rule__Operation__FeaturesOutputAssignment_4_3 : ( ruleFeature ) ;
    public final void rule__Operation__FeaturesOutputAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4277:1: ( ( ruleFeature ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4278:1: ( ruleFeature )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4278:1: ( ruleFeature )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4279:1: ruleFeature
            {
             before(grammarAccess.getOperationAccess().getFeaturesOutputFeatureParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Operation__FeaturesOutputAssignment_4_38594);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getFeaturesOutputFeatureParserRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__Operation__FeaturesOutputAssignment_4_3"


    // $ANTLR start "rule__Operation__ExceptiontsAssignment_5_2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4288:1: rule__Operation__ExceptiontsAssignment_5_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Operation__ExceptiontsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4292:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4293:1: ( ( ruleQualifiedName ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4293:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4294:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getOperationAccess().getExceptiontsExceptionCrossReference_5_2_0()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4295:1: ( ruleQualifiedName )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4296:1: ruleQualifiedName
            {
             before(grammarAccess.getOperationAccess().getExceptiontsExceptionQualifiedNameParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Operation__ExceptiontsAssignment_5_28629);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getExceptiontsExceptionQualifiedNameParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getExceptiontsExceptionCrossReference_5_2_0()); 

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
    // $ANTLR end "rule__Operation__ExceptiontsAssignment_5_2"


    // $ANTLR start "rule__Operation__ExceptiontsAssignment_5_3_1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4307:1: rule__Operation__ExceptiontsAssignment_5_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Operation__ExceptiontsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4311:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4312:1: ( ( ruleQualifiedName ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4312:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4313:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getOperationAccess().getExceptiontsExceptionCrossReference_5_3_1_0()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4314:1: ( ruleQualifiedName )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4315:1: ruleQualifiedName
            {
             before(grammarAccess.getOperationAccess().getExceptiontsExceptionQualifiedNameParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Operation__ExceptiontsAssignment_5_3_18668);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getExceptiontsExceptionQualifiedNameParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getExceptiontsExceptionCrossReference_5_3_1_0()); 

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
    // $ANTLR end "rule__Operation__ExceptiontsAssignment_5_3_1"

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
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Entities__Alternatives1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__Entities__Alternatives1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntitiesFeature_in_rule__FeatureType__Alternatives1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveFeature_in_rule__FeatureType__Alternatives1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListFeature_in_rule__FeatureType__Alternatives1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PrimitiveType__Alternatives1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PrimitiveType__Alternatives1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PrimitiveType__Alternatives1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PrimitiveType__Alternatives1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PrimitiveType__Alternatives1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PrimitiveType__Alternatives1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PrimitiveType__Alternatives1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PrimitiveType__Alternatives1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PrimitiveType__Alternatives1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PrimitiveType__Alternatives1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PrimitiveType__Alternatives1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PrimitiveType__Alternatives1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__Group__0__Impl_in_rule__Architecture__Group__01686 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Architecture__Group__1_in_rule__Architecture__Group__01689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Architecture__Group__0__Impl1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__Group__1__Impl_in_rule__Architecture__Group__11748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Architecture__Group__2_in_rule__Architecture__Group__11751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Architecture__Group__1__Impl1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__Group__2__Impl_in_rule__Architecture__Group__21810 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Architecture__Group__3_in_rule__Architecture__Group__21813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__NameAssignment_2_in_rule__Architecture__Group__2__Impl1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__Group__3__Impl_in_rule__Architecture__Group__31870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architecture__ModuleAssignment_3_in_rule__Architecture__Group__3__Impl1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__01935 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__01938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Module__Group__0__Impl1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__11997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__12000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Module__Group__1__Impl2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__22059 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__22062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__32119 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Module__Group__4_in_rule__Module__Group__32122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Module__Group__3__Impl2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__42181 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Module__Group__5_in_rule__Module__Group__42184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Module__Group__4__Impl2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__52243 = new BitSet(new long[]{0x00008480C0000000L});
    public static final BitSet FOLLOW_rule__Module__Group__6_in_rule__Module__Group__52246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__VersionAssignment_5_in_rule__Module__Group__5__Impl2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__62303 = new BitSet(new long[]{0x00008480C0000000L});
    public static final BitSet FOLLOW_rule__Module__Group__7_in_rule__Module__Group__62306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ImportsAssignment_6_in_rule__Module__Group__6__Impl2333 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Module__Group__7__Impl_in_rule__Module__Group__72364 = new BitSet(new long[]{0x00008480C0000000L});
    public static final BitSet FOLLOW_rule__Module__Group__8_in_rule__Module__Group__72367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ModelAssignment_7_in_rule__Module__Group__7__Impl2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__8__Impl_in_rule__Module__Group__82425 = new BitSet(new long[]{0x00008480C0000000L});
    public static final BitSet FOLLOW_rule__Module__Group__9_in_rule__Module__Group__82428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ExceptionsAssignment_8_in_rule__Module__Group__8__Impl2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__9__Impl_in_rule__Module__Group__92486 = new BitSet(new long[]{0x00008480C0000000L});
    public static final BitSet FOLLOW_rule__Module__Group__10_in_rule__Module__Group__92489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ServicesAssignment_9_in_rule__Module__Group__9__Impl2516 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__10__Impl_in_rule__Module__Group__102547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__EventAssignment_10_in_rule__Module__Group__10__Impl2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02627 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2713 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__QualifiedName__Group_1__0__Impl2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__02870 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__02873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group__0__Impl2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__12929 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Version__Group__2_in_rule__Version__Group__12932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Version__Group__1__Impl2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__2__Impl_in_rule__Version__Group__22991 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Version__Group__3_in_rule__Version__Group__22994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group__2__Impl3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__3__Impl_in_rule__Version__Group__33050 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Version__Group__4_in_rule__Version__Group__33053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Version__Group__3__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__4__Impl_in_rule__Version__Group__43112 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Version__Group__5_in_rule__Version__Group__43115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Version__Group__4__Impl3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__5__Impl_in_rule__Version__Group__53171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_5__0_in_rule__Version__Group__5__Impl3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_5__0__Impl_in_rule__Version__Group_5__03241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Version__Group_5__1_in_rule__Version__Group_5__03244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Version__Group_5__0__Impl3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group_5__1__Impl_in_rule__Version__Group_5__13303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Version__Group_5__1__Impl3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03363 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Import__Group__0__Impl3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__13428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Import__Group__1__Impl3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__23487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_2_in_rule__Import__Group__2__Impl3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03550 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Model__Group__0__Impl3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13612 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Model__Group__1__Impl3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23674 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__23677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__EntitiesAssignment_2_in_rule__Model__Group__2__Impl3706 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_rule__Model__EntitiesAssignment_2_in_rule__Model__Group__2__Impl3718 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Model__Group__3__Impl3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__03818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__03821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Enum__Group__0__Impl3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__13880 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__13883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__23940 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__23943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Enum__Group__2__Impl3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__34002 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__34005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__FeaturesAssignment_3_in_rule__Enum__Group__3__Impl4034 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enum__FeaturesAssignment_3_in_rule__Enum__Group__3__Impl4046 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__44079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Enum__Group__4__Impl4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__04148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__04151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Entity__Group__0__Impl4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__14210 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__14213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__24270 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__24273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Entity__Group__2__Impl4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__34332 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__34335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl4364 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl4376 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__44409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Entity__Group__4__Impl4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__04478 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__04481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__FeatureCommentAssignment_0_in_rule__Feature__Group__0__Impl4508 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__14539 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__14542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__24599 = new BitSet(new long[]{0x0000001000FFF010L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__24602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Feature__Group__2__Impl4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__34661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__0__Impl_in_rule__GenericListFeature__Group__04726 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__1_in_rule__GenericListFeature__Group__04729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__GenericListFeature__Group__0__Impl4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__1__Impl_in_rule__GenericListFeature__Group__14788 = new BitSet(new long[]{0x0000001000FFF010L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__2_in_rule__GenericListFeature__Group__14791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__GenericListFeature__Group__1__Impl4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__2__Impl_in_rule__GenericListFeature__Group__24850 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__3_in_rule__GenericListFeature__Group__24853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__TypeAssignment_2_in_rule__GenericListFeature__Group__2__Impl4880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__3__Impl_in_rule__GenericListFeature__Group__34910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__GenericListFeature__Group__3__Impl4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__0__Impl_in_rule__Exceptions__Group__04977 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__1_in_rule__Exceptions__Group__04980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Exceptions__Group__0__Impl5008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__1__Impl_in_rule__Exceptions__Group__15039 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__2_in_rule__Exceptions__Group__15042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Exceptions__Group__1__Impl5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__2__Impl_in_rule__Exceptions__Group__25101 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__3_in_rule__Exceptions__Group__25104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exceptions__ExceptionsAssignment_2_in_rule__Exceptions__Group__2__Impl5133 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Exceptions__ExceptionsAssignment_2_in_rule__Exceptions__Group__2__Impl5145 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__3__Impl_in_rule__Exceptions__Group__35178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Exceptions__Group__3__Impl5206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__0__Impl_in_rule__Exception__Group__05245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exception__Group__1_in_rule__Exception__Group__05248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Exception__Group__0__Impl5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__1__Impl_in_rule__Exception__Group__15307 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Exception__Group__2_in_rule__Exception__Group__15310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__NameAssignment_1_in_rule__Exception__Group__1__Impl5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__2__Impl_in_rule__Exception__Group__25367 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Exception__Group__3_in_rule__Exception__Group__25370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Exception__Group__2__Impl5398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__3__Impl_in_rule__Exception__Group__35429 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Exception__Group__4_in_rule__Exception__Group__35432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Exception__Group__3__Impl5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__4__Impl_in_rule__Exception__Group__45491 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Exception__Group__5_in_rule__Exception__Group__45494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Exception__Group__4__Impl5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__5__Impl_in_rule__Exception__Group__55553 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Exception__Group__6_in_rule__Exception__Group__55556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__MsgAssignment_5_in_rule__Exception__Group__5__Impl5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__6__Impl_in_rule__Exception__Group__65613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Exception__Group__6__Impl5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__05686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__05689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Service__Group__0__Impl5717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__15748 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__15751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__25808 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__25811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Service__Group__2__Impl5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__35870 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__35873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__OperationsAssignment_3_in_rule__Service__Group__3__Impl5902 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Service__OperationsAssignment_3_in_rule__Service__Group__3__Impl5914 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__45947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Service__Group__4__Impl5975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__06016 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__06019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Operation__Group__0__Impl6047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__16078 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__16081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__26138 = new BitSet(new long[]{0x0000310200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__26141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Operation__Group__2__Impl6169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__36200 = new BitSet(new long[]{0x0000310200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__36203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl6230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__46261 = new BitSet(new long[]{0x0000310200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__46264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl6291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__56322 = new BitSet(new long[]{0x0000310200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__56325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl6352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__66383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Operation__Group__6__Impl6411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__06456 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__06459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Operation__Group_3__0__Impl6487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__16518 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__2_in_rule__Operation__Group_3__16521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operation__Group_3__1__Impl6549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__2__Impl_in_rule__Operation__Group_3__26580 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__3_in_rule__Operation__Group_3__26583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Operation__Group_3__2__Impl6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__3__Impl_in_rule__Operation__Group_3__36642 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__4_in_rule__Operation__Group_3__36645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__FeaturesInputAssignment_3_3_in_rule__Operation__Group_3__3__Impl6674 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Operation__FeaturesInputAssignment_3_3_in_rule__Operation__Group_3__3__Impl6686 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__4__Impl_in_rule__Operation__Group_3__46719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Operation__Group_3__4__Impl6747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__06788 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__06791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Operation__Group_4__0__Impl6819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__16850 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__2_in_rule__Operation__Group_4__16853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operation__Group_4__1__Impl6881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__2__Impl_in_rule__Operation__Group_4__26912 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__3_in_rule__Operation__Group_4__26915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Operation__Group_4__2__Impl6943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__3__Impl_in_rule__Operation__Group_4__36974 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__4_in_rule__Operation__Group_4__36977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__FeaturesOutputAssignment_4_3_in_rule__Operation__Group_4__3__Impl7006 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Operation__FeaturesOutputAssignment_4_3_in_rule__Operation__Group_4__3__Impl7018 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__4__Impl_in_rule__Operation__Group_4__47051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Operation__Group_4__4__Impl7079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__07120 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__07123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Operation__Group_5__0__Impl7151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__17182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__2_in_rule__Operation__Group_5__17185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operation__Group_5__1__Impl7213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__2__Impl_in_rule__Operation__Group_5__27244 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__3_in_rule__Operation__Group_5__27247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ExceptiontsAssignment_5_2_in_rule__Operation__Group_5__2__Impl7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__3__Impl_in_rule__Operation__Group_5__37304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5_3__0_in_rule__Operation__Group_5__3__Impl7331 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5_3__0__Impl_in_rule__Operation__Group_5_3__07370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group_5_3__1_in_rule__Operation__Group_5_3__07373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Operation__Group_5_3__0__Impl7401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5_3__1__Impl_in_rule__Operation__Group_5_3__17432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ExceptiontsAssignment_5_3_1_in_rule__Operation__Group_5_3__1__Impl7459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__07493 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__07496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Event__Group__0__Impl7524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__17555 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Event__Group__2_in_rule__Event__Group__17558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Event__Group__1__Impl7586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__27617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Event__Group__2__Impl7645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Architecture__NameAssignment_27687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__Architecture__ModuleAssignment_37718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Module__NameAssignment_27749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__Module__VersionAssignment_57780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Module__ImportsAssignment_67811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_rule__Module__ModelAssignment_77842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptions_in_rule__Module__ExceptionsAssignment_87873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__Module__ServicesAssignment_97904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Module__EventAssignment_107935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_27966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntities_in_rule__Model__EntitiesAssignment_27997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENTS_in_rule__Comment__ValueAssignment8028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_18059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__FeaturesAssignment_38090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_18121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_38152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_rule__Feature__FeatureCommentAssignment_08183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_18214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureType_in_rule__Feature__TypeAssignment_38245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EntitiesFeature__TypeAssignment8280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__PrimitiveFeature__TypeAssignment8315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureType_in_rule__GenericListFeature__TypeAssignment_28346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleException_in_rule__Exceptions__ExceptionsAssignment_28377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Exception__NameAssignment_18408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Exception__MsgAssignment_58439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_18470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Service__OperationsAssignment_38501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_18532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Operation__FeaturesInputAssignment_3_38563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Operation__FeaturesOutputAssignment_4_38594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Operation__ExceptiontsAssignment_5_28629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Operation__ExceptiontsAssignment_5_3_18668 = new BitSet(new long[]{0x0000000000000002L});

}