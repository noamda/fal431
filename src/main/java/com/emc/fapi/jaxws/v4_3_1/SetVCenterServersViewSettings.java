package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setVCenterServersViewSettings", propOrder = {"settings"})
public class SetVCenterServersViewSettings {
    protected VCenterServersViewSettings settings;

    public SetVCenterServersViewSettings() {
    }

    public SetVCenterServersViewSettings(VCenterServersViewSettings settings) {
        this.settings = settings;
    }


    public VCenterServersViewSettings getSettings() {
        return this.settings;
    }


    public void setSettings(VCenterServersViewSettings value) {
        this.settings = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetVCenterServersViewSettings)) {
            return false;
        }
        SetVCenterServersViewSettings otherObj = (SetVCenterServersViewSettings) obj;

        return this.settings == otherObj.settings ? true : this.settings != null ? this.settings.equals(otherObj.settings) : false;
    }


    public int hashCode() {
        return this.settings != null ? this.settings.hashCode() : 0;
    }


    public String toString() {
        return "SetVCenterServersViewSettings [settings=" + this.settings + "]";
    }
}


