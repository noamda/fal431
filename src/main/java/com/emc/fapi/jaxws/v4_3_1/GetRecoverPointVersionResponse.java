package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRecoverPointVersionResponse", propOrder = {"_return"})
public class GetRecoverPointVersionResponse {
    @XmlElement(name = "return")
    protected RecoverPointVersion _return;

    public GetRecoverPointVersionResponse() {
    }

    public GetRecoverPointVersionResponse(RecoverPointVersion _return) {
        this._return = _return;
    }


    public RecoverPointVersion getReturn() {
        return this._return;
    }


    public void setReturn(RecoverPointVersion value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetRecoverPointVersionResponse)) {
            return false;
        }
        GetRecoverPointVersionResponse otherObj = (GetRecoverPointVersionResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetRecoverPointVersionResponse [_return=" + this._return + "]";
    }
}


