package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserVolumeSettingsResponse", propOrder = {"_return"})
public class GetUserVolumeSettingsResponse {
    @XmlElement(name = "return")
    protected UserVolumeSettings _return;

    public GetUserVolumeSettingsResponse() {
    }

    public GetUserVolumeSettingsResponse(UserVolumeSettings _return) {
        this._return = _return;
    }


    public UserVolumeSettings getReturn() {
        return this._return;
    }


    public void setReturn(UserVolumeSettings value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetUserVolumeSettingsResponse)) {
            return false;
        }
        GetUserVolumeSettingsResponse otherObj = (GetUserVolumeSettingsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetUserVolumeSettingsResponse [_return=" + this._return + "]";
    }
}


