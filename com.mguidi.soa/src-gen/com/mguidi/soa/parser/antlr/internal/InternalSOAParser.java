package com.mguidi.soa.parser.antlr.internal; 

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
import com.mguidi.soa.services.SOAGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSOAParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_COMMENTS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@applicationId'", "':'", "'@moduleName'", "'@version'", "'.'", "'-'", "'@import'", "'@model'", "'{'", "'}'", "'@enum'", "'@entity'", "'@List'", "'<'", "'>'", "'@exceptions'", "'@exception'", "'@msg'", "'@service'", "'@operation'", "'@authenticated'", "'@input'", "'@output'", "','", "'@String'", "'@Short'", "'@Integer'", "'@Long'", "'@Float'", "'@Double'", "'@Boolean'", "'@Byte'", "'@Date'", "'@Datetime'", "'@Timestamp'", "'@Decimal'"
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
    public String getGrammarFileName() { return "../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g"; }



     	private SOAGrammarAccess grammarAccess;
     	
        public InternalSOAParser(TokenStream input, SOAGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Architecture";	
       	}
       	
       	@Override
       	protected SOAGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleArchitecture"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:68:1: entryRuleArchitecture returns [EObject current=null] : iv_ruleArchitecture= ruleArchitecture EOF ;
    public final EObject entryRuleArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitecture = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:69:2: (iv_ruleArchitecture= ruleArchitecture EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:70:2: iv_ruleArchitecture= ruleArchitecture EOF
            {
             newCompositeNode(grammarAccess.getArchitectureRule()); 
            pushFollow(FOLLOW_ruleArchitecture_in_entryRuleArchitecture75);
            iv_ruleArchitecture=ruleArchitecture();

            state._fsp--;

             current =iv_ruleArchitecture; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitecture85); 

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
    // $ANTLR end "entryRuleArchitecture"


    // $ANTLR start "ruleArchitecture"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:77:1: ruleArchitecture returns [EObject current=null] : (otherlv_0= '@applicationId' otherlv_1= ':' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_module_3_0= ruleModule ) ) ) ;
    public final EObject ruleArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_module_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:80:28: ( (otherlv_0= '@applicationId' otherlv_1= ':' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_module_3_0= ruleModule ) ) ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:81:1: (otherlv_0= '@applicationId' otherlv_1= ':' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_module_3_0= ruleModule ) ) )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:81:1: (otherlv_0= '@applicationId' otherlv_1= ':' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_module_3_0= ruleModule ) ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:81:3: otherlv_0= '@applicationId' otherlv_1= ':' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_module_3_0= ruleModule ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleArchitecture122); 

                	newLeafNode(otherlv_0, grammarAccess.getArchitectureAccess().getApplicationIdKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleArchitecture134); 

                	newLeafNode(otherlv_1, grammarAccess.getArchitectureAccess().getColonKeyword_1());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:89:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:90:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:90:1: (lv_name_2_0= ruleQualifiedName )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:91:3: lv_name_2_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getArchitectureAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleArchitecture155);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArchitectureRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:107:2: ( (lv_module_3_0= ruleModule ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:108:1: (lv_module_3_0= ruleModule )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:108:1: (lv_module_3_0= ruleModule )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:109:3: lv_module_3_0= ruleModule
            {
             
            	        newCompositeNode(grammarAccess.getArchitectureAccess().getModuleModuleParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleModule_in_ruleArchitecture176);
            lv_module_3_0=ruleModule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArchitectureRule());
            	        }
                   		set(
                   			current, 
                   			"module",
                    		lv_module_3_0, 
                    		"Module");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleArchitecture"


    // $ANTLR start "entryRuleModule"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:133:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:134:2: (iv_ruleModule= ruleModule EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:135:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule212);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule222); 

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:142:1: ruleModule returns [EObject current=null] : (otherlv_0= '@moduleName' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '@version' otherlv_4= ':' ( (lv_version_5_0= ruleVersion ) ) ( (lv_imports_6_0= ruleImport ) )* ( (lv_model_7_0= ruleModel ) )? ( (lv_exceptions_8_0= ruleExceptions ) )? ( (lv_services_9_0= ruleService ) )* ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_version_5_0 = null;

        EObject lv_imports_6_0 = null;

        EObject lv_model_7_0 = null;

        EObject lv_exceptions_8_0 = null;

        EObject lv_services_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:145:28: ( (otherlv_0= '@moduleName' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '@version' otherlv_4= ':' ( (lv_version_5_0= ruleVersion ) ) ( (lv_imports_6_0= ruleImport ) )* ( (lv_model_7_0= ruleModel ) )? ( (lv_exceptions_8_0= ruleExceptions ) )? ( (lv_services_9_0= ruleService ) )* ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:146:1: (otherlv_0= '@moduleName' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '@version' otherlv_4= ':' ( (lv_version_5_0= ruleVersion ) ) ( (lv_imports_6_0= ruleImport ) )* ( (lv_model_7_0= ruleModel ) )? ( (lv_exceptions_8_0= ruleExceptions ) )? ( (lv_services_9_0= ruleService ) )* )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:146:1: (otherlv_0= '@moduleName' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '@version' otherlv_4= ':' ( (lv_version_5_0= ruleVersion ) ) ( (lv_imports_6_0= ruleImport ) )* ( (lv_model_7_0= ruleModel ) )? ( (lv_exceptions_8_0= ruleExceptions ) )? ( (lv_services_9_0= ruleService ) )* )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:146:3: otherlv_0= '@moduleName' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '@version' otherlv_4= ':' ( (lv_version_5_0= ruleVersion ) ) ( (lv_imports_6_0= ruleImport ) )* ( (lv_model_7_0= ruleModel ) )? ( (lv_exceptions_8_0= ruleExceptions ) )? ( (lv_services_9_0= ruleService ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleModule259); 

                	newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleNameKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleModule271); 

                	newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getColonKeyword_1());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:154:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:155:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:155:1: (lv_name_2_0= RULE_ID )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:156:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModule288); 

            			newLeafNode(lv_name_2_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleModule305); 

                	newLeafNode(otherlv_3, grammarAccess.getModuleAccess().getVersionKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleModule317); 

                	newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getColonKeyword_4());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:180:1: ( (lv_version_5_0= ruleVersion ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:181:1: (lv_version_5_0= ruleVersion )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:181:1: (lv_version_5_0= ruleVersion )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:182:3: lv_version_5_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getModuleAccess().getVersionVersionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleVersion_in_ruleModule338);
            lv_version_5_0=ruleVersion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	        }
                   		set(
                   			current, 
                   			"version",
                    		lv_version_5_0, 
                    		"Version");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:198:2: ( (lv_imports_6_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:199:1: (lv_imports_6_0= ruleImport )
            	    {
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:199:1: (lv_imports_6_0= ruleImport )
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:200:3: lv_imports_6_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleModule359);
            	    lv_imports_6_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_6_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:216:3: ( (lv_model_7_0= ruleModel ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:217:1: (lv_model_7_0= ruleModel )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:217:1: (lv_model_7_0= ruleModel )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:218:3: lv_model_7_0= ruleModel
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getModelModelParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModel_in_ruleModule381);
                    lv_model_7_0=ruleModel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		set(
                           			current, 
                           			"model",
                            		lv_model_7_0, 
                            		"Model");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:234:3: ( (lv_exceptions_8_0= ruleExceptions ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:235:1: (lv_exceptions_8_0= ruleExceptions )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:235:1: (lv_exceptions_8_0= ruleExceptions )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:236:3: lv_exceptions_8_0= ruleExceptions
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getExceptionsExceptionsParserRuleCall_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExceptions_in_ruleModule403);
                    lv_exceptions_8_0=ruleExceptions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		set(
                           			current, 
                           			"exceptions",
                            		lv_exceptions_8_0, 
                            		"Exceptions");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:252:3: ( (lv_services_9_0= ruleService ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==30) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:253:1: (lv_services_9_0= ruleService )
            	    {
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:253:1: (lv_services_9_0= ruleService )
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:254:3: lv_services_9_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getServicesServiceParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_ruleModule425);
            	    lv_services_9_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"services",
            	            		lv_services_9_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:278:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:279:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:280:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName463);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName474); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:287:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:290:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:291:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:291:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:291:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName514); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:298:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:299:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedName533); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName548); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleVersion"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:319:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:320:2: (iv_ruleVersion= ruleVersion EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:321:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion596);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion607); 

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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:328:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '-' this_ID_6= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_ID_6=null;

         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:331:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '-' this_ID_6= RULE_ID )? ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:332:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '-' this_ID_6= RULE_ID )? )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:332:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '-' this_ID_6= RULE_ID )? )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:332:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '-' this_ID_6= RULE_ID )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersion647); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,16,FOLLOW_16_in_ruleVersion665); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersion680); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getVersionAccess().getINTTerminalRuleCall_2()); 
                
            kw=(Token)match(input,16,FOLLOW_16_in_ruleVersion698); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_3()); 
                
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersion713); 

            		current.merge(this_INT_4);
                
             
                newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_4()); 
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:365:1: (kw= '-' this_ID_6= RULE_ID )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:366:2: kw= '-' this_ID_6= RULE_ID
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleVersion732); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVersionAccess().getHyphenMinusKeyword_5_0()); 
                        
                    this_ID_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVersion747); 

                    		current.merge(this_ID_6);
                        
                     
                        newLeafNode(this_ID_6, grammarAccess.getVersionAccess().getIDTerminalRuleCall_5_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleImport"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:386:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:387:2: (iv_ruleImport= ruleImport EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:388:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport794);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport804); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:395:1: ruleImport returns [EObject current=null] : (otherlv_0= '@import' otherlv_1= ':' ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:398:28: ( (otherlv_0= '@import' otherlv_1= ':' ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:399:1: (otherlv_0= '@import' otherlv_1= ':' ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:399:1: (otherlv_0= '@import' otherlv_1= ':' ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:399:3: otherlv_0= '@import' otherlv_1= ':' ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleImport841); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleImport853); 

                	newLeafNode(otherlv_1, grammarAccess.getImportAccess().getColonKeyword_1());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:407:1: ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:408:1: (lv_importedNamespace_2_0= ruleQualifiedName )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:408:1: (lv_importedNamespace_2_0= ruleQualifiedName )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:409:3: lv_importedNamespace_2_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport874);
            lv_importedNamespace_2_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_2_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleModel"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:433:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:434:2: (iv_ruleModel= ruleModel EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:435:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel910);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel920); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:442:1: ruleModel returns [EObject current=null] : (otherlv_0= '@model' otherlv_1= '{' ( (lv_entities_2_0= ruleEntities ) )+ otherlv_3= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_entities_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:445:28: ( (otherlv_0= '@model' otherlv_1= '{' ( (lv_entities_2_0= ruleEntities ) )+ otherlv_3= '}' ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:446:1: (otherlv_0= '@model' otherlv_1= '{' ( (lv_entities_2_0= ruleEntities ) )+ otherlv_3= '}' )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:446:1: (otherlv_0= '@model' otherlv_1= '{' ( (lv_entities_2_0= ruleEntities ) )+ otherlv_3= '}' )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:446:3: otherlv_0= '@model' otherlv_1= '{' ( (lv_entities_2_0= ruleEntities ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleModel957); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleModel969); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:454:1: ( (lv_entities_2_0= ruleEntities ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=22 && LA7_0<=23)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:455:1: (lv_entities_2_0= ruleEntities )
            	    {
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:455:1: (lv_entities_2_0= ruleEntities )
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:456:3: lv_entities_2_0= ruleEntities
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntitiesParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntities_in_ruleModel990);
            	    lv_entities_2_0=ruleEntities();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_2_0, 
            	            		"Entities");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleModel1003); 

                	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleComment"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:484:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:485:2: (iv_ruleComment= ruleComment EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:486:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment1039);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment1049); 

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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:493:1: ruleComment returns [EObject current=null] : ( (lv_value_0_0= RULE_COMMENTS ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:496:28: ( ( (lv_value_0_0= RULE_COMMENTS ) ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:497:1: ( (lv_value_0_0= RULE_COMMENTS ) )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:497:1: ( (lv_value_0_0= RULE_COMMENTS ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:498:1: (lv_value_0_0= RULE_COMMENTS )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:498:1: (lv_value_0_0= RULE_COMMENTS )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:499:3: lv_value_0_0= RULE_COMMENTS
            {
            lv_value_0_0=(Token)match(input,RULE_COMMENTS,FOLLOW_RULE_COMMENTS_in_ruleComment1090); 

            			newLeafNode(lv_value_0_0, grammarAccess.getCommentAccess().getValueCOMMENTSTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"COMMENTS");
            	    

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleEntities"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:523:1: entryRuleEntities returns [EObject current=null] : iv_ruleEntities= ruleEntities EOF ;
    public final EObject entryRuleEntities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntities = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:524:2: (iv_ruleEntities= ruleEntities EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:525:2: iv_ruleEntities= ruleEntities EOF
            {
             newCompositeNode(grammarAccess.getEntitiesRule()); 
            pushFollow(FOLLOW_ruleEntities_in_entryRuleEntities1130);
            iv_ruleEntities=ruleEntities();

            state._fsp--;

             current =iv_ruleEntities; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntities1140); 

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
    // $ANTLR end "entryRuleEntities"


    // $ANTLR start "ruleEntities"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:532:1: ruleEntities returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Enum_1= ruleEnum ) ;
    public final EObject ruleEntities() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Enum_1 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:535:28: ( (this_Entity_0= ruleEntity | this_Enum_1= ruleEnum ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:536:1: (this_Entity_0= ruleEntity | this_Enum_1= ruleEnum )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:536:1: (this_Entity_0= ruleEntity | this_Enum_1= ruleEnum )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:537:5: this_Entity_0= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getEntitiesAccess().getEntityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleEntities1187);
                    this_Entity_0=ruleEntity();

                    state._fsp--;

                     
                            current = this_Entity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:547:5: this_Enum_1= ruleEnum
                    {
                     
                            newCompositeNode(grammarAccess.getEntitiesAccess().getEnumParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnum_in_ruleEntities1214);
                    this_Enum_1=ruleEnum();

                    state._fsp--;

                     
                            current = this_Enum_1; 
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
    // $ANTLR end "ruleEntities"


    // $ANTLR start "entryRuleEnum"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:563:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:564:2: (iv_ruleEnum= ruleEnum EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:565:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum1249);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum1259); 

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:572:1: ruleEnum returns [EObject current=null] : (otherlv_0= '@enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= RULE_ID ) )+ otherlv_4= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_features_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:575:28: ( (otherlv_0= '@enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= RULE_ID ) )+ otherlv_4= '}' ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:576:1: (otherlv_0= '@enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= RULE_ID ) )+ otherlv_4= '}' )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:576:1: (otherlv_0= '@enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= RULE_ID ) )+ otherlv_4= '}' )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:576:3: otherlv_0= '@enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= RULE_ID ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleEnum1296); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:580:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:581:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:581:1: (lv_name_1_0= RULE_ID )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:582:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum1313); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleEnum1330); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:602:1: ( (lv_features_3_0= RULE_ID ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:603:1: (lv_features_3_0= RULE_ID )
            	    {
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:603:1: (lv_features_3_0= RULE_ID )
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:604:3: lv_features_3_0= RULE_ID
            	    {
            	    lv_features_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum1347); 

            	    			newLeafNode(lv_features_3_0, grammarAccess.getEnumAccess().getFeaturesIDTerminalRuleCall_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEnumRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"features",
            	            		lv_features_3_0, 
            	            		"ID");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleEnum1365); 

                	newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEntity"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:632:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:633:2: (iv_ruleEntity= ruleEntity EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:634:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1401);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1411); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:641:1: ruleEntity returns [EObject current=null] : (otherlv_0= '@entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )+ otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:644:28: ( (otherlv_0= '@entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )+ otherlv_4= '}' ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:645:1: (otherlv_0= '@entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )+ otherlv_4= '}' )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:645:1: (otherlv_0= '@entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )+ otherlv_4= '}' )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:645:3: otherlv_0= '@entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleEntity1448); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:649:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:650:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:650:1: (lv_name_1_0= RULE_ID )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:651:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1465); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleEntity1482); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:671:1: ( (lv_features_3_0= ruleFeature ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==RULE_COMMENTS) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:672:1: (lv_features_3_0= ruleFeature )
            	    {
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:672:1: (lv_features_3_0= ruleFeature )
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:673:3: lv_features_3_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity1503);
            	    lv_features_3_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_3_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleEntity1516); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:701:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:702:2: (iv_ruleFeature= ruleFeature EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:703:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1552);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1562); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:710:1: ruleFeature returns [EObject current=null] : ( ( (lv_featureComment_0_0= ruleComment ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleFeatureType ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_featureComment_0_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:713:28: ( ( ( (lv_featureComment_0_0= ruleComment ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleFeatureType ) ) ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:714:1: ( ( (lv_featureComment_0_0= ruleComment ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleFeatureType ) ) )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:714:1: ( ( (lv_featureComment_0_0= ruleComment ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleFeatureType ) ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:714:2: ( (lv_featureComment_0_0= ruleComment ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleFeatureType ) )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:714:2: ( (lv_featureComment_0_0= ruleComment ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMMENTS) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:715:1: (lv_featureComment_0_0= ruleComment )
            	    {
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:715:1: (lv_featureComment_0_0= ruleComment )
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:716:3: lv_featureComment_0_0= ruleComment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureAccess().getFeatureCommentCommentParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComment_in_ruleFeature1608);
            	    lv_featureComment_0_0=ruleComment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"featureComment",
            	            		lv_featureComment_0_0, 
            	            		"Comment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:732:3: ( (lv_name_1_0= RULE_ID ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:733:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:733:1: (lv_name_1_0= RULE_ID )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:734:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature1626); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleFeature1643); 

                	newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:754:1: ( (lv_type_3_0= ruleFeatureType ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:755:1: (lv_type_3_0= ruleFeatureType )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:755:1: (lv_type_3_0= ruleFeatureType )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:756:3: lv_type_3_0= ruleFeatureType
            {
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getTypeFeatureTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleFeatureType_in_ruleFeature1664);
            lv_type_3_0=ruleFeatureType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"FeatureType");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleFeatureType"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:780:1: entryRuleFeatureType returns [EObject current=null] : iv_ruleFeatureType= ruleFeatureType EOF ;
    public final EObject entryRuleFeatureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureType = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:781:2: (iv_ruleFeatureType= ruleFeatureType EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:782:2: iv_ruleFeatureType= ruleFeatureType EOF
            {
             newCompositeNode(grammarAccess.getFeatureTypeRule()); 
            pushFollow(FOLLOW_ruleFeatureType_in_entryRuleFeatureType1700);
            iv_ruleFeatureType=ruleFeatureType();

            state._fsp--;

             current =iv_ruleFeatureType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureType1710); 

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
    // $ANTLR end "entryRuleFeatureType"


    // $ANTLR start "ruleFeatureType"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:789:1: ruleFeatureType returns [EObject current=null] : (this_EntitiesFeature_0= ruleEntitiesFeature | this_PrimitiveFeature_1= rulePrimitiveFeature | this_GenericListFeature_2= ruleGenericListFeature ) ;
    public final EObject ruleFeatureType() throws RecognitionException {
        EObject current = null;

        EObject this_EntitiesFeature_0 = null;

        EObject this_PrimitiveFeature_1 = null;

        EObject this_GenericListFeature_2 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:792:28: ( (this_EntitiesFeature_0= ruleEntitiesFeature | this_PrimitiveFeature_1= rulePrimitiveFeature | this_GenericListFeature_2= ruleGenericListFeature ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:793:1: (this_EntitiesFeature_0= ruleEntitiesFeature | this_PrimitiveFeature_1= rulePrimitiveFeature | this_GenericListFeature_2= ruleGenericListFeature )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:793:1: (this_EntitiesFeature_0= ruleEntitiesFeature | this_PrimitiveFeature_1= rulePrimitiveFeature | this_GenericListFeature_2= ruleGenericListFeature )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt12=1;
                }
                break;
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:794:5: this_EntitiesFeature_0= ruleEntitiesFeature
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureTypeAccess().getEntitiesFeatureParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEntitiesFeature_in_ruleFeatureType1757);
                    this_EntitiesFeature_0=ruleEntitiesFeature();

                    state._fsp--;

                     
                            current = this_EntitiesFeature_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:804:5: this_PrimitiveFeature_1= rulePrimitiveFeature
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureTypeAccess().getPrimitiveFeatureParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveFeature_in_ruleFeatureType1784);
                    this_PrimitiveFeature_1=rulePrimitiveFeature();

                    state._fsp--;

                     
                            current = this_PrimitiveFeature_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:814:5: this_GenericListFeature_2= ruleGenericListFeature
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureTypeAccess().getGenericListFeatureParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleGenericListFeature_in_ruleFeatureType1811);
                    this_GenericListFeature_2=ruleGenericListFeature();

                    state._fsp--;

                     
                            current = this_GenericListFeature_2; 
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
    // $ANTLR end "ruleFeatureType"


    // $ANTLR start "entryRuleEntitiesFeature"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:830:1: entryRuleEntitiesFeature returns [EObject current=null] : iv_ruleEntitiesFeature= ruleEntitiesFeature EOF ;
    public final EObject entryRuleEntitiesFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntitiesFeature = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:831:2: (iv_ruleEntitiesFeature= ruleEntitiesFeature EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:832:2: iv_ruleEntitiesFeature= ruleEntitiesFeature EOF
            {
             newCompositeNode(grammarAccess.getEntitiesFeatureRule()); 
            pushFollow(FOLLOW_ruleEntitiesFeature_in_entryRuleEntitiesFeature1846);
            iv_ruleEntitiesFeature=ruleEntitiesFeature();

            state._fsp--;

             current =iv_ruleEntitiesFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntitiesFeature1856); 

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
    // $ANTLR end "entryRuleEntitiesFeature"


    // $ANTLR start "ruleEntitiesFeature"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:839:1: ruleEntitiesFeature returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleEntitiesFeature() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:842:28: ( ( ( ruleQualifiedName ) ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:843:1: ( ( ruleQualifiedName ) )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:843:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:844:1: ( ruleQualifiedName )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:844:1: ( ruleQualifiedName )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:845:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntitiesFeatureRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEntitiesFeatureAccess().getTypeEntitiesCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntitiesFeature1903);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleEntitiesFeature"


    // $ANTLR start "entryRulePrimitiveFeature"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:866:1: entryRulePrimitiveFeature returns [EObject current=null] : iv_rulePrimitiveFeature= rulePrimitiveFeature EOF ;
    public final EObject entryRulePrimitiveFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveFeature = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:867:2: (iv_rulePrimitiveFeature= rulePrimitiveFeature EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:868:2: iv_rulePrimitiveFeature= rulePrimitiveFeature EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveFeatureRule()); 
            pushFollow(FOLLOW_rulePrimitiveFeature_in_entryRulePrimitiveFeature1938);
            iv_rulePrimitiveFeature=rulePrimitiveFeature();

            state._fsp--;

             current =iv_rulePrimitiveFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveFeature1948); 

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
    // $ANTLR end "entryRulePrimitiveFeature"


    // $ANTLR start "rulePrimitiveFeature"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:875:1: rulePrimitiveFeature returns [EObject current=null] : ( (lv_type_0_0= rulePrimitiveType ) ) ;
    public final EObject rulePrimitiveFeature() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:878:28: ( ( (lv_type_0_0= rulePrimitiveType ) ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:879:1: ( (lv_type_0_0= rulePrimitiveType ) )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:879:1: ( (lv_type_0_0= rulePrimitiveType ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:880:1: (lv_type_0_0= rulePrimitiveType )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:880:1: (lv_type_0_0= rulePrimitiveType )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:881:3: lv_type_0_0= rulePrimitiveType
            {
             
            	        newCompositeNode(grammarAccess.getPrimitiveFeatureAccess().getTypePrimitiveTypeEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulePrimitiveType_in_rulePrimitiveFeature1993);
            lv_type_0_0=rulePrimitiveType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrimitiveFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"PrimitiveType");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "rulePrimitiveFeature"


    // $ANTLR start "entryRuleGenericListFeature"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:905:1: entryRuleGenericListFeature returns [EObject current=null] : iv_ruleGenericListFeature= ruleGenericListFeature EOF ;
    public final EObject entryRuleGenericListFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericListFeature = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:906:2: (iv_ruleGenericListFeature= ruleGenericListFeature EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:907:2: iv_ruleGenericListFeature= ruleGenericListFeature EOF
            {
             newCompositeNode(grammarAccess.getGenericListFeatureRule()); 
            pushFollow(FOLLOW_ruleGenericListFeature_in_entryRuleGenericListFeature2028);
            iv_ruleGenericListFeature=ruleGenericListFeature();

            state._fsp--;

             current =iv_ruleGenericListFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericListFeature2038); 

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
    // $ANTLR end "entryRuleGenericListFeature"


    // $ANTLR start "ruleGenericListFeature"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:914:1: ruleGenericListFeature returns [EObject current=null] : (otherlv_0= '@List' otherlv_1= '<' ( (lv_type_2_0= ruleFeatureType ) ) otherlv_3= '>' ) ;
    public final EObject ruleGenericListFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:917:28: ( (otherlv_0= '@List' otherlv_1= '<' ( (lv_type_2_0= ruleFeatureType ) ) otherlv_3= '>' ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:918:1: (otherlv_0= '@List' otherlv_1= '<' ( (lv_type_2_0= ruleFeatureType ) ) otherlv_3= '>' )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:918:1: (otherlv_0= '@List' otherlv_1= '<' ( (lv_type_2_0= ruleFeatureType ) ) otherlv_3= '>' )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:918:3: otherlv_0= '@List' otherlv_1= '<' ( (lv_type_2_0= ruleFeatureType ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleGenericListFeature2075); 

                	newLeafNode(otherlv_0, grammarAccess.getGenericListFeatureAccess().getListKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleGenericListFeature2087); 

                	newLeafNode(otherlv_1, grammarAccess.getGenericListFeatureAccess().getLessThanSignKeyword_1());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:926:1: ( (lv_type_2_0= ruleFeatureType ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:927:1: (lv_type_2_0= ruleFeatureType )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:927:1: (lv_type_2_0= ruleFeatureType )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:928:3: lv_type_2_0= ruleFeatureType
            {
             
            	        newCompositeNode(grammarAccess.getGenericListFeatureAccess().getTypeFeatureTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFeatureType_in_ruleGenericListFeature2108);
            lv_type_2_0=ruleFeatureType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGenericListFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"FeatureType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleGenericListFeature2120); 

                	newLeafNode(otherlv_3, grammarAccess.getGenericListFeatureAccess().getGreaterThanSignKeyword_3());
                

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
    // $ANTLR end "ruleGenericListFeature"


    // $ANTLR start "entryRuleExceptions"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:956:1: entryRuleExceptions returns [EObject current=null] : iv_ruleExceptions= ruleExceptions EOF ;
    public final EObject entryRuleExceptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptions = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:957:2: (iv_ruleExceptions= ruleExceptions EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:958:2: iv_ruleExceptions= ruleExceptions EOF
            {
             newCompositeNode(grammarAccess.getExceptionsRule()); 
            pushFollow(FOLLOW_ruleExceptions_in_entryRuleExceptions2156);
            iv_ruleExceptions=ruleExceptions();

            state._fsp--;

             current =iv_ruleExceptions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptions2166); 

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
    // $ANTLR end "entryRuleExceptions"


    // $ANTLR start "ruleExceptions"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:965:1: ruleExceptions returns [EObject current=null] : (otherlv_0= '@exceptions' otherlv_1= '{' ( (lv_exceptions_2_0= ruleException ) )+ otherlv_3= '}' ) ;
    public final EObject ruleExceptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exceptions_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:968:28: ( (otherlv_0= '@exceptions' otherlv_1= '{' ( (lv_exceptions_2_0= ruleException ) )+ otherlv_3= '}' ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:969:1: (otherlv_0= '@exceptions' otherlv_1= '{' ( (lv_exceptions_2_0= ruleException ) )+ otherlv_3= '}' )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:969:1: (otherlv_0= '@exceptions' otherlv_1= '{' ( (lv_exceptions_2_0= ruleException ) )+ otherlv_3= '}' )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:969:3: otherlv_0= '@exceptions' otherlv_1= '{' ( (lv_exceptions_2_0= ruleException ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleExceptions2203); 

                	newLeafNode(otherlv_0, grammarAccess.getExceptionsAccess().getExceptionsKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleExceptions2215); 

                	newLeafNode(otherlv_1, grammarAccess.getExceptionsAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:977:1: ( (lv_exceptions_2_0= ruleException ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:978:1: (lv_exceptions_2_0= ruleException )
            	    {
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:978:1: (lv_exceptions_2_0= ruleException )
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:979:3: lv_exceptions_2_0= ruleException
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExceptionsAccess().getExceptionsExceptionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleException_in_ruleExceptions2236);
            	    lv_exceptions_2_0=ruleException();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExceptionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exceptions",
            	            		lv_exceptions_2_0, 
            	            		"Exception");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleExceptions2249); 

                	newLeafNode(otherlv_3, grammarAccess.getExceptionsAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleExceptions"


    // $ANTLR start "entryRuleException"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1007:1: entryRuleException returns [EObject current=null] : iv_ruleException= ruleException EOF ;
    public final EObject entryRuleException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleException = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1008:2: (iv_ruleException= ruleException EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1009:2: iv_ruleException= ruleException EOF
            {
             newCompositeNode(grammarAccess.getExceptionRule()); 
            pushFollow(FOLLOW_ruleException_in_entryRuleException2285);
            iv_ruleException=ruleException();

            state._fsp--;

             current =iv_ruleException; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleException2295); 

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
    // $ANTLR end "entryRuleException"


    // $ANTLR start "ruleException"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1016:1: ruleException returns [EObject current=null] : (otherlv_0= '@exception' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '@msg' otherlv_4= ':' ( (lv_msg_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleException() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_msg_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1019:28: ( (otherlv_0= '@exception' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '@msg' otherlv_4= ':' ( (lv_msg_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1020:1: (otherlv_0= '@exception' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '@msg' otherlv_4= ':' ( (lv_msg_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1020:1: (otherlv_0= '@exception' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '@msg' otherlv_4= ':' ( (lv_msg_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1020:3: otherlv_0= '@exception' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '@msg' otherlv_4= ':' ( (lv_msg_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleException2332); 

                	newLeafNode(otherlv_0, grammarAccess.getExceptionAccess().getExceptionKeyword_0());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1024:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1025:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1025:1: (lv_name_1_0= RULE_ID )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1026:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleException2349); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExceptionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExceptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleException2366); 

                	newLeafNode(otherlv_2, grammarAccess.getExceptionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleException2378); 

                	newLeafNode(otherlv_3, grammarAccess.getExceptionAccess().getMsgKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleException2390); 

                	newLeafNode(otherlv_4, grammarAccess.getExceptionAccess().getColonKeyword_4());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1054:1: ( (lv_msg_5_0= RULE_STRING ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1055:1: (lv_msg_5_0= RULE_STRING )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1055:1: (lv_msg_5_0= RULE_STRING )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1056:3: lv_msg_5_0= RULE_STRING
            {
            lv_msg_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleException2407); 

            			newLeafNode(lv_msg_5_0, grammarAccess.getExceptionAccess().getMsgSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExceptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"msg",
                    		lv_msg_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleException2424); 

                	newLeafNode(otherlv_6, grammarAccess.getExceptionAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleException"


    // $ANTLR start "entryRuleService"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1084:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1085:2: (iv_ruleService= ruleService EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1086:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService2460);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService2470); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1093:1: ruleService returns [EObject current=null] : (otherlv_0= '@service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ otherlv_4= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_operations_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1096:28: ( (otherlv_0= '@service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ otherlv_4= '}' ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1097:1: (otherlv_0= '@service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ otherlv_4= '}' )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1097:1: (otherlv_0= '@service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ otherlv_4= '}' )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1097:3: otherlv_0= '@service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleService2507); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1101:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1102:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1102:1: (lv_name_1_0= RULE_ID )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1103:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService2524); 

            			newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleService2541); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1123:1: ( (lv_operations_3_0= ruleOperation ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1124:1: (lv_operations_3_0= ruleOperation )
            	    {
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1124:1: (lv_operations_3_0= ruleOperation )
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1125:3: lv_operations_3_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperation_in_ruleService2562);
            	    lv_operations_3_0=ruleOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operations",
            	            		lv_operations_3_0, 
            	            		"Operation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleService2575); 

                	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleOperation"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1153:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1154:2: (iv_ruleOperation= ruleOperation EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1155:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation2611);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation2621); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1162:1: ruleOperation returns [EObject current=null] : (otherlv_0= '@operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_authenticated_3_0= '@authenticated' ) )? (otherlv_4= '@input' otherlv_5= ':' otherlv_6= '{' ( (lv_featuresInput_7_0= ruleFeature ) )+ otherlv_8= '}' )? (otherlv_9= '@output' otherlv_10= ':' otherlv_11= '{' ( (lv_featuresOutput_12_0= ruleFeature ) )+ otherlv_13= '}' )? (otherlv_14= '@exception' otherlv_15= ':' ( ( ruleQualifiedName ) ) (otherlv_17= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_19= '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_authenticated_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_featuresInput_7_0 = null;

        EObject lv_featuresOutput_12_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1165:28: ( (otherlv_0= '@operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_authenticated_3_0= '@authenticated' ) )? (otherlv_4= '@input' otherlv_5= ':' otherlv_6= '{' ( (lv_featuresInput_7_0= ruleFeature ) )+ otherlv_8= '}' )? (otherlv_9= '@output' otherlv_10= ':' otherlv_11= '{' ( (lv_featuresOutput_12_0= ruleFeature ) )+ otherlv_13= '}' )? (otherlv_14= '@exception' otherlv_15= ':' ( ( ruleQualifiedName ) ) (otherlv_17= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_19= '}' ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1166:1: (otherlv_0= '@operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_authenticated_3_0= '@authenticated' ) )? (otherlv_4= '@input' otherlv_5= ':' otherlv_6= '{' ( (lv_featuresInput_7_0= ruleFeature ) )+ otherlv_8= '}' )? (otherlv_9= '@output' otherlv_10= ':' otherlv_11= '{' ( (lv_featuresOutput_12_0= ruleFeature ) )+ otherlv_13= '}' )? (otherlv_14= '@exception' otherlv_15= ':' ( ( ruleQualifiedName ) ) (otherlv_17= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_19= '}' )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1166:1: (otherlv_0= '@operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_authenticated_3_0= '@authenticated' ) )? (otherlv_4= '@input' otherlv_5= ':' otherlv_6= '{' ( (lv_featuresInput_7_0= ruleFeature ) )+ otherlv_8= '}' )? (otherlv_9= '@output' otherlv_10= ':' otherlv_11= '{' ( (lv_featuresOutput_12_0= ruleFeature ) )+ otherlv_13= '}' )? (otherlv_14= '@exception' otherlv_15= ':' ( ( ruleQualifiedName ) ) (otherlv_17= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_19= '}' )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1166:3: otherlv_0= '@operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_authenticated_3_0= '@authenticated' ) )? (otherlv_4= '@input' otherlv_5= ':' otherlv_6= '{' ( (lv_featuresInput_7_0= ruleFeature ) )+ otherlv_8= '}' )? (otherlv_9= '@output' otherlv_10= ':' otherlv_11= '{' ( (lv_featuresOutput_12_0= ruleFeature ) )+ otherlv_13= '}' )? (otherlv_14= '@exception' otherlv_15= ':' ( ( ruleQualifiedName ) ) (otherlv_17= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleOperation2658); 

                	newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOperationKeyword_0());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1170:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1171:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1171:1: (lv_name_1_0= RULE_ID )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1172:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation2675); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleOperation2692); 

                	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1192:1: ( (lv_authenticated_3_0= '@authenticated' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1193:1: (lv_authenticated_3_0= '@authenticated' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1193:1: (lv_authenticated_3_0= '@authenticated' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1194:3: lv_authenticated_3_0= '@authenticated'
                    {
                    lv_authenticated_3_0=(Token)match(input,32,FOLLOW_32_in_ruleOperation2710); 

                            newLeafNode(lv_authenticated_3_0, grammarAccess.getOperationAccess().getAuthenticatedAuthenticatedKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationRule());
                    	        }
                           		setWithLastConsumed(current, "authenticated", true, "@authenticated");
                    	    

                    }


                    }
                    break;

            }

            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1207:3: (otherlv_4= '@input' otherlv_5= ':' otherlv_6= '{' ( (lv_featuresInput_7_0= ruleFeature ) )+ otherlv_8= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1207:5: otherlv_4= '@input' otherlv_5= ':' otherlv_6= '{' ( (lv_featuresInput_7_0= ruleFeature ) )+ otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleOperation2737); 

                        	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getInputKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleOperation2749); 

                        	newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getColonKeyword_4_1());
                        
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleOperation2761); 

                        	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_4_2());
                        
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1219:1: ( (lv_featuresInput_7_0= ruleFeature ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID||LA16_0==RULE_COMMENTS) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1220:1: (lv_featuresInput_7_0= ruleFeature )
                    	    {
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1220:1: (lv_featuresInput_7_0= ruleFeature )
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1221:3: lv_featuresInput_7_0= ruleFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOperationAccess().getFeaturesInputFeatureParserRuleCall_4_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFeature_in_ruleOperation2782);
                    	    lv_featuresInput_7_0=ruleFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"featuresInput",
                    	            		lv_featuresInput_7_0, 
                    	            		"Feature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleOperation2795); 

                        	newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1241:3: (otherlv_9= '@output' otherlv_10= ':' otherlv_11= '{' ( (lv_featuresOutput_12_0= ruleFeature ) )+ otherlv_13= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1241:5: otherlv_9= '@output' otherlv_10= ':' otherlv_11= '{' ( (lv_featuresOutput_12_0= ruleFeature ) )+ otherlv_13= '}'
                    {
                    otherlv_9=(Token)match(input,34,FOLLOW_34_in_ruleOperation2810); 

                        	newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getOutputKeyword_5_0());
                        
                    otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleOperation2822); 

                        	newLeafNode(otherlv_10, grammarAccess.getOperationAccess().getColonKeyword_5_1());
                        
                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleOperation2834); 

                        	newLeafNode(otherlv_11, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_5_2());
                        
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1253:1: ( (lv_featuresOutput_12_0= ruleFeature ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID||LA18_0==RULE_COMMENTS) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1254:1: (lv_featuresOutput_12_0= ruleFeature )
                    	    {
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1254:1: (lv_featuresOutput_12_0= ruleFeature )
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1255:3: lv_featuresOutput_12_0= ruleFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOperationAccess().getFeaturesOutputFeatureParserRuleCall_5_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFeature_in_ruleOperation2855);
                    	    lv_featuresOutput_12_0=ruleFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"featuresOutput",
                    	            		lv_featuresOutput_12_0, 
                    	            		"Feature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleOperation2868); 

                        	newLeafNode(otherlv_13, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1275:3: (otherlv_14= '@exception' otherlv_15= ':' ( ( ruleQualifiedName ) ) (otherlv_17= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1275:5: otherlv_14= '@exception' otherlv_15= ':' ( ( ruleQualifiedName ) ) (otherlv_17= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleOperation2883); 

                        	newLeafNode(otherlv_14, grammarAccess.getOperationAccess().getExceptionKeyword_6_0());
                        
                    otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleOperation2895); 

                        	newLeafNode(otherlv_15, grammarAccess.getOperationAccess().getColonKeyword_6_1());
                        
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1283:1: ( ( ruleQualifiedName ) )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1284:1: ( ruleQualifiedName )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1284:1: ( ruleQualifiedName )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1285:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getOperationAccess().getExceptiontsExceptionCrossReference_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleOperation2918);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1298:2: (otherlv_17= ',' ( ( ruleQualifiedName ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==35) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1298:4: otherlv_17= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_17=(Token)match(input,35,FOLLOW_35_in_ruleOperation2931); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getOperationAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1302:1: ( ( ruleQualifiedName ) )
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1303:1: ( ruleQualifiedName )
                    	    {
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1303:1: ( ruleQualifiedName )
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1304:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getOperationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getOperationAccess().getExceptiontsExceptionCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleOperation2954);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_19=(Token)match(input,21,FOLLOW_21_in_ruleOperation2970); 

                	newLeafNode(otherlv_19, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "rulePrimitiveType"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1329:1: rulePrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= '@String' ) | (enumLiteral_1= '@Short' ) | (enumLiteral_2= '@Integer' ) | (enumLiteral_3= '@Long' ) | (enumLiteral_4= '@Float' ) | (enumLiteral_5= '@Double' ) | (enumLiteral_6= '@Boolean' ) | (enumLiteral_7= '@Byte' ) | (enumLiteral_8= '@Date' ) | (enumLiteral_9= '@Datetime' ) | (enumLiteral_10= '@Timestamp' ) | (enumLiteral_11= '@Decimal' ) ) ;
    public final Enumerator rulePrimitiveType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;

         enterRule(); 
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1331:28: ( ( (enumLiteral_0= '@String' ) | (enumLiteral_1= '@Short' ) | (enumLiteral_2= '@Integer' ) | (enumLiteral_3= '@Long' ) | (enumLiteral_4= '@Float' ) | (enumLiteral_5= '@Double' ) | (enumLiteral_6= '@Boolean' ) | (enumLiteral_7= '@Byte' ) | (enumLiteral_8= '@Date' ) | (enumLiteral_9= '@Datetime' ) | (enumLiteral_10= '@Timestamp' ) | (enumLiteral_11= '@Decimal' ) ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1332:1: ( (enumLiteral_0= '@String' ) | (enumLiteral_1= '@Short' ) | (enumLiteral_2= '@Integer' ) | (enumLiteral_3= '@Long' ) | (enumLiteral_4= '@Float' ) | (enumLiteral_5= '@Double' ) | (enumLiteral_6= '@Boolean' ) | (enumLiteral_7= '@Byte' ) | (enumLiteral_8= '@Date' ) | (enumLiteral_9= '@Datetime' ) | (enumLiteral_10= '@Timestamp' ) | (enumLiteral_11= '@Decimal' ) )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1332:1: ( (enumLiteral_0= '@String' ) | (enumLiteral_1= '@Short' ) | (enumLiteral_2= '@Integer' ) | (enumLiteral_3= '@Long' ) | (enumLiteral_4= '@Float' ) | (enumLiteral_5= '@Double' ) | (enumLiteral_6= '@Boolean' ) | (enumLiteral_7= '@Byte' ) | (enumLiteral_8= '@Date' ) | (enumLiteral_9= '@Datetime' ) | (enumLiteral_10= '@Timestamp' ) | (enumLiteral_11= '@Decimal' ) )
            int alt22=12;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt22=1;
                }
                break;
            case 37:
                {
                alt22=2;
                }
                break;
            case 38:
                {
                alt22=3;
                }
                break;
            case 39:
                {
                alt22=4;
                }
                break;
            case 40:
                {
                alt22=5;
                }
                break;
            case 41:
                {
                alt22=6;
                }
                break;
            case 42:
                {
                alt22=7;
                }
                break;
            case 43:
                {
                alt22=8;
                }
                break;
            case 44:
                {
                alt22=9;
                }
                break;
            case 45:
                {
                alt22=10;
                }
                break;
            case 46:
                {
                alt22=11;
                }
                break;
            case 47:
                {
                alt22=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1332:2: (enumLiteral_0= '@String' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1332:2: (enumLiteral_0= '@String' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1332:4: enumLiteral_0= '@String'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_36_in_rulePrimitiveType3020); 

                            current = grammarAccess.getPrimitiveTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1338:6: (enumLiteral_1= '@Short' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1338:6: (enumLiteral_1= '@Short' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1338:8: enumLiteral_1= '@Short'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_37_in_rulePrimitiveType3037); 

                            current = grammarAccess.getPrimitiveTypeAccess().getShortEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getShortEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1344:6: (enumLiteral_2= '@Integer' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1344:6: (enumLiteral_2= '@Integer' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1344:8: enumLiteral_2= '@Integer'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_38_in_rulePrimitiveType3054); 

                            current = grammarAccess.getPrimitiveTypeAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveTypeAccess().getIntegerEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1350:6: (enumLiteral_3= '@Long' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1350:6: (enumLiteral_3= '@Long' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1350:8: enumLiteral_3= '@Long'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_39_in_rulePrimitiveType3071); 

                            current = grammarAccess.getPrimitiveTypeAccess().getLongEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPrimitiveTypeAccess().getLongEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1356:6: (enumLiteral_4= '@Float' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1356:6: (enumLiteral_4= '@Float' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1356:8: enumLiteral_4= '@Float'
                    {
                    enumLiteral_4=(Token)match(input,40,FOLLOW_40_in_rulePrimitiveType3088); 

                            current = grammarAccess.getPrimitiveTypeAccess().getFloatEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPrimitiveTypeAccess().getFloatEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1362:6: (enumLiteral_5= '@Double' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1362:6: (enumLiteral_5= '@Double' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1362:8: enumLiteral_5= '@Double'
                    {
                    enumLiteral_5=(Token)match(input,41,FOLLOW_41_in_rulePrimitiveType3105); 

                            current = grammarAccess.getPrimitiveTypeAccess().getDoubleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getPrimitiveTypeAccess().getDoubleEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1368:6: (enumLiteral_6= '@Boolean' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1368:6: (enumLiteral_6= '@Boolean' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1368:8: enumLiteral_6= '@Boolean'
                    {
                    enumLiteral_6=(Token)match(input,42,FOLLOW_42_in_rulePrimitiveType3122); 

                            current = grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1374:6: (enumLiteral_7= '@Byte' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1374:6: (enumLiteral_7= '@Byte' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1374:8: enumLiteral_7= '@Byte'
                    {
                    enumLiteral_7=(Token)match(input,43,FOLLOW_43_in_rulePrimitiveType3139); 

                            current = grammarAccess.getPrimitiveTypeAccess().getByteEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getPrimitiveTypeAccess().getByteEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1380:6: (enumLiteral_8= '@Date' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1380:6: (enumLiteral_8= '@Date' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1380:8: enumLiteral_8= '@Date'
                    {
                    enumLiteral_8=(Token)match(input,44,FOLLOW_44_in_rulePrimitiveType3156); 

                            current = grammarAccess.getPrimitiveTypeAccess().getDateEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getPrimitiveTypeAccess().getDateEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1386:6: (enumLiteral_9= '@Datetime' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1386:6: (enumLiteral_9= '@Datetime' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1386:8: enumLiteral_9= '@Datetime'
                    {
                    enumLiteral_9=(Token)match(input,45,FOLLOW_45_in_rulePrimitiveType3173); 

                            current = grammarAccess.getPrimitiveTypeAccess().getDatetimeEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getPrimitiveTypeAccess().getDatetimeEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1392:6: (enumLiteral_10= '@Timestamp' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1392:6: (enumLiteral_10= '@Timestamp' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1392:8: enumLiteral_10= '@Timestamp'
                    {
                    enumLiteral_10=(Token)match(input,46,FOLLOW_46_in_rulePrimitiveType3190); 

                            current = grammarAccess.getPrimitiveTypeAccess().getTimestampEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getPrimitiveTypeAccess().getTimestampEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1398:6: (enumLiteral_11= '@Decimal' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1398:6: (enumLiteral_11= '@Decimal' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1398:8: enumLiteral_11= '@Decimal'
                    {
                    enumLiteral_11=(Token)match(input,47,FOLLOW_47_in_rulePrimitiveType3207); 

                            current = grammarAccess.getPrimitiveTypeAccess().getDecimalEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getPrimitiveTypeAccess().getDecimalEnumLiteralDeclaration_11()); 
                        

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
    // $ANTLR end "rulePrimitiveType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleArchitecture_in_entryRuleArchitecture75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitecture85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleArchitecture122 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleArchitecture134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleArchitecture155 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleModule_in_ruleArchitecture176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleModule259 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModule271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModule288 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleModule305 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModule317 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleModule338 = new BitSet(new long[]{0x00000000480C0002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModule359 = new BitSet(new long[]{0x00000000480C0002L});
    public static final BitSet FOLLOW_ruleModel_in_ruleModule381 = new BitSet(new long[]{0x0000000048000002L});
    public static final BitSet FOLLOW_ruleExceptions_in_ruleModule403 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleModule425 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName514 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedName533 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName548 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersion647 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVersion665 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersion680 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVersion698 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersion713 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleVersion732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVersion747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleImport841 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImport853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleModel957 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleModel969 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleEntities_in_ruleModel990 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_21_in_ruleModel1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment1039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENTS_in_ruleComment1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntities_in_entryRuleEntities1130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntities1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleEntities1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleEntities1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum1249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEnum1296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum1313 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEnum1330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum1347 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleEnum1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleEntity1448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1465 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEntity1482 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity1503 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_21_in_ruleEntity1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleFeature1608 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature1626 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFeature1643 = new BitSet(new long[]{0x0000FFF001000010L});
    public static final BitSet FOLLOW_ruleFeatureType_in_ruleFeature1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureType_in_entryRuleFeatureType1700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureType1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntitiesFeature_in_ruleFeatureType1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveFeature_in_ruleFeatureType1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListFeature_in_ruleFeatureType1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntitiesFeature_in_entryRuleEntitiesFeature1846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntitiesFeature1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntitiesFeature1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveFeature_in_entryRulePrimitiveFeature1938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveFeature1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rulePrimitiveFeature1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListFeature_in_entryRuleGenericListFeature2028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericListFeature2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleGenericListFeature2075 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleGenericListFeature2087 = new BitSet(new long[]{0x0000FFF001000010L});
    public static final BitSet FOLLOW_ruleFeatureType_in_ruleGenericListFeature2108 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleGenericListFeature2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptions_in_entryRuleExceptions2156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptions2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleExceptions2203 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExceptions2215 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleException_in_ruleExceptions2236 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_21_in_ruleExceptions2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleException_in_entryRuleException2285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleException2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleException2332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleException2349 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleException2366 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleException2378 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleException2390 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleException2407 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleException2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService2460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleService2507 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService2524 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleService2541 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleService2562 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_21_in_ruleService2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation2611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOperation2658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation2675 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOperation2692 = new BitSet(new long[]{0x0000000710200000L});
    public static final BitSet FOLLOW_32_in_ruleOperation2710 = new BitSet(new long[]{0x0000000610200000L});
    public static final BitSet FOLLOW_33_in_ruleOperation2737 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOperation2749 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOperation2761 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleOperation2782 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_21_in_ruleOperation2795 = new BitSet(new long[]{0x0000000410200000L});
    public static final BitSet FOLLOW_34_in_ruleOperation2810 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOperation2822 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOperation2834 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleOperation2855 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_21_in_ruleOperation2868 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_28_in_ruleOperation2883 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOperation2895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleOperation2918 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_35_in_ruleOperation2931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleOperation2954 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_21_in_ruleOperation2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulePrimitiveType3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePrimitiveType3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePrimitiveType3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePrimitiveType3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePrimitiveType3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulePrimitiveType3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePrimitiveType3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulePrimitiveType3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePrimitiveType3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulePrimitiveType3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulePrimitiveType3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulePrimitiveType3207 = new BitSet(new long[]{0x0000000000000002L});

}