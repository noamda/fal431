package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLocalClusterResponse", propOrder = {"_return"})
public class GetLocalClusterResponse {
    @XmlElement(name = "return")
    protected ClusterUID _return;

    public GetLocalClusterResponse() {
    }

    public GetLocalClusterResponse(ClusterUID _return) {
        this._return = _return;
    }


    public ClusterUID getReturn() {
        return this._return;
    }


    public void setReturn(ClusterUID value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetLocalClusterResponse)) {
            return false;
        }
        GetLocalClusterResponse otherObj = (GetLocalClusterResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetLocalClusterResponse [_return=" + this._return + "]";
    }
}


