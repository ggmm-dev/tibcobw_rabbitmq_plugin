package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.runtime;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.rabbitmq.RabbitMQReceiver;
import com.tibco.bw.runtime.ActivityLifecycleFault;
import com.tibco.bw.runtime.EventContext;
import com.tibco.bw.runtime.EventSource;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.runtime.util.PaletteUtil;
import com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.runtime.pojo.rabbitmqreceiver.RabbitMQReceiverOutput;
import com.rabbitmq.client.*;

import org.genxdm.ProcessingContext;

import com.tibco.bw.runtime.util.XMLUtils;

import org.genxdm.Model;
import org.genxdm.io.FragmentBuilder;

import com.tibco.bw.runtime.EventSourceFault;
import com.tibco.bw.runtime.annotation.Property;

public class RabbitMQReceiverEventSource<N> extends EventSource<N> implements RabbitMQContants 

{
	
	@Property
	public RabbitMQReceiver eventSourceConfig;
	
	

	private boolean isStart;
	private Integer sleepTime;



	private ConnectionFactory factory;



	private Connection connection;



	private Channel channel;



	private String queueName;



	private String inputStyle;
	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * This method is called by the BusinessWorks Engine when an event source is destroyed. 
	 * This method must be implemented to release or cleanup any resources held by the event source.
	 */
	@Override
	public synchronized void destroy() {
		if(this.getActivityLogger().isDebugEnabled()) {
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED
								,new Object[] { "destroy()"
								,eventSourceContext.getEventSourceName()
								,eventSourceContext.getProcessName()
								,eventSourceContext.getDeploymentUnitName()
								,eventSourceContext.getDeploymentUnitVersion() });
		}
		sleepTime = null;
		// begin-custom-code
		// add your own business code here
		// end-custom-code
	}
	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Returns a boolean value to indicate the event source state.
	 * @return <code>true</code> if the event source is in a started state; otherwise <code>false</code>
	 */
	@Override
	public synchronized boolean isStarted() {
		if(this.getActivityLogger().isDebugEnabled()) {
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED
								,new Object[] { "isStarted()"
								,eventSourceContext.getEventSourceName()
								,eventSourceContext.getProcessName()
								,eventSourceContext.getDeploymentUnitName()
								,eventSourceContext.getDeploymentUnitVersion() });
		}
		// begin-custom-code
		// add your own business code here
		// end-custom-code
		return isStart;
	}
	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 *
     * This method is called by the BusinessWorks Engine to start the event source.  Until this 
     * method is called, the event source must not notify the BusinessWorks Engine of an new event.  
     * <p>
     * Once the event source is started, the event source must use the interface {@link EventSourceContext} 
     * to notify the BusinessWorks Engine of an new event. The {@link EventSourceContext} object can be 
     * obtained from the method {@link EventSource#getEventSourceContext()}.
     */
	@Override
	public synchronized void start() {
		if(this.getActivityLogger().isDebugEnabled()) {
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED
								,new Object[] { "start()"
								,eventSourceContext.getEventSourceName()
								,eventSourceContext.getProcessName()
								,eventSourceContext.getDeploymentUnitName()
								,eventSourceContext.getDeploymentUnitVersion() });
		}
		N outputInfo = null; 

		if (sleepTime >= 0) {
			try {
				Thread.sleep(sleepTime);
				this.isStart = true;
				// begin-custom-code
				// add your own business code here
				Runnable rabbitMqReceiver = new Runnable(){

					@Override
					public void run() {
						// TODO Auto-generated method stub
						Consumer consumer = new DefaultConsumer(channel){
							 @Override
					         public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties,
					                                    byte[] body)
					             throws IOException
					         {
					             String routingKey = envelope.getRoutingKey();
					             String contentType = properties.getContentType();
					             long deliveryTag = envelope.getDeliveryTag();
					             
					             Object returnedValue = body;
					             if("String".equals(inputStyle)){
					            	 returnedValue = new String(body);
					             }
					             
					             ProcessingContext<N> pcx = eventSourceContext.getXMLProcessingContext();
									N outputInfo;
									try {
										
										outputInfo = evalOutput(pcx, returnedValue);									
										eventSourceContext.newEvent(outputInfo, new EventContext<N>() {
											private static final long serialVersionUID = 4963596764256131074L;
											@Override
											public void release() {
											}
										});
										channel.basicAck(deliveryTag, false);
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
					         }
						};
						    try {
								String msg = channel.basicConsume(queueName, true, consumer);
								
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
					
				};
				rabbitMqReceiver.run();
				// end-custom-code
			    
			} catch (Exception e) {
				eventSourceContext.newEvent(new EventSourceFault(eventSourceContext, e));
			} finally {
				if(getActivityLogger().isDebugEnabled()){
					String serializedNode = XMLUtils.serializeNode(outputInfo, eventSourceContext.getXMLProcessingContext());
	    			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_OUTPUT, new Object[] {eventSourceContext.getEventSourceName(), serializedNode, eventSourceContext.getEventSourceName()});
    			}
			}
		}
	}
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * This method to build the output after finishing the business.
	 * @param  processContext
	 *			 XML processing context
	 * @param  data
	 *			 Business object.
	 * @return An XML Element which adheres to the output schema of the activity or may return <code>null</code> if the activity does not require an output.
	 */
	protected <A> N evalOutput(ProcessingContext<N> processingContext, Object data) throws Exception {
		
		RabbitMQReceiverOutput rabbitMQReceiverOutput = new RabbitMQReceiverOutput();
		rabbitMQReceiverOutput.setMessage("StringValue");
		N output = PaletteUtil.parseObjtoN(RabbitMQReceiverOutput.class, rabbitMQReceiverOutput, processingContext, eventSourceContext.getEventSourceOutputType().getTargetNamespace(), "RabbitMQReceiverOutput");
		// begin-custom-code
        // add your own business code here
		rabbitMQReceiverOutput.setMessage(data);
		output = PaletteUtil.parseObjtoN(RabbitMQReceiverOutput.class, rabbitMQReceiverOutput, processingContext, eventSourceContext.getEventSourceOutputType().getTargetNamespace(), "RabbitMQReceiverOutput");
        // end-custom-code
	    return output;
	}

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * This method to get the root element of output. 
	 * @param pcx
	 * 			XML processing context
	 * @return An XML Element
	 */

	protected N getOutputRootElement(ProcessingContext<N> pcx) {
		final FragmentBuilder<N> builder = pcx.newFragmentBuilder();

		Model<N> model = pcx.getModel();
		builder.startDocument(null, "xml");
		try {
			builder.startElement(eventSourceContext.getEventSourceOutputType().getTargetNamespace(), "RabbitMQReceiverOutput", "ns0");
			try {
			} finally {
				builder.endElement();
			}
		} finally {
			builder.endDocument();
		}
		N output = builder.getNode();
		N activityOutput = model.getFirstChild(output);
		// begin-custom-code
        // add your own business code here
        // end-custom-code
		return activityOutput;
	}
	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
     * This method is called by the BusinessWorks Engine to stop the event source from processing
     * new events.
     * <p>  
     * After this method is called, the event source must NOT use the interface {@link EventSourceContext}
     * to notify the BusinessWorks Engine of an new event.  However where applicable, the event source should be 
     * able to process the response for the previous events that has been already notified to the BusinessWorks Engine.
     * <p>
     * The implementation of this method should be cautious about releasing or deleting any resources that are required 
     * to start the event source, since the method {@link EventSource#start()} can be called after the method {@link EventSource#stop()}.
     *
	 */
	@Override
	public synchronized void stop() {
		if(this.getActivityLogger().isDebugEnabled()) {
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED
								,new Object[] { "stop()"
								,eventSourceContext.getEventSourceName()
								,eventSourceContext.getProcessName()
								,eventSourceContext.getDeploymentUnitName()
								,eventSourceContext.getDeploymentUnitVersion() });
		}
		sleepTime = -1;
		// begin-custom-code
		// add your own business code here
		// end-custom-code
	}
	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * This method is called by the BusinessWorks Engine when an event source is 
	 * initialized. The argument '<code>eventSourceKind</code>' of this method 
	 * denotes whether the event source is being initialized for a BusinessWorks
	 * ProcessStarter activity or a BusinessWorks SignalIn activity.  
	 * <p>
	 * This method may perform any required initialization; however it must not start the 
	 * event source. The event source must wait until the method {@link EventSource#start()} is called 
	 * by the BusinessWorks Engine before processing new events.
	 * 
	 * @param eventSourceKind
	 *            Indicates if the event source is being initialized for a ProcessStarter activity or 
	 *            a SignalIn activity. The value {@link EventSourceKind#PROCESS_STARTER} indicates 
	 *            a ProcessStarter activity and the value {@link EventSourceKind#SIGNAL_IN} indicates 
	 *            a SignalIn activity.
	 *             
	 * @throws ActivityLifecycleFault
	 * 			  Thrown if the event source initialization is unsuccessful or encounters an error.
	 */
	@Override
	public void init(com.tibco.bw.runtime.EventSource.EventSourceKind eventSourceKind)
			throws ActivityLifecycleFault {
		if(this.getActivityLogger().isDebugEnabled()) {
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED
								,new Object[] { "init()"
								,eventSourceContext.getEventSourceName()
								,eventSourceContext.getProcessName()
								,eventSourceContext.getDeploymentUnitName()
								,eventSourceContext.getDeploymentUnitVersion() });
		}	
		sleepTime = 5;
		// begin-custom-code
		// add your own business code here	
		
		
		inputStyle = this.eventSourceConfig.getInputStyle();
		
	    factory = new ConnectionFactory();
	    factory.setHost(this.eventSourceConfig.getHost());
	    try{
	    	factory.setPort(Integer.parseInt(this.eventSourceConfig.getPort()));
	    }catch(NumberFormatException ex){
	    	factory.setPort(35678);
	    }
	     try {
			connection = factory.newConnection();
			channel = connection.createChannel();
			queueName = this.eventSourceConfig.getQueue();
			channel.queueDeclare(queueName, false, false, false, null);
	     } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		// end-custom-code
	}
}
