package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateSetLDAPSettings", propOrder = {"settings"})
public class ValidateSetLDAPSettings {
    protected LDAPSettings settings;

    public ValidateSetLDAPSettings() {
    }

    public ValidateSetLDAPSettings(LDAPSettings settings) {
        this.settings = settings;
    }


    public LDAPSettings getSettings() {
        return this.settings;
    }


    public void setSettings(LDAPSettings value) {
        this.settings = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateSetLDAPSettings)) {
            return false;
        }
        ValidateSetLDAPSettings otherObj = (ValidateSetLDAPSettings) obj;

        return this.settings == otherObj.settings ? true : this.settings != null ? this.settings.equals(otherObj.settings) : false;
    }


    public int hashCode() {
        return this.settings != null ? this.settings.hashCode() : 0;
    }


    public String toString() {
        return "ValidateSetLDAPSettings [settings=" + this.settings + "]";
    }
}


