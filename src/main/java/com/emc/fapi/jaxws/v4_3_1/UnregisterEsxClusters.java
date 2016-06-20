package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unregisterEsxClusters", propOrder = {"cluster", "vcUID", "esxClusterUIDs"})
public class UnregisterEsxClusters {
    protected ClusterUID cluster;
    protected VirtualCenterUID vcUID;
    protected List<EsxClusterUID> esxClusterUIDs;

    public UnregisterEsxClusters() {
    }

    public UnregisterEsxClusters(ClusterUID cluster, VirtualCenterUID vcUID, List<EsxClusterUID> esxClusterUIDs) {
        this.cluster = cluster;
        this.vcUID = vcUID;
        this.esxClusterUIDs = esxClusterUIDs;
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


    public List<EsxClusterUID> getEsxClusterUIDs() {
        if (this.esxClusterUIDs == null) {
            this.esxClusterUIDs = new ArrayList();
        }
        return this.esxClusterUIDs;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof UnregisterEsxClusters)) {
            return false;
        }
        UnregisterEsxClusters otherObj = (UnregisterEsxClusters) obj;

        return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.vcUID != null ? this.vcUID.equals(otherObj.vcUID) : this.vcUID == otherObj.vcUID) && (this.esxClusterUIDs != null ? this.esxClusterUIDs.equals(otherObj.esxClusterUIDs) : this.esxClusterUIDs == otherObj.esxClusterUIDs);
    }


    public int hashCode() {
        return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.vcUID != null ? this.vcUID.hashCode() : 0) ^ (this.esxClusterUIDs != null ? this.esxClusterUIDs.hashCode() : 0);
    }


    public String toString() {
        return "UnregisterEsxClusters [cluster=" + this.cluster + ", " + "vcUID=" + this.vcUID + ", " + "esxClusterUIDs=" + this.esxClusterUIDs + "]";
    }
}


