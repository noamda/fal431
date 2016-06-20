package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSplitterSANViewResponse", propOrder = {"_return"})
public class GetSplitterSANViewResponse {
    @XmlElement(name = "return")
    protected SplitterSANView _return;

    public GetSplitterSANViewResponse() {
    }

    public GetSplitterSANViewResponse(SplitterSANView _return) {
        this._return = _return;
    }


    public SplitterSANView getReturn() {
        return this._return;
    }


    public void setReturn(SplitterSANView value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSplitterSANViewResponse)) {
            return false;
        }
        GetSplitterSANViewResponse otherObj = (GetSplitterSANViewResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSplitterSANViewResponse [_return=" + this._return + "]";
    }
}


