
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupCopySnapshots complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupCopySnapshots">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualJournalCapacity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="averageCompression" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="copyUID" type="{}consistencyGroupCopyUID" minOccurs="0"/>
 *         &lt;element name="earliest" type="{}recoverPointTimeStamp" minOccurs="0"/>
 *         &lt;element name="journalUsage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="latest" type="{}recoverPointTimeStamp" minOccurs="0"/>
 *         &lt;element name="protectionWindows" type="{}protectionWindowsInfo" minOccurs="0"/>
 *         &lt;element name="snapshots" type="{}snapshot" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupCopySnapshots", propOrder = {
    "actualJournalCapacity",
    "averageCompression",
    "copyUID",
    "earliest",
    "journalUsage",
    "latest",
    "protectionWindows",
    "snapshots"
})
public class ConsistencyGroupCopySnapshots {

    protected Double actualJournalCapacity;
    protected Double averageCompression;
    protected ConsistencyGroupCopyUID copyUID;
    protected RecoverPointTimeStamp earliest;
    protected Long journalUsage;
    protected RecoverPointTimeStamp latest;
    protected ProtectionWindowsInfo protectionWindows;
    @XmlElement(nillable = true)
    protected List<Snapshot> snapshots;

    /**
     * Gets the value of the actualJournalCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualJournalCapacity() {
        return actualJournalCapacity;
    }

    /**
     * Sets the value of the actualJournalCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualJournalCapacity(Double value) {
        this.actualJournalCapacity = value;
    }

    /**
     * Gets the value of the averageCompression property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageCompression() {
        return averageCompression;
    }

    /**
     * Sets the value of the averageCompression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageCompression(Double value) {
        this.averageCompression = value;
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
     * Gets the value of the earliest property.
     * 
     * @return
     *     possible object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public RecoverPointTimeStamp getEarliest() {
        return earliest;
    }

    /**
     * Sets the value of the earliest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public void setEarliest(RecoverPointTimeStamp value) {
        this.earliest = value;
    }

    /**
     * Gets the value of the journalUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getJournalUsage() {
        return journalUsage;
    }

    /**
     * Sets the value of the journalUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setJournalUsage(Long value) {
        this.journalUsage = value;
    }

    /**
     * Gets the value of the latest property.
     * 
     * @return
     *     possible object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public RecoverPointTimeStamp getLatest() {
        return latest;
    }

    /**
     * Sets the value of the latest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public void setLatest(RecoverPointTimeStamp value) {
        this.latest = value;
    }

    /**
     * Gets the value of the protectionWindows property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionWindowsInfo }
     *     
     */
    public ProtectionWindowsInfo getProtectionWindows() {
        return protectionWindows;
    }

    /**
     * Sets the value of the protectionWindows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionWindowsInfo }
     *     
     */
    public void setProtectionWindows(ProtectionWindowsInfo value) {
        this.protectionWindows = value;
    }

    /**
     * Gets the value of the snapshots property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the snapshots property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSnapshots().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Snapshot }
     * 
     * 
     */
    public List<Snapshot> getSnapshots() {
        if (snapshots == null) {
            snapshots = new ArrayList<Snapshot>();
        }
        return this.snapshots;
    }

}
