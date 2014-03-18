package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.GlobalElementInSystem_c.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================

// No special imports
import java.util.*;
import java.lang.reflect.*;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import com.mentor.nucleus.bp.core.util.PersistenceUtil;
import org.eclipse.core.runtime.NullProgressMonitor;
import com.mentor.nucleus.bp.core.ui.marker.UmlProblem;
import com.mentor.nucleus.bp.core.common.*;
abstract class EV_GLOBAL_ELEMENT_IN_SYSTEM extends genericEvent_c {
	public abstract int getEvtcode();
}

public class GlobalElementInSystem_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public GlobalElementInSystem_c(ModelRoot modelRoot,
			java.util.UUID p_m_element_id, java.util.UUID p_m_sys_id) {
		super(modelRoot);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_element_id = IdAssigner.preprocessUUID(p_m_element_id);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_sys_id = IdAssigner.preprocessUUID(p_m_sys_id);

		Object[] key = {m_element_id, m_sys_id};
		addInstanceToMap(key);
	}
	static public GlobalElementInSystem_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_element_id, java.util.UUID p_m_sys_id,
			String p_contentPath, IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(GlobalElementInSystem_c.class);
		GlobalElementInSystem_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_element_id, p_m_sys_id};
			new_inst = (GlobalElementInSystem_c) instances.get(key);
		}
		String contentPath = PersistenceUtil.resolveRelativePath(p_localPath,
				new Path(p_contentPath));
		if (modelRoot.isNewCompareRoot()) {
			// for comparisons we do not want to change
			// the content path
			contentPath = p_contentPath;
		}
		if (new_inst != null && !modelRoot.isCompareRoot()) {
			PersistableModelComponent pmc = new_inst.getPersistableComponent();
			if (pmc == null) {
				// dangling reference, redo this instance
				new_inst.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_element_id = IdAssigner
						.preprocessUUID(p_m_element_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_sys_id = IdAssigner.preprocessUUID(p_m_sys_id);

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new GlobalElementInSystem_c(modelRoot, p_m_element_id,
					p_m_sys_id);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public GlobalElementInSystem_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_element_id, java.util.UUID p_m_sys_id) {
		InstanceList instances = modelRoot
				.getInstanceList(GlobalElementInSystem_c.class);
		GlobalElementInSystem_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_element_id, p_m_sys_id};
			source = (GlobalElementInSystem_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_element_id = IdAssigner.preprocessUUID(p_m_element_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_sys_id = IdAssigner.preprocessUUID(p_m_sys_id);

				return source;
			}
		}
		// there is no instance matching the id
		GlobalElementInSystem_c new_inst = new GlobalElementInSystem_c(
				modelRoot, p_m_element_id, p_m_sys_id);
		return new_inst;
	}
	public GlobalElementInSystem_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_element_id = IdAssigner.NULL_UUID;
		m_sys_id = IdAssigner.NULL_UUID;
		Object[] key = {m_element_id, m_sys_id};
		addInstanceToMap(key);
	}

	public Object getInstanceKey() {
		Object[] key = {m_element_id, m_sys_id};
		return key;
	}

	public boolean setInstanceKey(UUID p_newKey) {

		boolean changed = false;
		// round p1
		// round p2
		// round p3
		// round p4
		// round p5
		if (m_element_id != p_newKey) {

			m_element_id = p_newKey;
			changed = true;
		}
		return changed;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof GlobalElementInSystem_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof GlobalElementInSystem_c)) {
			return false;
		}

		GlobalElementInSystem_c me = (GlobalElementInSystem_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getElement_id()) || IdAssigner.NULL_UUID
				.equals(((GlobalElementInSystem_c) elem).getElement_id()))
				&& this != elem) {
			return false;
		}
		if (!getElement_id().equals(
				((GlobalElementInSystem_c) elem).getElement_id()))
			return false;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getSys_id()) || IdAssigner.NULL_UUID
				.equals(((GlobalElementInSystem_c) elem).getSys_id()))
				&& this != elem) {
			return false;
		}
		if (!getSys_id().equals(((GlobalElementInSystem_c) elem).getSys_id()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof GlobalElementInSystem_c)) {
			return false;
		}

		GlobalElementInSystem_c me = (GlobalElementInSystem_c) elem;
		if (!getElement_idCachedValue().equals(
				((GlobalElementInSystem_c) elem).getElement_idCachedValue()))
			return false;
		if (!getSys_idCachedValue().equals(
				((GlobalElementInSystem_c) elem).getSys_idCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private java.util.UUID m_element_id;
	private java.util.UUID m_sys_id;

	// declare association references from this class

	// referring navigation

	SystemModel_c SystemModel;
	public void relateAcrossR9100To(SystemModel_c target) {
		relateAcrossR9100To(target, true);
	}
	public void relateAcrossR9100To(SystemModel_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == SystemModel)
			return; // already related

		if (SystemModel != target) {

			Object oldKey = getInstanceKey();

			if (SystemModel != null) {

				SystemModel.clearBackPointerR9100To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"GlobalElementInSystem_c.relateAcrossR9100To(SystemModel_c target)",
									"Relate performed across R9100 from Global Element in System to System Model without unrelate of prior instance.");
				}
			}

			SystemModel = target;
			m_sys_id = target.getSys_id();
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR9100To(this);
			target.addRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_RELATED, this,
						target, "9100", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}
	public void unrelateAcrossR9100From(SystemModel_c target) {
		unrelateAcrossR9100From(target, true);
	}
	public void unrelateAcrossR9100From(SystemModel_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (SystemModel == null)
			return; // already unrelated

		if (target != SystemModel) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R9100",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR9100To(this);
		}

		if (SystemModel != null) {

			m_sys_id = SystemModel.getSys_id();
			SystemModel = null;
			target.removeRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_UNRELATED, this,
						target, "9100", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}

	// referring navigation

	PackageableElement_c PackageableElement;
	public void relateAcrossR9100To(PackageableElement_c target) {
		relateAcrossR9100To(target, true);
	}
	public void relateAcrossR9100To(PackageableElement_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (target == PackageableElement)
			return; // already related

		if (PackageableElement != target) {

			Object oldKey = getInstanceKey();

			if (PackageableElement != null) {

				PackageableElement.clearBackPointerR9100To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"GlobalElementInSystem_c.relateAcrossR9100To(PackageableElement_c target)",
									"Relate performed across R9100 from Global Element in System to Packageable Element without unrelate of prior instance.");
				}
			}

			PackageableElement = target;
			m_element_id = target.getElement_id();
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR9100To(this);
			target.addRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_RELATED, this,
						target, "9100", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}
	public void unrelateAcrossR9100From(PackageableElement_c target) {
		unrelateAcrossR9100From(target, true);
	}
	public void unrelateAcrossR9100From(PackageableElement_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (PackageableElement == null)
			return; // already unrelated

		if (target != PackageableElement) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R9100",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR9100To(this);
		}

		if (PackageableElement != null) {

			m_element_id = PackageableElement.getElement_id();
			PackageableElement = null;
			target.removeRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_UNRELATED, this,
						target, "9100", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}

	public static GlobalElementInSystem_c getOneG_EISOnR9100(
			SystemModel_c[] targets) {
		return getOneG_EISOnR9100(targets, null);
	}

	public static GlobalElementInSystem_c getOneG_EISOnR9100(
			SystemModel_c[] targets, ClassQueryInterface_c test) {
		GlobalElementInSystem_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneG_EISOnR9100(targets[i], test);
			}
		}

		return ret_val;
	}

	public static GlobalElementInSystem_c getOneG_EISOnR9100(
			SystemModel_c target) {
		return getOneG_EISOnR9100(target, null);
	}

	public static GlobalElementInSystem_c getOneG_EISOnR9100(
			SystemModel_c target, boolean loadComponent) {
		return getOneG_EISOnR9100(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static GlobalElementInSystem_c getOneG_EISOnR9100(
			SystemModel_c target, ClassQueryInterface_c test) {
		if (target != null) {
			return getOneG_EISOnR9100(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static GlobalElementInSystem_c getOneG_EISOnR9100(
			ModelRoot modelRoot, SystemModel_c target,
			ClassQueryInterface_c test) {
		return getOneG_EISOnR9100(modelRoot, target, test, true);
	}

	public static GlobalElementInSystem_c getOneG_EISOnR9100(
			ModelRoot modelRoot, SystemModel_c target,
			ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneG_EISOnR9100(modelRoot, target, test);
	}
	private static GlobalElementInSystem_c find_getOneG_EISOnR9100(
			ModelRoot modelRoot, SystemModel_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			synchronized (target.backPointer_GlobalElementInSystem_R9100) {
				for (int i = 0; i < target.backPointer_GlobalElementInSystem_R9100
						.size(); ++i) {
					GlobalElementInSystem_c source = (GlobalElementInSystem_c) target.backPointer_GlobalElementInSystem_R9100
							.get(i);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						return source;
					}
				}
			}
		}
		// not found
		return null;
	}

	public static GlobalElementInSystem_c[] getManyG_EISsOnR9100(
			SystemModel_c[] targets) {
		return getManyG_EISsOnR9100(targets, null);
	}
	public static GlobalElementInSystem_c[] getManyG_EISsOnR9100(
			SystemModel_c[] targets, boolean loadComponent) {
		return getManyG_EISsOnR9100(targets, null, loadComponent);
	}
	public static GlobalElementInSystem_c[] getManyG_EISsOnR9100(
			SystemModel_c[] targets, ClassQueryInterface_c test) {
		return getManyG_EISsOnR9100(targets, test, true);
	}

	public static GlobalElementInSystem_c[] getManyG_EISsOnR9100(
			SystemModel_c[] targets, ClassQueryInterface_c test,
			boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new GlobalElementInSystem_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(GlobalElementInSystem_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			synchronized (targets[i].backPointer_GlobalElementInSystem_R9100) {
				for (int j = 0; j < targets[i].backPointer_GlobalElementInSystem_R9100
						.size(); ++j) {
					GlobalElementInSystem_c source = (GlobalElementInSystem_c) targets[i].backPointer_GlobalElementInSystem_R9100
							.get(j);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						matches.add(source);
					}
				}
			}
		}
		if (matches.size() > 0) {
			GlobalElementInSystem_c[] ret_set = new GlobalElementInSystem_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new GlobalElementInSystem_c[0];
		}
	}

	public static GlobalElementInSystem_c[] getManyG_EISsOnR9100(
			SystemModel_c target) {
		return getManyG_EISsOnR9100(target, null);
	}

	public static GlobalElementInSystem_c[] getManyG_EISsOnR9100(
			SystemModel_c target, boolean loadComponent) {
		return getManyG_EISsOnR9100(target, null, loadComponent);
	}

	public static GlobalElementInSystem_c[] getManyG_EISsOnR9100(
			SystemModel_c target, ClassQueryInterface_c test) {
		return getManyG_EISsOnR9100(target, test, true);
	}

	public static GlobalElementInSystem_c[] getManyG_EISsOnR9100(
			SystemModel_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		if (target == null)
			return new GlobalElementInSystem_c[0];

		ModelRoot modelRoot = target.getModelRoot();
		Vector matches = new Vector();
		synchronized (target.backPointer_GlobalElementInSystem_R9100) {
			for (int i = 0; i < target.backPointer_GlobalElementInSystem_R9100
					.size(); ++i) {
				GlobalElementInSystem_c source = (GlobalElementInSystem_c) target.backPointer_GlobalElementInSystem_R9100
						.get(i);
				if (source != null && (test == null || test.evaluate(source))) {

					matches.add(source);
				}
			}
		}

		if (matches.size() > 0) {
			GlobalElementInSystem_c[] ret_set = new GlobalElementInSystem_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new GlobalElementInSystem_c[0];
		}
	}

	public static GlobalElementInSystem_c getOneG_EISOnR9100(
			PackageableElement_c[] targets) {
		return getOneG_EISOnR9100(targets, null);
	}

	public static GlobalElementInSystem_c getOneG_EISOnR9100(
			PackageableElement_c[] targets, ClassQueryInterface_c test) {
		GlobalElementInSystem_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneG_EISOnR9100(targets[i], test);
			}
		}

		return ret_val;
	}

	public static GlobalElementInSystem_c getOneG_EISOnR9100(
			PackageableElement_c target) {
		return getOneG_EISOnR9100(target, null);
	}

	public static GlobalElementInSystem_c getOneG_EISOnR9100(
			PackageableElement_c target, boolean loadComponent) {
		return getOneG_EISOnR9100(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static GlobalElementInSystem_c getOneG_EISOnR9100(
			PackageableElement_c target, ClassQueryInterface_c test) {
		if (target != null) {
			return getOneG_EISOnR9100(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static GlobalElementInSystem_c getOneG_EISOnR9100(
			ModelRoot modelRoot, PackageableElement_c target,
			ClassQueryInterface_c test) {
		return getOneG_EISOnR9100(modelRoot, target, test, true);
	}

	public static GlobalElementInSystem_c getOneG_EISOnR9100(
			ModelRoot modelRoot, PackageableElement_c target,
			ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneG_EISOnR9100(modelRoot, target, test);
	}
	private static GlobalElementInSystem_c find_getOneG_EISOnR9100(
			ModelRoot modelRoot, PackageableElement_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			synchronized (target.backPointer_GlobalElementInSystem_R9100) {
				for (int i = 0; i < target.backPointer_GlobalElementInSystem_R9100
						.size(); ++i) {
					GlobalElementInSystem_c source = (GlobalElementInSystem_c) target.backPointer_GlobalElementInSystem_R9100
							.get(i);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						return source;
					}
				}
			}
		}
		// not found
		return null;
	}

	public static GlobalElementInSystem_c[] getManyG_EISsOnR9100(
			PackageableElement_c[] targets) {
		return getManyG_EISsOnR9100(targets, null);
	}
	public static GlobalElementInSystem_c[] getManyG_EISsOnR9100(
			PackageableElement_c[] targets, boolean loadComponent) {
		return getManyG_EISsOnR9100(targets, null, loadComponent);
	}
	public static GlobalElementInSystem_c[] getManyG_EISsOnR9100(
			PackageableElement_c[] targets, ClassQueryInterface_c test) {
		return getManyG_EISsOnR9100(targets, test, true);
	}

	public static GlobalElementInSystem_c[] getManyG_EISsOnR9100(
			PackageableElement_c[] targets, ClassQueryInterface_c test,
			boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new GlobalElementInSystem_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(GlobalElementInSystem_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			synchronized (targets[i].backPointer_GlobalElementInSystem_R9100) {
				for (int j = 0; j < targets[i].backPointer_GlobalElementInSystem_R9100
						.size(); ++j) {
					GlobalElementInSystem_c source = (GlobalElementInSystem_c) targets[i].backPointer_GlobalElementInSystem_R9100
							.get(j);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						matches.add(source);
					}
				}
			}
		}
		if (matches.size() > 0) {
			GlobalElementInSystem_c[] ret_set = new GlobalElementInSystem_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new GlobalElementInSystem_c[0];
		}
	}

	public static GlobalElementInSystem_c[] getManyG_EISsOnR9100(
			PackageableElement_c target) {
		return getManyG_EISsOnR9100(target, null);
	}

	public static GlobalElementInSystem_c[] getManyG_EISsOnR9100(
			PackageableElement_c target, boolean loadComponent) {
		return getManyG_EISsOnR9100(target, null, loadComponent);
	}

	public static GlobalElementInSystem_c[] getManyG_EISsOnR9100(
			PackageableElement_c target, ClassQueryInterface_c test) {
		return getManyG_EISsOnR9100(target, test, true);
	}

	public static GlobalElementInSystem_c[] getManyG_EISsOnR9100(
			PackageableElement_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		if (target == null)
			return new GlobalElementInSystem_c[0];

		ModelRoot modelRoot = target.getModelRoot();
		Vector matches = new Vector();
		synchronized (target.backPointer_GlobalElementInSystem_R9100) {
			for (int i = 0; i < target.backPointer_GlobalElementInSystem_R9100
					.size(); ++i) {
				GlobalElementInSystem_c source = (GlobalElementInSystem_c) target.backPointer_GlobalElementInSystem_R9100
						.get(i);
				if (source != null && (test == null || test.evaluate(source))) {

					matches.add(source);
				}
			}
		}

		if (matches.size() > 0) {
			GlobalElementInSystem_c[] ret_set = new GlobalElementInSystem_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new GlobalElementInSystem_c[0];
		}
	}

	public void batchRelate(ModelRoot modelRoot, boolean notifyChanges,
			boolean searchAllRoots) {
		batchRelate(modelRoot, false, notifyChanges, searchAllRoots);
	}

	public void batchRelate(ModelRoot modelRoot, boolean relateProxies,
			boolean notifyChanges, boolean searchAllRoots) {
		InstanceList instances = null;
		ModelRoot baseRoot = modelRoot;

		// R9100
		PackageableElement_c relInst40357 = (PackageableElement_c) baseRoot
				.getInstanceList(PackageableElement_c.class).get(
						new Object[]{m_element_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst40357 == null) {
			relInst40357 = (PackageableElement_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(PackageableElement_c.class)
					.get(new Object[]{m_element_id});
		}
		if (relInst40357 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst40357 = (PackageableElement_c) roots[i].getInstanceList(
						PackageableElement_c.class).get(
						new Object[]{m_element_id});
				if (relInst40357 != null)
					break;
			}
		}
		//synchronized
		if (relInst40357 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst40357) && !isProxy())) {
				relInst40357.relateAcrossR9100To(this, notifyChanges);
			}
		}

		baseRoot = Ooaofooa.getDefaultInstance();
		if (baseRoot != modelRoot && modelRoot.isCompareRoot()) {
			baseRoot = modelRoot;
		}
		SystemModel_c relInst40358 = (SystemModel_c) baseRoot.getInstanceList(
				SystemModel_c.class).get(new Object[]{m_sys_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst40358 == null) {
			relInst40358 = (SystemModel_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(SystemModel_c.class)
					.get(new Object[]{m_sys_id});
		}
		if (relInst40358 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst40358 = (SystemModel_c) roots[i].getInstanceList(
						SystemModel_c.class).get(new Object[]{m_sys_id});
				if (relInst40358 != null)
					break;
			}
		}
		//synchronized
		if (relInst40358 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst40358) && !isProxy())) {
				relInst40358.relateAcrossR9100To(this, notifyChanges);
			}
			// set the root in the Domain's model root, not the System Model's
			// modelRoot is the SystemModel's root when we are loading a Domain proxy
			((Ooaofooa) getModelRoot()).setRoot(relInst40358);
		}
		baseRoot = modelRoot;

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R9100
		// PE_PE
		inst = PackageableElement;
		unrelateAcrossR9100From(PackageableElement, notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
		// S_SYS
		inst = SystemModel;
		unrelateAcrossR9100From(SystemModel, notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
	}
	public static void batchRelateAll(ModelRoot modelRoot,
			boolean notifyChanges, boolean searchAllRoots) {
		batchRelateAll(modelRoot, notifyChanges, searchAllRoots, false);
	}
	public static void batchRelateAll(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots, boolean relateProxies)
  {
	InstanceList instances = modelRoot.getInstanceList(GlobalElementInSystem_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final GlobalElementInSystem_c inst = (GlobalElementInSystem_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(GlobalElementInSystem_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static GlobalElementInSystem_c GlobalElementInSystemInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		GlobalElementInSystem_c result = findGlobalElementInSystemInstance(
				modelRoot, test, loadComponent);
		return result;
	}
	private static GlobalElementInSystem_c findGlobalElementInSystemInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(GlobalElementInSystem_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				GlobalElementInSystem_c x = (GlobalElementInSystem_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					return x;
				}
			}
		}
		return null;
	}
	public static GlobalElementInSystem_c GlobalElementInSystemInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return GlobalElementInSystemInstance(modelRoot, test, true);
	}

	public static GlobalElementInSystem_c GlobalElementInSystemInstance(
			ModelRoot modelRoot) {
		return GlobalElementInSystemInstance(modelRoot, null, true);
	}

	public static GlobalElementInSystem_c[] GlobalElementInSystemInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(GlobalElementInSystem_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				GlobalElementInSystem_c x = (GlobalElementInSystem_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					matches.add(x);
				}
			}
			if (matches.size() > 0) {
				GlobalElementInSystem_c[] ret_set = new GlobalElementInSystem_c[matches
						.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new GlobalElementInSystem_c[0];
			}
		}
	}
	public static GlobalElementInSystem_c[] GlobalElementInSystemInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return GlobalElementInSystemInstances(modelRoot, test, true);
	}
	public static GlobalElementInSystem_c[] GlobalElementInSystemInstances(
			ModelRoot modelRoot) {
		return GlobalElementInSystemInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Global Element in System.dispose call: ";
		PackageableElement_c testR9100Inst = PackageableElement_c
				.getOnePE_PEOnR9100(this, false);

		if (testR9100Inst != null) {
			delete_error = true;
			errorMsg = errorMsg + "9100 ";
		}

		SystemModel_c testR9100InstOth = SystemModel_c.getOneS_SYSOnR9100(this,
				false);

		if (testR9100InstOth != null) {
			delete_error = true;
			errorMsg = errorMsg + "9100 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log.println(ILogger.DELETE,
						"Global Element in System", errorMsg);
			} else {
				Exception e = new Exception();
				e.fillInStackTrace();
				CorePlugin.logError(errorMsg, e);
			}
		}
		return result;
	}

	// end declare instance pool

	// declare attribute accessors
	public boolean isUUID(String attributeName) {
		if (attributeName.equals("element_id")) {
			return true;
		}
		if (attributeName.equals("sys_id")) {
			return true;
		}
		return false;
	}
	// declare attribute accessors
	public long getElement_idLongBased() {
		if (PackageableElement != null) {
			return PackageableElement.getElement_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getElement_id() {
		if (PackageableElement != null) {
			return PackageableElement.getElement_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getElement_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_element_id))
			return m_element_id;
		else
			return getElement_id();
	}

	public void setElement_id(java.util.UUID newValue) {
		if (newValue != null) {
			if (newValue.equals(m_element_id)) {
				return;
			}
		} else if (m_element_id != null) {
			if (m_element_id.equals(newValue)) {
				return;
			}
		} else {
			return;
		}
		AttributeChangeModelDelta change = new AttributeChangeModelDelta(
				Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this,
				"Element_id", m_element_id, newValue, false);
		m_element_id = IdAssigner.preprocessUUID(newValue);
		Ooaofooa.getDefaultInstance().fireModelElementAttributeChanged(change);
	}
	public long getSys_idLongBased() {
		if (SystemModel != null) {
			return SystemModel.getSys_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getSys_id() {
		if (SystemModel != null) {
			return SystemModel.getSys_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getSys_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_sys_id))
			return m_sys_id;
		else
			return getSys_id();
	}

	public void setSys_id(java.util.UUID newValue) {
		if (newValue != null) {
			if (newValue.equals(m_sys_id)) {
				return;
			}
		} else if (m_sys_id != null) {
			if (m_sys_id.equals(newValue)) {
				return;
			}
		} else {
			return;
		}
		AttributeChangeModelDelta change = new AttributeChangeModelDelta(
				Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this,
				"Sys_id", m_sys_id, newValue, false);
		m_sys_id = IdAssigner.preprocessUUID(newValue);
		Ooaofooa.getDefaultInstance().fireModelElementAttributeChanged(change);
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Global Element in System", //$NON-NLS-1$
						" Operation entered: Global Element in System::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		GlobalElementInSystem_c[] objs = GlobalElementInSystem_c
				.GlobalElementInSystemInstances(modelRoot, null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Global Element in System", //$NON-NLS-1$
						" Operation entered: Global Element in System::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class GlobalElementInSystem_c_test40360_c
				implements
					ClassQueryInterface_c {
			GlobalElementInSystem_c_test40360_c(java.util.UUID p40361,
					java.util.UUID p40362) {
				m_p40361 = p40361;
				m_p40362 = p40362;
			}
			private java.util.UUID m_p40361;
			private java.util.UUID m_p40362;
			public boolean evaluate(Object candidate) {
				GlobalElementInSystem_c selected = (GlobalElementInSystem_c) candidate;
				boolean retval = false;
				retval = (selected.getElement_id().equals(m_p40361))
						& (selected.getSys_id().equals(m_p40362));
				return retval;
			}
		}

		GlobalElementInSystem_c[] objs40359 = GlobalElementInSystem_c
				.GlobalElementInSystemInstances(modelRoot,
						new GlobalElementInSystem_c_test40360_c(
								getElement_id(), getSys_id()));

		if (((objs40359.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Global Element in System", //$NON-NLS-1$
								"Consistency: Object: Global Element in System: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs40359.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Global Element in System: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs40359.length), e);
			}
			retval = false;

		}

		if (((objs40359.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Global Element in System", //$NON-NLS-1$
								"Consistency: Object: Global Element in System: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs40359.length)
										+ " Element_ID: " + "Not Printable" + " Sys_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Global Element in System: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs40359.length)
										+ " Element_ID: " + "Not Printable" + " Sys_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Global Element in System is a link class in association: rel.Numb = 9100
		// Other side
		return retval;
	}

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Global Element in System