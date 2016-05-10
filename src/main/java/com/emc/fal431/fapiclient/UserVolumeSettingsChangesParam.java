
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userVolumeSettingsChangesParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userVolumeSettingsChangesParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="copyUID" type="{}consistencyGroupCopyUID" minOccurs="0"/>
 *         &lt;element name="newVolumeID" type="{}deviceUID" minOccurs="0"/>
 *         &lt;element name="removedVolumeID" type="{}deviceUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userVolumeSettingsChangesParam", propOrder = {
    "copyUID",
    "newVolumeID",
    "removedVolumeID"
})
public class UserVolumeSettingsChangesParam {

    protected ConsistencyGroupCopyUID copyUID;
    protected DeviceUID newVolumeID;
    protected DeviceUID removedVolumeID;

    /**
     * Gets the value of the copyUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public ConsistencyGroupCopyUID getCopyUID() {
        return copyUID;
    }

    /**
     * Sets the value of the copyUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public void setCopyUID(ConsistencyGroupCopyUID value) {
        this.copyUID = value;
    }

    /**
     * Gets the value of the newVolumeID property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceUID }
     *     
     */
    public DeviceUID getNewVolumeID() {
        return newVolumeID;
    }

    /**
     * Sets the value of the newVolumeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceUID }
     *     
     */
    public void setNewVolumeID(DeviceUID value) {
        this.newVolumeID = value;
    }

    /**
     * Gets the value of the removedVolumeID property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceUID }
     *     
     */
    public DeviceUID getRemovedVolumeID() {
        return removedVolumeID;
    }

    /**
     * Sets the value of the removedVolumeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceUID }
     *     
     */
    public void setRemovedVolumeID(DeviceUID value) {
        this.removedVolumeID = value;
    }

}
