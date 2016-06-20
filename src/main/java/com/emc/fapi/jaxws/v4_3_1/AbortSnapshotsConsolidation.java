package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abortSnapshotsConsolidation", propOrder = {"groupCopy"})
public class AbortSnapshotsConsolidation {
    protected ConsistencyGroupCopyUID groupCopy;

    public AbortSnapshotsConsolidation() {
    }

    public AbortSnapshotsConsolidation(ConsistencyGroupCopyUID groupCopy) {
        this.groupCopy = groupCopy;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AbortSnapshotsConsolidation)) {
            return false;
        }
        AbortSnapshotsConsolidation otherObj = (AbortSnapshotsConsolidation) obj;

        return this.groupCopy == otherObj.groupCopy ? true : this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : false;
    }


    public int hashCode() {
        return this.groupCopy != null ? this.groupCopy.hashCode() : 0;
    }


    public String toString() {
        return "AbortSnapshotsConsolidation [groupCopy=" + this.groupCopy + "]";
    }
}
