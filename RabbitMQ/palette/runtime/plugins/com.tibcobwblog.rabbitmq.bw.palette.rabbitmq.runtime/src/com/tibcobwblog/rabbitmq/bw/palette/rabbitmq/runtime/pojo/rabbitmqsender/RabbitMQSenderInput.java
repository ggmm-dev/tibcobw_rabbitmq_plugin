
package com.tibcobwblog.rabbitmq.bw.palette.rabbitmq.runtime.pojo.rabbitmqsender;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="queue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
    "queue",
    "message"
})
@XmlRootElement(name = "RabbitMQSenderInput", namespace = "http://www.tibco.com/RabbitMQ/RabbitMQSender")
public class RabbitMQSenderInput {

    @XmlElement(required = true)
    protected String queue;
    @XmlElement(required = true)
    protected Object message;

    /**
     * Gets the value of the queue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueue() {
        return queue;
    }

    /**
     * Sets the value of the queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueue(String value) {
        this.queue = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMessage(Object value) {
        this.message = value;
    }

}
