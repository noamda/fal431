
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupLinkPipeStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupLinkPipeStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="averageDeduplicationRatio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="averageJournalCompressionRatio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="compressionRatio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="deduplicationRatio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="detachData" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="detachDataRate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lag" type="{}statisticsCounters" minOccurs="0"/>
 *         &lt;element name="numberOfGrids" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="outgoingThroughput" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="outgoingThroughputPerRPA" type="{}outgoingThroughputStatistics" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}replicationMode" minOccurs="0"/>
 *         &lt;element name="syncRemoteLink" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupLinkPipeStatistics", propOrder = {
    "averageDeduplicationRatio",
    "averageJournalCompressionRatio",
    "compressionRatio",
    "deduplicationRatio",
    "detachData",
    "detachDataRate",
    "lag",
    "numberOfGrids",
    "outgoingThroughput",
    "outgoingThroughputPerRPA",
    "replicationMode",
    "syncRemoteLink"
})
public class ConsistencyGroupLinkPipeStatistics {

    protected double averageDeduplicationRatio;
    protected double averageJournalCompressionRatio;
    protected double compressionRatio;
    protected double deduplicationRatio;
    protected Long detachData;
    protected Long detachDataRate;
    protected StatisticsCounters lag;
    protected int numberOfGrids;
    protected long outgoingThroughput;
    @XmlElement(nillable = true)
    protected List<OutgoingThroughputStatistics> outgoingThroughputPerRPA;
    protected ReplicationMode replicationMode;
    protected boolean syncRemoteLink;

    /**
     * Gets the value of the averageDeduplicationRatio property.
     * 
     */
    public double getAverageDeduplicationRatio() {
        return averageDeduplicationRatio;
    }

    /**
     * Sets the value of the averageDeduplicationRatio property.
     * 
     */
    public void setAverageDeduplicationRatio(double value) {
        this.averageDeduplicationRatio = value;
    }

    /**
     * Gets the value of the averageJournalCompressionRatio property.
     * 
     */
    public double getAverageJournalCompressionRatio() {
        return averageJournalCompressionRatio;
    }

    /**
     * Sets the value of the averageJournalCompressionRatio property.
     * 
     */
    public void setAverageJournalCompressionRatio(double value) {
        this.averageJournalCompressionRatio = value;
    }

    /**
     * Gets the value of the compressionRatio property.
     * 
     */
    public double getCompressionRatio() {
        return compressionRatio;
    }

    /**
     * Sets the value of the compressionRatio property.
     * 
     */
    public void setCompressionRatio(double value) {
        this.compressionRatio = value;
    }

    /**
     * Gets the value of the deduplicationRatio property.
     * 
     */
    public double getDeduplicationRatio() {
        return deduplicationRatio;
    }

    /**
     * Sets the value of the deduplicationRatio property.
     * 
     */
    public void setDeduplicationRatio(double value) {
        this.deduplicationRatio = value;
    }

    /**
     * Gets the value of the detachData property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDetachData() {
        return detachData;
    }

    /**
     * Sets the value of the detachData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDetachData(Long value) {
        this.detachData = value;
    }

    /**
     * Gets the value of the detachDataRate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDetachDataRate() {
        return detachDataRate;
    }

    /**
     * Sets the value of the detachDataRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDetachDataRate(Long value) {
        this.detachDataRate = value;
    }

    /**
     * Gets the value of the lag property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsCounters }
     *     
     */
    public StatisticsCounters getLag() {
        return lag;
    }

    /**
     * Sets the value of the lag property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsCounters }
     *     
     */
    public void setLag(StatisticsCounters value) {
        this.lag = value;
    }

    /**
     * Gets the value of the numberOfGrids property.
     * 
     */
    public int getNumberOfGrids() {
        return numberOfGrids;
    }

    /**
     * Sets the value of the numberOfGrids property.
     * 
     */
    public void setNumberOfGrids(int value) {
        this.numberOfGrids = value;
    }

    /**
     * Gets the value of the outgoingThroughput property.
     * 
     */
    public long getOutgoingThroughput() {
        return outgoingThroughput;
    }

    /**
     * Sets the value of the outgoingThroughput property.
     * 
     */
    public void setOutgoingThroughput(long value) {
        this.outgoingThroughput = value;
    }

    /**
     * Gets the value of the outgoingThroughputPerRPA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outgoingThroughputPerRPA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutgoingThroughputPerRPA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutgoingThroughputStatistics }
     * 
     * 
     */
    public List<OutgoingThroughputStatistics> getOutgoingThroughputPerRPA() {
        if (outgoingThroughputPerRPA == null) {
            outgoingThroughputPerRPA = new ArrayList<OutgoingThroughputStatistics>();
        }
        return this.outgoingThroughputPerRPA;
    }

    /**
     * Gets the value of the replicationMode property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicationMode }
     *     
     */
    public ReplicationMode getReplicationMode() {
        return replicationMode;
    }

    /**
     * Sets the value of the replicationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicationMode }
     *     
     */
    public void setReplicationMode(ReplicationMode value) {
        this.replicationMode = value;
    }

    /**
     * Gets the value of the syncRemoteLink property.
     * 
     */
    public boolean isSyncRemoteLink() {
        return syncRemoteLink;
    }

    /**
     * Sets the value of the syncRemoteLink property.
     * 
     */
    public void setSyncRemoteLink(boolean value) {
        this.syncRemoteLink = value;
    }

}
