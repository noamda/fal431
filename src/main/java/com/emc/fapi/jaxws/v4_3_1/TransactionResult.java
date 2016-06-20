package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionResult", propOrder = {"exceptionMessage", "exceptionType", "result"})
public class TransactionResult {
    protected String exceptionMessage;
    protected String exceptionType;
    protected Object result;

    public TransactionResult() {
    }

    public TransactionResult(String exceptionMessage, String exceptionType, Object result) {
        this.exceptionMessage = exceptionMessage;
        this.exceptionType = exceptionType;
        this.result = result;
    }


    public String getExceptionMessage() {
        return this.exceptionMessage;
    }


    public void setExceptionMessage(String value) {
        this.exceptionMessage = value;
    }


    public String getExceptionType() {
        return this.exceptionType;
    }


    public void setExceptionType(String value) {
        this.exceptionType = value;
    }


    public Object getResult() {
        return this.result;
    }


    public void setResult(Object value) {
        this.result = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof TransactionResult)) {
            return false;
        }
        TransactionResult otherObj = (TransactionResult) obj;

        return (this.exceptionMessage != null ? this.exceptionMessage.equals(otherObj.exceptionMessage) : this.exceptionMessage == otherObj.exceptionMessage) && (this.exceptionType != null ? this.exceptionType.equals(otherObj.exceptionType) : this.exceptionType == otherObj.exceptionType) && (this.result != null ? this.result.equals(otherObj.result) : this.result == otherObj.result);
    }


    public int hashCode() {
        return (this.exceptionMessage != null ? this.exceptionMessage.hashCode() : 0) ^ (this.exceptionType != null ? this.exceptionType.hashCode() : 0) ^ (this.result != null ? this.result.hashCode() : 0);
    }


    public String toString() {
        return "TransactionResult [exceptionMessage=" + this.exceptionMessage + ", " + "exceptionType=" + this.exceptionType + ", " + "result=" + this.result + "]";
    }
}


