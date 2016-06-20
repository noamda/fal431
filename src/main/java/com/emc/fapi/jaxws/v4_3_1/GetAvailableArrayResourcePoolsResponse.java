package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableArrayResourcePoolsResponse", propOrder = {"_return"})
public class GetAvailableArrayResourcePoolsResponse {
    @XmlElement(name = "return")
    protected AvailableArrayResourcePools _return;

    public GetAvailableArrayResourcePoolsResponse() {
    }

    public GetAvailableArrayResourcePoolsResponse(AvailableArrayResourcePools _return) {
        this._return = _return;
    }


    public AvailableArrayResourcePools getReturn() {
        return this._return;
    }


    public void setReturn(AvailableArrayResourcePools value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetAvailableArrayResourcePoolsResponse)) {
            return false;
        }
        GetAvailableArrayResourcePoolsResponse otherObj = (GetAvailableArrayResourcePoolsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetAvailableArrayResourcePoolsResponse [_return=" + this._return + "]";
    }
}


