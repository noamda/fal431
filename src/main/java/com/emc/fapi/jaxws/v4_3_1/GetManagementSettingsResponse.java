package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getManagementSettingsResponse", propOrder = {"_return"})
public class GetManagementSettingsResponse {
    @XmlElement(name = "return")
    protected ManagementSettings _return;

    public GetManagementSettingsResponse() {
    }

    public GetManagementSettingsResponse(ManagementSettings _return) {
        this._return = _return;
    }


    public ManagementSettings getReturn() {
        return this._return;
    }


    public void setReturn(ManagementSettings value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetManagementSettingsResponse)) {
            return false;
        }
        GetManagementSettingsResponse otherObj = (GetManagementSettingsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetManagementSettingsResponse [_return=" + this._return + "]";
    }
}


