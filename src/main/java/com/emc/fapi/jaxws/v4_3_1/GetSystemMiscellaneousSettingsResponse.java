package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSystemMiscellaneousSettingsResponse", propOrder = {"_return"})
public class GetSystemMiscellaneousSettingsResponse {
    @XmlElement(name = "return")
    protected SystemMiscellaneousSettings _return;

    public GetSystemMiscellaneousSettingsResponse() {
    }

    public GetSystemMiscellaneousSettingsResponse(SystemMiscellaneousSettings _return) {
        this._return = _return;
    }


    public SystemMiscellaneousSettings getReturn() {
        return this._return;
    }


    public void setReturn(SystemMiscellaneousSettings value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSystemMiscellaneousSettingsResponse)) {
            return false;
        }
        GetSystemMiscellaneousSettingsResponse otherObj = (GetSystemMiscellaneousSettingsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSystemMiscellaneousSettingsResponse [_return=" + this._return + "]";
    }
}


