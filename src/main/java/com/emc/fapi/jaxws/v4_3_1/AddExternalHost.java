package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addExternalHost", propOrder = {"hostParams"})
public class AddExternalHost {
    protected ExternalHostParams hostParams;

    public AddExternalHost() {
    }

    public AddExternalHost(ExternalHostParams hostParams) {
        this.hostParams = hostParams;
    }


    public ExternalHostParams getHostParams() {
        return this.hostParams;
    }


    public void setHostParams(ExternalHostParams value) {
        this.hostParams = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddExternalHost)) {
            return false;
        }
        AddExternalHost otherObj = (AddExternalHost) obj;

        return this.hostParams == otherObj.hostParams ? true : this.hostParams != null ? this.hostParams.equals(otherObj.hostParams) : false;
    }


    public int hashCode() {
        return this.hostParams != null ? this.hostParams.hashCode() : 0;
    }


    public String toString() {
        return "AddExternalHost [hostParams=" + this.hostParams + "]";
    }
}


