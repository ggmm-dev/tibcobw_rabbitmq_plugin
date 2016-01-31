/**
 */
package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl;

import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RabbitmqFactoryImpl extends EFactoryImpl implements RabbitmqFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RabbitmqFactory init() {
		try {
			RabbitmqFactory theRabbitmqFactory = (RabbitmqFactory)EPackage.Registry.INSTANCE.getEFactory(RabbitmqPackage.eNS_URI);
			if (theRabbitmqFactory != null) {
				return theRabbitmqFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RabbitmqFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RabbitmqFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RabbitmqPackage.RABBIT_MQ_SENDER: return createRabbitMQSender();
			case RabbitmqPackage.RABBIT_MQ_RECEIVER: return createRabbitMQReceiver();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RabbitMQSender createRabbitMQSender() {
		RabbitMQSenderImpl rabbitMQSender = new RabbitMQSenderImpl();
		return rabbitMQSender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RabbitMQReceiver createRabbitMQReceiver() {
		RabbitMQReceiverImpl rabbitMQReceiver = new RabbitMQReceiverImpl();
		return rabbitMQReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RabbitmqPackage getRabbitmqPackage() {
		return (RabbitmqPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RabbitmqPackage getPackage() {
		return RabbitmqPackage.eINSTANCE;
	}

} //RabbitmqFactoryImpl
