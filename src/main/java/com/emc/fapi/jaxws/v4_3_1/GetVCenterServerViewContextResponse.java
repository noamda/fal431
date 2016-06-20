package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVCenterServerViewContextResponse", propOrder = {"_return"})
public class GetVCenterServerViewContextResponse {
    @XmlElement(name = "return")
    protected VCenterServerViewContext _return;

    public GetVCenterServerViewContextResponse() {
    }

    public GetVCenterServerViewContextResponse(VCenterServerViewContext _return) {
        this._return = _return;
    }


    public VCenterServerViewContext getReturn() {
        return this._return;
    }


    public void setReturn(VCenterServerViewContext value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVCenterServerViewContextResponse)) {
            return false;
        }
        GetVCenterServerViewContextResponse otherObj = (GetVCenterServerViewContextResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetVCenterServerViewContextResponse [_return=" + this._return + "]";
    }
}


