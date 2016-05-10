
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for replicationSetVolumesState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="replicationSetVolumesState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canBeEnlarged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="maxPossibleSizeInBytes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{}replicationSetUID" minOccurs="0"/>
 *         &lt;element name="userVolumesState" type="{}userVolumeState" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "replicationSetVolumesState", propOrder = {
    "canBeEnlarged",
    "maxPossibleSizeInBytes",
    "replicationSetUID",
    "userVolumesState"
})
public class ReplicationSetVolumesState {

    protected boolean canBeEnlarged;
    protected long maxPossibleSizeInBytes;
    protected ReplicationSetUID replicationSetUID;
    @XmlElement(nillable = true)
    protected List<UserVolumeState> userVolumesState;

    /**
     * Gets the value of the canBeEnlarged property.
     * 
     */
    public boolean isCanBeEnlarged() {
        return canBeEnlarged;
    }

    /**
     * Sets the value of the canBeEnlarged property.
     * 
     */
    public void setCanBeEnlarged(boolean value) {
        this.canBeEnlarged = value;
    }

    /**
     * Gets the value of the maxPossibleSizeInBytes property.
     * 
     */
    public long getMaxPossibleSizeInBytes() {
        return maxPossibleSizeInBytes;
    }

    /**
     * Sets the value of the maxPossibleSizeInBytes property.
     * 
     */
    public void setMaxPossibleSizeInBytes(long value) {
        this.maxPossibleSizeInBytes = value;
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
     * Gets the value of the userVolumesState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userVolumesState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserVolumesState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserVolumeState }
     * 
     * 
     */
    public List<UserVolumeState> getUserVolumesState() {
        if (userVolumesState == null) {
            userVolumesState = new ArrayList<UserVolumeState>();
        }
        return this.userVolumesState;
    }

}
