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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1806:1: rule__Model__Group__2__Impl : ( ( rule__Model__EntitiesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1810:1: ( ( ( rule__Model__EntitiesAssignment_2 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1811:1: ( ( rule__Model__EntitiesAssignment_2 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1811:1: ( ( rule__Model__EntitiesAssignment_2 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1812:1: ( rule__Model__EntitiesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1813:1: ( rule__Model__EntitiesAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=34 && LA11_0<=35)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1813:2: rule__Model__EntitiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__EntitiesAssignment_2_in_rule__Model__Group__2__Impl3704);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1823:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1827:1: ( rule__Model__Group__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1828:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33735);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1834:1: rule__Model__Group__3__Impl : ( '}' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1838:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1839:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1839:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1840:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__Model__Group__3__Impl3763); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1861:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1865:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1866:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__03802);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__03805);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1873:1: rule__Enum__Group__0__Impl : ( '@enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1877:1: ( ( '@enum' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1878:1: ( '@enum' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1878:1: ( '@enum' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1879:1: '@enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Enum__Group__0__Impl3833); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1892:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1896:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1897:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__13864);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__13867);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1904:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1908:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1909:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1909:1: ( ( rule__Enum__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1910:1: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1911:1: ( rule__Enum__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1911:2: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl3894);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1921:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1925:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1926:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__23924);
            rule__Enum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__23927);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1933:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1937:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1938:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1938:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1939:1: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Enum__Group__2__Impl3955); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1952:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1956:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1957:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__33986);
            rule__Enum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__33989);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1964:1: rule__Enum__Group__3__Impl : ( ( ( rule__Enum__FeaturesAssignment_3 ) ) ( ( rule__Enum__FeaturesAssignment_3 )* ) ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1968:1: ( ( ( ( rule__Enum__FeaturesAssignment_3 ) ) ( ( rule__Enum__FeaturesAssignment_3 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1969:1: ( ( ( rule__Enum__FeaturesAssignment_3 ) ) ( ( rule__Enum__FeaturesAssignment_3 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1969:1: ( ( ( rule__Enum__FeaturesAssignment_3 ) ) ( ( rule__Enum__FeaturesAssignment_3 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1970:1: ( ( rule__Enum__FeaturesAssignment_3 ) ) ( ( rule__Enum__FeaturesAssignment_3 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1970:1: ( ( rule__Enum__FeaturesAssignment_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1971:1: ( rule__Enum__FeaturesAssignment_3 )
            {
             before(grammarAccess.getEnumAccess().getFeaturesAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1972:1: ( rule__Enum__FeaturesAssignment_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1972:2: rule__Enum__FeaturesAssignment_3
            {
            pushFollow(FOLLOW_rule__Enum__FeaturesAssignment_3_in_rule__Enum__Group__3__Impl4018);
            rule__Enum__FeaturesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getFeaturesAssignment_3()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1975:1: ( ( rule__Enum__FeaturesAssignment_3 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1976:1: ( rule__Enum__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getEnumAccess().getFeaturesAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1977:1: ( rule__Enum__FeaturesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1977:2: rule__Enum__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enum__FeaturesAssignment_3_in_rule__Enum__Group__3__Impl4030);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1988:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1992:1: ( rule__Enum__Group__4__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1993:2: rule__Enum__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__44063);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1999:1: rule__Enum__Group__4__Impl : ( '}' ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2003:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2004:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2004:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2005:1: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__Enum__Group__4__Impl4091); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2028:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2032:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2033:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__04132);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__04135);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2040:1: rule__Entity__Group__0__Impl : ( '@entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2044:1: ( ( '@entity' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2045:1: ( '@entity' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2045:1: ( '@entity' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2046:1: '@entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Entity__Group__0__Impl4163); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2059:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2063:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2064:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__14194);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__14197);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2071:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2075:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2076:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2076:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2077:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2078:1: ( rule__Entity__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2078:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl4224);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2088:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2092:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2093:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__24254);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__24257);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2100:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2104:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2105:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2105:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2106:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Entity__Group__2__Impl4285); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2119:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2123:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2124:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__34316);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__34319);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2131:1: rule__Entity__Group__3__Impl : ( ( ( rule__Entity__FeaturesAssignment_3 ) ) ( ( rule__Entity__FeaturesAssignment_3 )* ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2135:1: ( ( ( ( rule__Entity__FeaturesAssignment_3 ) ) ( ( rule__Entity__FeaturesAssignment_3 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2136:1: ( ( ( rule__Entity__FeaturesAssignment_3 ) ) ( ( rule__Entity__FeaturesAssignment_3 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2136:1: ( ( ( rule__Entity__FeaturesAssignment_3 ) ) ( ( rule__Entity__FeaturesAssignment_3 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2137:1: ( ( rule__Entity__FeaturesAssignment_3 ) ) ( ( rule__Entity__FeaturesAssignment_3 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2137:1: ( ( rule__Entity__FeaturesAssignment_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2138:1: ( rule__Entity__FeaturesAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2139:1: ( rule__Entity__FeaturesAssignment_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2139:2: rule__Entity__FeaturesAssignment_3
            {
            pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl4348);
            rule__Entity__FeaturesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2142:1: ( ( rule__Entity__FeaturesAssignment_3 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2143:1: ( rule__Entity__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2144:1: ( rule__Entity__FeaturesAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==RULE_COMMENTS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2144:2: rule__Entity__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl4360);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2155:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2159:1: ( rule__Entity__Group__4__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2160:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__44393);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2166:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2170:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2171:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2171:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2172:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__Entity__Group__4__Impl4421); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2195:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2199:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2200:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__04462);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__04465);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2207:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__FeatureCommentAssignment_0 )* ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2211:1: ( ( ( rule__Feature__FeatureCommentAssignment_0 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2212:1: ( ( rule__Feature__FeatureCommentAssignment_0 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2212:1: ( ( rule__Feature__FeatureCommentAssignment_0 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2213:1: ( rule__Feature__FeatureCommentAssignment_0 )*
            {
             before(grammarAccess.getFeatureAccess().getFeatureCommentAssignment_0()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2214:1: ( rule__Feature__FeatureCommentAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMENTS) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2214:2: rule__Feature__FeatureCommentAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Feature__FeatureCommentAssignment_0_in_rule__Feature__Group__0__Impl4492);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2224:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2228:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2229:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__14523);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__14526);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2236:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2240:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2241:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2241:1: ( ( rule__Feature__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2242:1: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2243:1: ( rule__Feature__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2243:2: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl4553);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2253:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2257:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2258:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__24583);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__24586);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2265:1: rule__Feature__Group__2__Impl : ( ':' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2269:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2270:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2270:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2271:1: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Feature__Group__2__Impl4614); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2284:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2288:1: ( rule__Feature__Group__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2289:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__34645);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2295:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2299:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2300:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2300:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2301:1: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2302:1: ( rule__Feature__TypeAssignment_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2302:2: rule__Feature__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl4672);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2320:1: rule__GenericListFeature__Group__0 : rule__GenericListFeature__Group__0__Impl rule__GenericListFeature__Group__1 ;
    public final void rule__GenericListFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2324:1: ( rule__GenericListFeature__Group__0__Impl rule__GenericListFeature__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2325:2: rule__GenericListFeature__Group__0__Impl rule__GenericListFeature__Group__1
            {
            pushFollow(FOLLOW_rule__GenericListFeature__Group__0__Impl_in_rule__GenericListFeature__Group__04710);
            rule__GenericListFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericListFeature__Group__1_in_rule__GenericListFeature__Group__04713);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2332:1: rule__GenericListFeature__Group__0__Impl : ( '@List' ) ;
    public final void rule__GenericListFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2336:1: ( ( '@List' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2337:1: ( '@List' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2337:1: ( '@List' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2338:1: '@List'
            {
             before(grammarAccess.getGenericListFeatureAccess().getListKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__GenericListFeature__Group__0__Impl4741); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2351:1: rule__GenericListFeature__Group__1 : rule__GenericListFeature__Group__1__Impl rule__GenericListFeature__Group__2 ;
    public final void rule__GenericListFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2355:1: ( rule__GenericListFeature__Group__1__Impl rule__GenericListFeature__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2356:2: rule__GenericListFeature__Group__1__Impl rule__GenericListFeature__Group__2
            {
            pushFollow(FOLLOW_rule__GenericListFeature__Group__1__Impl_in_rule__GenericListFeature__Group__14772);
            rule__GenericListFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericListFeature__Group__2_in_rule__GenericListFeature__Group__14775);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2363:1: rule__GenericListFeature__Group__1__Impl : ( '<' ) ;
    public final void rule__GenericListFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2367:1: ( ( '<' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2368:1: ( '<' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2368:1: ( '<' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2369:1: '<'
            {
             before(grammarAccess.getGenericListFeatureAccess().getLessThanSignKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__GenericListFeature__Group__1__Impl4803); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2382:1: rule__GenericListFeature__Group__2 : rule__GenericListFeature__Group__2__Impl rule__GenericListFeature__Group__3 ;
    public final void rule__GenericListFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2386:1: ( rule__GenericListFeature__Group__2__Impl rule__GenericListFeature__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2387:2: rule__GenericListFeature__Group__2__Impl rule__GenericListFeature__Group__3
            {
            pushFollow(FOLLOW_rule__GenericListFeature__Group__2__Impl_in_rule__GenericListFeature__Group__24834);
            rule__GenericListFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericListFeature__Group__3_in_rule__GenericListFeature__Group__24837);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2394:1: rule__GenericListFeature__Group__2__Impl : ( ( rule__GenericListFeature__TypeAssignment_2 ) ) ;
    public final void rule__GenericListFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2398:1: ( ( ( rule__GenericListFeature__TypeAssignment_2 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2399:1: ( ( rule__GenericListFeature__TypeAssignment_2 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2399:1: ( ( rule__GenericListFeature__TypeAssignment_2 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2400:1: ( rule__GenericListFeature__TypeAssignment_2 )
            {
             before(grammarAccess.getGenericListFeatureAccess().getTypeAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2401:1: ( rule__GenericListFeature__TypeAssignment_2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2401:2: rule__GenericListFeature__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__GenericListFeature__TypeAssignment_2_in_rule__GenericListFeature__Group__2__Impl4864);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2411:1: rule__GenericListFeature__Group__3 : rule__GenericListFeature__Group__3__Impl ;
    public final void rule__GenericListFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2415:1: ( rule__GenericListFeature__Group__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2416:2: rule__GenericListFeature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GenericListFeature__Group__3__Impl_in_rule__GenericListFeature__Group__34894);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2422:1: rule__GenericListFeature__Group__3__Impl : ( '>' ) ;
    public final void rule__GenericListFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2426:1: ( ( '>' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2427:1: ( '>' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2427:1: ( '>' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2428:1: '>'
            {
             before(grammarAccess.getGenericListFeatureAccess().getGreaterThanSignKeyword_3()); 
            match(input,38,FOLLOW_38_in_rule__GenericListFeature__Group__3__Impl4922); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2449:1: rule__Exceptions__Group__0 : rule__Exceptions__Group__0__Impl rule__Exceptions__Group__1 ;
    public final void rule__Exceptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2453:1: ( rule__Exceptions__Group__0__Impl rule__Exceptions__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2454:2: rule__Exceptions__Group__0__Impl rule__Exceptions__Group__1
            {
            pushFollow(FOLLOW_rule__Exceptions__Group__0__Impl_in_rule__Exceptions__Group__04961);
            rule__Exceptions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exceptions__Group__1_in_rule__Exceptions__Group__04964);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2461:1: rule__Exceptions__Group__0__Impl : ( '@exceptions' ) ;
    public final void rule__Exceptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2465:1: ( ( '@exceptions' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2466:1: ( '@exceptions' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2466:1: ( '@exceptions' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2467:1: '@exceptions'
            {
             before(grammarAccess.getExceptionsAccess().getExceptionsKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Exceptions__Group__0__Impl4992); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2480:1: rule__Exceptions__Group__1 : rule__Exceptions__Group__1__Impl rule__Exceptions__Group__2 ;
    public final void rule__Exceptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2484:1: ( rule__Exceptions__Group__1__Impl rule__Exceptions__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2485:2: rule__Exceptions__Group__1__Impl rule__Exceptions__Group__2
            {
            pushFollow(FOLLOW_rule__Exceptions__Group__1__Impl_in_rule__Exceptions__Group__15023);
            rule__Exceptions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exceptions__Group__2_in_rule__Exceptions__Group__15026);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2492:1: rule__Exceptions__Group__1__Impl : ( '{' ) ;
    public final void rule__Exceptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2496:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2497:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2497:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2498:1: '{'
            {
             before(grammarAccess.getExceptionsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Exceptions__Group__1__Impl5054); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2511:1: rule__Exceptions__Group__2 : rule__Exceptions__Group__2__Impl rule__Exceptions__Group__3 ;
    public final void rule__Exceptions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2515:1: ( rule__Exceptions__Group__2__Impl rule__Exceptions__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2516:2: rule__Exceptions__Group__2__Impl rule__Exceptions__Group__3
            {
            pushFollow(FOLLOW_rule__Exceptions__Group__2__Impl_in_rule__Exceptions__Group__25085);
            rule__Exceptions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exceptions__Group__3_in_rule__Exceptions__Group__25088);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2523:1: rule__Exceptions__Group__2__Impl : ( ( ( rule__Exceptions__ExceptionsAssignment_2 ) ) ( ( rule__Exceptions__ExceptionsAssignment_2 )* ) ) ;
    public final void rule__Exceptions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2527:1: ( ( ( ( rule__Exceptions__ExceptionsAssignment_2 ) ) ( ( rule__Exceptions__ExceptionsAssignment_2 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2528:1: ( ( ( rule__Exceptions__ExceptionsAssignment_2 ) ) ( ( rule__Exceptions__ExceptionsAssignment_2 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2528:1: ( ( ( rule__Exceptions__ExceptionsAssignment_2 ) ) ( ( rule__Exceptions__ExceptionsAssignment_2 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2529:1: ( ( rule__Exceptions__ExceptionsAssignment_2 ) ) ( ( rule__Exceptions__ExceptionsAssignment_2 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2529:1: ( ( rule__Exceptions__ExceptionsAssignment_2 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2530:1: ( rule__Exceptions__ExceptionsAssignment_2 )
            {
             before(grammarAccess.getExceptionsAccess().getExceptionsAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2531:1: ( rule__Exceptions__ExceptionsAssignment_2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2531:2: rule__Exceptions__ExceptionsAssignment_2
            {
            pushFollow(FOLLOW_rule__Exceptions__ExceptionsAssignment_2_in_rule__Exceptions__Group__2__Impl5117);
            rule__Exceptions__ExceptionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExceptionsAccess().getExceptionsAssignment_2()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2534:1: ( ( rule__Exceptions__ExceptionsAssignment_2 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2535:1: ( rule__Exceptions__ExceptionsAssignment_2 )*
            {
             before(grammarAccess.getExceptionsAccess().getExceptionsAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2536:1: ( rule__Exceptions__ExceptionsAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==40) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2536:2: rule__Exceptions__ExceptionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Exceptions__ExceptionsAssignment_2_in_rule__Exceptions__Group__2__Impl5129);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2547:1: rule__Exceptions__Group__3 : rule__Exceptions__Group__3__Impl ;
    public final void rule__Exceptions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2551:1: ( rule__Exceptions__Group__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2552:2: rule__Exceptions__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Exceptions__Group__3__Impl_in_rule__Exceptions__Group__35162);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2558:1: rule__Exceptions__Group__3__Impl : ( '}' ) ;
    public final void rule__Exceptions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2562:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2563:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2563:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2564:1: '}'
            {
             before(grammarAccess.getExceptionsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__Exceptions__Group__3__Impl5190); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2585:1: rule__Exception__Group__0 : rule__Exception__Group__0__Impl rule__Exception__Group__1 ;
    public final void rule__Exception__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2589:1: ( rule__Exception__Group__0__Impl rule__Exception__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2590:2: rule__Exception__Group__0__Impl rule__Exception__Group__1
            {
            pushFollow(FOLLOW_rule__Exception__Group__0__Impl_in_rule__Exception__Group__05229);
            rule__Exception__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__1_in_rule__Exception__Group__05232);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2597:1: rule__Exception__Group__0__Impl : ( '@exception' ) ;
    public final void rule__Exception__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2601:1: ( ( '@exception' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2602:1: ( '@exception' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2602:1: ( '@exception' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2603:1: '@exception'
            {
             before(grammarAccess.getExceptionAccess().getExceptionKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Exception__Group__0__Impl5260); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2616:1: rule__Exception__Group__1 : rule__Exception__Group__1__Impl rule__Exception__Group__2 ;
    public final void rule__Exception__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2620:1: ( rule__Exception__Group__1__Impl rule__Exception__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2621:2: rule__Exception__Group__1__Impl rule__Exception__Group__2
            {
            pushFollow(FOLLOW_rule__Exception__Group__1__Impl_in_rule__Exception__Group__15291);
            rule__Exception__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__2_in_rule__Exception__Group__15294);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2628:1: rule__Exception__Group__1__Impl : ( ( rule__Exception__NameAssignment_1 ) ) ;
    public final void rule__Exception__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2632:1: ( ( ( rule__Exception__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2633:1: ( ( rule__Exception__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2633:1: ( ( rule__Exception__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2634:1: ( rule__Exception__NameAssignment_1 )
            {
             before(grammarAccess.getExceptionAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2635:1: ( rule__Exception__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2635:2: rule__Exception__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Exception__NameAssignment_1_in_rule__Exception__Group__1__Impl5321);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2645:1: rule__Exception__Group__2 : rule__Exception__Group__2__Impl rule__Exception__Group__3 ;
    public final void rule__Exception__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2649:1: ( rule__Exception__Group__2__Impl rule__Exception__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2650:2: rule__Exception__Group__2__Impl rule__Exception__Group__3
            {
            pushFollow(FOLLOW_rule__Exception__Group__2__Impl_in_rule__Exception__Group__25351);
            rule__Exception__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__3_in_rule__Exception__Group__25354);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2657:1: rule__Exception__Group__2__Impl : ( '{' ) ;
    public final void rule__Exception__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2661:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2662:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2662:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2663:1: '{'
            {
             before(grammarAccess.getExceptionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Exception__Group__2__Impl5382); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2676:1: rule__Exception__Group__3 : rule__Exception__Group__3__Impl rule__Exception__Group__4 ;
    public final void rule__Exception__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2680:1: ( rule__Exception__Group__3__Impl rule__Exception__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2681:2: rule__Exception__Group__3__Impl rule__Exception__Group__4
            {
            pushFollow(FOLLOW_rule__Exception__Group__3__Impl_in_rule__Exception__Group__35413);
            rule__Exception__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__4_in_rule__Exception__Group__35416);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2688:1: rule__Exception__Group__3__Impl : ( '@msg' ) ;
    public final void rule__Exception__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2692:1: ( ( '@msg' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2693:1: ( '@msg' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2693:1: ( '@msg' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2694:1: '@msg'
            {
             before(grammarAccess.getExceptionAccess().getMsgKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__Exception__Group__3__Impl5444); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2707:1: rule__Exception__Group__4 : rule__Exception__Group__4__Impl rule__Exception__Group__5 ;
    public final void rule__Exception__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2711:1: ( rule__Exception__Group__4__Impl rule__Exception__Group__5 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2712:2: rule__Exception__Group__4__Impl rule__Exception__Group__5
            {
            pushFollow(FOLLOW_rule__Exception__Group__4__Impl_in_rule__Exception__Group__45475);
            rule__Exception__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__5_in_rule__Exception__Group__45478);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2719:1: rule__Exception__Group__4__Impl : ( ':' ) ;
    public final void rule__Exception__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2723:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2724:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2724:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2725:1: ':'
            {
             before(grammarAccess.getExceptionAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Exception__Group__4__Impl5506); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2738:1: rule__Exception__Group__5 : rule__Exception__Group__5__Impl rule__Exception__Group__6 ;
    public final void rule__Exception__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2742:1: ( rule__Exception__Group__5__Impl rule__Exception__Group__6 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2743:2: rule__Exception__Group__5__Impl rule__Exception__Group__6
            {
            pushFollow(FOLLOW_rule__Exception__Group__5__Impl_in_rule__Exception__Group__55537);
            rule__Exception__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__6_in_rule__Exception__Group__55540);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2750:1: rule__Exception__Group__5__Impl : ( ( rule__Exception__MsgAssignment_5 ) ) ;
    public final void rule__Exception__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2754:1: ( ( ( rule__Exception__MsgAssignment_5 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2755:1: ( ( rule__Exception__MsgAssignment_5 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2755:1: ( ( rule__Exception__MsgAssignment_5 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2756:1: ( rule__Exception__MsgAssignment_5 )
            {
             before(grammarAccess.getExceptionAccess().getMsgAssignment_5()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2757:1: ( rule__Exception__MsgAssignment_5 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2757:2: rule__Exception__MsgAssignment_5
            {
            pushFollow(FOLLOW_rule__Exception__MsgAssignment_5_in_rule__Exception__Group__5__Impl5567);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2767:1: rule__Exception__Group__6 : rule__Exception__Group__6__Impl ;
    public final void rule__Exception__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2771:1: ( rule__Exception__Group__6__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2772:2: rule__Exception__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Exception__Group__6__Impl_in_rule__Exception__Group__65597);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2778:1: rule__Exception__Group__6__Impl : ( '}' ) ;
    public final void rule__Exception__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2782:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2783:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2783:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2784:1: '}'
            {
             before(grammarAccess.getExceptionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_33_in_rule__Exception__Group__6__Impl5625); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2811:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2815:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2816:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__05670);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__05673);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2823:1: rule__Service__Group__0__Impl : ( '@service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2827:1: ( ( '@service' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2828:1: ( '@service' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2828:1: ( '@service' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2829:1: '@service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Service__Group__0__Impl5701); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2842:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2846:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2847:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__15732);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__15735);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2854:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2858:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2859:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2859:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2860:1: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2861:1: ( rule__Service__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2861:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl5762);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2871:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2875:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2876:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__25792);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__25795);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2883:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2887:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2888:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2888:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2889:1: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Service__Group__2__Impl5823); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2902:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2906:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2907:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__35854);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__35857);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2914:1: rule__Service__Group__3__Impl : ( ( ( rule__Service__OperationsAssignment_3 ) ) ( ( rule__Service__OperationsAssignment_3 )* ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2918:1: ( ( ( ( rule__Service__OperationsAssignment_3 ) ) ( ( rule__Service__OperationsAssignment_3 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2919:1: ( ( ( rule__Service__OperationsAssignment_3 ) ) ( ( rule__Service__OperationsAssignment_3 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2919:1: ( ( ( rule__Service__OperationsAssignment_3 ) ) ( ( rule__Service__OperationsAssignment_3 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2920:1: ( ( rule__Service__OperationsAssignment_3 ) ) ( ( rule__Service__OperationsAssignment_3 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2920:1: ( ( rule__Service__OperationsAssignment_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2921:1: ( rule__Service__OperationsAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getOperationsAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2922:1: ( rule__Service__OperationsAssignment_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2922:2: rule__Service__OperationsAssignment_3
            {
            pushFollow(FOLLOW_rule__Service__OperationsAssignment_3_in_rule__Service__Group__3__Impl5886);
            rule__Service__OperationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getOperationsAssignment_3()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2925:1: ( ( rule__Service__OperationsAssignment_3 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2926:1: ( rule__Service__OperationsAssignment_3 )*
            {
             before(grammarAccess.getServiceAccess().getOperationsAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2927:1: ( rule__Service__OperationsAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==43) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2927:2: rule__Service__OperationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Service__OperationsAssignment_3_in_rule__Service__Group__3__Impl5898);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2938:1: rule__Service__Group__4 : rule__Service__Group__4__Impl ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2942:1: ( rule__Service__Group__4__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2943:2: rule__Service__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__45931);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2949:1: rule__Service__Group__4__Impl : ( '}' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2953:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2954:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2954:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2955:1: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__Service__Group__4__Impl5959); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2978:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2982:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2983:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__06000);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__06003);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2990:1: rule__Operation__Group__0__Impl : ( '@operation' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2994:1: ( ( '@operation' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2995:1: ( '@operation' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2995:1: ( '@operation' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2996:1: '@operation'
            {
             before(grammarAccess.getOperationAccess().getOperationKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__Operation__Group__0__Impl6031); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3009:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3013:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3014:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__16062);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__16065);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3021:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3025:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3026:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3026:1: ( ( rule__Operation__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3027:1: ( rule__Operation__NameAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3028:1: ( rule__Operation__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3028:2: rule__Operation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl6092);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3038:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3042:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3043:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__26122);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__26125);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3050:1: rule__Operation__Group__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3054:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3055:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3055:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3056:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Operation__Group__2__Impl6153); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3069:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3073:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3074:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__36184);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__36187);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3081:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )? ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3085:1: ( ( ( rule__Operation__Group_3__0 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3086:1: ( ( rule__Operation__Group_3__0 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3086:1: ( ( rule__Operation__Group_3__0 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3087:1: ( rule__Operation__Group_3__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3088:1: ( rule__Operation__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==44) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3088:2: rule__Operation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl6214);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3098:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3102:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3103:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__46245);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__46248);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3110:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3114:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3115:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3115:1: ( ( rule__Operation__Group_4__0 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3116:1: ( rule__Operation__Group_4__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3117:1: ( rule__Operation__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==45) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3117:2: rule__Operation__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl6275);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3127:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3131:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3132:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__56306);
            rule__Operation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__56309);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3139:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__Group_5__0 )? ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3143:1: ( ( ( rule__Operation__Group_5__0 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3144:1: ( ( rule__Operation__Group_5__0 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3144:1: ( ( rule__Operation__Group_5__0 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3145:1: ( rule__Operation__Group_5__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_5()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3146:1: ( rule__Operation__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3146:2: rule__Operation__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl6336);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3156:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3160:1: ( rule__Operation__Group__6__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3161:2: rule__Operation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__66367);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3167:1: rule__Operation__Group__6__Impl : ( '}' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3171:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3172:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3172:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3173:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_33_in_rule__Operation__Group__6__Impl6395); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3200:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
    public final void rule__Operation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3204:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3205:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__06440);
            rule__Operation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__06443);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3212:1: rule__Operation__Group_3__0__Impl : ( '@input' ) ;
    public final void rule__Operation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3216:1: ( ( '@input' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3217:1: ( '@input' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3217:1: ( '@input' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3218:1: '@input'
            {
             before(grammarAccess.getOperationAccess().getInputKeyword_3_0()); 
            match(input,44,FOLLOW_44_in_rule__Operation__Group_3__0__Impl6471); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3231:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2 ;
    public final void rule__Operation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3235:1: ( rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3236:2: rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__16502);
            rule__Operation__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__2_in_rule__Operation__Group_3__16505);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3243:1: rule__Operation__Group_3__1__Impl : ( ':' ) ;
    public final void rule__Operation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3247:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3248:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3248:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3249:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_3_1()); 
            match(input,25,FOLLOW_25_in_rule__Operation__Group_3__1__Impl6533); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3262:1: rule__Operation__Group_3__2 : rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3 ;
    public final void rule__Operation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3266:1: ( rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3267:2: rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__2__Impl_in_rule__Operation__Group_3__26564);
            rule__Operation__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__3_in_rule__Operation__Group_3__26567);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3274:1: rule__Operation__Group_3__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3278:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3279:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3279:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3280:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3_2()); 
            match(input,32,FOLLOW_32_in_rule__Operation__Group_3__2__Impl6595); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3293:1: rule__Operation__Group_3__3 : rule__Operation__Group_3__3__Impl rule__Operation__Group_3__4 ;
    public final void rule__Operation__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3297:1: ( rule__Operation__Group_3__3__Impl rule__Operation__Group_3__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3298:2: rule__Operation__Group_3__3__Impl rule__Operation__Group_3__4
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__3__Impl_in_rule__Operation__Group_3__36626);
            rule__Operation__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__4_in_rule__Operation__Group_3__36629);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3305:1: rule__Operation__Group_3__3__Impl : ( ( ( rule__Operation__FeaturesInputAssignment_3_3 ) ) ( ( rule__Operation__FeaturesInputAssignment_3_3 )* ) ) ;
    public final void rule__Operation__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3309:1: ( ( ( ( rule__Operation__FeaturesInputAssignment_3_3 ) ) ( ( rule__Operation__FeaturesInputAssignment_3_3 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3310:1: ( ( ( rule__Operation__FeaturesInputAssignment_3_3 ) ) ( ( rule__Operation__FeaturesInputAssignment_3_3 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3310:1: ( ( ( rule__Operation__FeaturesInputAssignment_3_3 ) ) ( ( rule__Operation__FeaturesInputAssignment_3_3 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3311:1: ( ( rule__Operation__FeaturesInputAssignment_3_3 ) ) ( ( rule__Operation__FeaturesInputAssignment_3_3 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3311:1: ( ( rule__Operation__FeaturesInputAssignment_3_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3312:1: ( rule__Operation__FeaturesInputAssignment_3_3 )
            {
             before(grammarAccess.getOperationAccess().getFeaturesInputAssignment_3_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3313:1: ( rule__Operation__FeaturesInputAssignment_3_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3313:2: rule__Operation__FeaturesInputAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Operation__FeaturesInputAssignment_3_3_in_rule__Operation__Group_3__3__Impl6658);
            rule__Operation__FeaturesInputAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getFeaturesInputAssignment_3_3()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3316:1: ( ( rule__Operation__FeaturesInputAssignment_3_3 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3317:1: ( rule__Operation__FeaturesInputAssignment_3_3 )*
            {
             before(grammarAccess.getOperationAccess().getFeaturesInputAssignment_3_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3318:1: ( rule__Operation__FeaturesInputAssignment_3_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==RULE_COMMENTS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3318:2: rule__Operation__FeaturesInputAssignment_3_3
            	    {
            	    pushFollow(FOLLOW_rule__Operation__FeaturesInputAssignment_3_3_in_rule__Operation__Group_3__3__Impl6670);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3329:1: rule__Operation__Group_3__4 : rule__Operation__Group_3__4__Impl ;
    public final void rule__Operation__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3333:1: ( rule__Operation__Group_3__4__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3334:2: rule__Operation__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__4__Impl_in_rule__Operation__Group_3__46703);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3340:1: rule__Operation__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Operation__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3344:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3345:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3345:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3346:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,33,FOLLOW_33_in_rule__Operation__Group_3__4__Impl6731); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3369:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3373:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3374:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__06772);
            rule__Operation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__06775);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3381:1: rule__Operation__Group_4__0__Impl : ( '@output' ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3385:1: ( ( '@output' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3386:1: ( '@output' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3386:1: ( '@output' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3387:1: '@output'
            {
             before(grammarAccess.getOperationAccess().getOutputKeyword_4_0()); 
            match(input,45,FOLLOW_45_in_rule__Operation__Group_4__0__Impl6803); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3400:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2 ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3404:1: ( rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3405:2: rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__16834);
            rule__Operation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__2_in_rule__Operation__Group_4__16837);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3412:1: rule__Operation__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3416:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3417:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3417:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3418:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_4_1()); 
            match(input,25,FOLLOW_25_in_rule__Operation__Group_4__1__Impl6865); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3431:1: rule__Operation__Group_4__2 : rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3 ;
    public final void rule__Operation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3435:1: ( rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3436:2: rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__2__Impl_in_rule__Operation__Group_4__26896);
            rule__Operation__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__3_in_rule__Operation__Group_4__26899);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3443:1: rule__Operation__Group_4__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3447:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3448:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3448:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3449:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_4_2()); 
            match(input,32,FOLLOW_32_in_rule__Operation__Group_4__2__Impl6927); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3462:1: rule__Operation__Group_4__3 : rule__Operation__Group_4__3__Impl rule__Operation__Group_4__4 ;
    public final void rule__Operation__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3466:1: ( rule__Operation__Group_4__3__Impl rule__Operation__Group_4__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3467:2: rule__Operation__Group_4__3__Impl rule__Operation__Group_4__4
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__3__Impl_in_rule__Operation__Group_4__36958);
            rule__Operation__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__4_in_rule__Operation__Group_4__36961);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3474:1: rule__Operation__Group_4__3__Impl : ( ( ( rule__Operation__FeaturesOutputAssignment_4_3 ) ) ( ( rule__Operation__FeaturesOutputAssignment_4_3 )* ) ) ;
    public final void rule__Operation__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3478:1: ( ( ( ( rule__Operation__FeaturesOutputAssignment_4_3 ) ) ( ( rule__Operation__FeaturesOutputAssignment_4_3 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3479:1: ( ( ( rule__Operation__FeaturesOutputAssignment_4_3 ) ) ( ( rule__Operation__FeaturesOutputAssignment_4_3 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3479:1: ( ( ( rule__Operation__FeaturesOutputAssignment_4_3 ) ) ( ( rule__Operation__FeaturesOutputAssignment_4_3 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3480:1: ( ( rule__Operation__FeaturesOutputAssignment_4_3 ) ) ( ( rule__Operation__FeaturesOutputAssignment_4_3 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3480:1: ( ( rule__Operation__FeaturesOutputAssignment_4_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3481:1: ( rule__Operation__FeaturesOutputAssignment_4_3 )
            {
             before(grammarAccess.getOperationAccess().getFeaturesOutputAssignment_4_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3482:1: ( rule__Operation__FeaturesOutputAssignment_4_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3482:2: rule__Operation__FeaturesOutputAssignment_4_3
            {
            pushFollow(FOLLOW_rule__Operation__FeaturesOutputAssignment_4_3_in_rule__Operation__Group_4__3__Impl6990);
            rule__Operation__FeaturesOutputAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getFeaturesOutputAssignment_4_3()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3485:1: ( ( rule__Operation__FeaturesOutputAssignment_4_3 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3486:1: ( rule__Operation__FeaturesOutputAssignment_4_3 )*
            {
             before(grammarAccess.getOperationAccess().getFeaturesOutputAssignment_4_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3487:1: ( rule__Operation__FeaturesOutputAssignment_4_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==RULE_COMMENTS) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3487:2: rule__Operation__FeaturesOutputAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_rule__Operation__FeaturesOutputAssignment_4_3_in_rule__Operation__Group_4__3__Impl7002);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3498:1: rule__Operation__Group_4__4 : rule__Operation__Group_4__4__Impl ;
    public final void rule__Operation__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3502:1: ( rule__Operation__Group_4__4__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3503:2: rule__Operation__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__4__Impl_in_rule__Operation__Group_4__47035);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3509:1: rule__Operation__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Operation__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3513:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3514:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3514:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3515:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,33,FOLLOW_33_in_rule__Operation__Group_4__4__Impl7063); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3538:1: rule__Operation__Group_5__0 : rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 ;
    public final void rule__Operation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3542:1: ( rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3543:2: rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__07104);
            rule__Operation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__07107);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3550:1: rule__Operation__Group_5__0__Impl : ( '@exception' ) ;
    public final void rule__Operation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3554:1: ( ( '@exception' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3555:1: ( '@exception' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3555:1: ( '@exception' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3556:1: '@exception'
            {
             before(grammarAccess.getOperationAccess().getExceptionKeyword_5_0()); 
            match(input,40,FOLLOW_40_in_rule__Operation__Group_5__0__Impl7135); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3569:1: rule__Operation__Group_5__1 : rule__Operation__Group_5__1__Impl rule__Operation__Group_5__2 ;
    public final void rule__Operation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3573:1: ( rule__Operation__Group_5__1__Impl rule__Operation__Group_5__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3574:2: rule__Operation__Group_5__1__Impl rule__Operation__Group_5__2
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__17166);
            rule__Operation__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_5__2_in_rule__Operation__Group_5__17169);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3581:1: rule__Operation__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Operation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3585:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3586:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3586:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3587:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_5_1()); 
            match(input,25,FOLLOW_25_in_rule__Operation__Group_5__1__Impl7197); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3600:1: rule__Operation__Group_5__2 : rule__Operation__Group_5__2__Impl rule__Operation__Group_5__3 ;
    public final void rule__Operation__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3604:1: ( rule__Operation__Group_5__2__Impl rule__Operation__Group_5__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3605:2: rule__Operation__Group_5__2__Impl rule__Operation__Group_5__3
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__2__Impl_in_rule__Operation__Group_5__27228);
            rule__Operation__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_5__3_in_rule__Operation__Group_5__27231);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3612:1: rule__Operation__Group_5__2__Impl : ( ( rule__Operation__ExceptiontsAssignment_5_2 ) ) ;
    public final void rule__Operation__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3616:1: ( ( ( rule__Operation__ExceptiontsAssignment_5_2 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3617:1: ( ( rule__Operation__ExceptiontsAssignment_5_2 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3617:1: ( ( rule__Operation__ExceptiontsAssignment_5_2 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3618:1: ( rule__Operation__ExceptiontsAssignment_5_2 )
            {
             before(grammarAccess.getOperationAccess().getExceptiontsAssignment_5_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3619:1: ( rule__Operation__ExceptiontsAssignment_5_2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3619:2: rule__Operation__ExceptiontsAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Operation__ExceptiontsAssignment_5_2_in_rule__Operation__Group_5__2__Impl7258);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3629:1: rule__Operation__Group_5__3 : rule__Operation__Group_5__3__Impl ;
    public final void rule__Operation__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3633:1: ( rule__Operation__Group_5__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3634:2: rule__Operation__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__3__Impl_in_rule__Operation__Group_5__37288);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3640:1: rule__Operation__Group_5__3__Impl : ( ( rule__Operation__Group_5_3__0 )* ) ;
    public final void rule__Operation__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3644:1: ( ( ( rule__Operation__Group_5_3__0 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3645:1: ( ( rule__Operation__Group_5_3__0 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3645:1: ( ( rule__Operation__Group_5_3__0 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3646:1: ( rule__Operation__Group_5_3__0 )*
            {
             before(grammarAccess.getOperationAccess().getGroup_5_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3647:1: ( rule__Operation__Group_5_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==46) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3647:2: rule__Operation__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Operation__Group_5_3__0_in_rule__Operation__Group_5__3__Impl7315);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3665:1: rule__Operation__Group_5_3__0 : rule__Operation__Group_5_3__0__Impl rule__Operation__Group_5_3__1 ;
    public final void rule__Operation__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3669:1: ( rule__Operation__Group_5_3__0__Impl rule__Operation__Group_5_3__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3670:2: rule__Operation__Group_5_3__0__Impl rule__Operation__Group_5_3__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_5_3__0__Impl_in_rule__Operation__Group_5_3__07354);
            rule__Operation__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_5_3__1_in_rule__Operation__Group_5_3__07357);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3677:1: rule__Operation__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3681:1: ( ( ',' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3682:1: ( ',' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3682:1: ( ',' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3683:1: ','
            {
             before(grammarAccess.getOperationAccess().getCommaKeyword_5_3_0()); 
            match(input,46,FOLLOW_46_in_rule__Operation__Group_5_3__0__Impl7385); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3696:1: rule__Operation__Group_5_3__1 : rule__Operation__Group_5_3__1__Impl ;
    public final void rule__Operation__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3700:1: ( rule__Operation__Group_5_3__1__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3701:2: rule__Operation__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_5_3__1__Impl_in_rule__Operation__Group_5_3__17416);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3707:1: rule__Operation__Group_5_3__1__Impl : ( ( rule__Operation__ExceptiontsAssignment_5_3_1 ) ) ;
    public final void rule__Operation__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3711:1: ( ( ( rule__Operation__ExceptiontsAssignment_5_3_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3712:1: ( ( rule__Operation__ExceptiontsAssignment_5_3_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3712:1: ( ( rule__Operation__ExceptiontsAssignment_5_3_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3713:1: ( rule__Operation__ExceptiontsAssignment_5_3_1 )
            {
             before(grammarAccess.getOperationAccess().getExceptiontsAssignment_5_3_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3714:1: ( rule__Operation__ExceptiontsAssignment_5_3_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3714:2: rule__Operation__ExceptiontsAssignment_5_3_1
            {
            pushFollow(FOLLOW_rule__Operation__ExceptiontsAssignment_5_3_1_in_rule__Operation__Group_5_3__1__Impl7443);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3728:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3732:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3733:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__07477);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__07480);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3740:1: rule__Event__Group__0__Impl : ( '@event' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3744:1: ( ( '@event' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3745:1: ( '@event' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3745:1: ( '@event' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3746:1: '@event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__Event__Group__0__Impl7508); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3759:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3763:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3764:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__17539);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__2_in_rule__Event__Group__17542);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3771:1: rule__Event__Group__1__Impl : ( '{' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3775:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3776:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3776:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3777:1: '{'
            {
             before(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Event__Group__1__Impl7570); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3790:1: rule__Event__Group__2 : rule__Event__Group__2__Impl ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3794:1: ( rule__Event__Group__2__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3795:2: rule__Event__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__27601);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3801:1: rule__Event__Group__2__Impl : ( '}' ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3805:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3806:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3806:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3807:1: '}'
            {
             before(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__Event__Group__2__Impl7629); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3827:1: rule__Architecture__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Architecture__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3831:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3832:1: ( ruleQualifiedName )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3832:1: ( ruleQualifiedName )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3833:1: ruleQualifiedName
            {
             before(grammarAccess.getArchitectureAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Architecture__NameAssignment_27671);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3842:1: rule__Architecture__ModuleAssignment_3 : ( ruleModule ) ;
    public final void rule__Architecture__ModuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3846:1: ( ( ruleModule ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3847:1: ( ruleModule )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3847:1: ( ruleModule )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3848:1: ruleModule
            {
             before(grammarAccess.getArchitectureAccess().getModuleModuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleModule_in_rule__Architecture__ModuleAssignment_37702);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3857:1: rule__Module__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3861:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3862:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3862:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3863:1: RULE_ID
            {
             before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Module__NameAssignment_27733); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3872:1: rule__Module__VersionAssignment_5 : ( ruleVersion ) ;
    public final void rule__Module__VersionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3876:1: ( ( ruleVersion ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3877:1: ( ruleVersion )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3877:1: ( ruleVersion )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3878:1: ruleVersion
            {
             before(grammarAccess.getModuleAccess().getVersionVersionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleVersion_in_rule__Module__VersionAssignment_57764);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3887:1: rule__Module__ImportsAssignment_6 : ( ruleImport ) ;
    public final void rule__Module__ImportsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3891:1: ( ( ruleImport ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3892:1: ( ruleImport )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3892:1: ( ruleImport )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3893:1: ruleImport
            {
             before(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Module__ImportsAssignment_67795);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3902:1: rule__Module__ModelAssignment_7 : ( ruleModel ) ;
    public final void rule__Module__ModelAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3906:1: ( ( ruleModel ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3907:1: ( ruleModel )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3907:1: ( ruleModel )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3908:1: ruleModel
            {
             before(grammarAccess.getModuleAccess().getModelModelParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleModel_in_rule__Module__ModelAssignment_77826);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3917:1: rule__Module__ExceptionsAssignment_8 : ( ruleExceptions ) ;
    public final void rule__Module__ExceptionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3921:1: ( ( ruleExceptions ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3922:1: ( ruleExceptions )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3922:1: ( ruleExceptions )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3923:1: ruleExceptions
            {
             before(grammarAccess.getModuleAccess().getExceptionsExceptionsParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleExceptions_in_rule__Module__ExceptionsAssignment_87857);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3932:1: rule__Module__ServicesAssignment_9 : ( ruleService ) ;
    public final void rule__Module__ServicesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3936:1: ( ( ruleService ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3937:1: ( ruleService )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3937:1: ( ruleService )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3938:1: ruleService
            {
             before(grammarAccess.getModuleAccess().getServicesServiceParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleService_in_rule__Module__ServicesAssignment_97888);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3947:1: rule__Module__EventAssignment_10 : ( ruleEvent ) ;
    public final void rule__Module__EventAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3951:1: ( ( ruleEvent ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3952:1: ( ruleEvent )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3952:1: ( ruleEvent )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3953:1: ruleEvent
            {
             before(grammarAccess.getModuleAccess().getEventEventParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Module__EventAssignment_107919);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3962:1: rule__Import__ImportedNamespaceAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Import__ImportedNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3966:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3967:1: ( ruleQualifiedName )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3967:1: ( ruleQualifiedName )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3968:1: ruleQualifiedName
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_27950);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3977:1: rule__Model__EntitiesAssignment_2 : ( ruleEntities ) ;
    public final void rule__Model__EntitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3981:1: ( ( ruleEntities ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3982:1: ( ruleEntities )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3982:1: ( ruleEntities )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3983:1: ruleEntities
            {
             before(grammarAccess.getModelAccess().getEntitiesEntitiesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEntities_in_rule__Model__EntitiesAssignment_27981);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3992:1: rule__Comment__ValueAssignment : ( RULE_COMMENTS ) ;
    public final void rule__Comment__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3996:1: ( ( RULE_COMMENTS ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3997:1: ( RULE_COMMENTS )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3997:1: ( RULE_COMMENTS )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3998:1: RULE_COMMENTS
            {
             before(grammarAccess.getCommentAccess().getValueCOMMENTSTerminalRuleCall_0()); 
            match(input,RULE_COMMENTS,FOLLOW_RULE_COMMENTS_in_rule__Comment__ValueAssignment8012); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4007:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4011:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4012:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4012:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4013:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_18043); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4022:1: rule__Enum__FeaturesAssignment_3 : ( RULE_ID ) ;
    public final void rule__Enum__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4026:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4027:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4027:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4028:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getFeaturesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__FeaturesAssignment_38074); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4037:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4041:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4042:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4042:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4043:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_18105); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4052:1: rule__Entity__FeaturesAssignment_3 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4056:1: ( ( ruleFeature ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4057:1: ( ruleFeature )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4057:1: ( ruleFeature )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4058:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_38136);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4067:1: rule__Feature__FeatureCommentAssignment_0 : ( ruleComment ) ;
    public final void rule__Feature__FeatureCommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4071:1: ( ( ruleComment ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4072:1: ( ruleComment )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4072:1: ( ruleComment )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4073:1: ruleComment
            {
             before(grammarAccess.getFeatureAccess().getFeatureCommentCommentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleComment_in_rule__Feature__FeatureCommentAssignment_08167);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4082:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4086:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4087:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4087:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4088:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_18198); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4097:1: rule__Feature__TypeAssignment_3 : ( ruleFeatureType ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4101:1: ( ( ruleFeatureType ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4102:1: ( ruleFeatureType )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4102:1: ( ruleFeatureType )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4103:1: ruleFeatureType
            {
             before(grammarAccess.getFeatureAccess().getTypeFeatureTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFeatureType_in_rule__Feature__TypeAssignment_38229);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4112:1: rule__EntitiesFeature__TypeAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__EntitiesFeature__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4116:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4117:1: ( ( ruleQualifiedName ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4117:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4118:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntitiesFeatureAccess().getTypeEntitiesCrossReference_0()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4119:1: ( ruleQualifiedName )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4120:1: ruleQualifiedName
            {
             before(grammarAccess.getEntitiesFeatureAccess().getTypeEntitiesQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EntitiesFeature__TypeAssignment8264);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4131:1: rule__PrimitiveFeature__TypeAssignment : ( rulePrimitiveType ) ;
    public final void rule__PrimitiveFeature__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4135:1: ( ( rulePrimitiveType ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4136:1: ( rulePrimitiveType )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4136:1: ( rulePrimitiveType )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4137:1: rulePrimitiveType
            {
             before(grammarAccess.getPrimitiveFeatureAccess().getTypePrimitiveTypeEnumRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_rule__PrimitiveFeature__TypeAssignment8299);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4146:1: rule__GenericListFeature__TypeAssignment_2 : ( ruleFeatureType ) ;
    public final void rule__GenericListFeature__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4150:1: ( ( ruleFeatureType ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4151:1: ( ruleFeatureType )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4151:1: ( ruleFeatureType )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4152:1: ruleFeatureType
            {
             before(grammarAccess.getGenericListFeatureAccess().getTypeFeatureTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFeatureType_in_rule__GenericListFeature__TypeAssignment_28330);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4161:1: rule__Exceptions__ExceptionsAssignment_2 : ( ruleException ) ;
    public final void rule__Exceptions__ExceptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4165:1: ( ( ruleException ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4166:1: ( ruleException )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4166:1: ( ruleException )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4167:1: ruleException
            {
             before(grammarAccess.getExceptionsAccess().getExceptionsExceptionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleException_in_rule__Exceptions__ExceptionsAssignment_28361);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4176:1: rule__Exception__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Exception__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4180:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4181:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4181:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4182:1: RULE_ID
            {
             before(grammarAccess.getExceptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Exception__NameAssignment_18392); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4191:1: rule__Exception__MsgAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Exception__MsgAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4195:1: ( ( RULE_STRING ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4196:1: ( RULE_STRING )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4196:1: ( RULE_STRING )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4197:1: RULE_STRING
            {
             before(grammarAccess.getExceptionAccess().getMsgSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Exception__MsgAssignment_58423); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4206:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4210:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4211:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4211:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4212:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_18454); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4221:1: rule__Service__OperationsAssignment_3 : ( ruleOperation ) ;
    public final void rule__Service__OperationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4225:1: ( ( ruleOperation ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4226:1: ( ruleOperation )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4226:1: ( ruleOperation )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4227:1: ruleOperation
            {
             before(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__Service__OperationsAssignment_38485);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4236:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4240:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4241:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4241:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4242:1: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_18516); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4251:1: rule__Operation__FeaturesInputAssignment_3_3 : ( ruleFeature ) ;
    public final void rule__Operation__FeaturesInputAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4255:1: ( ( ruleFeature ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4256:1: ( ruleFeature )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4256:1: ( ruleFeature )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4257:1: ruleFeature
            {
             before(grammarAccess.getOperationAccess().getFeaturesInputFeatureParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Operation__FeaturesInputAssignment_3_38547);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4266:1: rule__Operation__FeaturesOutputAssignment_4_3 : ( ruleFeature ) ;
    public final void rule__Operation__FeaturesOutputAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4270:1: ( ( ruleFeature ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4271:1: ( ruleFeature )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4271:1: ( ruleFeature )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4272:1: ruleFeature
            {
             before(grammarAccess.getOperationAccess().getFeaturesOutputFeatureParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Operation__FeaturesOutputAssignment_4_38578);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4281:1: rule__Operation__ExceptiontsAssignment_5_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Operation__ExceptiontsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4285:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4286:1: ( ( ruleQualifiedName ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4286:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4287:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getOperationAccess().getExceptiontsExceptionCrossReference_5_2_0()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4288:1: ( ruleQualifiedName )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4289:1: ruleQualifiedName
            {
             before(grammarAccess.getOperationAccess().getExceptiontsExceptionQualifiedNameParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Operation__ExceptiontsAssignment_5_28613);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4300:1: rule__Operation__ExceptiontsAssignment_5_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Operation__ExceptiontsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4304:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4305:1: ( ( ruleQualifiedName ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4305:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4306:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getOperationAccess().getExceptiontsExceptionCrossReference_5_3_1_0()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4307:1: ( ruleQualifiedName )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4308:1: ruleQualifiedName
            {
             before(grammarAccess.getOperationAccess().getExceptiontsExceptionQualifiedNameParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Operation__ExceptiontsAssignment_5_3_18652);
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
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13612 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Model__Group__1__Impl3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23674 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__23677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__EntitiesAssignment_2_in_rule__Model__Group__2__Impl3704 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Model__Group__3__Impl3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__03802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__03805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Enum__Group__0__Impl3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__13864 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__13867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__23924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__23927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Enum__Group__2__Impl3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__33986 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__33989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__FeaturesAssignment_3_in_rule__Enum__Group__3__Impl4018 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enum__FeaturesAssignment_3_in_rule__Enum__Group__3__Impl4030 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__44063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Enum__Group__4__Impl4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__04132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__04135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Entity__Group__0__Impl4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__14194 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__14197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__24254 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__24257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Entity__Group__2__Impl4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__34316 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__34319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl4348 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl4360 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__44393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Entity__Group__4__Impl4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__04462 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__04465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__FeatureCommentAssignment_0_in_rule__Feature__Group__0__Impl4492 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__14523 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__14526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__24583 = new BitSet(new long[]{0x0000001000FFF010L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__24586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Feature__Group__2__Impl4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__34645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl4672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__0__Impl_in_rule__GenericListFeature__Group__04710 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__1_in_rule__GenericListFeature__Group__04713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__GenericListFeature__Group__0__Impl4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__1__Impl_in_rule__GenericListFeature__Group__14772 = new BitSet(new long[]{0x0000001000FFF010L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__2_in_rule__GenericListFeature__Group__14775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__GenericListFeature__Group__1__Impl4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__2__Impl_in_rule__GenericListFeature__Group__24834 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__3_in_rule__GenericListFeature__Group__24837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__TypeAssignment_2_in_rule__GenericListFeature__Group__2__Impl4864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__3__Impl_in_rule__GenericListFeature__Group__34894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__GenericListFeature__Group__3__Impl4922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__0__Impl_in_rule__Exceptions__Group__04961 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__1_in_rule__Exceptions__Group__04964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Exceptions__Group__0__Impl4992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__1__Impl_in_rule__Exceptions__Group__15023 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__2_in_rule__Exceptions__Group__15026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Exceptions__Group__1__Impl5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__2__Impl_in_rule__Exceptions__Group__25085 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__3_in_rule__Exceptions__Group__25088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exceptions__ExceptionsAssignment_2_in_rule__Exceptions__Group__2__Impl5117 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Exceptions__ExceptionsAssignment_2_in_rule__Exceptions__Group__2__Impl5129 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Exceptions__Group__3__Impl_in_rule__Exceptions__Group__35162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Exceptions__Group__3__Impl5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__0__Impl_in_rule__Exception__Group__05229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exception__Group__1_in_rule__Exception__Group__05232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Exception__Group__0__Impl5260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__1__Impl_in_rule__Exception__Group__15291 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Exception__Group__2_in_rule__Exception__Group__15294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__NameAssignment_1_in_rule__Exception__Group__1__Impl5321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__2__Impl_in_rule__Exception__Group__25351 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Exception__Group__3_in_rule__Exception__Group__25354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Exception__Group__2__Impl5382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__3__Impl_in_rule__Exception__Group__35413 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Exception__Group__4_in_rule__Exception__Group__35416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Exception__Group__3__Impl5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__4__Impl_in_rule__Exception__Group__45475 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Exception__Group__5_in_rule__Exception__Group__45478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Exception__Group__4__Impl5506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__5__Impl_in_rule__Exception__Group__55537 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Exception__Group__6_in_rule__Exception__Group__55540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__MsgAssignment_5_in_rule__Exception__Group__5__Impl5567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__6__Impl_in_rule__Exception__Group__65597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Exception__Group__6__Impl5625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__05670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__05673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Service__Group__0__Impl5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__15732 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__15735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl5762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__25792 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__25795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Service__Group__2__Impl5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__35854 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__35857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__OperationsAssignment_3_in_rule__Service__Group__3__Impl5886 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Service__OperationsAssignment_3_in_rule__Service__Group__3__Impl5898 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__45931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Service__Group__4__Impl5959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__06000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__06003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Operation__Group__0__Impl6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__16062 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__16065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl6092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__26122 = new BitSet(new long[]{0x0000310200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__26125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Operation__Group__2__Impl6153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__36184 = new BitSet(new long[]{0x0000310200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__36187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl6214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__46245 = new BitSet(new long[]{0x0000310200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__46248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl6275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__56306 = new BitSet(new long[]{0x0000310200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__56309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl6336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__66367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Operation__Group__6__Impl6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__06440 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__06443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Operation__Group_3__0__Impl6471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__16502 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__2_in_rule__Operation__Group_3__16505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operation__Group_3__1__Impl6533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__2__Impl_in_rule__Operation__Group_3__26564 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__3_in_rule__Operation__Group_3__26567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Operation__Group_3__2__Impl6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__3__Impl_in_rule__Operation__Group_3__36626 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__4_in_rule__Operation__Group_3__36629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__FeaturesInputAssignment_3_3_in_rule__Operation__Group_3__3__Impl6658 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Operation__FeaturesInputAssignment_3_3_in_rule__Operation__Group_3__3__Impl6670 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__4__Impl_in_rule__Operation__Group_3__46703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Operation__Group_3__4__Impl6731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__06772 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__06775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Operation__Group_4__0__Impl6803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__16834 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__2_in_rule__Operation__Group_4__16837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operation__Group_4__1__Impl6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__2__Impl_in_rule__Operation__Group_4__26896 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__3_in_rule__Operation__Group_4__26899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Operation__Group_4__2__Impl6927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__3__Impl_in_rule__Operation__Group_4__36958 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__4_in_rule__Operation__Group_4__36961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__FeaturesOutputAssignment_4_3_in_rule__Operation__Group_4__3__Impl6990 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Operation__FeaturesOutputAssignment_4_3_in_rule__Operation__Group_4__3__Impl7002 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__4__Impl_in_rule__Operation__Group_4__47035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Operation__Group_4__4__Impl7063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__07104 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__07107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Operation__Group_5__0__Impl7135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__17166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__2_in_rule__Operation__Group_5__17169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operation__Group_5__1__Impl7197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__2__Impl_in_rule__Operation__Group_5__27228 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__3_in_rule__Operation__Group_5__27231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ExceptiontsAssignment_5_2_in_rule__Operation__Group_5__2__Impl7258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__3__Impl_in_rule__Operation__Group_5__37288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5_3__0_in_rule__Operation__Group_5__3__Impl7315 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5_3__0__Impl_in_rule__Operation__Group_5_3__07354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group_5_3__1_in_rule__Operation__Group_5_3__07357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Operation__Group_5_3__0__Impl7385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5_3__1__Impl_in_rule__Operation__Group_5_3__17416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ExceptiontsAssignment_5_3_1_in_rule__Operation__Group_5_3__1__Impl7443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__07477 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__07480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Event__Group__0__Impl7508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__17539 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Event__Group__2_in_rule__Event__Group__17542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Event__Group__1__Impl7570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__27601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Event__Group__2__Impl7629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Architecture__NameAssignment_27671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__Architecture__ModuleAssignment_37702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Module__NameAssignment_27733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__Module__VersionAssignment_57764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Module__ImportsAssignment_67795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_rule__Module__ModelAssignment_77826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptions_in_rule__Module__ExceptionsAssignment_87857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__Module__ServicesAssignment_97888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Module__EventAssignment_107919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_27950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntities_in_rule__Model__EntitiesAssignment_27981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENTS_in_rule__Comment__ValueAssignment8012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_18043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__FeaturesAssignment_38074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_18105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_38136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_rule__Feature__FeatureCommentAssignment_08167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_18198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureType_in_rule__Feature__TypeAssignment_38229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EntitiesFeature__TypeAssignment8264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__PrimitiveFeature__TypeAssignment8299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureType_in_rule__GenericListFeature__TypeAssignment_28330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleException_in_rule__Exceptions__ExceptionsAssignment_28361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Exception__NameAssignment_18392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Exception__MsgAssignment_58423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_18454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Service__OperationsAssignment_38485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_18516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Operation__FeaturesInputAssignment_3_38547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Operation__FeaturesOutputAssignment_4_38578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Operation__ExceptiontsAssignment_5_28613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Operation__ExceptiontsAssignment_5_3_18652 = new BitSet(new long[]{0x0000000000000002L});

}