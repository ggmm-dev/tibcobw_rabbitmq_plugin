/**
 */
package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rabbit MQ Receiver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQReceiver#getHost <em>Host</em>}</li>
 *   <li>{@link com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQReceiver#getQueue <em>Queue</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitmqPackage#getRabbitMQReceiver()
 * @model annotation="dkactivityconfig activitytype='Process Starter' schemaType='XSD Editor' schemaFile='RabbitMQReceiverSchema.xsd' inputelementname='' outputelementname='RabbitMQReceiverOutput' faultelementname='' helpdocuuid='207fcf59-0b13-4a98-8ca2-13ee88335e02'"
 * @generated
 */
public interface RabbitMQReceiver extends EObject {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitmqPackage#getRabbitMQReceiver_Host()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='Host' isModelProperty='true' control='TextBox' value=''"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQReceiver#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue</em>' attribute.
	 * @see #setQueue(String)
	 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitmqPackage#getRabbitMQReceiver_Queue()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='Queue' isModelProperty='true' control='TextBox' value=''"
	 * @generated
	 */
	String getQueue();

	/**
	 * Sets the value of the '{@link com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQReceiver#getQueue <em>Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue</em>' attribute.
	 * @see #getQueue()
	 * @generated
	 */
	void setQueue(String value);

} // RabbitMQReceiver
