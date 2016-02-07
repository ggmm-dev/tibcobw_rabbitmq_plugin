package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.design.rabbitmqsender;

import com.tibco.bw.design.field.AttributeBindingField;
import com.tibco.bw.design.util.PropertyTypeQnameConstants;
import org.eclipse.swt.widgets.Text;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitmqPackage;

import org.eclipse.swt.widgets.Composite;
import com.tibco.bw.design.field.BWFieldFactory;
import com.tibco.bw.design.propertysection.AbstractBWTransactionalSection;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQSender;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.utils.Messages;
/**
 * General tab properties for the activity.
 */
public class RabbitMQSenderGeneralSection extends AbstractBWTransactionalSection 
{
   /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private AttributeBindingField hostABF;
/**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private Text host;


    /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private AttributeBindingField portABF;
/**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private Text port;


	@Override
    protected Class<?> getModelClass() {
       return RabbitMQSender.class;
    }

    /**
	 * <!-- begin-custom-doc -->
     * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Initialize bindings of controls to the input. 
	 */
    @Override
    protected void initBindings() {
        getBindingManager().bind(hostABF, getInput(), RabbitmqPackage.Literals.RABBIT_MQ_SENDER__HOST); 
        getBindingManager().bind(portABF, getInput(), RabbitmqPackage.Literals.RABBIT_MQ_SENDER__PORT); 
   	    // begin-custom-code
        // end-custom-code
    }

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * This method to create the section-specific UI.
	 * @param root
	 * @return
	 */
    @Override
    protected Composite doCreateControl(final Composite root) {
        Composite parent = BWFieldFactory.getInstance().createComposite(root, 2);
   	    BWFieldFactory.getInstance().createLabel(parent, Messages.RABBITMQSENDER_HOST, true);
   	    host = BWFieldFactory.getInstance().createTextBox(parent);

   	    hostABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, host, PropertyTypeQnameConstants.STRING_PRIMITIVE, true);

   	    BWFieldFactory.getInstance().createLabel(parent, Messages.RABBITMQSENDER_PORT, true);
   	    port = BWFieldFactory.getInstance().createTextBox(parent);

   	    portABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, port, PropertyTypeQnameConstants.STRING_PRIMITIVE, true);

        // begin-custom-code
        // end-custom-code
        return parent;
    }
  

}
