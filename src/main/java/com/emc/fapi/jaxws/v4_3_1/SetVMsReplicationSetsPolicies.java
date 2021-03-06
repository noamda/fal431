package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setVMsReplicationSetsPolicies", propOrder = {"group", "vmReplicationSetsPolicies"})
public class SetVMsReplicationSetsPolicies {
    protected ConsistencyGroupUID group;
    protected List<FullVmReplicationSetPolicy> vmReplicationSetsPolicies;

    public SetVMsReplicationSetsPolicies() {
    }

    public SetVMsReplicationSetsPolicies(ConsistencyGroupUID group, List<FullVmReplicationSetPolicy> vmReplicationSetsPolicies) {
        this.group = group;
        this.vmReplicationSetsPolicies = vmReplicationSetsPolicies;
    }


    public ConsistencyGroupUID getGroup() {
        return this.group;
    }


    public void setGroup(ConsistencyGroupUID value) {
        this.group = value;
    }


    public List<FullVmReplicationSetPolicy> getVmReplicationSetsPolicies() {
        if (this.vmReplicationSetsPolicies == null) {
            this.vmReplicationSetsPolicies = new ArrayList();
        }
        return this.vmReplicationSetsPolicies;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetVMsReplicationSetsPolicies)) {
            return false;
        }
        SetVMsReplicationSetsPolicies otherObj = (SetVMsReplicationSetsPolicies) obj;

        return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.vmReplicationSetsPolicies != null ? this.vmReplicationSetsPolicies.equals(otherObj.vmReplicationSetsPolicies) : this.vmReplicationSetsPolicies == otherObj.vmReplicationSetsPolicies);
    }


    public int hashCode() {
        return (this.group != null ? this.group.hashCode() : 0) ^ (this.vmReplicationSetsPolicies != null ? this.vmReplicationSetsPolicies.hashCode() : 0);
    }


    public String toString() {
        return "SetVMsReplicationSetsPolicies [group=" + this.group + ", " + "vmReplicationSetsPolicies=" + this.vmReplicationSetsPolicies + "]";
    }
}


