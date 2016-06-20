package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRepositoryVolumeStateResponse", propOrder = {"_return"})
public class GetRepositoryVolumeStateResponse {
    @XmlElement(name = "return")
    protected RepositoryVolumeState _return;

    public GetRepositoryVolumeStateResponse() {
    }

    public GetRepositoryVolumeStateResponse(RepositoryVolumeState _return) {
        this._return = _return;
    }


    public RepositoryVolumeState getReturn() {
        return this._return;
    }


    public void setReturn(RepositoryVolumeState value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetRepositoryVolumeStateResponse)) {
            return false;
        }
        GetRepositoryVolumeStateResponse otherObj = (GetRepositoryVolumeStateResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetRepositoryVolumeStateResponse [_return=" + this._return + "]";
    }
}


