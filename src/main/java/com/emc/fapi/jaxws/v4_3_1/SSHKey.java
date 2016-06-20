package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSHKey", propOrder = {"name", "value"})
public class SSHKey {
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String value;

    public SSHKey() {
    }

    public SSHKey(String name, String value) {
        this.name = name;
        this.value = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public String getValue() {
        return this.value;
    }


    public void setValue(String value) {
        this.value = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SSHKey)) {
            return false;
        }
        SSHKey otherObj = (SSHKey) obj;

        return (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.value != null ? this.value.equals(otherObj.value) : this.value == otherObj.value);
    }


    public int hashCode() {
        return (this.name != null ? this.name.hashCode() : 0) ^ (this.value != null ? this.value.hashCode() : 0);
    }


    public String toString() {
        return "SSHKey [name=" + this.name + ", " + "value=" + this.value + "]";
    }
}


