package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addConsistencyGroupResponse", propOrder = {"_return"})
public class AddConsistencyGroupResponse {
    @XmlElement(name = "return")
    protected ConsistencyGroupUID _return;

    public AddConsistencyGroupResponse() {
    }

    public AddConsistencyGroupResponse(ConsistencyGroupUID _return) {
        this._return = _return;
    }


    public ConsistencyGroupUID getReturn() {
        return this._return;
    }


    public void setReturn(ConsistencyGroupUID value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddConsistencyGroupResponse)) {
            return false;
        }
        AddConsistencyGroupResponse otherObj = (AddConsistencyGroupResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "AddConsistencyGroupResponse [_return=" + this._return + "]";
    }
}


