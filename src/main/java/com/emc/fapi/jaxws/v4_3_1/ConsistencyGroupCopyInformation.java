package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupCopyInformation", propOrder = {"groupCopyUID", "name", "role", "vmsInformation"})
public class ConsistencyGroupCopyInformation {
    @XmlElement(nillable = true)
    protected ConsistencyGroupCopyUID groupCopyUID;
    protected String name;
    protected ConsistencyGroupCopyRole role;
    @XmlElement(nillable = true)
    protected List<VmInformation> vmsInformation;

    public ConsistencyGroupCopyInformation() {
    }

    public ConsistencyGroupCopyInformation(ConsistencyGroupCopyUID groupCopyUID, String name, ConsistencyGroupCopyRole role, List<VmInformation> vmsInformation) {
        this.groupCopyUID = groupCopyUID;
        this.name = name;
        this.role = role;
        this.vmsInformation = vmsInformation;
    }


    public ConsistencyGroupCopyUID getGroupCopyUID() {
        return this.groupCopyUID;
    }


    public void setGroupCopyUID(ConsistencyGroupCopyUID value) {
        this.groupCopyUID = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public ConsistencyGroupCopyRole getRole() {
        return this.role;
    }


    public void setRole(ConsistencyGroupCopyRole value) {
        this.role = value;
    }


    public List<VmInformation> getVmsInformation() {
        if (this.vmsInformation == null) {
            this.vmsInformation = new ArrayList();
        }
        return this.vmsInformation;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupCopyInformation)) {
            return false;
        }
        ConsistencyGroupCopyInformation otherObj = (ConsistencyGroupCopyInformation) obj;

        return (this.groupCopyUID != null ? this.groupCopyUID.equals(otherObj.groupCopyUID) : this.groupCopyUID == otherObj.groupCopyUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.role != null ? this.role.equals(otherObj.role) : this.role == otherObj.role) && (this.vmsInformation != null ? this.vmsInformation.equals(otherObj.vmsInformation) : this.vmsInformation == otherObj.vmsInformation);
    }


    public int hashCode() {
        return (this.groupCopyUID != null ? this.groupCopyUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.role != null ? this.role.hashCode() : 0) ^ (this.vmsInformation != null ? this.vmsInformation.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupCopyInformation [groupCopyUID=" + this.groupCopyUID + ", " + "name=" + this.name + ", " + "role=" + this.role + ", " + "vmsInformation=" + this.vmsInformation + "]";
    }
}


