package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consolidateSnapshotsParams", propOrder = {"end", "start"})
public class ConsolidateSnapshotsParams {
    protected Snapshot end;
    protected Snapshot start;

    public ConsolidateSnapshotsParams() {
    }

    public ConsolidateSnapshotsParams(Snapshot end, Snapshot start) {
        this.end = end;
        this.start = start;
    }


    public Snapshot getEnd() {
        return this.end;
    }


    public void setEnd(Snapshot value) {
        this.end = value;
    }


    public Snapshot getStart() {
        return this.start;
    }


    public void setStart(Snapshot value) {
        this.start = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsolidateSnapshotsParams)) {
            return false;
        }
        ConsolidateSnapshotsParams otherObj = (ConsolidateSnapshotsParams) obj;

        return (this.end != null ? this.end.equals(otherObj.end) : this.end == otherObj.end) && (this.start != null ? this.start.equals(otherObj.start) : this.start == otherObj.start);
    }


    public int hashCode() {
        return (this.end != null ? this.end.hashCode() : 0) ^ (this.start != null ? this.start.hashCode() : 0);
    }


    public String toString() {
        return "ConsolidateSnapshotsParams [end=" + this.end + ", " + "start=" + this.start + "]";
    }
}


