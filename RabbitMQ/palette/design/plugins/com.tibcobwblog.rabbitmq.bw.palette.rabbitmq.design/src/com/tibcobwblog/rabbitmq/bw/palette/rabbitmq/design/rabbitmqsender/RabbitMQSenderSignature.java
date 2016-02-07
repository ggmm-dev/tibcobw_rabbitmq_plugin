package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.design.rabbitmqsender;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xsd.XSDElementDeclaration;

import com.tibco.bw.design.api.BWActivitySignature;
import com.tibco.bw.design.util.XSDUtility;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.design.RabbitMQExceptionsSchema;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl.RabbitMQSenderImpl;
import com.tibco.bw.model.activityconfig.ConfigProperty;
import com.tibco.bw.model.activityconfig.Configuration;
/**
 * <!-- begin-custom-doc -->
 * 
 * <!-- end-custom-doc -->
 * @generated
 * 
 */
public class RabbitMQSenderSignature extends BWActivitySignature 
{
	
	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * By default all activities have input.
	 * 
	 * Return false if activity doesn't want a InputTab.
	 *
	 * @return
	 */
    @Override
    public boolean hasInput() {
    	// begin-custom-code
        // end-custom-code
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
	* Method to return the input element declaration of this activity.
	* @param config
	*			activity configuration
	* @return the input element declaration
	*/
    @Override
    public XSDElementDeclaration getInputType(final Configuration config) {
            XSDElementDeclaration inputType = null;
            inputType =  RabbitMQSenderSchema.getInputType(); 
            // begin-custom-code
            EList<ConfigProperty> props = config.getProperties();
            if (props != null && props.size() > 0) {
                com.tibco.bw.model.activityconfig.impl.EMFPropertyImpl p1 = (com.tibco.bw.model.activityconfig.impl.EMFPropertyImpl) props
                        .get(0);
                RabbitMQSenderImpl rabbitMqSender = (RabbitMQSenderImpl) p1.getValue();
                if (rabbitMqSender != null) {
                    XSDElementDeclaration message = getChildElement(inputType, "message",
                            false);
                    if (message != null) {
                        if (!"String".equals(rabbitMqSender.getInputStyle())) {
                            message.setTypeDefinition(XSDUtility
                                    .getSimpleTypeDefinition("base64Binary"));
                        } else {
                            message.setTypeDefinition(XSDUtility
                                    .getSimpleTypeDefinition("string"));
                        }
                    }
                }
        } 
        // end-custom-code
        return inputType;
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
        outPutType =  RabbitMQSenderSchema.getOutputType();
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
        faultType =  RabbitMQExceptionsSchema.getRabbitMQPluginFaultTypes();
        // begin-custom-code
        // end-custom-code
		return faultType;
    }
}
