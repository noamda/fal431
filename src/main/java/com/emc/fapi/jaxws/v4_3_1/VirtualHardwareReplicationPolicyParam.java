package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualHardwareReplicationPolicyParam", propOrder = {"vmReplicationSetUID", "virtualDisksReplicationPolicy"})
public class VirtualHardwareReplicationPolicyParam {
    @XmlElement(required = true, nillable = true)
    protected VmReplicationSetUID vmReplicationSetUID;
    @XmlElement(required = true, nillable = true)
    protected VirtualHardwareReplicationPolicy virtualDisksReplicationPolicy;

    public VirtualHardwareReplicationPolicyParam() {
    }

    public VirtualHardwareReplicationPolicyParam(VmReplicationSetUID vmReplicationSetUID, VirtualHardwareReplicationPolicy virtualDisksReplicationPolicy) {
        this.vmReplicationSetUID = vmReplicationSetUID;
        this.virtualDisksReplicationPolicy = virtualDisksReplicationPolicy;
    }


    public VmReplicationSetUID getVmReplicationSetUID() {
        return this.vmReplicationSetUID;
    }


    public void setVmReplicationSetUID(VmReplicationSetUID value) {
        this.vmReplicationSetUID = value;
    }


    public VirtualHardwareReplicationPolicy getVirtualDisksReplicationPolicy() {
        return this.virtualDisksReplicationPolicy;
    }


    public void setVirtualDisksReplicationPolicy(VirtualHardwareReplicationPolicy value) {
        this.virtualDisksReplicationPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VirtualHardwareReplicationPolicyParam)) {
            return false;
        }
        VirtualHardwareReplicationPolicyParam otherObj = (VirtualHardwareReplicationPolicyParam) obj;

        return (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.equals(otherObj.vmReplicationSetUID) : this.vmReplicationSetUID == otherObj.vmReplicationSetUID) && (this.virtualDisksReplicationPolicy != null ? this.virtualDisksReplicationPolicy.equals(otherObj.virtualDisksReplicationPolicy) : this.virtualDisksReplicationPolicy == otherObj.virtualDisksReplicationPolicy);
    }


    public int hashCode() {
        return (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.hashCode() : 0) ^ (this.virtualDisksReplicationPolicy != null ? this.virtualDisksReplicationPolicy.hashCode() : 0);
    }


    public String toString() {
        return "VirtualHardwareReplicationPolicyParam [vmReplicationSetUID=" + this.vmReplicationSetUID + ", " + "virtualDisksReplicationPolicy=" + this.virtualDisksReplicationPolicy + "]";
    }
}


