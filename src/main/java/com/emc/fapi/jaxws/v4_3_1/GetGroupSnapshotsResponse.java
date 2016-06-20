package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGroupSnapshotsResponse", propOrder = {"_return"})
public class GetGroupSnapshotsResponse {
    @XmlElement(name = "return")
    protected ConsistencyGroupSnapshots _return;

    public GetGroupSnapshotsResponse() {
    }

    public GetGroupSnapshotsResponse(ConsistencyGroupSnapshots _return) {
        this._return = _return;
    }


    public ConsistencyGroupSnapshots getReturn() {
        return this._return;
    }


    public void setReturn(ConsistencyGroupSnapshots value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetGroupSnapshotsResponse)) {
            return false;
        }
        GetGroupSnapshotsResponse otherObj = (GetGroupSnapshotsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetGroupSnapshotsResponse [_return=" + this._return + "]";
    }
}


