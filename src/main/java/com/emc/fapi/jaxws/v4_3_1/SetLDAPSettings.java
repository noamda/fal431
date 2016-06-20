package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setLDAPSettings", propOrder = {"settings"})
public class SetLDAPSettings {
    protected LDAPSettings settings;

    public SetLDAPSettings() {
    }

    public SetLDAPSettings(LDAPSettings settings) {
        this.settings = settings;
    }


    public LDAPSettings getSettings() {
        return this.settings;
    }


    public void setSettings(LDAPSettings value) {
        this.settings = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetLDAPSettings)) {
            return false;
        }
        SetLDAPSettings otherObj = (SetLDAPSettings) obj;

        return this.settings == otherObj.settings ? true : this.settings != null ? this.settings.equals(otherObj.settings) : false;
    }


    public int hashCode() {
        return this.settings != null ? this.settings.hashCode() : 0;
    }


    public String toString() {
        return "SetLDAPSettings [settings=" + this.settings + "]";
    }
}


