
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for snapshot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="snapshot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="closingTimeStamp" type="{}recoverPointTimeStamp" minOccurs="0"/>
 *         &lt;element name="consistencyType" type="{}snapshotConsistencyType" minOccurs="0"/>
 *         &lt;element name="consolidationInfo" type="{}snapshotConsolidationInfo" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relevantEvent" type="{}eventLog" minOccurs="0"/>
 *         &lt;element name="sizeInBytes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{}snapshotUID" minOccurs="0"/>
 *         &lt;element name="uncompressedSizeInBytes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userSnapshot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "snapshot", propOrder = {
    "closingTimeStamp",
    "consistencyType",
    "consolidationInfo",
    "description",
    "relevantEvent",
    "sizeInBytes",
    "snapshotUID",
    "uncompressedSizeInBytes",
    "userSnapshot"
})
public class Snapshot {

    protected RecoverPointTimeStamp closingTimeStamp;
    protected SnapshotConsistencyType consistencyType;
    protected SnapshotConsolidationInfo consolidationInfo;
    protected String description;
    protected EventLog relevantEvent;
    protected long sizeInBytes;
    protected SnapshotUID snapshotUID;
    protected long uncompressedSizeInBytes;
    protected boolean userSnapshot;

    /**
     * Gets the value of the closingTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public RecoverPointTimeStamp getClosingTimeStamp() {
        return closingTimeStamp;
    }

    /**
     * Sets the value of the closingTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public void setClosingTimeStamp(RecoverPointTimeStamp value) {
        this.closingTimeStamp = value;
    }

    /**
     * Gets the value of the consistencyType property.
     * 
     * @return
     *     possible object is
     *     {@link SnapshotConsistencyType }
     *     
     */
    public SnapshotConsistencyType getConsistencyType() {
        return consistencyType;
    }

    /**
     * Sets the value of the consistencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapshotConsistencyType }
     *     
     */
    public void setConsistencyType(SnapshotConsistencyType value) {
        this.consistencyType = value;
    }

    /**
     * Gets the value of the consolidationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SnapshotConsolidationInfo }
     *     
     */
    public SnapshotConsolidationInfo getConsolidationInfo() {
        return consolidationInfo;
    }

    /**
     * Sets the value of the consolidationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapshotConsolidationInfo }
     *     
     */
    public void setConsolidationInfo(SnapshotConsolidationInfo value) {
        this.consolidationInfo = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the relevantEvent property.
     * 
     * @return
     *     possible object is
     *     {@link EventLog }
     *     
     */
    public EventLog getRelevantEvent() {
        return relevantEvent;
    }

    /**
     * Sets the value of the relevantEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventLog }
     *     
     */
    public void setRelevantEvent(EventLog value) {
        this.relevantEvent = value;
    }

    /**
     * Gets the value of the sizeInBytes property.
     * 
     */
    public long getSizeInBytes() {
        return sizeInBytes;
    }

    /**
     * Sets the value of the sizeInBytes property.
     * 
     */
    public void setSizeInBytes(long value) {
        this.sizeInBytes = value;
    }

    /**
     * Gets the value of the snapshotUID property.
     * 
     * @return
     *     possible object is
     *     {@link SnapshotUID }
     *     
     */
    public SnapshotUID getSnapshotUID() {
        return snapshotUID;
    }

    /**
     * Sets the value of the snapshotUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapshotUID }
     *     
     */
    public void setSnapshotUID(SnapshotUID value) {
        this.snapshotUID = value;
    }

    /**
     * Gets the value of the uncompressedSizeInBytes property.
     * 
     */
    public long getUncompressedSizeInBytes() {
        return uncompressedSizeInBytes;
    }

    /**
     * Sets the value of the uncompressedSizeInBytes property.
     * 
     */
    public void setUncompressedSizeInBytes(long value) {
        this.uncompressedSizeInBytes = value;
    }

    /**
     * Gets the value of the userSnapshot property.
     * 
     */
    public boolean isUserSnapshot() {
        return userSnapshot;
    }

    /**
     * Sets the value of the userSnapshot property.
     * 
     */
    public void setUserSnapshot(boolean value) {
        this.userSnapshot = value;
    }

}
