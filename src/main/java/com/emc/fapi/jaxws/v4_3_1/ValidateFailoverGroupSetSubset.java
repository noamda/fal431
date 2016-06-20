package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateFailoverGroupSetSubset", propOrder = {"groupSetSubset", "cluster", "startTransfer"})
public class ValidateFailoverGroupSetSubset {
    protected ConsistencyGroupSetSubset groupSetSubset;
    @XmlElement(nillable = true)
    protected ClusterUID cluster;
    protected boolean startTransfer;

    public ValidateFailoverGroupSetSubset() {
    }

    public ValidateFailoverGroupSetSubset(ConsistencyGroupSetSubset groupSetSubset, ClusterUID cluster, boolean startTransfer) {
        this.groupSetSubset = groupSetSubset;
        this.cluster = cluster;
        this.startTransfer = startTransfer;
    }


    public ConsistencyGroupSetSubset getGroupSetSubset() {
        return this.groupSetSubset;
    }


    public void setGroupSetSubset(ConsistencyGroupSetSubset value) {
        this.groupSetSubset = value;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public boolean isStartTransfer() {
        return this.startTransfer;
    }


    public void setStartTransfer(boolean value) {
        this.startTransfer = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateFailoverGroupSetSubset)) {
            return false;
        }
        ValidateFailoverGroupSetSubset otherObj = (ValidateFailoverGroupSetSubset) obj;

        return (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset) && (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.startTransfer == otherObj.startTransfer);
    }


    public int hashCode() {
        return (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0) ^ (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.startTransfer ? 1 : 0);
    }


    public String toString() {
        return "ValidateFailoverGroupSetSubset [groupSetSubset=" + this.groupSetSubset + ", " + "cluster=" + this.cluster + ", " + "startTransfer=" + this.startTransfer + "]";
    }
}


