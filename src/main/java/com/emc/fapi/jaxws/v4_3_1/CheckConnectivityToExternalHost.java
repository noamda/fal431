package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkConnectivityToExternalHost", propOrder = {"hostParams"})
public class CheckConnectivityToExternalHost {
    protected ExternalHostParams hostParams;

    public CheckConnectivityToExternalHost() {
    }

    public CheckConnectivityToExternalHost(ExternalHostParams hostParams) {
        this.hostParams = hostParams;
    }


    public ExternalHostParams getHostParams() {
        return this.hostParams;
    }


    public void setHostParams(ExternalHostParams value) {
        this.hostParams = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CheckConnectivityToExternalHost)) {
            return false;
        }
        CheckConnectivityToExternalHost otherObj = (CheckConnectivityToExternalHost) obj;

        return this.hostParams == otherObj.hostParams ? true : this.hostParams != null ? this.hostParams.equals(otherObj.hostParams) : false;
    }


    public int hashCode() {
        return this.hostParams != null ? this.hostParams.hashCode() : 0;
    }


    public String toString() {
        return "CheckConnectivityToExternalHost [hostParams=" + this.hostParams + "]";
    }
}


