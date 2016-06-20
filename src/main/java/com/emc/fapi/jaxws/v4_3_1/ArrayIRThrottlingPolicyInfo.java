package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayIRThrottlingPolicyInfo", propOrder = {"arrayThrottlePolicy", "arraySerialNumber"})
public class ArrayIRThrottlingPolicyInfo {
    @XmlElement(required = true, nillable = true)
    protected ArrayIRThrottlingPolicy arrayThrottlePolicy;
    protected String arraySerialNumber;

    public ArrayIRThrottlingPolicyInfo() {
    }

    public ArrayIRThrottlingPolicyInfo(ArrayIRThrottlingPolicy arrayThrottlePolicy, String arraySerialNumber) {
        this.arrayThrottlePolicy = arrayThrottlePolicy;
        this.arraySerialNumber = arraySerialNumber;
    }


    public ArrayIRThrottlingPolicy getArrayThrottlePolicy() {
        return this.arrayThrottlePolicy;
    }


    public void setArrayThrottlePolicy(ArrayIRThrottlingPolicy value) {
        this.arrayThrottlePolicy = value;
    }


    public String getArraySerialNumber() {
        return this.arraySerialNumber;
    }


    public void setArraySerialNumber(String value) {
        this.arraySerialNumber = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayIRThrottlingPolicyInfo)) {
            return false;
        }
        ArrayIRThrottlingPolicyInfo otherObj = (ArrayIRThrottlingPolicyInfo) obj;

        return (this.arrayThrottlePolicy != null ? this.arrayThrottlePolicy.equals(otherObj.arrayThrottlePolicy) : this.arrayThrottlePolicy == otherObj.arrayThrottlePolicy) && (this.arraySerialNumber != null ? this.arraySerialNumber.equals(otherObj.arraySerialNumber) : this.arraySerialNumber == otherObj.arraySerialNumber);
    }


    public int hashCode() {
        return (this.arrayThrottlePolicy != null ? this.arrayThrottlePolicy.hashCode() : 0) ^ (this.arraySerialNumber != null ? this.arraySerialNumber.hashCode() : 0);
    }


    public String toString() {
        return "ArrayIRThrottlingPolicyInfo [arrayThrottlePolicy=" + this.arrayThrottlePolicy + ", " + "arraySerialNumber=" + this.arraySerialNumber + "]";
    }
}


