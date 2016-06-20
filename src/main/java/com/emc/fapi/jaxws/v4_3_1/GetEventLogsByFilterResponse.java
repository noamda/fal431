package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEventLogsByFilterResponse", propOrder = {"_return"})
public class GetEventLogsByFilterResponse {
    @XmlElement(name = "return")
    protected SystemEventLogs _return;

    public GetEventLogsByFilterResponse() {
    }

    public GetEventLogsByFilterResponse(SystemEventLogs _return) {
        this._return = _return;
    }


    public SystemEventLogs getReturn() {
        return this._return;
    }


    public void setReturn(SystemEventLogs value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetEventLogsByFilterResponse)) {
            return false;
        }
        GetEventLogsByFilterResponse otherObj = (GetEventLogsByFilterResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetEventLogsByFilterResponse [_return=" + this._return + "]";
    }
}


