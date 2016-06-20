package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateVolumeSizeResponse", propOrder = {"_return"})
public class CalculateVolumeSizeResponse {
    @XmlElement(name = "return")
    protected Long _return;

    public CalculateVolumeSizeResponse() {
    }

    public CalculateVolumeSizeResponse(Long _return) {
        this._return = _return;
    }


    public Long getReturn() {
        return this._return;
    }


    public void setReturn(Long value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CalculateVolumeSizeResponse)) {
            return false;
        }
        CalculateVolumeSizeResponse otherObj = (CalculateVolumeSizeResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "CalculateVolumeSizeResponse [_return=" + this._return + "]";
    }
}


