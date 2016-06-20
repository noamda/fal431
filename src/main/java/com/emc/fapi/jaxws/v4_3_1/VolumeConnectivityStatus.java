package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("VolumeConnectivityStatus")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeConnectivityStatus", propOrder = {"volumeID", "volumeStatus"})
public class VolumeConnectivityStatus
        extends ClusterEntityConnectivityStatus {
    protected DeviceUID volumeID;
    @XmlElement(nillable = true)
    protected VolumeStatus volumeStatus;

    public VolumeConnectivityStatus() {
    }

    public VolumeConnectivityStatus(DeviceUID volumeID, VolumeStatus volumeStatus) {
        this.volumeID = volumeID;
        this.volumeStatus = volumeStatus;
    }


    public DeviceUID getVolumeID() {
        return this.volumeID;
    }


    public void setVolumeID(DeviceUID value) {
        this.volumeID = value;
    }


    public VolumeStatus getVolumeStatus() {
        return this.volumeStatus;
    }


    public void setVolumeStatus(VolumeStatus value) {
        this.volumeStatus = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VolumeConnectivityStatus)) {
            return false;
        }
        VolumeConnectivityStatus otherObj = (VolumeConnectivityStatus) obj;

        return (super.equals(obj)) && (this.volumeID != null ? this.volumeID.equals(otherObj.volumeID) : this.volumeID == otherObj.volumeID) && (this.volumeStatus != null ? this.volumeStatus.equals(otherObj.volumeStatus) : this.volumeStatus == otherObj.volumeStatus);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.volumeID != null ? this.volumeID.hashCode() : 0) ^ (this.volumeStatus != null ? this.volumeStatus.hashCode() : 0);
    }


    public String toString() {
        return "VolumeConnectivityStatus [super=" + super.toString() + ", " + "volumeID=" + this.volumeID + ", " + "volumeStatus=" + this.volumeStatus + "]";
    }
}


