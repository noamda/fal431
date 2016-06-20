package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupCopyRoleInfo", propOrder = {"role", "sourceCopyUID"})
public class ConsistencyGroupCopyRoleInfo {
    protected ConsistencyGroupCopyRole role;
    protected ConsistencyGroupCopyUID sourceCopyUID;

    public ConsistencyGroupCopyRoleInfo() {
    }

    public ConsistencyGroupCopyRoleInfo(ConsistencyGroupCopyRole role, ConsistencyGroupCopyUID sourceCopyUID) {
        this.role = role;
        this.sourceCopyUID = sourceCopyUID;
    }


    public ConsistencyGroupCopyRole getRole() {
        return this.role;
    }


    public void setRole(ConsistencyGroupCopyRole value) {
        this.role = value;
    }


    public ConsistencyGroupCopyUID getSourceCopyUID() {
        return this.sourceCopyUID;
    }


    public void setSourceCopyUID(ConsistencyGroupCopyUID value) {
        this.sourceCopyUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupCopyRoleInfo)) {
            return false;
        }
        ConsistencyGroupCopyRoleInfo otherObj = (ConsistencyGroupCopyRoleInfo) obj;

        return (this.role != null ? this.role.equals(otherObj.role) : this.role == otherObj.role) && (this.sourceCopyUID != null ? this.sourceCopyUID.equals(otherObj.sourceCopyUID) : this.sourceCopyUID == otherObj.sourceCopyUID);
    }


    public int hashCode() {
        return (this.role != null ? this.role.hashCode() : 0) ^ (this.sourceCopyUID != null ? this.sourceCopyUID.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupCopyRoleInfo [role=" + this.role + ", " + "sourceCopyUID=" + this.sourceCopyUID + "]";
    }
}


