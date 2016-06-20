package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setBookmarkConsistencyType", propOrder = {"groupCopy", "snapshot", "consistencyType"})
public class SetBookmarkConsistencyType {
    protected ConsistencyGroupCopyUID groupCopy;
    @XmlElement(nillable = true)
    protected Snapshot snapshot;
    protected SnapshotConsistencyType consistencyType;

    public SetBookmarkConsistencyType() {
    }

    public SetBookmarkConsistencyType(ConsistencyGroupCopyUID groupCopy, Snapshot snapshot, SnapshotConsistencyType consistencyType) {
        this.groupCopy = groupCopy;
        this.snapshot = snapshot;
        this.consistencyType = consistencyType;
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


    public boolean equals(Object obj) {
        if (!(obj instanceof SetBookmarkConsistencyType)) {
            return false;
        }
        SetBookmarkConsistencyType otherObj = (SetBookmarkConsistencyType) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.snapshot != null ? this.snapshot.equals(otherObj.snapshot) : this.snapshot == otherObj.snapshot) && (this.consistencyType != null ? this.consistencyType.equals(otherObj.consistencyType) : this.consistencyType == otherObj.consistencyType);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.snapshot != null ? this.snapshot.hashCode() : 0) ^ (this.consistencyType != null ? this.consistencyType.hashCode() : 0);
    }


    public String toString() {
        return "SetBookmarkConsistencyType [groupCopy=" + this.groupCopy + ", " + "snapshot=" + this.snapshot + ", " + "consistencyType=" + this.consistencyType + "]";
    }
}


