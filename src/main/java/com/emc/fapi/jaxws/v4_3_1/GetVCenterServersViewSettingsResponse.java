package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVCenterServersViewSettingsResponse", propOrder = {"_return"})
public class GetVCenterServersViewSettingsResponse {
    @XmlElement(name = "return")
    protected VCenterServersViewSettings _return;

    public GetVCenterServersViewSettingsResponse() {
    }

    public GetVCenterServersViewSettingsResponse(VCenterServersViewSettings _return) {
        this._return = _return;
    }


    public VCenterServersViewSettings getReturn() {
        return this._return;
    }


    public void setReturn(VCenterServersViewSettings value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVCenterServersViewSettingsResponse)) {
            return false;
        }
        GetVCenterServersViewSettingsResponse otherObj = (GetVCenterServersViewSettingsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetVCenterServersViewSettingsResponse [_return=" + this._return + "]";
    }
}


