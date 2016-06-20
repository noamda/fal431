package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateUndoWritesForGroupSetSubset", propOrder = {"groupSetSubset", "cluster"})
public class ValidateUndoWritesForGroupSetSubset {
    protected ConsistencyGroupSetSubset groupSetSubset;
    @XmlElement(nillable = true)
    protected ClusterUID cluster;

    public ValidateUndoWritesForGroupSetSubset() {
    }

    public ValidateUndoWritesForGroupSetSubset(ConsistencyGroupSetSubset groupSetSubset, ClusterUID cluster) {
        this.groupSetSubset = groupSetSubset;
        this.cluster = cluster;
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


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateUndoWritesForGroupSetSubset)) {
            return false;
        }
        ValidateUndoWritesForGroupSetSubset otherObj = (ValidateUndoWritesForGroupSetSubset) obj;

        return (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset) && (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster);
    }


    public int hashCode() {
        return (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0) ^ (this.cluster != null ? this.cluster.hashCode() : 0);
    }


    public String toString() {
        return "ValidateUndoWritesForGroupSetSubset [groupSetSubset=" + this.groupSetSubset + ", " + "cluster=" + this.cluster + "]";
    }
}


