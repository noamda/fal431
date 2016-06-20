package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReplicationSetName", propOrder = {"replicationSet"})
public class GetReplicationSetName {
    protected ReplicationSetUID replicationSet;

    public GetReplicationSetName() {
    }

    public GetReplicationSetName(ReplicationSetUID replicationSet) {
        this.replicationSet = replicationSet;
    }


    public ReplicationSetUID getReplicationSet() {
        return this.replicationSet;
    }


    public void setReplicationSet(ReplicationSetUID value) {
        this.replicationSet = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetReplicationSetName)) {
            return false;
        }
        GetReplicationSetName otherObj = (GetReplicationSetName) obj;

        return this.replicationSet == otherObj.replicationSet ? true : this.replicationSet != null ? this.replicationSet.equals(otherObj.replicationSet) : false;
    }


    public int hashCode() {
        return this.replicationSet != null ? this.replicationSet.hashCode() : 0;
    }


    public String toString() {
        return "GetReplicationSetName [replicationSet=" + this.replicationSet + "]";
    }
}


