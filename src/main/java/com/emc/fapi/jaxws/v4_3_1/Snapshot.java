package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Snapshot", propOrder = {"snapshotUID", "description", "closingTimeStamp", "sizeInBytes", "uncompressedSizeInBytes", "consolidationInfo", "userSnapshot", "relevantEvent", "consistencyType"})
public class Snapshot {
    @XmlElement(nillable = true)
    protected SnapshotUID snapshotUID;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected RecoverPointTimeStamp closingTimeStamp;
    protected long sizeInBytes;
    protected long uncompressedSizeInBytes;
    protected SnapshotConsolidationInfo consolidationInfo;
    protected boolean userSnapshot;
    protected EventLog relevantEvent;
    protected SnapshotConsistencyType consistencyType;

    public Snapshot() {
    }

    public Snapshot(SnapshotUID snapshotUID, String description, RecoverPointTimeStamp closingTimeStamp, long sizeInBytes, long uncompressedSizeInBytes, SnapshotConsolidationInfo consolidationInfo, boolean userSnapshot, EventLog relevantEvent, SnapshotConsistencyType consistencyType) {
        this.snapshotUID = snapshotUID;
        this.description = description;
        this.closingTimeStamp = closingTimeStamp;
        this.sizeInBytes = sizeInBytes;
        this.uncompressedSizeInBytes = uncompressedSizeInBytes;
        this.consolidationInfo = consolidationInfo;
        this.userSnapshot = userSnapshot;
        this.relevantEvent = relevantEvent;
        this.consistencyType = consistencyType;
    }


    public SnapshotUID getSnapshotUID() {
        return this.snapshotUID;
    }


    public void setSnapshotUID(SnapshotUID value) {
        this.snapshotUID = value;
    }


    public String getDescription() {
        return this.description;
    }


    public void setDescription(String value) {
        this.description = value;
    }


    public RecoverPointTimeStamp getClosingTimeStamp() {
        return this.closingTimeStamp;
    }


    public void setClosingTimeStamp(RecoverPointTimeStamp value) {
        this.closingTimeStamp = value;
    }


    public long getSizeInBytes() {
        return this.sizeInBytes;
    }


    public void setSizeInBytes(long value) {
        this.sizeInBytes = value;
    }


    public long getUncompressedSizeInBytes() {
        return this.uncompressedSizeInBytes;
    }


    public void setUncompressedSizeInBytes(long value) {
        this.uncompressedSizeInBytes = value;
    }


    public SnapshotConsolidationInfo getConsolidationInfo() {
        return this.consolidationInfo;
    }


    public void setConsolidationInfo(SnapshotConsolidationInfo value) {
        this.consolidationInfo = value;
    }


    public boolean isUserSnapshot() {
        return this.userSnapshot;
    }


    public void setUserSnapshot(boolean value) {
        this.userSnapshot = value;
    }


    public EventLog getRelevantEvent() {
        return this.relevantEvent;
    }


    public void setRelevantEvent(EventLog value) {
        this.relevantEvent = value;
    }


    public SnapshotConsistencyType getConsistencyType() {
        return this.consistencyType;
    }


    public void setConsistencyType(SnapshotConsistencyType value) {
        this.consistencyType = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof Snapshot)) {
            return false;
        }
        Snapshot otherObj = (Snapshot) obj;

        return (this.snapshotUID != null ? this.snapshotUID.equals(otherObj.snapshotUID) : this.snapshotUID == otherObj.snapshotUID) && (this.description != null ? this.description.equals(otherObj.description) : this.description == otherObj.description) && (this.closingTimeStamp != null ? this.closingTimeStamp.equals(otherObj.closingTimeStamp) : this.closingTimeStamp == otherObj.closingTimeStamp) && (this.sizeInBytes == otherObj.sizeInBytes) && (this.uncompressedSizeInBytes == otherObj.uncompressedSizeInBytes) && (this.consolidationInfo != null ? this.consolidationInfo.equals(otherObj.consolidationInfo) : this.consolidationInfo == otherObj.consolidationInfo) && (this.userSnapshot == otherObj.userSnapshot) && (this.relevantEvent != null ? this.relevantEvent.equals(otherObj.relevantEvent) : this.relevantEvent == otherObj.relevantEvent) && (this.consistencyType != null ? this.consistencyType.equals(otherObj.consistencyType) : this.consistencyType == otherObj.consistencyType);
    }


    public int hashCode() {
        return (this.snapshotUID != null ? this.snapshotUID.hashCode() : 0) ^ (this.description != null ? this.description.hashCode() : 0) ^ (this.closingTimeStamp != null ? this.closingTimeStamp.hashCode() : 0) ^ (int) this.sizeInBytes ^ (int) this.uncompressedSizeInBytes ^ (this.consolidationInfo != null ? this.consolidationInfo.hashCode() : 0) ^ (this.userSnapshot ? 1 : 0) ^ (this.relevantEvent != null ? this.relevantEvent.hashCode() : 0) ^ (this.consistencyType != null ? this.consistencyType.hashCode() : 0);
    }


    public String toString() {
        return "Snapshot [snapshotUID=" + this.snapshotUID + ", " + "description=" + this.description + ", " + "closingTimeStamp=" + this.closingTimeStamp + ", " + "sizeInBytes=" + this.sizeInBytes + ", " + "uncompressedSizeInBytes=" + this.uncompressedSizeInBytes + ", " + "consolidationInfo=" + this.consolidationInfo + ", " + "userSnapshot=" + this.userSnapshot + ", " + "relevantEvent=" + this.relevantEvent + ", " + "consistencyType=" + this.consistencyType + "]";
    }
}


