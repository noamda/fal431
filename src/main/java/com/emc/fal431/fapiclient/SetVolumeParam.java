
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setVolumeParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setVolumeParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shouldAttachAsClean" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="volumeID" type="{}deviceUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setVolumeParam", propOrder = {
    "shouldAttachAsClean",
    "volumeID"
})
public class SetVolumeParam {

    protected boolean shouldAttachAsClean;
    protected DeviceUID volumeID;

    /**
     * Gets the value of the shouldAttachAsClean property.
     * 
     */
    public boolean isShouldAttachAsClean() {
        return shouldAttachAsClean;
    }

    /**
     * Sets the value of the shouldAttachAsClean property.
     * 
     */
    public void setShouldAttachAsClean(boolean value) {
        this.shouldAttachAsClean = value;
    }

    /**
     * Gets the value of the volumeID property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceUID }
     *     
     */
    public DeviceUID getVolumeID() {
        return volumeID;
    }

    /**
     * Sets the value of the volumeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceUID }
     *     
     */
    public void setVolumeID(DeviceUID value) {
        this.volumeID = value;
    }

}
