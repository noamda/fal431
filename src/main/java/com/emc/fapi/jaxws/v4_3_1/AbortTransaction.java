package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abortTransaction", propOrder = {"transactionID"})
public class AbortTransaction {
    @XmlElement(nillable = true)
    protected TransactionID transactionID;

    public AbortTransaction() {
    }

    public AbortTransaction(TransactionID transactionID) {
        this.transactionID = transactionID;
    }


    public TransactionID getTransactionID() {
        return this.transactionID;
    }


    public void setTransactionID(TransactionID value) {
        this.transactionID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AbortTransaction)) {
            return false;
        }
        AbortTransaction otherObj = (AbortTransaction) obj;

        return this.transactionID == otherObj.transactionID ? true : this.transactionID != null ? this.transactionID.equals(otherObj.transactionID) : false;
    }


    public int hashCode() {
        return this.transactionID != null ? this.transactionID.hashCode() : 0;
    }


    public String toString() {
        return "AbortTransaction [transactionID=" + this.transactionID + "]";
    }
}


