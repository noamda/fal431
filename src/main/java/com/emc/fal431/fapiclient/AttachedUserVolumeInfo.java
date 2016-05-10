
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attachedUserVolumeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attachedUserVolumeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}replicationSetUID" minOccurs="0"/>
 *         &lt;element name="sanInfo" type="{}volumeSANInfo" minOccurs="0"/>
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
@XmlType(name = "attachedUserVolumeInfo", propOrder = {
    "replicationSetUID",
    "sanInfo",
    "volumeID"
})
public class AttachedUserVolumeInfo {

    protected ReplicationSetUID replicationSetUID;
    protected VolumeSANInfo sanInfo;
    protected DeviceUID volumeID;

    /**
     * Gets the value of the replicationSetUID property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicationSetUID }
     *     
     */
    public ReplicationSetUID getReplicationSetUID() {
        return replicationSetUID;
    }

    /**
     * Sets the value of the replicationSetUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicationSetUID }
     *     
     */
    public void setReplicationSetUID(ReplicationSetUID value) {
        this.replicationSetUID = value;
    }

    /**
     * Gets the value of the sanInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeSANInfo }
     *     
     */
    public VolumeSANInfo getSanInfo() {
        return sanInfo;
    }

    /**
     * Sets the value of the sanInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeSANInfo }
     *     
     */
    public void setSanInfo(VolumeSANInfo value) {
        this.sanInfo = value;
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
