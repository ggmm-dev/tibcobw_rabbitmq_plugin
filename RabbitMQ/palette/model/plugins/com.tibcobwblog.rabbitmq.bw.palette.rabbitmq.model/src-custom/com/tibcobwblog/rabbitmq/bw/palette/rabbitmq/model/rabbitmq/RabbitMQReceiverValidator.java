package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq;

import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQReceiver;
import com.tibco.bw.validation.process.EventSourceConfigurationValidator;
import com.tibco.bw.validation.exception.ValidationException;
import com.tibco.bw.validation.process.EventSourceValidationContext;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitmqPackage;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.utils.Messages;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.utils.MessageCode;
import org.eclipse.osgi.util.NLS;

public class RabbitMQReceiverValidator implements EventSourceConfigurationValidator {	
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
	public void validateBWEventSourceConfiguration(EventSourceValidationContext context) throws ValidationException {
		RabbitMQReceiver model =(RabbitMQReceiver) context.getEventSourceConfigurationModel();    	
		
	    String portModul = context.getAttributeBindingPropertyName("port");
		if(portModul == null || "".equals(portModul)){
		    String port = model.getPort(); 
		    if(port == null || "".equals(port)) {
		        String message = ""; //$NON-NLS-1$
		        message = NLS.bind(Messages.PALETTE_PARAMETER_VALUE_INVALID, new String[] {"Port"});
		        context.createError(message, null, MessageCode.PARAMETER_NOT_SPECIFIED, RabbitmqPackage.Literals.RABBIT_MQ_RECEIVER__PORT);
		    }
		}
	    String queueModul = context.getAttributeBindingPropertyName("queue");
		if(queueModul == null || "".equals(queueModul)){
		    String queue = model.getQueue(); 
		    if(queue == null || "".equals(queue)) {
		        String message = ""; //$NON-NLS-1$
		        message = NLS.bind(Messages.PALETTE_PARAMETER_VALUE_INVALID, new String[] {"Queue"});
		        context.createError(message, null, MessageCode.PARAMETER_NOT_SPECIFIED, RabbitmqPackage.Literals.RABBIT_MQ_RECEIVER__QUEUE);
		    }
		}
	    String hostModul = context.getAttributeBindingPropertyName("host");
		if(hostModul == null || "".equals(hostModul)){
		    String host = model.getHost(); 
		    if(host == null || "".equals(host)) {
		        String message = ""; //$NON-NLS-1$
		        message = NLS.bind(Messages.PALETTE_PARAMETER_VALUE_INVALID, new String[] {"Host"});
		        context.createError(message, null, MessageCode.PARAMETER_NOT_SPECIFIED, RabbitmqPackage.Literals.RABBIT_MQ_RECEIVER__HOST);
		    }
		}	
		// begin-custom-code
	    // end-custom-code
  	}
}
