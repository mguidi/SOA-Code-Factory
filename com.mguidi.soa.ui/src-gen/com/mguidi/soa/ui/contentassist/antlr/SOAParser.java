/*
* generated by Xtext
*/
package com.mguidi.soa.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.mguidi.soa.services.SOAGrammarAccess;

public class SOAParser extends AbstractContentAssistParser {
	
	@Inject
	private SOAGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.mguidi.soa.ui.contentassist.antlr.internal.InternalSOAParser createParser() {
		com.mguidi.soa.ui.contentassist.antlr.internal.InternalSOAParser result = new com.mguidi.soa.ui.contentassist.antlr.internal.InternalSOAParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEntitiesAccess().getAlternatives(), "rule__Entities__Alternatives");
					put(grammarAccess.getFeatureTypeAccess().getAlternatives(), "rule__FeatureType__Alternatives");
					put(grammarAccess.getPrimitiveTypeAccess().getAlternatives(), "rule__PrimitiveType__Alternatives");
					put(grammarAccess.getArchitectureAccess().getGroup(), "rule__Architecture__Group__0");
					put(grammarAccess.getModuleAccess().getGroup(), "rule__Module__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getVersionAccess().getGroup_5(), "rule__Version__Group_5__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getEnumAccess().getGroup(), "rule__Enum__Group__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
					put(grammarAccess.getGenericListFeatureAccess().getGroup(), "rule__GenericListFeature__Group__0");
					put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
					put(grammarAccess.getExceptionAccess().getGroup(), "rule__Exception__Group__0");
					put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
					put(grammarAccess.getOperationAccess().getGroup_3(), "rule__Operation__Group_3__0");
					put(grammarAccess.getOperationAccess().getGroup_4(), "rule__Operation__Group_4__0");
					put(grammarAccess.getOperationAccess().getGroup_5(), "rule__Operation__Group_5__0");
					put(grammarAccess.getOperationAccess().getGroup_5_3(), "rule__Operation__Group_5_3__0");
					put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
					put(grammarAccess.getArchitectureAccess().getNameAssignment_2(), "rule__Architecture__NameAssignment_2");
					put(grammarAccess.getArchitectureAccess().getModuleAssignment_3(), "rule__Architecture__ModuleAssignment_3");
					put(grammarAccess.getModuleAccess().getNameAssignment_2(), "rule__Module__NameAssignment_2");
					put(grammarAccess.getModuleAccess().getVersionAssignment_5(), "rule__Module__VersionAssignment_5");
					put(grammarAccess.getModuleAccess().getImportsAssignment_6(), "rule__Module__ImportsAssignment_6");
					put(grammarAccess.getModuleAccess().getModelAssignment_7(), "rule__Module__ModelAssignment_7");
					put(grammarAccess.getModuleAccess().getServicesAssignment_8(), "rule__Module__ServicesAssignment_8");
					put(grammarAccess.getModuleAccess().getEventAssignment_9(), "rule__Module__EventAssignment_9");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_2(), "rule__Import__ImportedNamespaceAssignment_2");
					put(grammarAccess.getModelAccess().getEntitiesAssignment_2(), "rule__Model__EntitiesAssignment_2");
					put(grammarAccess.getCommentAccess().getValueAssignment(), "rule__Comment__ValueAssignment");
					put(grammarAccess.getEnumAccess().getNameAssignment_1(), "rule__Enum__NameAssignment_1");
					put(grammarAccess.getEnumAccess().getFeaturesAssignment_3(), "rule__Enum__FeaturesAssignment_3");
					put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getFeaturesAssignment_3(), "rule__Entity__FeaturesAssignment_3");
					put(grammarAccess.getFeatureAccess().getFeatureCommentAssignment_0(), "rule__Feature__FeatureCommentAssignment_0");
					put(grammarAccess.getFeatureAccess().getNameAssignment_1(), "rule__Feature__NameAssignment_1");
					put(grammarAccess.getFeatureAccess().getTypeAssignment_3(), "rule__Feature__TypeAssignment_3");
					put(grammarAccess.getEntitiesFeatureAccess().getTypeAssignment(), "rule__EntitiesFeature__TypeAssignment");
					put(grammarAccess.getPrimitiveFeatureAccess().getTypeAssignment(), "rule__PrimitiveFeature__TypeAssignment");
					put(grammarAccess.getGenericListFeatureAccess().getTypeAssignment_2(), "rule__GenericListFeature__TypeAssignment_2");
					put(grammarAccess.getServiceAccess().getNameAssignment_1(), "rule__Service__NameAssignment_1");
					put(grammarAccess.getServiceAccess().getExceptionsAssignment_3(), "rule__Service__ExceptionsAssignment_3");
					put(grammarAccess.getServiceAccess().getOperationsAssignment_4(), "rule__Service__OperationsAssignment_4");
					put(grammarAccess.getExceptionAccess().getNameAssignment_1(), "rule__Exception__NameAssignment_1");
					put(grammarAccess.getExceptionAccess().getMsgAssignment_5(), "rule__Exception__MsgAssignment_5");
					put(grammarAccess.getOperationAccess().getNameAssignment_1(), "rule__Operation__NameAssignment_1");
					put(grammarAccess.getOperationAccess().getFeaturesInputAssignment_3_3(), "rule__Operation__FeaturesInputAssignment_3_3");
					put(grammarAccess.getOperationAccess().getFeaturesOutputAssignment_4_3(), "rule__Operation__FeaturesOutputAssignment_4_3");
					put(grammarAccess.getOperationAccess().getExceptiontsAssignment_5_2(), "rule__Operation__ExceptiontsAssignment_5_2");
					put(grammarAccess.getOperationAccess().getExceptiontsAssignment_5_3_1(), "rule__Operation__ExceptiontsAssignment_5_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.mguidi.soa.ui.contentassist.antlr.internal.InternalSOAParser typedParser = (com.mguidi.soa.ui.contentassist.antlr.internal.InternalSOAParser) parser;
			typedParser.entryRuleArchitecture();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SOAGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SOAGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
