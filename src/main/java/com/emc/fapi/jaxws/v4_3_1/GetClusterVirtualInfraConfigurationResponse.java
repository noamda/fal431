package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClusterVirtualInfraConfigurationResponse", propOrder = {"_return"})
public class GetClusterVirtualInfraConfigurationResponse {
    @XmlElement(name = "return")
    protected ClusterVirtualInfraConfiguration _return;

    public GetClusterVirtualInfraConfigurationResponse() {
    }

    public GetClusterVirtualInfraConfigurationResponse(ClusterVirtualInfraConfiguration _return) {
        this._return = _return;
    }


    public ClusterVirtualInfraConfiguration getReturn() {
        return this._return;
    }


    public void setReturn(ClusterVirtualInfraConfiguration value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetClusterVirtualInfraConfigurationResponse)) {
            return false;
        }
        GetClusterVirtualInfraConfigurationResponse otherObj = (GetClusterVirtualInfraConfigurationResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetClusterVirtualInfraConfigurationResponse [_return=" + this._return + "]";
    }
}


