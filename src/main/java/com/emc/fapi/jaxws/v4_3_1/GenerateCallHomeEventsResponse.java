package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generateCallHomeEventsResponse", propOrder = {"_return"})
public class GenerateCallHomeEventsResponse {
    @XmlElement(name = "return")
    protected CallHomeEvents _return;

    public GenerateCallHomeEventsResponse() {
    }

    public GenerateCallHomeEventsResponse(CallHomeEvents _return) {
        this._return = _return;
    }


    public CallHomeEvents getReturn() {
        return this._return;
    }


    public void setReturn(CallHomeEvents value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GenerateCallHomeEventsResponse)) {
            return false;
        }
        GenerateCallHomeEventsResponse otherObj = (GenerateCallHomeEventsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GenerateCallHomeEventsResponse [_return=" + this._return + "]";
    }
}


