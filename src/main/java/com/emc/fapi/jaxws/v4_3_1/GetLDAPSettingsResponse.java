package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLDAPSettingsResponse", propOrder = {"_return"})
public class GetLDAPSettingsResponse {
    @XmlElement(name = "return")
    protected LDAPSettings _return;

    public GetLDAPSettingsResponse() {
    }

    public GetLDAPSettingsResponse(LDAPSettings _return) {
        this._return = _return;
    }


    public LDAPSettings getReturn() {
        return this._return;
    }


    public void setReturn(LDAPSettings value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetLDAPSettingsResponse)) {
            return false;
        }
        GetLDAPSettingsResponse otherObj = (GetLDAPSettingsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetLDAPSettingsResponse [_return=" + this._return + "]";
    }
}


