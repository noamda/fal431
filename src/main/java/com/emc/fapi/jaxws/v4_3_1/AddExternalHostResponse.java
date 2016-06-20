package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addExternalHostResponse", propOrder = {"_return"})
public class AddExternalHostResponse {
    @XmlElement(name = "return")
    protected ExternalHostUID _return;

    public AddExternalHostResponse() {
    }

    public AddExternalHostResponse(ExternalHostUID _return) {
        this._return = _return;
    }


    public ExternalHostUID getReturn() {
        return this._return;
    }


    public void setReturn(ExternalHostUID value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddExternalHostResponse)) {
            return false;
        }
        AddExternalHostResponse otherObj = (AddExternalHostResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "AddExternalHostResponse [_return=" + this._return + "]";
    }
}


