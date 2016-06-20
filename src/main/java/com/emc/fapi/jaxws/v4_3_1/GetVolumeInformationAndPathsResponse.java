package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVolumeInformationAndPathsResponse", propOrder = {"_return"})
public class GetVolumeInformationAndPathsResponse {
    @XmlElement(name = "return")
    protected VolumeInformationAndPaths _return;

    public GetVolumeInformationAndPathsResponse() {
    }

    public GetVolumeInformationAndPathsResponse(VolumeInformationAndPaths _return) {
        this._return = _return;
    }


    public VolumeInformationAndPaths getReturn() {
        return this._return;
    }


    public void setReturn(VolumeInformationAndPaths value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVolumeInformationAndPathsResponse)) {
            return false;
        }
        GetVolumeInformationAndPathsResponse otherObj = (GetVolumeInformationAndPathsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetVolumeInformationAndPathsResponse [_return=" + this._return + "]";
    }
}


