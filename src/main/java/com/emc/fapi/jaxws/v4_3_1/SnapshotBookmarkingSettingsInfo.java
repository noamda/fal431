package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnapshotBookmarkingSettingsInfo", propOrder = {"consistencyType", "consolidationPolicy"})
public class SnapshotBookmarkingSettingsInfo {
    protected SnapshotConsistencyType consistencyType;
    protected BookmarkConsolidationPolicy consolidationPolicy;

    public SnapshotBookmarkingSettingsInfo() {
    }

    public SnapshotBookmarkingSettingsInfo(SnapshotConsistencyType consistencyType, BookmarkConsolidationPolicy consolidationPolicy) {
        this.consistencyType = consistencyType;
        this.consolidationPolicy = consolidationPolicy;
    }


    public SnapshotConsistencyType getConsistencyType() {
        return this.consistencyType;
    }


    public void setConsistencyType(SnapshotConsistencyType value) {
        this.consistencyType = value;
    }


    public BookmarkConsolidationPolicy getConsolidationPolicy() {
        return this.consolidationPolicy;
    }


    public void setConsolidationPolicy(BookmarkConsolidationPolicy value) {
        this.consolidationPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SnapshotBookmarkingSettingsInfo)) {
            return false;
        }
        SnapshotBookmarkingSettingsInfo otherObj = (SnapshotBookmarkingSettingsInfo) obj;

        return (this.consistencyType != null ? this.consistencyType.equals(otherObj.consistencyType) : this.consistencyType == otherObj.consistencyType) && (this.consolidationPolicy != null ? this.consolidationPolicy.equals(otherObj.consolidationPolicy) : this.consolidationPolicy == otherObj.consolidationPolicy);
    }


    public int hashCode() {
        return (this.consistencyType != null ? this.consistencyType.hashCode() : 0) ^ (this.consolidationPolicy != null ? this.consolidationPolicy.hashCode() : 0);
    }


    public String toString() {
        return "SnapshotBookmarkingSettingsInfo [consistencyType=" + this.consistencyType + ", " + "consolidationPolicy=" + this.consolidationPolicy + "]";
    }
}


