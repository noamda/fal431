package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getConsistencyGroupInformationResponse", propOrder = {"_return"})
public class GetConsistencyGroupInformationResponse {
    @XmlElement(name = "return")
    protected ConsistencyGroupInformation _return;

    public GetConsistencyGroupInformationResponse() {
    }

    public GetConsistencyGroupInformationResponse(ConsistencyGroupInformation _return) {
        this._return = _return;
    }


    public ConsistencyGroupInformation getReturn() {
        return this._return;
    }


    public void setReturn(ConsistencyGroupInformation value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetConsistencyGroupInformationResponse)) {
            return false;
        }
        GetConsistencyGroupInformationResponse otherObj = (GetConsistencyGroupInformationResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetConsistencyGroupInformationResponse [_return=" + this._return + "]";
    }
}


