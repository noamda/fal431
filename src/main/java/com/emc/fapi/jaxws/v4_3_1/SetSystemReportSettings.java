/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="setSystemReportSettings", propOrder={"settings", "requestedSmtpServerAddress"})
/*     */ public class SetSystemReportSettings
/*     */ {
/*     */   protected SystemReportSettings settings;
/*     */   protected String requestedSmtpServerAddress;
/*     */   
/*     */   public SetSystemReportSettings() {}
/*     */   
/*     */   public SetSystemReportSettings(SystemReportSettings settings, String requestedSmtpServerAddress)
/*     */   {
/*  47 */     this.settings = settings;
/*  48 */     this.requestedSmtpServerAddress = requestedSmtpServerAddress;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SystemReportSettings getSettings()
/*     */   {
/*  60 */     return this.settings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSettings(SystemReportSettings value)
/*     */   {
/*  72 */     this.settings = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getRequestedSmtpServerAddress()
/*     */   {
/*  84 */     return this.requestedSmtpServerAddress;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRequestedSmtpServerAddress(String value)
/*     */   {
/*  96 */     this.requestedSmtpServerAddress = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof SetSystemReportSettings)) {
/* 107 */       return false;
/*     */     }
/* 109 */     SetSystemReportSettings otherObj = (SetSystemReportSettings)obj;
/*     */     
/* 111 */     return (this.settings != null ? this.settings.equals(otherObj.settings) : this.settings == otherObj.settings) && (this.requestedSmtpServerAddress != null ? this.requestedSmtpServerAddress.equals(otherObj.requestedSmtpServerAddress) : this.requestedSmtpServerAddress == otherObj.requestedSmtpServerAddress);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.settings != null ? this.settings.hashCode() : 0) ^ (this.requestedSmtpServerAddress != null ? this.requestedSmtpServerAddress.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "SetSystemReportSettings [settings=" + this.settings + ", " + "requestedSmtpServerAddress=" + this.requestedSmtpServerAddress + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetSystemReportSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */