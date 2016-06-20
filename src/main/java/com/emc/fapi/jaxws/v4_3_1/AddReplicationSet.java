package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addReplicationSet", propOrder = {"group", "replicationSetName"})
public class AddReplicationSet {
    protected ConsistencyGroupUID group;
    protected String replicationSetName;

    public AddReplicationSet() {
    }

    public AddReplicationSet(ConsistencyGroupUID group, String replicationSetName) {
        this.group = group;
        this.replicationSetName = replicationSetName;
    }


    public ConsistencyGroupUID getGroup() {
        return this.group;
    }


    public void setGroup(ConsistencyGroupUID value) {
        this.group = value;
    }


    public String getReplicationSetName() {
        return this.replicationSetName;
    }


    public void setReplicationSetName(String value) {
        this.replicationSetName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddReplicationSet)) {
            return false;
        }
        AddReplicationSet otherObj = (AddReplicationSet) obj;

        return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.replicationSetName != null ? this.replicationSetName.equals(otherObj.replicationSetName) : this.replicationSetName == otherObj.replicationSetName);
    }


    public int hashCode() {
        return (this.group != null ? this.group.hashCode() : 0) ^ (this.replicationSetName != null ? this.replicationSetName.hashCode() : 0);
    }


    public String toString() {
        return "AddReplicationSet [group=" + this.group + ", " + "replicationSetName=" + this.replicationSetName + "]";
    }
}


