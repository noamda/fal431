package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayResourcePoolTieringPolicy", propOrder = {"policy"})
public class ArrayResourcePoolTieringPolicy {
    @XmlElement(required = true)
    protected String policy;

    public ArrayResourcePoolTieringPolicy() {
    }

    public ArrayResourcePoolTieringPolicy(String policy) {
        this.policy = policy;
    }


    public String getPolicy() {
        return this.policy;
    }


    public void setPolicy(String value) {
        this.policy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayResourcePoolTieringPolicy)) {
            return false;
        }
        ArrayResourcePoolTieringPolicy otherObj = (ArrayResourcePoolTieringPolicy) obj;

        return this.policy == otherObj.policy ? true : this.policy != null ? this.policy.equals(otherObj.policy) : false;
    }


    public int hashCode() {
        return this.policy != null ? this.policy.hashCode() : 0;
    }


    public String toString() {
        return "ArrayResourcePoolTieringPolicy [policy=" + this.policy + "]";
    }
}


