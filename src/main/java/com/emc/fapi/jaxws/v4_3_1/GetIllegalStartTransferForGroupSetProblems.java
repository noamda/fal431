package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIllegalStartTransferForGroupSetProblems", propOrder = {"groupSetSubset"})
public class GetIllegalStartTransferForGroupSetProblems {
    protected ConsistencyGroupSetSubset groupSetSubset;

    public GetIllegalStartTransferForGroupSetProblems() {
    }

    public GetIllegalStartTransferForGroupSetProblems(ConsistencyGroupSetSubset groupSetSubset) {
        this.groupSetSubset = groupSetSubset;
    }


    public ConsistencyGroupSetSubset getGroupSetSubset() {
        return this.groupSetSubset;
    }


    public void setGroupSetSubset(ConsistencyGroupSetSubset value) {
        this.groupSetSubset = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetIllegalStartTransferForGroupSetProblems)) {
            return false;
        }
        GetIllegalStartTransferForGroupSetProblems otherObj = (GetIllegalStartTransferForGroupSetProblems) obj;

        return this.groupSetSubset == otherObj.groupSetSubset ? true : this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : false;
    }


    public int hashCode() {
        return this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0;
    }


    public String toString() {
        return "GetIllegalStartTransferForGroupSetProblems [groupSetSubset=" + this.groupSetSubset + "]";
    }
}


