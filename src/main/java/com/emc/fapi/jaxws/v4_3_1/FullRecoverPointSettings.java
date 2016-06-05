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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="FullRecoverPointSettings", propOrder={"systemSettings", "splittersSettings", "groupsSettings", "groupsSetsSettings", "accountSettings", "managementSettings", "globalPolicy", "settingsConflict"})
/*     */ public class FullRecoverPointSettings
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected SystemSettings systemSettings;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClusterSplittersSettings> splittersSettings;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupSettings> groupsSettings;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupSetSettings> groupsSetsSettings;
/*     */   @XmlElement(nillable=true)
/*     */   protected AccountSettings accountSettings;
/*     */   @XmlElement(nillable=true)
/*     */   protected ManagementSettings managementSettings;
/*     */   protected SystemGlobalPolicy globalPolicy;
/*     */   protected boolean settingsConflict;
/*     */   
/*     */   public FullRecoverPointSettings() {}
/*     */   
/*     */   public FullRecoverPointSettings(SystemSettings systemSettings, List<ClusterSplittersSettings> splittersSettings, List<ConsistencyGroupSettings> groupsSettings, List<ConsistencyGroupSetSettings> groupsSetsSettings, AccountSettings accountSettings, ManagementSettings managementSettings, SystemGlobalPolicy globalPolicy, boolean settingsConflict)
/*     */   {
/*  74 */     this.systemSettings = systemSettings;
/*  75 */     this.splittersSettings = splittersSettings;
/*  76 */     this.groupsSettings = groupsSettings;
/*  77 */     this.groupsSetsSettings = groupsSetsSettings;
/*  78 */     this.accountSettings = accountSettings;
/*  79 */     this.managementSettings = managementSettings;
/*  80 */     this.globalPolicy = globalPolicy;
/*  81 */     this.settingsConflict = settingsConflict;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SystemSettings getSystemSettings()
/*     */   {
/*  93 */     return this.systemSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSystemSettings(SystemSettings value)
/*     */   {
/* 105 */     this.systemSettings = value;
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
/*     */   public List<ClusterSplittersSettings> getSplittersSettings()
/*     */   {
/* 131 */     if (this.splittersSettings == null) {
/* 132 */       this.splittersSettings = new ArrayList();
/*     */     }
/* 134 */     return this.splittersSettings;
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
/*     */   public List<ConsistencyGroupSettings> getGroupsSettings()
/*     */   {
/* 160 */     if (this.groupsSettings == null) {
/* 161 */       this.groupsSettings = new ArrayList();
/*     */     }
/* 163 */     return this.groupsSettings;
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
/*     */   public List<ConsistencyGroupSetSettings> getGroupsSetsSettings()
/*     */   {
/* 189 */     if (this.groupsSetsSettings == null) {
/* 190 */       this.groupsSetsSettings = new ArrayList();
/*     */     }
/* 192 */     return this.groupsSetsSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public AccountSettings getAccountSettings()
/*     */   {
/* 204 */     return this.accountSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAccountSettings(AccountSettings value)
/*     */   {
/* 216 */     this.accountSettings = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ManagementSettings getManagementSettings()
/*     */   {
/* 228 */     return this.managementSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setManagementSettings(ManagementSettings value)
/*     */   {
/* 240 */     this.managementSettings = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SystemGlobalPolicy getGlobalPolicy()
/*     */   {
/* 252 */     return this.globalPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGlobalPolicy(SystemGlobalPolicy value)
/*     */   {
/* 264 */     this.globalPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isSettingsConflict()
/*     */   {
/* 272 */     return this.settingsConflict;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSettingsConflict(boolean value)
/*     */   {
/* 280 */     this.settingsConflict = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 290 */     if (!(obj instanceof FullRecoverPointSettings)) {
/* 291 */       return false;
/*     */     }
/* 293 */     FullRecoverPointSettings otherObj = (FullRecoverPointSettings)obj;
/*     */     
/* 295 */     return (this.systemSettings != null ? this.systemSettings.equals(otherObj.systemSettings) : this.systemSettings == otherObj.systemSettings) && (this.splittersSettings != null ? this.splittersSettings.equals(otherObj.splittersSettings) : this.splittersSettings == otherObj.splittersSettings) && (this.groupsSettings != null ? this.groupsSettings.equals(otherObj.groupsSettings) : this.groupsSettings == otherObj.groupsSettings) && (this.groupsSetsSettings != null ? this.groupsSetsSettings.equals(otherObj.groupsSetsSettings) : this.groupsSetsSettings == otherObj.groupsSetsSettings) && (this.accountSettings != null ? this.accountSettings.equals(otherObj.accountSettings) : this.accountSettings == otherObj.accountSettings) && (this.managementSettings != null ? this.managementSettings.equals(otherObj.managementSettings) : this.managementSettings == otherObj.managementSettings) && (this.globalPolicy != null ? this.globalPolicy.equals(otherObj.globalPolicy) : this.globalPolicy == otherObj.globalPolicy) && (this.settingsConflict == otherObj.settingsConflict);
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
/*     */   public int hashCode()
/*     */   {
/* 311 */     return (this.systemSettings != null ? this.systemSettings.hashCode() : 0) ^ (this.splittersSettings != null ? this.splittersSettings.hashCode() : 0) ^ (this.groupsSettings != null ? this.groupsSettings.hashCode() : 0) ^ (this.groupsSetsSettings != null ? this.groupsSetsSettings.hashCode() : 0) ^ (this.accountSettings != null ? this.accountSettings.hashCode() : 0) ^ (this.managementSettings != null ? this.managementSettings.hashCode() : 0) ^ (this.globalPolicy != null ? this.globalPolicy.hashCode() : 0) ^ (this.settingsConflict ? 1 : 0);
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
/*     */   public String toString()
/*     */   {
/* 327 */     return "FullRecoverPointSettings [systemSettings=" + this.systemSettings + ", " + "splittersSettings=" + this.splittersSettings + ", " + "groupsSettings=" + this.groupsSettings + ", " + "groupsSetsSettings=" + this.groupsSetsSettings + ", " + "accountSettings=" + this.accountSettings + ", " + "managementSettings=" + this.managementSettings + ", " + "globalPolicy=" + this.globalPolicy + ", " + "settingsConflict=" + this.settingsConflict + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FullRecoverPointSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */