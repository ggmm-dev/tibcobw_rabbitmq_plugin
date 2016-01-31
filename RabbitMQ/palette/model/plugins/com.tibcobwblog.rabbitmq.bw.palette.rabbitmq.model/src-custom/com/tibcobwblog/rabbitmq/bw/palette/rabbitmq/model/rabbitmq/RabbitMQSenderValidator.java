package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq;

import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQSender;
import com.tibco.bw.validation.process.ActivityConfigurationValidator;
import com.tibco.bw.validation.process.ActivityValidationContext;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitmqPackage;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.utils.Messages;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.utils.MessageCode;
import org.eclipse.osgi.util.NLS;

public class RabbitMQSenderValidator implements ActivityConfigurationValidator {	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * Validates Activity model configuration.
	 * @param context
	 *			The activity validation context.Developers can retrieve following informations:
	 *          <li> Activity Configuration Model(EMF model)</li>
 	 *          <li> Name of the EventSource Activity</li>
     *          <li> Value of process property used in Activity Configuration</li>
     *          <li> Name of property configured in the Attribute Binding Field</li>
     *          <li> Name of the process</li><br>
	 */	
	@Override
	public void validateBWActivityConfiguration(ActivityValidationContext context) {
	    RabbitMQSender model =(RabbitMQSender) context.getActivityConfigurationModel();    	
		
	    String portModul = context.getAttributeBindingPropertyName("port");
		if(portModul == null || "".equals(portModul)){
		    String port = model.getPort(); 
		    if(port == null || "".equals(port)) {
		        String message = ""; //$NON-NLS-1$
		        message = NLS.bind(Messages.PALETTE_PARAMETER_VALUE_INVALID, new String[] {"Port"});
		        context.createError(message, null, MessageCode.PARAMETER_NOT_SPECIFIED, RabbitmqPackage.Literals.RABBIT_MQ_SENDER__PORT);
		    }
		}
	    String hostModul = context.getAttributeBindingPropertyName("host");
		if(hostModul == null || "".equals(hostModul)){
		    String host = model.getHost(); 
		    if(host == null || "".equals(host)) {
		        String message = ""; //$NON-NLS-1$
		        message = NLS.bind(Messages.PALETTE_PARAMETER_VALUE_INVALID, new String[] {"Host"});
		        context.createError(message, null, MessageCode.PARAMETER_NOT_SPECIFIED, RabbitmqPackage.Literals.RABBIT_MQ_SENDER__HOST);
		    }
		}	
		// begin-custom-code
	    // end-custom-code
  	}
}
