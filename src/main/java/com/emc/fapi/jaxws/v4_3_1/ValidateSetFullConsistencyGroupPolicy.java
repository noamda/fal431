package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateSetFullConsistencyGroupPolicy", propOrder = {"newPolicy"})
public class ValidateSetFullConsistencyGroupPolicy {
    protected FullConsistencyGroupPolicy newPolicy;

    public ValidateSetFullConsistencyGroupPolicy() {
    }

    public ValidateSetFullConsistencyGroupPolicy(FullConsistencyGroupPolicy newPolicy) {
        this.newPolicy = newPolicy;
    }


    public FullConsistencyGroupPolicy getNewPolicy() {
        return this.newPolicy;
    }


    public void setNewPolicy(FullConsistencyGroupPolicy value) {
        this.newPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateSetFullConsistencyGroupPolicy)) {
            return false;
        }
        ValidateSetFullConsistencyGroupPolicy otherObj = (ValidateSetFullConsistencyGroupPolicy) obj;

        return this.newPolicy == otherObj.newPolicy ? true : this.newPolicy != null ? this.newPolicy.equals(otherObj.newPolicy) : false;
    }


    public int hashCode() {
        return this.newPolicy != null ? this.newPolicy.hashCode() : 0;
    }


    public String toString() {
        return "ValidateSetFullConsistencyGroupPolicy [newPolicy=" + this.newPolicy + "]";
    }
}


