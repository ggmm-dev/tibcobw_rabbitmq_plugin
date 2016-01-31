package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.runtime.fault;

import com.tibco.bw.runtime.EventSourceContext;
import com.tibco.bw.runtime.EventSourceFault;
import com.tibco.neo.localized.LocalizedMessage;

public class RabbitMQEventSourceFaultException extends EventSourceFault 

{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	public <N> RabbitMQEventSourceFaultException(EventSourceContext<N> eventSourceContext,
			LocalizedMessage localizedMessage, Throwable cause) {
		super(eventSourceContext, localizedMessage, cause);
	}
	public <N> RabbitMQEventSourceFaultException(EventSourceContext<N> eventSourceContext,
			LocalizedMessage localizedMessage) {
		super(eventSourceContext, localizedMessage);
	}

}
