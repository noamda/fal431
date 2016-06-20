package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGroupVolumeStatesResponse", propOrder = {"_return"})
public class GetGroupVolumeStatesResponse {
    @XmlElement(name = "return")
    protected ConsistencyGroupVolumesState _return;

    public GetGroupVolumeStatesResponse() {
    }

    public GetGroupVolumeStatesResponse(ConsistencyGroupVolumesState _return) {
        this._return = _return;
    }


    public ConsistencyGroupVolumesState getReturn() {
        return this._return;
    }


    public void setReturn(ConsistencyGroupVolumesState value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetGroupVolumeStatesResponse)) {
            return false;
        }
        GetGroupVolumeStatesResponse otherObj = (GetGroupVolumeStatesResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetGroupVolumeStatesResponse [_return=" + this._return + "]";
    }
}


