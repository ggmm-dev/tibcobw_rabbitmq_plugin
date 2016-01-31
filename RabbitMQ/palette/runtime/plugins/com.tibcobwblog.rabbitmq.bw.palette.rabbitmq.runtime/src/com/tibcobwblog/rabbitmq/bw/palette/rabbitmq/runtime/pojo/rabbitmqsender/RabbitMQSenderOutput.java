
package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.runtime.pojo.rabbitmqsender;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sent"
})
@XmlRootElement(name = "RabbitMQSenderOutput", namespace = "http://www.tibco.com/RabbitMQ/RabbitMQSender")
public class RabbitMQSenderOutput {

    protected boolean sent;

    /**
     * Gets the value of the sent property.
     * 
     */
    public boolean isSent() {
        return sent;
    }

    /**
     * Sets the value of the sent property.
     * 
     */
    public void setSent(boolean value) {
        this.sent = value;
    }

}
