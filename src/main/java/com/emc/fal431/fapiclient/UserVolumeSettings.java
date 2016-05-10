
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userVolumeSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userVolumeSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{}volumeSettings">
 *       &lt;sequence>
 *         &lt;element name="attachedSplitters" type="{}splitterUID" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "userVolumeSettings", propOrder = {
    "attachedSplitters",
    "groupCopyUID",
    "replicationSetUID"
})
public class UserVolumeSettings
    extends VolumeSettings
{

    @XmlElement(nillable = true)
    protected List<SplitterUID> attachedSplitters;
    protected ConsistencyGroupCopyUID groupCopyUID;
    protected ReplicationSetUID replicationSetUID;

    /**
     * Gets the value of the attachedSplitters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachedSplitters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachedSplitters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitterUID }
     * 
     * 
     */
    public List<SplitterUID> getAttachedSplitters() {
        if (attachedSplitters == null) {
            attachedSplitters = new ArrayList<SplitterUID>();
        }
        return this.attachedSplitters;
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

}
