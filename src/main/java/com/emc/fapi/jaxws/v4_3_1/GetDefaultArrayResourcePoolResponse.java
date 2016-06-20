package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDefaultArrayResourcePoolResponse", propOrder = {"_return"})
public class GetDefaultArrayResourcePoolResponse {
    @XmlElement(name = "return")
    protected DefaultArrayResourcePool _return;

    public GetDefaultArrayResourcePoolResponse() {
    }

    public GetDefaultArrayResourcePoolResponse(DefaultArrayResourcePool _return) {
        this._return = _return;
    }


    public DefaultArrayResourcePool getReturn() {
        return this._return;
    }


    public void setReturn(DefaultArrayResourcePool value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetDefaultArrayResourcePoolResponse)) {
            return false;
        }
        GetDefaultArrayResourcePoolResponse otherObj = (GetDefaultArrayResourcePoolResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetDefaultArrayResourcePoolResponse [_return=" + this._return + "]";
    }
}


