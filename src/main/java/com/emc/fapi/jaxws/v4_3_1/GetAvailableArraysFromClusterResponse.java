package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableArraysFromClusterResponse", propOrder = {"_return"})
public class GetAvailableArraysFromClusterResponse {
    @XmlElement(name = "return")
    protected ClusterAvailableArrays _return;

    public GetAvailableArraysFromClusterResponse() {
    }

    public GetAvailableArraysFromClusterResponse(ClusterAvailableArrays _return) {
        this._return = _return;
    }


    public ClusterAvailableArrays getReturn() {
        return this._return;
    }


    public void setReturn(ClusterAvailableArrays value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetAvailableArraysFromClusterResponse)) {
            return false;
        }
        GetAvailableArraysFromClusterResponse otherObj = (GetAvailableArraysFromClusterResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetAvailableArraysFromClusterResponse [_return=" + this._return + "]";
    }
}


