
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for volumeStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="volumeStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessStatus" type="{}volumeAccessStatus" minOccurs="0"/>
 *         &lt;element name="multipathingProblems" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "volumeStatus", propOrder = {
    "accessStatus",
    "multipathingProblems"
})
public class VolumeStatus {

    protected VolumeAccessStatus accessStatus;
    protected boolean multipathingProblems;

    /**
     * Gets the value of the accessStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeAccessStatus }
     *     
     */
    public VolumeAccessStatus getAccessStatus() {
        return accessStatus;
    }

    /**
     * Sets the value of the accessStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeAccessStatus }
     *     
     */
    public void setAccessStatus(VolumeAccessStatus value) {
        this.accessStatus = value;
    }

    /**
     * Gets the value of the multipathingProblems property.
     * 
     */
    public boolean isMultipathingProblems() {
        return multipathingProblems;
    }

    /**
     * Sets the value of the multipathingProblems property.
     * 
     */
    public void setMultipathingProblems(boolean value) {
        this.multipathingProblems = value;
    }

}
