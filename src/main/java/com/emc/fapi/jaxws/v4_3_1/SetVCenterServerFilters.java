package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setVCenterServerFilters", propOrder = {"filters"})
public class SetVCenterServerFilters {
    protected VCenterServerFilters filters;

    public SetVCenterServerFilters() {
    }

    public SetVCenterServerFilters(VCenterServerFilters filters) {
        this.filters = filters;
    }


    public VCenterServerFilters getFilters() {
        return this.filters;
    }


    public void setFilters(VCenterServerFilters value) {
        this.filters = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetVCenterServerFilters)) {
            return false;
        }
        SetVCenterServerFilters otherObj = (SetVCenterServerFilters) obj;

        return this.filters == otherObj.filters ? true : this.filters != null ? this.filters.equals(otherObj.filters) : false;
    }


    public int hashCode() {
        return this.filters != null ? this.filters.hashCode() : 0;
    }


    public String toString() {
        return "SetVCenterServerFilters [filters=" + this.filters + "]";
    }
}


