package com.mentor.nucleus.bp.ui.explorer.adapters;
//======================================================================
//
// File: com/mentor/nucleus/bp/ui/explorer/adapters/SequencesAdapter.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_adapters.inc
// Version:      $Revision: 1.31 $
//
// (c) Copyright 2006-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================
//
// This class is responsible for decoupling the client model entity
// class Sequence_c from the tree viewer and the hierarchy
// it imposes.
//
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import com.mentor.nucleus.bp.core.*;

import com.mentor.nucleus.bp.ui.explorer.*;
/**
 * This file adapts the meta-model entity; 'Sequence_c'
 * so that it works with the Eclipse JFace user interface components.
 * <p>
 * Do not edit this class, it was created using the Mentor 
 * Graphics MC-Java code generator product.
 * </p>
 */
public class SequencesAdapter implements ITreeContentProvider {
	static SequencesAdapter sequencesadapter = null;
	/**
	 * Returns the adapters singleton instance. If this
	 * is the first time, the instance is created.
	 */
	public static SequencesAdapter getInstance() {
		if (sequencesadapter == null) {
			sequencesadapter = new SequencesAdapter();
		}
		return sequencesadapter;
	}
	/**
	 * @see IContentProvider#inputChanged(Viewer, Object, Object)
	 * Called when the tree's input has been changed
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// Nothing to do
	}
	/**
	 * @see IContentProvider#dispose()
	 * Called when this viewer is no longer needed
	 */
	public void dispose() {
		// Nothing to dispose
	}
	/**
	 * @see ITreeContentProvider#getParent(Object)
	 * Returns the parent of this node
	 */
	public Object getParent(Object arg) {
		Component_c result47 = Component_c.getOneC_COnR4204(DomainAsComponent_c
				.getOneCN_DCOnR4204(Domain_c
						.getOneS_DOMOnR913((Sequence_c) arg)));
		if (result47 != null) {
			return result47;
		}
		SystemModel_c result48 = SystemModel_c
				.getOneS_SYSOnR950((Sequence_c) arg);
		if (result48 != null) {
			return result48;
		}
		Domain_c result49 = Domain_c.getOneS_DOMOnR913((Sequence_c) arg);
		if (result49 != null) {
			return result49;
		}
		Subsystem_c result50 = Subsystem_c.getOneS_SSOnR914((Sequence_c) arg);
		if (result50 != null) {
			return result50;
		}
		Sequence_c result51 = Sequence_c.getOneSQ_SOnR911(SequenceInSequence_c
				.getOneSQ_SISOnR928((Sequence_c) arg));
		if (result51 != null) {
			return result51;
		}
		Package_c result52 = Package_c
				.getOneEP_PKGOnR1400(SpecificationPackage_c
						.getOneEP_SPKGOnR1402((Sequence_c) arg));
		if (result52 != null) {
			return result52;
		}
		ComponentPackage_c result53 = ComponentPackage_c
				.getOneCP_CPOnR951((Sequence_c) arg);
		if (result53 != null) {
			return result53;
		}
		Component_c result54 = Component_c.getOneC_COnR952((Sequence_c) arg);
		if (result54 != null) {
			return result54;
		}
		return null;
	}
	/**
	 * @see IStructuredContentProvider#getElements(Object)
	 * Returns the elements below this node
	 */
	public Object[] getElements(Object arg) {
		return getChildren(arg);
	}

	/**
	 * @see ITreeContentProvider#getChildren(Object)
	 * Returns the children of this node
	 */
	public Object[] getChildren(Object arg) {
		int resultSize = 0;
		Sequence_c[] sequences_911_1 = Sequence_c
				.getManySQ_SsOnR928(SequenceInSequence_c
						.getManySQ_SISsOnR911((Sequence_c) arg));

		ModelContentProvider.sort(sequences_911_1);
		resultSize += sequences_911_1.length;
		ClassInstanceParticipant_c[] instances_929_2 = ClassInstanceParticipant_c
				.getManySQ_CIPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR929((Sequence_c) arg));

		ModelContentProvider.sort(instances_929_2);
		resultSize += instances_929_2.length;
		ClassParticipant_c[] importedclasses_929_3 = ClassParticipant_c
				.getManySQ_CPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR929((Sequence_c) arg));

		ModelContentProvider.sort(importedclasses_929_3);
		resultSize += importedclasses_929_3.length;
		ComponentParticipant_c[] componentparticipants_929_4 = ComponentParticipant_c
				.getManySQ_COPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR929((Sequence_c) arg));

		ModelContentProvider.sort(componentparticipants_929_4);
		resultSize += componentparticipants_929_4.length;
		ExternalEntityParticipant_c[] importedexternalentities_929_5 = ExternalEntityParticipant_c
				.getManySQ_EEPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR929((Sequence_c) arg));

		ModelContentProvider.sort(importedexternalentities_929_5);
		resultSize += importedexternalentities_929_5.length;
		FunctionPackageParticipant_c[] importedfunctionpackages_929_6 = FunctionPackageParticipant_c
				.getManySQ_FPPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR929((Sequence_c) arg));

		ModelContentProvider.sort(importedfunctionpackages_929_6);
		resultSize += importedfunctionpackages_929_6.length;
		ActorParticipant_c[] actors_929_7 = ActorParticipant_c
				.getManySQ_APsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR929((Sequence_c) arg));

		ModelContentProvider.sort(actors_929_7);
		resultSize += actors_929_7.length;

		Object[] result = new Object[resultSize];
		int count = 0;
		for (int i = 0; i < sequences_911_1.length; i++) {
			result[count] = sequences_911_1[i];
			count++;
		}
		for (int i = 0; i < instances_929_2.length; i++) {
			result[count] = instances_929_2[i];
			count++;
		}
		for (int i = 0; i < importedclasses_929_3.length; i++) {
			result[count] = importedclasses_929_3[i];
			count++;
		}
		for (int i = 0; i < componentparticipants_929_4.length; i++) {
			result[count] = componentparticipants_929_4[i];
			count++;
		}
		for (int i = 0; i < importedexternalentities_929_5.length; i++) {
			result[count] = importedexternalentities_929_5[i];
			count++;
		}
		for (int i = 0; i < importedfunctionpackages_929_6.length; i++) {
			result[count] = importedfunctionpackages_929_6[i];
			count++;
		}
		for (int i = 0; i < actors_929_7.length; i++) {
			result[count] = actors_929_7[i];
			count++;
		}
		return result;
	}
	/**
	 * @see ITreeContentProvider#hasChildren(Object)
	 * Returns true if this node has any children
	 */
	public boolean hasChildren(Object arg) {
		Sequence_c[] sequences_911_1 = Sequence_c
				.getManySQ_SsOnR928(SequenceInSequence_c
						.getManySQ_SISsOnR911((Sequence_c) arg));

		if (sequences_911_1.length > 0)
			return true;
		ClassInstanceParticipant_c[] instances_929_2 = ClassInstanceParticipant_c
				.getManySQ_CIPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR929((Sequence_c) arg));

		if (instances_929_2.length > 0)
			return true;
		ClassParticipant_c[] importedclasses_929_3 = ClassParticipant_c
				.getManySQ_CPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR929((Sequence_c) arg));

		if (importedclasses_929_3.length > 0)
			return true;
		ComponentParticipant_c[] componentparticipants_929_4 = ComponentParticipant_c
				.getManySQ_COPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR929((Sequence_c) arg));

		if (componentparticipants_929_4.length > 0)
			return true;
		ExternalEntityParticipant_c[] importedexternalentities_929_5 = ExternalEntityParticipant_c
				.getManySQ_EEPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR929((Sequence_c) arg));

		if (importedexternalentities_929_5.length > 0)
			return true;
		FunctionPackageParticipant_c[] importedfunctionpackages_929_6 = FunctionPackageParticipant_c
				.getManySQ_FPPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR929((Sequence_c) arg));

		if (importedfunctionpackages_929_6.length > 0)
			return true;
		ActorParticipant_c[] actors_929_7 = ActorParticipant_c
				.getManySQ_APsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR929((Sequence_c) arg));

		if (actors_929_7.length > 0)
			return true;
		return false;
	}
}