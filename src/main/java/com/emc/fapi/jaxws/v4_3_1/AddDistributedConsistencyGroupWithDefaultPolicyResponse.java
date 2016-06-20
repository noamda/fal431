package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addDistributedConsistencyGroupWithDefaultPolicyResponse", propOrder = {"_return"})
public class AddDistributedConsistencyGroupWithDefaultPolicyResponse {
    @XmlElement(name = "return")
    protected ConsistencyGroupUID _return;

    public AddDistributedConsistencyGroupWithDefaultPolicyResponse() {
    }

    public AddDistributedConsistencyGroupWithDefaultPolicyResponse(ConsistencyGroupUID _return) {
        this._return = _return;
    }


    public ConsistencyGroupUID getReturn() {
        return this._return;
    }


    public void setReturn(ConsistencyGroupUID value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddDistributedConsistencyGroupWithDefaultPolicyResponse)) {
            return false;
        }
        AddDistributedConsistencyGroupWithDefaultPolicyResponse otherObj = (AddDistributedConsistencyGroupWithDefaultPolicyResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "AddDistributedConsistencyGroupWithDefaultPolicyResponse [_return=" + this._return + "]";
    }
}


