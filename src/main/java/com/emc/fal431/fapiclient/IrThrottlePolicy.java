
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for irThrottlePolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="irThrottlePolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="storageAwareness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="throttleType" type="{}irThrottleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "irThrottlePolicy", propOrder = {
    "storageAwareness",
    "throttleType"
})
public class IrThrottlePolicy {

    protected boolean storageAwareness;
    protected IrThrottleType throttleType;

    /**
     * Gets the value of the storageAwareness property.
     * 
     */
    public boolean isStorageAwareness() {
        return storageAwareness;
    }

    /**
     * Sets the value of the storageAwareness property.
     * 
     */
    public void setStorageAwareness(boolean value) {
        this.storageAwareness = value;
    }

    /**
     * Gets the value of the throttleType property.
     * 
     * @return
     *     possible object is
     *     {@link IrThrottleType }
     *     
     */
    public IrThrottleType getThrottleType() {
        return throttleType;
    }

    /**
     * Sets the value of the throttleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IrThrottleType }
     *     
     */
    public void setThrottleType(IrThrottleType value) {
        this.throttleType = value;
    }

}
