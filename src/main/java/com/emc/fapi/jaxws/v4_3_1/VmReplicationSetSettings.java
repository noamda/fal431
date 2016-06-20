package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmReplicationSetSettings", propOrder = {"replicatedVMs", "vmReplicationSetUID", "autoReplicateNewVirtualDisks", "diskSettings", "vmReplicationSetPolicy"})
public class VmReplicationSetSettings {
    @XmlElement(nillable = true)
    protected List<VmReplicationSettings> replicatedVMs;
    @XmlElement(nillable = true)
    protected VmReplicationSetUID vmReplicationSetUID;
    protected boolean autoReplicateNewVirtualDisks;
    @XmlElement(nillable = true)
    protected List<VirtualDiskSettings> diskSettings;
    @XmlElement(nillable = true)
    protected VmReplicationSetPolicy vmReplicationSetPolicy;

    public VmReplicationSetSettings() {
    }

    public VmReplicationSetSettings(List<VmReplicationSettings> replicatedVMs, VmReplicationSetUID vmReplicationSetUID, boolean autoReplicateNewVirtualDisks, List<VirtualDiskSettings> diskSettings, VmReplicationSetPolicy vmReplicationSetPolicy) {
        this.replicatedVMs = replicatedVMs;
        this.vmReplicationSetUID = vmReplicationSetUID;
        this.autoReplicateNewVirtualDisks = autoReplicateNewVirtualDisks;
        this.diskSettings = diskSettings;
        this.vmReplicationSetPolicy = vmReplicationSetPolicy;
    }


    public List<VmReplicationSettings> getReplicatedVMs() {
        if (this.replicatedVMs == null) {
            this.replicatedVMs = new ArrayList();
        }
        return this.replicatedVMs;
    }


    public VmReplicationSetUID getVmReplicationSetUID() {
        return this.vmReplicationSetUID;
    }


    public void setVmReplicationSetUID(VmReplicationSetUID value) {
        this.vmReplicationSetUID = value;
    }


    public boolean isAutoReplicateNewVirtualDisks() {
        return this.autoReplicateNewVirtualDisks;
    }


    public void setAutoReplicateNewVirtualDisks(boolean value) {
        this.autoReplicateNewVirtualDisks = value;
    }


    public List<VirtualDiskSettings> getDiskSettings() {
        if (this.diskSettings == null) {
            this.diskSettings = new ArrayList();
        }
        return this.diskSettings;
    }


    public VmReplicationSetPolicy getVmReplicationSetPolicy() {
        return this.vmReplicationSetPolicy;
    }


    public void setVmReplicationSetPolicy(VmReplicationSetPolicy value) {
        this.vmReplicationSetPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmReplicationSetSettings)) {
            return false;
        }
        VmReplicationSetSettings otherObj = (VmReplicationSetSettings) obj;

        return (this.replicatedVMs != null ? this.replicatedVMs.equals(otherObj.replicatedVMs) : this.replicatedVMs == otherObj.replicatedVMs) && (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.equals(otherObj.vmReplicationSetUID) : this.vmReplicationSetUID == otherObj.vmReplicationSetUID) && (this.autoReplicateNewVirtualDisks == otherObj.autoReplicateNewVirtualDisks) && (this.diskSettings != null ? this.diskSettings.equals(otherObj.diskSettings) : this.diskSettings == otherObj.diskSettings) && (this.vmReplicationSetPolicy != null ? this.vmReplicationSetPolicy.equals(otherObj.vmReplicationSetPolicy) : this.vmReplicationSetPolicy == otherObj.vmReplicationSetPolicy);
    }


    public int hashCode() {
        return (this.replicatedVMs != null ? this.replicatedVMs.hashCode() : 0) ^ (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.hashCode() : 0) ^ (this.autoReplicateNewVirtualDisks ? 1 : 0) ^ (this.diskSettings != null ? this.diskSettings.hashCode() : 0) ^ (this.vmReplicationSetPolicy != null ? this.vmReplicationSetPolicy.hashCode() : 0);
    }


    public String toString() {
        return "VmReplicationSetSettings [replicatedVMs=" + this.replicatedVMs + ", " + "vmReplicationSetUID=" + this.vmReplicationSetUID + ", " + "autoReplicateNewVirtualDisks=" + this.autoReplicateNewVirtualDisks + ", " + "diskSettings=" + this.diskSettings + ", " + "vmReplicationSetPolicy=" + this.vmReplicationSetPolicy + "]";
    }
}


