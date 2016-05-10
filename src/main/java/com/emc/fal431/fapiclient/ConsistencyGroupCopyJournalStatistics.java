
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupCopyJournalStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupCopyJournalStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualJournalSizeInBytes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="actualJournalUsageInBytes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="consolidationStatistics" type="{}snapshotConsolidationStatistics" minOccurs="0"/>
 *         &lt;element name="distributionFinished" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fastForward" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="imageAccessSizeLeftInBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="imageAccessTimeLeftInSeconds" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="imageAccessTotalSizeInBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="journalLagInBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="movingFrom" type="{}recoverPointTimeStamp" minOccurs="0"/>
 *         &lt;element name="movingTo" type="{}recoverPointTimeStamp" minOccurs="0"/>
 *         &lt;element name="tspUsageInBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tspUsagePercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupCopyJournalStatistics", propOrder = {
    "actualJournalSizeInBytes",
    "actualJournalUsageInBytes",
    "consolidationStatistics",
    "distributionFinished",
    "fastForward",
    "imageAccessSizeLeftInBytes",
    "imageAccessTimeLeftInSeconds",
    "imageAccessTotalSizeInBytes",
    "journalLagInBytes",
    "movingFrom",
    "movingTo",
    "tspUsageInBytes",
    "tspUsagePercentage"
})
public class ConsistencyGroupCopyJournalStatistics {

    protected long actualJournalSizeInBytes;
    protected long actualJournalUsageInBytes;
    protected SnapshotConsolidationStatistics consolidationStatistics;
    protected Boolean distributionFinished;
    protected boolean fastForward;
    protected Long imageAccessSizeLeftInBytes;
    protected Long imageAccessTimeLeftInSeconds;
    protected Long imageAccessTotalSizeInBytes;
    protected Long journalLagInBytes;
    protected RecoverPointTimeStamp movingFrom;
    protected RecoverPointTimeStamp movingTo;
    protected Long tspUsageInBytes;
    protected Double tspUsagePercentage;

    /**
     * Gets the value of the actualJournalSizeInBytes property.
     * 
     */
    public long getActualJournalSizeInBytes() {
        return actualJournalSizeInBytes;
    }

    /**
     * Sets the value of the actualJournalSizeInBytes property.
     * 
     */
    public void setActualJournalSizeInBytes(long value) {
        this.actualJournalSizeInBytes = value;
    }

    /**
     * Gets the value of the actualJournalUsageInBytes property.
     * 
     */
    public long getActualJournalUsageInBytes() {
        return actualJournalUsageInBytes;
    }

    /**
     * Sets the value of the actualJournalUsageInBytes property.
     * 
     */
    public void setActualJournalUsageInBytes(long value) {
        this.actualJournalUsageInBytes = value;
    }

    /**
     * Gets the value of the consolidationStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link SnapshotConsolidationStatistics }
     *     
     */
    public SnapshotConsolidationStatistics getConsolidationStatistics() {
        return consolidationStatistics;
    }

    /**
     * Sets the value of the consolidationStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnapshotConsolidationStatistics }
     *     
     */
    public void setConsolidationStatistics(SnapshotConsolidationStatistics value) {
        this.consolidationStatistics = value;
    }

    /**
     * Gets the value of the distributionFinished property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistributionFinished() {
        return distributionFinished;
    }

    /**
     * Sets the value of the distributionFinished property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistributionFinished(Boolean value) {
        this.distributionFinished = value;
    }

    /**
     * Gets the value of the fastForward property.
     * 
     */
    public boolean isFastForward() {
        return fastForward;
    }

    /**
     * Sets the value of the fastForward property.
     * 
     */
    public void setFastForward(boolean value) {
        this.fastForward = value;
    }

    /**
     * Gets the value of the imageAccessSizeLeftInBytes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImageAccessSizeLeftInBytes() {
        return imageAccessSizeLeftInBytes;
    }

    /**
     * Sets the value of the imageAccessSizeLeftInBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImageAccessSizeLeftInBytes(Long value) {
        this.imageAccessSizeLeftInBytes = value;
    }

    /**
     * Gets the value of the imageAccessTimeLeftInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImageAccessTimeLeftInSeconds() {
        return imageAccessTimeLeftInSeconds;
    }

    /**
     * Sets the value of the imageAccessTimeLeftInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImageAccessTimeLeftInSeconds(Long value) {
        this.imageAccessTimeLeftInSeconds = value;
    }

    /**
     * Gets the value of the imageAccessTotalSizeInBytes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImageAccessTotalSizeInBytes() {
        return imageAccessTotalSizeInBytes;
    }

    /**
     * Sets the value of the imageAccessTotalSizeInBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImageAccessTotalSizeInBytes(Long value) {
        this.imageAccessTotalSizeInBytes = value;
    }

    /**
     * Gets the value of the journalLagInBytes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getJournalLagInBytes() {
        return journalLagInBytes;
    }

    /**
     * Sets the value of the journalLagInBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setJournalLagInBytes(Long value) {
        this.journalLagInBytes = value;
    }

    /**
     * Gets the value of the movingFrom property.
     * 
     * @return
     *     possible object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public RecoverPointTimeStamp getMovingFrom() {
        return movingFrom;
    }

    /**
     * Sets the value of the movingFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public void setMovingFrom(RecoverPointTimeStamp value) {
        this.movingFrom = value;
    }

    /**
     * Gets the value of the movingTo property.
     * 
     * @return
     *     possible object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public RecoverPointTimeStamp getMovingTo() {
        return movingTo;
    }

    /**
     * Sets the value of the movingTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public void setMovingTo(RecoverPointTimeStamp value) {
        this.movingTo = value;
    }

    /**
     * Gets the value of the tspUsageInBytes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTspUsageInBytes() {
        return tspUsageInBytes;
    }

    /**
     * Sets the value of the tspUsageInBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTspUsageInBytes(Long value) {
        this.tspUsageInBytes = value;
    }

    /**
     * Gets the value of the tspUsagePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTspUsagePercentage() {
        return tspUsagePercentage;
    }

    /**
     * Sets the value of the tspUsagePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTspUsagePercentage(Double value) {
        this.tspUsagePercentage = value;
    }

}
