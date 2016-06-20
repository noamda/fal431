package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getArrayCapabilitiesByTypeResponse", propOrder = {"_return"})
public class GetArrayCapabilitiesByTypeResponse {
    @XmlElement(name = "return")
    protected ArrayCapabilities _return;

    public GetArrayCapabilitiesByTypeResponse() {
    }

    public GetArrayCapabilitiesByTypeResponse(ArrayCapabilities _return) {
        this._return = _return;
    }


    public ArrayCapabilities getReturn() {
        return this._return;
    }


    public void setReturn(ArrayCapabilities value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetArrayCapabilitiesByTypeResponse)) {
            return false;
        }
        GetArrayCapabilitiesByTypeResponse otherObj = (GetArrayCapabilitiesByTypeResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetArrayCapabilitiesByTypeResponse [_return=" + this._return + "]";
    }
}


