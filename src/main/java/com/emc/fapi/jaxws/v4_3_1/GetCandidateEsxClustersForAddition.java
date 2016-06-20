package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCandidateEsxClustersForAddition", propOrder = {"cluster", "vcUID"})
public class GetCandidateEsxClustersForAddition {
    protected ClusterUID cluster;
    protected VirtualCenterUID vcUID;

    public GetCandidateEsxClustersForAddition() {
    }

    public GetCandidateEsxClustersForAddition(ClusterUID cluster, VirtualCenterUID vcUID) {
        this.cluster = cluster;
        this.vcUID = vcUID;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public VirtualCenterUID getVcUID() {
        return this.vcUID;
    }


    public void setVcUID(VirtualCenterUID value) {
        this.vcUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetCandidateEsxClustersForAddition)) {
            return false;
        }
        GetCandidateEsxClustersForAddition otherObj = (GetCandidateEsxClustersForAddition) obj;

        return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.vcUID != null ? this.vcUID.equals(otherObj.vcUID) : this.vcUID == otherObj.vcUID);
    }


    public int hashCode() {
        return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.vcUID != null ? this.vcUID.hashCode() : 0);
    }


    public String toString() {
        return "GetCandidateEsxClustersForAddition [cluster=" + this.cluster + ", " + "vcUID=" + this.vcUID + "]";
    }
}


