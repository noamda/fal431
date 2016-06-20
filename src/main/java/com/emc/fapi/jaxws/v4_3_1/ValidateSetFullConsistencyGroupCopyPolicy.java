package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateSetFullConsistencyGroupCopyPolicy", propOrder = {"newCopyPolicy"})
public class ValidateSetFullConsistencyGroupCopyPolicy {
    protected FullConsistencyGroupCopyPolicy newCopyPolicy;

    public ValidateSetFullConsistencyGroupCopyPolicy() {
    }

    public ValidateSetFullConsistencyGroupCopyPolicy(FullConsistencyGroupCopyPolicy newCopyPolicy) {
        this.newCopyPolicy = newCopyPolicy;
    }


    public FullConsistencyGroupCopyPolicy getNewCopyPolicy() {
        return this.newCopyPolicy;
    }


    public void setNewCopyPolicy(FullConsistencyGroupCopyPolicy value) {
        this.newCopyPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateSetFullConsistencyGroupCopyPolicy)) {
            return false;
        }
        ValidateSetFullConsistencyGroupCopyPolicy otherObj = (ValidateSetFullConsistencyGroupCopyPolicy) obj;

        return this.newCopyPolicy == otherObj.newCopyPolicy ? true : this.newCopyPolicy != null ? this.newCopyPolicy.equals(otherObj.newCopyPolicy) : false;
    }


    public int hashCode() {
        return this.newCopyPolicy != null ? this.newCopyPolicy.hashCode() : 0;
    }


    public String toString() {
        return "ValidateSetFullConsistencyGroupCopyPolicy [newCopyPolicy=" + this.newCopyPolicy + "]";
    }
}


