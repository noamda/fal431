package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterInfo", propOrder = {"clusterUID", "clusterName"})
public class ClusterInfo {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    protected String clusterName;

    public ClusterInfo() {
    }

    public ClusterInfo(ClusterUID clusterUID, String clusterName) {
        this.clusterUID = clusterUID;
        this.clusterName = clusterName;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public String getClusterName() {
        return this.clusterName;
    }


    public void setClusterName(String value) {
        this.clusterName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterInfo)) {
            return false;
        }
        ClusterInfo otherObj = (ClusterInfo) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.clusterName != null ? this.clusterName.equals(otherObj.clusterName) : this.clusterName == otherObj.clusterName);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.clusterName != null ? this.clusterName.hashCode() : 0);
    }


    public String toString() {
        return "ClusterInfo [clusterUID=" + this.clusterUID + ", " + "clusterName=" + this.clusterName + "]";
    }
}


