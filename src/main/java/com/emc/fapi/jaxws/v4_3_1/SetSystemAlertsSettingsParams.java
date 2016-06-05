/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="setSystemAlertsSettingsParams", propOrder={"systemAlertsSettings", "requestedSmtpServerAddress"})
/*     */ public class SetSystemAlertsSettingsParams
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected SystemAlertsSettings systemAlertsSettings;
/*     */   protected String requestedSmtpServerAddress;
/*     */   
/*     */   public SetSystemAlertsSettingsParams() {}
/*     */   
/*     */   public SetSystemAlertsSettingsParams(SystemAlertsSettings systemAlertsSettings, String requestedSmtpServerAddress)
/*     */   {
/*  56 */     this.systemAlertsSettings = systemAlertsSettings;
/*  57 */     this.requestedSmtpServerAddress = requestedSmtpServerAddress;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SystemAlertsSettings getSystemAlertsSettings()
/*     */   {
/*  69 */     return this.systemAlertsSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSystemAlertsSettings(SystemAlertsSettings value)
/*     */   {
/*  81 */     this.systemAlertsSettings = value;
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
/*  93 */     return this.requestedSmtpServerAddress;
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
/* 105 */     this.requestedSmtpServerAddress = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 115 */     if (!(obj instanceof SetSystemAlertsSettingsParams)) {
/* 116 */       return false;
/*     */     }
/* 118 */     SetSystemAlertsSettingsParams otherObj = (SetSystemAlertsSettingsParams)obj;
/*     */     
/* 120 */     return (this.systemAlertsSettings != null ? this.systemAlertsSettings.equals(otherObj.systemAlertsSettings) : this.systemAlertsSettings == otherObj.systemAlertsSettings) && (this.requestedSmtpServerAddress != null ? this.requestedSmtpServerAddress.equals(otherObj.requestedSmtpServerAddress) : this.requestedSmtpServerAddress == otherObj.requestedSmtpServerAddress);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 130 */     return (this.systemAlertsSettings != null ? this.systemAlertsSettings.hashCode() : 0) ^ (this.requestedSmtpServerAddress != null ? this.requestedSmtpServerAddress.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 140 */     return "SetSystemAlertsSettingsParams [systemAlertsSettings=" + this.systemAlertsSettings + ", " + "requestedSmtpServerAddress=" + this.requestedSmtpServerAddress + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetSystemAlertsSettingsParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */