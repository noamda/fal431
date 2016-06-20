package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateSetConsistencyGroupCopyPolicy", propOrder = {"groupCopy", "newPolicy"})
public class ValidateSetConsistencyGroupCopyPolicy {
    protected ConsistencyGroupCopyUID groupCopy;
    protected ConsistencyGroupCopyPolicy newPolicy;

    public ValidateSetConsistencyGroupCopyPolicy() {
    }

    public ValidateSetConsistencyGroupCopyPolicy(ConsistencyGroupCopyUID groupCopy, ConsistencyGroupCopyPolicy newPolicy) {
        this.groupCopy = groupCopy;
        this.newPolicy = newPolicy;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public ConsistencyGroupCopyPolicy getNewPolicy() {
        return this.newPolicy;
    }


    public void setNewPolicy(ConsistencyGroupCopyPolicy value) {
        this.newPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateSetConsistencyGroupCopyPolicy)) {
            return false;
        }
        ValidateSetConsistencyGroupCopyPolicy otherObj = (ValidateSetConsistencyGroupCopyPolicy) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.newPolicy != null ? this.newPolicy.equals(otherObj.newPolicy) : this.newPolicy == otherObj.newPolicy);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.newPolicy != null ? this.newPolicy.hashCode() : 0);
    }


    public String toString() {
        return "ValidateSetConsistencyGroupCopyPolicy [groupCopy=" + this.groupCopy + ", " + "newPolicy=" + this.newPolicy + "]";
    }
}


