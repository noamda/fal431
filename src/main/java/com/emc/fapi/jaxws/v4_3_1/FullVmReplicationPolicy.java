package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullVmReplicationPolicy", propOrder = {"vmUID", "vmReplicationPolicy"})
public class FullVmReplicationPolicy {
    @XmlElement(required = true, nillable = true)
    protected VmUID vmUID;
    @XmlElement(required = true, nillable = true)
    protected VmReplicationPolicy vmReplicationPolicy;

    public FullVmReplicationPolicy() {
    }

    public FullVmReplicationPolicy(VmUID vmUID, VmReplicationPolicy vmReplicationPolicy) {
        this.vmUID = vmUID;
        this.vmReplicationPolicy = vmReplicationPolicy;
    }


    public VmUID getVmUID() {
        return this.vmUID;
    }


    public void setVmUID(VmUID value) {
        this.vmUID = value;
    }


    public VmReplicationPolicy getVmReplicationPolicy() {
        return this.vmReplicationPolicy;
    }


    public void setVmReplicationPolicy(VmReplicationPolicy value) {
        this.vmReplicationPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FullVmReplicationPolicy)) {
            return false;
        }
        FullVmReplicationPolicy otherObj = (FullVmReplicationPolicy) obj;

        return (this.vmUID != null ? this.vmUID.equals(otherObj.vmUID) : this.vmUID == otherObj.vmUID) && (this.vmReplicationPolicy != null ? this.vmReplicationPolicy.equals(otherObj.vmReplicationPolicy) : this.vmReplicationPolicy == otherObj.vmReplicationPolicy);
    }


    public int hashCode() {
        return (this.vmUID != null ? this.vmUID.hashCode() : 0) ^ (this.vmReplicationPolicy != null ? this.vmReplicationPolicy.hashCode() : 0);
    }


    public String toString() {
        return "FullVmReplicationPolicy [vmUID=" + this.vmUID + ", " + "vmReplicationPolicy=" + this.vmReplicationPolicy + "]";
    }
}


