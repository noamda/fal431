package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableVirtualNetworksForVm", propOrder = {"vmUid"})
public class GetAvailableVirtualNetworksForVm {
    @XmlElement(nillable = true)
    protected VmUID vmUid;

    public GetAvailableVirtualNetworksForVm() {
    }

    public GetAvailableVirtualNetworksForVm(VmUID vmUid) {
        this.vmUid = vmUid;
    }


    public VmUID getVmUid() {
        return this.vmUid;
    }


    public void setVmUid(VmUID value) {
        this.vmUid = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetAvailableVirtualNetworksForVm)) {
            return false;
        }
        GetAvailableVirtualNetworksForVm otherObj = (GetAvailableVirtualNetworksForVm) obj;

        return this.vmUid == otherObj.vmUid ? true : this.vmUid != null ? this.vmUid.equals(otherObj.vmUid) : false;
    }


    public int hashCode() {
        return this.vmUid != null ? this.vmUid.hashCode() : 0;
    }


    public String toString() {
        return "GetAvailableVirtualNetworksForVm [vmUid=" + this.vmUid + "]";
    }
}


