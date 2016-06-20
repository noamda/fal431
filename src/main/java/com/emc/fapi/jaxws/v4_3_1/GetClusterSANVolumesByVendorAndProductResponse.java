package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClusterSANVolumesByVendorAndProductResponse", propOrder = {"_return"})
public class GetClusterSANVolumesByVendorAndProductResponse {
    @XmlElement(name = "return")
    protected ClusterSANVolumes _return;

    public GetClusterSANVolumesByVendorAndProductResponse() {
    }

    public GetClusterSANVolumesByVendorAndProductResponse(ClusterSANVolumes _return) {
        this._return = _return;
    }


    public ClusterSANVolumes getReturn() {
        return this._return;
    }


    public void setReturn(ClusterSANVolumes value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetClusterSANVolumesByVendorAndProductResponse)) {
            return false;
        }
        GetClusterSANVolumesByVendorAndProductResponse otherObj = (GetClusterSANVolumesByVendorAndProductResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetClusterSANVolumesByVendorAndProductResponse [_return=" + this._return + "]";
    }
}


