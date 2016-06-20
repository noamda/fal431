package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addArray", propOrder = {"addArrayParams"})
public class AddArray {
    @XmlElement(nillable = true)
    protected AddArrayParams addArrayParams;

    public AddArray() {
    }

    public AddArray(AddArrayParams addArrayParams) {
        this.addArrayParams = addArrayParams;
    }


    public AddArrayParams getAddArrayParams() {
        return this.addArrayParams;
    }


    public void setAddArrayParams(AddArrayParams value) {
        this.addArrayParams = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddArray)) {
            return false;
        }
        AddArray otherObj = (AddArray) obj;

        return this.addArrayParams == otherObj.addArrayParams ? true : this.addArrayParams != null ? this.addArrayParams.equals(otherObj.addArrayParams) : false;
    }


    public int hashCode() {
        return this.addArrayParams != null ? this.addArrayParams.hashCode() : 0;
    }


    public String toString() {
        return "AddArray [addArrayParams=" + this.addArrayParams + "]";
    }
}


