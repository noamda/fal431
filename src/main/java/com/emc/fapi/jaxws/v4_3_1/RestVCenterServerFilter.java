package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restVCenterServerFilter", propOrder = {"restClass"})
public class RestVCenterServerFilter {
    protected VCenterServerFilter restClass;

    public RestVCenterServerFilter() {
    }

    public RestVCenterServerFilter(VCenterServerFilter restClass) {
        this.restClass = restClass;
    }


    public VCenterServerFilter getRestClass() {
        return this.restClass;
    }


    public void setRestClass(VCenterServerFilter value) {
        this.restClass = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RestVCenterServerFilter)) {
            return false;
        }
        RestVCenterServerFilter otherObj = (RestVCenterServerFilter) obj;

        return this.restClass == otherObj.restClass ? true : this.restClass != null ? this.restClass.equals(otherObj.restClass) : false;
    }


    public int hashCode() {
        return this.restClass != null ? this.restClass.hashCode() : 0;
    }


    public String toString() {
        return "RestVCenterServerFilter [restClass=" + this.restClass + "]";
    }
}


