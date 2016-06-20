package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeConsistencyGroupCopy", propOrder = {"groupCopy"})
public class RemoveConsistencyGroupCopy {
    protected ConsistencyGroupCopyUID groupCopy;

    public RemoveConsistencyGroupCopy() {
    }

    public RemoveConsistencyGroupCopy(ConsistencyGroupCopyUID groupCopy) {
        this.groupCopy = groupCopy;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RemoveConsistencyGroupCopy)) {
            return false;
        }
        RemoveConsistencyGroupCopy otherObj = (RemoveConsistencyGroupCopy) obj;

        return this.groupCopy == otherObj.groupCopy ? true : this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : false;
    }


    public int hashCode() {
        return this.groupCopy != null ? this.groupCopy.hashCode() : 0;
    }


    public String toString() {
        return "RemoveConsistencyGroupCopy [groupCopy=" + this.groupCopy + "]";
    }
}


