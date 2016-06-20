package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restInteger", propOrder = {"number"})
public class RestInteger {
    protected Integer number;

    public RestInteger() {
    }

    public RestInteger(Integer number) {
        this.number = number;
    }


    public Integer getNumber() {
        return this.number;
    }


    public void setNumber(Integer value) {
        this.number = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RestInteger)) {
            return false;
        }
        RestInteger otherObj = (RestInteger) obj;

        return this.number == otherObj.number ? true : this.number != null ? this.number.equals(otherObj.number) : false;
    }


    public int hashCode() {
        return this.number != null ? this.number.hashCode() : 0;
    }


    public String toString() {
        return "RestInteger [number=" + this.number + "]";
    }
}


