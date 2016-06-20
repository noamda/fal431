package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVCenterServersViewFromCluster", propOrder = {"cluster", "shouldRescan"})
public class GetVCenterServersViewFromCluster {
    protected ClusterUID cluster;
    protected boolean shouldRescan;

    public GetVCenterServersViewFromCluster() {
    }

    public GetVCenterServersViewFromCluster(ClusterUID cluster, boolean shouldRescan) {
        this.cluster = cluster;
        this.shouldRescan = shouldRescan;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public boolean isShouldRescan() {
        return this.shouldRescan;
    }


    public void setShouldRescan(boolean value) {
        this.shouldRescan = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVCenterServersViewFromCluster)) {
            return false;
        }
        GetVCenterServersViewFromCluster otherObj = (GetVCenterServersViewFromCluster) obj;

        return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.shouldRescan == otherObj.shouldRescan);
    }


    public int hashCode() {
        return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.shouldRescan ? 1 : 0);
    }


    public String toString() {
        return "GetVCenterServersViewFromCluster [cluster=" + this.cluster + ", " + "shouldRescan=" + this.shouldRescan + "]";
    }
}


