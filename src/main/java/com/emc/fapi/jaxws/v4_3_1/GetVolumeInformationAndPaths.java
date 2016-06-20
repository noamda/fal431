package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVolumeInformationAndPaths", propOrder = {"cluster", "volumeID"})
public class GetVolumeInformationAndPaths {
    protected ClusterUID cluster;
    protected DeviceUID volumeID;

    public GetVolumeInformationAndPaths() {
    }

    public GetVolumeInformationAndPaths(ClusterUID cluster, DeviceUID volumeID) {
        this.cluster = cluster;
        this.volumeID = volumeID;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public DeviceUID getVolumeID() {
        return this.volumeID;
    }


    public void setVolumeID(DeviceUID value) {
        this.volumeID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVolumeInformationAndPaths)) {
            return false;
        }
        GetVolumeInformationAndPaths otherObj = (GetVolumeInformationAndPaths) obj;

        return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.volumeID != null ? this.volumeID.equals(otherObj.volumeID) : this.volumeID == otherObj.volumeID);
    }


    public int hashCode() {
        return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.volumeID != null ? this.volumeID.hashCode() : 0);
    }


    public String toString() {
        return "GetVolumeInformationAndPaths [cluster=" + this.cluster + ", " + "volumeID=" + this.volumeID + "]";
    }
}


