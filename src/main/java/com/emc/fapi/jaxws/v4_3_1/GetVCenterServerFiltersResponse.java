package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVCenterServerFiltersResponse", propOrder = {"_return"})
public class GetVCenterServerFiltersResponse {
    @XmlElement(name = "return")
    protected VCenterServerFilters _return;

    public GetVCenterServerFiltersResponse() {
    }

    public GetVCenterServerFiltersResponse(VCenterServerFilters _return) {
        this._return = _return;
    }


    public VCenterServerFilters getReturn() {
        return this._return;
    }


    public void setReturn(VCenterServerFilters value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVCenterServerFiltersResponse)) {
            return false;
        }
        GetVCenterServerFiltersResponse otherObj = (GetVCenterServerFiltersResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetVCenterServerFiltersResponse [_return=" + this._return + "]";
    }
}


