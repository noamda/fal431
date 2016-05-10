
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deviceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oldVolumeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volumeUID" type="{}deviceUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deviceInfo", propOrder = {
    "oldVolumeName",
    "volumeUID"
})
public class DeviceInfo {

    protected String oldVolumeName;
    protected DeviceUID volumeUID;

    /**
     * Gets the value of the oldVolumeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldVolumeName() {
        return oldVolumeName;
    }

    /**
     * Sets the value of the oldVolumeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldVolumeName(String value) {
        this.oldVolumeName = value;
    }

    /**
     * Gets the value of the volumeUID property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceUID }
     *     
     */
    public DeviceUID getVolumeUID() {
        return volumeUID;
    }

    /**
     * Sets the value of the volumeUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceUID }
     *     
     */
    public void setVolumeUID(DeviceUID value) {
        this.volumeUID = value;
    }

}
