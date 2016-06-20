package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTransactionResult", propOrder = {"transactionID"})
public class GetTransactionResult {
    @XmlElement(nillable = true)
    protected TransactionID transactionID;

    public GetTransactionResult() {
    }

    public GetTransactionResult(TransactionID transactionID) {
        this.transactionID = transactionID;
    }


    public TransactionID getTransactionID() {
        return this.transactionID;
    }


    public void setTransactionID(TransactionID value) {
        this.transactionID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetTransactionResult)) {
            return false;
        }
        GetTransactionResult otherObj = (GetTransactionResult) obj;

        return this.transactionID == otherObj.transactionID ? true : this.transactionID != null ? this.transactionID.equals(otherObj.transactionID) : false;
    }


    public int hashCode() {
        return this.transactionID != null ? this.transactionID.hashCode() : 0;
    }


    public String toString() {
        return "GetTransactionResult [transactionID=" + this.transactionID + "]";
    }
}


