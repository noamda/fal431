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
/*     */ @XmlType(name="SystemAlertsSettings", propOrder={"emailFilters", "enabled", "sendDailyInfoToEMCSupport", "senderEmailAddress"})
/*     */ public class SystemAlertsSettings
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<EmailFilterData> emailFilters;
/*     */   protected boolean enabled;
/*     */   protected boolean sendDailyInfoToEMCSupport;
/*     */   protected String senderEmailAddress;
/*     */   
/*     */   public SystemAlertsSettings() {}
/*     */   
/*     */   public SystemAlertsSettings(List<EmailFilterData> emailFilters, boolean enabled, boolean sendDailyInfoToEMCSupport, String senderEmailAddress)
/*     */   {
/*  57 */     this.emailFilters = emailFilters;
/*  58 */     this.enabled = enabled;
/*  59 */     this.sendDailyInfoToEMCSupport = sendDailyInfoToEMCSupport;
/*  60 */     this.senderEmailAddress = senderEmailAddress;
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
/*     */   public List<EmailFilterData> getEmailFilters()
/*     */   {
/*  86 */     if (this.emailFilters == null) {
/*  87 */       this.emailFilters = new ArrayList();
/*     */     }
/*  89 */     return this.emailFilters;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isEnabled()
/*     */   {
/*  97 */     return this.enabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEnabled(boolean value)
/*     */   {
/* 105 */     this.enabled = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isSendDailyInfoToEMCSupport()
/*     */   {
/* 113 */     return this.sendDailyInfoToEMCSupport;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSendDailyInfoToEMCSupport(boolean value)
/*     */   {
/* 121 */     this.sendDailyInfoToEMCSupport = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSenderEmailAddress()
/*     */   {
/* 133 */     return this.senderEmailAddress;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSenderEmailAddress(String value)
/*     */   {
/* 145 */     this.senderEmailAddress = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 155 */     if (!(obj instanceof SystemAlertsSettings)) {
/* 156 */       return false;
/*     */     }
/* 158 */     SystemAlertsSettings otherObj = (SystemAlertsSettings)obj;
/*     */     
/* 160 */     return (this.emailFilters != null ? this.emailFilters.equals(otherObj.emailFilters) : this.emailFilters == otherObj.emailFilters) && (this.enabled == otherObj.enabled) && (this.sendDailyInfoToEMCSupport == otherObj.sendDailyInfoToEMCSupport) && (this.senderEmailAddress != null ? this.senderEmailAddress.equals(otherObj.senderEmailAddress) : this.senderEmailAddress == otherObj.senderEmailAddress);
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
/* 172 */     return (this.emailFilters != null ? this.emailFilters.hashCode() : 0) ^ (this.enabled ? 1 : 0) ^ (this.sendDailyInfoToEMCSupport ? 1 : 0) ^ (this.senderEmailAddress != null ? this.senderEmailAddress.hashCode() : 0);
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
/* 184 */     return "SystemAlertsSettings [emailFilters=" + this.emailFilters + ", " + "enabled=" + this.enabled + ", " + "sendDailyInfoToEMCSupport=" + this.sendDailyInfoToEMCSupport + ", " + "senderEmailAddress=" + this.senderEmailAddress + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SystemAlertsSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */