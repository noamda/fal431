package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeReplicationSet", propOrder = {"group", "replicationSet"})
public class RemoveReplicationSet {
    protected ConsistencyGroupUID group;
    protected ReplicationSetUID replicationSet;

    public RemoveReplicationSet() {
    }

    public RemoveReplicationSet(ConsistencyGroupUID group, ReplicationSetUID replicationSet) {
        this.group = group;
        this.replicationSet = replicationSet;
    }


    public ConsistencyGroupUID getGroup() {
        return this.group;
    }


    public void setGroup(ConsistencyGroupUID value) {
        this.group = value;
    }


    public ReplicationSetUID getReplicationSet() {
        return this.replicationSet;
    }


    public void setReplicationSet(ReplicationSetUID value) {
        this.replicationSet = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RemoveReplicationSet)) {
            return false;
        }
        RemoveReplicationSet otherObj = (RemoveReplicationSet) obj;

        return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.replicationSet != null ? this.replicationSet.equals(otherObj.replicationSet) : this.replicationSet == otherObj.replicationSet);
    }


    public int hashCode() {
        return (this.group != null ? this.group.hashCode() : 0) ^ (this.replicationSet != null ? this.replicationSet.hashCode() : 0);
    }


    public String toString() {
        return "RemoveReplicationSet [group=" + this.group + ", " + "replicationSet=" + this.replicationSet + "]";
    }
}


