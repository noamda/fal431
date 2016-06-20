package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVCenterServerResponse", propOrder = {"_return"})
public class GetVCenterServerResponse {
    @XmlElement(name = "return")
    protected VCenterServer _return;

    public GetVCenterServerResponse() {
    }

    public GetVCenterServerResponse(VCenterServer _return) {
        this._return = _return;
    }


    public VCenterServer getReturn() {
        return this._return;
    }


    public void setReturn(VCenterServer value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVCenterServerResponse)) {
            return false;
        }
        GetVCenterServerResponse otherObj = (GetVCenterServerResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetVCenterServerResponse [_return=" + this._return + "]";
    }
}


