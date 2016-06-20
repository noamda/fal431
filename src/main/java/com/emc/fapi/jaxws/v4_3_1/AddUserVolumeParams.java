package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addUserVolumeParams", propOrder = {"replicationSet", "volumeID"})
public class AddUserVolumeParams {
    protected ReplicationSetUID replicationSet;
    protected DeviceUID volumeID;

    public AddUserVolumeParams() {
    }

    public AddUserVolumeParams(ReplicationSetUID replicationSet, DeviceUID volumeID) {
        this.replicationSet = replicationSet;
        this.volumeID = volumeID;
    }


    public ReplicationSetUID getReplicationSet() {
        return this.replicationSet;
    }


    public void setReplicationSet(ReplicationSetUID value) {
        this.replicationSet = value;
    }


    public DeviceUID getVolumeID() {
        return this.volumeID;
    }


    public void setVolumeID(DeviceUID value) {
        this.volumeID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddUserVolumeParams)) {
            return false;
        }
        AddUserVolumeParams otherObj = (AddUserVolumeParams) obj;

        return (this.replicationSet != null ? this.replicationSet.equals(otherObj.replicationSet) : this.replicationSet == otherObj.replicationSet) && (this.volumeID != null ? this.volumeID.equals(otherObj.volumeID) : this.volumeID == otherObj.volumeID);
    }


    public int hashCode() {
        return (this.replicationSet != null ? this.replicationSet.hashCode() : 0) ^ (this.volumeID != null ? this.volumeID.hashCode() : 0);
    }


    public String toString() {
        return "AddUserVolumeParams [replicationSet=" + this.replicationSet + ", " + "volumeID=" + this.volumeID + "]";
    }
}


