package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUsersSettingsResponse", propOrder = {"_return"})
public class GetUsersSettingsResponse {
    @XmlElement(name = "return")
    protected UsersSettings _return;

    public GetUsersSettingsResponse() {
    }

    public GetUsersSettingsResponse(UsersSettings _return) {
        this._return = _return;
    }


    public UsersSettings getReturn() {
        return this._return;
    }


    public void setReturn(UsersSettings value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetUsersSettingsResponse)) {
            return false;
        }
        GetUsersSettingsResponse otherObj = (GetUsersSettingsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetUsersSettingsResponse [_return=" + this._return + "]";
    }
}


