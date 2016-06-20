package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSNMPSettingsResponse", propOrder = {"_return"})
public class GetSNMPSettingsResponse {
    @XmlElement(name = "return")
    protected SNMPSettings _return;

    public GetSNMPSettingsResponse() {
    }

    public GetSNMPSettingsResponse(SNMPSettings _return) {
        this._return = _return;
    }


    public SNMPSettings getReturn() {
        return this._return;
    }


    public void setReturn(SNMPSettings value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSNMPSettingsResponse)) {
            return false;
        }
        GetSNMPSettingsResponse otherObj = (GetSNMPSettingsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSNMPSettingsResponse [_return=" + this._return + "]";
    }
}


