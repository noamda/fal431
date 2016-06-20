package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attachPhoenixCluster", propOrder = {"cluster", "phoenixClusterName"})
public class AttachPhoenixCluster {
    protected ClusterUID cluster;
    protected String phoenixClusterName;

    public AttachPhoenixCluster() {
    }

    public AttachPhoenixCluster(ClusterUID cluster, String phoenixClusterName) {
        this.cluster = cluster;
        this.phoenixClusterName = phoenixClusterName;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public String getPhoenixClusterName() {
        return this.phoenixClusterName;
    }


    public void setPhoenixClusterName(String value) {
        this.phoenixClusterName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AttachPhoenixCluster)) {
            return false;
        }
        AttachPhoenixCluster otherObj = (AttachPhoenixCluster) obj;

        return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.phoenixClusterName != null ? this.phoenixClusterName.equals(otherObj.phoenixClusterName) : this.phoenixClusterName == otherObj.phoenixClusterName);
    }


    public int hashCode() {
        return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.phoenixClusterName != null ? this.phoenixClusterName.hashCode() : 0);
    }


    public String toString() {
        return "AttachPhoenixCluster [cluster=" + this.cluster + ", " + "phoenixClusterName=" + this.phoenixClusterName + "]";
    }
}


