package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDisksReplicationPolicyParam", propOrder = {"vmReplicationSetUID", "virtualDisksReplicationPolicy"})
public class VirtualDisksReplicationPolicyParam {
    @XmlElement(required = true, nillable = true)
    protected VmReplicationSetUID vmReplicationSetUID;
    @XmlElement(required = true, nillable = true)
    protected VirtualDisksReplicationPolicy virtualDisksReplicationPolicy;

    public VirtualDisksReplicationPolicyParam() {
    }

    public VirtualDisksReplicationPolicyParam(VmReplicationSetUID vmReplicationSetUID, VirtualDisksReplicationPolicy virtualDisksReplicationPolicy) {
        this.vmReplicationSetUID = vmReplicationSetUID;
        this.virtualDisksReplicationPolicy = virtualDisksReplicationPolicy;
    }


    public VmReplicationSetUID getVmReplicationSetUID() {
        return this.vmReplicationSetUID;
    }


    public void setVmReplicationSetUID(VmReplicationSetUID value) {
        this.vmReplicationSetUID = value;
    }


    public VirtualDisksReplicationPolicy getVirtualDisksReplicationPolicy() {
        return this.virtualDisksReplicationPolicy;
    }


    public void setVirtualDisksReplicationPolicy(VirtualDisksReplicationPolicy value) {
        this.virtualDisksReplicationPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VirtualDisksReplicationPolicyParam)) {
            return false;
        }
        VirtualDisksReplicationPolicyParam otherObj = (VirtualDisksReplicationPolicyParam) obj;

        return (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.equals(otherObj.vmReplicationSetUID) : this.vmReplicationSetUID == otherObj.vmReplicationSetUID) && (this.virtualDisksReplicationPolicy != null ? this.virtualDisksReplicationPolicy.equals(otherObj.virtualDisksReplicationPolicy) : this.virtualDisksReplicationPolicy == otherObj.virtualDisksReplicationPolicy);
    }


    public int hashCode() {
        return (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.hashCode() : 0) ^ (this.virtualDisksReplicationPolicy != null ? this.virtualDisksReplicationPolicy.hashCode() : 0);
    }


    public String toString() {
        return "VirtualDisksReplicationPolicyParam [vmReplicationSetUID=" + this.vmReplicationSetUID + ", " + "virtualDisksReplicationPolicy=" + this.virtualDisksReplicationPolicy + "]";
    }
}


