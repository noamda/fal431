package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkConnectivityToExistingExternalHost", propOrder = {"externalHost"})
public class CheckConnectivityToExistingExternalHost {
    protected ExternalHostUID externalHost;

    public CheckConnectivityToExistingExternalHost() {
    }

    public CheckConnectivityToExistingExternalHost(ExternalHostUID externalHost) {
        this.externalHost = externalHost;
    }


    public ExternalHostUID getExternalHost() {
        return this.externalHost;
    }


    public void setExternalHost(ExternalHostUID value) {
        this.externalHost = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CheckConnectivityToExistingExternalHost)) {
            return false;
        }
        CheckConnectivityToExistingExternalHost otherObj = (CheckConnectivityToExistingExternalHost) obj;

        return this.externalHost == otherObj.externalHost ? true : this.externalHost != null ? this.externalHost.equals(otherObj.externalHost) : false;
    }


    public int hashCode() {
        return this.externalHost != null ? this.externalHost.hashCode() : 0;
    }


    public String toString() {
        return "CheckConnectivityToExistingExternalHost [externalHost=" + this.externalHost + "]";
    }
}


