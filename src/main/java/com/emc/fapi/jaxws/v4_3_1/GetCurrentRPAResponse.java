package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCurrentRPAResponse", propOrder = {"_return"})
public class GetCurrentRPAResponse {
    @XmlElement(name = "return")
    protected RpaUID _return;

    public GetCurrentRPAResponse() {
    }

    public GetCurrentRPAResponse(RpaUID _return) {
        this._return = _return;
    }


    public RpaUID getReturn() {
        return this._return;
    }


    public void setReturn(RpaUID value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetCurrentRPAResponse)) {
            return false;
        }
        GetCurrentRPAResponse otherObj = (GetCurrentRPAResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetCurrentRPAResponse [_return=" + this._return + "]";
    }
}


