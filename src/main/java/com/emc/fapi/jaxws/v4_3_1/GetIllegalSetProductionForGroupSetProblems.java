package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIllegalSetProductionForGroupSetProblems", propOrder = {"groupSetSubset", "clusterUID", "startTransfer"})
public class GetIllegalSetProductionForGroupSetProblems {
    protected ConsistencyGroupSetSubset groupSetSubset;
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    protected boolean startTransfer;

    public GetIllegalSetProductionForGroupSetProblems() {
    }

    public GetIllegalSetProductionForGroupSetProblems(ConsistencyGroupSetSubset groupSetSubset, ClusterUID clusterUID, boolean startTransfer) {
        this.groupSetSubset = groupSetSubset;
        this.clusterUID = clusterUID;
        this.startTransfer = startTransfer;
    }


    public ConsistencyGroupSetSubset getGroupSetSubset() {
        return this.groupSetSubset;
    }


    public void setGroupSetSubset(ConsistencyGroupSetSubset value) {
        this.groupSetSubset = value;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public boolean isStartTransfer() {
        return this.startTransfer;
    }


    public void setStartTransfer(boolean value) {
        this.startTransfer = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetIllegalSetProductionForGroupSetProblems)) {
            return false;
        }
        GetIllegalSetProductionForGroupSetProblems otherObj = (GetIllegalSetProductionForGroupSetProblems) obj;

        return (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.startTransfer == otherObj.startTransfer);
    }


    public int hashCode() {
        return (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.startTransfer ? 1 : 0);
    }


    public String toString() {
        return "GetIllegalSetProductionForGroupSetProblems [groupSetSubset=" + this.groupSetSubset + ", " + "clusterUID=" + this.clusterUID + ", " + "startTransfer=" + this.startTransfer + "]";
    }
}


