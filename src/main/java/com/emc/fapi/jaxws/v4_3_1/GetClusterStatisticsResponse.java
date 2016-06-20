package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClusterStatisticsResponse", propOrder = {"_return"})
public class GetClusterStatisticsResponse {
    @XmlElement(name = "return")
    protected ClusterStatistics _return;

    public GetClusterStatisticsResponse() {
    }

    public GetClusterStatisticsResponse(ClusterStatistics _return) {
        this._return = _return;
    }


    public ClusterStatistics getReturn() {
        return this._return;
    }


    public void setReturn(ClusterStatistics value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetClusterStatisticsResponse)) {
            return false;
        }
        GetClusterStatisticsResponse otherObj = (GetClusterStatisticsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetClusterStatisticsResponse [_return=" + this._return + "]";
    }
}


