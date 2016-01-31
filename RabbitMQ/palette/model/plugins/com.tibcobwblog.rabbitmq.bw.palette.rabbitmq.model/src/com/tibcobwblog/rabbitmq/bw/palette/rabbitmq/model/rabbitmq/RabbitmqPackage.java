/**
 */
package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitmqFactory
 * @model kind="package"
 * @generated
 */
public interface RabbitmqPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rabbitmq";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ns.tibco.com/bw/palette/rabbitmq";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rabbitmq";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RabbitmqPackage eINSTANCE = com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl.RabbitmqPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl.RabbitMQSenderImpl <em>Rabbit MQ Sender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl.RabbitMQSenderImpl
	 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl.RabbitmqPackageImpl#getRabbitMQSender()
	 * @generated
	 */
	int RABBIT_MQ_SENDER = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RABBIT_MQ_SENDER__HOST = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RABBIT_MQ_SENDER__PORT = 1;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RABBIT_MQ_SENDER__ATTR_NAME = 2;

	/**
	 * The number of structural features of the '<em>Rabbit MQ Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RABBIT_MQ_SENDER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl.RabbitMQReceiverImpl <em>Rabbit MQ Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl.RabbitMQReceiverImpl
	 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl.RabbitmqPackageImpl#getRabbitMQReceiver()
	 * @generated
	 */
	int RABBIT_MQ_RECEIVER = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RABBIT_MQ_RECEIVER__HOST = 0;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RABBIT_MQ_RECEIVER__QUEUE = 1;

	/**
	 * The number of structural features of the '<em>Rabbit MQ Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RABBIT_MQ_RECEIVER_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQSender <em>Rabbit MQ Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rabbit MQ Sender</em>'.
	 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQSender
	 * @generated
	 */
	EClass getRabbitMQSender();

	/**
	 * Returns the meta object for the attribute '{@link com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQSender#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQSender#getHost()
	 * @see #getRabbitMQSender()
	 * @generated
	 */
	EAttribute getRabbitMQSender_Host();

	/**
	 * Returns the meta object for the attribute '{@link com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQSender#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQSender#getPort()
	 * @see #getRabbitMQSender()
	 * @generated
	 */
	EAttribute getRabbitMQSender_Port();

	/**
	 * Returns the meta object for the attribute '{@link com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQSender#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQSender#getAttrName()
	 * @see #getRabbitMQSender()
	 * @generated
	 */
	EAttribute getRabbitMQSender_AttrName();

	/**
	 * Returns the meta object for class '{@link com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQReceiver <em>Rabbit MQ Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rabbit MQ Receiver</em>'.
	 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQReceiver
	 * @generated
	 */
	EClass getRabbitMQReceiver();

	/**
	 * Returns the meta object for the attribute '{@link com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQReceiver#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQReceiver#getHost()
	 * @see #getRabbitMQReceiver()
	 * @generated
	 */
	EAttribute getRabbitMQReceiver_Host();

	/**
	 * Returns the meta object for the attribute '{@link com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQReceiver#getQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue</em>'.
	 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQReceiver#getQueue()
	 * @see #getRabbitMQReceiver()
	 * @generated
	 */
	EAttribute getRabbitMQReceiver_Queue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RabbitmqFactory getRabbitmqFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl.RabbitMQSenderImpl <em>Rabbit MQ Sender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl.RabbitMQSenderImpl
		 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl.RabbitmqPackageImpl#getRabbitMQSender()
		 * @generated
		 */
		EClass RABBIT_MQ_SENDER = eINSTANCE.getRabbitMQSender();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RABBIT_MQ_SENDER__HOST = eINSTANCE.getRabbitMQSender_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RABBIT_MQ_SENDER__PORT = eINSTANCE.getRabbitMQSender_Port();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RABBIT_MQ_SENDER__ATTR_NAME = eINSTANCE.getRabbitMQSender_AttrName();

		/**
		 * The meta object literal for the '{@link com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl.RabbitMQReceiverImpl <em>Rabbit MQ Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl.RabbitMQReceiverImpl
		 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl.RabbitmqPackageImpl#getRabbitMQReceiver()
		 * @generated
		 */
		EClass RABBIT_MQ_RECEIVER = eINSTANCE.getRabbitMQReceiver();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RABBIT_MQ_RECEIVER__HOST = eINSTANCE.getRabbitMQReceiver_Host();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RABBIT_MQ_RECEIVER__QUEUE = eINSTANCE.getRabbitMQReceiver_Queue();

	}

} //RabbitmqPackage
