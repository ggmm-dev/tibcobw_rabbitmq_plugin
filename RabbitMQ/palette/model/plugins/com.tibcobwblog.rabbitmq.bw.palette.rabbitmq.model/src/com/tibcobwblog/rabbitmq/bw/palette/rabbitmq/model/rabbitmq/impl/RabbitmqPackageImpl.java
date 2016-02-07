/**
 */
package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.impl;

import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQReceiver;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQSender;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitmqFactory;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitmqPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RabbitmqPackageImpl extends EPackageImpl implements RabbitmqPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rabbitMQSenderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rabbitMQReceiverEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitmqPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RabbitmqPackageImpl() {
		super(eNS_URI, RabbitmqFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RabbitmqPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RabbitmqPackage init() {
		if (isInited) return (RabbitmqPackage)EPackage.Registry.INSTANCE.getEPackage(RabbitmqPackage.eNS_URI);

		// Obtain or create and register package
		RabbitmqPackageImpl theRabbitmqPackage = (RabbitmqPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RabbitmqPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RabbitmqPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRabbitmqPackage.createPackageContents();

		// Initialize created meta-data
		theRabbitmqPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRabbitmqPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RabbitmqPackage.eNS_URI, theRabbitmqPackage);
		return theRabbitmqPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRabbitMQSender() {
		return rabbitMQSenderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRabbitMQSender_Host() {
		return (EAttribute)rabbitMQSenderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRabbitMQSender_Port() {
		return (EAttribute)rabbitMQSenderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRabbitMQSender_InputStyle() {
		return (EAttribute)rabbitMQSenderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRabbitMQReceiver() {
		return rabbitMQReceiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRabbitMQReceiver_Host() {
		return (EAttribute)rabbitMQReceiverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRabbitMQReceiver_Port() {
		return (EAttribute)rabbitMQReceiverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRabbitMQReceiver_Queue() {
		return (EAttribute)rabbitMQReceiverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRabbitMQReceiver_InputStyle() {
		return (EAttribute)rabbitMQReceiverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RabbitmqFactory getRabbitmqFactory() {
		return (RabbitmqFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rabbitMQSenderEClass = createEClass(RABBIT_MQ_SENDER);
		createEAttribute(rabbitMQSenderEClass, RABBIT_MQ_SENDER__HOST);
		createEAttribute(rabbitMQSenderEClass, RABBIT_MQ_SENDER__PORT);
		createEAttribute(rabbitMQSenderEClass, RABBIT_MQ_SENDER__INPUT_STYLE);

		rabbitMQReceiverEClass = createEClass(RABBIT_MQ_RECEIVER);
		createEAttribute(rabbitMQReceiverEClass, RABBIT_MQ_RECEIVER__HOST);
		createEAttribute(rabbitMQReceiverEClass, RABBIT_MQ_RECEIVER__PORT);
		createEAttribute(rabbitMQReceiverEClass, RABBIT_MQ_RECEIVER__QUEUE);
		createEAttribute(rabbitMQReceiverEClass, RABBIT_MQ_RECEIVER__INPUT_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(rabbitMQSenderEClass, RabbitMQSender.class, "RabbitMQSender", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRabbitMQSender_Host(), ecorePackage.getEString(), "host", null, 0, 1, RabbitMQSender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRabbitMQSender_Port(), ecorePackage.getEString(), "port", null, 0, 1, RabbitMQSender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRabbitMQSender_InputStyle(), ecorePackage.getEString(), "inputStyle", null, 0, 1, RabbitMQSender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rabbitMQReceiverEClass, RabbitMQReceiver.class, "RabbitMQReceiver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRabbitMQReceiver_Host(), ecorePackage.getEString(), "host", null, 0, 1, RabbitMQReceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRabbitMQReceiver_Port(), ecorePackage.getEString(), "port", null, 0, 1, RabbitMQReceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRabbitMQReceiver_Queue(), ecorePackage.getEString(), "queue", null, 0, 1, RabbitMQReceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRabbitMQReceiver_InputStyle(), ecorePackage.getEString(), "inputStyle", null, 0, 1, RabbitMQReceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// dkactivityconfig
		createDkactivityconfigAnnotations();
		// dkcontrolconfig
		createDkcontrolconfigAnnotations();
	}

	/**
	 * Initializes the annotations for <b>dkactivityconfig</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDkactivityconfigAnnotations() {
		String source = "dkactivityconfig";	
		addAnnotation
		  (rabbitMQSenderEClass, 
		   source, 
		   new String[] {
			 "activitytype", "Synchronous",
			 "schemaType", "XSD Editor",
			 "schemaFile", "RabbitMQSenderSchema.xsd",
			 "inputelementname", "RabbitMQSenderInput",
			 "outputelementname", "RabbitMQSenderOutput",
			 "faultelementname", "",
			 "helpdocuuid", "3a1b1a9e-cbcb-454f-a452-0b2b2d1e47b2"
		   });	
		addAnnotation
		  (rabbitMQReceiverEClass, 
		   source, 
		   new String[] {
			 "activitytype", "Process Starter",
			 "schemaType", "XSD Editor",
			 "schemaFile", "RabbitMQReceiverSchema.xsd",
			 "inputelementname", "",
			 "outputelementname", "RabbitMQReceiverOutput",
			 "faultelementname", "",
			 "helpdocuuid", "207fcf59-0b13-4a98-8ca2-13ee88335e02"
		   });
	}

	/**
	 * Initializes the annotations for <b>dkcontrolconfig</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDkcontrolconfigAnnotations() {
		String source = "dkcontrolconfig";	
		addAnnotation
		  (getRabbitMQSender_Host(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "true",
			 "label", "Host",
			 "isModelProperty", "true",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getRabbitMQSender_Port(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "true",
			 "label", "Port",
			 "isModelProperty", "true",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getRabbitMQSender_InputStyle(), 
		   source, 
		   new String[] {
			 "sectionName", "Advanced",
			 "isRequired", "false",
			 "label", "Input Style",
			 "isModelProperty", "true",
			 "control", "ComboViewer",
			 "value", "String;Binary"
		   });	
		addAnnotation
		  (getRabbitMQReceiver_Host(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "true",
			 "label", "Host",
			 "isModelProperty", "true",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getRabbitMQReceiver_Port(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "true",
			 "label", "Port",
			 "isModelProperty", "true",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getRabbitMQReceiver_Queue(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "true",
			 "label", "Queue",
			 "isModelProperty", "true",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getRabbitMQReceiver_InputStyle(), 
		   source, 
		   new String[] {
			 "sectionName", "Advanced",
			 "isRequired", "false",
			 "label", "Input Style",
			 "isModelProperty", "false",
			 "control", "ComboViewer",
			 "value", "String;Binary"
		   });
	}

} //RabbitmqPackageImpl
