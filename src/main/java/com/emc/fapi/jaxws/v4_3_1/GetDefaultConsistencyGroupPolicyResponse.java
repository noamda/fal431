package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDefaultConsistencyGroupPolicyResponse", propOrder = {"_return"})
public class GetDefaultConsistencyGroupPolicyResponse {
    @XmlElement(name = "return")
    protected ConsistencyGroupPolicy _return;

    public GetDefaultConsistencyGroupPolicyResponse() {
    }

    public GetDefaultConsistencyGroupPolicyResponse(ConsistencyGroupPolicy _return) {
        this._return = _return;
    }


    public ConsistencyGroupPolicy getReturn() {
        return this._return;
    }


    public void setReturn(ConsistencyGroupPolicy value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetDefaultConsistencyGroupPolicyResponse)) {
            return false;
        }
        GetDefaultConsistencyGroupPolicyResponse otherObj = (GetDefaultConsistencyGroupPolicyResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetDefaultConsistencyGroupPolicyResponse [_return=" + this._return + "]";
    }
}


