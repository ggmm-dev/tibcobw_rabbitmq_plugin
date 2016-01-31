package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.design.rabbitmqreceiver;

import java.util.List;

import org.eclipse.xsd.XSDElementDeclaration;
import com.tibco.bw.design.api.BWEventSourceSignature;
import com.tibco.bw.model.activityconfig.Configuration;
/**
 * <!-- begin-custom-doc -->
 * 
 * <!-- end-custom-doc -->
 * @generated
 * 
 */
public class RabbitMQReceiverSignature extends BWEventSourceSignature 
{
 
 	/**
 	 * <!-- begin-custom-doc -->
     * 
     * <!-- end-custom-doc -->
     * @generated
     *
     * Method to identify if an activity performs an action that can be confirmed by the Confirm activity.
     * 
     * @return true for activities that can be confirmed or false (default) for activities that cannot be confirmed
     */
    public boolean isConfirmable() { 
    	return true; 
    }
    
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * By default all activities have output.
	 * 
	 * Return false if activity doesn't want a OutputTab.
	 * 
	 * @return
	 */
    @Override
    public boolean hasOutput() {
    	// begin-custom-code
        // end-custom-code
        return true;
    } 
   /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*
	* Method to return the output element declaration of this activity.
	* @param config
	*			activity configuration
	* @return the output element declaration
	*/
    @Override
    public XSDElementDeclaration getOutputType(final Configuration config) {
        XSDElementDeclaration outPutType = null;
        outPutType =  RabbitMQReceiverSchema.getOutputType();
        // begin-custom-code
        // end-custom-code
        return outPutType;
    }

    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Method to return the list of fault element declarations that this activity may throw.
	 * @param config
	 *            current configuration of the activity, in case the faults depend on how the activity is current configured
	 * @return list of elements or an empty list if none
	 */
    @Override
    public List<XSDElementDeclaration> getFaultTypes(final Configuration config) {
    	List<XSDElementDeclaration> faultType = null;
        // begin-custom-code
        // end-custom-code
		return faultType;
    }
}
