package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDefaultConsistencyGroupLinkPolicyResponse", propOrder = {"_return"})
public class GetDefaultConsistencyGroupLinkPolicyResponse {
    @XmlElement(name = "return")
    protected ConsistencyGroupLinkPolicy _return;

    public GetDefaultConsistencyGroupLinkPolicyResponse() {
    }

    public GetDefaultConsistencyGroupLinkPolicyResponse(ConsistencyGroupLinkPolicy _return) {
        this._return = _return;
    }


    public ConsistencyGroupLinkPolicy getReturn() {
        return this._return;
    }


    public void setReturn(ConsistencyGroupLinkPolicy value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetDefaultConsistencyGroupLinkPolicyResponse)) {
            return false;
        }
        GetDefaultConsistencyGroupLinkPolicyResponse otherObj = (GetDefaultConsistencyGroupLinkPolicyResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetDefaultConsistencyGroupLinkPolicyResponse [_return=" + this._return + "]";
    }
}


