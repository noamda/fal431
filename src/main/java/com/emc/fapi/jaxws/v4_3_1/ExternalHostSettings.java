package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalHostSettings", propOrder = {"hostUID", "hostParams"})
public class ExternalHostSettings {
    @XmlElement(required = true)
    protected ExternalHostUID hostUID;
    @XmlElement(required = true)
    protected ExternalHostParams hostParams;

    public ExternalHostSettings() {
    }

    public ExternalHostSettings(ExternalHostUID hostUID, ExternalHostParams hostParams) {
        this.hostUID = hostUID;
        this.hostParams = hostParams;
    }


    public ExternalHostUID getHostUID() {
        return this.hostUID;
    }


    public void setHostUID(ExternalHostUID value) {
        this.hostUID = value;
    }


    public ExternalHostParams getHostParams() {
        return this.hostParams;
    }


    public void setHostParams(ExternalHostParams value) {
        this.hostParams = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ExternalHostSettings)) {
            return false;
        }
        ExternalHostSettings otherObj = (ExternalHostSettings) obj;

        return (this.hostUID != null ? this.hostUID.equals(otherObj.hostUID) : this.hostUID == otherObj.hostUID) && (this.hostParams != null ? this.hostParams.equals(otherObj.hostParams) : this.hostParams == otherObj.hostParams);
    }


    public int hashCode() {
        return (this.hostUID != null ? this.hostUID.hashCode() : 0) ^ (this.hostParams != null ? this.hostParams.hashCode() : 0);
    }


    public String toString() {
        return "ExternalHostSettings [hostUID=" + this.hostUID + ", " + "hostParams=" + this.hostParams + "]";
    }
}


