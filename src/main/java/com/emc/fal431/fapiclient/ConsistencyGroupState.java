
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="groupCopiesState" type="{}consistencyGroupCopyState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groupUID" type="{}consistencyGroupUID" minOccurs="0"/>
 *         &lt;element name="linksState" type="{}consistencyGroupLinkState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="runningAsDistributedGroup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sourceCopyUID" type="{}consistencyGroupCopyUID" minOccurs="0"/>
 *         &lt;element name="stateUnknown" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupState", propOrder = {
    "enabled",
    "groupCopiesState",
    "groupUID",
    "linksState",
    "runningAsDistributedGroup",
    "sourceCopyUID",
    "stateUnknown"
})
public class ConsistencyGroupState {

    protected boolean enabled;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyState> groupCopiesState;
    protected ConsistencyGroupUID groupUID;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupLinkState> linksState;
    protected boolean runningAsDistributedGroup;
    protected ConsistencyGroupCopyUID sourceCopyUID;
    protected boolean stateUnknown;

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the groupCopiesState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupCopiesState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupCopiesState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupCopyState }
     * 
     * 
     */
    public List<ConsistencyGroupCopyState> getGroupCopiesState() {
        if (groupCopiesState == null) {
            groupCopiesState = new ArrayList<ConsistencyGroupCopyState>();
        }
        return this.groupCopiesState;
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
     * Gets the value of the linksState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linksState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinksState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupLinkState }
     * 
     * 
     */
    public List<ConsistencyGroupLinkState> getLinksState() {
        if (linksState == null) {
            linksState = new ArrayList<ConsistencyGroupLinkState>();
        }
        return this.linksState;
    }

    /**
     * Gets the value of the runningAsDistributedGroup property.
     * 
     */
    public boolean isRunningAsDistributedGroup() {
        return runningAsDistributedGroup;
    }

    /**
     * Sets the value of the runningAsDistributedGroup property.
     * 
     */
    public void setRunningAsDistributedGroup(boolean value) {
        this.runningAsDistributedGroup = value;
    }

    /**
     * Gets the value of the sourceCopyUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public ConsistencyGroupCopyUID getSourceCopyUID() {
        return sourceCopyUID;
    }

    /**
     * Sets the value of the sourceCopyUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public void setSourceCopyUID(ConsistencyGroupCopyUID value) {
        this.sourceCopyUID = value;
    }

    /**
     * Gets the value of the stateUnknown property.
     * 
     */
    public boolean isStateUnknown() {
        return stateUnknown;
    }

    /**
     * Sets the value of the stateUnknown property.
     * 
     */
    public void setStateUnknown(boolean value) {
        this.stateUnknown = value;
    }

}
