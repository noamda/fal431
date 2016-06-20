package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setTimeSettings", propOrder = {"settings"})
public class SetTimeSettings {
    protected TimeSettings settings;

    public SetTimeSettings() {
    }

    public SetTimeSettings(TimeSettings settings) {
        this.settings = settings;
    }


    public TimeSettings getSettings() {
        return this.settings;
    }


    public void setSettings(TimeSettings value) {
        this.settings = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetTimeSettings)) {
            return false;
        }
        SetTimeSettings otherObj = (SetTimeSettings) obj;

        return this.settings == otherObj.settings ? true : this.settings != null ? this.settings.equals(otherObj.settings) : false;
    }


    public int hashCode() {
        return this.settings != null ? this.settings.hashCode() : 0;
    }


    public String toString() {
        return "SetTimeSettings [settings=" + this.settings + "]";
    }
}


