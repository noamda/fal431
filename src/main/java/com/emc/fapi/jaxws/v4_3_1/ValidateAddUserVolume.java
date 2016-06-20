package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateAddUserVolume", propOrder = {"groupCopy", "replicationSet", "volumeID"})
public class ValidateAddUserVolume {
    protected ConsistencyGroupCopyUID groupCopy;
    protected ReplicationSetUID replicationSet;
    protected DeviceUID volumeID;

    public ValidateAddUserVolume() {
    }

    public ValidateAddUserVolume(ConsistencyGroupCopyUID groupCopy, ReplicationSetUID replicationSet, DeviceUID volumeID) {
        this.groupCopy = groupCopy;
        this.replicationSet = replicationSet;
        this.volumeID = volumeID;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
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
        if (!(obj instanceof ValidateAddUserVolume)) {
            return false;
        }
        ValidateAddUserVolume otherObj = (ValidateAddUserVolume) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.replicationSet != null ? this.replicationSet.equals(otherObj.replicationSet) : this.replicationSet == otherObj.replicationSet) && (this.volumeID != null ? this.volumeID.equals(otherObj.volumeID) : this.volumeID == otherObj.volumeID);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.replicationSet != null ? this.replicationSet.hashCode() : 0) ^ (this.volumeID != null ? this.volumeID.hashCode() : 0);
    }


    public String toString() {
        return "ValidateAddUserVolume [groupCopy=" + this.groupCopy + ", " + "replicationSet=" + this.replicationSet + ", " + "volumeID=" + this.volumeID + "]";
    }
}


