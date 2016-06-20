package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addConsistencyGroupSet", propOrder = {"groupSetSettings"})
public class AddConsistencyGroupSet {
    protected ConsistencyGroupSetSettings groupSetSettings;

    public AddConsistencyGroupSet() {
    }

    public AddConsistencyGroupSet(ConsistencyGroupSetSettings groupSetSettings) {
        this.groupSetSettings = groupSetSettings;
    }


    public ConsistencyGroupSetSettings getGroupSetSettings() {
        return this.groupSetSettings;
    }


    public void setGroupSetSettings(ConsistencyGroupSetSettings value) {
        this.groupSetSettings = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddConsistencyGroupSet)) {
            return false;
        }
        AddConsistencyGroupSet otherObj = (AddConsistencyGroupSet) obj;

        return this.groupSetSettings == otherObj.groupSetSettings ? true : this.groupSetSettings != null ? this.groupSetSettings.equals(otherObj.groupSetSettings) : false;
    }


    public int hashCode() {
        return this.groupSetSettings != null ? this.groupSetSettings.hashCode() : 0;
    }


    public String toString() {
        return "AddConsistencyGroupSet [groupSetSettings=" + this.groupSetSettings + "]";
    }
}


