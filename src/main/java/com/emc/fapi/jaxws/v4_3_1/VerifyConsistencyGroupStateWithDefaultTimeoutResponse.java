package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyConsistencyGroupStateWithDefaultTimeoutResponse", propOrder = {"_return"})
public class VerifyConsistencyGroupStateWithDefaultTimeoutResponse {
    @XmlElement(name = "return")
    protected TransactionID _return;

    public VerifyConsistencyGroupStateWithDefaultTimeoutResponse() {
    }

    public VerifyConsistencyGroupStateWithDefaultTimeoutResponse(TransactionID _return) {
        this._return = _return;
    }


    public TransactionID getReturn() {
        return this._return;
    }


    public void setReturn(TransactionID value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VerifyConsistencyGroupStateWithDefaultTimeoutResponse)) {
            return false;
        }
        VerifyConsistencyGroupStateWithDefaultTimeoutResponse otherObj = (VerifyConsistencyGroupStateWithDefaultTimeoutResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "VerifyConsistencyGroupStateWithDefaultTimeoutResponse [_return=" + this._return + "]";
    }
}


