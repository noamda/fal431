package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFullRecoverPointSettingsContextResponse", propOrder = {"_return"})
public class GetFullRecoverPointSettingsContextResponse {
    @XmlElement(name = "return")
    protected FullRecoverPointSettingsContext _return;

    public GetFullRecoverPointSettingsContextResponse() {
    }

    public GetFullRecoverPointSettingsContextResponse(FullRecoverPointSettingsContext _return) {
        this._return = _return;
    }


    public FullRecoverPointSettingsContext getReturn() {
        return this._return;
    }


    public void setReturn(FullRecoverPointSettingsContext value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetFullRecoverPointSettingsContextResponse)) {
            return false;
        }
        GetFullRecoverPointSettingsContextResponse otherObj = (GetFullRecoverPointSettingsContextResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetFullRecoverPointSettingsContextResponse [_return=" + this._return + "]";
    }
}


