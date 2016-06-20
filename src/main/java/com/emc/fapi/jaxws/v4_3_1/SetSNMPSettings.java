package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSNMPSettings", propOrder = {"settings"})
public class SetSNMPSettings {
    protected SNMPSettings settings;

    public SetSNMPSettings() {
    }

    public SetSNMPSettings(SNMPSettings settings) {
        this.settings = settings;
    }


    public SNMPSettings getSettings() {
        return this.settings;
    }


    public void setSettings(SNMPSettings value) {
        this.settings = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetSNMPSettings)) {
            return false;
        }
        SetSNMPSettings otherObj = (SetSNMPSettings) obj;

        return this.settings == otherObj.settings ? true : this.settings != null ? this.settings.equals(otherObj.settings) : false;
    }


    public int hashCode() {
        return this.settings != null ? this.settings.hashCode() : 0;
    }


    public String toString() {
        return "SetSNMPSettings [settings=" + this.settings + "]";
    }
}


