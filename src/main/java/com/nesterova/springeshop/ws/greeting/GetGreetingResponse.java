//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.01 at 11:38:05 AM MSK 
//


package com.nesterova.springeshop.ws.greeting;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="greeting" type="{http://nesterova.com/springeshop/ws/greeting}greeting"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "greeting"
})
@XmlRootElement(name = "getGreetingResponse")
public class GetGreetingResponse {

    @XmlElement(required = true)
    protected Greeting greeting;

    /**
     * Gets the value of the greeting property.
     * 
     * @return
     *     possible object is
     *     {@link Greeting }
     *     
     */
    public Greeting getGreeting() {
        return greeting;
    }

    /**
     * Sets the value of the greeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Greeting }
     *     
     */
    public void setGreeting(Greeting value) {
        this.greeting = value;
    }

}