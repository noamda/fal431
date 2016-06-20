package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateRemoveExternalHost", propOrder = {"externalHost"})
public class ValidateRemoveExternalHost {
    protected ExternalHostUID externalHost;

    public ValidateRemoveExternalHost() {
    }

    public ValidateRemoveExternalHost(ExternalHostUID externalHost) {
        this.externalHost = externalHost;
    }


    public ExternalHostUID getExternalHost() {
        return this.externalHost;
    }


    public void setExternalHost(ExternalHostUID value) {
        this.externalHost = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateRemoveExternalHost)) {
            return false;
        }
        ValidateRemoveExternalHost otherObj = (ValidateRemoveExternalHost) obj;

        return this.externalHost == otherObj.externalHost ? true : this.externalHost != null ? this.externalHost.equals(otherObj.externalHost) : false;
    }


    public int hashCode() {
        return this.externalHost != null ? this.externalHost.hashCode() : 0;
    }


    public String toString() {
        return "ValidateRemoveExternalHost [externalHost=" + this.externalHost + "]";
    }
}


