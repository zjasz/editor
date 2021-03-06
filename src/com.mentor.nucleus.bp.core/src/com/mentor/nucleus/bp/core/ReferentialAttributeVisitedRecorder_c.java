      
package com.mentor.nucleus.bp.core ;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.ReferentialAttributeVisitedRecorder_c.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================

// No special imports
import java.util.* ;
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
abstract class EV_REFERENTIAL_ATTRIBUTE_VISITED_RECORDER extends genericEvent_c 
{
  public abstract int getEvtcode() ;
}

public class ReferentialAttributeVisitedRecorder_c extends NonRootModelElement implements IAdaptable, Cloneable
{
  // Public Constructors
  public ReferentialAttributeVisitedRecorder_c(ModelRoot modelRoot)
  {
    super(modelRoot);
     m_recorderid = idAssigner.createUUID();
    setUniqueId(m_recorderid);
  }




  public boolean equals (Object elem) {
     if (!(elem instanceof ReferentialAttributeVisitedRecorder_c)) {
         return false;
     }
	    // check that the model-roots are the same
    	if (((NonRootModelElement)elem).getModelRoot() != getModelRoot()) {
    		return false;
    	}
    	
     return identityEquals(elem);
  }
  
   public boolean identityEquals(Object elem) {
       if (!(elem instanceof ReferentialAttributeVisitedRecorder_c)) {
           return false;
       }
       
       ReferentialAttributeVisitedRecorder_c me = (ReferentialAttributeVisitedRecorder_c)elem;
      // don't allow an empty id-value to produce a false positive result;
      // in this case, use whether the two instances are actually the same 
      // one in memory, instead
      if ((IdAssigner.NULL_UUID.equals(getRecorderid()) || IdAssigner.NULL_UUID.equals(((ReferentialAttributeVisitedRecorder_c)elem).getRecorderid())) && this != elem) {
      	return false;
      }
      if (!getRecorderid().equals(((ReferentialAttributeVisitedRecorder_c)elem).getRecorderid())) return false;
      return true;
    }

   public boolean cachedIdentityEquals(Object elem) {
       if (!(elem instanceof ReferentialAttributeVisitedRecorder_c)) {
           return false;
       }
       
       ReferentialAttributeVisitedRecorder_c me = (ReferentialAttributeVisitedRecorder_c)elem;
      if (!getRecorderid().equals(((ReferentialAttributeVisitedRecorder_c)elem).getRecorderid())) return false;
      return true;
    }


  // Attributes
  private java.util.UUID         m_recorderid ;
  private long m_recorderidLongBased ;

// declare associations referring to this class

    
  
  
// referred to navigation

ArrayList<ReferentialAttribute_c> backPointer_VisitedReferentialAttributeVisited_R119 = new ArrayList<ReferentialAttribute_c>();

public void setReferentialAttributeOrderInChildListR119(ReferentialAttribute_c target, int index) {
	unrelateAcrossR119From(target);
	ReferentialAttribute_c[] elements = ReferentialAttribute_c.getManyO_RATTRsOnR119(this);
	int count = 0;
	for(int i = 0; i < elements.length; i++) {
		if(count >= index) {
			unrelateAcrossR119From((ReferentialAttribute_c) elements[i]); 
		}
		count++;
	}
	relateAcrossR119To(target);
	count = 0;
	for(int i = 0; i < elements.length; i++) {
		if(count >= index) {
			relateAcrossR119To((ReferentialAttribute_c) elements[i]);
		}
		count++;
	}
}

public void relateAcrossR119To(ReferentialAttribute_c target)
{
  if (target != null) {
    target.relateAcrossR119To(this, true) ;
  }
}

public void relateAcrossR119To(ReferentialAttribute_c target, boolean notifyChanges)
{
  if (target != null) {
    target.relateAcrossR119To(this, notifyChanges) ;
  }
}

public void setBackPointerR119To(ReferentialAttribute_c target)
{
  	synchronized (backPointer_VisitedReferentialAttributeVisited_R119) {
		backPointer_VisitedReferentialAttributeVisited_R119.add(target);
	}
}

public void unrelateAcrossR119From(ReferentialAttribute_c target)
{
  if (target != null) {
    target.unrelateAcrossR119From(this, true) ;
  }
}

public void unrelateAcrossR119From(ReferentialAttribute_c target, boolean notifyChanges)
{
  if (target != null) {
    target.unrelateAcrossR119From(this, notifyChanges) ;
  }
}

public void clearBackPointerR119To(ReferentialAttribute_c target)
{
  synchronized (backPointer_VisitedReferentialAttributeVisited_R119) {
	    backPointer_VisitedReferentialAttributeVisited_R119.remove(target);
	}
}

public static ReferentialAttributeVisitedRecorder_c getOneO_RAVROnR119(ReferentialAttribute_c [] targets)
{
    return getOneO_RAVROnR119(targets, null);
}

public static ReferentialAttributeVisitedRecorder_c getOneO_RAVROnR119(ReferentialAttribute_c [] targets, ClassQueryInterface_c test)
{
    return getOneO_RAVROnR119(targets, test, true);
}

public static ReferentialAttributeVisitedRecorder_c getOneO_RAVROnR119(ReferentialAttribute_c [] targets, ClassQueryInterface_c test, boolean loadComponent)
{
    ReferentialAttributeVisitedRecorder_c ret_val = null;
    if (targets != null)
    {
        for (int i = 0; i < targets.length && ret_val == null; ++i )
        {
           if (test != null) {
             ReferentialAttributeVisitedRecorder_c candidate_val = getOneO_RAVROnR119(targets[i],true);
             if ( candidate_val != null && test.evaluate(candidate_val) )
             {
               ret_val = candidate_val;
               break;
             }
           }
           else {
             ret_val = getOneO_RAVROnR119(targets[i], loadComponent);
             if (ret_val != null) {
               break;
             }
           }
        }
    }
    return ret_val;
}

public static ReferentialAttributeVisitedRecorder_c getOneO_RAVROnR119(ReferentialAttribute_c target)
{
	return getOneO_RAVROnR119(target, true);
}
public static ReferentialAttributeVisitedRecorder_c getOneO_RAVROnR119(ReferentialAttribute_c target, boolean loadComponent)
{
  if (target != null) {
    return target.ReferentialAttributeVisitedRecorder ;
  } else {
    return null;
  }
}

public static ReferentialAttributeVisitedRecorder_c [] getManyO_RAVRsOnR119(ReferentialAttribute_c [] targets,
    ClassQueryInterface_c test)
{
	return getManyO_RAVRsOnR119(targets, test, true);
}

public static ReferentialAttributeVisitedRecorder_c [] getManyO_RAVRsOnR119(ReferentialAttribute_c [] targets,
    ClassQueryInterface_c test, boolean loadComponent)
{
  if(targets == null || targets.length == 0 || targets[0] == null)
    return new ReferentialAttributeVisitedRecorder_c[0];
  
  
  LinkedHashSet<ReferentialAttributeVisitedRecorder_c> elementsSet = new LinkedHashSet<ReferentialAttributeVisitedRecorder_c>();
  for (int i = 0; i < targets.length; i++) {
    ReferentialAttributeVisitedRecorder_c associate = targets[i].ReferentialAttributeVisitedRecorder;
    if (targets[i] != null && associate != null
    	&& (test == null || test.evaluate(associate))) {
        	if (elementsSet.add(associate)){ 
            }
    }
  }

  ReferentialAttributeVisitedRecorder_c[] result = new ReferentialAttributeVisitedRecorder_c[elementsSet.size()];
  elementsSet.toArray(result);
  return result;
}

public static ReferentialAttributeVisitedRecorder_c [] getManyO_RAVRsOnR119(ReferentialAttribute_c [] targets)
{
  return getManyO_RAVRsOnR119(targets, null);
}

public static ReferentialAttributeVisitedRecorder_c [] getManyO_RAVRsOnR119(ReferentialAttribute_c target,
    ClassQueryInterface_c test, boolean loadComponent)
{
  if (target != null) {
    ReferentialAttribute_c [] targetArray = new ReferentialAttribute_c[1];
    targetArray[0] = target;
    return getManyO_RAVRsOnR119(targetArray, test, loadComponent);
  } else {
    ReferentialAttributeVisitedRecorder_c [] result = new ReferentialAttributeVisitedRecorder_c [0] ;
    return result ;
  }
  
}

public static ReferentialAttributeVisitedRecorder_c [] getManyO_RAVRsOnR119(ReferentialAttribute_c target,
    ClassQueryInterface_c test)
{
    return getManyO_RAVRsOnR119(target, null, true);
}

public static ReferentialAttributeVisitedRecorder_c [] getManyO_RAVRsOnR119(ReferentialAttribute_c target)
{
    return getManyO_RAVRsOnR119(target, null, true);
}

public static ReferentialAttributeVisitedRecorder_c [] getManyO_RAVRsOnR119(ReferentialAttribute_c target, boolean loadComponent)
{
    return getManyO_RAVRsOnR119(target, null, loadComponent);
}


      
  public void batchRelate(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots)
  {
      batchRelate(modelRoot, false, notifyChanges, searchAllRoots);
  }
  
  public void batchRelate(ModelRoot modelRoot, boolean relateProxies, boolean notifyChanges, boolean searchAllRoots)
  {
	}
  public void batchUnrelate(boolean notifyChanges)
  {
	}
  public static void batchRelateAll(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots) {
		batchRelateAll(modelRoot, notifyChanges, searchAllRoots, false);
  }	  
  public static void batchRelateAll(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots, boolean relateProxies)
  {
	    
      // class has no referential attributes
  
  }

  public static void clearInstances(ModelRoot modelRoot)
  {
    InstanceList instances = modelRoot.getInstanceList(ReferentialAttributeVisitedRecorder_c.class);
    synchronized(instances) {
       for(int i=instances.size()-1; i>=0; i--){
              ((NonRootModelElement)instances.get(i)).delete_unchecked();
       }
    
    }
  }

  public static ReferentialAttributeVisitedRecorder_c ReferentialAttributeVisitedRecorderInstance(ModelRoot modelRoot, ClassQueryInterface_c test, boolean loadComponent)
  {
  		ReferentialAttributeVisitedRecorder_c result=findReferentialAttributeVisitedRecorderInstance(modelRoot,test,loadComponent);
	  return result;  
  }
private static ReferentialAttributeVisitedRecorder_c findReferentialAttributeVisitedRecorderInstance(ModelRoot modelRoot, ClassQueryInterface_c test, boolean loadComponent)
{
	InstanceList instances = modelRoot.getInstanceList(ReferentialAttributeVisitedRecorder_c.class);
		synchronized (instances) {
            for (int i = 0; i < instances.size(); ++i) {
				ReferentialAttributeVisitedRecorder_c x = (ReferentialAttributeVisitedRecorder_c) instances.get(i);
				if (test==null || test.evaluate(x)){
					return x;
			}
		}
		}
			return null;
}
  public static ReferentialAttributeVisitedRecorder_c ReferentialAttributeVisitedRecorderInstance(ModelRoot modelRoot, ClassQueryInterface_c test){
     return ReferentialAttributeVisitedRecorderInstance(modelRoot,test,true);
  }
  
  public static ReferentialAttributeVisitedRecorder_c ReferentialAttributeVisitedRecorderInstance(ModelRoot modelRoot)
  {
	 return ReferentialAttributeVisitedRecorderInstance(modelRoot,null,true);
  }

  public static ReferentialAttributeVisitedRecorder_c [] ReferentialAttributeVisitedRecorderInstances(ModelRoot modelRoot, ClassQueryInterface_c test, boolean loadComponent)
  {	
		    InstanceList instances = modelRoot.getInstanceList(ReferentialAttributeVisitedRecorder_c.class);
			Vector matches = new Vector();
			synchronized (instances) {
                for (int i = 0; i < instances.size(); ++i) {
					ReferentialAttributeVisitedRecorder_c x = (ReferentialAttributeVisitedRecorder_c) instances.get(i);
					if (test==null ||test.evaluate(x)){
						matches.add(x);
			    }
				}
			if (matches.size() > 0) {
				ReferentialAttributeVisitedRecorder_c[] ret_set = new ReferentialAttributeVisitedRecorder_c[matches.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new ReferentialAttributeVisitedRecorder_c[0];
			}		
		} 
  }
  public static ReferentialAttributeVisitedRecorder_c [] ReferentialAttributeVisitedRecorderInstances(ModelRoot modelRoot, ClassQueryInterface_c test){
    return  ReferentialAttributeVisitedRecorderInstances(modelRoot,test,true);
  }
  public static ReferentialAttributeVisitedRecorder_c [] ReferentialAttributeVisitedRecorderInstances(ModelRoot modelRoot)
  {
	return ReferentialAttributeVisitedRecorderInstances(modelRoot,null,true);
  }

  public boolean delete()
  {
    boolean result = super.delete();
	boolean delete_error = false;
	String errorMsg = "The following relationships were not torn down by the Referential Attribute Visited Recorder.dispose call: ";
	ReferentialAttribute_c testR119Inst = ReferentialAttribute_c.getOneO_RATTROnR119(this, false);

	if ( testR119Inst != null )
	{
	delete_error = true;
	errorMsg = errorMsg + "119 ";	
	}
	if(delete_error == true) {

		if(CorePlugin.getDefault().isDebugging()) {
			Ooaofooa.log.println(ILogger.DELETE, "Referential Attribute Visited Recorder", errorMsg);
		}
		else {
			Exception e = new Exception();
            e.fillInStackTrace();
			CorePlugin.logError(errorMsg, e);
		}
	}
	return result;
  }

	/**
	 * Assigns IDs to instances of this class.
	 */
    private static IdAssigner idAssigner = new IdAssigner();
    
	/**
	 * See field.
	 */
    public IdAssigner getIdAssigner() {return idAssigner;}

	/**
	 * See field.
	 */
    public static IdAssigner getIdAssigner_() {return idAssigner;}
  // end declare instance pool

  // declare attribute accessors
  public boolean isUUID(String attributeName){
      if(attributeName.equals("recorderid")){
         return true;
      }
      return false;      
  }      
  // declare attribute accessors
  public long getRecorderidLongBased()
  {
    if(m_recorderidLongBased == 0 && !IdAssigner.NULL_UUID.equals(m_recorderid)){
    	return 0xfffffff & m_recorderid.getLeastSignificantBits();
    }
    return m_recorderidLongBased ;
  }
  public java.util.UUID getRecorderid()
  {
    return m_recorderid ;
  }


  public void setRecorderid(java.util.UUID newValue)
  {
   m_recorderid = IdAssigner.preprocessUUID(newValue);
  }
  // end declare accessors
  public static void checkClassConsistency (ModelRoot modelRoot) {
    Ooaofooa.log.println(
	  ILogger.OPERATION,
	  "Referential Attribute Visited Recorder", //$NON-NLS-1$
	  " Operation entered: Referential Attribute Visited Recorder::checkClassConsistency"); //$NON-NLS-1$
     if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) {  //$NON-NLS-1$
       return;
     }
     ReferentialAttributeVisitedRecorder_c [] objs = ReferentialAttributeVisitedRecorder_c.ReferentialAttributeVisitedRecorderInstances(modelRoot,null,false); 
     
     for ( int i = 0; i < objs.length; i++) {
       objs[i].checkConsistency();
     }  
  } 
  public boolean checkConsistency () {
    Ooaofooa.log.println(
	  ILogger.OPERATION,
	  "Referential Attribute Visited Recorder", //$NON-NLS-1$
	  " Operation entered: Referential Attribute Visited Recorder::checkConsistency");  //$NON-NLS-1$
    if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) {  //$NON-NLS-1$
      return true;
    }
	ModelRoot modelRoot = getModelRoot();
    boolean      retval = true;
    class ReferentialAttributeVisitedRecorder_c_test38011_c implements ClassQueryInterface_c
    {
	  ReferentialAttributeVisitedRecorder_c_test38011_c( java.util.UUID            p38012 ) {
	  m_p38012 = p38012;
	  }
	  private java.util.UUID             m_p38012; 
	  public boolean evaluate (Object candidate)
	  {
	      ReferentialAttributeVisitedRecorder_c selected = (ReferentialAttributeVisitedRecorder_c) candidate;
	      boolean retval = false;
	      retval = (selected.getRecorderid().equals(m_p38012));
	      return retval;
	  }
    }

    ReferentialAttributeVisitedRecorder_c [] objs38010 = 
    ReferentialAttributeVisitedRecorder_c.ReferentialAttributeVisitedRecorderInstances(modelRoot, new ReferentialAttributeVisitedRecorder_c_test38011_c(getRecorderid())) ;

    if ( (  (objs38010.length) == 0) )
    {

      if (CorePlugin.getDefault().isDebugging()){
          Ooaofooa.log.println(ILogger.CONSISTENCY, "Referential Attribute Visited Recorder", //$NON-NLS-1$
           "Consistency: Object: Referential Attribute Visited Recorder: Cardinality of an identifier is zero. " //$NON-NLS-1$
           + "Actual Value: " + Integer.toString( objs38010.length ) ); //$NON-NLS-1$
      }
      else {
          Exception e = new Exception();
          CorePlugin.logError("Consistency: Object: Referential Attribute Visited Recorder: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
          + "Actual Value: " //$NON-NLS-1$
          + Integer.toString( objs38010.length )  , e); 
      }
      retval = false;

    }

    if ( (  (objs38010.length) > 1) )
    {

      if (CorePlugin.getDefault().isDebugging()){
          Ooaofooa.log.println(ILogger.CONSISTENCY, "Referential Attribute Visited Recorder", //$NON-NLS-1$
           "Consistency: Object: Referential Attribute Visited Recorder: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
           + "Actual Value: " //$NON-NLS-1$ 
           + Integer.toString( objs38010.length )  + " recorderId: " + "Not Printable" ); //$NON-NLS-1$
      }
      else {
          Exception e = new Exception();
          CorePlugin.logError("Consistency: Object: Referential Attribute Visited Recorder: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
          + "Actual Value: " //$NON-NLS-1$
          + Integer.toString( objs38010.length )  + " recorderId: " + "Not Printable" , e); //$NON-NLS-1$
      }
      retval = false;

    }

          // Referential Attribute Visited Recorder is a participating class in association: rel.Numb = 119
             // Object: Referential Attribute
    return retval;
  }


  // declare transform functions
  public  void Setalltonotvisited()
  {
      Ooaofooa.log.println(ILogger.OPERATION, "Referential Attribute Visited Recorder", " Operation entered: ReferentialAttributeVisitedRecorder::Setalltonotvisited") ; 
               final ModelRoot modelRoot = getModelRoot();
ReferentialAttribute_c [] v_attributes = ReferentialAttribute_c.getManyO_RATTRsOnR119(this);


ReferentialAttribute_c  v_attribute = null;
for ( int i36510 = 0; i36510 < v_attributes.length; i36510++)
{
  v_attribute = v_attributes[i36510] ;

if (v_attribute != null) {
v_attribute.unrelateAcrossR119From(this);
}
else {
  Throwable t = new Throwable();
  t.fillInStackTrace();
  CorePlugin.logError("Unrelate attempted on null left hand instance.", t);
}



}


   } // End setAllToNotVisited
  public  boolean      Areanyvisited()
  {
      Ooaofooa.log.println(ILogger.OPERATION, "Referential Attribute Visited Recorder", " Operation entered: ReferentialAttributeVisitedRecorder::Areanyvisited") ; 
               final ModelRoot modelRoot = getModelRoot();
ReferentialAttribute_c v_attribute = ReferentialAttribute_c.getOneO_RATTROnR119(this);


return   (v_attribute != null);



   } // End areAnyVisited

  // end transform functions


  public Object getAdapter(Class adapter) {
    Object superAdapter = super.getAdapter(adapter);
    if(superAdapter != null) {
    	return superAdapter;
    }
	  return null;
  }
} // end Referential Attribute Visited Recorder
