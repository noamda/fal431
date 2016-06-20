package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableLongTermStatisticsTimeFramesResponse", propOrder = {"_return"})
public class GetAvailableLongTermStatisticsTimeFramesResponse {
    @XmlElement(name = "return")
    protected LongTermStatisticsTimeFrames _return;

    public GetAvailableLongTermStatisticsTimeFramesResponse() {
    }

    public GetAvailableLongTermStatisticsTimeFramesResponse(LongTermStatisticsTimeFrames _return) {
        this._return = _return;
    }


    public LongTermStatisticsTimeFrames getReturn() {
        return this._return;
    }


    public void setReturn(LongTermStatisticsTimeFrames value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetAvailableLongTermStatisticsTimeFramesResponse)) {
            return false;
        }
        GetAvailableLongTermStatisticsTimeFramesResponse otherObj = (GetAvailableLongTermStatisticsTimeFramesResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetAvailableLongTermStatisticsTimeFramesResponse [_return=" + this._return + "]";
    }
}


