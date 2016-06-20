package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkConnectivityToExternalHostResponse", propOrder = {"_return"})
public class CheckConnectivityToExternalHostResponse {
    @XmlElement(name = "return")
    protected HostConnectivityStatus _return;

    public CheckConnectivityToExternalHostResponse() {
    }

    public CheckConnectivityToExternalHostResponse(HostConnectivityStatus _return) {
        this._return = _return;
    }


    public HostConnectivityStatus getReturn() {
        return this._return;
    }


    public void setReturn(HostConnectivityStatus value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CheckConnectivityToExternalHostResponse)) {
            return false;
        }
        CheckConnectivityToExternalHostResponse otherObj = (CheckConnectivityToExternalHostResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "CheckConnectivityToExternalHostResponse [_return=" + this._return + "]";
    }
}


