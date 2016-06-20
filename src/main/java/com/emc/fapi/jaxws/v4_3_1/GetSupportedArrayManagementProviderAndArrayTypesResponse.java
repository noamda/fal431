package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSupportedArrayManagementProviderAndArrayTypesResponse", propOrder = {"_return"})
public class GetSupportedArrayManagementProviderAndArrayTypesResponse {
    @XmlElement(name = "return")
    protected SupportedArrayManagementProviderAndArrayTypes _return;

    public GetSupportedArrayManagementProviderAndArrayTypesResponse() {
    }

    public GetSupportedArrayManagementProviderAndArrayTypesResponse(SupportedArrayManagementProviderAndArrayTypes _return) {
        this._return = _return;
    }


    public SupportedArrayManagementProviderAndArrayTypes getReturn() {
        return this._return;
    }


    public void setReturn(SupportedArrayManagementProviderAndArrayTypes value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSupportedArrayManagementProviderAndArrayTypesResponse)) {
            return false;
        }
        GetSupportedArrayManagementProviderAndArrayTypesResponse otherObj = (GetSupportedArrayManagementProviderAndArrayTypesResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSupportedArrayManagementProviderAndArrayTypesResponse [_return=" + this._return + "]";
    }
}


