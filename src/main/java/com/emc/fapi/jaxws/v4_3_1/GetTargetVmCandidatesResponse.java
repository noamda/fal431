package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTargetVmCandidatesResponse", propOrder = {"_return"})
public class GetTargetVmCandidatesResponse {
    @XmlElement(name = "return")
    protected TargetVmCandidates _return;

    public GetTargetVmCandidatesResponse() {
    }

    public GetTargetVmCandidatesResponse(TargetVmCandidates _return) {
        this._return = _return;
    }


    public TargetVmCandidates getReturn() {
        return this._return;
    }


    public void setReturn(TargetVmCandidates value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetTargetVmCandidatesResponse)) {
            return false;
        }
        GetTargetVmCandidatesResponse otherObj = (GetTargetVmCandidatesResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetTargetVmCandidatesResponse [_return=" + this._return + "]";
    }
}


