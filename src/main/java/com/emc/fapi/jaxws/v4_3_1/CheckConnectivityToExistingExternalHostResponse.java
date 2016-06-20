package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkConnectivityToExistingExternalHostResponse", propOrder = {"_return"})
public class CheckConnectivityToExistingExternalHostResponse {
    @XmlElement(name = "return")
    protected HostConnectivityStatus _return;

    public CheckConnectivityToExistingExternalHostResponse() {
    }

    public CheckConnectivityToExistingExternalHostResponse(HostConnectivityStatus _return) {
        this._return = _return;
    }


    public HostConnectivityStatus getReturn() {
        return this._return;
    }


    public void setReturn(HostConnectivityStatus value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CheckConnectivityToExistingExternalHostResponse)) {
            return false;
        }
        CheckConnectivityToExistingExternalHostResponse otherObj = (CheckConnectivityToExistingExternalHostResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "CheckConnectivityToExistingExternalHostResponse [_return=" + this._return + "]";
    }
}


