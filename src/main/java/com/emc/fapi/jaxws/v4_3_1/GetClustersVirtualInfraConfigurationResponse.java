package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClustersVirtualInfraConfigurationResponse", propOrder = {"_return"})
public class GetClustersVirtualInfraConfigurationResponse {
    @XmlElement(name = "return")
    protected ClustersVirtualInfraConfiguration _return;

    public GetClustersVirtualInfraConfigurationResponse() {
    }

    public GetClustersVirtualInfraConfigurationResponse(ClustersVirtualInfraConfiguration _return) {
        this._return = _return;
    }


    public ClustersVirtualInfraConfiguration getReturn() {
        return this._return;
    }


    public void setReturn(ClustersVirtualInfraConfiguration value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetClustersVirtualInfraConfigurationResponse)) {
            return false;
        }
        GetClustersVirtualInfraConfigurationResponse otherObj = (GetClustersVirtualInfraConfigurationResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetClustersVirtualInfraConfigurationResponse [_return=" + this._return + "]";
    }
}


