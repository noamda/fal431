package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVmReplicationCandidateClustersResponse", propOrder = {"_return"})
public class GetVmReplicationCandidateClustersResponse {
    @XmlElement(name = "return")
    protected VmReplicationCandidateClusters _return;

    public GetVmReplicationCandidateClustersResponse() {
    }

    public GetVmReplicationCandidateClustersResponse(VmReplicationCandidateClusters _return) {
        this._return = _return;
    }


    public VmReplicationCandidateClusters getReturn() {
        return this._return;
    }


    public void setReturn(VmReplicationCandidateClusters value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVmReplicationCandidateClustersResponse)) {
            return false;
        }
        GetVmReplicationCandidateClustersResponse otherObj = (GetVmReplicationCandidateClustersResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetVmReplicationCandidateClustersResponse [_return=" + this._return + "]";
    }
}


