/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonTypeName;
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
/*     */ @JsonTypeName("ConsistencyGroupCopyRecoveryActivity")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupCopyRecoveryActivity", propOrder={"activeProductionCopy", "activityState", "canBeSetAsProduction", "canGroupResumeProduction", "copyName", "copyUID", "groupName", "imageAccessSizeLeftInBytes", "imageAccessTotalSizeInBytes", "inImageAccess", "numOfVmStartUpActionState", "transferEnabled", "transferState", "tspUsagePercentage"})
/*     */ public class ConsistencyGroupCopyRecoveryActivity
/*     */   extends BaseRecoveryActivity
/*     */ {
/*     */   protected ConsistencyGroupCopyUID activeProductionCopy;
/*     */   protected RecoveryActivityState activityState;
/*     */   protected boolean canBeSetAsProduction;
/*     */   protected boolean canGroupResumeProduction;
/*     */   protected String copyName;
/*     */   protected ConsistencyGroupCopyUID copyUID;
/*     */   protected String groupName;
/*     */   protected Long imageAccessSizeLeftInBytes;
/*     */   protected Long imageAccessTotalSizeInBytes;
/*     */   protected boolean inImageAccess;
/*     */   protected int numOfVmStartUpActionState;
/*     */   protected boolean transferEnabled;
/*     */   protected PipeState transferState;
/*     */   protected Double tspUsagePercentage;
/*     */   
/*     */   public ConsistencyGroupCopyRecoveryActivity() {}
/*     */   
/*     */   public ConsistencyGroupCopyRecoveryActivity(ConsistencyGroupCopyUID activeProductionCopy, RecoveryActivityState activityState, boolean canBeSetAsProduction, boolean canGroupResumeProduction, String copyName, ConsistencyGroupCopyUID copyUID, String groupName, Long imageAccessSizeLeftInBytes, Long imageAccessTotalSizeInBytes, boolean inImageAccess, int numOfVmStartUpActionState, boolean transferEnabled, PipeState transferState, Double tspUsagePercentage)
/*     */   {
/*  93 */     this.activeProductionCopy = activeProductionCopy;
/*  94 */     this.activityState = activityState;
/*  95 */     this.canBeSetAsProduction = canBeSetAsProduction;
/*  96 */     this.canGroupResumeProduction = canGroupResumeProduction;
/*  97 */     this.copyName = copyName;
/*  98 */     this.copyUID = copyUID;
/*  99 */     this.groupName = groupName;
/* 100 */     this.imageAccessSizeLeftInBytes = imageAccessSizeLeftInBytes;
/* 101 */     this.imageAccessTotalSizeInBytes = imageAccessTotalSizeInBytes;
/* 102 */     this.inImageAccess = inImageAccess;
/* 103 */     this.numOfVmStartUpActionState = numOfVmStartUpActionState;
/* 104 */     this.transferEnabled = transferEnabled;
/* 105 */     this.transferState = transferState;
/* 106 */     this.tspUsagePercentage = tspUsagePercentage;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getActiveProductionCopy()
/*     */   {
/* 118 */     return this.activeProductionCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setActiveProductionCopy(ConsistencyGroupCopyUID value)
/*     */   {
/* 130 */     this.activeProductionCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoveryActivityState getActivityState()
/*     */   {
/* 142 */     return this.activityState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setActivityState(RecoveryActivityState value)
/*     */   {
/* 154 */     this.activityState = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isCanBeSetAsProduction()
/*     */   {
/* 162 */     return this.canBeSetAsProduction;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCanBeSetAsProduction(boolean value)
/*     */   {
/* 170 */     this.canBeSetAsProduction = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isCanGroupResumeProduction()
/*     */   {
/* 178 */     return this.canGroupResumeProduction;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCanGroupResumeProduction(boolean value)
/*     */   {
/* 186 */     this.canGroupResumeProduction = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getCopyName()
/*     */   {
/* 198 */     return this.copyName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCopyName(String value)
/*     */   {
/* 210 */     this.copyName = value;
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
/* 222 */     return this.copyUID;
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
/* 234 */     this.copyUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getGroupName()
/*     */   {
/* 246 */     return this.groupName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupName(String value)
/*     */   {
/* 258 */     this.groupName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getImageAccessSizeLeftInBytes()
/*     */   {
/* 270 */     return this.imageAccessSizeLeftInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setImageAccessSizeLeftInBytes(Long value)
/*     */   {
/* 282 */     this.imageAccessSizeLeftInBytes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getImageAccessTotalSizeInBytes()
/*     */   {
/* 294 */     return this.imageAccessTotalSizeInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setImageAccessTotalSizeInBytes(Long value)
/*     */   {
/* 306 */     this.imageAccessTotalSizeInBytes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isInImageAccess()
/*     */   {
/* 314 */     return this.inImageAccess;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setInImageAccess(boolean value)
/*     */   {
/* 322 */     this.inImageAccess = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getNumOfVmStartUpActionState()
/*     */   {
/* 330 */     return this.numOfVmStartUpActionState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNumOfVmStartUpActionState(int value)
/*     */   {
/* 338 */     this.numOfVmStartUpActionState = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isTransferEnabled()
/*     */   {
/* 346 */     return this.transferEnabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTransferEnabled(boolean value)
/*     */   {
/* 354 */     this.transferEnabled = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public PipeState getTransferState()
/*     */   {
/* 366 */     return this.transferState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTransferState(PipeState value)
/*     */   {
/* 378 */     this.transferState = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Double getTspUsagePercentage()
/*     */   {
/* 390 */     return this.tspUsagePercentage;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTspUsagePercentage(Double value)
/*     */   {
/* 402 */     this.tspUsagePercentage = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 412 */     if (!(obj instanceof ConsistencyGroupCopyRecoveryActivity)) {
/* 413 */       return false;
/*     */     }
/* 415 */     ConsistencyGroupCopyRecoveryActivity otherObj = (ConsistencyGroupCopyRecoveryActivity)obj;
/*     */     
/* 417 */     return (super.equals(obj)) && (this.activeProductionCopy != null ? this.activeProductionCopy.equals(otherObj.activeProductionCopy) : this.activeProductionCopy == otherObj.activeProductionCopy) && (this.activityState != null ? this.activityState.equals(otherObj.activityState) : this.activityState == otherObj.activityState) && (this.canBeSetAsProduction == otherObj.canBeSetAsProduction) && (this.canGroupResumeProduction == otherObj.canGroupResumeProduction) && (this.copyName != null ? this.copyName.equals(otherObj.copyName) : this.copyName == otherObj.copyName) && (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.groupName != null ? this.groupName.equals(otherObj.groupName) : this.groupName == otherObj.groupName) && (this.imageAccessSizeLeftInBytes != null ? this.imageAccessSizeLeftInBytes.equals(otherObj.imageAccessSizeLeftInBytes) : this.imageAccessSizeLeftInBytes == otherObj.imageAccessSizeLeftInBytes) && (this.imageAccessTotalSizeInBytes != null ? this.imageAccessTotalSizeInBytes.equals(otherObj.imageAccessTotalSizeInBytes) : this.imageAccessTotalSizeInBytes == otherObj.imageAccessTotalSizeInBytes) && (this.inImageAccess == otherObj.inImageAccess) && (this.numOfVmStartUpActionState == otherObj.numOfVmStartUpActionState) && (this.transferEnabled == otherObj.transferEnabled) && (this.transferState != null ? this.transferState.equals(otherObj.transferState) : this.transferState == otherObj.transferState) && (this.tspUsagePercentage != null ? this.tspUsagePercentage.equals(otherObj.tspUsagePercentage) : this.tspUsagePercentage == otherObj.tspUsagePercentage);
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
/*     */   public int hashCode()
/*     */   {
/* 440 */     return super.hashCode() ^ (this.activeProductionCopy != null ? this.activeProductionCopy.hashCode() : 0) ^ (this.activityState != null ? this.activityState.hashCode() : 0) ^ (this.canBeSetAsProduction ? 1 : 0) ^ (this.canGroupResumeProduction ? 1 : 0) ^ (this.copyName != null ? this.copyName.hashCode() : 0) ^ (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.groupName != null ? this.groupName.hashCode() : 0) ^ (this.imageAccessSizeLeftInBytes != null ? this.imageAccessSizeLeftInBytes.hashCode() : 0) ^ (this.imageAccessTotalSizeInBytes != null ? this.imageAccessTotalSizeInBytes.hashCode() : 0) ^ (this.inImageAccess ? 1 : 0) ^ this.numOfVmStartUpActionState ^ (this.transferEnabled ? 1 : 0) ^ (this.transferState != null ? this.transferState.hashCode() : 0) ^ (this.tspUsagePercentage != null ? this.tspUsagePercentage.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 463 */     return "ConsistencyGroupCopyRecoveryActivity [super=" + super.toString() + ", " + "activeProductionCopy=" + this.activeProductionCopy + ", " + "activityState=" + this.activityState + ", " + "canBeSetAsProduction=" + this.canBeSetAsProduction + ", " + "canGroupResumeProduction=" + this.canGroupResumeProduction + ", " + "copyName=" + this.copyName + ", " + "copyUID=" + this.copyUID + ", " + "groupName=" + this.groupName + ", " + "imageAccessSizeLeftInBytes=" + this.imageAccessSizeLeftInBytes + ", " + "imageAccessTotalSizeInBytes=" + this.imageAccessTotalSizeInBytes + ", " + "inImageAccess=" + this.inImageAccess + ", " + "numOfVmStartUpActionState=" + this.numOfVmStartUpActionState + ", " + "transferEnabled=" + this.transferEnabled + ", " + "transferState=" + this.transferState + ", " + "tspUsagePercentage=" + this.tspUsagePercentage + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupCopyRecoveryActivity.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */