package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setBookmarkSettings", propOrder = {"groupCopy", "snapshot", "consistencyType", "consolidationPolicy"})
public class SetBookmarkSettings {
    protected ConsistencyGroupCopyUID groupCopy;
    @XmlElement(nillable = true)
    protected Snapshot snapshot;
    protected SnapshotConsistencyType consistencyType;
    protected BookmarkConsolidationPolicy consolidationPolicy;

    public SetBookmarkSettings() {
    }

    public SetBookmarkSettings(ConsistencyGroupCopyUID groupCopy, Snapshot snapshot, SnapshotConsistencyType consistencyType, BookmarkConsolidationPolicy consolidationPolicy) {
        this.groupCopy = groupCopy;
        this.snapshot = snapshot;
        this.consistencyType = consistencyType;
        this.consolidationPolicy = consolidationPolicy;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public Snapshot getSnapshot() {
        return this.snapshot;
    }


    public void setSnapshot(Snapshot value) {
        this.snapshot = value;
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
        if (!(obj instanceof SetBookmarkSettings)) {
            return false;
        }
        SetBookmarkSettings otherObj = (SetBookmarkSettings) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.snapshot != null ? this.snapshot.equals(otherObj.snapshot) : this.snapshot == otherObj.snapshot) && (this.consistencyType != null ? this.consistencyType.equals(otherObj.consistencyType) : this.consistencyType == otherObj.consistencyType) && (this.consolidationPolicy != null ? this.consolidationPolicy.equals(otherObj.consolidationPolicy) : this.consolidationPolicy == otherObj.consolidationPolicy);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.snapshot != null ? this.snapshot.hashCode() : 0) ^ (this.consistencyType != null ? this.consistencyType.hashCode() : 0) ^ (this.consolidationPolicy != null ? this.consolidationPolicy.hashCode() : 0);
    }


    public String toString() {
        return "SetBookmarkSettings [groupCopy=" + this.groupCopy + ", " + "snapshot=" + this.snapshot + ", " + "consistencyType=" + this.consistencyType + ", " + "consolidationPolicy=" + this.consolidationPolicy + "]";
    }
}


