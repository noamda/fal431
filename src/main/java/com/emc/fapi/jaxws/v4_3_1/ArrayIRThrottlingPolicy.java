package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayIRThrottlingPolicy", propOrder = {"throttleType", "customValue"})
public class ArrayIRThrottlingPolicy {
    @XmlElement(required = true)
    protected IrThrottleType throttleType;
    protected Long customValue;

    public ArrayIRThrottlingPolicy() {
    }

    public ArrayIRThrottlingPolicy(IrThrottleType throttleType, Long customValue) {
        this.throttleType = throttleType;
        this.customValue = customValue;
    }


    public IrThrottleType getThrottleType() {
        return this.throttleType;
    }


    public void setThrottleType(IrThrottleType value) {
        this.throttleType = value;
    }


    public Long getCustomValue() {
        return this.customValue;
    }


    public void setCustomValue(Long value) {
        this.customValue = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayIRThrottlingPolicy)) {
            return false;
        }
        ArrayIRThrottlingPolicy otherObj = (ArrayIRThrottlingPolicy) obj;

        return (this.throttleType != null ? this.throttleType.equals(otherObj.throttleType) : this.throttleType == otherObj.throttleType) && (this.customValue != null ? this.customValue.equals(otherObj.customValue) : this.customValue == otherObj.customValue);
    }


    public int hashCode() {
        return (this.throttleType != null ? this.throttleType.hashCode() : 0) ^ (this.customValue != null ? this.customValue.hashCode() : 0);
    }


    public String toString() {
        return "ArrayIRThrottlingPolicy [throttleType=" + this.throttleType + ", " + "customValue=" + this.customValue + "]";
    }
}


