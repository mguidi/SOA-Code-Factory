package com.mguidi.soa.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.mguidi.soa.services.SOAGrammarAccess;
import com.mguidi.soa.soa.Architecture;
import com.mguidi.soa.soa.Comment;
import com.mguidi.soa.soa.EntitiesFeature;
import com.mguidi.soa.soa.Entity;
import com.mguidi.soa.soa.Exceptions;
import com.mguidi.soa.soa.Feature;
import com.mguidi.soa.soa.GenericListFeature;
import com.mguidi.soa.soa.Import;
import com.mguidi.soa.soa.Model;
import com.mguidi.soa.soa.Module;
import com.mguidi.soa.soa.Operation;
import com.mguidi.soa.soa.PrimitiveFeature;
import com.mguidi.soa.soa.Service;
import com.mguidi.soa.soa.SoaPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SOASemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SOAGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SoaPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SoaPackage.ARCHITECTURE:
				if(context == grammarAccess.getArchitectureRule()) {
					sequence_Architecture(context, (Architecture) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.COMMENT:
				if(context == grammarAccess.getCommentRule()) {
					sequence_Comment(context, (Comment) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.ENTITIES_FEATURE:
				if(context == grammarAccess.getEntitiesFeatureRule() ||
				   context == grammarAccess.getFeatureTypeRule()) {
					sequence_EntitiesFeature(context, (EntitiesFeature) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.ENTITY:
				if(context == grammarAccess.getEntitiesRule() ||
				   context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.ENUM:
				if(context == grammarAccess.getEntitiesRule() ||
				   context == grammarAccess.getEnumRule()) {
					sequence_Enum(context, (com.mguidi.soa.soa.Enum) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.EXCEPTION:
				if(context == grammarAccess.getExceptionRule()) {
					sequence_Exception(context, (com.mguidi.soa.soa.Exception) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.EXCEPTIONS:
				if(context == grammarAccess.getExceptionsRule()) {
					sequence_Exceptions(context, (Exceptions) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.FEATURE:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature(context, (Feature) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.GENERIC_LIST_FEATURE:
				if(context == grammarAccess.getFeatureTypeRule() ||
				   context == grammarAccess.getGenericListFeatureRule()) {
					sequence_GenericListFeature(context, (GenericListFeature) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.MODULE:
				if(context == grammarAccess.getModuleRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.OPERATION:
				if(context == grammarAccess.getOperationRule()) {
					sequence_Operation(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.PRIMITIVE_FEATURE:
				if(context == grammarAccess.getFeatureTypeRule() ||
				   context == grammarAccess.getPrimitiveFeatureRule()) {
					sequence_PrimitiveFeature(context, (PrimitiveFeature) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.SERVICE:
				if(context == grammarAccess.getServiceRule()) {
					sequence_Service(context, (Service) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=QualifiedName module=Module)
	 */
	protected void sequence_Architecture(EObject context, Architecture semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SoaPackage.Literals.ARCHITECTURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SoaPackage.Literals.ARCHITECTURE__NAME));
			if(transientValues.isValueTransient(semanticObject, SoaPackage.Literals.ARCHITECTURE__MODULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SoaPackage.Literals.ARCHITECTURE__MODULE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArchitectureAccess().getNameQualifiedNameParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getArchitectureAccess().getModuleModuleParserRuleCall_3_0(), semanticObject.getModule());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=COMMENTS
	 */
	protected void sequence_Comment(EObject context, Comment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SoaPackage.Literals.COMMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SoaPackage.Literals.COMMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCommentAccess().getValueCOMMENTSTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=[Entities|QualifiedName]
	 */
	protected void sequence_EntitiesFeature(EObject context, EntitiesFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SoaPackage.Literals.ENTITIES_FEATURE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SoaPackage.Literals.ENTITIES_FEATURE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEntitiesFeatureAccess().getTypeEntitiesQualifiedNameParserRuleCall_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID features+=Feature+)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID features+=ID+)
	 */
	protected void sequence_Enum(EObject context, com.mguidi.soa.soa.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID msg=STRING)
	 */
	protected void sequence_Exception(EObject context, com.mguidi.soa.soa.Exception semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SoaPackage.Literals.EXCEPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SoaPackage.Literals.EXCEPTION__NAME));
			if(transientValues.isValueTransient(semanticObject, SoaPackage.Literals.EXCEPTION__MSG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SoaPackage.Literals.EXCEPTION__MSG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExceptionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getExceptionAccess().getMsgSTRINGTerminalRuleCall_5_0(), semanticObject.getMsg());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     exceptions+=Exception+
	 */
	protected void sequence_Exceptions(EObject context, Exceptions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (featureComment+=Comment* name=ID type=FeatureType)
	 */
	protected void sequence_Feature(EObject context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=FeatureType
	 */
	protected void sequence_GenericListFeature(EObject context, GenericListFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SoaPackage.Literals.GENERIC_LIST_FEATURE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SoaPackage.Literals.GENERIC_LIST_FEATURE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGenericListFeatureAccess().getTypeFeatureTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedName
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SoaPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SoaPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_2_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     entities+=Entities+
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         version=Version 
	 *         imports+=Import* 
	 *         model=Model? 
	 *         exceptions=Exceptions? 
	 *         services+=Service*
	 *     )
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         authenticated?='@authenticated'? 
	 *         featuresInput+=Feature* 
	 *         featuresOutput+=Feature* 
	 *         (exceptionts+=[Exception|QualifiedName] exceptionts+=[Exception|QualifiedName]*)?
	 *     )
	 */
	protected void sequence_Operation(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=PrimitiveType
	 */
	protected void sequence_PrimitiveFeature(EObject context, PrimitiveFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SoaPackage.Literals.PRIMITIVE_FEATURE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SoaPackage.Literals.PRIMITIVE_FEATURE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimitiveFeatureAccess().getTypePrimitiveTypeEnumRuleCall_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID operations+=Operation+)
	 */
	protected void sequence_Service(EObject context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
