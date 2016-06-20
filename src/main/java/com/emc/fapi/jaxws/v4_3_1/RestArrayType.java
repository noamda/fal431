package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restArrayType", propOrder = {"restEnum"})
public class RestArrayType {
    protected ArrayType restEnum;

    public RestArrayType() {
    }

    public RestArrayType(ArrayType restEnum) {
        this.restEnum = restEnum;
    }


    public ArrayType getRestEnum() {
        return this.restEnum;
    }


    public void setRestEnum(ArrayType value) {
        this.restEnum = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RestArrayType)) {
            return false;
        }
        RestArrayType otherObj = (RestArrayType) obj;

        return this.restEnum == otherObj.restEnum ? true : this.restEnum != null ? this.restEnum.equals(otherObj.restEnum) : false;
    }


    public int hashCode() {
        return this.restEnum != null ? this.restEnum.hashCode() : 0;
    }


    public String toString() {
        return "RestArrayType [restEnum=" + this.restEnum + "]";
    }
}


