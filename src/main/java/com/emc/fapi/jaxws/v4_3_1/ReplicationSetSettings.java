package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationSetSettings", propOrder = {"replicationSetUID", "replicationSetName", "sizeInBytes", "volumes"})
public class ReplicationSetSettings {
    @XmlElement(nillable = true)
    protected ReplicationSetUID replicationSetUID;
    protected String replicationSetName;
    protected long sizeInBytes;
    @XmlElement(nillable = true)
    protected List<UserVolumeSettings> volumes;

    public ReplicationSetSettings() {
    }

    public ReplicationSetSettings(ReplicationSetUID replicationSetUID, String replicationSetName, long sizeInBytes, List<UserVolumeSettings> volumes) {
        this.replicationSetUID = replicationSetUID;
        this.replicationSetName = replicationSetName;
        this.sizeInBytes = sizeInBytes;
        this.volumes = volumes;
    }


    public ReplicationSetUID getReplicationSetUID() {
        return this.replicationSetUID;
    }


    public void setReplicationSetUID(ReplicationSetUID value) {
        this.replicationSetUID = value;
    }


    public String getReplicationSetName() {
        return this.replicationSetName;
    }


    public void setReplicationSetName(String value) {
        this.replicationSetName = value;
    }


    public long getSizeInBytes() {
        return this.sizeInBytes;
    }


    public void setSizeInBytes(long value) {
        this.sizeInBytes = value;
    }


    public List<UserVolumeSettings> getVolumes() {
        if (this.volumes == null) {
            this.volumes = new ArrayList();
        }
        return this.volumes;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ReplicationSetSettings)) {
            return false;
        }
        ReplicationSetSettings otherObj = (ReplicationSetSettings) obj;

        return (this.replicationSetUID != null ? this.replicationSetUID.equals(otherObj.replicationSetUID) : this.replicationSetUID == otherObj.replicationSetUID) && (this.replicationSetName != null ? this.replicationSetName.equals(otherObj.replicationSetName) : this.replicationSetName == otherObj.replicationSetName) && (this.sizeInBytes == otherObj.sizeInBytes) && (this.volumes != null ? this.volumes.equals(otherObj.volumes) : this.volumes == otherObj.volumes);
    }


    public int hashCode() {
        return (this.replicationSetUID != null ? this.replicationSetUID.hashCode() : 0) ^ (this.replicationSetName != null ? this.replicationSetName.hashCode() : 0) ^ (int) this.sizeInBytes ^ (this.volumes != null ? this.volumes.hashCode() : 0);
    }


    public String toString() {
        return "ReplicationSetSettings [replicationSetUID=" + this.replicationSetUID + ", " + "replicationSetName=" + this.replicationSetName + ", " + "sizeInBytes=" + this.sizeInBytes + ", " + "volumes=" + this.volumes + "]";
    }
}


