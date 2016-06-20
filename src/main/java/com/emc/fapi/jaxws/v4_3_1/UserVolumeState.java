package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("UserVolumeState")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserVolumeState", propOrder = {"groupCopyUID", "replicationSetUID"})
public class UserVolumeState
        extends VolumeState {
    protected ConsistencyGroupCopyUID groupCopyUID;
    @XmlElement(nillable = true)
    protected ReplicationSetUID replicationSetUID;

    public UserVolumeState() {
    }

    public UserVolumeState(ConsistencyGroupCopyUID groupCopyUID, ReplicationSetUID replicationSetUID) {
        this.groupCopyUID = groupCopyUID;
        this.replicationSetUID = replicationSetUID;
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


    public boolean equals(Object obj) {
        if (!(obj instanceof UserVolumeState)) {
            return false;
        }
        UserVolumeState otherObj = (UserVolumeState) obj;

        return (super.equals(obj)) && (this.groupCopyUID != null ? this.groupCopyUID.equals(otherObj.groupCopyUID) : this.groupCopyUID == otherObj.groupCopyUID) && (this.replicationSetUID != null ? this.replicationSetUID.equals(otherObj.replicationSetUID) : this.replicationSetUID == otherObj.replicationSetUID);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.groupCopyUID != null ? this.groupCopyUID.hashCode() : 0) ^ (this.replicationSetUID != null ? this.replicationSetUID.hashCode() : 0);
    }


    public String toString() {
        return "UserVolumeState [super=" + super.toString() + ", " + "groupCopyUID=" + this.groupCopyUID + ", " + "replicationSetUID=" + this.replicationSetUID + "]";
    }
}


