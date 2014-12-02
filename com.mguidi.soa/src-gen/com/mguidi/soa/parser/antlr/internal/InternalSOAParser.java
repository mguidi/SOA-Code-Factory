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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_COMMENTS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@applicationId'", "':'", "'@moduleName'", "'@version'", "'.'", "'-'", "'@import'", "'@model'", "'{'", "'}'", "'@enum'", "'@entity'", "'@List'", "'<'", "'>'", "'@exceptions'", "'@exception'", "'@msg'", "'@service'", "'@operation'", "'@input'", "'@output'", "','", "'@event'", "'@String'", "'@Short'", "'@Integer'", "'@Long'", "'@Float'", "'@Double'", "'@Boolean'", "'@Byte'", "'@Date'", "'@Datetime'", "'@Timestamp'", "'@Decimal'"
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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:142:1: ruleModule returns [EObject current=null] : (otherlv_0= '@moduleName' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '@version' otherlv_4= ':' ( (lv_version_5_0= ruleVersion ) ) ( (lv_imports_6_0= ruleImport ) )* ( (lv_model_7_0= ruleModel ) )? ( (lv_exceptions_8_0= ruleExceptions ) )? ( (lv_services_9_0= ruleService ) )* ( (lv_event_10_0= ruleEvent ) )? ) ;
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

        AntlrDatatypeRuleToken lv_event_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:145:28: ( (otherlv_0= '@moduleName' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '@version' otherlv_4= ':' ( (lv_version_5_0= ruleVersion ) ) ( (lv_imports_6_0= ruleImport ) )* ( (lv_model_7_0= ruleModel ) )? ( (lv_exceptions_8_0= ruleExceptions ) )? ( (lv_services_9_0= ruleService ) )* ( (lv_event_10_0= ruleEvent ) )? ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:146:1: (otherlv_0= '@moduleName' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '@version' otherlv_4= ':' ( (lv_version_5_0= ruleVersion ) ) ( (lv_imports_6_0= ruleImport ) )* ( (lv_model_7_0= ruleModel ) )? ( (lv_exceptions_8_0= ruleExceptions ) )? ( (lv_services_9_0= ruleService ) )* ( (lv_event_10_0= ruleEvent ) )? )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:146:1: (otherlv_0= '@moduleName' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '@version' otherlv_4= ':' ( (lv_version_5_0= ruleVersion ) ) ( (lv_imports_6_0= ruleImport ) )* ( (lv_model_7_0= ruleModel ) )? ( (lv_exceptions_8_0= ruleExceptions ) )? ( (lv_services_9_0= ruleService ) )* ( (lv_event_10_0= ruleEvent ) )? )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:146:3: otherlv_0= '@moduleName' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '@version' otherlv_4= ':' ( (lv_version_5_0= ruleVersion ) ) ( (lv_imports_6_0= ruleImport ) )* ( (lv_model_7_0= ruleModel ) )? ( (lv_exceptions_8_0= ruleExceptions ) )? ( (lv_services_9_0= ruleService ) )* ( (lv_event_10_0= ruleEvent ) )?
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

            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:270:3: ( (lv_event_10_0= ruleEvent ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:271:1: (lv_event_10_0= ruleEvent )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:271:1: (lv_event_10_0= ruleEvent )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:272:3: lv_event_10_0= ruleEvent
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getEventEventParserRuleCall_10_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEvent_in_ruleModule447);
                    lv_event_10_0=ruleEvent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		set(
                           			current, 
                           			"event",
                            		lv_event_10_0, 
                            		"Event");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:296:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:297:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:298:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName485);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName496); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:305:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:308:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:309:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:309:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:309:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName536); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:316:1: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:317:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedName555); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName570); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:337:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:338:2: (iv_ruleVersion= ruleVersion EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:339:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion618);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion629); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:346:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '-' this_ID_6= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_ID_6=null;

         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:349:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '-' this_ID_6= RULE_ID )? ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:350:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '-' this_ID_6= RULE_ID )? )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:350:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '-' this_ID_6= RULE_ID )? )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:350:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT (kw= '-' this_ID_6= RULE_ID )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersion669); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,16,FOLLOW_16_in_ruleVersion687); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersion702); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getVersionAccess().getINTTerminalRuleCall_2()); 
                
            kw=(Token)match(input,16,FOLLOW_16_in_ruleVersion720); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_3()); 
                
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersion735); 

            		current.merge(this_INT_4);
                
             
                newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_4()); 
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:383:1: (kw= '-' this_ID_6= RULE_ID )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:384:2: kw= '-' this_ID_6= RULE_ID
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleVersion754); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVersionAccess().getHyphenMinusKeyword_5_0()); 
                        
                    this_ID_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVersion769); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:404:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:405:2: (iv_ruleImport= ruleImport EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:406:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport816);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport826); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:413:1: ruleImport returns [EObject current=null] : (otherlv_0= '@import' otherlv_1= ':' ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:416:28: ( (otherlv_0= '@import' otherlv_1= ':' ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:417:1: (otherlv_0= '@import' otherlv_1= ':' ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:417:1: (otherlv_0= '@import' otherlv_1= ':' ( (lv_importedNamespace_2_0= ruleQualifiedName ) ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:417:3: otherlv_0= '@import' otherlv_1= ':' ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleImport863); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleImport875); 

                	newLeafNode(otherlv_1, grammarAccess.getImportAccess().getColonKeyword_1());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:425:1: ( (lv_importedNamespace_2_0= ruleQualifiedName ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:426:1: (lv_importedNamespace_2_0= ruleQualifiedName )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:426:1: (lv_importedNamespace_2_0= ruleQualifiedName )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:427:3: lv_importedNamespace_2_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport896);
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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:451:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:452:2: (iv_ruleModel= ruleModel EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:453:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel932);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel942); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:460:1: ruleModel returns [EObject current=null] : (otherlv_0= '@model' otherlv_1= '{' ( (lv_entities_2_0= ruleEntities ) )+ otherlv_3= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_entities_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:463:28: ( (otherlv_0= '@model' otherlv_1= '{' ( (lv_entities_2_0= ruleEntities ) )+ otherlv_3= '}' ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:464:1: (otherlv_0= '@model' otherlv_1= '{' ( (lv_entities_2_0= ruleEntities ) )+ otherlv_3= '}' )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:464:1: (otherlv_0= '@model' otherlv_1= '{' ( (lv_entities_2_0= ruleEntities ) )+ otherlv_3= '}' )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:464:3: otherlv_0= '@model' otherlv_1= '{' ( (lv_entities_2_0= ruleEntities ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleModel979); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleModel991); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:472:1: ( (lv_entities_2_0= ruleEntities ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=22 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:473:1: (lv_entities_2_0= ruleEntities )
            	    {
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:473:1: (lv_entities_2_0= ruleEntities )
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:474:3: lv_entities_2_0= ruleEntities
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntitiesParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntities_in_ruleModel1012);
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleModel1025); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:502:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:503:2: (iv_ruleComment= ruleComment EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:504:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment1061);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment1071); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:511:1: ruleComment returns [EObject current=null] : ( (lv_value_0_0= RULE_COMMENTS ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:514:28: ( ( (lv_value_0_0= RULE_COMMENTS ) ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:515:1: ( (lv_value_0_0= RULE_COMMENTS ) )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:515:1: ( (lv_value_0_0= RULE_COMMENTS ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:516:1: (lv_value_0_0= RULE_COMMENTS )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:516:1: (lv_value_0_0= RULE_COMMENTS )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:517:3: lv_value_0_0= RULE_COMMENTS
            {
            lv_value_0_0=(Token)match(input,RULE_COMMENTS,FOLLOW_RULE_COMMENTS_in_ruleComment1112); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:541:1: entryRuleEntities returns [EObject current=null] : iv_ruleEntities= ruleEntities EOF ;
    public final EObject entryRuleEntities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntities = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:542:2: (iv_ruleEntities= ruleEntities EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:543:2: iv_ruleEntities= ruleEntities EOF
            {
             newCompositeNode(grammarAccess.getEntitiesRule()); 
            pushFollow(FOLLOW_ruleEntities_in_entryRuleEntities1152);
            iv_ruleEntities=ruleEntities();

            state._fsp--;

             current =iv_ruleEntities; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntities1162); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:550:1: ruleEntities returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Enum_1= ruleEnum ) ;
    public final EObject ruleEntities() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Enum_1 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:553:28: ( (this_Entity_0= ruleEntity | this_Enum_1= ruleEnum ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:554:1: (this_Entity_0= ruleEntity | this_Enum_1= ruleEnum )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:554:1: (this_Entity_0= ruleEntity | this_Enum_1= ruleEnum )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:555:5: this_Entity_0= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getEntitiesAccess().getEntityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleEntities1209);
                    this_Entity_0=ruleEntity();

                    state._fsp--;

                     
                            current = this_Entity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:565:5: this_Enum_1= ruleEnum
                    {
                     
                            newCompositeNode(grammarAccess.getEntitiesAccess().getEnumParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnum_in_ruleEntities1236);
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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:581:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:582:2: (iv_ruleEnum= ruleEnum EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:583:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum1271);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum1281); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:590:1: ruleEnum returns [EObject current=null] : (otherlv_0= '@enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= RULE_ID ) )+ otherlv_4= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_features_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:593:28: ( (otherlv_0= '@enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= RULE_ID ) )+ otherlv_4= '}' ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:594:1: (otherlv_0= '@enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= RULE_ID ) )+ otherlv_4= '}' )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:594:1: (otherlv_0= '@enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= RULE_ID ) )+ otherlv_4= '}' )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:594:3: otherlv_0= '@enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= RULE_ID ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleEnum1318); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:598:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:599:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:599:1: (lv_name_1_0= RULE_ID )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:600:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum1335); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleEnum1352); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:620:1: ( (lv_features_3_0= RULE_ID ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:621:1: (lv_features_3_0= RULE_ID )
            	    {
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:621:1: (lv_features_3_0= RULE_ID )
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:622:3: lv_features_3_0= RULE_ID
            	    {
            	    lv_features_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum1369); 

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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleEnum1387); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:650:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:651:2: (iv_ruleEntity= ruleEntity EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:652:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1423);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1433); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:659:1: ruleEntity returns [EObject current=null] : (otherlv_0= '@entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )+ otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:662:28: ( (otherlv_0= '@entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )+ otherlv_4= '}' ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:663:1: (otherlv_0= '@entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )+ otherlv_4= '}' )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:663:1: (otherlv_0= '@entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )+ otherlv_4= '}' )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:663:3: otherlv_0= '@entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleFeature ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleEntity1470); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:667:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:668:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:668:1: (lv_name_1_0= RULE_ID )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:669:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1487); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleEntity1504); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:689:1: ( (lv_features_3_0= ruleFeature ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==RULE_COMMENTS) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:690:1: (lv_features_3_0= ruleFeature )
            	    {
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:690:1: (lv_features_3_0= ruleFeature )
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:691:3: lv_features_3_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity1525);
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleEntity1538); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:719:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:720:2: (iv_ruleFeature= ruleFeature EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:721:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1574);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1584); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:728:1: ruleFeature returns [EObject current=null] : ( ( (lv_featureComment_0_0= ruleComment ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleFeatureType ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_featureComment_0_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:731:28: ( ( ( (lv_featureComment_0_0= ruleComment ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleFeatureType ) ) ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:732:1: ( ( (lv_featureComment_0_0= ruleComment ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleFeatureType ) ) )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:732:1: ( ( (lv_featureComment_0_0= ruleComment ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleFeatureType ) ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:732:2: ( (lv_featureComment_0_0= ruleComment ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleFeatureType ) )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:732:2: ( (lv_featureComment_0_0= ruleComment ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMMENTS) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:733:1: (lv_featureComment_0_0= ruleComment )
            	    {
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:733:1: (lv_featureComment_0_0= ruleComment )
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:734:3: lv_featureComment_0_0= ruleComment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureAccess().getFeatureCommentCommentParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComment_in_ruleFeature1630);
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
            	    break loop12;
                }
            } while (true);

            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:750:3: ( (lv_name_1_0= RULE_ID ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:751:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:751:1: (lv_name_1_0= RULE_ID )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:752:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature1648); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleFeature1665); 

                	newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:772:1: ( (lv_type_3_0= ruleFeatureType ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:773:1: (lv_type_3_0= ruleFeatureType )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:773:1: (lv_type_3_0= ruleFeatureType )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:774:3: lv_type_3_0= ruleFeatureType
            {
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getTypeFeatureTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleFeatureType_in_ruleFeature1686);
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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:798:1: entryRuleFeatureType returns [EObject current=null] : iv_ruleFeatureType= ruleFeatureType EOF ;
    public final EObject entryRuleFeatureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureType = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:799:2: (iv_ruleFeatureType= ruleFeatureType EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:800:2: iv_ruleFeatureType= ruleFeatureType EOF
            {
             newCompositeNode(grammarAccess.getFeatureTypeRule()); 
            pushFollow(FOLLOW_ruleFeatureType_in_entryRuleFeatureType1722);
            iv_ruleFeatureType=ruleFeatureType();

            state._fsp--;

             current =iv_ruleFeatureType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureType1732); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:807:1: ruleFeatureType returns [EObject current=null] : (this_EntitiesFeature_0= ruleEntitiesFeature | this_PrimitiveFeature_1= rulePrimitiveFeature | this_GenericListFeature_2= ruleGenericListFeature ) ;
    public final EObject ruleFeatureType() throws RecognitionException {
        EObject current = null;

        EObject this_EntitiesFeature_0 = null;

        EObject this_PrimitiveFeature_1 = null;

        EObject this_GenericListFeature_2 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:810:28: ( (this_EntitiesFeature_0= ruleEntitiesFeature | this_PrimitiveFeature_1= rulePrimitiveFeature | this_GenericListFeature_2= ruleGenericListFeature ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:811:1: (this_EntitiesFeature_0= ruleEntitiesFeature | this_PrimitiveFeature_1= rulePrimitiveFeature | this_GenericListFeature_2= ruleGenericListFeature )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:811:1: (this_EntitiesFeature_0= ruleEntitiesFeature | this_PrimitiveFeature_1= rulePrimitiveFeature | this_GenericListFeature_2= ruleGenericListFeature )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
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
                alt13=2;
                }
                break;
            case 24:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:812:5: this_EntitiesFeature_0= ruleEntitiesFeature
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureTypeAccess().getEntitiesFeatureParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEntitiesFeature_in_ruleFeatureType1779);
                    this_EntitiesFeature_0=ruleEntitiesFeature();

                    state._fsp--;

                     
                            current = this_EntitiesFeature_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:822:5: this_PrimitiveFeature_1= rulePrimitiveFeature
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureTypeAccess().getPrimitiveFeatureParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveFeature_in_ruleFeatureType1806);
                    this_PrimitiveFeature_1=rulePrimitiveFeature();

                    state._fsp--;

                     
                            current = this_PrimitiveFeature_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:832:5: this_GenericListFeature_2= ruleGenericListFeature
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureTypeAccess().getGenericListFeatureParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleGenericListFeature_in_ruleFeatureType1833);
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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:848:1: entryRuleEntitiesFeature returns [EObject current=null] : iv_ruleEntitiesFeature= ruleEntitiesFeature EOF ;
    public final EObject entryRuleEntitiesFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntitiesFeature = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:849:2: (iv_ruleEntitiesFeature= ruleEntitiesFeature EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:850:2: iv_ruleEntitiesFeature= ruleEntitiesFeature EOF
            {
             newCompositeNode(grammarAccess.getEntitiesFeatureRule()); 
            pushFollow(FOLLOW_ruleEntitiesFeature_in_entryRuleEntitiesFeature1868);
            iv_ruleEntitiesFeature=ruleEntitiesFeature();

            state._fsp--;

             current =iv_ruleEntitiesFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntitiesFeature1878); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:857:1: ruleEntitiesFeature returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleEntitiesFeature() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:860:28: ( ( ( ruleQualifiedName ) ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:861:1: ( ( ruleQualifiedName ) )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:861:1: ( ( ruleQualifiedName ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:862:1: ( ruleQualifiedName )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:862:1: ( ruleQualifiedName )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:863:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntitiesFeatureRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEntitiesFeatureAccess().getTypeEntitiesCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntitiesFeature1925);
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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:884:1: entryRulePrimitiveFeature returns [EObject current=null] : iv_rulePrimitiveFeature= rulePrimitiveFeature EOF ;
    public final EObject entryRulePrimitiveFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveFeature = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:885:2: (iv_rulePrimitiveFeature= rulePrimitiveFeature EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:886:2: iv_rulePrimitiveFeature= rulePrimitiveFeature EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveFeatureRule()); 
            pushFollow(FOLLOW_rulePrimitiveFeature_in_entryRulePrimitiveFeature1960);
            iv_rulePrimitiveFeature=rulePrimitiveFeature();

            state._fsp--;

             current =iv_rulePrimitiveFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveFeature1970); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:893:1: rulePrimitiveFeature returns [EObject current=null] : ( (lv_type_0_0= rulePrimitiveType ) ) ;
    public final EObject rulePrimitiveFeature() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:896:28: ( ( (lv_type_0_0= rulePrimitiveType ) ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:897:1: ( (lv_type_0_0= rulePrimitiveType ) )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:897:1: ( (lv_type_0_0= rulePrimitiveType ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:898:1: (lv_type_0_0= rulePrimitiveType )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:898:1: (lv_type_0_0= rulePrimitiveType )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:899:3: lv_type_0_0= rulePrimitiveType
            {
             
            	        newCompositeNode(grammarAccess.getPrimitiveFeatureAccess().getTypePrimitiveTypeEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulePrimitiveType_in_rulePrimitiveFeature2015);
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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:923:1: entryRuleGenericListFeature returns [EObject current=null] : iv_ruleGenericListFeature= ruleGenericListFeature EOF ;
    public final EObject entryRuleGenericListFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericListFeature = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:924:2: (iv_ruleGenericListFeature= ruleGenericListFeature EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:925:2: iv_ruleGenericListFeature= ruleGenericListFeature EOF
            {
             newCompositeNode(grammarAccess.getGenericListFeatureRule()); 
            pushFollow(FOLLOW_ruleGenericListFeature_in_entryRuleGenericListFeature2050);
            iv_ruleGenericListFeature=ruleGenericListFeature();

            state._fsp--;

             current =iv_ruleGenericListFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenericListFeature2060); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:932:1: ruleGenericListFeature returns [EObject current=null] : (otherlv_0= '@List' otherlv_1= '<' ( (lv_type_2_0= ruleFeatureType ) ) otherlv_3= '>' ) ;
    public final EObject ruleGenericListFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:935:28: ( (otherlv_0= '@List' otherlv_1= '<' ( (lv_type_2_0= ruleFeatureType ) ) otherlv_3= '>' ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:936:1: (otherlv_0= '@List' otherlv_1= '<' ( (lv_type_2_0= ruleFeatureType ) ) otherlv_3= '>' )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:936:1: (otherlv_0= '@List' otherlv_1= '<' ( (lv_type_2_0= ruleFeatureType ) ) otherlv_3= '>' )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:936:3: otherlv_0= '@List' otherlv_1= '<' ( (lv_type_2_0= ruleFeatureType ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleGenericListFeature2097); 

                	newLeafNode(otherlv_0, grammarAccess.getGenericListFeatureAccess().getListKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleGenericListFeature2109); 

                	newLeafNode(otherlv_1, grammarAccess.getGenericListFeatureAccess().getLessThanSignKeyword_1());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:944:1: ( (lv_type_2_0= ruleFeatureType ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:945:1: (lv_type_2_0= ruleFeatureType )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:945:1: (lv_type_2_0= ruleFeatureType )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:946:3: lv_type_2_0= ruleFeatureType
            {
             
            	        newCompositeNode(grammarAccess.getGenericListFeatureAccess().getTypeFeatureTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFeatureType_in_ruleGenericListFeature2130);
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

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleGenericListFeature2142); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:974:1: entryRuleExceptions returns [EObject current=null] : iv_ruleExceptions= ruleExceptions EOF ;
    public final EObject entryRuleExceptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptions = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:975:2: (iv_ruleExceptions= ruleExceptions EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:976:2: iv_ruleExceptions= ruleExceptions EOF
            {
             newCompositeNode(grammarAccess.getExceptionsRule()); 
            pushFollow(FOLLOW_ruleExceptions_in_entryRuleExceptions2178);
            iv_ruleExceptions=ruleExceptions();

            state._fsp--;

             current =iv_ruleExceptions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptions2188); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:983:1: ruleExceptions returns [EObject current=null] : (otherlv_0= '@exceptions' otherlv_1= '{' ( (lv_exceptions_2_0= ruleException ) )+ otherlv_3= '}' ) ;
    public final EObject ruleExceptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exceptions_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:986:28: ( (otherlv_0= '@exceptions' otherlv_1= '{' ( (lv_exceptions_2_0= ruleException ) )+ otherlv_3= '}' ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:987:1: (otherlv_0= '@exceptions' otherlv_1= '{' ( (lv_exceptions_2_0= ruleException ) )+ otherlv_3= '}' )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:987:1: (otherlv_0= '@exceptions' otherlv_1= '{' ( (lv_exceptions_2_0= ruleException ) )+ otherlv_3= '}' )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:987:3: otherlv_0= '@exceptions' otherlv_1= '{' ( (lv_exceptions_2_0= ruleException ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleExceptions2225); 

                	newLeafNode(otherlv_0, grammarAccess.getExceptionsAccess().getExceptionsKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleExceptions2237); 

                	newLeafNode(otherlv_1, grammarAccess.getExceptionsAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:995:1: ( (lv_exceptions_2_0= ruleException ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:996:1: (lv_exceptions_2_0= ruleException )
            	    {
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:996:1: (lv_exceptions_2_0= ruleException )
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:997:3: lv_exceptions_2_0= ruleException
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExceptionsAccess().getExceptionsExceptionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleException_in_ruleExceptions2258);
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleExceptions2271); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1025:1: entryRuleException returns [EObject current=null] : iv_ruleException= ruleException EOF ;
    public final EObject entryRuleException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleException = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1026:2: (iv_ruleException= ruleException EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1027:2: iv_ruleException= ruleException EOF
            {
             newCompositeNode(grammarAccess.getExceptionRule()); 
            pushFollow(FOLLOW_ruleException_in_entryRuleException2307);
            iv_ruleException=ruleException();

            state._fsp--;

             current =iv_ruleException; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleException2317); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1034:1: ruleException returns [EObject current=null] : (otherlv_0= '@exception' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '@msg' otherlv_4= ':' ( (lv_msg_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
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
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1037:28: ( (otherlv_0= '@exception' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '@msg' otherlv_4= ':' ( (lv_msg_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1038:1: (otherlv_0= '@exception' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '@msg' otherlv_4= ':' ( (lv_msg_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1038:1: (otherlv_0= '@exception' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '@msg' otherlv_4= ':' ( (lv_msg_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1038:3: otherlv_0= '@exception' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '@msg' otherlv_4= ':' ( (lv_msg_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleException2354); 

                	newLeafNode(otherlv_0, grammarAccess.getExceptionAccess().getExceptionKeyword_0());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1042:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1043:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1043:1: (lv_name_1_0= RULE_ID )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1044:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleException2371); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleException2388); 

                	newLeafNode(otherlv_2, grammarAccess.getExceptionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleException2400); 

                	newLeafNode(otherlv_3, grammarAccess.getExceptionAccess().getMsgKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleException2412); 

                	newLeafNode(otherlv_4, grammarAccess.getExceptionAccess().getColonKeyword_4());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1072:1: ( (lv_msg_5_0= RULE_STRING ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1073:1: (lv_msg_5_0= RULE_STRING )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1073:1: (lv_msg_5_0= RULE_STRING )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1074:3: lv_msg_5_0= RULE_STRING
            {
            lv_msg_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleException2429); 

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

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleException2446); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1102:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1103:2: (iv_ruleService= ruleService EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1104:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService2482);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService2492); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1111:1: ruleService returns [EObject current=null] : (otherlv_0= '@service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ otherlv_4= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_operations_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1114:28: ( (otherlv_0= '@service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ otherlv_4= '}' ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1115:1: (otherlv_0= '@service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ otherlv_4= '}' )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1115:1: (otherlv_0= '@service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ otherlv_4= '}' )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1115:3: otherlv_0= '@service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleService2529); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1119:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1120:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1120:1: (lv_name_1_0= RULE_ID )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1121:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService2546); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleService2563); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1141:1: ( (lv_operations_3_0= ruleOperation ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1142:1: (lv_operations_3_0= ruleOperation )
            	    {
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1142:1: (lv_operations_3_0= ruleOperation )
            	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1143:3: lv_operations_3_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperation_in_ruleService2584);
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleService2597); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1171:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1172:2: (iv_ruleOperation= ruleOperation EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1173:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation2633);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation2643); 

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
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1180:1: ruleOperation returns [EObject current=null] : (otherlv_0= '@operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= '@input' otherlv_4= ':' otherlv_5= '{' ( (lv_featuresInput_6_0= ruleFeature ) )+ otherlv_7= '}' )? (otherlv_8= '@output' otherlv_9= ':' otherlv_10= '{' ( (lv_featuresOutput_11_0= ruleFeature ) )+ otherlv_12= '}' )? (otherlv_13= '@exception' otherlv_14= ':' ( ( ruleQualifiedName ) ) (otherlv_16= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_18= '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_featuresInput_6_0 = null;

        EObject lv_featuresOutput_11_0 = null;


         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1183:28: ( (otherlv_0= '@operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= '@input' otherlv_4= ':' otherlv_5= '{' ( (lv_featuresInput_6_0= ruleFeature ) )+ otherlv_7= '}' )? (otherlv_8= '@output' otherlv_9= ':' otherlv_10= '{' ( (lv_featuresOutput_11_0= ruleFeature ) )+ otherlv_12= '}' )? (otherlv_13= '@exception' otherlv_14= ':' ( ( ruleQualifiedName ) ) (otherlv_16= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_18= '}' ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1184:1: (otherlv_0= '@operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= '@input' otherlv_4= ':' otherlv_5= '{' ( (lv_featuresInput_6_0= ruleFeature ) )+ otherlv_7= '}' )? (otherlv_8= '@output' otherlv_9= ':' otherlv_10= '{' ( (lv_featuresOutput_11_0= ruleFeature ) )+ otherlv_12= '}' )? (otherlv_13= '@exception' otherlv_14= ':' ( ( ruleQualifiedName ) ) (otherlv_16= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_18= '}' )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1184:1: (otherlv_0= '@operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= '@input' otherlv_4= ':' otherlv_5= '{' ( (lv_featuresInput_6_0= ruleFeature ) )+ otherlv_7= '}' )? (otherlv_8= '@output' otherlv_9= ':' otherlv_10= '{' ( (lv_featuresOutput_11_0= ruleFeature ) )+ otherlv_12= '}' )? (otherlv_13= '@exception' otherlv_14= ':' ( ( ruleQualifiedName ) ) (otherlv_16= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_18= '}' )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1184:3: otherlv_0= '@operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= '@input' otherlv_4= ':' otherlv_5= '{' ( (lv_featuresInput_6_0= ruleFeature ) )+ otherlv_7= '}' )? (otherlv_8= '@output' otherlv_9= ':' otherlv_10= '{' ( (lv_featuresOutput_11_0= ruleFeature ) )+ otherlv_12= '}' )? (otherlv_13= '@exception' otherlv_14= ':' ( ( ruleQualifiedName ) ) (otherlv_16= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleOperation2680); 

                	newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOperationKeyword_0());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1188:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1189:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1189:1: (lv_name_1_0= RULE_ID )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1190:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation2697); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleOperation2714); 

                	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1210:1: (otherlv_3= '@input' otherlv_4= ':' otherlv_5= '{' ( (lv_featuresInput_6_0= ruleFeature ) )+ otherlv_7= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1210:3: otherlv_3= '@input' otherlv_4= ':' otherlv_5= '{' ( (lv_featuresInput_6_0= ruleFeature ) )+ otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleOperation2727); 

                        	newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getInputKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleOperation2739); 

                        	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getColonKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleOperation2751); 

                        	newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3_2());
                        
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1222:1: ( (lv_featuresInput_6_0= ruleFeature ) )+
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
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1223:1: (lv_featuresInput_6_0= ruleFeature )
                    	    {
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1223:1: (lv_featuresInput_6_0= ruleFeature )
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1224:3: lv_featuresInput_6_0= ruleFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOperationAccess().getFeaturesInputFeatureParserRuleCall_3_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFeature_in_ruleOperation2772);
                    	    lv_featuresInput_6_0=ruleFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"featuresInput",
                    	            		lv_featuresInput_6_0, 
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

                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleOperation2785); 

                        	newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1244:3: (otherlv_8= '@output' otherlv_9= ':' otherlv_10= '{' ( (lv_featuresOutput_11_0= ruleFeature ) )+ otherlv_12= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1244:5: otherlv_8= '@output' otherlv_9= ':' otherlv_10= '{' ( (lv_featuresOutput_11_0= ruleFeature ) )+ otherlv_12= '}'
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleOperation2800); 

                        	newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getOutputKeyword_4_0());
                        
                    otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleOperation2812); 

                        	newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getColonKeyword_4_1());
                        
                    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleOperation2824); 

                        	newLeafNode(otherlv_10, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_4_2());
                        
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1256:1: ( (lv_featuresOutput_11_0= ruleFeature ) )+
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
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1257:1: (lv_featuresOutput_11_0= ruleFeature )
                    	    {
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1257:1: (lv_featuresOutput_11_0= ruleFeature )
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1258:3: lv_featuresOutput_11_0= ruleFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOperationAccess().getFeaturesOutputFeatureParserRuleCall_4_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFeature_in_ruleOperation2845);
                    	    lv_featuresOutput_11_0=ruleFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"featuresOutput",
                    	            		lv_featuresOutput_11_0, 
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

                    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleOperation2858); 

                        	newLeafNode(otherlv_12, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1278:3: (otherlv_13= '@exception' otherlv_14= ':' ( ( ruleQualifiedName ) ) (otherlv_16= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1278:5: otherlv_13= '@exception' otherlv_14= ':' ( ( ruleQualifiedName ) ) (otherlv_16= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_13=(Token)match(input,28,FOLLOW_28_in_ruleOperation2873); 

                        	newLeafNode(otherlv_13, grammarAccess.getOperationAccess().getExceptionKeyword_5_0());
                        
                    otherlv_14=(Token)match(input,13,FOLLOW_13_in_ruleOperation2885); 

                        	newLeafNode(otherlv_14, grammarAccess.getOperationAccess().getColonKeyword_5_1());
                        
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1286:1: ( ( ruleQualifiedName ) )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1287:1: ( ruleQualifiedName )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1287:1: ( ruleQualifiedName )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1288:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getOperationAccess().getExceptiontsExceptionCrossReference_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleOperation2908);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1301:2: (otherlv_16= ',' ( ( ruleQualifiedName ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==34) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1301:4: otherlv_16= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_16=(Token)match(input,34,FOLLOW_34_in_ruleOperation2921); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getOperationAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1305:1: ( ( ruleQualifiedName ) )
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1306:1: ( ruleQualifiedName )
                    	    {
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1306:1: ( ruleQualifiedName )
                    	    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1307:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getOperationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getOperationAccess().getExceptiontsExceptionCrossReference_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleOperation2944);
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

            otherlv_18=(Token)match(input,21,FOLLOW_21_in_ruleOperation2960); 

                	newLeafNode(otherlv_18, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleEvent"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1332:1: entryRuleEvent returns [String current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final String entryRuleEvent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEvent = null;


        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1333:2: (iv_ruleEvent= ruleEvent EOF )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1334:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent2997);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent3008); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1341:1: ruleEvent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@event' kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleEvent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1344:28: ( (kw= '@event' kw= '{' kw= '}' ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1345:1: (kw= '@event' kw= '{' kw= '}' )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1345:1: (kw= '@event' kw= '{' kw= '}' )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1346:2: kw= '@event' kw= '{' kw= '}'
            {
            kw=(Token)match(input,35,FOLLOW_35_in_ruleEvent3046); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEventAccess().getEventKeyword_0()); 
                
            kw=(Token)match(input,20,FOLLOW_20_in_ruleEvent3059); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_1()); 
                
            kw=(Token)match(input,21,FOLLOW_21_in_ruleEvent3072); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_2()); 
                

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "rulePrimitiveType"
    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1371:1: rulePrimitiveType returns [Enumerator current=null] : ( (enumLiteral_0= '@String' ) | (enumLiteral_1= '@Short' ) | (enumLiteral_2= '@Integer' ) | (enumLiteral_3= '@Long' ) | (enumLiteral_4= '@Float' ) | (enumLiteral_5= '@Double' ) | (enumLiteral_6= '@Boolean' ) | (enumLiteral_7= '@Byte' ) | (enumLiteral_8= '@Date' ) | (enumLiteral_9= '@Datetime' ) | (enumLiteral_10= '@Timestamp' ) | (enumLiteral_11= '@Decimal' ) ) ;
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
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1373:28: ( ( (enumLiteral_0= '@String' ) | (enumLiteral_1= '@Short' ) | (enumLiteral_2= '@Integer' ) | (enumLiteral_3= '@Long' ) | (enumLiteral_4= '@Float' ) | (enumLiteral_5= '@Double' ) | (enumLiteral_6= '@Boolean' ) | (enumLiteral_7= '@Byte' ) | (enumLiteral_8= '@Date' ) | (enumLiteral_9= '@Datetime' ) | (enumLiteral_10= '@Timestamp' ) | (enumLiteral_11= '@Decimal' ) ) )
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1374:1: ( (enumLiteral_0= '@String' ) | (enumLiteral_1= '@Short' ) | (enumLiteral_2= '@Integer' ) | (enumLiteral_3= '@Long' ) | (enumLiteral_4= '@Float' ) | (enumLiteral_5= '@Double' ) | (enumLiteral_6= '@Boolean' ) | (enumLiteral_7= '@Byte' ) | (enumLiteral_8= '@Date' ) | (enumLiteral_9= '@Datetime' ) | (enumLiteral_10= '@Timestamp' ) | (enumLiteral_11= '@Decimal' ) )
            {
            // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1374:1: ( (enumLiteral_0= '@String' ) | (enumLiteral_1= '@Short' ) | (enumLiteral_2= '@Integer' ) | (enumLiteral_3= '@Long' ) | (enumLiteral_4= '@Float' ) | (enumLiteral_5= '@Double' ) | (enumLiteral_6= '@Boolean' ) | (enumLiteral_7= '@Byte' ) | (enumLiteral_8= '@Date' ) | (enumLiteral_9= '@Datetime' ) | (enumLiteral_10= '@Timestamp' ) | (enumLiteral_11= '@Decimal' ) )
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
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1374:2: (enumLiteral_0= '@String' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1374:2: (enumLiteral_0= '@String' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1374:4: enumLiteral_0= '@String'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_36_in_rulePrimitiveType3126); 

                            current = grammarAccess.getPrimitiveTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1380:6: (enumLiteral_1= '@Short' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1380:6: (enumLiteral_1= '@Short' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1380:8: enumLiteral_1= '@Short'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_37_in_rulePrimitiveType3143); 

                            current = grammarAccess.getPrimitiveTypeAccess().getShortEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeAccess().getShortEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1386:6: (enumLiteral_2= '@Integer' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1386:6: (enumLiteral_2= '@Integer' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1386:8: enumLiteral_2= '@Integer'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_38_in_rulePrimitiveType3160); 

                            current = grammarAccess.getPrimitiveTypeAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveTypeAccess().getIntegerEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1392:6: (enumLiteral_3= '@Long' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1392:6: (enumLiteral_3= '@Long' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1392:8: enumLiteral_3= '@Long'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_39_in_rulePrimitiveType3177); 

                            current = grammarAccess.getPrimitiveTypeAccess().getLongEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPrimitiveTypeAccess().getLongEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1398:6: (enumLiteral_4= '@Float' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1398:6: (enumLiteral_4= '@Float' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1398:8: enumLiteral_4= '@Float'
                    {
                    enumLiteral_4=(Token)match(input,40,FOLLOW_40_in_rulePrimitiveType3194); 

                            current = grammarAccess.getPrimitiveTypeAccess().getFloatEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPrimitiveTypeAccess().getFloatEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1404:6: (enumLiteral_5= '@Double' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1404:6: (enumLiteral_5= '@Double' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1404:8: enumLiteral_5= '@Double'
                    {
                    enumLiteral_5=(Token)match(input,41,FOLLOW_41_in_rulePrimitiveType3211); 

                            current = grammarAccess.getPrimitiveTypeAccess().getDoubleEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getPrimitiveTypeAccess().getDoubleEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1410:6: (enumLiteral_6= '@Boolean' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1410:6: (enumLiteral_6= '@Boolean' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1410:8: enumLiteral_6= '@Boolean'
                    {
                    enumLiteral_6=(Token)match(input,42,FOLLOW_42_in_rulePrimitiveType3228); 

                            current = grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getPrimitiveTypeAccess().getBooleanEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1416:6: (enumLiteral_7= '@Byte' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1416:6: (enumLiteral_7= '@Byte' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1416:8: enumLiteral_7= '@Byte'
                    {
                    enumLiteral_7=(Token)match(input,43,FOLLOW_43_in_rulePrimitiveType3245); 

                            current = grammarAccess.getPrimitiveTypeAccess().getByteEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getPrimitiveTypeAccess().getByteEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1422:6: (enumLiteral_8= '@Date' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1422:6: (enumLiteral_8= '@Date' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1422:8: enumLiteral_8= '@Date'
                    {
                    enumLiteral_8=(Token)match(input,44,FOLLOW_44_in_rulePrimitiveType3262); 

                            current = grammarAccess.getPrimitiveTypeAccess().getDateEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getPrimitiveTypeAccess().getDateEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1428:6: (enumLiteral_9= '@Datetime' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1428:6: (enumLiteral_9= '@Datetime' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1428:8: enumLiteral_9= '@Datetime'
                    {
                    enumLiteral_9=(Token)match(input,45,FOLLOW_45_in_rulePrimitiveType3279); 

                            current = grammarAccess.getPrimitiveTypeAccess().getDatetimeEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getPrimitiveTypeAccess().getDatetimeEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1434:6: (enumLiteral_10= '@Timestamp' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1434:6: (enumLiteral_10= '@Timestamp' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1434:8: enumLiteral_10= '@Timestamp'
                    {
                    enumLiteral_10=(Token)match(input,46,FOLLOW_46_in_rulePrimitiveType3296); 

                            current = grammarAccess.getPrimitiveTypeAccess().getTimestampEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getPrimitiveTypeAccess().getTimestampEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1440:6: (enumLiteral_11= '@Decimal' )
                    {
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1440:6: (enumLiteral_11= '@Decimal' )
                    // ../com.mguidi.soa/src-gen/com/mguidi/soa/parser/antlr/internal/InternalSOA.g:1440:8: enumLiteral_11= '@Decimal'
                    {
                    enumLiteral_11=(Token)match(input,47,FOLLOW_47_in_rulePrimitiveType3313); 

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
    public static final BitSet FOLLOW_ruleVersion_in_ruleModule338 = new BitSet(new long[]{0x00000008480C0002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModule359 = new BitSet(new long[]{0x00000008480C0002L});
    public static final BitSet FOLLOW_ruleModel_in_ruleModule381 = new BitSet(new long[]{0x0000000848000002L});
    public static final BitSet FOLLOW_ruleExceptions_in_ruleModule403 = new BitSet(new long[]{0x0000000840000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleModule425 = new BitSet(new long[]{0x0000000840000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleModule447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName536 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedName555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName570 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersion669 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVersion687 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersion702 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVersion720 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersion735 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleVersion754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVersion769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleImport863 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImport875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleModel979 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleModel991 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleEntities_in_ruleModel1012 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_21_in_ruleModel1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment1061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENTS_in_ruleComment1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntities_in_entryRuleEntities1152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntities1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleEntities1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleEntities1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum1271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEnum1318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum1335 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEnum1352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum1369 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleEnum1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleEntity1470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1487 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEntity1504 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity1525 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_21_in_ruleEntity1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleFeature1630 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature1648 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFeature1665 = new BitSet(new long[]{0x0000FFF001000010L});
    public static final BitSet FOLLOW_ruleFeatureType_in_ruleFeature1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureType_in_entryRuleFeatureType1722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureType1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntitiesFeature_in_ruleFeatureType1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveFeature_in_ruleFeatureType1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListFeature_in_ruleFeatureType1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntitiesFeature_in_entryRuleEntitiesFeature1868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntitiesFeature1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntitiesFeature1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveFeature_in_entryRulePrimitiveFeature1960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveFeature1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rulePrimitiveFeature2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenericListFeature_in_entryRuleGenericListFeature2050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenericListFeature2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleGenericListFeature2097 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleGenericListFeature2109 = new BitSet(new long[]{0x0000FFF001000010L});
    public static final BitSet FOLLOW_ruleFeatureType_in_ruleGenericListFeature2130 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleGenericListFeature2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptions_in_entryRuleExceptions2178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptions2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleExceptions2225 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExceptions2237 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleException_in_ruleExceptions2258 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_21_in_ruleExceptions2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleException_in_entryRuleException2307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleException2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleException2354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleException2371 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleException2388 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleException2400 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleException2412 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleException2429 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleException2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService2482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleService2529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService2546 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleService2563 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleService2584 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_21_in_ruleService2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation2633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOperation2680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation2697 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOperation2714 = new BitSet(new long[]{0x0000000310200000L});
    public static final BitSet FOLLOW_32_in_ruleOperation2727 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOperation2739 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOperation2751 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleOperation2772 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_21_in_ruleOperation2785 = new BitSet(new long[]{0x0000000210200000L});
    public static final BitSet FOLLOW_33_in_ruleOperation2800 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOperation2812 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOperation2824 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleOperation2845 = new BitSet(new long[]{0x0000000000200050L});
    public static final BitSet FOLLOW_21_in_ruleOperation2858 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_28_in_ruleOperation2873 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOperation2885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleOperation2908 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_34_in_ruleOperation2921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleOperation2944 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_21_in_ruleOperation2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent2997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleEvent3046 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEvent3059 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleEvent3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulePrimitiveType3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePrimitiveType3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePrimitiveType3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePrimitiveType3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePrimitiveType3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulePrimitiveType3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePrimitiveType3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulePrimitiveType3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePrimitiveType3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulePrimitiveType3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulePrimitiveType3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulePrimitiveType3313 = new BitSet(new long[]{0x0000000000000002L});

}