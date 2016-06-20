package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addConsistencyGroupCopy", propOrder = {"copySettingsParam"})
public class AddConsistencyGroupCopy {
    protected ConsistencyGroupCopySettingsParam copySettingsParam;

    public AddConsistencyGroupCopy() {
    }

    public AddConsistencyGroupCopy(ConsistencyGroupCopySettingsParam copySettingsParam) {
        this.copySettingsParam = copySettingsParam;
    }


    public ConsistencyGroupCopySettingsParam getCopySettingsParam() {
        return this.copySettingsParam;
    }


    public void setCopySettingsParam(ConsistencyGroupCopySettingsParam value) {
        this.copySettingsParam = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddConsistencyGroupCopy)) {
            return false;
        }
        AddConsistencyGroupCopy otherObj = (AddConsistencyGroupCopy) obj;

        return this.copySettingsParam == otherObj.copySettingsParam ? true : this.copySettingsParam != null ? this.copySettingsParam.equals(otherObj.copySettingsParam) : false;
    }


    public int hashCode() {
        return this.copySettingsParam != null ? this.copySettingsParam.hashCode() : 0;
    }


    public String toString() {
        return "AddConsistencyGroupCopy [copySettingsParam=" + this.copySettingsParam + "]";
    }
}


