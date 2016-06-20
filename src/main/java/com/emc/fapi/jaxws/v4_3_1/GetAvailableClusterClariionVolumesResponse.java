package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableClusterClariionVolumesResponse", propOrder = {"_return"})
public class GetAvailableClusterClariionVolumesResponse {
    @XmlElement(name = "return")
    protected ClusterClariionVolumes _return;

    public GetAvailableClusterClariionVolumesResponse() {
    }

    public GetAvailableClusterClariionVolumesResponse(ClusterClariionVolumes _return) {
        this._return = _return;
    }


    public ClusterClariionVolumes getReturn() {
        return this._return;
    }


    public void setReturn(ClusterClariionVolumes value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetAvailableClusterClariionVolumesResponse)) {
            return false;
        }
        GetAvailableClusterClariionVolumesResponse otherObj = (GetAvailableClusterClariionVolumesResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetAvailableClusterClariionVolumesResponse [_return=" + this._return + "]";
    }
}


