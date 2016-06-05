/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupCopyState", propOrder={"copyUID", "enabled", "regulated", "suspended", "active", "removable", "activePrimaryRPA", "activeSecondaryRPAsList", "accessedImage", "storageAccessState", "splitVariant", "journalState", "maxJournalSizeInBytes", "consolidationProgress", "distributedFirstSnapshot", "tspWritesCleared", "stateUnknown", "axxanaCopyStatus", "regulationReason", "pendingCreationVolumes", "currentStartUpActions"})
/*     */ public class ConsistencyGroupCopyState
/*     */ {
/*     */   protected ConsistencyGroupCopyUID copyUID;
/*     */   protected boolean enabled;
/*     */   protected boolean regulated;
/*     */   protected boolean suspended;
/*     */   protected boolean active;
/*     */   protected boolean removable;
/*     */   protected int activePrimaryRPA;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<Integer> activeSecondaryRPAsList;
/*     */   protected Snapshot accessedImage;
/*     */   @XmlElement(nillable=true)
/*     */   protected StorageAccessState storageAccessState;
/*     */   @XmlElement(nillable=true)
/*     */   protected SplitVariant splitVariant;
/*     */   @XmlElement(nillable=true)
/*     */   protected JournalState journalState;
/*     */   protected Long maxJournalSizeInBytes;
/*     */   @XmlElement(nillable=true)
/*     */   protected ConsolidationProgress consolidationProgress;
/*     */   protected Boolean distributedFirstSnapshot;
/*     */   protected Boolean tspWritesCleared;
/*     */   protected boolean stateUnknown;
/*     */   @XmlElement(nillable=true)
/*     */   protected AxxanaCopyStatus axxanaCopyStatus;
/*     */   protected String regulationReason;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VolumeSize> pendingCreationVolumes;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VmStartUpActionState> currentStartUpActions;
/*     */   
/*     */   public ConsistencyGroupCopyState() {}
/*     */   
/*     */   public ConsistencyGroupCopyState(ConsistencyGroupCopyUID copyUID, boolean enabled, boolean regulated, boolean suspended, boolean active, boolean removable, int activePrimaryRPA, List<Integer> activeSecondaryRPAsList, Snapshot accessedImage, StorageAccessState storageAccessState, SplitVariant splitVariant, JournalState journalState, Long maxJournalSizeInBytes, ConsolidationProgress consolidationProgress, Boolean distributedFirstSnapshot, Boolean tspWritesCleared, boolean stateUnknown, AxxanaCopyStatus axxanaCopyStatus, String regulationReason, List<VolumeSize> pendingCreationVolumes, List<VmStartUpActionState> currentStartUpActions)
/*     */   {
/* 115 */     this.copyUID = copyUID;
/* 116 */     this.enabled = enabled;
/* 117 */     this.regulated = regulated;
/* 118 */     this.suspended = suspended;
/* 119 */     this.active = active;
/* 120 */     this.removable = removable;
/* 121 */     this.activePrimaryRPA = activePrimaryRPA;
/* 122 */     this.activeSecondaryRPAsList = activeSecondaryRPAsList;
/* 123 */     this.accessedImage = accessedImage;
/* 124 */     this.storageAccessState = storageAccessState;
/* 125 */     this.splitVariant = splitVariant;
/* 126 */     this.journalState = journalState;
/* 127 */     this.maxJournalSizeInBytes = maxJournalSizeInBytes;
/* 128 */     this.consolidationProgress = consolidationProgress;
/* 129 */     this.distributedFirstSnapshot = distributedFirstSnapshot;
/* 130 */     this.tspWritesCleared = tspWritesCleared;
/* 131 */     this.stateUnknown = stateUnknown;
/* 132 */     this.axxanaCopyStatus = axxanaCopyStatus;
/* 133 */     this.regulationReason = regulationReason;
/* 134 */     this.pendingCreationVolumes = pendingCreationVolumes;
/* 135 */     this.currentStartUpActions = currentStartUpActions;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getCopyUID()
/*     */   {
/* 147 */     return this.copyUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCopyUID(ConsistencyGroupCopyUID value)
/*     */   {
/* 159 */     this.copyUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isEnabled()
/*     */   {
/* 167 */     return this.enabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEnabled(boolean value)
/*     */   {
/* 175 */     this.enabled = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isRegulated()
/*     */   {
/* 183 */     return this.regulated;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRegulated(boolean value)
/*     */   {
/* 191 */     this.regulated = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isSuspended()
/*     */   {
/* 199 */     return this.suspended;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSuspended(boolean value)
/*     */   {
/* 207 */     this.suspended = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isActive()
/*     */   {
/* 215 */     return this.active;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setActive(boolean value)
/*     */   {
/* 223 */     this.active = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isRemovable()
/*     */   {
/* 231 */     return this.removable;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRemovable(boolean value)
/*     */   {
/* 239 */     this.removable = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getActivePrimaryRPA()
/*     */   {
/* 247 */     return this.activePrimaryRPA;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setActivePrimaryRPA(int value)
/*     */   {
/* 255 */     this.activePrimaryRPA = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<Integer> getActiveSecondaryRPAsList()
/*     */   {
/* 281 */     if (this.activeSecondaryRPAsList == null) {
/* 282 */       this.activeSecondaryRPAsList = new ArrayList();
/*     */     }
/* 284 */     return this.activeSecondaryRPAsList;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Snapshot getAccessedImage()
/*     */   {
/* 296 */     return this.accessedImage;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAccessedImage(Snapshot value)
/*     */   {
/* 308 */     this.accessedImage = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public StorageAccessState getStorageAccessState()
/*     */   {
/* 320 */     return this.storageAccessState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStorageAccessState(StorageAccessState value)
/*     */   {
/* 332 */     this.storageAccessState = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SplitVariant getSplitVariant()
/*     */   {
/* 344 */     return this.splitVariant;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSplitVariant(SplitVariant value)
/*     */   {
/* 356 */     this.splitVariant = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JournalState getJournalState()
/*     */   {
/* 368 */     return this.journalState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setJournalState(JournalState value)
/*     */   {
/* 380 */     this.journalState = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getMaxJournalSizeInBytes()
/*     */   {
/* 392 */     return this.maxJournalSizeInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMaxJournalSizeInBytes(Long value)
/*     */   {
/* 404 */     this.maxJournalSizeInBytes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsolidationProgress getConsolidationProgress()
/*     */   {
/* 416 */     return this.consolidationProgress;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConsolidationProgress(ConsolidationProgress value)
/*     */   {
/* 428 */     this.consolidationProgress = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isDistributedFirstSnapshot()
/*     */   {
/* 440 */     return this.distributedFirstSnapshot;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDistributedFirstSnapshot(Boolean value)
/*     */   {
/* 452 */     this.distributedFirstSnapshot = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isTspWritesCleared()
/*     */   {
/* 464 */     return this.tspWritesCleared;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTspWritesCleared(Boolean value)
/*     */   {
/* 476 */     this.tspWritesCleared = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isStateUnknown()
/*     */   {
/* 484 */     return this.stateUnknown;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStateUnknown(boolean value)
/*     */   {
/* 492 */     this.stateUnknown = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public AxxanaCopyStatus getAxxanaCopyStatus()
/*     */   {
/* 504 */     return this.axxanaCopyStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAxxanaCopyStatus(AxxanaCopyStatus value)
/*     */   {
/* 516 */     this.axxanaCopyStatus = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getRegulationReason()
/*     */   {
/* 528 */     return this.regulationReason;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRegulationReason(String value)
/*     */   {
/* 540 */     this.regulationReason = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<VolumeSize> getPendingCreationVolumes()
/*     */   {
/* 566 */     if (this.pendingCreationVolumes == null) {
/* 567 */       this.pendingCreationVolumes = new ArrayList();
/*     */     }
/* 569 */     return this.pendingCreationVolumes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<VmStartUpActionState> getCurrentStartUpActions()
/*     */   {
/* 595 */     if (this.currentStartUpActions == null) {
/* 596 */       this.currentStartUpActions = new ArrayList();
/*     */     }
/* 598 */     return this.currentStartUpActions;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 608 */     if (!(obj instanceof ConsistencyGroupCopyState)) {
/* 609 */       return false;
/*     */     }
/* 611 */     ConsistencyGroupCopyState otherObj = (ConsistencyGroupCopyState)obj;
/*     */     
/* 613 */     return (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.enabled == otherObj.enabled) && (this.regulated == otherObj.regulated) && (this.suspended == otherObj.suspended) && (this.active == otherObj.active) && (this.removable == otherObj.removable) && (this.activePrimaryRPA == otherObj.activePrimaryRPA) && (this.activeSecondaryRPAsList != null ? this.activeSecondaryRPAsList.equals(otherObj.activeSecondaryRPAsList) : this.activeSecondaryRPAsList == otherObj.activeSecondaryRPAsList) && (this.accessedImage != null ? this.accessedImage.equals(otherObj.accessedImage) : this.accessedImage == otherObj.accessedImage) && (this.storageAccessState != null ? this.storageAccessState.equals(otherObj.storageAccessState) : this.storageAccessState == otherObj.storageAccessState) && (this.splitVariant != null ? this.splitVariant.equals(otherObj.splitVariant) : this.splitVariant == otherObj.splitVariant) && (this.journalState != null ? this.journalState.equals(otherObj.journalState) : this.journalState == otherObj.journalState) && (this.maxJournalSizeInBytes != null ? this.maxJournalSizeInBytes.equals(otherObj.maxJournalSizeInBytes) : this.maxJournalSizeInBytes == otherObj.maxJournalSizeInBytes) && (this.consolidationProgress != null ? this.consolidationProgress.equals(otherObj.consolidationProgress) : this.consolidationProgress == otherObj.consolidationProgress) && (this.distributedFirstSnapshot != null ? this.distributedFirstSnapshot.equals(otherObj.distributedFirstSnapshot) : this.distributedFirstSnapshot == otherObj.distributedFirstSnapshot) && (this.tspWritesCleared != null ? this.tspWritesCleared.equals(otherObj.tspWritesCleared) : this.tspWritesCleared == otherObj.tspWritesCleared) && (this.stateUnknown == otherObj.stateUnknown) && (this.axxanaCopyStatus != null ? this.axxanaCopyStatus.equals(otherObj.axxanaCopyStatus) : this.axxanaCopyStatus == otherObj.axxanaCopyStatus) && (this.regulationReason != null ? this.regulationReason.equals(otherObj.regulationReason) : this.regulationReason == otherObj.regulationReason) && (this.pendingCreationVolumes != null ? this.pendingCreationVolumes.equals(otherObj.pendingCreationVolumes) : this.pendingCreationVolumes == otherObj.pendingCreationVolumes) && (this.currentStartUpActions != null ? this.currentStartUpActions.equals(otherObj.currentStartUpActions) : this.currentStartUpActions == otherObj.currentStartUpActions);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 642 */     return (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.enabled ? 1 : 0) ^ (this.regulated ? 1 : 0) ^ (this.suspended ? 1 : 0) ^ (this.active ? 1 : 0) ^ (this.removable ? 1 : 0) ^ this.activePrimaryRPA ^ (this.activeSecondaryRPAsList != null ? this.activeSecondaryRPAsList.hashCode() : 0) ^ (this.accessedImage != null ? this.accessedImage.hashCode() : 0) ^ (this.storageAccessState != null ? this.storageAccessState.hashCode() : 0) ^ (this.splitVariant != null ? this.splitVariant.hashCode() : 0) ^ (this.journalState != null ? this.journalState.hashCode() : 0) ^ (this.maxJournalSizeInBytes != null ? this.maxJournalSizeInBytes.hashCode() : 0) ^ (this.consolidationProgress != null ? this.consolidationProgress.hashCode() : 0) ^ (this.distributedFirstSnapshot != null ? this.distributedFirstSnapshot.hashCode() : 0) ^ (this.tspWritesCleared != null ? this.tspWritesCleared.hashCode() : 0) ^ (this.stateUnknown ? 1 : 0) ^ (this.axxanaCopyStatus != null ? this.axxanaCopyStatus.hashCode() : 0) ^ (this.regulationReason != null ? this.regulationReason.hashCode() : 0) ^ (this.pendingCreationVolumes != null ? this.pendingCreationVolumes.hashCode() : 0) ^ (this.currentStartUpActions != null ? this.currentStartUpActions.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 671 */     return "ConsistencyGroupCopyState [copyUID=" + this.copyUID + ", " + "enabled=" + this.enabled + ", " + "regulated=" + this.regulated + ", " + "suspended=" + this.suspended + ", " + "active=" + this.active + ", " + "removable=" + this.removable + ", " + "activePrimaryRPA=" + this.activePrimaryRPA + ", " + "activeSecondaryRPAsList=" + this.activeSecondaryRPAsList + ", " + "accessedImage=" + this.accessedImage + ", " + "storageAccessState=" + this.storageAccessState + ", " + "splitVariant=" + this.splitVariant + ", " + "journalState=" + this.journalState + ", " + "maxJournalSizeInBytes=" + this.maxJournalSizeInBytes + ", " + "consolidationProgress=" + this.consolidationProgress + ", " + "distributedFirstSnapshot=" + this.distributedFirstSnapshot + ", " + "tspWritesCleared=" + this.tspWritesCleared + ", " + "stateUnknown=" + this.stateUnknown + ", " + "axxanaCopyStatus=" + this.axxanaCopyStatus + ", " + "regulationReason=" + this.regulationReason + ", " + "pendingCreationVolumes=" + this.pendingCreationVolumes + ", " + "currentStartUpActions=" + this.currentStartUpActions + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupCopyState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */