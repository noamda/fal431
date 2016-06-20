package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDefinedProperties", propOrder = {"properties"})
public class UserDefinedProperties {
    @XmlElement(nillable = true)
    protected List<Property> properties;

    public UserDefinedProperties() {
    }

    public UserDefinedProperties(List<Property> properties) {
        this.properties = properties;
    }


    public List<Property> getProperties() {
        if (this.properties == null) {
            this.properties = new ArrayList();
        }
        return this.properties;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof UserDefinedProperties)) {
            return false;
        }
        UserDefinedProperties otherObj = (UserDefinedProperties) obj;

        return this.properties == otherObj.properties ? true : this.properties != null ? this.properties.equals(otherObj.properties) : false;
    }


    public int hashCode() {
        return this.properties != null ? this.properties.hashCode() : 0;
    }


    public String toString() {
        return "UserDefinedProperties [properties=" + this.properties + "]";
    }
}


