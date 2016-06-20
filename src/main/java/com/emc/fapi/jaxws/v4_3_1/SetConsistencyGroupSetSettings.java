package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setConsistencyGroupSetSettings", propOrder = {"groupSetSettings"})
public class SetConsistencyGroupSetSettings {
    protected ConsistencyGroupSetSettings groupSetSettings;

    public SetConsistencyGroupSetSettings() {
    }

    public SetConsistencyGroupSetSettings(ConsistencyGroupSetSettings groupSetSettings) {
        this.groupSetSettings = groupSetSettings;
    }


    public ConsistencyGroupSetSettings getGroupSetSettings() {
        return this.groupSetSettings;
    }


    public void setGroupSetSettings(ConsistencyGroupSetSettings value) {
        this.groupSetSettings = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetConsistencyGroupSetSettings)) {
            return false;
        }
        SetConsistencyGroupSetSettings otherObj = (SetConsistencyGroupSetSettings) obj;

        return this.groupSetSettings == otherObj.groupSetSettings ? true : this.groupSetSettings != null ? this.groupSetSettings.equals(otherObj.groupSetSettings) : false;
    }


    public int hashCode() {
        return this.groupSetSettings != null ? this.groupSetSettings.hashCode() : 0;
    }


    public String toString() {
        return "SetConsistencyGroupSetSettings [groupSetSettings=" + this.groupSetSettings + "]";
    }
}


