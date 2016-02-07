/*
 * This software is confidential and proprietary information of TIBCO Software Inc.
 * Overridable true
 */
package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.utils;

import java.util.ResourceBundle;
import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.model.utils.messages";

	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	public static ResourceBundle getBundle() {
		return ResourceBundle.getBundle(BUNDLE_NAME);
	}
    
	
	public static String RABBITMQSENDER_HOST;
	public static String RABBITMQSENDER_PORT;
	public static String RABBITMQSENDER_INPUTSTYLE;
	public static String RABBITMQRECEIVER_HOST;
	public static String RABBITMQRECEIVER_PORT;
	public static String RABBITMQRECEIVER_QUEUE;
	public static String RABBITMQRECEIVER_INPUTSTYLE;
	public static String PALETTE_PARAMETER_VALUE_INVALID;	
}
