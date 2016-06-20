package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVirtualInfrastructuresStateFromClusterResponse", propOrder = {"_return"})
public class GetVirtualInfrastructuresStateFromClusterResponse {
    @XmlElement(name = "return")
    protected ClusterVirtualInfrastructuresState _return;

    public GetVirtualInfrastructuresStateFromClusterResponse() {
    }

    public GetVirtualInfrastructuresStateFromClusterResponse(ClusterVirtualInfrastructuresState _return) {
        this._return = _return;
    }


    public ClusterVirtualInfrastructuresState getReturn() {
        return this._return;
    }


    public void setReturn(ClusterVirtualInfrastructuresState value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVirtualInfrastructuresStateFromClusterResponse)) {
            return false;
        }
        GetVirtualInfrastructuresStateFromClusterResponse otherObj = (GetVirtualInfrastructuresStateFromClusterResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetVirtualInfrastructuresStateFromClusterResponse [_return=" + this._return + "]";
    }
}


