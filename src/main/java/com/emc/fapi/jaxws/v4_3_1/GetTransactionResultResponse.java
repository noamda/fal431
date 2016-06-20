package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTransactionResultResponse", propOrder = {"_return"})
public class GetTransactionResultResponse {
    @XmlElement(name = "return")
    protected TransactionResult _return;

    public GetTransactionResultResponse() {
    }

    public GetTransactionResultResponse(TransactionResult _return) {
        this._return = _return;
    }


    public TransactionResult getReturn() {
        return this._return;
    }


    public void setReturn(TransactionResult value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetTransactionResultResponse)) {
            return false;
        }
        GetTransactionResultResponse otherObj = (GetTransactionResultResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetTransactionResultResponse [_return=" + this._return + "]";
    }
}


