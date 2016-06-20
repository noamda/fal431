package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateReplicateVms", propOrder = {"vms"})
public class ValidateReplicateVms {
    protected ReplicateVmsParam vms;

    public ValidateReplicateVms() {
    }

    public ValidateReplicateVms(ReplicateVmsParam vms) {
        this.vms = vms;
    }


    public ReplicateVmsParam getVms() {
        return this.vms;
    }


    public void setVms(ReplicateVmsParam value) {
        this.vms = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateReplicateVms)) {
            return false;
        }
        ValidateReplicateVms otherObj = (ValidateReplicateVms) obj;

        return this.vms == otherObj.vms ? true : this.vms != null ? this.vms.equals(otherObj.vms) : false;
    }


    public int hashCode() {
        return this.vms != null ? this.vms.hashCode() : 0;
    }


    public String toString() {
        return "ValidateReplicateVms [vms=" + this.vms + "]";
    }
}


