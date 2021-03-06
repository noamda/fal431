package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDefaultSystemGlobalPolicyResponse", propOrder = {"_return"})
public class GetDefaultSystemGlobalPolicyResponse {
    @XmlElement(name = "return")
    protected SystemGlobalPolicy _return;

    public GetDefaultSystemGlobalPolicyResponse() {
    }

    public GetDefaultSystemGlobalPolicyResponse(SystemGlobalPolicy _return) {
        this._return = _return;
    }


    public SystemGlobalPolicy getReturn() {
        return this._return;
    }


    public void setReturn(SystemGlobalPolicy value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetDefaultSystemGlobalPolicyResponse)) {
            return false;
        }
        GetDefaultSystemGlobalPolicyResponse otherObj = (GetDefaultSystemGlobalPolicyResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetDefaultSystemGlobalPolicyResponse [_return=" + this._return + "]";
    }
}


