package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRecoverPointClustersInformationResponse", propOrder = {"_return"})
public class GetRecoverPointClustersInformationResponse {
    @XmlElement(name = "return")
    protected RecoverPointClustersInformation _return;

    public GetRecoverPointClustersInformationResponse() {
    }

    public GetRecoverPointClustersInformationResponse(RecoverPointClustersInformation _return) {
        this._return = _return;
    }


    public RecoverPointClustersInformation getReturn() {
        return this._return;
    }


    public void setReturn(RecoverPointClustersInformation value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetRecoverPointClustersInformationResponse)) {
            return false;
        }
        GetRecoverPointClustersInformationResponse otherObj = (GetRecoverPointClustersInformationResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetRecoverPointClustersInformationResponse [_return=" + this._return + "]";
    }
}


