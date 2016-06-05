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
/*     */ @XmlType(name="setSystemReportSettingsParams", propOrder={"systemReportSettings", "requestedSmtpServerAddress"})
/*     */ public class SetSystemReportSettingsParams
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected SystemReportSettings systemReportSettings;
/*     */   protected String requestedSmtpServerAddress;
/*     */   
/*     */   public SetSystemReportSettingsParams() {}
/*     */   
/*     */   public SetSystemReportSettingsParams(SystemReportSettings systemReportSettings, String requestedSmtpServerAddress)
/*     */   {
/*  56 */     this.systemReportSettings = systemReportSettings;
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
/*     */   public SystemReportSettings getSystemReportSettings()
/*     */   {
/*  69 */     return this.systemReportSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSystemReportSettings(SystemReportSettings value)
/*     */   {
/*  81 */     this.systemReportSettings = value;
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
/* 115 */     if (!(obj instanceof SetSystemReportSettingsParams)) {
/* 116 */       return false;
/*     */     }
/* 118 */     SetSystemReportSettingsParams otherObj = (SetSystemReportSettingsParams)obj;
/*     */     
/* 120 */     return (this.systemReportSettings != null ? this.systemReportSettings.equals(otherObj.systemReportSettings) : this.systemReportSettings == otherObj.systemReportSettings) && (this.requestedSmtpServerAddress != null ? this.requestedSmtpServerAddress.equals(otherObj.requestedSmtpServerAddress) : this.requestedSmtpServerAddress == otherObj.requestedSmtpServerAddress);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 130 */     return (this.systemReportSettings != null ? this.systemReportSettings.hashCode() : 0) ^ (this.requestedSmtpServerAddress != null ? this.requestedSmtpServerAddress.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 140 */     return "SetSystemReportSettingsParams [systemReportSettings=" + this.systemReportSettings + ", " + "requestedSmtpServerAddress=" + this.requestedSmtpServerAddress + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetSystemReportSettingsParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */