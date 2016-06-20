package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServerCharsetNameResponse", propOrder = {"_return"})
public class GetServerCharsetNameResponse {
    @XmlElement(name = "return")
    protected String _return;

    public GetServerCharsetNameResponse() {
    }

    public GetServerCharsetNameResponse(String _return) {
        this._return = _return;
    }


    public String getReturn() {
        return this._return;
    }


    public void setReturn(String value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetServerCharsetNameResponse)) {
            return false;
        }
        GetServerCharsetNameResponse otherObj = (GetServerCharsetNameResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetServerCharsetNameResponse [_return=" + this._return + "]";
    }
}


