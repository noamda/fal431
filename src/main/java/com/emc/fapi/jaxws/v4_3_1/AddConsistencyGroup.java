package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addConsistencyGroup", propOrder = {"groupName", "policy"})
public class AddConsistencyGroup {
    protected String groupName;
    protected ConsistencyGroupPolicy policy;

    public AddConsistencyGroup() {
    }

    public AddConsistencyGroup(String groupName, ConsistencyGroupPolicy policy) {
        this.groupName = groupName;
        this.policy = policy;
    }


    public String getGroupName() {
        return this.groupName;
    }


    public void setGroupName(String value) {
        this.groupName = value;
    }


    public ConsistencyGroupPolicy getPolicy() {
        return this.policy;
    }


    public void setPolicy(ConsistencyGroupPolicy value) {
        this.policy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddConsistencyGroup)) {
            return false;
        }
        AddConsistencyGroup otherObj = (AddConsistencyGroup) obj;

        return (this.groupName != null ? this.groupName.equals(otherObj.groupName) : this.groupName == otherObj.groupName) && (this.policy != null ? this.policy.equals(otherObj.policy) : this.policy == otherObj.policy);
    }


    public int hashCode() {
        return (this.groupName != null ? this.groupName.hashCode() : 0) ^ (this.policy != null ? this.policy.hashCode() : 0);
    }


    public String toString() {
        return "AddConsistencyGroup [groupName=" + this.groupName + ", " + "policy=" + this.policy + "]";
    }
}


