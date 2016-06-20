package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachedUserVolumeInfo", propOrder = {"volumeID", "replicationSetUID", "sanInfo"})
public class AttachedUserVolumeInfo {
    protected DeviceUID volumeID;
    @XmlElement(nillable = true)
    protected ReplicationSetUID replicationSetUID;
    protected VolumeSANInfo sanInfo;

    public AttachedUserVolumeInfo() {
    }

    public AttachedUserVolumeInfo(DeviceUID volumeID, ReplicationSetUID replicationSetUID, VolumeSANInfo sanInfo) {
        this.volumeID = volumeID;
        this.replicationSetUID = replicationSetUID;
        this.sanInfo = sanInfo;
    }


    public DeviceUID getVolumeID() {
        return this.volumeID;
    }


    public void setVolumeID(DeviceUID value) {
        this.volumeID = value;
    }


    public ReplicationSetUID getReplicationSetUID() {
        return this.replicationSetUID;
    }


    public void setReplicationSetUID(ReplicationSetUID value) {
        this.replicationSetUID = value;
    }


    public VolumeSANInfo getSanInfo() {
        return this.sanInfo;
    }


    public void setSanInfo(VolumeSANInfo value) {
        this.sanInfo = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AttachedUserVolumeInfo)) {
            return false;
        }
        AttachedUserVolumeInfo otherObj = (AttachedUserVolumeInfo) obj;

        return (this.volumeID != null ? this.volumeID.equals(otherObj.volumeID) : this.volumeID == otherObj.volumeID) && (this.replicationSetUID != null ? this.replicationSetUID.equals(otherObj.replicationSetUID) : this.replicationSetUID == otherObj.replicationSetUID) && (this.sanInfo != null ? this.sanInfo.equals(otherObj.sanInfo) : this.sanInfo == otherObj.sanInfo);
    }


    public int hashCode() {
        return (this.volumeID != null ? this.volumeID.hashCode() : 0) ^ (this.replicationSetUID != null ? this.replicationSetUID.hashCode() : 0) ^ (this.sanInfo != null ? this.sanInfo.hashCode() : 0);
    }


    public String toString() {
        return "AttachedUserVolumeInfo [volumeID=" + this.volumeID + ", " + "replicationSetUID=" + this.replicationSetUID + ", " + "sanInfo=" + this.sanInfo + "]";
    }
}


