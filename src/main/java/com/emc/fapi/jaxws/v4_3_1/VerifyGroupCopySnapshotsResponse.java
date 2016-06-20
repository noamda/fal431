package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyGroupCopySnapshotsResponse", propOrder = {"_return"})
public class VerifyGroupCopySnapshotsResponse {
    @XmlElement(name = "return")
    protected TransactionID _return;

    public VerifyGroupCopySnapshotsResponse() {
    }

    public VerifyGroupCopySnapshotsResponse(TransactionID _return) {
        this._return = _return;
    }


    public TransactionID getReturn() {
        return this._return;
    }


    public void setReturn(TransactionID value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VerifyGroupCopySnapshotsResponse)) {
            return false;
        }
        VerifyGroupCopySnapshotsResponse otherObj = (VerifyGroupCopySnapshotsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "VerifyGroupCopySnapshotsResponse [_return=" + this._return + "]";
    }
}


