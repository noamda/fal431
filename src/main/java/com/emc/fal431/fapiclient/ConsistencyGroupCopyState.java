
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupCopyState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupCopyState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessedImage" type="{}snapshot" minOccurs="0"/>
 *         &lt;element name="activePrimaryRPA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="activeSecondaryRPAsList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}axxanaCopyStatus" minOccurs="0"/>
 *         &lt;element ref="{}consolidationProgress" minOccurs="0"/>
 *         &lt;element name="copyUID" type="{}consistencyGroupCopyUID" minOccurs="0"/>
 *         &lt;element name="distributedFirstSnapshot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{}journalState" minOccurs="0"/>
 *         &lt;element name="regulated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{}splitVariant" minOccurs="0"/>
 *         &lt;element name="stateUnknown" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{}storageAccessState" minOccurs="0"/>
 *         &lt;element name="suspended" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tspWritesCleared" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupCopyState", propOrder = {
    "accessedImage",
    "activePrimaryRPA",
    "activeSecondaryRPAsList",
    "axxanaCopyStatus",
    "consolidationProgress",
    "copyUID",
    "distributedFirstSnapshot",
    "enabled",
    "journalState",
    "regulated",
    "splitVariant",
    "stateUnknown",
    "storageAccessState",
    "suspended",
    "tspWritesCleared"
})
public class ConsistencyGroupCopyState {

    protected Snapshot accessedImage;
    protected int activePrimaryRPA;
    @XmlElement(nillable = true)
    protected List<Integer> activeSecondaryRPAsList;
    protected AxxanaCopyStatus axxanaCopyStatus;
    protected ConsolidationProgress consolidationProgress;
    protected ConsistencyGroupCopyUID copyUID;
    protected Boolean distributedFirstSnapshot;
    protected boolean enabled;
    protected JournalState journalState;
    protected boolean regulated;
    protected SplitVariant splitVariant;
    protected boolean stateUnknown;
    protected StorageAccessState storageAccessState;
    protected boolean suspended;
    protected Boolean tspWritesCleared;

    /**
     * Gets the value of the accessedImage property.
     * 
     * @return
     *     possible object is
     *     {@link Snapshot }
     *     
     */
    public Snapshot getAccessedImage() {
        return accessedImage;
    }

    /**
     * Sets the value of the accessedImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Snapshot }
     *     
     */
    public void setAccessedImage(Snapshot value) {
        this.accessedImage = value;
    }

    /**
     * Gets the value of the activePrimaryRPA property.
     * 
     */
    public int getActivePrimaryRPA() {
        return activePrimaryRPA;
    }

    /**
     * Sets the value of the activePrimaryRPA property.
     * 
     */
    public void setActivePrimaryRPA(int value) {
        this.activePrimaryRPA = value;
    }

    /**
     * Gets the value of the activeSecondaryRPAsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activeSecondaryRPAsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActiveSecondaryRPAsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getActiveSecondaryRPAsList() {
        if (activeSecondaryRPAsList == null) {
            activeSecondaryRPAsList = new ArrayList<Integer>();
        }
        return this.activeSecondaryRPAsList;
    }

    /**
     * Gets the value of the axxanaCopyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AxxanaCopyStatus }
     *     
     */
    public AxxanaCopyStatus getAxxanaCopyStatus() {
        return axxanaCopyStatus;
    }

    /**
     * Sets the value of the axxanaCopyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AxxanaCopyStatus }
     *     
     */
    public void setAxxanaCopyStatus(AxxanaCopyStatus value) {
        this.axxanaCopyStatus = value;
    }

    /**
     * Gets the value of the consolidationProgress property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidationProgress }
     *     
     */
    public ConsolidationProgress getConsolidationProgress() {
        return consolidationProgress;
    }

    /**
     * Sets the value of the consolidationProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidationProgress }
     *     
     */
    public void setConsolidationProgress(ConsolidationProgress value) {
        this.consolidationProgress = value;
    }

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
     * Gets the value of the distributedFirstSnapshot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistributedFirstSnapshot() {
        return distributedFirstSnapshot;
    }

    /**
     * Sets the value of the distributedFirstSnapshot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistributedFirstSnapshot(Boolean value) {
        this.distributedFirstSnapshot = value;
    }

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
     * Gets the value of the journalState property.
     * 
     * @return
     *     possible object is
     *     {@link JournalState }
     *     
     */
    public JournalState getJournalState() {
        return journalState;
    }

    /**
     * Sets the value of the journalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalState }
     *     
     */
    public void setJournalState(JournalState value) {
        this.journalState = value;
    }

    /**
     * Gets the value of the regulated property.
     * 
     */
    public boolean isRegulated() {
        return regulated;
    }

    /**
     * Sets the value of the regulated property.
     * 
     */
    public void setRegulated(boolean value) {
        this.regulated = value;
    }

    /**
     * Gets the value of the splitVariant property.
     * 
     * @return
     *     possible object is
     *     {@link SplitVariant }
     *     
     */
    public SplitVariant getSplitVariant() {
        return splitVariant;
    }

    /**
     * Sets the value of the splitVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitVariant }
     *     
     */
    public void setSplitVariant(SplitVariant value) {
        this.splitVariant = value;
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

    /**
     * Gets the value of the storageAccessState property.
     * 
     * @return
     *     possible object is
     *     {@link StorageAccessState }
     *     
     */
    public StorageAccessState getStorageAccessState() {
        return storageAccessState;
    }

    /**
     * Sets the value of the storageAccessState property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageAccessState }
     *     
     */
    public void setStorageAccessState(StorageAccessState value) {
        this.storageAccessState = value;
    }

    /**
     * Gets the value of the suspended property.
     * 
     */
    public boolean isSuspended() {
        return suspended;
    }

    /**
     * Sets the value of the suspended property.
     * 
     */
    public void setSuspended(boolean value) {
        this.suspended = value;
    }

    /**
     * Gets the value of the tspWritesCleared property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTspWritesCleared() {
        return tspWritesCleared;
    }

    /**
     * Sets the value of the tspWritesCleared property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTspWritesCleared(Boolean value) {
        this.tspWritesCleared = value;
    }

}
