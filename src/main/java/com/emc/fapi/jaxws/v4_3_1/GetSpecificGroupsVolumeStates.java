package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSpecificGroupsVolumeStates", propOrder = {"groups"})
public class GetSpecificGroupsVolumeStates {
    protected List<ConsistencyGroupUID> groups;

    public GetSpecificGroupsVolumeStates() {
    }

    public GetSpecificGroupsVolumeStates(List<ConsistencyGroupUID> groups) {
        this.groups = groups;
    }


    public List<ConsistencyGroupUID> getGroups() {
        if (this.groups == null) {
            this.groups = new ArrayList();
        }
        return this.groups;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSpecificGroupsVolumeStates)) {
            return false;
        }
        GetSpecificGroupsVolumeStates otherObj = (GetSpecificGroupsVolumeStates) obj;

        return this.groups == otherObj.groups ? true : this.groups != null ? this.groups.equals(otherObj.groups) : false;
    }


    public int hashCode() {
        return this.groups != null ? this.groups.hashCode() : 0;
    }


    public String toString() {
        return "GetSpecificGroupsVolumeStates [groups=" + this.groups + "]";
    }
}


