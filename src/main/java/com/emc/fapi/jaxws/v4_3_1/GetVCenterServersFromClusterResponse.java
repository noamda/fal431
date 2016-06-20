package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVCenterServersFromClusterResponse", propOrder = {"_return"})
public class GetVCenterServersFromClusterResponse {
    @XmlElement(name = "return")
    protected ClusterVCenterServers _return;

    public GetVCenterServersFromClusterResponse() {
    }

    public GetVCenterServersFromClusterResponse(ClusterVCenterServers _return) {
        this._return = _return;
    }


    public ClusterVCenterServers getReturn() {
        return this._return;
    }


    public void setReturn(ClusterVCenterServers value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVCenterServersFromClusterResponse)) {
            return false;
        }
        GetVCenterServersFromClusterResponse otherObj = (GetVCenterServersFromClusterResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetVCenterServersFromClusterResponse [_return=" + this._return + "]";
    }
}


