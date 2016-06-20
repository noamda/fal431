package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enableConsistencyGroup", propOrder = {"group", "startTransfer"})
public class EnableConsistencyGroup {
    protected ConsistencyGroupUID group;
    protected boolean startTransfer;

    public EnableConsistencyGroup() {
    }

    public EnableConsistencyGroup(ConsistencyGroupUID group, boolean startTransfer) {
        this.group = group;
        this.startTransfer = startTransfer;
    }


    public ConsistencyGroupUID getGroup() {
        return this.group;
    }


    public void setGroup(ConsistencyGroupUID value) {
        this.group = value;
    }


    public boolean isStartTransfer() {
        return this.startTransfer;
    }


    public void setStartTransfer(boolean value) {
        this.startTransfer = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EnableConsistencyGroup)) {
            return false;
        }
        EnableConsistencyGroup otherObj = (EnableConsistencyGroup) obj;

        return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.startTransfer == otherObj.startTransfer);
    }


    public int hashCode() {
        return (this.group != null ? this.group.hashCode() : 0) ^ (this.startTransfer ? 1 : 0);
    }


    public String toString() {
        return "EnableConsistencyGroup [group=" + this.group + ", " + "startTransfer=" + this.startTransfer + "]";
    }
}


