package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCurrentUserInformationResponse", propOrder = {"_return"})
public class GetCurrentUserInformationResponse {
    @XmlElement(name = "return")
    protected UserInformation _return;

    public GetCurrentUserInformationResponse() {
    }

    public GetCurrentUserInformationResponse(UserInformation _return) {
        this._return = _return;
    }


    public UserInformation getReturn() {
        return this._return;
    }


    public void setReturn(UserInformation value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetCurrentUserInformationResponse)) {
            return false;
        }
        GetCurrentUserInformationResponse otherObj = (GetCurrentUserInformationResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetCurrentUserInformationResponse [_return=" + this._return + "]";
    }
}


