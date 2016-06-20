package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGroupStateResponse", propOrder = {"_return"})
public class GetGroupStateResponse {
    @XmlElement(name = "return")
    protected ConsistencyGroupState _return;

    public GetGroupStateResponse() {
    }

    public GetGroupStateResponse(ConsistencyGroupState _return) {
        this._return = _return;
    }


    public ConsistencyGroupState getReturn() {
        return this._return;
    }


    public void setReturn(ConsistencyGroupState value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetGroupStateResponse)) {
            return false;
        }
        GetGroupStateResponse otherObj = (GetGroupStateResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetGroupStateResponse [_return=" + this._return + "]";
    }
}


