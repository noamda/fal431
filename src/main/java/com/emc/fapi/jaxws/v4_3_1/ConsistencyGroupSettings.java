package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupSettings", propOrder = {"activeLinksSettings", "enabled", "groupCopiesSettings", "groupUID", "latestSourceCopyUID", "name", "passiveLinksSettings", "policy", "productionCopiesUID", "replicationSetsSettings", "vmReplicationSetsSettings"})
public class ConsistencyGroupSettings {
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupLinkSettings> activeLinksSettings;
    protected boolean enabled;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopySettings> groupCopiesSettings;
    protected ConsistencyGroupUID groupUID;
    protected ConsistencyGroupCopyUID latestSourceCopyUID;
    protected String name;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupLinkSettings> passiveLinksSettings;
    protected ConsistencyGroupPolicy policy;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyUID> productionCopiesUID;
    @XmlElement(nillable = true)
    protected List<ReplicationSetSettings> replicationSetsSettings;
    @XmlElement(nillable = true)
    protected List<VmReplicationSetSettings> vmReplicationSetsSettings;

    public ConsistencyGroupSettings() {
    }

    public ConsistencyGroupSettings(List<ConsistencyGroupLinkSettings> activeLinksSettings, boolean enabled, List<ConsistencyGroupCopySettings> groupCopiesSettings, ConsistencyGroupUID groupUID, ConsistencyGroupCopyUID latestSourceCopyUID, String name, List<ConsistencyGroupLinkSettings> passiveLinksSettings, ConsistencyGroupPolicy policy, List<ConsistencyGroupCopyUID> productionCopiesUID, List<ReplicationSetSettings> replicationSetsSettings, List<VmReplicationSetSettings> vmReplicationSetsSettings) {
        this.activeLinksSettings = activeLinksSettings;
        this.enabled = enabled;
        this.groupCopiesSettings = groupCopiesSettings;
        this.groupUID = groupUID;
        this.latestSourceCopyUID = latestSourceCopyUID;
        this.name = name;
        this.passiveLinksSettings = passiveLinksSettings;
        this.policy = policy;
        this.productionCopiesUID = productionCopiesUID;
        this.replicationSetsSettings = replicationSetsSettings;
        this.vmReplicationSetsSettings = vmReplicationSetsSettings;
    }


    public List<ConsistencyGroupLinkSettings> getActiveLinksSettings() {
        if (this.activeLinksSettings == null) {
            this.activeLinksSettings = new ArrayList();
        }
        return this.activeLinksSettings;
    }


    public boolean isEnabled() {
        return this.enabled;
    }


    public void setEnabled(boolean value) {
        this.enabled = value;
    }


    public List<ConsistencyGroupCopySettings> getGroupCopiesSettings() {
        if (this.groupCopiesSettings == null) {
            this.groupCopiesSettings = new ArrayList();
        }
        return this.groupCopiesSettings;
    }


    public ConsistencyGroupUID getGroupUID() {
        return this.groupUID;
    }


    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }


    public ConsistencyGroupCopyUID getLatestSourceCopyUID() {
        return this.latestSourceCopyUID;
    }


    public void setLatestSourceCopyUID(ConsistencyGroupCopyUID value) {
        this.latestSourceCopyUID = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public List<ConsistencyGroupLinkSettings> getPassiveLinksSettings() {
        if (this.passiveLinksSettings == null) {
            this.passiveLinksSettings = new ArrayList();
        }
        return this.passiveLinksSettings;
    }


    public ConsistencyGroupPolicy getPolicy() {
        return this.policy;
    }


    public void setPolicy(ConsistencyGroupPolicy value) {
        this.policy = value;
    }


    public List<ConsistencyGroupCopyUID> getProductionCopiesUID() {
        if (this.productionCopiesUID == null) {
            this.productionCopiesUID = new ArrayList();
        }
        return this.productionCopiesUID;
    }


    public List<ReplicationSetSettings> getReplicationSetsSettings() {
        if (this.replicationSetsSettings == null) {
            this.replicationSetsSettings = new ArrayList();
        }
        return this.replicationSetsSettings;
    }


    public List<VmReplicationSetSettings> getVmReplicationSetsSettings() {
        if (this.vmReplicationSetsSettings == null) {
            this.vmReplicationSetsSettings = new ArrayList();
        }
        return this.vmReplicationSetsSettings;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupSettings)) {
            return false;
        }
        ConsistencyGroupSettings otherObj = (ConsistencyGroupSettings) obj;

        return (this.activeLinksSettings != null ? this.activeLinksSettings.equals(otherObj.activeLinksSettings) : this.activeLinksSettings == otherObj.activeLinksSettings) && (this.enabled == otherObj.enabled) && (this.groupCopiesSettings != null ? this.groupCopiesSettings.equals(otherObj.groupCopiesSettings) : this.groupCopiesSettings == otherObj.groupCopiesSettings) && (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.latestSourceCopyUID != null ? this.latestSourceCopyUID.equals(otherObj.latestSourceCopyUID) : this.latestSourceCopyUID == otherObj.latestSourceCopyUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.passiveLinksSettings != null ? this.passiveLinksSettings.equals(otherObj.passiveLinksSettings) : this.passiveLinksSettings == otherObj.passiveLinksSettings) && (this.policy != null ? this.policy.equals(otherObj.policy) : this.policy == otherObj.policy) && (this.productionCopiesUID != null ? this.productionCopiesUID.equals(otherObj.productionCopiesUID) : this.productionCopiesUID == otherObj.productionCopiesUID) && (this.replicationSetsSettings != null ? this.replicationSetsSettings.equals(otherObj.replicationSetsSettings) : this.replicationSetsSettings == otherObj.replicationSetsSettings) && (this.vmReplicationSetsSettings != null ? this.vmReplicationSetsSettings.equals(otherObj.vmReplicationSetsSettings) : this.vmReplicationSetsSettings == otherObj.vmReplicationSetsSettings);
    }


    public int hashCode() {
        return (this.activeLinksSettings != null ? this.activeLinksSettings.hashCode() : 0) ^ (this.enabled ? 1 : 0) ^ (this.groupCopiesSettings != null ? this.groupCopiesSettings.hashCode() : 0) ^ (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (this.latestSourceCopyUID != null ? this.latestSourceCopyUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.passiveLinksSettings != null ? this.passiveLinksSettings.hashCode() : 0) ^ (this.policy != null ? this.policy.hashCode() : 0) ^ (this.productionCopiesUID != null ? this.productionCopiesUID.hashCode() : 0) ^ (this.replicationSetsSettings != null ? this.replicationSetsSettings.hashCode() : 0) ^ (this.vmReplicationSetsSettings != null ? this.vmReplicationSetsSettings.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupSettings [activeLinksSettings=" + this.activeLinksSettings + ", " + "enabled=" + this.enabled + ", " + "groupCopiesSettings=" + this.groupCopiesSettings + ", " + "groupUID=" + this.groupUID + ", " + "latestSourceCopyUID=" + this.latestSourceCopyUID + ", " + "name=" + this.name + ", " + "passiveLinksSettings=" + this.passiveLinksSettings + ", " + "policy=" + this.policy + ", " + "productionCopiesUID=" + this.productionCopiesUID + ", " + "replicationSetsSettings=" + this.replicationSetsSettings + ", " + "vmReplicationSetsSettings=" + this.vmReplicationSetsSettings + "]";
    }
}


