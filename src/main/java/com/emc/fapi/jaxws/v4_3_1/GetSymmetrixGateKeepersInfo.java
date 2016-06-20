package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSymmetrixGateKeepersInfo", propOrder = {"cluster", "symmetrixID"})
public class GetSymmetrixGateKeepersInfo {
    protected ClusterUID cluster;
    protected String symmetrixID;

    public GetSymmetrixGateKeepersInfo() {
    }

    public GetSymmetrixGateKeepersInfo(ClusterUID cluster, String symmetrixID) {
        this.cluster = cluster;
        this.symmetrixID = symmetrixID;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public String getSymmetrixID() {
        return this.symmetrixID;
    }


    public void setSymmetrixID(String value) {
        this.symmetrixID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSymmetrixGateKeepersInfo)) {
            return false;
        }
        GetSymmetrixGateKeepersInfo otherObj = (GetSymmetrixGateKeepersInfo) obj;

        return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.symmetrixID != null ? this.symmetrixID.equals(otherObj.symmetrixID) : this.symmetrixID == otherObj.symmetrixID);
    }


    public int hashCode() {
        return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.symmetrixID != null ? this.symmetrixID.hashCode() : 0);
    }


    public String toString() {
        return "GetSymmetrixGateKeepersInfo [cluster=" + this.cluster + ", " + "symmetrixID=" + this.symmetrixID + "]";
    }
}


