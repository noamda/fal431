package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPhoenixClusterStateResponse", propOrder = {"_return"})
public class GetPhoenixClusterStateResponse {
    @XmlElement(name = "return")
    protected PhoenixClusterState _return;

    public GetPhoenixClusterStateResponse() {
    }

    public GetPhoenixClusterStateResponse(PhoenixClusterState _return) {
        this._return = _return;
    }


    public PhoenixClusterState getReturn() {
        return this._return;
    }


    public void setReturn(PhoenixClusterState value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetPhoenixClusterStateResponse)) {
            return false;
        }
        GetPhoenixClusterStateResponse otherObj = (GetPhoenixClusterStateResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetPhoenixClusterStateResponse [_return=" + this._return + "]";
    }
}


