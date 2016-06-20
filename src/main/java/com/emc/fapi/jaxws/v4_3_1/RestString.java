package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restString", propOrder = {"string"})
public class RestString {
    @XmlElement(nillable = true)
    protected String string;

    public RestString() {
    }

    public RestString(String string) {
        this.string = string;
    }


    public String getString() {
        return this.string;
    }


    public void setString(String value) {
        this.string = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RestString)) {
            return false;
        }
        RestString otherObj = (RestString) obj;

        return this.string == otherObj.string ? true : this.string != null ? this.string.equals(otherObj.string) : false;
    }


    public int hashCode() {
        return this.string != null ? this.string.hashCode() : 0;
    }


    public String toString() {
        return "RestString [string=" + this.string + "]";
    }
}


