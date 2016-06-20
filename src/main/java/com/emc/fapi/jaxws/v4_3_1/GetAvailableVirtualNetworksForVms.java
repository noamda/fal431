package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableVirtualNetworksForVms", propOrder = {"vmUids"})
public class GetAvailableVirtualNetworksForVms {
    protected List<VmUID> vmUids;

    public GetAvailableVirtualNetworksForVms() {
    }

    public GetAvailableVirtualNetworksForVms(List<VmUID> vmUids) {
        this.vmUids = vmUids;
    }


    public List<VmUID> getVmUids() {
        if (this.vmUids == null) {
            this.vmUids = new ArrayList();
        }
        return this.vmUids;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetAvailableVirtualNetworksForVms)) {
            return false;
        }
        GetAvailableVirtualNetworksForVms otherObj = (GetAvailableVirtualNetworksForVms) obj;

        return this.vmUids == otherObj.vmUids ? true : this.vmUids != null ? this.vmUids.equals(otherObj.vmUids) : false;
    }


    public int hashCode() {
        return this.vmUids != null ? this.vmUids.hashCode() : 0;
    }


    public String toString() {
        return "GetAvailableVirtualNetworksForVms [vmUids=" + this.vmUids + "]";
    }
}


