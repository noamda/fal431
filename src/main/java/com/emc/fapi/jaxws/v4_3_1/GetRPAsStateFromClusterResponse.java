package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRPAsStateFromClusterResponse", propOrder = {"_return"})
public class GetRPAsStateFromClusterResponse {
    @XmlElement(name = "return")
    protected ClusterRPAsState _return;

    public GetRPAsStateFromClusterResponse() {
    }

    public GetRPAsStateFromClusterResponse(ClusterRPAsState _return) {
        this._return = _return;
    }


    public ClusterRPAsState getReturn() {
        return this._return;
    }


    public void setReturn(ClusterRPAsState value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetRPAsStateFromClusterResponse)) {
            return false;
        }
        GetRPAsStateFromClusterResponse otherObj = (GetRPAsStateFromClusterResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetRPAsStateFromClusterResponse [_return=" + this._return + "]";
    }
}


