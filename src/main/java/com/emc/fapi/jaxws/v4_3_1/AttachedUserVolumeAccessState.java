package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachedUserVolumeAccessState", propOrder = {"volumeID", "groupCopyUID", "replicationSetUID", "accessState", "visible", "currentDelayExpiryTimeoutInSeconds"})
public class AttachedUserVolumeAccessState {
    protected DeviceUID volumeID;
    protected ConsistencyGroupCopyUID groupCopyUID;
    @XmlElement(nillable = true)
    protected ReplicationSetUID replicationSetUID;
    protected VolumeAccessState accessState;
    protected Boolean visible;
    protected int currentDelayExpiryTimeoutInSeconds;

    public AttachedUserVolumeAccessState() {
    }

    public AttachedUserVolumeAccessState(DeviceUID volumeID, ConsistencyGroupCopyUID groupCopyUID, ReplicationSetUID replicationSetUID, VolumeAccessState accessState, Boolean visible, int currentDelayExpiryTimeoutInSeconds) {
        this.volumeID = volumeID;
        this.groupCopyUID = groupCopyUID;
        this.replicationSetUID = replicationSetUID;
        this.accessState = accessState;
        this.visible = visible;
        this.currentDelayExpiryTimeoutInSeconds = currentDelayExpiryTimeoutInSeconds;
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


    public VolumeAccessState getAccessState() {
        return this.accessState;
    }


    public void setAccessState(VolumeAccessState value) {
        this.accessState = value;
    }


    public Boolean isVisible() {
        return this.visible;
    }


    public void setVisible(Boolean value) {
        this.visible = value;
    }


    public int getCurrentDelayExpiryTimeoutInSeconds() {
        return this.currentDelayExpiryTimeoutInSeconds;
    }


    public void setCurrentDelayExpiryTimeoutInSeconds(int value) {
        this.currentDelayExpiryTimeoutInSeconds = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AttachedUserVolumeAccessState)) {
            return false;
        }
        AttachedUserVolumeAccessState otherObj = (AttachedUserVolumeAccessState) obj;

        return (this.volumeID != null ? this.volumeID.equals(otherObj.volumeID) : this.volumeID == otherObj.volumeID) && (this.groupCopyUID != null ? this.groupCopyUID.equals(otherObj.groupCopyUID) : this.groupCopyUID == otherObj.groupCopyUID) && (this.replicationSetUID != null ? this.replicationSetUID.equals(otherObj.replicationSetUID) : this.replicationSetUID == otherObj.replicationSetUID) && (this.accessState != null ? this.accessState.equals(otherObj.accessState) : this.accessState == otherObj.accessState) && (this.visible != null ? this.visible.equals(otherObj.visible) : this.visible == otherObj.visible) && (this.currentDelayExpiryTimeoutInSeconds == otherObj.currentDelayExpiryTimeoutInSeconds);
    }


    public int hashCode() {
        return (this.volumeID != null ? this.volumeID.hashCode() : 0) ^ (this.groupCopyUID != null ? this.groupCopyUID.hashCode() : 0) ^ (this.replicationSetUID != null ? this.replicationSetUID.hashCode() : 0) ^ (this.accessState != null ? this.accessState.hashCode() : 0) ^ (this.visible != null ? this.visible.hashCode() : 0) ^ this.currentDelayExpiryTimeoutInSeconds;
    }


    public String toString() {
        return "AttachedUserVolumeAccessState [volumeID=" + this.volumeID + ", " + "groupCopyUID=" + this.groupCopyUID + ", " + "replicationSetUID=" + this.replicationSetUID + ", " + "accessState=" + this.accessState + ", " + "visible=" + this.visible + ", " + "currentDelayExpiryTimeoutInSeconds=" + this.currentDelayExpiryTimeoutInSeconds + "]";
    }
}


