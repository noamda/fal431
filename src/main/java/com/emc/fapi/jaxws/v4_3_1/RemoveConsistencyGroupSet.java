package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeConsistencyGroupSet", propOrder = {"getGroupSetName"})
public class RemoveConsistencyGroupSet {
    protected ConsistencyGroupSetUID getGroupSetName;

    public RemoveConsistencyGroupSet() {
    }

    public RemoveConsistencyGroupSet(ConsistencyGroupSetUID getGroupSetName) {
        this.getGroupSetName = getGroupSetName;
    }


    public ConsistencyGroupSetUID getGetGroupSetName() {
        return this.getGroupSetName;
    }


    public void setGetGroupSetName(ConsistencyGroupSetUID value) {
        this.getGroupSetName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RemoveConsistencyGroupSet)) {
            return false;
        }
        RemoveConsistencyGroupSet otherObj = (RemoveConsistencyGroupSet) obj;

        return this.getGroupSetName == otherObj.getGroupSetName ? true : this.getGroupSetName != null ? this.getGroupSetName.equals(otherObj.getGroupSetName) : false;
    }


    public int hashCode() {
        return this.getGroupSetName != null ? this.getGroupSetName.hashCode() : 0;
    }


    public String toString() {
        return "RemoveConsistencyGroupSet [getGroupSetName=" + this.getGroupSetName + "]";
    }
}


