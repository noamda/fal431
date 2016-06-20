package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupCopyInfo", propOrder = {"copyName", "copyUID", "groupName"})
public class ConsistencyGroupCopyInfo {
    protected String copyName;
    protected ConsistencyGroupCopyUID copyUID;
    protected String groupName;

    public ConsistencyGroupCopyInfo() {
    }

    public ConsistencyGroupCopyInfo(String copyName, ConsistencyGroupCopyUID copyUID, String groupName) {
        this.copyName = copyName;
        this.copyUID = copyUID;
        this.groupName = groupName;
    }


    public String getCopyName() {
        return this.copyName;
    }


    public void setCopyName(String value) {
        this.copyName = value;
    }


    public ConsistencyGroupCopyUID getCopyUID() {
        return this.copyUID;
    }


    public void setCopyUID(ConsistencyGroupCopyUID value) {
        this.copyUID = value;
    }


    public String getGroupName() {
        return this.groupName;
    }


    public void setGroupName(String value) {
        this.groupName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupCopyInfo)) {
            return false;
        }
        ConsistencyGroupCopyInfo otherObj = (ConsistencyGroupCopyInfo) obj;

        return (this.copyName != null ? this.copyName.equals(otherObj.copyName) : this.copyName == otherObj.copyName) && (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.groupName != null ? this.groupName.equals(otherObj.groupName) : this.groupName == otherObj.groupName);
    }


    public int hashCode() {
        return (this.copyName != null ? this.copyName.hashCode() : 0) ^ (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.groupName != null ? this.groupName.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupCopyInfo [copyName=" + this.copyName + ", " + "copyUID=" + this.copyUID + ", " + "groupName=" + this.groupName + "]";
    }
}


