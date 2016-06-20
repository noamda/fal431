package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserDefinedPropertiesResponse", propOrder = {"_return"})
public class GetUserDefinedPropertiesResponse {
    @XmlElement(name = "return")
    protected UserDefinedProperties _return;

    public GetUserDefinedPropertiesResponse() {
    }

    public GetUserDefinedPropertiesResponse(UserDefinedProperties _return) {
        this._return = _return;
    }


    public UserDefinedProperties getReturn() {
        return this._return;
    }


    public void setReturn(UserDefinedProperties value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetUserDefinedPropertiesResponse)) {
            return false;
        }
        GetUserDefinedPropertiesResponse otherObj = (GetUserDefinedPropertiesResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetUserDefinedPropertiesResponse [_return=" + this._return + "]";
    }
}


