package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSystemVersionStateResponse", propOrder = {"_return"})
public class GetSystemVersionStateResponse {
    @XmlElement(name = "return")
    protected SystemVersionState _return;

    public GetSystemVersionStateResponse() {
    }

    public GetSystemVersionStateResponse(SystemVersionState _return) {
        this._return = _return;
    }


    public SystemVersionState getReturn() {
        return this._return;
    }


    public void setReturn(SystemVersionState value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSystemVersionStateResponse)) {
            return false;
        }
        GetSystemVersionStateResponse otherObj = (GetSystemVersionStateResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSystemVersionStateResponse [_return=" + this._return + "]";
    }
}


