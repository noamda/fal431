package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDefaultConsistencyGroupCopyPolicyResponse", propOrder = {"_return"})
public class GetDefaultConsistencyGroupCopyPolicyResponse {
    @XmlElement(name = "return")
    protected ConsistencyGroupCopyPolicy _return;

    public GetDefaultConsistencyGroupCopyPolicyResponse() {
    }

    public GetDefaultConsistencyGroupCopyPolicyResponse(ConsistencyGroupCopyPolicy _return) {
        this._return = _return;
    }


    public ConsistencyGroupCopyPolicy getReturn() {
        return this._return;
    }


    public void setReturn(ConsistencyGroupCopyPolicy value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetDefaultConsistencyGroupCopyPolicyResponse)) {
            return false;
        }
        GetDefaultConsistencyGroupCopyPolicyResponse otherObj = (GetDefaultConsistencyGroupCopyPolicyResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetDefaultConsistencyGroupCopyPolicyResponse [_return=" + this._return + "]";
    }
}


