
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for removeUserVolumeParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="removeUserVolumeParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="replicationSet" type="{}replicationSetUID" minOccurs="0"/>
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
@XmlType(name = "removeUserVolumeParams", propOrder = {
    "replicationSet",
    "volumeID"
})
public class RemoveUserVolumeParams {

    protected ReplicationSetUID replicationSet;
    protected DeviceUID volumeID;

    /**
     * Gets the value of the replicationSet property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicationSetUID }
     *     
     */
    public ReplicationSetUID getReplicationSet() {
        return replicationSet;
    }

    /**
     * Sets the value of the replicationSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicationSetUID }
     *     
     */
    public void setReplicationSet(ReplicationSetUID value) {
        this.replicationSet = value;
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
