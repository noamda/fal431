package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setConsistencyGroupSettings", propOrder = {"settingsParam"})
public class SetConsistencyGroupSettings {
    protected ConsistencyGroupSettingsChangesParam settingsParam;

    public SetConsistencyGroupSettings() {
    }

    public SetConsistencyGroupSettings(ConsistencyGroupSettingsChangesParam settingsParam) {
        this.settingsParam = settingsParam;
    }


    public ConsistencyGroupSettingsChangesParam getSettingsParam() {
        return this.settingsParam;
    }


    public void setSettingsParam(ConsistencyGroupSettingsChangesParam value) {
        this.settingsParam = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetConsistencyGroupSettings)) {
            return false;
        }
        SetConsistencyGroupSettings otherObj = (SetConsistencyGroupSettings) obj;

        return this.settingsParam == otherObj.settingsParam ? true : this.settingsParam != null ? this.settingsParam.equals(otherObj.settingsParam) : false;
    }


    public int hashCode() {
        return this.settingsParam != null ? this.settingsParam.hashCode() : 0;
    }


    public String toString() {
        return "SetConsistencyGroupSettings [settingsParam=" + this.settingsParam + "]";
    }
}


