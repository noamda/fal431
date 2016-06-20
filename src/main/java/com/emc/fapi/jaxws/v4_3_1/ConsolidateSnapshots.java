package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consolidateSnapshots", propOrder = {"groupCopy", "start", "end"})
public class ConsolidateSnapshots {
    protected ConsistencyGroupCopyUID groupCopy;
    protected Snapshot start;
    protected Snapshot end;

    public ConsolidateSnapshots() {
    }

    public ConsolidateSnapshots(ConsistencyGroupCopyUID groupCopy, Snapshot start, Snapshot end) {
        this.groupCopy = groupCopy;
        this.start = start;
        this.end = end;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public Snapshot getStart() {
        return this.start;
    }


    public void setStart(Snapshot value) {
        this.start = value;
    }


    public Snapshot getEnd() {
        return this.end;
    }


    public void setEnd(Snapshot value) {
        this.end = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsolidateSnapshots)) {
            return false;
        }
        ConsolidateSnapshots otherObj = (ConsolidateSnapshots) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.start != null ? this.start.equals(otherObj.start) : this.start == otherObj.start) && (this.end != null ? this.end.equals(otherObj.end) : this.end == otherObj.end);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.start != null ? this.start.hashCode() : 0) ^ (this.end != null ? this.end.hashCode() : 0);
    }


    public String toString() {
        return "ConsolidateSnapshots [groupCopy=" + this.groupCopy + ", " + "start=" + this.start + ", " + "end=" + this.end + "]";
    }
}


