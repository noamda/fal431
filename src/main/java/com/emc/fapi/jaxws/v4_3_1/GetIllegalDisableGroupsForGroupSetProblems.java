package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIllegalDisableGroupsForGroupSetProblems", propOrder = {"groupSetSubset"})
public class GetIllegalDisableGroupsForGroupSetProblems {
    protected ConsistencyGroupSetSubset groupSetSubset;

    public GetIllegalDisableGroupsForGroupSetProblems() {
    }

    public GetIllegalDisableGroupsForGroupSetProblems(ConsistencyGroupSetSubset groupSetSubset) {
        this.groupSetSubset = groupSetSubset;
    }


    public ConsistencyGroupSetSubset getGroupSetSubset() {
        return this.groupSetSubset;
    }


    public void setGroupSetSubset(ConsistencyGroupSetSubset value) {
        this.groupSetSubset = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetIllegalDisableGroupsForGroupSetProblems)) {
            return false;
        }
        GetIllegalDisableGroupsForGroupSetProblems otherObj = (GetIllegalDisableGroupsForGroupSetProblems) obj;

        return this.groupSetSubset == otherObj.groupSetSubset ? true : this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : false;
    }


    public int hashCode() {
        return this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0;
    }


    public String toString() {
        return "GetIllegalDisableGroupsForGroupSetProblems [groupSetSubset=" + this.groupSetSubset + "]";
    }
}


