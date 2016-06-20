package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullVmReplicationSetPolicy", propOrder = {"vmReplicationSetUID", "vmReplicationSetPolicy", "vmReplicationPolicies"})
public class FullVmReplicationSetPolicy {
    @XmlElement(required = true, nillable = true)
    protected VmReplicationSetUID vmReplicationSetUID;
    @XmlElement(required = true, nillable = true)
    protected VmReplicationSetPolicy vmReplicationSetPolicy;
    @XmlElement(required = true)
    protected List<FullVmReplicationPolicy> vmReplicationPolicies;

    public FullVmReplicationSetPolicy() {
    }

    public FullVmReplicationSetPolicy(VmReplicationSetUID vmReplicationSetUID, VmReplicationSetPolicy vmReplicationSetPolicy, List<FullVmReplicationPolicy> vmReplicationPolicies) {
        this.vmReplicationSetUID = vmReplicationSetUID;
        this.vmReplicationSetPolicy = vmReplicationSetPolicy;
        this.vmReplicationPolicies = vmReplicationPolicies;
    }


    public VmReplicationSetUID getVmReplicationSetUID() {
        return this.vmReplicationSetUID;
    }


    public void setVmReplicationSetUID(VmReplicationSetUID value) {
        this.vmReplicationSetUID = value;
    }


    public VmReplicationSetPolicy getVmReplicationSetPolicy() {
        return this.vmReplicationSetPolicy;
    }


    public void setVmReplicationSetPolicy(VmReplicationSetPolicy value) {
        this.vmReplicationSetPolicy = value;
    }


    public List<FullVmReplicationPolicy> getVmReplicationPolicies() {
        if (this.vmReplicationPolicies == null) {
            this.vmReplicationPolicies = new ArrayList();
        }
        return this.vmReplicationPolicies;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FullVmReplicationSetPolicy)) {
            return false;
        }
        FullVmReplicationSetPolicy otherObj = (FullVmReplicationSetPolicy) obj;

        return (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.equals(otherObj.vmReplicationSetUID) : this.vmReplicationSetUID == otherObj.vmReplicationSetUID) && (this.vmReplicationSetPolicy != null ? this.vmReplicationSetPolicy.equals(otherObj.vmReplicationSetPolicy) : this.vmReplicationSetPolicy == otherObj.vmReplicationSetPolicy) && (this.vmReplicationPolicies != null ? this.vmReplicationPolicies.equals(otherObj.vmReplicationPolicies) : this.vmReplicationPolicies == otherObj.vmReplicationPolicies);
    }


    public int hashCode() {
        return (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.hashCode() : 0) ^ (this.vmReplicationSetPolicy != null ? this.vmReplicationSetPolicy.hashCode() : 0) ^ (this.vmReplicationPolicies != null ? this.vmReplicationPolicies.hashCode() : 0);
    }


    public String toString() {
        return "FullVmReplicationSetPolicy [vmReplicationSetUID=" + this.vmReplicationSetUID + ", " + "vmReplicationSetPolicy=" + this.vmReplicationSetPolicy + ", " + "vmReplicationPolicies=" + this.vmReplicationPolicies + "]";
    }
}


