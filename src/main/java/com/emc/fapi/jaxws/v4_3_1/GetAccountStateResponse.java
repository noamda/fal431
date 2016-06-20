package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAccountStateResponse", propOrder = {"_return"})
public class GetAccountStateResponse {
    @XmlElement(name = "return")
    protected AccountState _return;

    public GetAccountStateResponse() {
    }

    public GetAccountStateResponse(AccountState _return) {
        this._return = _return;
    }


    public AccountState getReturn() {
        return this._return;
    }


    public void setReturn(AccountState value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetAccountStateResponse)) {
            return false;
        }
        GetAccountStateResponse otherObj = (GetAccountStateResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetAccountStateResponse [_return=" + this._return + "]";
    }
}


