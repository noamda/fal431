
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupSettingsChangesParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupSettingsChangesParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="copiesChanges" type="{}consistencyGroupCopySettingsChangesParam" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="enableGroup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="groupUID" type="{}consistencyGroupUID" minOccurs="0"/>
 *         &lt;element name="removedReplicationSets" type="{}replicationSetUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="replicationSetsChanges" type="{}replicationSetSettingsChangesParam" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupSettingsChangesParam", propOrder = {
    "copiesChanges",
    "enableGroup",
    "groupUID",
    "removedReplicationSets",
    "replicationSetsChanges",
    "startTransfer"
})
public class ConsistencyGroupSettingsChangesParam {

    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopySettingsChangesParam> copiesChanges;
    protected Boolean enableGroup;
    protected ConsistencyGroupUID groupUID;
    @XmlElement(nillable = true)
    protected List<ReplicationSetUID> removedReplicationSets;
    @XmlElement(nillable = true)
    protected List<ReplicationSetSettingsChangesParam> replicationSetsChanges;
    protected Boolean startTransfer;

    /**
     * Gets the value of the copiesChanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copiesChanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopiesChanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupCopySettingsChangesParam }
     * 
     * 
     */
    public List<ConsistencyGroupCopySettingsChangesParam> getCopiesChanges() {
        if (copiesChanges == null) {
            copiesChanges = new ArrayList<ConsistencyGroupCopySettingsChangesParam>();
        }
        return this.copiesChanges;
    }

    /**
     * Gets the value of the enableGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableGroup() {
        return enableGroup;
    }

    /**
     * Sets the value of the enableGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableGroup(Boolean value) {
        this.enableGroup = value;
    }

    /**
     * Gets the value of the groupUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupUID }
     *     
     */
    public ConsistencyGroupUID getGroupUID() {
        return groupUID;
    }

    /**
     * Sets the value of the groupUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupUID }
     *     
     */
    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }

    /**
     * Gets the value of the removedReplicationSets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removedReplicationSets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemovedReplicationSets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReplicationSetUID }
     * 
     * 
     */
    public List<ReplicationSetUID> getRemovedReplicationSets() {
        if (removedReplicationSets == null) {
            removedReplicationSets = new ArrayList<ReplicationSetUID>();
        }
        return this.removedReplicationSets;
    }

    /**
     * Gets the value of the replicationSetsChanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replicationSetsChanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplicationSetsChanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReplicationSetSettingsChangesParam }
     * 
     * 
     */
    public List<ReplicationSetSettingsChangesParam> getReplicationSetsChanges() {
        if (replicationSetsChanges == null) {
            replicationSetsChanges = new ArrayList<ReplicationSetSettingsChangesParam>();
        }
        return this.replicationSetsChanges;
    }

    /**
     * Gets the value of the startTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartTransfer() {
        return startTransfer;
    }

    /**
     * Sets the value of the startTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartTransfer(Boolean value) {
        this.startTransfer = value;
    }

}
