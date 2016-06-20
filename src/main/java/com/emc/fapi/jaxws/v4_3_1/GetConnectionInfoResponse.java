package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getConnectionInfoResponse", propOrder = {"_return"})
public class GetConnectionInfoResponse {
    @XmlElement(name = "return")
    protected ConnectionInfo _return;

    public GetConnectionInfoResponse() {
    }

    public GetConnectionInfoResponse(ConnectionInfo _return) {
        this._return = _return;
    }


    public ConnectionInfo getReturn() {
        return this._return;
    }


    public void setReturn(ConnectionInfo value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetConnectionInfoResponse)) {
            return false;
        }
        GetConnectionInfoResponse otherObj = (GetConnectionInfoResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetConnectionInfoResponse [_return=" + this._return + "]";
    }
}


