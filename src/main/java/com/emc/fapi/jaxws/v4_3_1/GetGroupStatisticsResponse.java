package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGroupStatisticsResponse", propOrder = {"_return"})
public class GetGroupStatisticsResponse {
    @XmlElement(name = "return")
    protected ConsistencyGroupStatistics _return;

    public GetGroupStatisticsResponse() {
    }

    public GetGroupStatisticsResponse(ConsistencyGroupStatistics _return) {
        this._return = _return;
    }


    public ConsistencyGroupStatistics getReturn() {
        return this._return;
    }


    public void setReturn(ConsistencyGroupStatistics value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetGroupStatisticsResponse)) {
            return false;
        }
        GetGroupStatisticsResponse otherObj = (GetGroupStatisticsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetGroupStatisticsResponse [_return=" + this._return + "]";
    }
}


