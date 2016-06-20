package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCurrentTimeResponse", propOrder = {"_return"})
public class GetCurrentTimeResponse {
    @XmlElement(name = "return")
    protected RecoverPointTimeStamp _return;

    public GetCurrentTimeResponse() {
    }

    public GetCurrentTimeResponse(RecoverPointTimeStamp _return) {
        this._return = _return;
    }


    public RecoverPointTimeStamp getReturn() {
        return this._return;
    }


    public void setReturn(RecoverPointTimeStamp value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetCurrentTimeResponse)) {
            return false;
        }
        GetCurrentTimeResponse otherObj = (GetCurrentTimeResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetCurrentTimeResponse [_return=" + this._return + "]";
    }
}


