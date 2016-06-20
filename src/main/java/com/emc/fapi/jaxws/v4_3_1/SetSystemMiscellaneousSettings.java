package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSystemMiscellaneousSettings", propOrder = {"settings"})
public class SetSystemMiscellaneousSettings {
    protected SystemMiscellaneousSettings settings;

    public SetSystemMiscellaneousSettings() {
    }

    public SetSystemMiscellaneousSettings(SystemMiscellaneousSettings settings) {
        this.settings = settings;
    }


    public SystemMiscellaneousSettings getSettings() {
        return this.settings;
    }


    public void setSettings(SystemMiscellaneousSettings value) {
        this.settings = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetSystemMiscellaneousSettings)) {
            return false;
        }
        SetSystemMiscellaneousSettings otherObj = (SetSystemMiscellaneousSettings) obj;

        return this.settings == otherObj.settings ? true : this.settings != null ? this.settings.equals(otherObj.settings) : false;
    }


    public int hashCode() {
        return this.settings != null ? this.settings.hashCode() : 0;
    }


    public String toString() {
        return "SetSystemMiscellaneousSettings [settings=" + this.settings + "]";
    }
}


