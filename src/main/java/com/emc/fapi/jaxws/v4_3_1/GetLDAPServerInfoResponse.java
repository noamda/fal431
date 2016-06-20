package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLDAPServerInfoResponse", propOrder = {"_return"})
public class GetLDAPServerInfoResponse {
    @XmlElement(name = "return")
    protected LDAPServerInfo _return;

    public GetLDAPServerInfoResponse() {
    }

    public GetLDAPServerInfoResponse(LDAPServerInfo _return) {
        this._return = _return;
    }


    public LDAPServerInfo getReturn() {
        return this._return;
    }


    public void setReturn(LDAPServerInfo value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetLDAPServerInfoResponse)) {
            return false;
        }
        GetLDAPServerInfoResponse otherObj = (GetLDAPServerInfoResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetLDAPServerInfoResponse [_return=" + this._return + "]";
    }
}


