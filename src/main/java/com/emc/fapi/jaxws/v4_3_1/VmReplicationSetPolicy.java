package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmReplicationSetPolicy", propOrder = {"powerUpSequenceNumber", "critical", "virtualHardwareReplicationPolicy", "startUpActionsPolicy"})
public class VmReplicationSetPolicy {
    protected int powerUpSequenceNumber;
    protected boolean critical;
    @XmlElement(nillable = true)
    protected VirtualHardwareReplicationPolicy virtualHardwareReplicationPolicy;
    protected VmStartUpActionsPolicy startUpActionsPolicy;

    public VmReplicationSetPolicy() {
    }

    public VmReplicationSetPolicy(int powerUpSequenceNumber, boolean critical, VirtualHardwareReplicationPolicy virtualHardwareReplicationPolicy, VmStartUpActionsPolicy startUpActionsPolicy) {
        this.powerUpSequenceNumber = powerUpSequenceNumber;
        this.critical = critical;
        this.virtualHardwareReplicationPolicy = virtualHardwareReplicationPolicy;
        this.startUpActionsPolicy = startUpActionsPolicy;
    }


    public int getPowerUpSequenceNumber() {
        return this.powerUpSequenceNumber;
    }


    public void setPowerUpSequenceNumber(int value) {
        this.powerUpSequenceNumber = value;
    }


    public boolean isCritical() {
        return this.critical;
    }


    public void setCritical(boolean value) {
        this.critical = value;
    }


    public VirtualHardwareReplicationPolicy getVirtualHardwareReplicationPolicy() {
        return this.virtualHardwareReplicationPolicy;
    }


    public void setVirtualHardwareReplicationPolicy(VirtualHardwareReplicationPolicy value) {
        this.virtualHardwareReplicationPolicy = value;
    }


    public VmStartUpActionsPolicy getStartUpActionsPolicy() {
        return this.startUpActionsPolicy;
    }


    public void setStartUpActionsPolicy(VmStartUpActionsPolicy value) {
        this.startUpActionsPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmReplicationSetPolicy)) {
            return false;
        }
        VmReplicationSetPolicy otherObj = (VmReplicationSetPolicy) obj;

        return (this.powerUpSequenceNumber == otherObj.powerUpSequenceNumber) && (this.critical == otherObj.critical) && (this.virtualHardwareReplicationPolicy != null ? this.virtualHardwareReplicationPolicy.equals(otherObj.virtualHardwareReplicationPolicy) : this.virtualHardwareReplicationPolicy == otherObj.virtualHardwareReplicationPolicy) && (this.startUpActionsPolicy != null ? this.startUpActionsPolicy.equals(otherObj.startUpActionsPolicy) : this.startUpActionsPolicy == otherObj.startUpActionsPolicy);
    }


    public int hashCode() {
        return this.powerUpSequenceNumber ^ (this.critical ? 1 : 0) ^ (this.virtualHardwareReplicationPolicy != null ? this.virtualHardwareReplicationPolicy.hashCode() : 0) ^ (this.startUpActionsPolicy != null ? this.startUpActionsPolicy.hashCode() : 0);
    }


    public String toString() {
        return "VmReplicationSetPolicy [powerUpSequenceNumber=" + this.powerUpSequenceNumber + ", " + "critical=" + this.critical + ", " + "virtualHardwareReplicationPolicy=" + this.virtualHardwareReplicationPolicy + ", " + "startUpActionsPolicy=" + this.startUpActionsPolicy + "]";
    }
}


