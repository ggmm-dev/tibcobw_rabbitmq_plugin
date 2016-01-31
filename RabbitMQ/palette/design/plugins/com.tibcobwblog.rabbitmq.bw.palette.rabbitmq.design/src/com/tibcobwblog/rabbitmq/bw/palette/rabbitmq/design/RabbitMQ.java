package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.design;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


public class RabbitMQ extends AbstractUIPlugin 


{

	// The plug-in ID
	public static final String PLUGIN_ID = "com.tibco.bw.palette.rabbitmq.design"; //$NON-NLS-1$

	// The shared instance
	private static RabbitMQ plugin;
	
	/**
	 * The constructor
	 */
	public RabbitMQ() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static RabbitMQ getDefault() {
		return plugin;
	}

}
