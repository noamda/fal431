package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSystemAlertsSettingsResponse", propOrder = {"_return"})
public class GetSystemAlertsSettingsResponse {
    @XmlElement(name = "return")
    protected SystemAlertsSettings _return;

    public GetSystemAlertsSettingsResponse() {
    }

    public GetSystemAlertsSettingsResponse(SystemAlertsSettings _return) {
        this._return = _return;
    }


    public SystemAlertsSettings getReturn() {
        return this._return;
    }


    public void setReturn(SystemAlertsSettings value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSystemAlertsSettingsResponse)) {
            return false;
        }
        GetSystemAlertsSettingsResponse otherObj = (GetSystemAlertsSettingsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSystemAlertsSettingsResponse [_return=" + this._return + "]";
    }
}


