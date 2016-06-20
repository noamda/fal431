package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVolumeInformationResponse", propOrder = {"_return"})
public class GetVolumeInformationResponse {
    @XmlElement(name = "return")
    protected VolumeInformation _return;

    public GetVolumeInformationResponse() {
    }

    public GetVolumeInformationResponse(VolumeInformation _return) {
        this._return = _return;
    }


    public VolumeInformation getReturn() {
        return this._return;
    }


    public void setReturn(VolumeInformation value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVolumeInformationResponse)) {
            return false;
        }
        GetVolumeInformationResponse otherObj = (GetVolumeInformationResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetVolumeInformationResponse [_return=" + this._return + "]";
    }
}


