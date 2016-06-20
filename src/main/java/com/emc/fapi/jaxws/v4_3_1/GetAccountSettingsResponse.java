package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAccountSettingsResponse", propOrder = {"_return"})
public class GetAccountSettingsResponse {
    @XmlElement(name = "return")
    protected AccountSettings _return;

    public GetAccountSettingsResponse() {
    }

    public GetAccountSettingsResponse(AccountSettings _return) {
        this._return = _return;
    }


    public AccountSettings getReturn() {
        return this._return;
    }


    public void setReturn(AccountSettings value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetAccountSettingsResponse)) {
            return false;
        }
        GetAccountSettingsResponse otherObj = (GetAccountSettingsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetAccountSettingsResponse [_return=" + this._return + "]";
    }
}


