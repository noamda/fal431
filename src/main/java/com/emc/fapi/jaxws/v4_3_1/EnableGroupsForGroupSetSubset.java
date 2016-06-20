package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enableGroupsForGroupSetSubset", propOrder = {"groupSetSubset", "startTransfer"})
public class EnableGroupsForGroupSetSubset {
    protected ConsistencyGroupSetSubset groupSetSubset;
    protected boolean startTransfer;

    public EnableGroupsForGroupSetSubset() {
    }

    public EnableGroupsForGroupSetSubset(ConsistencyGroupSetSubset groupSetSubset, boolean startTransfer) {
        this.groupSetSubset = groupSetSubset;
        this.startTransfer = startTransfer;
    }


    public ConsistencyGroupSetSubset getGroupSetSubset() {
        return this.groupSetSubset;
    }


    public void setGroupSetSubset(ConsistencyGroupSetSubset value) {
        this.groupSetSubset = value;
    }


    public boolean isStartTransfer() {
        return this.startTransfer;
    }


    public void setStartTransfer(boolean value) {
        this.startTransfer = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EnableGroupsForGroupSetSubset)) {
            return false;
        }
        EnableGroupsForGroupSetSubset otherObj = (EnableGroupsForGroupSetSubset) obj;

        return (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset) && (this.startTransfer == otherObj.startTransfer);
    }


    public int hashCode() {
        return (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0) ^ (this.startTransfer ? 1 : 0);
    }


    public String toString() {
        return "EnableGroupsForGroupSetSubset [groupSetSubset=" + this.groupSetSubset + ", " + "startTransfer=" + this.startTransfer + "]";
    }
}


