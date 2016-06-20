package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setExternalHostSettings", propOrder = {"hostSettings"})
public class SetExternalHostSettings {
    protected ExternalHostSettings hostSettings;

    public SetExternalHostSettings() {
    }

    public SetExternalHostSettings(ExternalHostSettings hostSettings) {
        this.hostSettings = hostSettings;
    }


    public ExternalHostSettings getHostSettings() {
        return this.hostSettings;
    }


    public void setHostSettings(ExternalHostSettings value) {
        this.hostSettings = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetExternalHostSettings)) {
            return false;
        }
        SetExternalHostSettings otherObj = (SetExternalHostSettings) obj;

        return this.hostSettings == otherObj.hostSettings ? true : this.hostSettings != null ? this.hostSettings.equals(otherObj.hostSettings) : false;
    }


    public int hashCode() {
        return this.hostSettings != null ? this.hostSettings.hashCode() : 0;
    }


    public String toString() {
        return "SetExternalHostSettings [hostSettings=" + this.hostSettings + "]";
    }
}


