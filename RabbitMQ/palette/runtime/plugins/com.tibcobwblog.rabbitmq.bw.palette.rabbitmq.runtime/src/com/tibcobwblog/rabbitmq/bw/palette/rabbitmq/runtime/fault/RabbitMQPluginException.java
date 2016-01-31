package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.runtime.fault;

import javax.xml.namespace.QName;
import org.genxdm.ProcessingContext;
import com.tibco.bw.runtime.ActivityContext;
import com.tibco.neo.localized.BundleMessage;
public class RabbitMQPluginException extends RabbitMQActivityBaseException 
{
	private static final long serialVersionUID = 1L;
	
	public <N> RabbitMQPluginException(ActivityContext<N> activityContext, Integer code,
			BundleMessage bundleMessage) {
		super(activityContext, code, bundleMessage);
	}
	
	/**
 	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 */
	public QName getFaultElementQName() {
		// begin-custom-code
        // add your own business code here
        // end-custom-code
		return new QName("http://schemas.tibco.com/bw/plugins/RabbitMQ/RabbitMQExceptions","RabbitMQPluginException");
	}
	/**
 	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * This method to set fault data according to design time
	 * @param processingContext
	 *			XML processing context.  
	 */
	public <N> void buildFault(ProcessingContext<N> pcx) {
		N RabbitMQPluginException = this.createFaultMessageElement(pcx);
		
		this.setData(RabbitMQPluginException);
		// begin-custom-code
        // add your own business code here
        // end-custom-code
	}
	

}
