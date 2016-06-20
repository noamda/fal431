package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSyslogSettingsResponse", propOrder = {"_return"})
public class GetSyslogSettingsResponse {
    @XmlElement(name = "return")
    protected SyslogSettings _return;

    public GetSyslogSettingsResponse() {
    }

    public GetSyslogSettingsResponse(SyslogSettings _return) {
        this._return = _return;
    }


    public SyslogSettings getReturn() {
        return this._return;
    }


    public void setReturn(SyslogSettings value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSyslogSettingsResponse)) {
            return false;
        }
        GetSyslogSettingsResponse otherObj = (GetSyslogSettingsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSyslogSettingsResponse [_return=" + this._return + "]";
    }
}


