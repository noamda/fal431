package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCurrentUserEventLogsFilterResponse", propOrder = {"_return"})
public class GetCurrentUserEventLogsFilterResponse {
    @XmlElement(name = "return")
    protected UserEventLogsFilter _return;

    public GetCurrentUserEventLogsFilterResponse() {
    }

    public GetCurrentUserEventLogsFilterResponse(UserEventLogsFilter _return) {
        this._return = _return;
    }


    public UserEventLogsFilter getReturn() {
        return this._return;
    }


    public void setReturn(UserEventLogsFilter value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetCurrentUserEventLogsFilterResponse)) {
            return false;
        }
        GetCurrentUserEventLogsFilterResponse otherObj = (GetCurrentUserEventLogsFilterResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetCurrentUserEventLogsFilterResponse [_return=" + this._return + "]";
    }
}


