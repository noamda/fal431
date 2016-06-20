package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupSetSubset", propOrder = {"groupSetUID", "groupsToExclude"})
public class ConsistencyGroupSetSubset {
    @XmlElement(required = true)
    protected ConsistencyGroupSetUID groupSetUID;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupUID> groupsToExclude;

    public ConsistencyGroupSetSubset() {
    }

    public ConsistencyGroupSetSubset(ConsistencyGroupSetUID groupSetUID, List<ConsistencyGroupUID> groupsToExclude) {
        this.groupSetUID = groupSetUID;
        this.groupsToExclude = groupsToExclude;
    }


    public ConsistencyGroupSetUID getGroupSetUID() {
        return this.groupSetUID;
    }


    public void setGroupSetUID(ConsistencyGroupSetUID value) {
        this.groupSetUID = value;
    }


    public List<ConsistencyGroupUID> getGroupsToExclude() {
        if (this.groupsToExclude == null) {
            this.groupsToExclude = new ArrayList();
        }
        return this.groupsToExclude;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupSetSubset)) {
            return false;
        }
        ConsistencyGroupSetSubset otherObj = (ConsistencyGroupSetSubset) obj;

        return (this.groupSetUID != null ? this.groupSetUID.equals(otherObj.groupSetUID) : this.groupSetUID == otherObj.groupSetUID) && (this.groupsToExclude != null ? this.groupsToExclude.equals(otherObj.groupsToExclude) : this.groupsToExclude == otherObj.groupsToExclude);
    }


    public int hashCode() {
        return (this.groupSetUID != null ? this.groupSetUID.hashCode() : 0) ^ (this.groupsToExclude != null ? this.groupsToExclude.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupSetSubset [groupSetUID=" + this.groupSetUID + ", " + "groupsToExclude=" + this.groupsToExclude + "]";
    }
}


