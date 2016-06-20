package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnapshotConsolidationInfo", propOrder = {"consolidationPolicy", "consolidationType", "savedSpaceInBytes"})
public class SnapshotConsolidationInfo {
    protected BookmarkConsolidationPolicy consolidationPolicy;
    protected SnapshotConsolidationType consolidationType;
    protected long savedSpaceInBytes;

    public SnapshotConsolidationInfo() {
    }

    public SnapshotConsolidationInfo(BookmarkConsolidationPolicy consolidationPolicy, SnapshotConsolidationType consolidationType, long savedSpaceInBytes) {
        this.consolidationPolicy = consolidationPolicy;
        this.consolidationType = consolidationType;
        this.savedSpaceInBytes = savedSpaceInBytes;
    }


    public BookmarkConsolidationPolicy getConsolidationPolicy() {
        return this.consolidationPolicy;
    }


    public void setConsolidationPolicy(BookmarkConsolidationPolicy value) {
        this.consolidationPolicy = value;
    }


    public SnapshotConsolidationType getConsolidationType() {
        return this.consolidationType;
    }


    public void setConsolidationType(SnapshotConsolidationType value) {
        this.consolidationType = value;
    }


    public long getSavedSpaceInBytes() {
        return this.savedSpaceInBytes;
    }


    public void setSavedSpaceInBytes(long value) {
        this.savedSpaceInBytes = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SnapshotConsolidationInfo)) {
            return false;
        }
        SnapshotConsolidationInfo otherObj = (SnapshotConsolidationInfo) obj;

        return (this.consolidationPolicy != null ? this.consolidationPolicy.equals(otherObj.consolidationPolicy) : this.consolidationPolicy == otherObj.consolidationPolicy) && (this.consolidationType != null ? this.consolidationType.equals(otherObj.consolidationType) : this.consolidationType == otherObj.consolidationType) && (this.savedSpaceInBytes == otherObj.savedSpaceInBytes);
    }


    public int hashCode() {
        return (this.consolidationPolicy != null ? this.consolidationPolicy.hashCode() : 0) ^ (this.consolidationType != null ? this.consolidationType.hashCode() : 0) ^ (int) this.savedSpaceInBytes;
    }


    public String toString() {
        return "SnapshotConsolidationInfo [consolidationPolicy=" + this.consolidationPolicy + ", " + "consolidationType=" + this.consolidationType + ", " + "savedSpaceInBytes=" + this.savedSpaceInBytes + "]";
    }
}


