package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restLong", propOrder = {"number"})
public class RestLong {
    protected Long number;

    public RestLong() {
    }

    public RestLong(Long number) {
        this.number = number;
    }


    public Long getNumber() {
        return this.number;
    }


    public void setNumber(Long value) {
        this.number = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RestLong)) {
            return false;
        }
        RestLong otherObj = (RestLong) obj;

        return this.number == otherObj.number ? true : this.number != null ? this.number.equals(otherObj.number) : false;
    }


    public int hashCode() {
        return this.number != null ? this.number.hashCode() : 0;
    }


    public String toString() {
        return "RestLong [number=" + this.number + "]";
    }
}


