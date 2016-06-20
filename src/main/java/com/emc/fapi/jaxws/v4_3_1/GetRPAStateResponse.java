package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRPAStateResponse", propOrder = {"_return"})
public class GetRPAStateResponse {
    @XmlElement(name = "return")
    protected RPAState _return;

    public GetRPAStateResponse() {
    }

    public GetRPAStateResponse(RPAState _return) {
        this._return = _return;
    }


    public RPAState getReturn() {
        return this._return;
    }


    public void setReturn(RPAState value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetRPAStateResponse)) {
            return false;
        }
        GetRPAStateResponse otherObj = (GetRPAStateResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetRPAStateResponse [_return=" + this._return + "]";
    }
}


