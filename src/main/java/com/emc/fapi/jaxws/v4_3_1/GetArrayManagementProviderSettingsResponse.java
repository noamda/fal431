package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getArrayManagementProviderSettingsResponse", propOrder = {"_return"})
public class GetArrayManagementProviderSettingsResponse {
    @XmlElement(name = "return")
    protected ArrayManagementProviderSettings _return;

    public GetArrayManagementProviderSettingsResponse() {
    }

    public GetArrayManagementProviderSettingsResponse(ArrayManagementProviderSettings _return) {
        this._return = _return;
    }


    public ArrayManagementProviderSettings getReturn() {
        return this._return;
    }


    public void setReturn(ArrayManagementProviderSettings value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetArrayManagementProviderSettingsResponse)) {
            return false;
        }
        GetArrayManagementProviderSettingsResponse otherObj = (GetArrayManagementProviderSettingsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetArrayManagementProviderSettingsResponse [_return=" + this._return + "]";
    }
}


