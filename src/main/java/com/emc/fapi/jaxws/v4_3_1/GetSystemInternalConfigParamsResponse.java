package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSystemInternalConfigParamsResponse", propOrder = {"_return"})
public class GetSystemInternalConfigParamsResponse {
    @XmlElement(name = "return")
    protected SystemInternalConfigParams _return;

    public GetSystemInternalConfigParamsResponse() {
    }

    public GetSystemInternalConfigParamsResponse(SystemInternalConfigParams _return) {
        this._return = _return;
    }


    public SystemInternalConfigParams getReturn() {
        return this._return;
    }


    public void setReturn(SystemInternalConfigParams value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSystemInternalConfigParamsResponse)) {
            return false;
        }
        GetSystemInternalConfigParamsResponse otherObj = (GetSystemInternalConfigParamsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSystemInternalConfigParamsResponse [_return=" + this._return + "]";
    }
}


