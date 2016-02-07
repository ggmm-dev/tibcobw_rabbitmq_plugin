package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.design.rabbitmqreceiver;

import org.eclipse.emf.ecore.EObject;
import com.tibco.bw.design.api.BWAbstractModelHelper;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitmqFactory;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQReceiver;

public class RabbitMQReceiverModelHelper extends BWAbstractModelHelper 

{

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Create an instance of the activity configuration model and provide "good" default values.
	 *
	 * @return new instance
	 */
    @Override
    public EObject createInstance() {
        RabbitMQReceiver activity = RabbitmqFactory.eINSTANCE.createRabbitMQReceiver();
        activity.setInputStyle("String;Binary");
        // begin-custom-code
        // end-custom-code
        return activity;
    }
}
