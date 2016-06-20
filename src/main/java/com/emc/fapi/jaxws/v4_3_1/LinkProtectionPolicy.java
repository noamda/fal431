package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkProtectionPolicy", propOrder = {"protectionType", "syncReplicationLatencyThresholds", "syncReplicationThroughputThresholds", "rpoPolicy", "replicatingOverWAN", "compression", "bandwidthLimit", "measureLagToTargetRPA", "deduplication", "weight"})
public class LinkProtectionPolicy {
    @XmlElement(required = true)
    protected ProtectionMode protectionType;
    @XmlElement(required = true)
    protected SyncReplicationThreshold syncReplicationLatencyThresholds;
    @XmlElement(required = true)
    protected SyncReplicationThreshold syncReplicationThroughputThresholds;
    @XmlElement(required = true, nillable = true)
    protected RPOPolicy rpoPolicy;
    protected boolean replicatingOverWAN;
    @XmlElement(required = true)
    protected WanCompression compression;
    protected double bandwidthLimit;
    protected boolean measureLagToTargetRPA;
    protected boolean deduplication;
    protected int weight;

    public LinkProtectionPolicy() {
    }

    public LinkProtectionPolicy(ProtectionMode protectionType, SyncReplicationThreshold syncReplicationLatencyThresholds, SyncReplicationThreshold syncReplicationThroughputThresholds, RPOPolicy rpoPolicy, boolean replicatingOverWAN, WanCompression compression, double bandwidthLimit, boolean measureLagToTargetRPA, boolean deduplication, int weight) {
        this.protectionType = protectionType;
        this.syncReplicationLatencyThresholds = syncReplicationLatencyThresholds;
        this.syncReplicationThroughputThresholds = syncReplicationThroughputThresholds;
        this.rpoPolicy = rpoPolicy;
        this.replicatingOverWAN = replicatingOverWAN;
        this.compression = compression;
        this.bandwidthLimit = bandwidthLimit;
        this.measureLagToTargetRPA = measureLagToTargetRPA;
        this.deduplication = deduplication;
        this.weight = weight;
    }


    public ProtectionMode getProtectionType() {
        return this.protectionType;
    }


    public void setProtectionType(ProtectionMode value) {
        this.protectionType = value;
    }


    public SyncReplicationThreshold getSyncReplicationLatencyThresholds() {
        return this.syncReplicationLatencyThresholds;
    }


    public void setSyncReplicationLatencyThresholds(SyncReplicationThreshold value) {
        this.syncReplicationLatencyThresholds = value;
    }


    public SyncReplicationThreshold getSyncReplicationThroughputThresholds() {
        return this.syncReplicationThroughputThresholds;
    }


    public void setSyncReplicationThroughputThresholds(SyncReplicationThreshold value) {
        this.syncReplicationThroughputThresholds = value;
    }


    public RPOPolicy getRpoPolicy() {
        return this.rpoPolicy;
    }


    public void setRpoPolicy(RPOPolicy value) {
        this.rpoPolicy = value;
    }


    public boolean isReplicatingOverWAN() {
        return this.replicatingOverWAN;
    }


    public void setReplicatingOverWAN(boolean value) {
        this.replicatingOverWAN = value;
    }


    public WanCompression getCompression() {
        return this.compression;
    }


    public void setCompression(WanCompression value) {
        this.compression = value;
    }


    public double getBandwidthLimit() {
        return this.bandwidthLimit;
    }


    public void setBandwidthLimit(double value) {
        this.bandwidthLimit = value;
    }


    public boolean isMeasureLagToTargetRPA() {
        return this.measureLagToTargetRPA;
    }


    public void setMeasureLagToTargetRPA(boolean value) {
        this.measureLagToTargetRPA = value;
    }


    public boolean isDeduplication() {
        return this.deduplication;
    }


    public void setDeduplication(boolean value) {
        this.deduplication = value;
    }


    public int getWeight() {
        return this.weight;
    }


    public void setWeight(int value) {
        this.weight = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof LinkProtectionPolicy)) {
            return false;
        }
        LinkProtectionPolicy otherObj = (LinkProtectionPolicy) obj;

        return (this.protectionType != null ? this.protectionType.equals(otherObj.protectionType) : this.protectionType == otherObj.protectionType) && (this.syncReplicationLatencyThresholds != null ? this.syncReplicationLatencyThresholds.equals(otherObj.syncReplicationLatencyThresholds) : this.syncReplicationLatencyThresholds == otherObj.syncReplicationLatencyThresholds) && (this.syncReplicationThroughputThresholds != null ? this.syncReplicationThroughputThresholds.equals(otherObj.syncReplicationThroughputThresholds) : this.syncReplicationThroughputThresholds == otherObj.syncReplicationThroughputThresholds) && (this.rpoPolicy != null ? this.rpoPolicy.equals(otherObj.rpoPolicy) : this.rpoPolicy == otherObj.rpoPolicy) && (this.replicatingOverWAN == otherObj.replicatingOverWAN) && (this.compression != null ? this.compression.equals(otherObj.compression) : this.compression == otherObj.compression) && (this.bandwidthLimit == otherObj.bandwidthLimit) && (this.measureLagToTargetRPA == otherObj.measureLagToTargetRPA) && (this.deduplication == otherObj.deduplication) && (this.weight == otherObj.weight);
    }


    public int hashCode() {
        return (this.protectionType != null ? this.protectionType.hashCode() : 0) ^ (this.syncReplicationLatencyThresholds != null ? this.syncReplicationLatencyThresholds.hashCode() : 0) ^ (this.syncReplicationThroughputThresholds != null ? this.syncReplicationThroughputThresholds.hashCode() : 0) ^ (this.rpoPolicy != null ? this.rpoPolicy.hashCode() : 0) ^ (this.replicatingOverWAN ? 1 : 0) ^ (this.compression != null ? this.compression.hashCode() : 0) ^ (int) this.bandwidthLimit ^ (this.measureLagToTargetRPA ? 1 : 0) ^ (this.deduplication ? 1 : 0) ^ this.weight;
    }


    public String toString() {
        return "LinkProtectionPolicy [protectionType=" + this.protectionType + ", " + "syncReplicationLatencyThresholds=" + this.syncReplicationLatencyThresholds + ", " + "syncReplicationThroughputThresholds=" + this.syncReplicationThroughputThresholds + ", " + "rpoPolicy=" + this.rpoPolicy + ", " + "replicatingOverWAN=" + this.replicatingOverWAN + ", " + "compression=" + this.compression + ", " + "bandwidthLimit=" + this.bandwidthLimit + ", " + "measureLagToTargetRPA=" + this.measureLagToTargetRPA + ", " + "deduplication=" + this.deduplication + ", " + "weight=" + this.weight + "]";
    }
}


