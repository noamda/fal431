package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setBookmarkConsolidationPolicy", propOrder = {"groupCopy", "snapshot", "consolidationPolicy"})
public class SetBookmarkConsolidationPolicy {
    protected ConsistencyGroupCopyUID groupCopy;
    @XmlElement(nillable = true)
    protected Snapshot snapshot;
    protected BookmarkConsolidationPolicy consolidationPolicy;

    public SetBookmarkConsolidationPolicy() {
    }

    public SetBookmarkConsolidationPolicy(ConsistencyGroupCopyUID groupCopy, Snapshot snapshot, BookmarkConsolidationPolicy consolidationPolicy) {
        this.groupCopy = groupCopy;
        this.snapshot = snapshot;
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


    public BookmarkConsolidationPolicy getConsolidationPolicy() {
        return this.consolidationPolicy;
    }


    public void setConsolidationPolicy(BookmarkConsolidationPolicy value) {
        this.consolidationPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetBookmarkConsolidationPolicy)) {
            return false;
        }
        SetBookmarkConsolidationPolicy otherObj = (SetBookmarkConsolidationPolicy) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.snapshot != null ? this.snapshot.equals(otherObj.snapshot) : this.snapshot == otherObj.snapshot) && (this.consolidationPolicy != null ? this.consolidationPolicy.equals(otherObj.consolidationPolicy) : this.consolidationPolicy == otherObj.consolidationPolicy);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.snapshot != null ? this.snapshot.hashCode() : 0) ^ (this.consolidationPolicy != null ? this.consolidationPolicy.hashCode() : 0);
    }


    public String toString() {
        return "SetBookmarkConsolidationPolicy [groupCopy=" + this.groupCopy + ", " + "snapshot=" + this.snapshot + ", " + "consolidationPolicy=" + this.consolidationPolicy + "]";
    }
}


