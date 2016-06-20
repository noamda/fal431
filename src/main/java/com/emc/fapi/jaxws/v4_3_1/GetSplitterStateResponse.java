package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSplitterStateResponse", propOrder = {"_return"})
public class GetSplitterStateResponse {
    @XmlElement(name = "return")
    protected SplitterState _return;

    public GetSplitterStateResponse() {
    }

    public GetSplitterStateResponse(SplitterState _return) {
        this._return = _return;
    }


    public SplitterState getReturn() {
        return this._return;
    }


    public void setReturn(SplitterState value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSplitterStateResponse)) {
            return false;
        }
        GetSplitterStateResponse otherObj = (GetSplitterStateResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSplitterStateResponse [_return=" + this._return + "]";
    }
}


