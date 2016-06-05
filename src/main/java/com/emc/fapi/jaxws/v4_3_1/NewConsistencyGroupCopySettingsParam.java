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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="NewConsistencyGroupCopySettingsParam", propOrder={"groupCopy", "groupLinksSettings", "transferEnabled", "productionCopy", "copyPolicy", "copyName", "enabled", "allowAutomaticEnable", "newJournalVolumes", "volumeCreationParams"})
/*     */ public class NewConsistencyGroupCopySettingsParam
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupCopyUID groupCopy;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupLinkSettings> groupLinksSettings;
/*     */   protected boolean transferEnabled;
/*     */   protected boolean productionCopy;
/*     */   protected ConsistencyGroupCopyPolicy copyPolicy;
/*     */   @XmlElement(required=true)
/*     */   protected String copyName;
/*     */   protected boolean enabled;
/*     */   protected boolean allowAutomaticEnable;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<DeviceUID> newJournalVolumes;
/*     */   protected ConsistencyGroupCopyVolumeCreationParams volumeCreationParams;
/*     */   
/*     */   public NewConsistencyGroupCopySettingsParam() {}
/*     */   
/*     */   public NewConsistencyGroupCopySettingsParam(ConsistencyGroupCopyUID groupCopy, List<ConsistencyGroupLinkSettings> groupLinksSettings, boolean transferEnabled, boolean productionCopy, ConsistencyGroupCopyPolicy copyPolicy, String copyName, boolean enabled, boolean allowAutomaticEnable, List<DeviceUID> newJournalVolumes, ConsistencyGroupCopyVolumeCreationParams volumeCreationParams)
/*     */   {
/*  78 */     this.groupCopy = groupCopy;
/*  79 */     this.groupLinksSettings = groupLinksSettings;
/*  80 */     this.transferEnabled = transferEnabled;
/*  81 */     this.productionCopy = productionCopy;
/*  82 */     this.copyPolicy = copyPolicy;
/*  83 */     this.copyName = copyName;
/*  84 */     this.enabled = enabled;
/*  85 */     this.allowAutomaticEnable = allowAutomaticEnable;
/*  86 */     this.newJournalVolumes = newJournalVolumes;
/*  87 */     this.volumeCreationParams = volumeCreationParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getGroupCopy()
/*     */   {
/*  99 */     return this.groupCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupCopy(ConsistencyGroupCopyUID value)
/*     */   {
/* 111 */     this.groupCopy = value;
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
/*     */   public List<ConsistencyGroupLinkSettings> getGroupLinksSettings()
/*     */   {
/* 137 */     if (this.groupLinksSettings == null) {
/* 138 */       this.groupLinksSettings = new ArrayList();
/*     */     }
/* 140 */     return this.groupLinksSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isTransferEnabled()
/*     */   {
/* 148 */     return this.transferEnabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTransferEnabled(boolean value)
/*     */   {
/* 156 */     this.transferEnabled = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isProductionCopy()
/*     */   {
/* 164 */     return this.productionCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setProductionCopy(boolean value)
/*     */   {
/* 172 */     this.productionCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyPolicy getCopyPolicy()
/*     */   {
/* 184 */     return this.copyPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCopyPolicy(ConsistencyGroupCopyPolicy value)
/*     */   {
/* 196 */     this.copyPolicy = value;
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
/* 208 */     return this.copyName;
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
/* 220 */     this.copyName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isEnabled()
/*     */   {
/* 228 */     return this.enabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEnabled(boolean value)
/*     */   {
/* 236 */     this.enabled = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isAllowAutomaticEnable()
/*     */   {
/* 244 */     return this.allowAutomaticEnable;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAllowAutomaticEnable(boolean value)
/*     */   {
/* 252 */     this.allowAutomaticEnable = value;
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
/* 278 */     if (this.newJournalVolumes == null) {
/* 279 */       this.newJournalVolumes = new ArrayList();
/*     */     }
/* 281 */     return this.newJournalVolumes;
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
/* 293 */     return this.volumeCreationParams;
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
/* 305 */     this.volumeCreationParams = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 315 */     if (!(obj instanceof NewConsistencyGroupCopySettingsParam)) {
/* 316 */       return false;
/*     */     }
/* 318 */     NewConsistencyGroupCopySettingsParam otherObj = (NewConsistencyGroupCopySettingsParam)obj;
/*     */     
/* 320 */     return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.groupLinksSettings != null ? this.groupLinksSettings.equals(otherObj.groupLinksSettings) : this.groupLinksSettings == otherObj.groupLinksSettings) && (this.transferEnabled == otherObj.transferEnabled) && (this.productionCopy == otherObj.productionCopy) && (this.copyPolicy != null ? this.copyPolicy.equals(otherObj.copyPolicy) : this.copyPolicy == otherObj.copyPolicy) && (this.copyName != null ? this.copyName.equals(otherObj.copyName) : this.copyName == otherObj.copyName) && (this.enabled == otherObj.enabled) && (this.allowAutomaticEnable == otherObj.allowAutomaticEnable) && (this.newJournalVolumes != null ? this.newJournalVolumes.equals(otherObj.newJournalVolumes) : this.newJournalVolumes == otherObj.newJournalVolumes) && (this.volumeCreationParams != null ? this.volumeCreationParams.equals(otherObj.volumeCreationParams) : this.volumeCreationParams == otherObj.volumeCreationParams);
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
/*     */   public int hashCode()
/*     */   {
/* 338 */     return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.groupLinksSettings != null ? this.groupLinksSettings.hashCode() : 0) ^ (this.transferEnabled ? 1 : 0) ^ (this.productionCopy ? 1 : 0) ^ (this.copyPolicy != null ? this.copyPolicy.hashCode() : 0) ^ (this.copyName != null ? this.copyName.hashCode() : 0) ^ (this.enabled ? 1 : 0) ^ (this.allowAutomaticEnable ? 1 : 0) ^ (this.newJournalVolumes != null ? this.newJournalVolumes.hashCode() : 0) ^ (this.volumeCreationParams != null ? this.volumeCreationParams.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 356 */     return "NewConsistencyGroupCopySettingsParam [groupCopy=" + this.groupCopy + ", " + "groupLinksSettings=" + this.groupLinksSettings + ", " + "transferEnabled=" + this.transferEnabled + ", " + "productionCopy=" + this.productionCopy + ", " + "copyPolicy=" + this.copyPolicy + ", " + "copyName=" + this.copyName + ", " + "enabled=" + this.enabled + ", " + "allowAutomaticEnable=" + this.allowAutomaticEnable + ", " + "newJournalVolumes=" + this.newJournalVolumes + ", " + "volumeCreationParams=" + this.volumeCreationParams + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\NewConsistencyGroupCopySettingsParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */