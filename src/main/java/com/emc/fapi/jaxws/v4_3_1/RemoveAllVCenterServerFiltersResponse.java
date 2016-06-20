package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeAllVCenterServerFiltersResponse", propOrder = {"_return"})
public class RemoveAllVCenterServerFiltersResponse {
    @XmlElement(name = "return")
    protected VCenterServerFilters _return;

    public RemoveAllVCenterServerFiltersResponse() {
    }

    public RemoveAllVCenterServerFiltersResponse(VCenterServerFilters _return) {
        this._return = _return;
    }


    public VCenterServerFilters getReturn() {
        return this._return;
    }


    public void setReturn(VCenterServerFilters value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RemoveAllVCenterServerFiltersResponse)) {
            return false;
        }
        RemoveAllVCenterServerFiltersResponse otherObj = (RemoveAllVCenterServerFiltersResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "RemoveAllVCenterServerFiltersResponse [_return=" + this._return + "]";
    }
}


