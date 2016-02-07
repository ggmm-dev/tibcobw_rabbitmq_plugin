package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.design.rabbitmqsender;

import org.eclipse.emf.ecore.EObject;
import com.tibco.bw.design.api.BWAbstractModelHelper;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitmqFactory;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQSender;

public class RabbitMQSenderModelHelper extends BWAbstractModelHelper 

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
        RabbitMQSender activity = RabbitmqFactory.eINSTANCE.createRabbitMQSender();
        activity.setInputStyle("String");
        // begin-custom-code
        // end-custom-code
        return activity;
    }
}
