package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupInfo", propOrder = {"groupName", "groupUID"})
public class ConsistencyGroupInfo {
    protected String groupName;
    protected ConsistencyGroupUID groupUID;

    public ConsistencyGroupInfo() {
    }

    public ConsistencyGroupInfo(String groupName, ConsistencyGroupUID groupUID) {
        this.groupName = groupName;
        this.groupUID = groupUID;
    }


    public String getGroupName() {
        return this.groupName;
    }


    public void setGroupName(String value) {
        this.groupName = value;
    }


    public ConsistencyGroupUID getGroupUID() {
        return this.groupUID;
    }


    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupInfo)) {
            return false;
        }
        ConsistencyGroupInfo otherObj = (ConsistencyGroupInfo) obj;

        return (this.groupName != null ? this.groupName.equals(otherObj.groupName) : this.groupName == otherObj.groupName) && (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID);
    }


    public int hashCode() {
        return (this.groupName != null ? this.groupName.hashCode() : 0) ^ (this.groupUID != null ? this.groupUID.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupInfo [groupName=" + this.groupName + ", " + "groupUID=" + this.groupUID + "]";
    }
}


