/**
 */
package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl;

import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQSender;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitmqPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rabbit MQ Sender</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl.RabbitMQSenderImpl#getHost <em>Host</em>}</li>
 *   <li>{@link com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl.RabbitMQSenderImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl.RabbitMQSenderImpl#getInputStyle <em>Input Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RabbitMQSenderImpl extends EObjectImpl implements RabbitMQSender {
	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected String port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputStyle() <em>Input Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputStyle() <em>Input Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputStyle()
	 * @generated
	 * @ordered
	 */
	protected String inputStyle = INPUT_STYLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RabbitMQSenderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RabbitmqPackage.Literals.RABBIT_MQ_SENDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RabbitmqPackage.RABBIT_MQ_SENDER__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(String newPort) {
		String oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RabbitmqPackage.RABBIT_MQ_SENDER__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputStyle() {
		return inputStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputStyle(String newInputStyle) {
		String oldInputStyle = inputStyle;
		inputStyle = newInputStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RabbitmqPackage.RABBIT_MQ_SENDER__INPUT_STYLE, oldInputStyle, inputStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RabbitmqPackage.RABBIT_MQ_SENDER__HOST:
				return getHost();
			case RabbitmqPackage.RABBIT_MQ_SENDER__PORT:
				return getPort();
			case RabbitmqPackage.RABBIT_MQ_SENDER__INPUT_STYLE:
				return getInputStyle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RabbitmqPackage.RABBIT_MQ_SENDER__HOST:
				setHost((String)newValue);
				return;
			case RabbitmqPackage.RABBIT_MQ_SENDER__PORT:
				setPort((String)newValue);
				return;
			case RabbitmqPackage.RABBIT_MQ_SENDER__INPUT_STYLE:
				setInputStyle((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RabbitmqPackage.RABBIT_MQ_SENDER__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case RabbitmqPackage.RABBIT_MQ_SENDER__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case RabbitmqPackage.RABBIT_MQ_SENDER__INPUT_STYLE:
				setInputStyle(INPUT_STYLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RabbitmqPackage.RABBIT_MQ_SENDER__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case RabbitmqPackage.RABBIT_MQ_SENDER__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case RabbitmqPackage.RABBIT_MQ_SENDER__INPUT_STYLE:
				return INPUT_STYLE_EDEFAULT == null ? inputStyle != null : !INPUT_STYLE_EDEFAULT.equals(inputStyle);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (host: ");
		result.append(host);
		result.append(", port: ");
		result.append(port);
		result.append(", inputStyle: ");
		result.append(inputStyle);
		result.append(')');
		return result.toString();
	}

} //RabbitMQSenderImpl
