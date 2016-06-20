package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReplicationSetNameResponse", propOrder = {"_return"})
public class GetReplicationSetNameResponse {
    @XmlElement(name = "return")
    protected String _return;

    public GetReplicationSetNameResponse() {
    }

    public GetReplicationSetNameResponse(String _return) {
        this._return = _return;
    }


    public String getReturn() {
        return this._return;
    }


    public void setReturn(String value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetReplicationSetNameResponse)) {
            return false;
        }
        GetReplicationSetNameResponse otherObj = (GetReplicationSetNameResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetReplicationSetNameResponse [_return=" + this._return + "]";
    }
}


