package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGroupSetName", propOrder = {"groupSet"})
public class GetGroupSetName {
    protected ConsistencyGroupSetUID groupSet;

    public GetGroupSetName() {
    }

    public GetGroupSetName(ConsistencyGroupSetUID groupSet) {
        this.groupSet = groupSet;
    }


    public ConsistencyGroupSetUID getGroupSet() {
        return this.groupSet;
    }


    public void setGroupSet(ConsistencyGroupSetUID value) {
        this.groupSet = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetGroupSetName)) {
            return false;
        }
        GetGroupSetName otherObj = (GetGroupSetName) obj;

        return this.groupSet == otherObj.groupSet ? true : this.groupSet != null ? this.groupSet.equals(otherObj.groupSet) : false;
    }


    public int hashCode() {
        return this.groupSet != null ? this.groupSet.hashCode() : 0;
    }


    public String toString() {
        return "GetGroupSetName [groupSet=" + this.groupSet + "]";
    }
}


