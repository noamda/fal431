package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSystemSettingsConflictsResponse", propOrder = {"_return"})
public class GetSystemSettingsConflictsResponse {
    @XmlElement(name = "return")
    protected SystemSettingsConflicts _return;

    public GetSystemSettingsConflictsResponse() {
    }

    public GetSystemSettingsConflictsResponse(SystemSettingsConflicts _return) {
        this._return = _return;
    }


    public SystemSettingsConflicts getReturn() {
        return this._return;
    }


    public void setReturn(SystemSettingsConflicts value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSystemSettingsConflictsResponse)) {
            return false;
        }
        GetSystemSettingsConflictsResponse otherObj = (GetSystemSettingsConflictsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSystemSettingsConflictsResponse [_return=" + this._return + "]";
    }
}


