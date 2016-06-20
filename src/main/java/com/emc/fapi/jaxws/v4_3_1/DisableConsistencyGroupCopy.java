package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disableConsistencyGroupCopy", propOrder = {"groupCopy"})
public class DisableConsistencyGroupCopy {
    protected ConsistencyGroupCopyUID groupCopy;

    public DisableConsistencyGroupCopy() {
    }

    public DisableConsistencyGroupCopy(ConsistencyGroupCopyUID groupCopy) {
        this.groupCopy = groupCopy;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof DisableConsistencyGroupCopy)) {
            return false;
        }
        DisableConsistencyGroupCopy otherObj = (DisableConsistencyGroupCopy) obj;

        return this.groupCopy == otherObj.groupCopy ? true : this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : false;
    }


    public int hashCode() {
        return this.groupCopy != null ? this.groupCopy.hashCode() : 0;
    }


    public String toString() {
        return "DisableConsistencyGroupCopy [groupCopy=" + this.groupCopy + "]";
    }
}


