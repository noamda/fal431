
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vmVolume complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vmVolume">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canonicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filtered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="groupCopyUID" type="{}consistencyGroupCopyUID" minOccurs="0"/>
 *         &lt;element ref="{}replicationSetUID" minOccurs="0"/>
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
@XmlType(name = "vmVolume", propOrder = {
    "canonicalName",
    "filtered",
    "groupCopyUID",
    "replicationSetUID",
    "volumeID"
})
public class VmVolume {

    protected String canonicalName;
    protected boolean filtered;
    protected ConsistencyGroupCopyUID groupCopyUID;
    protected ReplicationSetUID replicationSetUID;
    protected DeviceUID volumeID;

    /**
     * Gets the value of the canonicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanonicalName() {
        return canonicalName;
    }

    /**
     * Sets the value of the canonicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanonicalName(String value) {
        this.canonicalName = value;
    }

    /**
     * Gets the value of the filtered property.
     * 
     */
    public boolean isFiltered() {
        return filtered;
    }

    /**
     * Sets the value of the filtered property.
     * 
     */
    public void setFiltered(boolean value) {
        this.filtered = value;
    }

    /**
     * Gets the value of the groupCopyUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public ConsistencyGroupCopyUID getGroupCopyUID() {
        return groupCopyUID;
    }

    /**
     * Sets the value of the groupCopyUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public void setGroupCopyUID(ConsistencyGroupCopyUID value) {
        this.groupCopyUID = value;
    }

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
