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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SystemSettings", propOrder={"clustersSettings", "globalSystemConfiguration", "suppressAutoRegistrationWarning", "trialAllowed"})
/*     */ public class SystemSettings
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClusterSettings> clustersSettings;
/*     */   @XmlElement(nillable=true)
/*     */   protected GlobalSystemConfiguration globalSystemConfiguration;
/*     */   protected boolean suppressAutoRegistrationWarning;
/*     */   protected boolean trialAllowed;
/*     */   
/*     */   public SystemSettings() {}
/*     */   
/*     */   public SystemSettings(List<ClusterSettings> clustersSettings, GlobalSystemConfiguration globalSystemConfiguration, boolean suppressAutoRegistrationWarning, boolean trialAllowed)
/*     */   {
/*  58 */     this.clustersSettings = clustersSettings;
/*  59 */     this.globalSystemConfiguration = globalSystemConfiguration;
/*  60 */     this.suppressAutoRegistrationWarning = suppressAutoRegistrationWarning;
/*  61 */     this.trialAllowed = trialAllowed;
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
/*     */   public List<ClusterSettings> getClustersSettings()
/*     */   {
/*  87 */     if (this.clustersSettings == null) {
/*  88 */       this.clustersSettings = new ArrayList();
/*     */     }
/*  90 */     return this.clustersSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GlobalSystemConfiguration getGlobalSystemConfiguration()
/*     */   {
/* 102 */     return this.globalSystemConfiguration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGlobalSystemConfiguration(GlobalSystemConfiguration value)
/*     */   {
/* 114 */     this.globalSystemConfiguration = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isSuppressAutoRegistrationWarning()
/*     */   {
/* 122 */     return this.suppressAutoRegistrationWarning;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSuppressAutoRegistrationWarning(boolean value)
/*     */   {
/* 130 */     this.suppressAutoRegistrationWarning = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isTrialAllowed()
/*     */   {
/* 138 */     return this.trialAllowed;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTrialAllowed(boolean value)
/*     */   {
/* 146 */     this.trialAllowed = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 156 */     if (!(obj instanceof SystemSettings)) {
/* 157 */       return false;
/*     */     }
/* 159 */     SystemSettings otherObj = (SystemSettings)obj;
/*     */     
/* 161 */     return (this.clustersSettings != null ? this.clustersSettings.equals(otherObj.clustersSettings) : this.clustersSettings == otherObj.clustersSettings) && (this.globalSystemConfiguration != null ? this.globalSystemConfiguration.equals(otherObj.globalSystemConfiguration) : this.globalSystemConfiguration == otherObj.globalSystemConfiguration) && (this.suppressAutoRegistrationWarning == otherObj.suppressAutoRegistrationWarning) && (this.trialAllowed == otherObj.trialAllowed);
/*     */   }
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
/* 173 */     return (this.clustersSettings != null ? this.clustersSettings.hashCode() : 0) ^ (this.globalSystemConfiguration != null ? this.globalSystemConfiguration.hashCode() : 0) ^ (this.suppressAutoRegistrationWarning ? 1 : 0) ^ (this.trialAllowed ? 1 : 0);
/*     */   }
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
/* 185 */     return "SystemSettings [clustersSettings=" + this.clustersSettings + ", " + "globalSystemConfiguration=" + this.globalSystemConfiguration + ", " + "suppressAutoRegistrationWarning=" + this.suppressAutoRegistrationWarning + ", " + "trialAllowed=" + this.trialAllowed + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SystemSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */