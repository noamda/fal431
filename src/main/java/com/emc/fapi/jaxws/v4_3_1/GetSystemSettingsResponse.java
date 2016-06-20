package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSystemSettingsResponse", propOrder = {"_return"})
public class GetSystemSettingsResponse {
    @XmlElement(name = "return")
    protected SystemSettings _return;

    public GetSystemSettingsResponse() {
    }

    public GetSystemSettingsResponse(SystemSettings _return) {
        this._return = _return;
    }


    public SystemSettings getReturn() {
        return this._return;
    }


    public void setReturn(SystemSettings value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSystemSettingsResponse)) {
            return false;
        }
        GetSystemSettingsResponse otherObj = (GetSystemSettingsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSystemSettingsResponse [_return=" + this._return + "]";
    }
}


