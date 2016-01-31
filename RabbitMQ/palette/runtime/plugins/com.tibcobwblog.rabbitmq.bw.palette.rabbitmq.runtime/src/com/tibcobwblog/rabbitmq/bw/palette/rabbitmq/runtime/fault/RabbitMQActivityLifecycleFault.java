package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.runtime.fault;

import com.tibco.bw.runtime.ActivityLifecycleFault;

public class RabbitMQActivityLifecycleFault extends ActivityLifecycleFault 

{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6098514979064369160L;


	public RabbitMQActivityLifecycleFault(String message) {
		super(message);
	}
}
