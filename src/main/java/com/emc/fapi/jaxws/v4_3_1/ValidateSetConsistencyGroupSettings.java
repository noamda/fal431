package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateSetConsistencyGroupSettings", propOrder = {"settingsParam"})
public class ValidateSetConsistencyGroupSettings {
    protected ConsistencyGroupSettingsChangesParam settingsParam;

    public ValidateSetConsistencyGroupSettings() {
    }

    public ValidateSetConsistencyGroupSettings(ConsistencyGroupSettingsChangesParam settingsParam) {
        this.settingsParam = settingsParam;
    }


    public ConsistencyGroupSettingsChangesParam getSettingsParam() {
        return this.settingsParam;
    }


    public void setSettingsParam(ConsistencyGroupSettingsChangesParam value) {
        this.settingsParam = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateSetConsistencyGroupSettings)) {
            return false;
        }
        ValidateSetConsistencyGroupSettings otherObj = (ValidateSetConsistencyGroupSettings) obj;

        return this.settingsParam == otherObj.settingsParam ? true : this.settingsParam != null ? this.settingsParam.equals(otherObj.settingsParam) : false;
    }


    public int hashCode() {
        return this.settingsParam != null ? this.settingsParam.hashCode() : 0;
    }


    public String toString() {
        return "ValidateSetConsistencyGroupSettings [settingsParam=" + this.settingsParam + "]";
    }
}


