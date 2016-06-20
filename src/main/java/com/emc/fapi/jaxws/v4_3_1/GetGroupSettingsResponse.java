package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGroupSettingsResponse", propOrder = {"_return"})
public class GetGroupSettingsResponse {
    @XmlElement(name = "return")
    protected ConsistencyGroupSettings _return;

    public GetGroupSettingsResponse() {
    }

    public GetGroupSettingsResponse(ConsistencyGroupSettings _return) {
        this._return = _return;
    }


    public ConsistencyGroupSettings getReturn() {
        return this._return;
    }


    public void setReturn(ConsistencyGroupSettings value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetGroupSettingsResponse)) {
            return false;
        }
        GetGroupSettingsResponse otherObj = (GetGroupSettingsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetGroupSettingsResponse [_return=" + this._return + "]";
    }
}


