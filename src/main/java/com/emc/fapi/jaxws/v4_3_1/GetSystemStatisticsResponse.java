package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSystemStatisticsResponse", propOrder = {"_return"})
public class GetSystemStatisticsResponse {
    @XmlElement(name = "return")
    protected SystemStatistics _return;

    public GetSystemStatisticsResponse() {
    }

    public GetSystemStatisticsResponse(SystemStatistics _return) {
        this._return = _return;
    }


    public SystemStatistics getReturn() {
        return this._return;
    }


    public void setReturn(SystemStatistics value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSystemStatisticsResponse)) {
            return false;
        }
        GetSystemStatisticsResponse otherObj = (GetSystemStatisticsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSystemStatisticsResponse [_return=" + this._return + "]";
    }
}


