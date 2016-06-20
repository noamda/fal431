package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateAbortTransaction", propOrder = {"transactionID"})
public class ValidateAbortTransaction {
    @XmlElement(nillable = true)
    protected TransactionID transactionID;

    public ValidateAbortTransaction() {
    }

    public ValidateAbortTransaction(TransactionID transactionID) {
        this.transactionID = transactionID;
    }


    public TransactionID getTransactionID() {
        return this.transactionID;
    }


    public void setTransactionID(TransactionID value) {
        this.transactionID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateAbortTransaction)) {
            return false;
        }
        ValidateAbortTransaction otherObj = (ValidateAbortTransaction) obj;

        return this.transactionID == otherObj.transactionID ? true : this.transactionID != null ? this.transactionID.equals(otherObj.transactionID) : false;
    }


    public int hashCode() {
        return this.transactionID != null ? this.transactionID.hashCode() : 0;
    }


    public String toString() {
        return "ValidateAbortTransaction [transactionID=" + this.transactionID + "]";
    }
}


