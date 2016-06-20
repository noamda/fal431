package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateAddConsistencyGroupAndCopies", propOrder = {"fullGroupPolicy"})
public class ValidateAddConsistencyGroupAndCopies {
    protected FullConsistencyGroupPolicy fullGroupPolicy;

    public ValidateAddConsistencyGroupAndCopies() {
    }

    public ValidateAddConsistencyGroupAndCopies(FullConsistencyGroupPolicy fullGroupPolicy) {
        this.fullGroupPolicy = fullGroupPolicy;
    }


    public FullConsistencyGroupPolicy getFullGroupPolicy() {
        return this.fullGroupPolicy;
    }


    public void setFullGroupPolicy(FullConsistencyGroupPolicy value) {
        this.fullGroupPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateAddConsistencyGroupAndCopies)) {
            return false;
        }
        ValidateAddConsistencyGroupAndCopies otherObj = (ValidateAddConsistencyGroupAndCopies) obj;

        return this.fullGroupPolicy == otherObj.fullGroupPolicy ? true : this.fullGroupPolicy != null ? this.fullGroupPolicy.equals(otherObj.fullGroupPolicy) : false;
    }


    public int hashCode() {
        return this.fullGroupPolicy != null ? this.fullGroupPolicy.hashCode() : 0;
    }


    public String toString() {
        return "ValidateAddConsistencyGroupAndCopies [fullGroupPolicy=" + this.fullGroupPolicy + "]";
    }
}


