package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSyslogSettings", propOrder = {"settings"})
public class SetSyslogSettings {
    protected SyslogSettings settings;

    public SetSyslogSettings() {
    }

    public SetSyslogSettings(SyslogSettings settings) {
        this.settings = settings;
    }


    public SyslogSettings getSettings() {
        return this.settings;
    }


    public void setSettings(SyslogSettings value) {
        this.settings = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetSyslogSettings)) {
            return false;
        }
        SetSyslogSettings otherObj = (SetSyslogSettings) obj;

        return this.settings == otherObj.settings ? true : this.settings != null ? this.settings.equals(otherObj.settings) : false;
    }


    public int hashCode() {
        return this.settings != null ? this.settings.hashCode() : 0;
    }


    public String toString() {
        return "SetSyslogSettings [settings=" + this.settings + "]";
    }
}


