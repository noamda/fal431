package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserVolumeSettingsChangesParam", propOrder = {"newVolumeID", "removedVolumeID", "copyUID"})
public class UserVolumeSettingsChangesParam {
    protected DeviceUID newVolumeID;
    protected DeviceUID removedVolumeID;
    @XmlElement(required = true)
    protected ConsistencyGroupCopyUID copyUID;

    public UserVolumeSettingsChangesParam() {
    }

    public UserVolumeSettingsChangesParam(DeviceUID newVolumeID, DeviceUID removedVolumeID, ConsistencyGroupCopyUID copyUID) {
        this.newVolumeID = newVolumeID;
        this.removedVolumeID = removedVolumeID;
        this.copyUID = copyUID;
    }


    public DeviceUID getNewVolumeID() {
        return this.newVolumeID;
    }


    public void setNewVolumeID(DeviceUID value) {
        this.newVolumeID = value;
    }


    public DeviceUID getRemovedVolumeID() {
        return this.removedVolumeID;
    }


    public void setRemovedVolumeID(DeviceUID value) {
        this.removedVolumeID = value;
    }


    public ConsistencyGroupCopyUID getCopyUID() {
        return this.copyUID;
    }


    public void setCopyUID(ConsistencyGroupCopyUID value) {
        this.copyUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof UserVolumeSettingsChangesParam)) {
            return false;
        }
        UserVolumeSettingsChangesParam otherObj = (UserVolumeSettingsChangesParam) obj;

        return (this.newVolumeID != null ? this.newVolumeID.equals(otherObj.newVolumeID) : this.newVolumeID == otherObj.newVolumeID) && (this.removedVolumeID != null ? this.removedVolumeID.equals(otherObj.removedVolumeID) : this.removedVolumeID == otherObj.removedVolumeID) && (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID);
    }


    public int hashCode() {
        return (this.newVolumeID != null ? this.newVolumeID.hashCode() : 0) ^ (this.removedVolumeID != null ? this.removedVolumeID.hashCode() : 0) ^ (this.copyUID != null ? this.copyUID.hashCode() : 0);
    }


    public String toString() {
        return "UserVolumeSettingsChangesParam [newVolumeID=" + this.newVolumeID + ", " + "removedVolumeID=" + this.removedVolumeID + ", " + "copyUID=" + this.copyUID + "]";
    }
}


