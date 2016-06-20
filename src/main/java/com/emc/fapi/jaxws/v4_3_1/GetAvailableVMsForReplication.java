package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableVMsForReplication", propOrder = {"replicationTarget"})
public class GetAvailableVMsForReplication {
    protected VmReplicationTarget replicationTarget;

    public GetAvailableVMsForReplication() {
    }

    public GetAvailableVMsForReplication(VmReplicationTarget replicationTarget) {
        this.replicationTarget = replicationTarget;
    }


    public VmReplicationTarget getReplicationTarget() {
        return this.replicationTarget;
    }


    public void setReplicationTarget(VmReplicationTarget value) {
        this.replicationTarget = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetAvailableVMsForReplication)) {
            return false;
        }
        GetAvailableVMsForReplication otherObj = (GetAvailableVMsForReplication) obj;

        return this.replicationTarget == otherObj.replicationTarget ? true : this.replicationTarget != null ? this.replicationTarget.equals(otherObj.replicationTarget) : false;
    }


    public int hashCode() {
        return this.replicationTarget != null ? this.replicationTarget.hashCode() : 0;
    }


    public String toString() {
        return "GetAvailableVMsForReplication [replicationTarget=" + this.replicationTarget + "]";
    }
}


