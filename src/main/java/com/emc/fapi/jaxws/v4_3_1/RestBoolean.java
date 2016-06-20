package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restBoolean", propOrder = {"bool"})
public class RestBoolean {
    protected Boolean bool;

    public RestBoolean() {
    }

    public RestBoolean(Boolean bool) {
        this.bool = bool;
    }


    public Boolean isBool() {
        return this.bool;
    }


    public void setBool(Boolean value) {
        this.bool = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RestBoolean)) {
            return false;
        }
        RestBoolean otherObj = (RestBoolean) obj;

        return this.bool == otherObj.bool ? true : this.bool != null ? this.bool.equals(otherObj.bool) : false;
    }


    public int hashCode() {
        return this.bool != null ? this.bool.hashCode() : 0;
    }


    public String toString() {
        return "RestBoolean [bool=" + this.bool + "]";
    }
}


