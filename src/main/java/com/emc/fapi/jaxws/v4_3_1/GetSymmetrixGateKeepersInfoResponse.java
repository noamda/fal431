package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSymmetrixGateKeepersInfoResponse", propOrder = {"_return"})
public class GetSymmetrixGateKeepersInfoResponse {
    @XmlElement(name = "return")
    protected SymmetrixGateKeepersInfo _return;

    public GetSymmetrixGateKeepersInfoResponse() {
    }

    public GetSymmetrixGateKeepersInfoResponse(SymmetrixGateKeepersInfo _return) {
        this._return = _return;
    }


    public SymmetrixGateKeepersInfo getReturn() {
        return this._return;
    }


    public void setReturn(SymmetrixGateKeepersInfo value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSymmetrixGateKeepersInfoResponse)) {
            return false;
        }
        GetSymmetrixGateKeepersInfoResponse otherObj = (GetSymmetrixGateKeepersInfoResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSymmetrixGateKeepersInfoResponse [_return=" + this._return + "]";
    }
}


