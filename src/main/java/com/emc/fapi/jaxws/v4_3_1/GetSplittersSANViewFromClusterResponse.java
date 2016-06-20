package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSplittersSANViewFromClusterResponse", propOrder = {"_return"})
public class GetSplittersSANViewFromClusterResponse {
    @XmlElement(name = "return")
    protected ClusterSplittersSANView _return;

    public GetSplittersSANViewFromClusterResponse() {
    }

    public GetSplittersSANViewFromClusterResponse(ClusterSplittersSANView _return) {
        this._return = _return;
    }


    public ClusterSplittersSANView getReturn() {
        return this._return;
    }


    public void setReturn(ClusterSplittersSANView value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSplittersSANViewFromClusterResponse)) {
            return false;
        }
        GetSplittersSANViewFromClusterResponse otherObj = (GetSplittersSANViewFromClusterResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSplittersSANViewFromClusterResponse [_return=" + this._return + "]";
    }
}


