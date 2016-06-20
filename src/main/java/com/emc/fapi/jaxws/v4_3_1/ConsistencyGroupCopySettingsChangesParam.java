package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupCopySettingsChangesParam", propOrder = {"copyUID", "newJournalVolumes", "removedJournalVolumes", "volumeCreationParams", "activationParams"})
public class ConsistencyGroupCopySettingsChangesParam {
    @XmlElement(required = true)
    protected ConsistencyGroupCopyUID copyUID;
    @XmlElement(nillable = true)
    protected List<DeviceUID> newJournalVolumes;
    @XmlElement(nillable = true)
    protected List<DeviceUID> removedJournalVolumes;
    protected ConsistencyGroupCopyVolumeCreationParams volumeCreationParams;
    protected ActivationSettingsChangesParams activationParams;

    public ConsistencyGroupCopySettingsChangesParam() {
    }

    public ConsistencyGroupCopySettingsChangesParam(ConsistencyGroupCopyUID copyUID, List<DeviceUID> newJournalVolumes, List<DeviceUID> removedJournalVolumes, ConsistencyGroupCopyVolumeCreationParams volumeCreationParams, ActivationSettingsChangesParams activationParams) {
        this.copyUID = copyUID;
        this.newJournalVolumes = newJournalVolumes;
        this.removedJournalVolumes = removedJournalVolumes;
        this.volumeCreationParams = volumeCreationParams;
        this.activationParams = activationParams;
    }


    public ConsistencyGroupCopyUID getCopyUID() {
        return this.copyUID;
    }


    public void setCopyUID(ConsistencyGroupCopyUID value) {
        this.copyUID = value;
    }


    public List<DeviceUID> getNewJournalVolumes() {
        if (this.newJournalVolumes == null) {
            this.newJournalVolumes = new ArrayList();
        }
        return this.newJournalVolumes;
    }


    public List<DeviceUID> getRemovedJournalVolumes() {
        if (this.removedJournalVolumes == null) {
            this.removedJournalVolumes = new ArrayList();
        }
        return this.removedJournalVolumes;
    }


    public ConsistencyGroupCopyVolumeCreationParams getVolumeCreationParams() {
        return this.volumeCreationParams;
    }


    public void setVolumeCreationParams(ConsistencyGroupCopyVolumeCreationParams value) {
        this.volumeCreationParams = value;
    }


    public ActivationSettingsChangesParams getActivationParams() {
        return this.activationParams;
    }


    public void setActivationParams(ActivationSettingsChangesParams value) {
        this.activationParams = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupCopySettingsChangesParam)) {
            return false;
        }
        ConsistencyGroupCopySettingsChangesParam otherObj = (ConsistencyGroupCopySettingsChangesParam) obj;

        return (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.newJournalVolumes != null ? this.newJournalVolumes.equals(otherObj.newJournalVolumes) : this.newJournalVolumes == otherObj.newJournalVolumes) && (this.removedJournalVolumes != null ? this.removedJournalVolumes.equals(otherObj.removedJournalVolumes) : this.removedJournalVolumes == otherObj.removedJournalVolumes) && (this.volumeCreationParams != null ? this.volumeCreationParams.equals(otherObj.volumeCreationParams) : this.volumeCreationParams == otherObj.volumeCreationParams) && (this.activationParams != null ? this.activationParams.equals(otherObj.activationParams) : this.activationParams == otherObj.activationParams);
    }


    public int hashCode() {
        return (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.newJournalVolumes != null ? this.newJournalVolumes.hashCode() : 0) ^ (this.removedJournalVolumes != null ? this.removedJournalVolumes.hashCode() : 0) ^ (this.volumeCreationParams != null ? this.volumeCreationParams.hashCode() : 0) ^ (this.activationParams != null ? this.activationParams.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupCopySettingsChangesParam [copyUID=" + this.copyUID + ", " + "newJournalVolumes=" + this.newJournalVolumes + ", " + "removedJournalVolumes=" + this.removedJournalVolumes + ", " + "volumeCreationParams=" + this.volumeCreationParams + ", " + "activationParams=" + this.activationParams + "]";
    }
}


