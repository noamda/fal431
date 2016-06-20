package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupSettingsChangesParam", propOrder = {"groupUID", "replicationSetsChanges", "vmReplicationSetsChanges", "removedReplicationSets", "copiesChanges", "activationParams"})
public class ConsistencyGroupSettingsChangesParam {
    @XmlElement(required = true)
    protected ConsistencyGroupUID groupUID;
    @XmlElement(nillable = true)
    protected List<ReplicationSetSettingsChangesParam> replicationSetsChanges;
    @XmlElement(nillable = true)
    protected List<VmReplicationSetSettingsChangesParam> vmReplicationSetsChanges;
    @XmlElement(nillable = true)
    protected List<ReplicationSetUID> removedReplicationSets;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopySettingsChangesParam> copiesChanges;
    protected ActivationSettingsChangesParams activationParams;

    public ConsistencyGroupSettingsChangesParam() {
    }

    public ConsistencyGroupSettingsChangesParam(ConsistencyGroupUID groupUID, List<ReplicationSetSettingsChangesParam> replicationSetsChanges, List<VmReplicationSetSettingsChangesParam> vmReplicationSetsChanges, List<ReplicationSetUID> removedReplicationSets, List<ConsistencyGroupCopySettingsChangesParam> copiesChanges, ActivationSettingsChangesParams activationParams) {
        this.groupUID = groupUID;
        this.replicationSetsChanges = replicationSetsChanges;
        this.vmReplicationSetsChanges = vmReplicationSetsChanges;
        this.removedReplicationSets = removedReplicationSets;
        this.copiesChanges = copiesChanges;
        this.activationParams = activationParams;
    }


    public ConsistencyGroupUID getGroupUID() {
        return this.groupUID;
    }


    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }


    public List<ReplicationSetSettingsChangesParam> getReplicationSetsChanges() {
        if (this.replicationSetsChanges == null) {
            this.replicationSetsChanges = new ArrayList();
        }
        return this.replicationSetsChanges;
    }


    public List<VmReplicationSetSettingsChangesParam> getVmReplicationSetsChanges() {
        if (this.vmReplicationSetsChanges == null) {
            this.vmReplicationSetsChanges = new ArrayList();
        }
        return this.vmReplicationSetsChanges;
    }


    public List<ReplicationSetUID> getRemovedReplicationSets() {
        if (this.removedReplicationSets == null) {
            this.removedReplicationSets = new ArrayList();
        }
        return this.removedReplicationSets;
    }


    public List<ConsistencyGroupCopySettingsChangesParam> getCopiesChanges() {
        if (this.copiesChanges == null) {
            this.copiesChanges = new ArrayList();
        }
        return this.copiesChanges;
    }


    public ActivationSettingsChangesParams getActivationParams() {
        return this.activationParams;
    }


    public void setActivationParams(ActivationSettingsChangesParams value) {
        this.activationParams = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupSettingsChangesParam)) {
            return false;
        }
        ConsistencyGroupSettingsChangesParam otherObj = (ConsistencyGroupSettingsChangesParam) obj;

        return (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.replicationSetsChanges != null ? this.replicationSetsChanges.equals(otherObj.replicationSetsChanges) : this.replicationSetsChanges == otherObj.replicationSetsChanges) && (this.vmReplicationSetsChanges != null ? this.vmReplicationSetsChanges.equals(otherObj.vmReplicationSetsChanges) : this.vmReplicationSetsChanges == otherObj.vmReplicationSetsChanges) && (this.removedReplicationSets != null ? this.removedReplicationSets.equals(otherObj.removedReplicationSets) : this.removedReplicationSets == otherObj.removedReplicationSets) && (this.copiesChanges != null ? this.copiesChanges.equals(otherObj.copiesChanges) : this.copiesChanges == otherObj.copiesChanges) && (this.activationParams != null ? this.activationParams.equals(otherObj.activationParams) : this.activationParams == otherObj.activationParams);
    }


    public int hashCode() {
        return (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (this.replicationSetsChanges != null ? this.replicationSetsChanges.hashCode() : 0) ^ (this.vmReplicationSetsChanges != null ? this.vmReplicationSetsChanges.hashCode() : 0) ^ (this.removedReplicationSets != null ? this.removedReplicationSets.hashCode() : 0) ^ (this.copiesChanges != null ? this.copiesChanges.hashCode() : 0) ^ (this.activationParams != null ? this.activationParams.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupSettingsChangesParam [groupUID=" + this.groupUID + ", " + "replicationSetsChanges=" + this.replicationSetsChanges + ", " + "vmReplicationSetsChanges=" + this.vmReplicationSetsChanges + ", " + "removedReplicationSets=" + this.removedReplicationSets + ", " + "copiesChanges=" + this.copiesChanges + ", " + "activationParams=" + this.activationParams + "]";
    }
}


