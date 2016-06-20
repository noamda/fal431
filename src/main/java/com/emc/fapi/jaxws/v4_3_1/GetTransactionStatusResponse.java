package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTransactionStatusResponse", propOrder = {"_return"})
public class GetTransactionStatusResponse {
    @XmlElement(name = "return")
    protected TransactionStatus _return;

    public GetTransactionStatusResponse() {
    }

    public GetTransactionStatusResponse(TransactionStatus _return) {
        this._return = _return;
    }


    public TransactionStatus getReturn() {
        return this._return;
    }


    public void setReturn(TransactionStatus value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetTransactionStatusResponse)) {
            return false;
        }
        GetTransactionStatusResponse otherObj = (GetTransactionStatusResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetTransactionStatusResponse [_return=" + this._return + "]";
    }
}


