package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSystemReportSettingsResponse", propOrder = {"_return"})
public class GetSystemReportSettingsResponse {
    @XmlElement(name = "return")
    protected SystemReportSettings _return;

    public GetSystemReportSettingsResponse() {
    }

    public GetSystemReportSettingsResponse(SystemReportSettings _return) {
        this._return = _return;
    }


    public SystemReportSettings getReturn() {
        return this._return;
    }


    public void setReturn(SystemReportSettings value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSystemReportSettingsResponse)) {
            return false;
        }
        GetSystemReportSettingsResponse otherObj = (GetSystemReportSettingsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSystemReportSettingsResponse [_return=" + this._return + "]";
    }
}


