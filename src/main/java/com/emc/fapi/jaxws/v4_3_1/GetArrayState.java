package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getArrayState", propOrder = {"arrayUID"})
public class GetArrayState {
    @XmlElement(nillable = true)
    protected ArrayUID arrayUID;

    public GetArrayState() {
    }

    public GetArrayState(ArrayUID arrayUID) {
        this.arrayUID = arrayUID;
    }


    public ArrayUID getArrayUID() {
        return this.arrayUID;
    }


    public void setArrayUID(ArrayUID value) {
        this.arrayUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetArrayState)) {
            return false;
        }
        GetArrayState otherObj = (GetArrayState) obj;

        return this.arrayUID == otherObj.arrayUID ? true : this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : false;
    }


    public int hashCode() {
        return this.arrayUID != null ? this.arrayUID.hashCode() : 0;
    }


    public String toString() {
        return "GetArrayState [arrayUID=" + this.arrayUID + "]";
    }
}


