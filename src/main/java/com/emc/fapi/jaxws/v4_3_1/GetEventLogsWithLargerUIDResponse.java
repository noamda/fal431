package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEventLogsWithLargerUIDResponse", propOrder = {"_return"})
public class GetEventLogsWithLargerUIDResponse {
    @XmlElement(name = "return")
    protected SystemEventLogs _return;

    public GetEventLogsWithLargerUIDResponse() {
    }

    public GetEventLogsWithLargerUIDResponse(SystemEventLogs _return) {
        this._return = _return;
    }


    public SystemEventLogs getReturn() {
        return this._return;
    }


    public void setReturn(SystemEventLogs value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetEventLogsWithLargerUIDResponse)) {
            return false;
        }
        GetEventLogsWithLargerUIDResponse otherObj = (GetEventLogsWithLargerUIDResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetEventLogsWithLargerUIDResponse [_return=" + this._return + "]";
    }
}


