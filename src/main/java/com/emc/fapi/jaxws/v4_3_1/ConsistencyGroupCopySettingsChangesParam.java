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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupCopySettingsChangesParam", propOrder={"copyUID", "newJournalVolumes", "removedJournalVolumes", "volumeCreationParams", "activationParams"})
/*     */ public class ConsistencyGroupCopySettingsChangesParam
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupCopyUID copyUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<DeviceUID> newJournalVolumes;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<DeviceUID> removedJournalVolumes;
/*     */   protected ConsistencyGroupCopyVolumeCreationParams volumeCreationParams;
/*     */   protected ActivationSettingsChangesParams activationParams;
/*     */   
/*     */   public ConsistencyGroupCopySettingsChangesParam() {}
/*     */   
/*     */   public ConsistencyGroupCopySettingsChangesParam(ConsistencyGroupCopyUID copyUID, List<DeviceUID> newJournalVolumes, List<DeviceUID> removedJournalVolumes, ConsistencyGroupCopyVolumeCreationParams volumeCreationParams, ActivationSettingsChangesParams activationParams)
/*     */   {
/*  62 */     this.copyUID = copyUID;
/*  63 */     this.newJournalVolumes = newJournalVolumes;
/*  64 */     this.removedJournalVolumes = removedJournalVolumes;
/*  65 */     this.volumeCreationParams = volumeCreationParams;
/*  66 */     this.activationParams = activationParams;
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
/*  78 */     return this.copyUID;
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
/*  90 */     this.copyUID = value;
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
/*     */   public List<DeviceUID> getNewJournalVolumes()
/*     */   {
/* 116 */     if (this.newJournalVolumes == null) {
/* 117 */       this.newJournalVolumes = new ArrayList();
/*     */     }
/* 119 */     return this.newJournalVolumes;
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
/*     */   public List<DeviceUID> getRemovedJournalVolumes()
/*     */   {
/* 145 */     if (this.removedJournalVolumes == null) {
/* 146 */       this.removedJournalVolumes = new ArrayList();
/*     */     }
/* 148 */     return this.removedJournalVolumes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyVolumeCreationParams getVolumeCreationParams()
/*     */   {
/* 160 */     return this.volumeCreationParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolumeCreationParams(ConsistencyGroupCopyVolumeCreationParams value)
/*     */   {
/* 172 */     this.volumeCreationParams = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ActivationSettingsChangesParams getActivationParams()
/*     */   {
/* 184 */     return this.activationParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setActivationParams(ActivationSettingsChangesParams value)
/*     */   {
/* 196 */     this.activationParams = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 206 */     if (!(obj instanceof ConsistencyGroupCopySettingsChangesParam)) {
/* 207 */       return false;
/*     */     }
/* 209 */     ConsistencyGroupCopySettingsChangesParam otherObj = (ConsistencyGroupCopySettingsChangesParam)obj;
/*     */     
/* 211 */     return (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.newJournalVolumes != null ? this.newJournalVolumes.equals(otherObj.newJournalVolumes) : this.newJournalVolumes == otherObj.newJournalVolumes) && (this.removedJournalVolumes != null ? this.removedJournalVolumes.equals(otherObj.removedJournalVolumes) : this.removedJournalVolumes == otherObj.removedJournalVolumes) && (this.volumeCreationParams != null ? this.volumeCreationParams.equals(otherObj.volumeCreationParams) : this.volumeCreationParams == otherObj.volumeCreationParams) && (this.activationParams != null ? this.activationParams.equals(otherObj.activationParams) : this.activationParams == otherObj.activationParams);
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
/*     */   public int hashCode()
/*     */   {
/* 224 */     return (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.newJournalVolumes != null ? this.newJournalVolumes.hashCode() : 0) ^ (this.removedJournalVolumes != null ? this.removedJournalVolumes.hashCode() : 0) ^ (this.volumeCreationParams != null ? this.volumeCreationParams.hashCode() : 0) ^ (this.activationParams != null ? this.activationParams.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 237 */     return "ConsistencyGroupCopySettingsChangesParam [copyUID=" + this.copyUID + ", " + "newJournalVolumes=" + this.newJournalVolumes + ", " + "removedJournalVolumes=" + this.removedJournalVolumes + ", " + "volumeCreationParams=" + this.volumeCreationParams + ", " + "activationParams=" + this.activationParams + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupCopySettingsChangesParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */