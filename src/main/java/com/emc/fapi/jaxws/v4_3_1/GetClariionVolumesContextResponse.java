package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClariionVolumesContextResponse", propOrder = {"_return"})
public class GetClariionVolumesContextResponse {
    @XmlElement(name = "return")
    protected ClariionVolumesContext _return;

    public GetClariionVolumesContextResponse() {
    }

    public GetClariionVolumesContextResponse(ClariionVolumesContext _return) {
        this._return = _return;
    }


    public ClariionVolumesContext getReturn() {
        return this._return;
    }


    public void setReturn(ClariionVolumesContext value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetClariionVolumesContextResponse)) {
            return false;
        }
        GetClariionVolumesContextResponse otherObj = (GetClariionVolumesContextResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetClariionVolumesContextResponse [_return=" + this._return + "]";
    }
}


