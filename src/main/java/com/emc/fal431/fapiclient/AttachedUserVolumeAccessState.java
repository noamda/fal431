
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attachedUserVolumeAccessState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attachedUserVolumeAccessState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessState" type="{}volumeAccessState" minOccurs="0"/>
 *         &lt;element name="currentDelayExpiryTimeoutInSeconds" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="groupCopyUID" type="{}consistencyGroupCopyUID" minOccurs="0"/>
 *         &lt;element ref="{}replicationSetUID" minOccurs="0"/>
 *         &lt;element name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "attachedUserVolumeAccessState", propOrder = {
    "accessState",
    "currentDelayExpiryTimeoutInSeconds",
    "groupCopyUID",
    "replicationSetUID",
    "visible",
    "volumeID"
})
public class AttachedUserVolumeAccessState {

    protected VolumeAccessState accessState;
    protected int currentDelayExpiryTimeoutInSeconds;
    protected ConsistencyGroupCopyUID groupCopyUID;
    protected ReplicationSetUID replicationSetUID;
    protected Boolean visible;
    protected DeviceUID volumeID;

    /**
     * Gets the value of the accessState property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeAccessState }
     *     
     */
    public VolumeAccessState getAccessState() {
        return accessState;
    }

    /**
     * Sets the value of the accessState property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeAccessState }
     *     
     */
    public void setAccessState(VolumeAccessState value) {
        this.accessState = value;
    }

    /**
     * Gets the value of the currentDelayExpiryTimeoutInSeconds property.
     * 
     */
    public int getCurrentDelayExpiryTimeoutInSeconds() {
        return currentDelayExpiryTimeoutInSeconds;
    }

    /**
     * Sets the value of the currentDelayExpiryTimeoutInSeconds property.
     * 
     */
    public void setCurrentDelayExpiryTimeoutInSeconds(int value) {
        this.currentDelayExpiryTimeoutInSeconds = value;
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
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisible(Boolean value) {
        this.visible = value;
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
