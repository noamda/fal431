
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for volumeRPAAccessStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="volumeRPAAccessStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessStatus" type="{}volumeStatus" minOccurs="0"/>
 *         &lt;element ref="{}rpaUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "volumeRPAAccessStatus", propOrder = {
    "accessStatus",
    "rpaUID"
})
public class VolumeRPAAccessStatus {

    protected VolumeStatus accessStatus;
    protected RpaUID rpaUID;

    /**
     * Gets the value of the accessStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeStatus }
     *     
     */
    public VolumeStatus getAccessStatus() {
        return accessStatus;
    }

    /**
     * Sets the value of the accessStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeStatus }
     *     
     */
    public void setAccessStatus(VolumeStatus value) {
        this.accessStatus = value;
    }

    /**
     * Gets the value of the rpaUID property.
     * 
     * @return
     *     possible object is
     *     {@link RpaUID }
     *     
     */
    public RpaUID getRpaUID() {
        return rpaUID;
    }

    /**
     * Sets the value of the rpaUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RpaUID }
     *     
     */
    public void setRpaUID(RpaUID value) {
        this.rpaUID = value;
    }

}
