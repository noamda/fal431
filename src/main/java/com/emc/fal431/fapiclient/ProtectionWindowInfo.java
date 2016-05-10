
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for protectionWindowInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protectionWindowInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="protectionWindowInMicroSeconds" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="status" type="{}protectionWindowStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protectionWindowInfo", propOrder = {
    "protectionWindowInMicroSeconds",
    "status"
})
public class ProtectionWindowInfo {

    protected long protectionWindowInMicroSeconds;
    protected ProtectionWindowStatus status;

    /**
     * Gets the value of the protectionWindowInMicroSeconds property.
     * 
     */
    public long getProtectionWindowInMicroSeconds() {
        return protectionWindowInMicroSeconds;
    }

    /**
     * Sets the value of the protectionWindowInMicroSeconds property.
     * 
     */
    public void setProtectionWindowInMicroSeconds(long value) {
        this.protectionWindowInMicroSeconds = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionWindowStatus }
     *     
     */
    public ProtectionWindowStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionWindowStatus }
     *     
     */
    public void setStatus(ProtectionWindowStatus value) {
        this.status = value;
    }

}
