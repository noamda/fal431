
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for linkProtectionPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="linkProtectionPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bandwidthLimit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="compression" type="{}wanCompression" minOccurs="0"/>
 *         &lt;element name="deduplication" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="measureLagToTargetRPA" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="protectionType" type="{}protectionMode" minOccurs="0"/>
 *         &lt;element name="replicatingOverWAN" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{}rpoPolicy" minOccurs="0"/>
 *         &lt;element name="syncReplicationLatencyThresholds" type="{}syncReplicationThreshold" minOccurs="0"/>
 *         &lt;element name="syncReplicationThroughputThresholds" type="{}syncReplicationThreshold" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkProtectionPolicy", propOrder = {
    "bandwidthLimit",
    "compression",
    "deduplication",
    "measureLagToTargetRPA",
    "protectionType",
    "replicatingOverWAN",
    "rpoPolicy",
    "syncReplicationLatencyThresholds",
    "syncReplicationThroughputThresholds",
    "weight"
})
public class LinkProtectionPolicy {

    protected double bandwidthLimit;
    protected WanCompression compression;
    protected boolean deduplication;
    protected boolean measureLagToTargetRPA;
    protected ProtectionMode protectionType;
    protected boolean replicatingOverWAN;
    protected RpoPolicy rpoPolicy;
    protected SyncReplicationThreshold syncReplicationLatencyThresholds;
    protected SyncReplicationThreshold syncReplicationThroughputThresholds;
    protected int weight;

    /**
     * Gets the value of the bandwidthLimit property.
     * 
     */
    public double getBandwidthLimit() {
        return bandwidthLimit;
    }

    /**
     * Sets the value of the bandwidthLimit property.
     * 
     */
    public void setBandwidthLimit(double value) {
        this.bandwidthLimit = value;
    }

    /**
     * Gets the value of the compression property.
     * 
     * @return
     *     possible object is
     *     {@link WanCompression }
     *     
     */
    public WanCompression getCompression() {
        return compression;
    }

    /**
     * Sets the value of the compression property.
     * 
     * @param value
     *     allowed object is
     *     {@link WanCompression }
     *     
     */
    public void setCompression(WanCompression value) {
        this.compression = value;
    }

    /**
     * Gets the value of the deduplication property.
     * 
     */
    public boolean isDeduplication() {
        return deduplication;
    }

    /**
     * Sets the value of the deduplication property.
     * 
     */
    public void setDeduplication(boolean value) {
        this.deduplication = value;
    }

    /**
     * Gets the value of the measureLagToTargetRPA property.
     * 
     */
    public boolean isMeasureLagToTargetRPA() {
        return measureLagToTargetRPA;
    }

    /**
     * Sets the value of the measureLagToTargetRPA property.
     * 
     */
    public void setMeasureLagToTargetRPA(boolean value) {
        this.measureLagToTargetRPA = value;
    }

    /**
     * Gets the value of the protectionType property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionMode }
     *     
     */
    public ProtectionMode getProtectionType() {
        return protectionType;
    }

    /**
     * Sets the value of the protectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionMode }
     *     
     */
    public void setProtectionType(ProtectionMode value) {
        this.protectionType = value;
    }

    /**
     * Gets the value of the replicatingOverWAN property.
     * 
     */
    public boolean isReplicatingOverWAN() {
        return replicatingOverWAN;
    }

    /**
     * Sets the value of the replicatingOverWAN property.
     * 
     */
    public void setReplicatingOverWAN(boolean value) {
        this.replicatingOverWAN = value;
    }

    /**
     * Gets the value of the rpoPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link RpoPolicy }
     *     
     */
    public RpoPolicy getRpoPolicy() {
        return rpoPolicy;
    }

    /**
     * Sets the value of the rpoPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link RpoPolicy }
     *     
     */
    public void setRpoPolicy(RpoPolicy value) {
        this.rpoPolicy = value;
    }

    /**
     * Gets the value of the syncReplicationLatencyThresholds property.
     * 
     * @return
     *     possible object is
     *     {@link SyncReplicationThreshold }
     *     
     */
    public SyncReplicationThreshold getSyncReplicationLatencyThresholds() {
        return syncReplicationLatencyThresholds;
    }

    /**
     * Sets the value of the syncReplicationLatencyThresholds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncReplicationThreshold }
     *     
     */
    public void setSyncReplicationLatencyThresholds(SyncReplicationThreshold value) {
        this.syncReplicationLatencyThresholds = value;
    }

    /**
     * Gets the value of the syncReplicationThroughputThresholds property.
     * 
     * @return
     *     possible object is
     *     {@link SyncReplicationThreshold }
     *     
     */
    public SyncReplicationThreshold getSyncReplicationThroughputThresholds() {
        return syncReplicationThroughputThresholds;
    }

    /**
     * Sets the value of the syncReplicationThroughputThresholds property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncReplicationThreshold }
     *     
     */
    public void setSyncReplicationThroughputThresholds(SyncReplicationThreshold value) {
        this.syncReplicationThroughputThresholds = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(int value) {
        this.weight = value;
    }

}
