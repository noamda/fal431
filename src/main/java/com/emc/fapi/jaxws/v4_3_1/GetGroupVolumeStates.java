package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGroupVolumeStates", propOrder = {"group"})
public class GetGroupVolumeStates {
    protected ConsistencyGroupUID group;

    public GetGroupVolumeStates() {
    }

    public GetGroupVolumeStates(ConsistencyGroupUID group) {
        this.group = group;
    }


    public ConsistencyGroupUID getGroup() {
        return this.group;
    }


    public void setGroup(ConsistencyGroupUID value) {
        this.group = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetGroupVolumeStates)) {
            return false;
        }
        GetGroupVolumeStates otherObj = (GetGroupVolumeStates) obj;

        return this.group == otherObj.group ? true : this.group != null ? this.group.equals(otherObj.group) : false;
    }


    public int hashCode() {
        return this.group != null ? this.group.hashCode() : 0;
    }


    public String toString() {
        return "GetGroupVolumeStates [group=" + this.group + "]";
    }
}


