package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSpecificGroupsStatisticsResponse", propOrder = {"_return"})
public class GetSpecificGroupsStatisticsResponse {
    @XmlElement(name = "return")
    protected List<ConsistencyGroupStatistics> _return;

    public GetSpecificGroupsStatisticsResponse() {
    }

    public GetSpecificGroupsStatisticsResponse(List<ConsistencyGroupStatistics> _return) {
        this._return = _return;
    }


    public List<ConsistencyGroupStatistics> getReturn() {
        if (this._return == null) {
            this._return = new ArrayList();
        }
        return this._return;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSpecificGroupsStatisticsResponse)) {
            return false;
        }
        GetSpecificGroupsStatisticsResponse otherObj = (GetSpecificGroupsStatisticsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSpecificGroupsStatisticsResponse [_return=" + this._return + "]";
    }
}


