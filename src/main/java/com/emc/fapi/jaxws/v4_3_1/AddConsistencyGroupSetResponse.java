package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addConsistencyGroupSetResponse", propOrder = {"_return"})
public class AddConsistencyGroupSetResponse {
    @XmlElement(name = "return")
    protected ConsistencyGroupSetUID _return;

    public AddConsistencyGroupSetResponse() {
    }

    public AddConsistencyGroupSetResponse(ConsistencyGroupSetUID _return) {
        this._return = _return;
    }


    public ConsistencyGroupSetUID getReturn() {
        return this._return;
    }


    public void setReturn(ConsistencyGroupSetUID value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddConsistencyGroupSetResponse)) {
            return false;
        }
        AddConsistencyGroupSetResponse otherObj = (AddConsistencyGroupSetResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "AddConsistencyGroupSetResponse [_return=" + this._return + "]";
    }
}


