package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.design.rabbitmqsender;

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
public class RabbitMQSenderNewcategorySection extends AbstractBWTransactionalSection {
   /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private Text attrName;


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
        getBindingManager().bind(attrName, getInput(), RabbitmqPackage.Literals.RABBIT_MQ_SENDER__ATTR_NAME); 
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
   	    BWFieldFactory.getInstance().createLabel(parent, Messages.RABBITMQSENDER_ATTRNAME, false);
   	    attrName = BWFieldFactory.getInstance().createTextBox(parent);

        // begin-custom-code
        // end-custom-code
        return parent;
    }
  

}
