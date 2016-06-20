package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClusterSANVolumesResponse", propOrder = {"_return"})
public class GetClusterSANVolumesResponse {
    @XmlElement(name = "return")
    protected ClusterSANVolumes _return;

    public GetClusterSANVolumesResponse() {
    }

    public GetClusterSANVolumesResponse(ClusterSANVolumes _return) {
        this._return = _return;
    }


    public ClusterSANVolumes getReturn() {
        return this._return;
    }


    public void setReturn(ClusterSANVolumes value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetClusterSANVolumesResponse)) {
            return false;
        }
        GetClusterSANVolumesResponse otherObj = (GetClusterSANVolumesResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetClusterSANVolumesResponse [_return=" + this._return + "]";
    }
}


