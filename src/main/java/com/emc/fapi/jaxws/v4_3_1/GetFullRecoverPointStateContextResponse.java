package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFullRecoverPointStateContextResponse", propOrder = {"_return"})
public class GetFullRecoverPointStateContextResponse {
    @XmlElement(name = "return")
    protected FullRecoverPointStateContext _return;

    public GetFullRecoverPointStateContextResponse() {
    }

    public GetFullRecoverPointStateContextResponse(FullRecoverPointStateContext _return) {
        this._return = _return;
    }


    public FullRecoverPointStateContext getReturn() {
        return this._return;
    }


    public void setReturn(FullRecoverPointStateContext value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetFullRecoverPointStateContextResponse)) {
            return false;
        }
        GetFullRecoverPointStateContextResponse otherObj = (GetFullRecoverPointStateContextResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetFullRecoverPointStateContextResponse [_return=" + this._return + "]";
    }
}


