package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationSetInfo", propOrder = {"replicationSetUID", "replicationSetName"})
public class ReplicationSetInfo {
    @XmlElement(nillable = true)
    protected ReplicationSetUID replicationSetUID;
    protected String replicationSetName;

    public ReplicationSetInfo() {
    }

    public ReplicationSetInfo(ReplicationSetUID replicationSetUID, String replicationSetName) {
        this.replicationSetUID = replicationSetUID;
        this.replicationSetName = replicationSetName;
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


    public boolean equals(Object obj) {
        if (!(obj instanceof ReplicationSetInfo)) {
            return false;
        }
        ReplicationSetInfo otherObj = (ReplicationSetInfo) obj;

        return (this.replicationSetUID != null ? this.replicationSetUID.equals(otherObj.replicationSetUID) : this.replicationSetUID == otherObj.replicationSetUID) && (this.replicationSetName != null ? this.replicationSetName.equals(otherObj.replicationSetName) : this.replicationSetName == otherObj.replicationSetName);
    }


    public int hashCode() {
        return (this.replicationSetUID != null ? this.replicationSetUID.hashCode() : 0) ^ (this.replicationSetName != null ? this.replicationSetName.hashCode() : 0);
    }


    public String toString() {
        return "ReplicationSetInfo [replicationSetUID=" + this.replicationSetUID + ", " + "replicationSetName=" + this.replicationSetName + "]";
    }
}


