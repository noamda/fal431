package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableSymmetrixArraysResponse", propOrder = {"_return"})
public class GetAvailableSymmetrixArraysResponse {
    @XmlElement(name = "return")
    protected SymmetrixArrayList _return;

    public GetAvailableSymmetrixArraysResponse() {
    }

    public GetAvailableSymmetrixArraysResponse(SymmetrixArrayList _return) {
        this._return = _return;
    }


    public SymmetrixArrayList getReturn() {
        return this._return;
    }


    public void setReturn(SymmetrixArrayList value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetAvailableSymmetrixArraysResponse)) {
            return false;
        }
        GetAvailableSymmetrixArraysResponse otherObj = (GetAvailableSymmetrixArraysResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetAvailableSymmetrixArraysResponse [_return=" + this._return + "]";
    }
}


