package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getArrayManagementProviderStateResponse", propOrder = {"_return"})
public class GetArrayManagementProviderStateResponse {
    @XmlElement(name = "return")
    protected ArrayManagementProviderState _return;

    public GetArrayManagementProviderStateResponse() {
    }

    public GetArrayManagementProviderStateResponse(ArrayManagementProviderState _return) {
        this._return = _return;
    }


    public ArrayManagementProviderState getReturn() {
        return this._return;
    }


    public void setReturn(ArrayManagementProviderState value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetArrayManagementProviderStateResponse)) {
            return false;
        }
        GetArrayManagementProviderStateResponse otherObj = (GetArrayManagementProviderStateResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetArrayManagementProviderStateResponse [_return=" + this._return + "]";
    }
}


