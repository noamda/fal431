package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSplittersStateFromAllClustersResponse", propOrder = {"_return"})
public class GetSplittersStateFromAllClustersResponse {
    @XmlElement(name = "return")
    protected List<ClusterSplittersState> _return;

    public GetSplittersStateFromAllClustersResponse() {
    }

    public GetSplittersStateFromAllClustersResponse(List<ClusterSplittersState> _return) {
        this._return = _return;
    }


    public List<ClusterSplittersState> getReturn() {
        if (this._return == null) {
            this._return = new ArrayList();
        }
        return this._return;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSplittersStateFromAllClustersResponse)) {
            return false;
        }
        GetSplittersStateFromAllClustersResponse otherObj = (GetSplittersStateFromAllClustersResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSplittersStateFromAllClustersResponse [_return=" + this._return + "]";
    }
}


