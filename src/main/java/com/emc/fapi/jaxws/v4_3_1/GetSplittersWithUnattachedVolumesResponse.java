package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSplittersWithUnattachedVolumesResponse", propOrder = {"_return"})
public class GetSplittersWithUnattachedVolumesResponse {
    @XmlElement(name = "return")
    protected List<SplitterUID> _return;

    public GetSplittersWithUnattachedVolumesResponse() {
    }

    public GetSplittersWithUnattachedVolumesResponse(List<SplitterUID> _return) {
        this._return = _return;
    }


    public List<SplitterUID> getReturn() {
        if (this._return == null) {
            this._return = new ArrayList();
        }
        return this._return;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSplittersWithUnattachedVolumesResponse)) {
            return false;
        }
        GetSplittersWithUnattachedVolumesResponse otherObj = (GetSplittersWithUnattachedVolumesResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSplittersWithUnattachedVolumesResponse [_return=" + this._return + "]";
    }
}


