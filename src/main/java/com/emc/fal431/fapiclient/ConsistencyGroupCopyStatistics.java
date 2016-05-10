
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupCopyStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupCopyStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="averageIncomingThroughput" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="averageIncomingWrites" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="copyUID" type="{}consistencyGroupCopyUID" minOccurs="0"/>
 *         &lt;element name="incomingThroughput" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="incomingWrites" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="journalStatistics" type="{}consistencyGroupCopyJournalStatistics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupCopyStatistics", propOrder = {
    "averageIncomingThroughput",
    "averageIncomingWrites",
    "copyUID",
    "incomingThroughput",
    "incomingWrites",
    "journalStatistics"
})
public class ConsistencyGroupCopyStatistics {

    protected long averageIncomingThroughput;
    protected long averageIncomingWrites;
    protected ConsistencyGroupCopyUID copyUID;
    protected long incomingThroughput;
    protected long incomingWrites;
    protected ConsistencyGroupCopyJournalStatistics journalStatistics;

    /**
     * Gets the value of the averageIncomingThroughput property.
     * 
     */
    public long getAverageIncomingThroughput() {
        return averageIncomingThroughput;
    }

    /**
     * Sets the value of the averageIncomingThroughput property.
     * 
     */
    public void setAverageIncomingThroughput(long value) {
        this.averageIncomingThroughput = value;
    }

    /**
     * Gets the value of the averageIncomingWrites property.
     * 
     */
    public long getAverageIncomingWrites() {
        return averageIncomingWrites;
    }

    /**
     * Sets the value of the averageIncomingWrites property.
     * 
     */
    public void setAverageIncomingWrites(long value) {
        this.averageIncomingWrites = value;
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
     * Gets the value of the incomingThroughput property.
     * 
     */
    public long getIncomingThroughput() {
        return incomingThroughput;
    }

    /**
     * Sets the value of the incomingThroughput property.
     * 
     */
    public void setIncomingThroughput(long value) {
        this.incomingThroughput = value;
    }

    /**
     * Gets the value of the incomingWrites property.
     * 
     */
    public long getIncomingWrites() {
        return incomingWrites;
    }

    /**
     * Sets the value of the incomingWrites property.
     * 
     */
    public void setIncomingWrites(long value) {
        this.incomingWrites = value;
    }

    /**
     * Gets the value of the journalStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupCopyJournalStatistics }
     *     
     */
    public ConsistencyGroupCopyJournalStatistics getJournalStatistics() {
        return journalStatistics;
    }

    /**
     * Sets the value of the journalStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupCopyJournalStatistics }
     *     
     */
    public void setJournalStatistics(ConsistencyGroupCopyJournalStatistics value) {
        this.journalStatistics = value;
    }

}
