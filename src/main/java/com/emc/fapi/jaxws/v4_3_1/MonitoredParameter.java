package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoredParameter", propOrder = {"key", "value"})
public class MonitoredParameter {
    protected MonitoredParameterKey key;
    protected MonitoredParameterValue value;

    public MonitoredParameter() {
    }

    public MonitoredParameter(MonitoredParameterKey key, MonitoredParameterValue value) {
        this.key = key;
        this.value = value;
    }


    public MonitoredParameterKey getKey() {
        return this.key;
    }


    public void setKey(MonitoredParameterKey value) {
        this.key = value;
    }


    public MonitoredParameterValue getValue() {
        return this.value;
    }


    public void setValue(MonitoredParameterValue value) {
        this.value = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof MonitoredParameter)) {
            return false;
        }
        MonitoredParameter otherObj = (MonitoredParameter) obj;

        return (this.key != null ? this.key.equals(otherObj.key) : this.key == otherObj.key) && (this.value != null ? this.value.equals(otherObj.value) : this.value == otherObj.value);
    }


    public int hashCode() {
        return (this.key != null ? this.key.hashCode() : 0) ^ (this.value != null ? this.value.hashCode() : 0);
    }


    public String toString() {
        return "MonitoredParameter [key=" + this.key + ", " + "value=" + this.value + "]";
    }
}


