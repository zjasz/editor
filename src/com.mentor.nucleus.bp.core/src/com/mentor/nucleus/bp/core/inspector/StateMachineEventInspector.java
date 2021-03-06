package com.mentor.nucleus.bp.core.inspector;
//======================================================================
//
// File: com/mentor/nucleus/bp/core/inspector/StateMachineEventInspector.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_object_inspector.inc
// Version:      $Revision: 1.23 $
//
// (c) Copyright 2004-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================
//
// This class is responsible for decoupling the client model entity
// class StateMachineEvent_c from the traversal mechanisms that it provides to
// model diff.
//
import com.mentor.nucleus.bp.core.*;

import org.eclipse.swt.graphics.Image;

import com.mentor.nucleus.bp.core.sorter.MetadataSortingManager;
import java.util.*;

/**
 * This file adapts the meta-model entity; 'StateMachineEvent_c' to provide 
 * support of traversing to its children and parents.
 * <p>
 * Do not edit this class, it was created using the Mentor Graphics
 * MC-Java code generator product.
 * </p>
 */
public class StateMachineEventInspector extends BaseModelClassInspector {

  private String parentAssoc;
  
  public StateMachineEventInspector(MetadataSortingManager sortingManager){
    super(sortingManager);
  }

  /**
   * @see IModelClassInspector#getParent(Object)
   * Returns the parent(s) of this node
   */
  public Object getParent(Object arg) {
    InstanceStateMachine_c result1 = InstanceStateMachine_c.getOneSM_ISMOnR517(StateMachine_c.getOneSM_SMOnR502(StateMachineEvent_c.getOneSM_EVTOnR525(SemEvent_c.getOneSM_SEVTOnR526(LocalEvent_c.getOneSM_LEVTOnR526(SemEvent_c.getOneSM_SEVTOnR525((StateMachineEvent_c)arg))))));
     if (result1 != null) {
        return result1;
    }               
    InstanceStateMachine_c result2 = InstanceStateMachine_c.getOneSM_ISMOnR517(StateMachine_c.getOneSM_SMOnR502(StateMachineEvent_c.getOneSM_EVTOnR525(PolymorphicEvent_c.getOneSM_PEVTOnR525((StateMachineEvent_c)arg))));
     if (result2 != null) {
        return result2;
    }               
    ClassStateMachine_c result3 = ClassStateMachine_c.getOneSM_ASMOnR517(StateMachine_c.getOneSM_SMOnR502((StateMachineEvent_c)arg));
     if (result3 != null) {
        return result3;
    }               
        return null;    //No parent found           
  }
  	  
  /**
   * @see IModelClassInspector#getChildRelations(Object)
   * Returns the children of this node
   */
  public ObjectElement[] getChildRelations(Object arg) {
    int resultSize = 0;
    StateMachineEventDataItem_c [] v_eventdata = 
StateMachineEventDataItem_c.getManySM_EVTDIsOnR532(
(StateMachineEvent_c)arg)
;



    sort(v_eventdata);
    PolymorphicEvent_c [] v_polymorphicevent = 
PolymorphicEvent_c.getManySM_PEVTsOnR525(
(StateMachineEvent_c)arg)
;



    sort(v_polymorphicevent);
    SemEvent_c [] v_event = 
SemEvent_c.getManySM_SEVTsOnR525(
(StateMachineEvent_c)arg)
;



    sort(v_event);
    List<ObjectElement> result = new ArrayList<ObjectElement> ();
    for (int i = 0 ; i < v_eventdata.length ; i++) {   
        result.add(new ObjectElement("v_eventdata", ObjectElement.RELATION_ROLE_ELEMENT, v_eventdata[i], arg, false));
    }
    for (int i = 0 ; i < v_polymorphicevent.length ; i++) {   
        result.add(new ObjectElement("v_polymorphicevent", ObjectElement.RELATION_ROLE_ELEMENT, v_polymorphicevent[i], arg, false));
    }
    for (int i = 0 ; i < v_event.length ; i++) {   
        result.add(new ObjectElement("v_event", ObjectElement.RELATION_ROLE_ELEMENT, v_event[i], arg, false));
    }
    return result.toArray(new ObjectElement[result.size()]);
  }
  /**
   * @see IModelClassInspector#hasChildren(Object)
   * Returns true if this node has any children
   */
  public boolean hasChildRelations(Object arg) {
    StateMachineEventDataItem_c [] v_eventdata = 
StateMachineEventDataItem_c.getManySM_EVTDIsOnR532(
(StateMachineEvent_c)arg)
;



    if (v_eventdata.length > 0) return true;
    PolymorphicEvent_c [] v_polymorphicevent = 
PolymorphicEvent_c.getManySM_PEVTsOnR525(
(StateMachineEvent_c)arg)
;



    if (v_polymorphicevent.length > 0) return true;
    SemEvent_c [] v_event = 
SemEvent_c.getManySM_SEVTsOnR525(
(StateMachineEvent_c)arg)
;



    if (v_event.length > 0) return true;
    return false;
  }
  
  public Object[] getReferentialDetails(Class<?> referentialClass, Object arg) {
  	Object[] details = new Object[4];
	return details;
  }
  
  /**
  * @seee IModelClassInspector#getReferentials(Object)
  * Returns the an array of Role Objects specifying the referenctial attibutes of
  * this model element
  * Role Name: <T_TPS.NameOnly>
  * Role Value: <Chain_result>
  * Role Type: "Referential"
  */
  public ObjectElement[] getReferentials(Object arg) {
     List<ObjectElement> referentials = new ArrayList<ObjectElement>();
    return referentials.toArray(new ObjectElement [referentials.size()]);        
  }

  /**
  * @seee IModelClassInspector#getAttributes(Object)
  * Returns the an array of Role objects that give the attibutes of the model 
  * element it self e.g.
  * Role Name: "Name"
  * Role Value: metaModelElement.getName()
  * Role Type: "Primitive"
  */
  public ObjectElement[] getAttributes(Object arg) {
    ObjectElement attrSet[] = new ObjectElement[9];
      attrSet[0] = new ObjectElement("Numb", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getNumb"), arg, "getNumb", true);
      attrSet[1] = new ObjectElement("Mning", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getMning"), arg, "getMning", true);
      attrSet[2] = new ObjectElement("Is_Lbl_U", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getIs_lbl_u"), arg, "getIs_lbl_u", true);
      attrSet[3] = new ObjectElement("Unq_Lbl", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getUnq_lbl"), arg, "getUnq_lbl", true);
      attrSet[4] = new ObjectElement("Drv_Lbl", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getDrv_lbl"), arg, "getDrv_lbl", true);
      attrSet[4].setDerived();
      attrSet[5] = new ObjectElement("Descrip", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getDescrip"), arg, "getDescrip", true);
    ObjectElement compAttrSet[] = new ObjectElement[6];    
    for (int i = 0; i < 6 ; i++) {
        compAttrSet[i] = attrSet[i];
    }
    return compAttrSet;
  }

    /**
     * Return configured image if none exists for the element type
     */
    public Image getImage(Object element) {
		Image image = CorePlugin.getImageFor(element, false);
		if(image != null) {
			return image;
		}
		return CorePlugin.getImageFor("Event.gif");
	}
    }       

