package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoenixClusterState", propOrder = {"availableDisk", "cluster", "clusterName", "diskCapacity", "status"})
public class PhoenixClusterState {
    protected Long availableDisk;
    protected ClusterUID cluster;
    protected String clusterName;
    protected long diskCapacity;
    protected PhoenixClusterStatus status;

    public PhoenixClusterState() {
    }

    public PhoenixClusterState(Long availableDisk, ClusterUID cluster, String clusterName, long diskCapacity, PhoenixClusterStatus status) {
        this.availableDisk = availableDisk;
        this.cluster = cluster;
        this.clusterName = clusterName;
        this.diskCapacity = diskCapacity;
        this.status = status;
    }


    public Long getAvailableDisk() {
        return this.availableDisk;
    }


    public void setAvailableDisk(Long value) {
        this.availableDisk = value;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public String getClusterName() {
        return this.clusterName;
    }


    public void setClusterName(String value) {
        this.clusterName = value;
    }


    public long getDiskCapacity() {
        return this.diskCapacity;
    }


    public void setDiskCapacity(long value) {
        this.diskCapacity = value;
    }


    public PhoenixClusterStatus getStatus() {
        return this.status;
    }


    public void setStatus(PhoenixClusterStatus value) {
        this.status = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof PhoenixClusterState)) {
            return false;
        }
        PhoenixClusterState otherObj = (PhoenixClusterState) obj;

        return (this.availableDisk != null ? this.availableDisk.equals(otherObj.availableDisk) : this.availableDisk == otherObj.availableDisk) && (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.clusterName != null ? this.clusterName.equals(otherObj.clusterName) : this.clusterName == otherObj.clusterName) && (this.diskCapacity == otherObj.diskCapacity) && (this.status != null ? this.status.equals(otherObj.status) : this.status == otherObj.status);
    }


    public int hashCode() {
        return (this.availableDisk != null ? this.availableDisk.hashCode() : 0) ^ (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.clusterName != null ? this.clusterName.hashCode() : 0) ^ (int) this.diskCapacity ^ (this.status != null ? this.status.hashCode() : 0);
    }


    public String toString() {
        return "PhoenixClusterState [availableDisk=" + this.availableDisk + ", " + "cluster=" + this.cluster + ", " + "clusterName=" + this.clusterName + ", " + "diskCapacity=" + this.diskCapacity + ", " + "status=" + this.status + "]";
    }
}


