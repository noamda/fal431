package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationSetVolumesState", propOrder = {"replicationSetUID", "userVolumesState", "maxPossibleSizeInBytes", "canBeEnlarged"})
public class ReplicationSetVolumesState {
    @XmlElement(nillable = true)
    protected ReplicationSetUID replicationSetUID;
    @XmlElement(nillable = true)
    protected List<UserVolumeState> userVolumesState;
    protected long maxPossibleSizeInBytes;
    protected boolean canBeEnlarged;

    public ReplicationSetVolumesState() {
    }

    public ReplicationSetVolumesState(ReplicationSetUID replicationSetUID, List<UserVolumeState> userVolumesState, long maxPossibleSizeInBytes, boolean canBeEnlarged) {
        this.replicationSetUID = replicationSetUID;
        this.userVolumesState = userVolumesState;
        this.maxPossibleSizeInBytes = maxPossibleSizeInBytes;
        this.canBeEnlarged = canBeEnlarged;
    }


    public ReplicationSetUID getReplicationSetUID() {
        return this.replicationSetUID;
    }


    public void setReplicationSetUID(ReplicationSetUID value) {
        this.replicationSetUID = value;
    }


    public List<UserVolumeState> getUserVolumesState() {
        if (this.userVolumesState == null) {
            this.userVolumesState = new ArrayList();
        }
        return this.userVolumesState;
    }


    public long getMaxPossibleSizeInBytes() {
        return this.maxPossibleSizeInBytes;
    }


    public void setMaxPossibleSizeInBytes(long value) {
        this.maxPossibleSizeInBytes = value;
    }


    public boolean isCanBeEnlarged() {
        return this.canBeEnlarged;
    }


    public void setCanBeEnlarged(boolean value) {
        this.canBeEnlarged = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ReplicationSetVolumesState)) {
            return false;
        }
        ReplicationSetVolumesState otherObj = (ReplicationSetVolumesState) obj;

        return (this.replicationSetUID != null ? this.replicationSetUID.equals(otherObj.replicationSetUID) : this.replicationSetUID == otherObj.replicationSetUID) && (this.userVolumesState != null ? this.userVolumesState.equals(otherObj.userVolumesState) : this.userVolumesState == otherObj.userVolumesState) && (this.maxPossibleSizeInBytes == otherObj.maxPossibleSizeInBytes) && (this.canBeEnlarged == otherObj.canBeEnlarged);
    }


    public int hashCode() {
        return (this.replicationSetUID != null ? this.replicationSetUID.hashCode() : 0) ^ (this.userVolumesState != null ? this.userVolumesState.hashCode() : 0) ^ (int) this.maxPossibleSizeInBytes ^ (this.canBeEnlarged ? 1 : 0);
    }


    public String toString() {
        return "ReplicationSetVolumesState [replicationSetUID=" + this.replicationSetUID + ", " + "userVolumesState=" + this.userVolumesState + ", " + "maxPossibleSizeInBytes=" + this.maxPossibleSizeInBytes + ", " + "canBeEnlarged=" + this.canBeEnlarged + "]";
    }
}


