package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "areThereSystemSettingsConflictsResponse", propOrder = {"_return"})
public class AreThereSystemSettingsConflictsResponse {
    @XmlElement(name = "return")
    protected boolean _return;

    public AreThereSystemSettingsConflictsResponse() {
    }

    public AreThereSystemSettingsConflictsResponse(boolean _return) {
        this._return = _return;
    }


    public boolean isReturn() {
        return this._return;
    }


    public void setReturn(boolean value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AreThereSystemSettingsConflictsResponse)) {
            return false;
        }
        AreThereSystemSettingsConflictsResponse otherObj = (AreThereSystemSettingsConflictsResponse) obj;

        return this._return == otherObj._return;
    }


    public int hashCode() {
        return this._return ? 1 : 0;
    }


    public String toString() {
        return "AreThereSystemSettingsConflictsResponse [_return=" + this._return + "]";
    }
}


