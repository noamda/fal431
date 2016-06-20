package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableSplittersFromClusterResponse", propOrder = {"_return"})
public class GetAvailableSplittersFromClusterResponse {
    @XmlElement(name = "return")
    protected ClusterAvailableSplitters _return;

    public GetAvailableSplittersFromClusterResponse() {
    }

    public GetAvailableSplittersFromClusterResponse(ClusterAvailableSplitters _return) {
        this._return = _return;
    }


    public ClusterAvailableSplitters getReturn() {
        return this._return;
    }


    public void setReturn(ClusterAvailableSplitters value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetAvailableSplittersFromClusterResponse)) {
            return false;
        }
        GetAvailableSplittersFromClusterResponse otherObj = (GetAvailableSplittersFromClusterResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetAvailableSplittersFromClusterResponse [_return=" + this._return + "]";
    }
}


