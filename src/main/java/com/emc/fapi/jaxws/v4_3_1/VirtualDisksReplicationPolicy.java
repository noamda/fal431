package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDisksReplicationPolicy", propOrder = {"autoReplicateNewVirtualDisks", "diskSettings"})
public class VirtualDisksReplicationPolicy {
    protected boolean autoReplicateNewVirtualDisks;
    @XmlElement(nillable = true)
    protected List<VirtualDiskSettings> diskSettings;

    public VirtualDisksReplicationPolicy() {
    }

    public VirtualDisksReplicationPolicy(boolean autoReplicateNewVirtualDisks, List<VirtualDiskSettings> diskSettings) {
        this.autoReplicateNewVirtualDisks = autoReplicateNewVirtualDisks;
        this.diskSettings = diskSettings;
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


    public boolean equals(Object obj) {
        if (!(obj instanceof VirtualDisksReplicationPolicy)) {
            return false;
        }
        VirtualDisksReplicationPolicy otherObj = (VirtualDisksReplicationPolicy) obj;

        return (this.autoReplicateNewVirtualDisks == otherObj.autoReplicateNewVirtualDisks) && (this.diskSettings != null ? this.diskSettings.equals(otherObj.diskSettings) : this.diskSettings == otherObj.diskSettings);
    }


    public int hashCode() {
        return (this.autoReplicateNewVirtualDisks ? 1 : 0) ^ (this.diskSettings != null ? this.diskSettings.hashCode() : 0);
    }


    public String toString() {
        return "VirtualDisksReplicationPolicy [autoReplicateNewVirtualDisks=" + this.autoReplicateNewVirtualDisks + ", " + "diskSettings=" + this.diskSettings + "]";
    }
}


