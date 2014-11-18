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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_COMMENTS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@String'", "'@Short'", "'@Integer'", "'@Long'", "'@Float'", "'@Double'", "'@Boolean'", "'@Byte'", "'@Date'", "'@Datetime'", "'@Timestamp'", "'@Decimal'", "'@applicationId'", "':'", "'@moduleName'", "'@version'", "'.'", "'-'", "'@import'", "'@model'", "'{'", "'}'", "'@enum'", "'@entity'", "'@List'", "'<'", "'>'", "'@service'", "'@exception'", "'@msg'", "'@operation'", "'@input'", "'@output'", "','", "'@event'"
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


    // $ANTLR start "entryRuleService"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:480:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:481:1: ( ruleService EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:482:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService961);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService968); 

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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:489:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:493:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:494:1: ( ( rule__Service__Group__0 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:494:1: ( ( rule__Service__Group__0 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:495:1: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:496:1: ( rule__Service__Group__0 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:496:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService994);
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


    // $ANTLR start "entryRuleOperation"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:536:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:537:1: ( ruleOperation EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:538:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation1081);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation1088); 

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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:545:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:549:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:550:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:550:1: ( ( rule__Operation__Group__0 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:551:1: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:552:1: ( rule__Operation__Group__0 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:552:2: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_rule__Operation__Group__0_in_ruleOperation1114);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:564:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:565:1: ( ruleEvent EOF )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:566:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent1141);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent1148); 

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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:573:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:577:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:578:1: ( ( rule__Event__Group__0 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:578:1: ( ( rule__Event__Group__0 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:579:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:580:1: ( rule__Event__Group__0 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:580:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_rule__Event__Group__0_in_ruleEvent1174);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1136:1: rule__Module__Group__8__Impl : ( ( rule__Module__ServicesAssignment_8 )* ) ;
    public final void rule__Module__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1140:1: ( ( ( rule__Module__ServicesAssignment_8 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1141:1: ( ( rule__Module__ServicesAssignment_8 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1141:1: ( ( rule__Module__ServicesAssignment_8 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1142:1: ( rule__Module__ServicesAssignment_8 )*
            {
             before(grammarAccess.getModuleAccess().getServicesAssignment_8()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1143:1: ( rule__Module__ServicesAssignment_8 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==39) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1143:2: rule__Module__ServicesAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Module__ServicesAssignment_8_in_rule__Module__Group__8__Impl2395);
            	    rule__Module__ServicesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getServicesAssignment_8()); 

            }


            }

        }
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1164:1: rule__Module__Group__9__Impl : ( ( rule__Module__EventAssignment_9 )? ) ;
    public final void rule__Module__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1168:1: ( ( ( rule__Module__EventAssignment_9 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1169:1: ( ( rule__Module__EventAssignment_9 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1169:1: ( ( rule__Module__EventAssignment_9 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1170:1: ( rule__Module__EventAssignment_9 )?
            {
             before(grammarAccess.getModuleAccess().getEventAssignment_9()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1171:1: ( rule__Module__EventAssignment_9 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==46) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1171:2: rule__Module__EventAssignment_9
                    {
                    pushFollow(FOLLOW_rule__Module__EventAssignment_9_in_rule__Module__Group__9__Impl2453);
                    rule__Module__EventAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getEventAssignment_9()); 

            }


            }

        }
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1747:1: rule__Model__Group__2__Impl : ( ( rule__Model__EntitiesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1751:1: ( ( ( rule__Model__EntitiesAssignment_2 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1752:1: ( ( rule__Model__EntitiesAssignment_2 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1752:1: ( ( rule__Model__EntitiesAssignment_2 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1753:1: ( rule__Model__EntitiesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1754:1: ( rule__Model__EntitiesAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=34 && LA10_0<=35)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1754:2: rule__Model__EntitiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__EntitiesAssignment_2_in_rule__Model__Group__2__Impl3581);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1764:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1768:1: ( rule__Model__Group__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1769:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33612);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1775:1: rule__Model__Group__3__Impl : ( '}' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1779:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1780:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1780:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1781:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__Model__Group__3__Impl3640); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1802:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1806:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1807:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__03679);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__03682);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1814:1: rule__Enum__Group__0__Impl : ( '@enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1818:1: ( ( '@enum' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1819:1: ( '@enum' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1819:1: ( '@enum' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1820:1: '@enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Enum__Group__0__Impl3710); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1833:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1837:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1838:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__13741);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__13744);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1845:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1849:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1850:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1850:1: ( ( rule__Enum__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1851:1: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1852:1: ( rule__Enum__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1852:2: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl3771);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1862:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1866:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1867:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__23801);
            rule__Enum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__23804);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1874:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1878:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1879:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1879:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1880:1: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Enum__Group__2__Impl3832); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1893:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1897:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1898:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__33863);
            rule__Enum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__33866);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1905:1: rule__Enum__Group__3__Impl : ( ( ( rule__Enum__FeaturesAssignment_3 ) ) ( ( rule__Enum__FeaturesAssignment_3 )* ) ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1909:1: ( ( ( ( rule__Enum__FeaturesAssignment_3 ) ) ( ( rule__Enum__FeaturesAssignment_3 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1910:1: ( ( ( rule__Enum__FeaturesAssignment_3 ) ) ( ( rule__Enum__FeaturesAssignment_3 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1910:1: ( ( ( rule__Enum__FeaturesAssignment_3 ) ) ( ( rule__Enum__FeaturesAssignment_3 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1911:1: ( ( rule__Enum__FeaturesAssignment_3 ) ) ( ( rule__Enum__FeaturesAssignment_3 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1911:1: ( ( rule__Enum__FeaturesAssignment_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1912:1: ( rule__Enum__FeaturesAssignment_3 )
            {
             before(grammarAccess.getEnumAccess().getFeaturesAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1913:1: ( rule__Enum__FeaturesAssignment_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1913:2: rule__Enum__FeaturesAssignment_3
            {
            pushFollow(FOLLOW_rule__Enum__FeaturesAssignment_3_in_rule__Enum__Group__3__Impl3895);
            rule__Enum__FeaturesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getFeaturesAssignment_3()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1916:1: ( ( rule__Enum__FeaturesAssignment_3 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1917:1: ( rule__Enum__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getEnumAccess().getFeaturesAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1918:1: ( rule__Enum__FeaturesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1918:2: rule__Enum__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enum__FeaturesAssignment_3_in_rule__Enum__Group__3__Impl3907);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1929:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1933:1: ( rule__Enum__Group__4__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1934:2: rule__Enum__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__43940);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1940:1: rule__Enum__Group__4__Impl : ( '}' ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1944:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1945:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1945:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1946:1: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__Enum__Group__4__Impl3968); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1969:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1973:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1974:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__04009);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__04012);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1981:1: rule__Entity__Group__0__Impl : ( '@entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1985:1: ( ( '@entity' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1986:1: ( '@entity' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1986:1: ( '@entity' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:1987:1: '@entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Entity__Group__0__Impl4040); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2000:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2004:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2005:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__14071);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__14074);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2012:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2016:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2017:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2017:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2018:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2019:1: ( rule__Entity__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2019:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl4101);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2029:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2033:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2034:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__24131);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__24134);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2041:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2045:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2046:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2046:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2047:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Entity__Group__2__Impl4162); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2060:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2064:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2065:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__34193);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__34196);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2072:1: rule__Entity__Group__3__Impl : ( ( ( rule__Entity__FeaturesAssignment_3 ) ) ( ( rule__Entity__FeaturesAssignment_3 )* ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2076:1: ( ( ( ( rule__Entity__FeaturesAssignment_3 ) ) ( ( rule__Entity__FeaturesAssignment_3 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2077:1: ( ( ( rule__Entity__FeaturesAssignment_3 ) ) ( ( rule__Entity__FeaturesAssignment_3 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2077:1: ( ( ( rule__Entity__FeaturesAssignment_3 ) ) ( ( rule__Entity__FeaturesAssignment_3 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2078:1: ( ( rule__Entity__FeaturesAssignment_3 ) ) ( ( rule__Entity__FeaturesAssignment_3 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2078:1: ( ( rule__Entity__FeaturesAssignment_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2079:1: ( rule__Entity__FeaturesAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2080:1: ( rule__Entity__FeaturesAssignment_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2080:2: rule__Entity__FeaturesAssignment_3
            {
            pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl4225);
            rule__Entity__FeaturesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2083:1: ( ( rule__Entity__FeaturesAssignment_3 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2084:1: ( rule__Entity__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2085:1: ( rule__Entity__FeaturesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==RULE_COMMENTS) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2085:2: rule__Entity__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl4237);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2096:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2100:1: ( rule__Entity__Group__4__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2101:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__44270);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2107:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2111:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2112:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2112:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2113:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__Entity__Group__4__Impl4298); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2136:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2140:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2141:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__04339);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__04342);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2148:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__FeatureCommentAssignment_0 )* ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2152:1: ( ( ( rule__Feature__FeatureCommentAssignment_0 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2153:1: ( ( rule__Feature__FeatureCommentAssignment_0 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2153:1: ( ( rule__Feature__FeatureCommentAssignment_0 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2154:1: ( rule__Feature__FeatureCommentAssignment_0 )*
            {
             before(grammarAccess.getFeatureAccess().getFeatureCommentAssignment_0()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2155:1: ( rule__Feature__FeatureCommentAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_COMMENTS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2155:2: rule__Feature__FeatureCommentAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Feature__FeatureCommentAssignment_0_in_rule__Feature__Group__0__Impl4369);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2165:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2169:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2170:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__14400);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__14403);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2177:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2181:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2182:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2182:1: ( ( rule__Feature__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2183:1: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2184:1: ( rule__Feature__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2184:2: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl4430);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2194:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2198:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2199:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__24460);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__24463);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2206:1: rule__Feature__Group__2__Impl : ( ':' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2210:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2211:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2211:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2212:1: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Feature__Group__2__Impl4491); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2225:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2229:1: ( rule__Feature__Group__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2230:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__34522);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2236:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2240:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2241:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2241:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2242:1: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2243:1: ( rule__Feature__TypeAssignment_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2243:2: rule__Feature__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl4549);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2261:1: rule__GenericListFeature__Group__0 : rule__GenericListFeature__Group__0__Impl rule__GenericListFeature__Group__1 ;
    public final void rule__GenericListFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2265:1: ( rule__GenericListFeature__Group__0__Impl rule__GenericListFeature__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2266:2: rule__GenericListFeature__Group__0__Impl rule__GenericListFeature__Group__1
            {
            pushFollow(FOLLOW_rule__GenericListFeature__Group__0__Impl_in_rule__GenericListFeature__Group__04587);
            rule__GenericListFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericListFeature__Group__1_in_rule__GenericListFeature__Group__04590);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2273:1: rule__GenericListFeature__Group__0__Impl : ( '@List' ) ;
    public final void rule__GenericListFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2277:1: ( ( '@List' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2278:1: ( '@List' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2278:1: ( '@List' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2279:1: '@List'
            {
             before(grammarAccess.getGenericListFeatureAccess().getListKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__GenericListFeature__Group__0__Impl4618); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2292:1: rule__GenericListFeature__Group__1 : rule__GenericListFeature__Group__1__Impl rule__GenericListFeature__Group__2 ;
    public final void rule__GenericListFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2296:1: ( rule__GenericListFeature__Group__1__Impl rule__GenericListFeature__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2297:2: rule__GenericListFeature__Group__1__Impl rule__GenericListFeature__Group__2
            {
            pushFollow(FOLLOW_rule__GenericListFeature__Group__1__Impl_in_rule__GenericListFeature__Group__14649);
            rule__GenericListFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericListFeature__Group__2_in_rule__GenericListFeature__Group__14652);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2304:1: rule__GenericListFeature__Group__1__Impl : ( '<' ) ;
    public final void rule__GenericListFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2308:1: ( ( '<' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2309:1: ( '<' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2309:1: ( '<' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2310:1: '<'
            {
             before(grammarAccess.getGenericListFeatureAccess().getLessThanSignKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__GenericListFeature__Group__1__Impl4680); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2323:1: rule__GenericListFeature__Group__2 : rule__GenericListFeature__Group__2__Impl rule__GenericListFeature__Group__3 ;
    public final void rule__GenericListFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2327:1: ( rule__GenericListFeature__Group__2__Impl rule__GenericListFeature__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2328:2: rule__GenericListFeature__Group__2__Impl rule__GenericListFeature__Group__3
            {
            pushFollow(FOLLOW_rule__GenericListFeature__Group__2__Impl_in_rule__GenericListFeature__Group__24711);
            rule__GenericListFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GenericListFeature__Group__3_in_rule__GenericListFeature__Group__24714);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2335:1: rule__GenericListFeature__Group__2__Impl : ( ( rule__GenericListFeature__TypeAssignment_2 ) ) ;
    public final void rule__GenericListFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2339:1: ( ( ( rule__GenericListFeature__TypeAssignment_2 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2340:1: ( ( rule__GenericListFeature__TypeAssignment_2 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2340:1: ( ( rule__GenericListFeature__TypeAssignment_2 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2341:1: ( rule__GenericListFeature__TypeAssignment_2 )
            {
             before(grammarAccess.getGenericListFeatureAccess().getTypeAssignment_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2342:1: ( rule__GenericListFeature__TypeAssignment_2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2342:2: rule__GenericListFeature__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__GenericListFeature__TypeAssignment_2_in_rule__GenericListFeature__Group__2__Impl4741);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2352:1: rule__GenericListFeature__Group__3 : rule__GenericListFeature__Group__3__Impl ;
    public final void rule__GenericListFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2356:1: ( rule__GenericListFeature__Group__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2357:2: rule__GenericListFeature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__GenericListFeature__Group__3__Impl_in_rule__GenericListFeature__Group__34771);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2363:1: rule__GenericListFeature__Group__3__Impl : ( '>' ) ;
    public final void rule__GenericListFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2367:1: ( ( '>' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2368:1: ( '>' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2368:1: ( '>' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2369:1: '>'
            {
             before(grammarAccess.getGenericListFeatureAccess().getGreaterThanSignKeyword_3()); 
            match(input,38,FOLLOW_38_in_rule__GenericListFeature__Group__3__Impl4799); 
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


    // $ANTLR start "rule__Service__Group__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2390:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2394:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2395:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__04838);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__04841);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2402:1: rule__Service__Group__0__Impl : ( '@service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2406:1: ( ( '@service' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2407:1: ( '@service' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2407:1: ( '@service' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2408:1: '@service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Service__Group__0__Impl4869); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2421:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2425:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2426:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__14900);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__14903);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2433:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2437:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2438:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2438:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2439:1: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2440:1: ( rule__Service__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2440:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl4930);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2450:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2454:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2455:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__24960);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__24963);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2462:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2466:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2467:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2467:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2468:1: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Service__Group__2__Impl4991); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2481:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2485:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2486:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__35022);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__35025);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2493:1: rule__Service__Group__3__Impl : ( ( rule__Service__ExceptionsAssignment_3 )* ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2497:1: ( ( ( rule__Service__ExceptionsAssignment_3 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2498:1: ( ( rule__Service__ExceptionsAssignment_3 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2498:1: ( ( rule__Service__ExceptionsAssignment_3 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2499:1: ( rule__Service__ExceptionsAssignment_3 )*
            {
             before(grammarAccess.getServiceAccess().getExceptionsAssignment_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2500:1: ( rule__Service__ExceptionsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==40) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2500:2: rule__Service__ExceptionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Service__ExceptionsAssignment_3_in_rule__Service__Group__3__Impl5052);
            	    rule__Service__ExceptionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getExceptionsAssignment_3()); 

            }


            }

        }
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2510:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2514:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2515:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__45083);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__5_in_rule__Service__Group__45086);
            rule__Service__Group__5();

            state._fsp--;


            }

        }
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2522:1: rule__Service__Group__4__Impl : ( ( rule__Service__OperationsAssignment_4 )* ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2526:1: ( ( ( rule__Service__OperationsAssignment_4 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2527:1: ( ( rule__Service__OperationsAssignment_4 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2527:1: ( ( rule__Service__OperationsAssignment_4 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2528:1: ( rule__Service__OperationsAssignment_4 )*
            {
             before(grammarAccess.getServiceAccess().getOperationsAssignment_4()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2529:1: ( rule__Service__OperationsAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==42) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2529:2: rule__Service__OperationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Service__OperationsAssignment_4_in_rule__Service__Group__4__Impl5113);
            	    rule__Service__OperationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getOperationsAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Service__Group__5"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2539:1: rule__Service__Group__5 : rule__Service__Group__5__Impl ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2543:1: ( rule__Service__Group__5__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2544:2: rule__Service__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__55144);
            rule__Service__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2550:1: rule__Service__Group__5__Impl : ( '}' ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2554:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2555:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2555:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2556:1: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_33_in_rule__Service__Group__5__Impl5172); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Exception__Group__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2581:1: rule__Exception__Group__0 : rule__Exception__Group__0__Impl rule__Exception__Group__1 ;
    public final void rule__Exception__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2585:1: ( rule__Exception__Group__0__Impl rule__Exception__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2586:2: rule__Exception__Group__0__Impl rule__Exception__Group__1
            {
            pushFollow(FOLLOW_rule__Exception__Group__0__Impl_in_rule__Exception__Group__05215);
            rule__Exception__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__1_in_rule__Exception__Group__05218);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2593:1: rule__Exception__Group__0__Impl : ( '@exception' ) ;
    public final void rule__Exception__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2597:1: ( ( '@exception' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2598:1: ( '@exception' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2598:1: ( '@exception' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2599:1: '@exception'
            {
             before(grammarAccess.getExceptionAccess().getExceptionKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Exception__Group__0__Impl5246); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2612:1: rule__Exception__Group__1 : rule__Exception__Group__1__Impl rule__Exception__Group__2 ;
    public final void rule__Exception__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2616:1: ( rule__Exception__Group__1__Impl rule__Exception__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2617:2: rule__Exception__Group__1__Impl rule__Exception__Group__2
            {
            pushFollow(FOLLOW_rule__Exception__Group__1__Impl_in_rule__Exception__Group__15277);
            rule__Exception__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__2_in_rule__Exception__Group__15280);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2624:1: rule__Exception__Group__1__Impl : ( ( rule__Exception__NameAssignment_1 ) ) ;
    public final void rule__Exception__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2628:1: ( ( ( rule__Exception__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2629:1: ( ( rule__Exception__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2629:1: ( ( rule__Exception__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2630:1: ( rule__Exception__NameAssignment_1 )
            {
             before(grammarAccess.getExceptionAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2631:1: ( rule__Exception__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2631:2: rule__Exception__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Exception__NameAssignment_1_in_rule__Exception__Group__1__Impl5307);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2641:1: rule__Exception__Group__2 : rule__Exception__Group__2__Impl rule__Exception__Group__3 ;
    public final void rule__Exception__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2645:1: ( rule__Exception__Group__2__Impl rule__Exception__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2646:2: rule__Exception__Group__2__Impl rule__Exception__Group__3
            {
            pushFollow(FOLLOW_rule__Exception__Group__2__Impl_in_rule__Exception__Group__25337);
            rule__Exception__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__3_in_rule__Exception__Group__25340);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2653:1: rule__Exception__Group__2__Impl : ( '{' ) ;
    public final void rule__Exception__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2657:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2658:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2658:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2659:1: '{'
            {
             before(grammarAccess.getExceptionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Exception__Group__2__Impl5368); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2672:1: rule__Exception__Group__3 : rule__Exception__Group__3__Impl rule__Exception__Group__4 ;
    public final void rule__Exception__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2676:1: ( rule__Exception__Group__3__Impl rule__Exception__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2677:2: rule__Exception__Group__3__Impl rule__Exception__Group__4
            {
            pushFollow(FOLLOW_rule__Exception__Group__3__Impl_in_rule__Exception__Group__35399);
            rule__Exception__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__4_in_rule__Exception__Group__35402);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2684:1: rule__Exception__Group__3__Impl : ( '@msg' ) ;
    public final void rule__Exception__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2688:1: ( ( '@msg' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2689:1: ( '@msg' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2689:1: ( '@msg' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2690:1: '@msg'
            {
             before(grammarAccess.getExceptionAccess().getMsgKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__Exception__Group__3__Impl5430); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2703:1: rule__Exception__Group__4 : rule__Exception__Group__4__Impl rule__Exception__Group__5 ;
    public final void rule__Exception__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2707:1: ( rule__Exception__Group__4__Impl rule__Exception__Group__5 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2708:2: rule__Exception__Group__4__Impl rule__Exception__Group__5
            {
            pushFollow(FOLLOW_rule__Exception__Group__4__Impl_in_rule__Exception__Group__45461);
            rule__Exception__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__5_in_rule__Exception__Group__45464);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2715:1: rule__Exception__Group__4__Impl : ( ':' ) ;
    public final void rule__Exception__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2719:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2720:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2720:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2721:1: ':'
            {
             before(grammarAccess.getExceptionAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Exception__Group__4__Impl5492); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2734:1: rule__Exception__Group__5 : rule__Exception__Group__5__Impl rule__Exception__Group__6 ;
    public final void rule__Exception__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2738:1: ( rule__Exception__Group__5__Impl rule__Exception__Group__6 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2739:2: rule__Exception__Group__5__Impl rule__Exception__Group__6
            {
            pushFollow(FOLLOW_rule__Exception__Group__5__Impl_in_rule__Exception__Group__55523);
            rule__Exception__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exception__Group__6_in_rule__Exception__Group__55526);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2746:1: rule__Exception__Group__5__Impl : ( ( rule__Exception__MsgAssignment_5 ) ) ;
    public final void rule__Exception__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2750:1: ( ( ( rule__Exception__MsgAssignment_5 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2751:1: ( ( rule__Exception__MsgAssignment_5 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2751:1: ( ( rule__Exception__MsgAssignment_5 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2752:1: ( rule__Exception__MsgAssignment_5 )
            {
             before(grammarAccess.getExceptionAccess().getMsgAssignment_5()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2753:1: ( rule__Exception__MsgAssignment_5 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2753:2: rule__Exception__MsgAssignment_5
            {
            pushFollow(FOLLOW_rule__Exception__MsgAssignment_5_in_rule__Exception__Group__5__Impl5553);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2763:1: rule__Exception__Group__6 : rule__Exception__Group__6__Impl ;
    public final void rule__Exception__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2767:1: ( rule__Exception__Group__6__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2768:2: rule__Exception__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Exception__Group__6__Impl_in_rule__Exception__Group__65583);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2774:1: rule__Exception__Group__6__Impl : ( '}' ) ;
    public final void rule__Exception__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2778:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2779:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2779:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2780:1: '}'
            {
             before(grammarAccess.getExceptionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_33_in_rule__Exception__Group__6__Impl5611); 
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


    // $ANTLR start "rule__Operation__Group__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2807:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2811:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2812:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__05656);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__05659);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2819:1: rule__Operation__Group__0__Impl : ( '@operation' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2823:1: ( ( '@operation' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2824:1: ( '@operation' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2824:1: ( '@operation' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2825:1: '@operation'
            {
             before(grammarAccess.getOperationAccess().getOperationKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Operation__Group__0__Impl5687); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2838:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2842:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2843:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__15718);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__15721);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2850:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2854:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2855:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2855:1: ( ( rule__Operation__NameAssignment_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2856:1: ( rule__Operation__NameAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2857:1: ( rule__Operation__NameAssignment_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2857:2: rule__Operation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl5748);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2867:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2871:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2872:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__25778);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__25781);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2879:1: rule__Operation__Group__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2883:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2884:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2884:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2885:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Operation__Group__2__Impl5809); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2898:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2902:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2903:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__35840);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__35843);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2910:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )? ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2914:1: ( ( ( rule__Operation__Group_3__0 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2915:1: ( ( rule__Operation__Group_3__0 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2915:1: ( ( rule__Operation__Group_3__0 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2916:1: ( rule__Operation__Group_3__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2917:1: ( rule__Operation__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==43) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2917:2: rule__Operation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl5870);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2927:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2931:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2932:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__45901);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__45904);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2939:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2943:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2944:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2944:1: ( ( rule__Operation__Group_4__0 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2945:1: ( rule__Operation__Group_4__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2946:1: ( rule__Operation__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==44) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2946:2: rule__Operation__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl5931);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2956:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2960:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2961:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__55962);
            rule__Operation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__55965);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2968:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__Group_5__0 )? ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2972:1: ( ( ( rule__Operation__Group_5__0 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2973:1: ( ( rule__Operation__Group_5__0 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2973:1: ( ( rule__Operation__Group_5__0 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2974:1: ( rule__Operation__Group_5__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_5()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2975:1: ( rule__Operation__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2975:2: rule__Operation__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl5992);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2985:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2989:1: ( rule__Operation__Group__6__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2990:2: rule__Operation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__66023);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:2996:1: rule__Operation__Group__6__Impl : ( '}' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3000:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3001:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3001:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3002:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_33_in_rule__Operation__Group__6__Impl6051); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3029:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
    public final void rule__Operation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3033:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3034:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__06096);
            rule__Operation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__06099);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3041:1: rule__Operation__Group_3__0__Impl : ( '@input' ) ;
    public final void rule__Operation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3045:1: ( ( '@input' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3046:1: ( '@input' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3046:1: ( '@input' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3047:1: '@input'
            {
             before(grammarAccess.getOperationAccess().getInputKeyword_3_0()); 
            match(input,43,FOLLOW_43_in_rule__Operation__Group_3__0__Impl6127); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3060:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2 ;
    public final void rule__Operation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3064:1: ( rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3065:2: rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__16158);
            rule__Operation__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__2_in_rule__Operation__Group_3__16161);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3072:1: rule__Operation__Group_3__1__Impl : ( ':' ) ;
    public final void rule__Operation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3076:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3077:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3077:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3078:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_3_1()); 
            match(input,25,FOLLOW_25_in_rule__Operation__Group_3__1__Impl6189); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3091:1: rule__Operation__Group_3__2 : rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3 ;
    public final void rule__Operation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3095:1: ( rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3096:2: rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__2__Impl_in_rule__Operation__Group_3__26220);
            rule__Operation__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__3_in_rule__Operation__Group_3__26223);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3103:1: rule__Operation__Group_3__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3107:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3108:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3108:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3109:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3_2()); 
            match(input,32,FOLLOW_32_in_rule__Operation__Group_3__2__Impl6251); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3122:1: rule__Operation__Group_3__3 : rule__Operation__Group_3__3__Impl rule__Operation__Group_3__4 ;
    public final void rule__Operation__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3126:1: ( rule__Operation__Group_3__3__Impl rule__Operation__Group_3__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3127:2: rule__Operation__Group_3__3__Impl rule__Operation__Group_3__4
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__3__Impl_in_rule__Operation__Group_3__36282);
            rule__Operation__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__4_in_rule__Operation__Group_3__36285);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3134:1: rule__Operation__Group_3__3__Impl : ( ( ( rule__Operation__FeaturesInputAssignment_3_3 ) ) ( ( rule__Operation__FeaturesInputAssignment_3_3 )* ) ) ;
    public final void rule__Operation__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3138:1: ( ( ( ( rule__Operation__FeaturesInputAssignment_3_3 ) ) ( ( rule__Operation__FeaturesInputAssignment_3_3 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3139:1: ( ( ( rule__Operation__FeaturesInputAssignment_3_3 ) ) ( ( rule__Operation__FeaturesInputAssignment_3_3 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3139:1: ( ( ( rule__Operation__FeaturesInputAssignment_3_3 ) ) ( ( rule__Operation__FeaturesInputAssignment_3_3 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3140:1: ( ( rule__Operation__FeaturesInputAssignment_3_3 ) ) ( ( rule__Operation__FeaturesInputAssignment_3_3 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3140:1: ( ( rule__Operation__FeaturesInputAssignment_3_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3141:1: ( rule__Operation__FeaturesInputAssignment_3_3 )
            {
             before(grammarAccess.getOperationAccess().getFeaturesInputAssignment_3_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3142:1: ( rule__Operation__FeaturesInputAssignment_3_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3142:2: rule__Operation__FeaturesInputAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Operation__FeaturesInputAssignment_3_3_in_rule__Operation__Group_3__3__Impl6314);
            rule__Operation__FeaturesInputAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getFeaturesInputAssignment_3_3()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3145:1: ( ( rule__Operation__FeaturesInputAssignment_3_3 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3146:1: ( rule__Operation__FeaturesInputAssignment_3_3 )*
            {
             before(grammarAccess.getOperationAccess().getFeaturesInputAssignment_3_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3147:1: ( rule__Operation__FeaturesInputAssignment_3_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==RULE_COMMENTS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3147:2: rule__Operation__FeaturesInputAssignment_3_3
            	    {
            	    pushFollow(FOLLOW_rule__Operation__FeaturesInputAssignment_3_3_in_rule__Operation__Group_3__3__Impl6326);
            	    rule__Operation__FeaturesInputAssignment_3_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3158:1: rule__Operation__Group_3__4 : rule__Operation__Group_3__4__Impl ;
    public final void rule__Operation__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3162:1: ( rule__Operation__Group_3__4__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3163:2: rule__Operation__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__4__Impl_in_rule__Operation__Group_3__46359);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3169:1: rule__Operation__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Operation__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3173:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3174:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3174:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3175:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,33,FOLLOW_33_in_rule__Operation__Group_3__4__Impl6387); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3198:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3202:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3203:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__06428);
            rule__Operation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__06431);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3210:1: rule__Operation__Group_4__0__Impl : ( '@output' ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3214:1: ( ( '@output' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3215:1: ( '@output' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3215:1: ( '@output' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3216:1: '@output'
            {
             before(grammarAccess.getOperationAccess().getOutputKeyword_4_0()); 
            match(input,44,FOLLOW_44_in_rule__Operation__Group_4__0__Impl6459); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3229:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2 ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3233:1: ( rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3234:2: rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__16490);
            rule__Operation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__2_in_rule__Operation__Group_4__16493);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3241:1: rule__Operation__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3245:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3246:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3246:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3247:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_4_1()); 
            match(input,25,FOLLOW_25_in_rule__Operation__Group_4__1__Impl6521); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3260:1: rule__Operation__Group_4__2 : rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3 ;
    public final void rule__Operation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3264:1: ( rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3265:2: rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__2__Impl_in_rule__Operation__Group_4__26552);
            rule__Operation__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__3_in_rule__Operation__Group_4__26555);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3272:1: rule__Operation__Group_4__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3276:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3277:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3277:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3278:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_4_2()); 
            match(input,32,FOLLOW_32_in_rule__Operation__Group_4__2__Impl6583); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3291:1: rule__Operation__Group_4__3 : rule__Operation__Group_4__3__Impl rule__Operation__Group_4__4 ;
    public final void rule__Operation__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3295:1: ( rule__Operation__Group_4__3__Impl rule__Operation__Group_4__4 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3296:2: rule__Operation__Group_4__3__Impl rule__Operation__Group_4__4
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__3__Impl_in_rule__Operation__Group_4__36614);
            rule__Operation__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__4_in_rule__Operation__Group_4__36617);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3303:1: rule__Operation__Group_4__3__Impl : ( ( ( rule__Operation__FeaturesOutputAssignment_4_3 ) ) ( ( rule__Operation__FeaturesOutputAssignment_4_3 )* ) ) ;
    public final void rule__Operation__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3307:1: ( ( ( ( rule__Operation__FeaturesOutputAssignment_4_3 ) ) ( ( rule__Operation__FeaturesOutputAssignment_4_3 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3308:1: ( ( ( rule__Operation__FeaturesOutputAssignment_4_3 ) ) ( ( rule__Operation__FeaturesOutputAssignment_4_3 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3308:1: ( ( ( rule__Operation__FeaturesOutputAssignment_4_3 ) ) ( ( rule__Operation__FeaturesOutputAssignment_4_3 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3309:1: ( ( rule__Operation__FeaturesOutputAssignment_4_3 ) ) ( ( rule__Operation__FeaturesOutputAssignment_4_3 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3309:1: ( ( rule__Operation__FeaturesOutputAssignment_4_3 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3310:1: ( rule__Operation__FeaturesOutputAssignment_4_3 )
            {
             before(grammarAccess.getOperationAccess().getFeaturesOutputAssignment_4_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3311:1: ( rule__Operation__FeaturesOutputAssignment_4_3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3311:2: rule__Operation__FeaturesOutputAssignment_4_3
            {
            pushFollow(FOLLOW_rule__Operation__FeaturesOutputAssignment_4_3_in_rule__Operation__Group_4__3__Impl6646);
            rule__Operation__FeaturesOutputAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getFeaturesOutputAssignment_4_3()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3314:1: ( ( rule__Operation__FeaturesOutputAssignment_4_3 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3315:1: ( rule__Operation__FeaturesOutputAssignment_4_3 )*
            {
             before(grammarAccess.getOperationAccess().getFeaturesOutputAssignment_4_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3316:1: ( rule__Operation__FeaturesOutputAssignment_4_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==RULE_COMMENTS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3316:2: rule__Operation__FeaturesOutputAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_rule__Operation__FeaturesOutputAssignment_4_3_in_rule__Operation__Group_4__3__Impl6658);
            	    rule__Operation__FeaturesOutputAssignment_4_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3327:1: rule__Operation__Group_4__4 : rule__Operation__Group_4__4__Impl ;
    public final void rule__Operation__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3331:1: ( rule__Operation__Group_4__4__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3332:2: rule__Operation__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__4__Impl_in_rule__Operation__Group_4__46691);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3338:1: rule__Operation__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Operation__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3342:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3343:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3343:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3344:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,33,FOLLOW_33_in_rule__Operation__Group_4__4__Impl6719); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3367:1: rule__Operation__Group_5__0 : rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 ;
    public final void rule__Operation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3371:1: ( rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3372:2: rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__06760);
            rule__Operation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__06763);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3379:1: rule__Operation__Group_5__0__Impl : ( '@exception' ) ;
    public final void rule__Operation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3383:1: ( ( '@exception' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3384:1: ( '@exception' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3384:1: ( '@exception' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3385:1: '@exception'
            {
             before(grammarAccess.getOperationAccess().getExceptionKeyword_5_0()); 
            match(input,40,FOLLOW_40_in_rule__Operation__Group_5__0__Impl6791); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3398:1: rule__Operation__Group_5__1 : rule__Operation__Group_5__1__Impl rule__Operation__Group_5__2 ;
    public final void rule__Operation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3402:1: ( rule__Operation__Group_5__1__Impl rule__Operation__Group_5__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3403:2: rule__Operation__Group_5__1__Impl rule__Operation__Group_5__2
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__16822);
            rule__Operation__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_5__2_in_rule__Operation__Group_5__16825);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3410:1: rule__Operation__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Operation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3414:1: ( ( ':' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3415:1: ( ':' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3415:1: ( ':' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3416:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_5_1()); 
            match(input,25,FOLLOW_25_in_rule__Operation__Group_5__1__Impl6853); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3429:1: rule__Operation__Group_5__2 : rule__Operation__Group_5__2__Impl rule__Operation__Group_5__3 ;
    public final void rule__Operation__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3433:1: ( rule__Operation__Group_5__2__Impl rule__Operation__Group_5__3 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3434:2: rule__Operation__Group_5__2__Impl rule__Operation__Group_5__3
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__2__Impl_in_rule__Operation__Group_5__26884);
            rule__Operation__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_5__3_in_rule__Operation__Group_5__26887);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3441:1: rule__Operation__Group_5__2__Impl : ( ( ( rule__Operation__ExceptiontsAssignment_5_2 ) ) ( ( rule__Operation__ExceptiontsAssignment_5_2 )* ) ) ;
    public final void rule__Operation__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3445:1: ( ( ( ( rule__Operation__ExceptiontsAssignment_5_2 ) ) ( ( rule__Operation__ExceptiontsAssignment_5_2 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3446:1: ( ( ( rule__Operation__ExceptiontsAssignment_5_2 ) ) ( ( rule__Operation__ExceptiontsAssignment_5_2 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3446:1: ( ( ( rule__Operation__ExceptiontsAssignment_5_2 ) ) ( ( rule__Operation__ExceptiontsAssignment_5_2 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3447:1: ( ( rule__Operation__ExceptiontsAssignment_5_2 ) ) ( ( rule__Operation__ExceptiontsAssignment_5_2 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3447:1: ( ( rule__Operation__ExceptiontsAssignment_5_2 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3448:1: ( rule__Operation__ExceptiontsAssignment_5_2 )
            {
             before(grammarAccess.getOperationAccess().getExceptiontsAssignment_5_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3449:1: ( rule__Operation__ExceptiontsAssignment_5_2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3449:2: rule__Operation__ExceptiontsAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Operation__ExceptiontsAssignment_5_2_in_rule__Operation__Group_5__2__Impl6916);
            rule__Operation__ExceptiontsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getExceptiontsAssignment_5_2()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3452:1: ( ( rule__Operation__ExceptiontsAssignment_5_2 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3453:1: ( rule__Operation__ExceptiontsAssignment_5_2 )*
            {
             before(grammarAccess.getOperationAccess().getExceptiontsAssignment_5_2()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3454:1: ( rule__Operation__ExceptiontsAssignment_5_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3454:2: rule__Operation__ExceptiontsAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_rule__Operation__ExceptiontsAssignment_5_2_in_rule__Operation__Group_5__2__Impl6928);
            	    rule__Operation__ExceptiontsAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getExceptiontsAssignment_5_2()); 

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
    // $ANTLR end "rule__Operation__Group_5__2__Impl"


    // $ANTLR start "rule__Operation__Group_5__3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3465:1: rule__Operation__Group_5__3 : rule__Operation__Group_5__3__Impl ;
    public final void rule__Operation__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3469:1: ( rule__Operation__Group_5__3__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3470:2: rule__Operation__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_5__3__Impl_in_rule__Operation__Group_5__36961);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3476:1: rule__Operation__Group_5__3__Impl : ( ( rule__Operation__Group_5_3__0 )? ) ;
    public final void rule__Operation__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3480:1: ( ( ( rule__Operation__Group_5_3__0 )? ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3481:1: ( ( rule__Operation__Group_5_3__0 )? )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3481:1: ( ( rule__Operation__Group_5_3__0 )? )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3482:1: ( rule__Operation__Group_5_3__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_5_3()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3483:1: ( rule__Operation__Group_5_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3483:2: rule__Operation__Group_5_3__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_5_3__0_in_rule__Operation__Group_5__3__Impl6988);
                    rule__Operation__Group_5_3__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3501:1: rule__Operation__Group_5_3__0 : rule__Operation__Group_5_3__0__Impl rule__Operation__Group_5_3__1 ;
    public final void rule__Operation__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3505:1: ( rule__Operation__Group_5_3__0__Impl rule__Operation__Group_5_3__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3506:2: rule__Operation__Group_5_3__0__Impl rule__Operation__Group_5_3__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_5_3__0__Impl_in_rule__Operation__Group_5_3__07027);
            rule__Operation__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_5_3__1_in_rule__Operation__Group_5_3__07030);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3513:1: rule__Operation__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3517:1: ( ( ',' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3518:1: ( ',' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3518:1: ( ',' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3519:1: ','
            {
             before(grammarAccess.getOperationAccess().getCommaKeyword_5_3_0()); 
            match(input,45,FOLLOW_45_in_rule__Operation__Group_5_3__0__Impl7058); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3532:1: rule__Operation__Group_5_3__1 : rule__Operation__Group_5_3__1__Impl ;
    public final void rule__Operation__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3536:1: ( rule__Operation__Group_5_3__1__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3537:2: rule__Operation__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_5_3__1__Impl_in_rule__Operation__Group_5_3__17089);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3543:1: rule__Operation__Group_5_3__1__Impl : ( ( ( rule__Operation__ExceptiontsAssignment_5_3_1 ) ) ( ( rule__Operation__ExceptiontsAssignment_5_3_1 )* ) ) ;
    public final void rule__Operation__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3547:1: ( ( ( ( rule__Operation__ExceptiontsAssignment_5_3_1 ) ) ( ( rule__Operation__ExceptiontsAssignment_5_3_1 )* ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3548:1: ( ( ( rule__Operation__ExceptiontsAssignment_5_3_1 ) ) ( ( rule__Operation__ExceptiontsAssignment_5_3_1 )* ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3548:1: ( ( ( rule__Operation__ExceptiontsAssignment_5_3_1 ) ) ( ( rule__Operation__ExceptiontsAssignment_5_3_1 )* ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3549:1: ( ( rule__Operation__ExceptiontsAssignment_5_3_1 ) ) ( ( rule__Operation__ExceptiontsAssignment_5_3_1 )* )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3549:1: ( ( rule__Operation__ExceptiontsAssignment_5_3_1 ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3550:1: ( rule__Operation__ExceptiontsAssignment_5_3_1 )
            {
             before(grammarAccess.getOperationAccess().getExceptiontsAssignment_5_3_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3551:1: ( rule__Operation__ExceptiontsAssignment_5_3_1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3551:2: rule__Operation__ExceptiontsAssignment_5_3_1
            {
            pushFollow(FOLLOW_rule__Operation__ExceptiontsAssignment_5_3_1_in_rule__Operation__Group_5_3__1__Impl7118);
            rule__Operation__ExceptiontsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getExceptiontsAssignment_5_3_1()); 

            }

            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3554:1: ( ( rule__Operation__ExceptiontsAssignment_5_3_1 )* )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3555:1: ( rule__Operation__ExceptiontsAssignment_5_3_1 )*
            {
             before(grammarAccess.getOperationAccess().getExceptiontsAssignment_5_3_1()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3556:1: ( rule__Operation__ExceptiontsAssignment_5_3_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3556:2: rule__Operation__ExceptiontsAssignment_5_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Operation__ExceptiontsAssignment_5_3_1_in_rule__Operation__Group_5_3__1__Impl7130);
            	    rule__Operation__ExceptiontsAssignment_5_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getExceptiontsAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Operation__Group_5_3__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3571:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3575:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3576:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__07167);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__07170);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3583:1: rule__Event__Group__0__Impl : ( '@event' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3587:1: ( ( '@event' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3588:1: ( '@event' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3588:1: ( '@event' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3589:1: '@event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__Event__Group__0__Impl7198); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3602:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3606:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3607:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__17229);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__2_in_rule__Event__Group__17232);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3614:1: rule__Event__Group__1__Impl : ( '{' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3618:1: ( ( '{' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3619:1: ( '{' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3619:1: ( '{' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3620:1: '{'
            {
             before(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Event__Group__1__Impl7260); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3633:1: rule__Event__Group__2 : rule__Event__Group__2__Impl ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3637:1: ( rule__Event__Group__2__Impl )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3638:2: rule__Event__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__27291);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3644:1: rule__Event__Group__2__Impl : ( '}' ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3648:1: ( ( '}' ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3649:1: ( '}' )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3649:1: ( '}' )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3650:1: '}'
            {
             before(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__Event__Group__2__Impl7319); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3670:1: rule__Architecture__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Architecture__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3674:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3675:1: ( ruleQualifiedName )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3675:1: ( ruleQualifiedName )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3676:1: ruleQualifiedName
            {
             before(grammarAccess.getArchitectureAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Architecture__NameAssignment_27361);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3685:1: rule__Architecture__ModuleAssignment_3 : ( ruleModule ) ;
    public final void rule__Architecture__ModuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3689:1: ( ( ruleModule ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3690:1: ( ruleModule )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3690:1: ( ruleModule )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3691:1: ruleModule
            {
             before(grammarAccess.getArchitectureAccess().getModuleModuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleModule_in_rule__Architecture__ModuleAssignment_37392);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3700:1: rule__Module__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3704:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3705:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3705:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3706:1: RULE_ID
            {
             before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Module__NameAssignment_27423); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3715:1: rule__Module__VersionAssignment_5 : ( ruleVersion ) ;
    public final void rule__Module__VersionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3719:1: ( ( ruleVersion ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3720:1: ( ruleVersion )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3720:1: ( ruleVersion )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3721:1: ruleVersion
            {
             before(grammarAccess.getModuleAccess().getVersionVersionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleVersion_in_rule__Module__VersionAssignment_57454);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3730:1: rule__Module__ImportsAssignment_6 : ( ruleImport ) ;
    public final void rule__Module__ImportsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3734:1: ( ( ruleImport ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3735:1: ( ruleImport )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3735:1: ( ruleImport )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3736:1: ruleImport
            {
             before(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Module__ImportsAssignment_67485);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3745:1: rule__Module__ModelAssignment_7 : ( ruleModel ) ;
    public final void rule__Module__ModelAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3749:1: ( ( ruleModel ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3750:1: ( ruleModel )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3750:1: ( ruleModel )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3751:1: ruleModel
            {
             before(grammarAccess.getModuleAccess().getModelModelParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleModel_in_rule__Module__ModelAssignment_77516);
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


    // $ANTLR start "rule__Module__ServicesAssignment_8"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3760:1: rule__Module__ServicesAssignment_8 : ( ruleService ) ;
    public final void rule__Module__ServicesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3764:1: ( ( ruleService ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3765:1: ( ruleService )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3765:1: ( ruleService )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3766:1: ruleService
            {
             before(grammarAccess.getModuleAccess().getServicesServiceParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleService_in_rule__Module__ServicesAssignment_87547);
            ruleService();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getServicesServiceParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__ServicesAssignment_8"


    // $ANTLR start "rule__Module__EventAssignment_9"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3775:1: rule__Module__EventAssignment_9 : ( ruleEvent ) ;
    public final void rule__Module__EventAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3779:1: ( ( ruleEvent ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3780:1: ( ruleEvent )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3780:1: ( ruleEvent )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3781:1: ruleEvent
            {
             before(grammarAccess.getModuleAccess().getEventEventParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Module__EventAssignment_97578);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getEventEventParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__EventAssignment_9"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_2"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3790:1: rule__Import__ImportedNamespaceAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Import__ImportedNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3794:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3795:1: ( ruleQualifiedName )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3795:1: ( ruleQualifiedName )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3796:1: ruleQualifiedName
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_27609);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3805:1: rule__Model__EntitiesAssignment_2 : ( ruleEntities ) ;
    public final void rule__Model__EntitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3809:1: ( ( ruleEntities ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3810:1: ( ruleEntities )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3810:1: ( ruleEntities )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3811:1: ruleEntities
            {
             before(grammarAccess.getModelAccess().getEntitiesEntitiesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEntities_in_rule__Model__EntitiesAssignment_27640);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3820:1: rule__Comment__ValueAssignment : ( RULE_COMMENTS ) ;
    public final void rule__Comment__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3824:1: ( ( RULE_COMMENTS ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3825:1: ( RULE_COMMENTS )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3825:1: ( RULE_COMMENTS )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3826:1: RULE_COMMENTS
            {
             before(grammarAccess.getCommentAccess().getValueCOMMENTSTerminalRuleCall_0()); 
            match(input,RULE_COMMENTS,FOLLOW_RULE_COMMENTS_in_rule__Comment__ValueAssignment7671); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3835:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3839:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3840:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3840:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3841:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_17702); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3850:1: rule__Enum__FeaturesAssignment_3 : ( RULE_ID ) ;
    public final void rule__Enum__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3854:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3855:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3855:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3856:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getFeaturesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__FeaturesAssignment_37733); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3865:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3869:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3870:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3870:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3871:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_17764); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3880:1: rule__Entity__FeaturesAssignment_3 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3884:1: ( ( ruleFeature ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3885:1: ( ruleFeature )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3885:1: ( ruleFeature )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3886:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_37795);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3895:1: rule__Feature__FeatureCommentAssignment_0 : ( ruleComment ) ;
    public final void rule__Feature__FeatureCommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3899:1: ( ( ruleComment ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3900:1: ( ruleComment )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3900:1: ( ruleComment )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3901:1: ruleComment
            {
             before(grammarAccess.getFeatureAccess().getFeatureCommentCommentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleComment_in_rule__Feature__FeatureCommentAssignment_07826);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3910:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3914:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3915:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3915:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3916:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_17857); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3925:1: rule__Feature__TypeAssignment_3 : ( ruleFeatureType ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3929:1: ( ( ruleFeatureType ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3930:1: ( ruleFeatureType )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3930:1: ( ruleFeatureType )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3931:1: ruleFeatureType
            {
             before(grammarAccess.getFeatureAccess().getTypeFeatureTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFeatureType_in_rule__Feature__TypeAssignment_37888);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3940:1: rule__EntitiesFeature__TypeAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__EntitiesFeature__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3944:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3945:1: ( ( ruleQualifiedName ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3945:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3946:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntitiesFeatureAccess().getTypeEntitiesCrossReference_0()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3947:1: ( ruleQualifiedName )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3948:1: ruleQualifiedName
            {
             before(grammarAccess.getEntitiesFeatureAccess().getTypeEntitiesQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__EntitiesFeature__TypeAssignment7923);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3959:1: rule__PrimitiveFeature__TypeAssignment : ( rulePrimitiveType ) ;
    public final void rule__PrimitiveFeature__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3963:1: ( ( rulePrimitiveType ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3964:1: ( rulePrimitiveType )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3964:1: ( rulePrimitiveType )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3965:1: rulePrimitiveType
            {
             before(grammarAccess.getPrimitiveFeatureAccess().getTypePrimitiveTypeEnumRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_rule__PrimitiveFeature__TypeAssignment7958);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3974:1: rule__GenericListFeature__TypeAssignment_2 : ( ruleFeatureType ) ;
    public final void rule__GenericListFeature__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3978:1: ( ( ruleFeatureType ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3979:1: ( ruleFeatureType )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3979:1: ( ruleFeatureType )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3980:1: ruleFeatureType
            {
             before(grammarAccess.getGenericListFeatureAccess().getTypeFeatureTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFeatureType_in_rule__GenericListFeature__TypeAssignment_27989);
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


    // $ANTLR start "rule__Service__NameAssignment_1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3989:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3993:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3994:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3994:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:3995:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_18020); 
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


    // $ANTLR start "rule__Service__ExceptionsAssignment_3"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4004:1: rule__Service__ExceptionsAssignment_3 : ( ruleException ) ;
    public final void rule__Service__ExceptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4008:1: ( ( ruleException ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4009:1: ( ruleException )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4009:1: ( ruleException )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4010:1: ruleException
            {
             before(grammarAccess.getServiceAccess().getExceptionsExceptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleException_in_rule__Service__ExceptionsAssignment_38051);
            ruleException();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getExceptionsExceptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ExceptionsAssignment_3"


    // $ANTLR start "rule__Service__OperationsAssignment_4"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4019:1: rule__Service__OperationsAssignment_4 : ( ruleOperation ) ;
    public final void rule__Service__OperationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4023:1: ( ( ruleOperation ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4024:1: ( ruleOperation )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4024:1: ( ruleOperation )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4025:1: ruleOperation
            {
             before(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__Service__OperationsAssignment_48082);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__OperationsAssignment_4"


    // $ANTLR start "rule__Exception__NameAssignment_1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4034:1: rule__Exception__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Exception__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4038:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4039:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4039:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4040:1: RULE_ID
            {
             before(grammarAccess.getExceptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Exception__NameAssignment_18113); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4049:1: rule__Exception__MsgAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Exception__MsgAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4053:1: ( ( RULE_STRING ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4054:1: ( RULE_STRING )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4054:1: ( RULE_STRING )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4055:1: RULE_STRING
            {
             before(grammarAccess.getExceptionAccess().getMsgSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Exception__MsgAssignment_58144); 
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


    // $ANTLR start "rule__Operation__NameAssignment_1"
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4064:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4068:1: ( ( RULE_ID ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4069:1: ( RULE_ID )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4069:1: ( RULE_ID )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4070:1: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_18175); 
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4079:1: rule__Operation__FeaturesInputAssignment_3_3 : ( ruleFeature ) ;
    public final void rule__Operation__FeaturesInputAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4083:1: ( ( ruleFeature ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4084:1: ( ruleFeature )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4084:1: ( ruleFeature )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4085:1: ruleFeature
            {
             before(grammarAccess.getOperationAccess().getFeaturesInputFeatureParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Operation__FeaturesInputAssignment_3_38206);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4094:1: rule__Operation__FeaturesOutputAssignment_4_3 : ( ruleFeature ) ;
    public final void rule__Operation__FeaturesOutputAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4098:1: ( ( ruleFeature ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4099:1: ( ruleFeature )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4099:1: ( ruleFeature )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4100:1: ruleFeature
            {
             before(grammarAccess.getOperationAccess().getFeaturesOutputFeatureParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Operation__FeaturesOutputAssignment_4_38237);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4109:1: rule__Operation__ExceptiontsAssignment_5_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Operation__ExceptiontsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4113:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4114:1: ( ( ruleQualifiedName ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4114:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4115:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getOperationAccess().getExceptiontsExceptionCrossReference_5_2_0()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4116:1: ( ruleQualifiedName )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4117:1: ruleQualifiedName
            {
             before(grammarAccess.getOperationAccess().getExceptiontsExceptionQualifiedNameParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Operation__ExceptiontsAssignment_5_28272);
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
    // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4128:1: rule__Operation__ExceptiontsAssignment_5_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Operation__ExceptiontsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4132:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4133:1: ( ( ruleQualifiedName ) )
            {
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4133:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4134:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getOperationAccess().getExceptiontsExceptionCrossReference_5_3_1_0()); 
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4135:1: ( ruleQualifiedName )
            // ../com.mguidi.soa.ui/src-gen/com/mguidi/soa/ui/contentassist/antlr/internal/InternalSOA.g:4136:1: ruleQualifiedName
            {
             before(grammarAccess.getOperationAccess().getExceptiontsExceptionQualifiedNameParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Operation__ExceptiontsAssignment_5_3_18311);
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
    public static final BitSet FOLLOW_ruleService_in_entryRuleService961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleException_in_entryRuleException1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleException1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__0_in_ruleException1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent1174 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__52183 = new BitSet(new long[]{0x00004080C0000000L});
    public static final BitSet FOLLOW_rule__Module__Group__6_in_rule__Module__Group__52186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__VersionAssignment_5_in_rule__Module__Group__5__Impl2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__62243 = new BitSet(new long[]{0x00004080C0000000L});
    public static final BitSet FOLLOW_rule__Module__Group__7_in_rule__Module__Group__62246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ImportsAssignment_6_in_rule__Module__Group__6__Impl2273 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Module__Group__7__Impl_in_rule__Module__Group__72304 = new BitSet(new long[]{0x00004080C0000000L});
    public static final BitSet FOLLOW_rule__Module__Group__8_in_rule__Module__Group__72307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ModelAssignment_7_in_rule__Module__Group__7__Impl2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__8__Impl_in_rule__Module__Group__82365 = new BitSet(new long[]{0x00004080C0000000L});
    public static final BitSet FOLLOW_rule__Module__Group__9_in_rule__Module__Group__82368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ServicesAssignment_8_in_rule__Module__Group__8__Impl2395 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__9__Impl_in_rule__Module__Group__92426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__EventAssignment_9_in_rule__Module__Group__9__Impl2453 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13489 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Model__Group__1__Impl3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23551 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__23554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__EntitiesAssignment_2_in_rule__Model__Group__2__Impl3581 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Model__Group__3__Impl3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__03679 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__03682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Enum__Group__0__Impl3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__13741 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__13744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__NameAssignment_1_in_rule__Enum__Group__1__Impl3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__23801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__23804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Enum__Group__2__Impl3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__33863 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__33866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__FeaturesAssignment_3_in_rule__Enum__Group__3__Impl3895 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enum__FeaturesAssignment_3_in_rule__Enum__Group__3__Impl3907 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__43940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Enum__Group__4__Impl3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__04009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__04012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Entity__Group__0__Impl4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__14071 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__14074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__24131 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__24134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Entity__Group__2__Impl4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__34193 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__34196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl4225 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl4237 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__44270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Entity__Group__4__Impl4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__04339 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__04342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__FeatureCommentAssignment_0_in_rule__Feature__Group__0__Impl4369 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__14400 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__14403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__24460 = new BitSet(new long[]{0x0000001000FFF010L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__24463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Feature__Group__2__Impl4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__34522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__0__Impl_in_rule__GenericListFeature__Group__04587 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__1_in_rule__GenericListFeature__Group__04590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__GenericListFeature__Group__0__Impl4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__1__Impl_in_rule__GenericListFeature__Group__14649 = new BitSet(new long[]{0x0000001000FFF010L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__2_in_rule__GenericListFeature__Group__14652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__GenericListFeature__Group__1__Impl4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__2__Impl_in_rule__GenericListFeature__Group__24711 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__3_in_rule__GenericListFeature__Group__24714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__TypeAssignment_2_in_rule__GenericListFeature__Group__2__Impl4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GenericListFeature__Group__3__Impl_in_rule__GenericListFeature__Group__34771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__GenericListFeature__Group__3__Impl4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__04838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__04841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Service__Group__0__Impl4869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__14900 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__14903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__24960 = new BitSet(new long[]{0x0000050200000000L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__24963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Service__Group__2__Impl4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__35022 = new BitSet(new long[]{0x0000050200000000L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__35025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__ExceptionsAssignment_3_in_rule__Service__Group__3__Impl5052 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__45083 = new BitSet(new long[]{0x0000050200000000L});
    public static final BitSet FOLLOW_rule__Service__Group__5_in_rule__Service__Group__45086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__OperationsAssignment_4_in_rule__Service__Group__4__Impl5113 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__55144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Service__Group__5__Impl5172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__0__Impl_in_rule__Exception__Group__05215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exception__Group__1_in_rule__Exception__Group__05218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Exception__Group__0__Impl5246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__1__Impl_in_rule__Exception__Group__15277 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Exception__Group__2_in_rule__Exception__Group__15280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__NameAssignment_1_in_rule__Exception__Group__1__Impl5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__2__Impl_in_rule__Exception__Group__25337 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Exception__Group__3_in_rule__Exception__Group__25340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Exception__Group__2__Impl5368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__3__Impl_in_rule__Exception__Group__35399 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Exception__Group__4_in_rule__Exception__Group__35402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Exception__Group__3__Impl5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__4__Impl_in_rule__Exception__Group__45461 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Exception__Group__5_in_rule__Exception__Group__45464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Exception__Group__4__Impl5492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__5__Impl_in_rule__Exception__Group__55523 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Exception__Group__6_in_rule__Exception__Group__55526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__MsgAssignment_5_in_rule__Exception__Group__5__Impl5553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exception__Group__6__Impl_in_rule__Exception__Group__65583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Exception__Group__6__Impl5611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__05656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__05659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Operation__Group__0__Impl5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__15718 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__15721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl5748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__25778 = new BitSet(new long[]{0x0000190200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__25781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Operation__Group__2__Impl5809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__35840 = new BitSet(new long[]{0x0000190200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__35843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__45901 = new BitSet(new long[]{0x0000190200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__45904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl5931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__55962 = new BitSet(new long[]{0x0000190200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__6_in_rule__Operation__Group__55965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__0_in_rule__Operation__Group__5__Impl5992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__6__Impl_in_rule__Operation__Group__66023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Operation__Group__6__Impl6051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__06096 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__06099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Operation__Group_3__0__Impl6127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__16158 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__2_in_rule__Operation__Group_3__16161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operation__Group_3__1__Impl6189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__2__Impl_in_rule__Operation__Group_3__26220 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__3_in_rule__Operation__Group_3__26223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Operation__Group_3__2__Impl6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__3__Impl_in_rule__Operation__Group_3__36282 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__4_in_rule__Operation__Group_3__36285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__FeaturesInputAssignment_3_3_in_rule__Operation__Group_3__3__Impl6314 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Operation__FeaturesInputAssignment_3_3_in_rule__Operation__Group_3__3__Impl6326 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__4__Impl_in_rule__Operation__Group_3__46359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Operation__Group_3__4__Impl6387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__06428 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__06431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Operation__Group_4__0__Impl6459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__16490 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__2_in_rule__Operation__Group_4__16493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operation__Group_4__1__Impl6521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__2__Impl_in_rule__Operation__Group_4__26552 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__3_in_rule__Operation__Group_4__26555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Operation__Group_4__2__Impl6583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__3__Impl_in_rule__Operation__Group_4__36614 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__4_in_rule__Operation__Group_4__36617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__FeaturesOutputAssignment_4_3_in_rule__Operation__Group_4__3__Impl6646 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Operation__FeaturesOutputAssignment_4_3_in_rule__Operation__Group_4__3__Impl6658 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__4__Impl_in_rule__Operation__Group_4__46691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Operation__Group_4__4__Impl6719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__0__Impl_in_rule__Operation__Group_5__06760 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__1_in_rule__Operation__Group_5__06763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Operation__Group_5__0__Impl6791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__1__Impl_in_rule__Operation__Group_5__16822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__2_in_rule__Operation__Group_5__16825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operation__Group_5__1__Impl6853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__2__Impl_in_rule__Operation__Group_5__26884 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__3_in_rule__Operation__Group_5__26887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ExceptiontsAssignment_5_2_in_rule__Operation__Group_5__2__Impl6916 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Operation__ExceptiontsAssignment_5_2_in_rule__Operation__Group_5__2__Impl6928 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Operation__Group_5__3__Impl_in_rule__Operation__Group_5__36961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5_3__0_in_rule__Operation__Group_5__3__Impl6988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5_3__0__Impl_in_rule__Operation__Group_5_3__07027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group_5_3__1_in_rule__Operation__Group_5_3__07030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Operation__Group_5_3__0__Impl7058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_5_3__1__Impl_in_rule__Operation__Group_5_3__17089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__ExceptiontsAssignment_5_3_1_in_rule__Operation__Group_5_3__1__Impl7118 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Operation__ExceptiontsAssignment_5_3_1_in_rule__Operation__Group_5_3__1__Impl7130 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__07167 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__07170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Event__Group__0__Impl7198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__17229 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Event__Group__2_in_rule__Event__Group__17232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Event__Group__1__Impl7260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__27291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Event__Group__2__Impl7319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Architecture__NameAssignment_27361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__Architecture__ModuleAssignment_37392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Module__NameAssignment_27423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__Module__VersionAssignment_57454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Module__ImportsAssignment_67485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_rule__Module__ModelAssignment_77516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__Module__ServicesAssignment_87547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Module__EventAssignment_97578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_27609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntities_in_rule__Model__EntitiesAssignment_27640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENTS_in_rule__Comment__ValueAssignment7671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_17702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__FeaturesAssignment_37733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_17764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_37795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_rule__Feature__FeatureCommentAssignment_07826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_17857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureType_in_rule__Feature__TypeAssignment_37888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__EntitiesFeature__TypeAssignment7923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__PrimitiveFeature__TypeAssignment7958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureType_in_rule__GenericListFeature__TypeAssignment_27989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_18020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleException_in_rule__Service__ExceptionsAssignment_38051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Service__OperationsAssignment_48082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Exception__NameAssignment_18113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Exception__MsgAssignment_58144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_18175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Operation__FeaturesInputAssignment_3_38206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Operation__FeaturesOutputAssignment_4_38237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Operation__ExceptiontsAssignment_5_28272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Operation__ExceptiontsAssignment_5_3_18311 = new BitSet(new long[]{0x0000000000000002L});

}