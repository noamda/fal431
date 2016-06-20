package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMReplicationSetParam", propOrder = {"replicationSetVms", "virtualHardwareReplicationPolicy", "virtualDisksReplicationPolicy"})
public class VMReplicationSetParam {
    @XmlElement(required = true)
    protected List<ReplicatedVMParams> replicationSetVms;
    @XmlElement(required = true, nillable = true)
    protected VirtualHardwareReplicationPolicy virtualHardwareReplicationPolicy;
    @XmlElement(required = true, nillable = true)
    protected VirtualDisksReplicationPolicy virtualDisksReplicationPolicy;

    public VMReplicationSetParam() {
    }

    public VMReplicationSetParam(List<ReplicatedVMParams> replicationSetVms, VirtualHardwareReplicationPolicy virtualHardwareReplicationPolicy, VirtualDisksReplicationPolicy virtualDisksReplicationPolicy) {
        this.replicationSetVms = replicationSetVms;
        this.virtualHardwareReplicationPolicy = virtualHardwareReplicationPolicy;
        this.virtualDisksReplicationPolicy = virtualDisksReplicationPolicy;
    }


    public List<ReplicatedVMParams> getReplicationSetVms() {
        if (this.replicationSetVms == null) {
            this.replicationSetVms = new ArrayList();
        }
        return this.replicationSetVms;
    }


    public VirtualHardwareReplicationPolicy getVirtualHardwareReplicationPolicy() {
        return this.virtualHardwareReplicationPolicy;
    }


    public void setVirtualHardwareReplicationPolicy(VirtualHardwareReplicationPolicy value) {
        this.virtualHardwareReplicationPolicy = value;
    }


    public VirtualDisksReplicationPolicy getVirtualDisksReplicationPolicy() {
        return this.virtualDisksReplicationPolicy;
    }


    public void setVirtualDisksReplicationPolicy(VirtualDisksReplicationPolicy value) {
        this.virtualDisksReplicationPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VMReplicationSetParam)) {
            return false;
        }
        VMReplicationSetParam otherObj = (VMReplicationSetParam) obj;

        return (this.replicationSetVms != null ? this.replicationSetVms.equals(otherObj.replicationSetVms) : this.replicationSetVms == otherObj.replicationSetVms) && (this.virtualHardwareReplicationPolicy != null ? this.virtualHardwareReplicationPolicy.equals(otherObj.virtualHardwareReplicationPolicy) : this.virtualHardwareReplicationPolicy == otherObj.virtualHardwareReplicationPolicy) && (this.virtualDisksReplicationPolicy != null ? this.virtualDisksReplicationPolicy.equals(otherObj.virtualDisksReplicationPolicy) : this.virtualDisksReplicationPolicy == otherObj.virtualDisksReplicationPolicy);
    }


    public int hashCode() {
        return (this.replicationSetVms != null ? this.replicationSetVms.hashCode() : 0) ^ (this.virtualHardwareReplicationPolicy != null ? this.virtualHardwareReplicationPolicy.hashCode() : 0) ^ (this.virtualDisksReplicationPolicy != null ? this.virtualDisksReplicationPolicy.hashCode() : 0);
    }


    public String toString() {
        return "VMReplicationSetParam [replicationSetVms=" + this.replicationSetVms + ", " + "virtualHardwareReplicationPolicy=" + this.virtualHardwareReplicationPolicy + ", " + "virtualDisksReplicationPolicy=" + this.virtualDisksReplicationPolicy + "]";
    }
}


