package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getArrayIRThrottlingPolicyResponse", propOrder = {"_return"})
public class GetArrayIRThrottlingPolicyResponse {
    @XmlElement(name = "return")
    protected ArrayIRThrottlingPolicy _return;

    public GetArrayIRThrottlingPolicyResponse() {
    }

    public GetArrayIRThrottlingPolicyResponse(ArrayIRThrottlingPolicy _return) {
        this._return = _return;
    }


    public ArrayIRThrottlingPolicy getReturn() {
        return this._return;
    }


    public void setReturn(ArrayIRThrottlingPolicy value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetArrayIRThrottlingPolicyResponse)) {
            return false;
        }
        GetArrayIRThrottlingPolicyResponse otherObj = (GetArrayIRThrottlingPolicyResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetArrayIRThrottlingPolicyResponse [_return=" + this._return + "]";
    }
}


