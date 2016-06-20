package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupCopyState", propOrder = {"copyUID", "enabled", "regulated", "suspended", "active", "removable", "activePrimaryRPA", "activeSecondaryRPAsList", "accessedImage", "storageAccessState", "splitVariant", "journalState", "maxJournalSizeInBytes", "consolidationProgress", "distributedFirstSnapshot", "tspWritesCleared", "stateUnknown", "axxanaCopyStatus", "regulationReason", "pendingCreationVolumes", "currentStartUpActions"})
public class ConsistencyGroupCopyState {
    protected ConsistencyGroupCopyUID copyUID;
    protected boolean enabled;
    protected boolean regulated;
    protected boolean suspended;
    protected boolean active;
    protected boolean removable;
    protected int activePrimaryRPA;
    @XmlElement(nillable = true)
    protected List<Integer> activeSecondaryRPAsList;
    protected Snapshot accessedImage;
    @XmlElement(nillable = true)
    protected StorageAccessState storageAccessState;
    @XmlElement(nillable = true)
    protected SplitVariant splitVariant;
    @XmlElement(nillable = true)
    protected JournalState journalState;
    protected Long maxJournalSizeInBytes;
    @XmlElement(nillable = true)
    protected ConsolidationProgress consolidationProgress;
    protected Boolean distributedFirstSnapshot;
    protected Boolean tspWritesCleared;
    protected boolean stateUnknown;
    @XmlElement(nillable = true)
    protected AxxanaCopyStatus axxanaCopyStatus;
    protected String regulationReason;
    @XmlElement(nillable = true)
    protected List<VolumeSize> pendingCreationVolumes;
    @XmlElement(nillable = true)
    protected List<VmStartUpActionState> currentStartUpActions;

    public ConsistencyGroupCopyState() {
    }

    public ConsistencyGroupCopyState(ConsistencyGroupCopyUID copyUID, boolean enabled, boolean regulated, boolean suspended, boolean active, boolean removable, int activePrimaryRPA, List<Integer> activeSecondaryRPAsList, Snapshot accessedImage, StorageAccessState storageAccessState, SplitVariant splitVariant, JournalState journalState, Long maxJournalSizeInBytes, ConsolidationProgress consolidationProgress, Boolean distributedFirstSnapshot, Boolean tspWritesCleared, boolean stateUnknown, AxxanaCopyStatus axxanaCopyStatus, String regulationReason, List<VolumeSize> pendingCreationVolumes, List<VmStartUpActionState> currentStartUpActions) {
        this.copyUID = copyUID;
        this.enabled = enabled;
        this.regulated = regulated;
        this.suspended = suspended;
        this.active = active;
        this.removable = removable;
        this.activePrimaryRPA = activePrimaryRPA;
        this.activeSecondaryRPAsList = activeSecondaryRPAsList;
        this.accessedImage = accessedImage;
        this.storageAccessState = storageAccessState;
        this.splitVariant = splitVariant;
        this.journalState = journalState;
        this.maxJournalSizeInBytes = maxJournalSizeInBytes;
        this.consolidationProgress = consolidationProgress;
        this.distributedFirstSnapshot = distributedFirstSnapshot;
        this.tspWritesCleared = tspWritesCleared;
        this.stateUnknown = stateUnknown;
        this.axxanaCopyStatus = axxanaCopyStatus;
        this.regulationReason = regulationReason;
        this.pendingCreationVolumes = pendingCreationVolumes;
        this.currentStartUpActions = currentStartUpActions;
    }


    public ConsistencyGroupCopyUID getCopyUID() {
        return this.copyUID;
    }


    public void setCopyUID(ConsistencyGroupCopyUID value) {
        this.copyUID = value;
    }


    public boolean isEnabled() {
        return this.enabled;
    }


    public void setEnabled(boolean value) {
        this.enabled = value;
    }


    public boolean isRegulated() {
        return this.regulated;
    }


    public void setRegulated(boolean value) {
        this.regulated = value;
    }


    public boolean isSuspended() {
        return this.suspended;
    }


    public void setSuspended(boolean value) {
        this.suspended = value;
    }


    public boolean isActive() {
        return this.active;
    }


    public void setActive(boolean value) {
        this.active = value;
    }


    public boolean isRemovable() {
        return this.removable;
    }


    public void setRemovable(boolean value) {
        this.removable = value;
    }


    public int getActivePrimaryRPA() {
        return this.activePrimaryRPA;
    }


    public void setActivePrimaryRPA(int value) {
        this.activePrimaryRPA = value;
    }


    public List<Integer> getActiveSecondaryRPAsList() {
        if (this.activeSecondaryRPAsList == null) {
            this.activeSecondaryRPAsList = new ArrayList();
        }
        return this.activeSecondaryRPAsList;
    }


    public Snapshot getAccessedImage() {
        return this.accessedImage;
    }


    public void setAccessedImage(Snapshot value) {
        this.accessedImage = value;
    }


    public StorageAccessState getStorageAccessState() {
        return this.storageAccessState;
    }


    public void setStorageAccessState(StorageAccessState value) {
        this.storageAccessState = value;
    }


    public SplitVariant getSplitVariant() {
        return this.splitVariant;
    }


    public void setSplitVariant(SplitVariant value) {
        this.splitVariant = value;
    }


    public JournalState getJournalState() {
        return this.journalState;
    }


    public void setJournalState(JournalState value) {
        this.journalState = value;
    }


    public Long getMaxJournalSizeInBytes() {
        return this.maxJournalSizeInBytes;
    }


    public void setMaxJournalSizeInBytes(Long value) {
        this.maxJournalSizeInBytes = value;
    }


    public ConsolidationProgress getConsolidationProgress() {
        return this.consolidationProgress;
    }


    public void setConsolidationProgress(ConsolidationProgress value) {
        this.consolidationProgress = value;
    }


    public Boolean isDistributedFirstSnapshot() {
        return this.distributedFirstSnapshot;
    }


    public void setDistributedFirstSnapshot(Boolean value) {
        this.distributedFirstSnapshot = value;
    }


    public Boolean isTspWritesCleared() {
        return this.tspWritesCleared;
    }


    public void setTspWritesCleared(Boolean value) {
        this.tspWritesCleared = value;
    }


    public boolean isStateUnknown() {
        return this.stateUnknown;
    }


    public void setStateUnknown(boolean value) {
        this.stateUnknown = value;
    }


    public AxxanaCopyStatus getAxxanaCopyStatus() {
        return this.axxanaCopyStatus;
    }


    public void setAxxanaCopyStatus(AxxanaCopyStatus value) {
        this.axxanaCopyStatus = value;
    }


    public String getRegulationReason() {
        return this.regulationReason;
    }


    public void setRegulationReason(String value) {
        this.regulationReason = value;
    }


    public List<VolumeSize> getPendingCreationVolumes() {
        if (this.pendingCreationVolumes == null) {
            this.pendingCreationVolumes = new ArrayList();
        }
        return this.pendingCreationVolumes;
    }


    public List<VmStartUpActionState> getCurrentStartUpActions() {
        if (this.currentStartUpActions == null) {
            this.currentStartUpActions = new ArrayList();
        }
        return this.currentStartUpActions;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupCopyState)) {
            return false;
        }
        ConsistencyGroupCopyState otherObj = (ConsistencyGroupCopyState) obj;

        return (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.enabled == otherObj.enabled) && (this.regulated == otherObj.regulated) && (this.suspended == otherObj.suspended) && (this.active == otherObj.active) && (this.removable == otherObj.removable) && (this.activePrimaryRPA == otherObj.activePrimaryRPA) && (this.activeSecondaryRPAsList != null ? this.activeSecondaryRPAsList.equals(otherObj.activeSecondaryRPAsList) : this.activeSecondaryRPAsList == otherObj.activeSecondaryRPAsList) && (this.accessedImage != null ? this.accessedImage.equals(otherObj.accessedImage) : this.accessedImage == otherObj.accessedImage) && (this.storageAccessState != null ? this.storageAccessState.equals(otherObj.storageAccessState) : this.storageAccessState == otherObj.storageAccessState) && (this.splitVariant != null ? this.splitVariant.equals(otherObj.splitVariant) : this.splitVariant == otherObj.splitVariant) && (this.journalState != null ? this.journalState.equals(otherObj.journalState) : this.journalState == otherObj.journalState) && (this.maxJournalSizeInBytes != null ? this.maxJournalSizeInBytes.equals(otherObj.maxJournalSizeInBytes) : this.maxJournalSizeInBytes == otherObj.maxJournalSizeInBytes) && (this.consolidationProgress != null ? this.consolidationProgress.equals(otherObj.consolidationProgress) : this.consolidationProgress == otherObj.consolidationProgress) && (this.distributedFirstSnapshot != null ? this.distributedFirstSnapshot.equals(otherObj.distributedFirstSnapshot) : this.distributedFirstSnapshot == otherObj.distributedFirstSnapshot) && (this.tspWritesCleared != null ? this.tspWritesCleared.equals(otherObj.tspWritesCleared) : this.tspWritesCleared == otherObj.tspWritesCleared) && (this.stateUnknown == otherObj.stateUnknown) && (this.axxanaCopyStatus != null ? this.axxanaCopyStatus.equals(otherObj.axxanaCopyStatus) : this.axxanaCopyStatus == otherObj.axxanaCopyStatus) && (this.regulationReason != null ? this.regulationReason.equals(otherObj.regulationReason) : this.regulationReason == otherObj.regulationReason) && (this.pendingCreationVolumes != null ? this.pendingCreationVolumes.equals(otherObj.pendingCreationVolumes) : this.pendingCreationVolumes == otherObj.pendingCreationVolumes) && (this.currentStartUpActions != null ? this.currentStartUpActions.equals(otherObj.currentStartUpActions) : this.currentStartUpActions == otherObj.currentStartUpActions);
    }


    public int hashCode() {
        return (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.enabled ? 1 : 0) ^ (this.regulated ? 1 : 0) ^ (this.suspended ? 1 : 0) ^ (this.active ? 1 : 0) ^ (this.removable ? 1 : 0) ^ this.activePrimaryRPA ^ (this.activeSecondaryRPAsList != null ? this.activeSecondaryRPAsList.hashCode() : 0) ^ (this.accessedImage != null ? this.accessedImage.hashCode() : 0) ^ (this.storageAccessState != null ? this.storageAccessState.hashCode() : 0) ^ (this.splitVariant != null ? this.splitVariant.hashCode() : 0) ^ (this.journalState != null ? this.journalState.hashCode() : 0) ^ (this.maxJournalSizeInBytes != null ? this.maxJournalSizeInBytes.hashCode() : 0) ^ (this.consolidationProgress != null ? this.consolidationProgress.hashCode() : 0) ^ (this.distributedFirstSnapshot != null ? this.distributedFirstSnapshot.hashCode() : 0) ^ (this.tspWritesCleared != null ? this.tspWritesCleared.hashCode() : 0) ^ (this.stateUnknown ? 1 : 0) ^ (this.axxanaCopyStatus != null ? this.axxanaCopyStatus.hashCode() : 0) ^ (this.regulationReason != null ? this.regulationReason.hashCode() : 0) ^ (this.pendingCreationVolumes != null ? this.pendingCreationVolumes.hashCode() : 0) ^ (this.currentStartUpActions != null ? this.currentStartUpActions.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupCopyState [copyUID=" + this.copyUID + ", " + "enabled=" + this.enabled + ", " + "regulated=" + this.regulated + ", " + "suspended=" + this.suspended + ", " + "active=" + this.active + ", " + "removable=" + this.removable + ", " + "activePrimaryRPA=" + this.activePrimaryRPA + ", " + "activeSecondaryRPAsList=" + this.activeSecondaryRPAsList + ", " + "accessedImage=" + this.accessedImage + ", " + "storageAccessState=" + this.storageAccessState + ", " + "splitVariant=" + this.splitVariant + ", " + "journalState=" + this.journalState + ", " + "maxJournalSizeInBytes=" + this.maxJournalSizeInBytes + ", " + "consolidationProgress=" + this.consolidationProgress + ", " + "distributedFirstSnapshot=" + this.distributedFirstSnapshot + ", " + "tspWritesCleared=" + this.tspWritesCleared + ", " + "stateUnknown=" + this.stateUnknown + ", " + "axxanaCopyStatus=" + this.axxanaCopyStatus + ", " + "regulationReason=" + this.regulationReason + ", " + "pendingCreationVolumes=" + this.pendingCreationVolumes + ", " + "currentStartUpActions=" + this.currentStartUpActions + "]";
    }
}


