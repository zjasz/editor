package com.mentor.nucleus.bp.ui.explorer;
//======================================================================
//
// File: com/mentor/nucleus/bp/ui/explorer/ModelLabelProvider.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_label_provider.inc
// Version:      $Revision: 1.26 $
//
// (c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.
//
//======================================================================
//
// This class is responsible for decoupling the client model objects
// from the tree viewer by providing the naming and label information
// for the tree to show.
//
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.util.CoreUtil;
import com.mentor.nucleus.bp.core.common.NonRootModelElement;
/**
 * This file adapts the meta-model entities so that they work with the
 * Eclipse JFace user interface components.
 * <p>
 * Do not edit this class, it was created using the Project 
 * Technology MC-Java code generator product.
 * </p>
 */
public class ModelLabelProvider extends LabelProvider {
	private Map imageCache = new HashMap(11);
	/**
	 * @see ILabelProvider#getImage(Object)
	 */
	public Image getImage(Object element) {
		if (element instanceof MultipleOccurrenceElement) {
			element = ((MultipleOccurrenceElement) element).getElement();
		}
		return CorePlugin.getImageFor(element);
	}
	/**
	 * @see ILabelProvider#getText(Object)
	 */
	public String getText(Object element) {
		if (element instanceof MultipleOccurrenceElement) {
			element = ((MultipleOccurrenceElement) element).getElement();
		}
		if (element instanceof SystemModel_c) {
			String text = ((SystemModel_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof Domain_c) {
			String text = ((Domain_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof Subsystem_c) {
			String text = ((Subsystem_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof ModelClass_c) {
			String text = ((ModelClass_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof Attribute_c) {
			String text = ((Attribute_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof Operation_c) {
			String text = ((Operation_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof OperationParameter_c) {
			String text = ((OperationParameter_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof InstanceStateMachine_c) {
			return "Instance State Machine";
		} else if (element instanceof StateMachineState_c) {
			String text = ((StateMachineState_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof StateMachineEvent_c) {
			String text = ((StateMachineEvent_c) element).getMning();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof NonLocalEvent_c) {
			String text = ((NonLocalEvent_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof StateMachineEvent_c) {
			String text = ((StateMachineEvent_c) element).getMning();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof StateMachineEventDataItem_c) {
			String text = ((StateMachineEventDataItem_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof ClassStateMachine_c) {
			return "Class State Machine";
		} else if (element instanceof FunctionPackage_c) {
			String text = ((FunctionPackage_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof Function_c) {
			String text = ((Function_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof FunctionParameter_c) {
			String text = ((FunctionParameter_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof DataTypePackage_c) {
			String text = ((DataTypePackage_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof ExternalEntityPackage_c) {
			String text = ((ExternalEntityPackage_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof UserDataType_c) {
			DataType_c result = DataType_c
					.getOneS_DTOnR17((UserDataType_c) element);

			if (result == null)
				return "";
			String text = result.getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof ExternalEntity_c) {
			String text = ((ExternalEntity_c) element).getLabel();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof Bridge_c) {
			String text = ((Bridge_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof BridgeParameter_c) {
			String text = ((BridgeParameter_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof EnumerationDataType_c) {
			DataType_c result = DataType_c
					.getOneS_DTOnR17((EnumerationDataType_c) element);

			if (result == null)
				return "";
			String text = result.getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof Enumerator_c) {
			String text = ((Enumerator_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof CoreDataType_c) {
			DataType_c result = DataType_c
					.getOneS_DTOnR17((CoreDataType_c) element);

			if (result == null)
				return "";
			String text = result.getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof SupplementalDataItems_c) {
			StateMachineEventDataItem_c result = StateMachineEventDataItem_c
					.getOneSM_EVTDIOnR522((SupplementalDataItems_c) element);

			if (result == null)
				return "";
			String text = result.getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof Sequence_c) {
			String text = ((Sequence_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof ClassInstanceParticipant_c) {
			String text = ((ClassInstanceParticipant_c) element).getLabel();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof InstanceAttributeValue_c) {
			String text = ((InstanceAttributeValue_c) element).getLabel();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof MessageArgument_c) {
			String text = ((MessageArgument_c) element).getLabel();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof MessageArgument_c) {
			String text = ((MessageArgument_c) element).getLabel();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof MessageArgument_c) {
			String text = ((MessageArgument_c) element).getLabel();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof MessageArgument_c) {
			String text = ((MessageArgument_c) element).getLabel();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof MessageArgument_c) {
			String text = ((MessageArgument_c) element).getLabel();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof ClassParticipant_c) {
			String text = ((ClassParticipant_c) element).getLabel();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof ExternalEntityParticipant_c) {
			String text = ((ExternalEntityParticipant_c) element).getLabel();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof FunctionPackageParticipant_c) {
			String text = ((FunctionPackageParticipant_c) element).getLabel();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof PackageParticipant_c) {
			String text = ((PackageParticipant_c) element).getLabel();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof ClassParticipantAttribute_c) {
			String text = ((ClassParticipantAttribute_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof InstanceAttributeValue_c) {
			String text = ((InstanceAttributeValue_c) element).getLabel();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof ActorParticipant_c) {
			String text = ((ActorParticipant_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof SynchronousMessage_c) {
			String text = ((SynchronousMessage_c) element).getLabel();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof AsynchronousMessage_c) {
			String text = ((AsynchronousMessage_c) element).getLabel();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof ReturnMessage_c) {
			String text = ((ReturnMessage_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof Communication_c) {
			String text = ((Communication_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof UseCaseDiagram_c) {
			String text = ((UseCaseDiagram_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof UseCaseParticipant_c) {
			String text = ((UseCaseParticipant_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof Activity_c) {
			String text = ((Activity_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof ActivityDiagramAction_c) {
			String text = ((ActivityDiagramAction_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof ObjectNode_c) {
			String text = ((ObjectNode_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof AcceptEventAction_c) {
			String text = ((AcceptEventAction_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof SendSignal_c) {
			String text = ((SendSignal_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof AcceptTimeEventAction_c) {
			String text = ((AcceptTimeEventAction_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof InterfacePackage_c) {
			String text = ((InterfacePackage_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof Interface_c) {
			String text = ((Interface_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof InterfaceSignal_c) {
			String text = ((InterfaceSignal_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof PropertyParameter_c) {
			String text = ((PropertyParameter_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof ComponentPackage_c) {
			String text = ((ComponentPackage_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof Component_c) {
			String text = ((Component_c) element).getLabel();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof Provision_c) {
			String text = ((Provision_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof Requirement_c) {
			String text = ((Requirement_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof RequiredOperation_c) {
			String text = ((RequiredOperation_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof ProvidedOperation_c) {
			String text = ((ProvidedOperation_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof RequiredSignal_c) {
			String text = ((RequiredSignal_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof ProvidedSignal_c) {
			String text = ((ProvidedSignal_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof InterfaceOperation_c) {
			String text = ((InterfaceOperation_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof ComponentReference_c) {
			String text = ((ComponentReference_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof StructuredDataType_c) {
			DataType_c result = DataType_c
					.getOneS_DTOnR17((StructuredDataType_c) element);

			if (result == null)
				return "";
			String text = result.getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof StructureMember_c) {
			String text = ((StructureMember_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof Port_c) {
			String text = ((Port_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof ImportedProvision_c) {
			String text = ((ImportedProvision_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof ImportedRequirement_c) {
			String text = ((ImportedRequirement_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof ComponentParticipant_c) {
			String text = ((ComponentParticipant_c) element).getLabel();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof Package_c) {
			String text = ((Package_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof ConstantSpecification_c) {
			String text = ((ConstantSpecification_c) element).getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		} else if (element instanceof LiteralSymbolicConstant_c) {
			SymbolicConstant_c result = SymbolicConstant_c
					.getOneCNST_SYCOnR1502(LeafSymbolicConstant_c
							.getOneCNST_LFSCOnR1503((LiteralSymbolicConstant_c) element));

			if (result == null)
				return "";
			String text = result.getName();
			if (text == null) {
				return "";
			} else {
				return text;
			}
		}

		return "Unknown Model Element";
	}
	/**
	 * @see ILabelProvider#dispose()
	 */
	public void dispose() {
		for (Iterator i = imageCache.values().iterator(); i.hasNext();) {
			((Image) i.next()).dispose();
		}
		imageCache.clear();
	}
}