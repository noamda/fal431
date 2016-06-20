package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskState", propOrder = {"capacity", "virtualDiskId", "replicationCapabilities"})
public class VirtualDiskState {
    protected long capacity;
    @XmlElement(nillable = true)
    protected VirtualDiskId virtualDiskId;
    protected VirtualDiskReplicationCapabilities replicationCapabilities;

    public VirtualDiskState() {
    }

    public VirtualDiskState(long capacity, VirtualDiskId virtualDiskId, VirtualDiskReplicationCapabilities replicationCapabilities) {
        this.capacity = capacity;
        this.virtualDiskId = virtualDiskId;
        this.replicationCapabilities = replicationCapabilities;
    }


    public long getCapacity() {
        return this.capacity;
    }


    public void setCapacity(long value) {
        this.capacity = value;
    }


    public VirtualDiskId getVirtualDiskId() {
        return this.virtualDiskId;
    }


    public void setVirtualDiskId(VirtualDiskId value) {
        this.virtualDiskId = value;
    }


    public VirtualDiskReplicationCapabilities getReplicationCapabilities() {
        return this.replicationCapabilities;
    }


    public void setReplicationCapabilities(VirtualDiskReplicationCapabilities value) {
        this.replicationCapabilities = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VirtualDiskState)) {
            return false;
        }
        VirtualDiskState otherObj = (VirtualDiskState) obj;

        return (this.capacity == otherObj.capacity) && (this.virtualDiskId != null ? this.virtualDiskId.equals(otherObj.virtualDiskId) : this.virtualDiskId == otherObj.virtualDiskId) && (this.replicationCapabilities != null ? this.replicationCapabilities.equals(otherObj.replicationCapabilities) : this.replicationCapabilities == otherObj.replicationCapabilities);
    }


    public int hashCode() {
        return (int) this.capacity ^ (this.virtualDiskId != null ? this.virtualDiskId.hashCode() : 0) ^ (this.replicationCapabilities != null ? this.replicationCapabilities.hashCode() : 0);
    }


    public String toString() {
        return "VirtualDiskState [capacity=" + this.capacity + ", " + "virtualDiskId=" + this.virtualDiskId + ", " + "replicationCapabilities=" + this.replicationCapabilities + "]";
    }
}


