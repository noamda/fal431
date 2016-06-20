package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIsTrialVersionResponse", propOrder = {"_return"})
public class GetIsTrialVersionResponse {
    @XmlElement(name = "return")
    protected boolean _return;

    public GetIsTrialVersionResponse() {
    }

    public GetIsTrialVersionResponse(boolean _return) {
        this._return = _return;
    }


    public boolean isReturn() {
        return this._return;
    }


    public void setReturn(boolean value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetIsTrialVersionResponse)) {
            return false;
        }
        GetIsTrialVersionResponse otherObj = (GetIsTrialVersionResponse) obj;

        return this._return == otherObj._return;
    }


    public int hashCode() {
        return this._return ? 1 : 0;
    }


    public String toString() {
        return "GetIsTrialVersionResponse [_return=" + this._return + "]";
    }
}


