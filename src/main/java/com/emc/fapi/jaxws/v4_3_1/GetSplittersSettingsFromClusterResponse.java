package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSplittersSettingsFromClusterResponse", propOrder = {"_return"})
public class GetSplittersSettingsFromClusterResponse {
    @XmlElement(name = "return")
    protected ClusterSplittersSettings _return;

    public GetSplittersSettingsFromClusterResponse() {
    }

    public GetSplittersSettingsFromClusterResponse(ClusterSplittersSettings _return) {
        this._return = _return;
    }


    public ClusterSplittersSettings getReturn() {
        return this._return;
    }


    public void setReturn(ClusterSplittersSettings value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSplittersSettingsFromClusterResponse)) {
            return false;
        }
        GetSplittersSettingsFromClusterResponse otherObj = (GetSplittersSettingsFromClusterResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSplittersSettingsFromClusterResponse [_return=" + this._return + "]";
    }
}


