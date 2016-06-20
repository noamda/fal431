package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateSetConsistencyGroupPolicy", propOrder = {"group", "newPolicy"})
public class ValidateSetConsistencyGroupPolicy {
    protected ConsistencyGroupUID group;
    protected ConsistencyGroupPolicy newPolicy;

    public ValidateSetConsistencyGroupPolicy() {
    }

    public ValidateSetConsistencyGroupPolicy(ConsistencyGroupUID group, ConsistencyGroupPolicy newPolicy) {
        this.group = group;
        this.newPolicy = newPolicy;
    }


    public ConsistencyGroupUID getGroup() {
        return this.group;
    }


    public void setGroup(ConsistencyGroupUID value) {
        this.group = value;
    }


    public ConsistencyGroupPolicy getNewPolicy() {
        return this.newPolicy;
    }


    public void setNewPolicy(ConsistencyGroupPolicy value) {
        this.newPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateSetConsistencyGroupPolicy)) {
            return false;
        }
        ValidateSetConsistencyGroupPolicy otherObj = (ValidateSetConsistencyGroupPolicy) obj;

        return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.newPolicy != null ? this.newPolicy.equals(otherObj.newPolicy) : this.newPolicy == otherObj.newPolicy);
    }


    public int hashCode() {
        return (this.group != null ? this.group.hashCode() : 0) ^ (this.newPolicy != null ? this.newPolicy.hashCode() : 0);
    }


    public String toString() {
        return "ValidateSetConsistencyGroupPolicy [group=" + this.group + ", " + "newPolicy=" + this.newPolicy + "]";
    }
}


