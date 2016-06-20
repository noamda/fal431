package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setUserDefinedProperties", propOrder = {"userDefinedProperties"})
public class SetUserDefinedProperties {
    @XmlElement(nillable = true)
    protected UserDefinedProperties userDefinedProperties;

    public SetUserDefinedProperties() {
    }

    public SetUserDefinedProperties(UserDefinedProperties userDefinedProperties) {
        this.userDefinedProperties = userDefinedProperties;
    }


    public UserDefinedProperties getUserDefinedProperties() {
        return this.userDefinedProperties;
    }


    public void setUserDefinedProperties(UserDefinedProperties value) {
        this.userDefinedProperties = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetUserDefinedProperties)) {
            return false;
        }
        SetUserDefinedProperties otherObj = (SetUserDefinedProperties) obj;

        return this.userDefinedProperties == otherObj.userDefinedProperties ? true : this.userDefinedProperties != null ? this.userDefinedProperties.equals(otherObj.userDefinedProperties) : false;
    }


    public int hashCode() {
        return this.userDefinedProperties != null ? this.userDefinedProperties.hashCode() : 0;
    }


    public String toString() {
        return "SetUserDefinedProperties [userDefinedProperties=" + this.userDefinedProperties + "]";
    }
}


