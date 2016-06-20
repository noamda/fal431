package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGroupCopySnapshotsForTimeFrameAndNameResponse", propOrder = {"_return"})
public class GetGroupCopySnapshotsForTimeFrameAndNameResponse {
    @XmlElement(name = "return")
    protected ConsistencyGroupCopySnapshots _return;

    public GetGroupCopySnapshotsForTimeFrameAndNameResponse() {
    }

    public GetGroupCopySnapshotsForTimeFrameAndNameResponse(ConsistencyGroupCopySnapshots _return) {
        this._return = _return;
    }


    public ConsistencyGroupCopySnapshots getReturn() {
        return this._return;
    }


    public void setReturn(ConsistencyGroupCopySnapshots value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetGroupCopySnapshotsForTimeFrameAndNameResponse)) {
            return false;
        }
        GetGroupCopySnapshotsForTimeFrameAndNameResponse otherObj = (GetGroupCopySnapshotsForTimeFrameAndNameResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetGroupCopySnapshotsForTimeFrameAndNameResponse [_return=" + this._return + "]";
    }
}


