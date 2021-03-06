package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSystemStatusContextResponse", propOrder = {"_return"})
public class GetSystemStatusContextResponse {
    @XmlElement(name = "return")
    protected SystemStatusContext _return;

    public GetSystemStatusContextResponse() {
    }

    public GetSystemStatusContextResponse(SystemStatusContext _return) {
        this._return = _return;
    }


    public SystemStatusContext getReturn() {
        return this._return;
    }


    public void setReturn(SystemStatusContext value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSystemStatusContextResponse)) {
            return false;
        }
        GetSystemStatusContextResponse otherObj = (GetSystemStatusContextResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSystemStatusContextResponse [_return=" + this._return + "]";
    }
}


