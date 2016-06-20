package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableVolumes", propOrder = {"cluster", "refreshView"})
public class GetAvailableVolumes {
    protected ClusterUID cluster;
    protected boolean refreshView;

    public GetAvailableVolumes() {
    }

    public GetAvailableVolumes(ClusterUID cluster, boolean refreshView) {
        this.cluster = cluster;
        this.refreshView = refreshView;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public boolean isRefreshView() {
        return this.refreshView;
    }


    public void setRefreshView(boolean value) {
        this.refreshView = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetAvailableVolumes)) {
            return false;
        }
        GetAvailableVolumes otherObj = (GetAvailableVolumes) obj;

        return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.refreshView == otherObj.refreshView);
    }


    public int hashCode() {
        return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.refreshView ? 1 : 0);
    }


    public String toString() {
        return "GetAvailableVolumes [cluster=" + this.cluster + ", " + "refreshView=" + this.refreshView + "]";
    }
}


