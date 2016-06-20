package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitterOSAndVersionInfo", propOrder = {"key", "value"})
public class SplitterOSAndVersionInfo {
    protected String key;
    protected String value;

    public SplitterOSAndVersionInfo() {
    }

    public SplitterOSAndVersionInfo(String key, String value) {
        this.key = key;
        this.value = value;
    }


    public String getKey() {
        return this.key;
    }


    public void setKey(String value) {
        this.key = value;
    }


    public String getValue() {
        return this.value;
    }


    public void setValue(String value) {
        this.value = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SplitterOSAndVersionInfo)) {
            return false;
        }
        SplitterOSAndVersionInfo otherObj = (SplitterOSAndVersionInfo) obj;

        return (this.key != null ? this.key.equals(otherObj.key) : this.key == otherObj.key) && (this.value != null ? this.value.equals(otherObj.value) : this.value == otherObj.value);
    }


    public int hashCode() {
        return (this.key != null ? this.key.hashCode() : 0) ^ (this.value != null ? this.value.hashCode() : 0);
    }


    public String toString() {
        return "SplitterOSAndVersionInfo [key=" + this.key + ", " + "value=" + this.value + "]";
    }
}


