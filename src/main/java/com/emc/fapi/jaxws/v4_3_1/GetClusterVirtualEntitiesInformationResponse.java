package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClusterVirtualEntitiesInformationResponse", propOrder = {"_return"})
public class GetClusterVirtualEntitiesInformationResponse {
    @XmlElement(name = "return")
    protected ClusterVirtualEntitiesInformation _return;

    public GetClusterVirtualEntitiesInformationResponse() {
    }

    public GetClusterVirtualEntitiesInformationResponse(ClusterVirtualEntitiesInformation _return) {
        this._return = _return;
    }


    public ClusterVirtualEntitiesInformation getReturn() {
        return this._return;
    }


    public void setReturn(ClusterVirtualEntitiesInformation value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetClusterVirtualEntitiesInformationResponse)) {
            return false;
        }
        GetClusterVirtualEntitiesInformationResponse otherObj = (GetClusterVirtualEntitiesInformationResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetClusterVirtualEntitiesInformationResponse [_return=" + this._return + "]";
    }
}


