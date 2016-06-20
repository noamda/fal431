package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayIRThrottlingPolicyParams", propOrder = {"irTrhottlingInfo"})
public class ArrayIRThrottlingPolicyParams {
    @XmlElement(name = "iRTrhottlingInfo")
    protected ArrayIRThrottlingPolicyInfo irTrhottlingInfo;

    public ArrayIRThrottlingPolicyParams() {
    }

    public ArrayIRThrottlingPolicyParams(ArrayIRThrottlingPolicyInfo irTrhottlingInfo) {
        this.irTrhottlingInfo = irTrhottlingInfo;
    }


    public ArrayIRThrottlingPolicyInfo getIRTrhottlingInfo() {
        return this.irTrhottlingInfo;
    }


    public void setIRTrhottlingInfo(ArrayIRThrottlingPolicyInfo value) {
        this.irTrhottlingInfo = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayIRThrottlingPolicyParams)) {
            return false;
        }
        ArrayIRThrottlingPolicyParams otherObj = (ArrayIRThrottlingPolicyParams) obj;

        return this.irTrhottlingInfo == otherObj.irTrhottlingInfo ? true : this.irTrhottlingInfo != null ? this.irTrhottlingInfo.equals(otherObj.irTrhottlingInfo) : false;
    }


    public int hashCode() {
        return this.irTrhottlingInfo != null ? this.irTrhottlingInfo.hashCode() : 0;
    }


    public String toString() {
        return "ArrayIRThrottlingPolicyParams [irTrhottlingInfo=" + this.irTrhottlingInfo + "]";
    }
}


