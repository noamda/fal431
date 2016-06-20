package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateSetUsersSettings", propOrder = {"settings"})
public class ValidateSetUsersSettings {
    protected UsersSettings settings;

    public ValidateSetUsersSettings() {
    }

    public ValidateSetUsersSettings(UsersSettings settings) {
        this.settings = settings;
    }


    public UsersSettings getSettings() {
        return this.settings;
    }


    public void setSettings(UsersSettings value) {
        this.settings = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateSetUsersSettings)) {
            return false;
        }
        ValidateSetUsersSettings otherObj = (ValidateSetUsersSettings) obj;

        return this.settings == otherObj.settings ? true : this.settings != null ? this.settings.equals(otherObj.settings) : false;
    }


    public int hashCode() {
        return this.settings != null ? this.settings.hashCode() : 0;
    }


    public String toString() {
        return "ValidateSetUsersSettings [settings=" + this.settings + "]";
    }
}


