/**
 */
package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitmqPackage
 * @generated
 */
public interface RabbitmqFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RabbitmqFactory eINSTANCE = com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl.RabbitmqFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rabbit MQ Sender</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rabbit MQ Sender</em>'.
	 * @generated
	 */
	RabbitMQSender createRabbitMQSender();

	/**
	 * Returns a new object of class '<em>Rabbit MQ Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rabbit MQ Receiver</em>'.
	 * @generated
	 */
	RabbitMQReceiver createRabbitMQReceiver();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RabbitmqPackage getRabbitmqPackage();

} //RabbitmqFactory
