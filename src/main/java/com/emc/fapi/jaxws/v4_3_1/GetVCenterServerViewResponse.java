package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVCenterServerViewResponse", propOrder = {"_return"})
public class GetVCenterServerViewResponse {
    @XmlElement(name = "return")
    protected VCenterServerView _return;

    public GetVCenterServerViewResponse() {
    }

    public GetVCenterServerViewResponse(VCenterServerView _return) {
        this._return = _return;
    }


    public VCenterServerView getReturn() {
        return this._return;
    }


    public void setReturn(VCenterServerView value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVCenterServerViewResponse)) {
            return false;
        }
        GetVCenterServerViewResponse otherObj = (GetVCenterServerViewResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetVCenterServerViewResponse [_return=" + this._return + "]";
    }
}


