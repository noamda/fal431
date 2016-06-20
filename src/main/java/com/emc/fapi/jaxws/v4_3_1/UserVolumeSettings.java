package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@JsonTypeName("UserVolumeSettings")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserVolumeSettings", propOrder = {"groupCopyUID", "replicationSetUID", "attachedSplitters"})
public class UserVolumeSettings
        extends VolumeSettings {
    protected ConsistencyGroupCopyUID groupCopyUID;
    @XmlElement(nillable = true)
    protected ReplicationSetUID replicationSetUID;
    @XmlElement(nillable = true)
    protected List<SplitterUID> attachedSplitters;

    public UserVolumeSettings() {
    }

    public UserVolumeSettings(ConsistencyGroupCopyUID groupCopyUID, ReplicationSetUID replicationSetUID, List<SplitterUID> attachedSplitters) {
        this.groupCopyUID = groupCopyUID;
        this.replicationSetUID = replicationSetUID;
        this.attachedSplitters = attachedSplitters;
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


    public List<SplitterUID> getAttachedSplitters() {
        if (this.attachedSplitters == null) {
            this.attachedSplitters = new ArrayList();
        }
        return this.attachedSplitters;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof UserVolumeSettings)) {
            return false;
        }
        UserVolumeSettings otherObj = (UserVolumeSettings) obj;

        return (super.equals(obj)) && (this.groupCopyUID != null ? this.groupCopyUID.equals(otherObj.groupCopyUID) : this.groupCopyUID == otherObj.groupCopyUID) && (this.replicationSetUID != null ? this.replicationSetUID.equals(otherObj.replicationSetUID) : this.replicationSetUID == otherObj.replicationSetUID) && (this.attachedSplitters != null ? this.attachedSplitters.equals(otherObj.attachedSplitters) : this.attachedSplitters == otherObj.attachedSplitters);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.groupCopyUID != null ? this.groupCopyUID.hashCode() : 0) ^ (this.replicationSetUID != null ? this.replicationSetUID.hashCode() : 0) ^ (this.attachedSplitters != null ? this.attachedSplitters.hashCode() : 0);
    }


    public String toString() {
        return "UserVolumeSettings [super=" + super.toString() + ", " + "groupCopyUID=" + this.groupCopyUID + ", " + "replicationSetUID=" + this.replicationSetUID + ", " + "attachedSplitters=" + this.attachedSplitters + "]";
    }
}


