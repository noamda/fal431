package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableVolumesFromAllClustersResponse", propOrder = {"_return"})
public class GetAvailableVolumesFromAllClustersResponse {
    @XmlElement(name = "return")
    protected AllClustersSANVolumesInfo _return;

    public GetAvailableVolumesFromAllClustersResponse() {
    }

    public GetAvailableVolumesFromAllClustersResponse(AllClustersSANVolumesInfo _return) {
        this._return = _return;
    }


    public AllClustersSANVolumesInfo getReturn() {
        return this._return;
    }


    public void setReturn(AllClustersSANVolumesInfo value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetAvailableVolumesFromAllClustersResponse)) {
            return false;
        }
        GetAvailableVolumesFromAllClustersResponse otherObj = (GetAvailableVolumesFromAllClustersResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetAvailableVolumesFromAllClustersResponse [_return=" + this._return + "]";
    }
}


