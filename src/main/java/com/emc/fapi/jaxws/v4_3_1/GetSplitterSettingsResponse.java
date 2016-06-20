package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSplitterSettingsResponse", propOrder = {"_return"})
public class GetSplitterSettingsResponse {
    @XmlElement(name = "return")
    protected SplitterSettings _return;

    public GetSplitterSettingsResponse() {
    }

    public GetSplitterSettingsResponse(SplitterSettings _return) {
        this._return = _return;
    }


    public SplitterSettings getReturn() {
        return this._return;
    }


    public void setReturn(SplitterSettings value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSplitterSettingsResponse)) {
            return false;
        }
        GetSplitterSettingsResponse otherObj = (GetSplitterSettingsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSplitterSettingsResponse [_return=" + this._return + "]";
    }
}


