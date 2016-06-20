package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "renameReplicationSet", propOrder = {"replicationSet", "newName"})
public class RenameReplicationSet {
    protected ReplicationSetUID replicationSet;
    protected String newName;

    public RenameReplicationSet() {
    }

    public RenameReplicationSet(ReplicationSetUID replicationSet, String newName) {
        this.replicationSet = replicationSet;
        this.newName = newName;
    }


    public ReplicationSetUID getReplicationSet() {
        return this.replicationSet;
    }


    public void setReplicationSet(ReplicationSetUID value) {
        this.replicationSet = value;
    }


    public String getNewName() {
        return this.newName;
    }


    public void setNewName(String value) {
        this.newName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RenameReplicationSet)) {
            return false;
        }
        RenameReplicationSet otherObj = (RenameReplicationSet) obj;

        return (this.replicationSet != null ? this.replicationSet.equals(otherObj.replicationSet) : this.replicationSet == otherObj.replicationSet) && (this.newName != null ? this.newName.equals(otherObj.newName) : this.newName == otherObj.newName);
    }


    public int hashCode() {
        return (this.replicationSet != null ? this.replicationSet.hashCode() : 0) ^ (this.newName != null ? this.newName.hashCode() : 0);
    }


    public String toString() {
        return "RenameReplicationSet [replicationSet=" + this.replicationSet + ", " + "newName=" + this.newName + "]";
    }
}


