package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMVolume", propOrder = {"canonicalName", "volumeID", "groupCopyUID", "replicationSetUID", "filtered"})
public class VMVolume {
    protected String canonicalName;
    protected DeviceUID volumeID;
    protected ConsistencyGroupCopyUID groupCopyUID;
    @XmlElement(nillable = true)
    protected ReplicationSetUID replicationSetUID;
    protected boolean filtered;

    public VMVolume() {
    }

    public VMVolume(String canonicalName, DeviceUID volumeID, ConsistencyGroupCopyUID groupCopyUID, ReplicationSetUID replicationSetUID, boolean filtered) {
        this.canonicalName = canonicalName;
        this.volumeID = volumeID;
        this.groupCopyUID = groupCopyUID;
        this.replicationSetUID = replicationSetUID;
        this.filtered = filtered;
    }


    public String getCanonicalName() {
        return this.canonicalName;
    }


    public void setCanonicalName(String value) {
        this.canonicalName = value;
    }


    public DeviceUID getVolumeID() {
        return this.volumeID;
    }


    public void setVolumeID(DeviceUID value) {
        this.volumeID = value;
    }


    public ConsistencyGroupCopyUID getGroupCopyUID() {
        return this.groupCopyUID;
    }


    public void setGroupCopyUID(ConsistencyGroupCopyUID value) {
        this.groupCopyUID = value;
    }


    public ReplicationSetUID getReplicationSetUID() {
        return this.replicationSetUID;
    }


    public void setReplicationSetUID(ReplicationSetUID value) {
        this.replicationSetUID = value;
    }


    public boolean isFiltered() {
        return this.filtered;
    }


    public void setFiltered(boolean value) {
        this.filtered = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VMVolume)) {
            return false;
        }
        VMVolume otherObj = (VMVolume) obj;

        return (this.canonicalName != null ? this.canonicalName.equals(otherObj.canonicalName) : this.canonicalName == otherObj.canonicalName) && (this.volumeID != null ? this.volumeID.equals(otherObj.volumeID) : this.volumeID == otherObj.volumeID) && (this.groupCopyUID != null ? this.groupCopyUID.equals(otherObj.groupCopyUID) : this.groupCopyUID == otherObj.groupCopyUID) && (this.replicationSetUID != null ? this.replicationSetUID.equals(otherObj.replicationSetUID) : this.replicationSetUID == otherObj.replicationSetUID) && (this.filtered == otherObj.filtered);
    }


    public int hashCode() {
        return (this.canonicalName != null ? this.canonicalName.hashCode() : 0) ^ (this.volumeID != null ? this.volumeID.hashCode() : 0) ^ (this.groupCopyUID != null ? this.groupCopyUID.hashCode() : 0) ^ (this.replicationSetUID != null ? this.replicationSetUID.hashCode() : 0) ^ (this.filtered ? 1 : 0);
    }


    public String toString() {
        return "VMVolume [canonicalName=" + this.canonicalName + ", " + "volumeID=" + this.volumeID + ", " + "groupCopyUID=" + this.groupCopyUID + ", " + "replicationSetUID=" + this.replicationSetUID + ", " + "filtered=" + this.filtered + "]";
    }
}


