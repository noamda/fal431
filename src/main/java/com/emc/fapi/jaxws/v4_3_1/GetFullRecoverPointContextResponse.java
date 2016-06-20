package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFullRecoverPointContextResponse", propOrder = {"_return"})
public class GetFullRecoverPointContextResponse {
    @XmlElement(name = "return")
    protected FullRecoverPointContext _return;

    public GetFullRecoverPointContextResponse() {
    }

    public GetFullRecoverPointContextResponse(FullRecoverPointContext _return) {
        this._return = _return;
    }


    public FullRecoverPointContext getReturn() {
        return this._return;
    }


    public void setReturn(FullRecoverPointContext value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetFullRecoverPointContextResponse)) {
            return false;
        }
        GetFullRecoverPointContextResponse otherObj = (GetFullRecoverPointContextResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetFullRecoverPointContextResponse [_return=" + this._return + "]";
    }
}


