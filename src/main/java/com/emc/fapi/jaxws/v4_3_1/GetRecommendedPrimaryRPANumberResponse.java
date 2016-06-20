package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRecommendedPrimaryRPANumberResponse", propOrder = {"_return"})
public class GetRecommendedPrimaryRPANumberResponse {
    @XmlElement(name = "return")
    protected Integer _return;

    public GetRecommendedPrimaryRPANumberResponse() {
    }

    public GetRecommendedPrimaryRPANumberResponse(Integer _return) {
        this._return = _return;
    }


    public Integer getReturn() {
        return this._return;
    }


    public void setReturn(Integer value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetRecommendedPrimaryRPANumberResponse)) {
            return false;
        }
        GetRecommendedPrimaryRPANumberResponse otherObj = (GetRecommendedPrimaryRPANumberResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetRecommendedPrimaryRPANumberResponse [_return=" + this._return + "]";
    }
}


