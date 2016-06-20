package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVCenterServersViewFromClusterResponse", propOrder = {"_return"})
public class GetVCenterServersViewFromClusterResponse {
    @XmlElement(name = "return")
    protected ClusterVCenterServerView _return;

    public GetVCenterServersViewFromClusterResponse() {
    }

    public GetVCenterServersViewFromClusterResponse(ClusterVCenterServerView _return) {
        this._return = _return;
    }


    public ClusterVCenterServerView getReturn() {
        return this._return;
    }


    public void setReturn(ClusterVCenterServerView value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVCenterServersViewFromClusterResponse)) {
            return false;
        }
        GetVCenterServersViewFromClusterResponse otherObj = (GetVCenterServersViewFromClusterResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetVCenterServersViewFromClusterResponse [_return=" + this._return + "]";
    }
}


