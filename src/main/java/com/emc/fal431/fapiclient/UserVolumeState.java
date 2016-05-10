
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userVolumeState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userVolumeState">
 *   &lt;complexContent>
 *     &lt;extension base="{}volumeState">
 *       &lt;sequence>
 *         &lt;element name="groupCopyUID" type="{}consistencyGroupCopyUID" minOccurs="0"/>
 *         &lt;element ref="{}replicationSetUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userVolumeState", propOrder = {
    "groupCopyUID",
    "replicationSetUID"
})
public class UserVolumeState
    extends VolumeState
{

    protected ConsistencyGroupCopyUID groupCopyUID;
    protected ReplicationSetUID replicationSetUID;

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

}
