package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.design.rabbitmqsender;

import org.eclipse.jface.viewers.ArrayContentProvider;
import com.tibco.bw.design.field.AttributeBindingField;
import com.tibco.bw.design.field.viewer.CustomComboViewer;
import com.tibco.bw.design.util.PropertyTypeQnameConstants;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitmqPackage;

import org.eclipse.swt.widgets.Composite;
import com.tibco.bw.design.field.BWFieldFactory;
import com.tibco.bw.design.propertysection.AbstractBWTransactionalSection;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQSender;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.utils.Messages;
/**
 * General tab properties for the activity.
 */
public class RabbitMQSenderAdvancedSection extends AbstractBWTransactionalSection 
{
   /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private AttributeBindingField inputStyleABF;
   /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private CustomComboViewer inputStyle;


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
        getBindingManager().bind(inputStyleABF, getInput(), RabbitmqPackage.Literals.RABBIT_MQ_SENDER__INPUT_STYLE); 
        getBindingManager().bindCustomViewer(inputStyle, getInput(), RabbitmqPackage.Literals.RABBIT_MQ_SENDER__INPUT_STYLE, BWFieldFactory.getInstance().getPropertyTargetToModelUpdateValueStrategy(), null); 
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
   	    BWFieldFactory.getInstance().createLabel(parent, Messages.RABBITMQSENDER_INPUTSTYLE, false);
   	    inputStyle = BWFieldFactory.getInstance().createComboViewer(parent);
   	    inputStyle.setContentProvider(new ArrayContentProvider());
   	    inputStyle.setInput(new String[]{"String;Binary"});

   	    inputStyleABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, inputStyle.getControl(), PropertyTypeQnameConstants.STRING_PRIMITIVE, true);

        // begin-custom-code
        // end-custom-code
        return parent;
    }
  

}
