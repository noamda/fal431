package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateAbortSnapshotsConsolidation", propOrder = {"groupCopy"})
public class ValidateAbortSnapshotsConsolidation {
    protected ConsistencyGroupCopyUID groupCopy;

    public ValidateAbortSnapshotsConsolidation() {
    }

    public ValidateAbortSnapshotsConsolidation(ConsistencyGroupCopyUID groupCopy) {
        this.groupCopy = groupCopy;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateAbortSnapshotsConsolidation)) {
            return false;
        }
        ValidateAbortSnapshotsConsolidation otherObj = (ValidateAbortSnapshotsConsolidation) obj;

        return this.groupCopy == otherObj.groupCopy ? true : this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : false;
    }


    public int hashCode() {
        return this.groupCopy != null ? this.groupCopy.hashCode() : 0;
    }


    public String toString() {
        return "ValidateAbortSnapshotsConsolidation [groupCopy=" + this.groupCopy + "]";
    }
}


