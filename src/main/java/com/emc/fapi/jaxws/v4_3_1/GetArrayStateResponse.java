package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getArrayStateResponse", propOrder = {"_return"})
public class GetArrayStateResponse {
    @XmlElement(name = "return")
    protected ArrayState _return;

    public GetArrayStateResponse() {
    }

    public GetArrayStateResponse(ArrayState _return) {
        this._return = _return;
    }


    public ArrayState getReturn() {
        return this._return;
    }


    public void setReturn(ArrayState value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetArrayStateResponse)) {
            return false;
        }
        GetArrayStateResponse otherObj = (GetArrayStateResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetArrayStateResponse [_return=" + this._return + "]";
    }
}


