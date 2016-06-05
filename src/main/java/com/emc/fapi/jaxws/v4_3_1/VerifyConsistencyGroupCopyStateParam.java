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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VerifyConsistencyGroupCopyStateParam", propOrder={"copyUID", "enabled", "activePrimaryRPA", "secondaryRPAs", "possibleJournalStates", "accessedImageTime", "possibleStorageAccessStates"})
/*     */ public class VerifyConsistencyGroupCopyStateParam
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupCopyUID copyUID;
/*     */   protected Boolean enabled;
/*     */   protected Integer activePrimaryRPA;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<Integer> secondaryRPAs;
/*     */   @XmlElement(required=true)
/*     */   protected List<JournalState> possibleJournalStates;
/*     */   protected TimeFrame accessedImageTime;
/*     */   @XmlElement(required=true)
/*     */   protected List<StorageAccessState> possibleStorageAccessStates;
/*     */   
/*     */   public VerifyConsistencyGroupCopyStateParam() {}
/*     */   
/*     */   public VerifyConsistencyGroupCopyStateParam(ConsistencyGroupCopyUID copyUID, Boolean enabled, Integer activePrimaryRPA, List<Integer> secondaryRPAs, List<JournalState> possibleJournalStates, TimeFrame accessedImageTime, List<StorageAccessState> possibleStorageAccessStates)
/*     */   {
/*  69 */     this.copyUID = copyUID;
/*  70 */     this.enabled = enabled;
/*  71 */     this.activePrimaryRPA = activePrimaryRPA;
/*  72 */     this.secondaryRPAs = secondaryRPAs;
/*  73 */     this.possibleJournalStates = possibleJournalStates;
/*  74 */     this.accessedImageTime = accessedImageTime;
/*  75 */     this.possibleStorageAccessStates = possibleStorageAccessStates;
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
/*  87 */     return this.copyUID;
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
/*  99 */     this.copyUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isEnabled()
/*     */   {
/* 111 */     return this.enabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEnabled(Boolean value)
/*     */   {
/* 123 */     this.enabled = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Integer getActivePrimaryRPA()
/*     */   {
/* 135 */     return this.activePrimaryRPA;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setActivePrimaryRPA(Integer value)
/*     */   {
/* 147 */     this.activePrimaryRPA = value;
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
/*     */   public List<Integer> getSecondaryRPAs()
/*     */   {
/* 173 */     if (this.secondaryRPAs == null) {
/* 174 */       this.secondaryRPAs = new ArrayList();
/*     */     }
/* 176 */     return this.secondaryRPAs;
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
/*     */   public List<JournalState> getPossibleJournalStates()
/*     */   {
/* 202 */     if (this.possibleJournalStates == null) {
/* 203 */       this.possibleJournalStates = new ArrayList();
/*     */     }
/* 205 */     return this.possibleJournalStates;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public TimeFrame getAccessedImageTime()
/*     */   {
/* 217 */     return this.accessedImageTime;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAccessedImageTime(TimeFrame value)
/*     */   {
/* 229 */     this.accessedImageTime = value;
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
/*     */   public List<StorageAccessState> getPossibleStorageAccessStates()
/*     */   {
/* 255 */     if (this.possibleStorageAccessStates == null) {
/* 256 */       this.possibleStorageAccessStates = new ArrayList();
/*     */     }
/* 258 */     return this.possibleStorageAccessStates;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 268 */     if (!(obj instanceof VerifyConsistencyGroupCopyStateParam)) {
/* 269 */       return false;
/*     */     }
/* 271 */     VerifyConsistencyGroupCopyStateParam otherObj = (VerifyConsistencyGroupCopyStateParam)obj;
/*     */     
/* 273 */     return (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.enabled != null ? this.enabled.equals(otherObj.enabled) : this.enabled == otherObj.enabled) && (this.activePrimaryRPA != null ? this.activePrimaryRPA.equals(otherObj.activePrimaryRPA) : this.activePrimaryRPA == otherObj.activePrimaryRPA) && (this.secondaryRPAs != null ? this.secondaryRPAs.equals(otherObj.secondaryRPAs) : this.secondaryRPAs == otherObj.secondaryRPAs) && (this.possibleJournalStates != null ? this.possibleJournalStates.equals(otherObj.possibleJournalStates) : this.possibleJournalStates == otherObj.possibleJournalStates) && (this.accessedImageTime != null ? this.accessedImageTime.equals(otherObj.accessedImageTime) : this.accessedImageTime == otherObj.accessedImageTime) && (this.possibleStorageAccessStates != null ? this.possibleStorageAccessStates.equals(otherObj.possibleStorageAccessStates) : this.possibleStorageAccessStates == otherObj.possibleStorageAccessStates);
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
/*     */   public int hashCode()
/*     */   {
/* 288 */     return (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.enabled != null ? this.enabled.hashCode() : 0) ^ (this.activePrimaryRPA != null ? this.activePrimaryRPA.hashCode() : 0) ^ (this.secondaryRPAs != null ? this.secondaryRPAs.hashCode() : 0) ^ (this.possibleJournalStates != null ? this.possibleJournalStates.hashCode() : 0) ^ (this.accessedImageTime != null ? this.accessedImageTime.hashCode() : 0) ^ (this.possibleStorageAccessStates != null ? this.possibleStorageAccessStates.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 303 */     return "VerifyConsistencyGroupCopyStateParam [copyUID=" + this.copyUID + ", " + "enabled=" + this.enabled + ", " + "activePrimaryRPA=" + this.activePrimaryRPA + ", " + "secondaryRPAs=" + this.secondaryRPAs + ", " + "possibleJournalStates=" + this.possibleJournalStates + ", " + "accessedImageTime=" + this.accessedImageTime + ", " + "possibleStorageAccessStates=" + this.possibleStorageAccessStates + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VerifyConsistencyGroupCopyStateParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */