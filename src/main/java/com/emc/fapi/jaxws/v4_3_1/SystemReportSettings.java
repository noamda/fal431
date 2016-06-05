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
/*     */ 
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
/*     */ @XmlType(name="SystemReportSettings", propOrder={"esrsGatewayAddress", "includeSystemAlerts", "includeSystemReports", "senderEmail", "transferMethod", "usingCompression", "usingEncryption"})
/*     */ public class SystemReportSettings
/*     */ {
/*     */   protected String esrsGatewayAddress;
/*     */   protected boolean includeSystemAlerts;
/*     */   protected boolean includeSystemReports;
/*     */   protected String senderEmail;
/*     */   protected SystemReportTransferMethod transferMethod;
/*     */   protected boolean usingCompression;
/*     */   protected boolean usingEncryption;
/*     */   
/*     */   public SystemReportSettings() {}
/*     */   
/*     */   public SystemReportSettings(String esrsGatewayAddress, boolean includeSystemAlerts, boolean includeSystemReports, String senderEmail, SystemReportTransferMethod transferMethod, boolean usingCompression, boolean usingEncryption)
/*     */   {
/*  62 */     this.esrsGatewayAddress = esrsGatewayAddress;
/*  63 */     this.includeSystemAlerts = includeSystemAlerts;
/*  64 */     this.includeSystemReports = includeSystemReports;
/*  65 */     this.senderEmail = senderEmail;
/*  66 */     this.transferMethod = transferMethod;
/*  67 */     this.usingCompression = usingCompression;
/*  68 */     this.usingEncryption = usingEncryption;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getEsrsGatewayAddress()
/*     */   {
/*  80 */     return this.esrsGatewayAddress;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEsrsGatewayAddress(String value)
/*     */   {
/*  92 */     this.esrsGatewayAddress = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isIncludeSystemAlerts()
/*     */   {
/* 100 */     return this.includeSystemAlerts;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIncludeSystemAlerts(boolean value)
/*     */   {
/* 108 */     this.includeSystemAlerts = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isIncludeSystemReports()
/*     */   {
/* 116 */     return this.includeSystemReports;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIncludeSystemReports(boolean value)
/*     */   {
/* 124 */     this.includeSystemReports = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSenderEmail()
/*     */   {
/* 136 */     return this.senderEmail;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSenderEmail(String value)
/*     */   {
/* 148 */     this.senderEmail = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SystemReportTransferMethod getTransferMethod()
/*     */   {
/* 160 */     return this.transferMethod;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTransferMethod(SystemReportTransferMethod value)
/*     */   {
/* 172 */     this.transferMethod = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isUsingCompression()
/*     */   {
/* 180 */     return this.usingCompression;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUsingCompression(boolean value)
/*     */   {
/* 188 */     this.usingCompression = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isUsingEncryption()
/*     */   {
/* 196 */     return this.usingEncryption;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUsingEncryption(boolean value)
/*     */   {
/* 204 */     this.usingEncryption = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 214 */     if (!(obj instanceof SystemReportSettings)) {
/* 215 */       return false;
/*     */     }
/* 217 */     SystemReportSettings otherObj = (SystemReportSettings)obj;
/*     */     
/* 219 */     return (this.esrsGatewayAddress != null ? this.esrsGatewayAddress.equals(otherObj.esrsGatewayAddress) : this.esrsGatewayAddress == otherObj.esrsGatewayAddress) && (this.includeSystemAlerts == otherObj.includeSystemAlerts) && (this.includeSystemReports == otherObj.includeSystemReports) && (this.senderEmail != null ? this.senderEmail.equals(otherObj.senderEmail) : this.senderEmail == otherObj.senderEmail) && (this.transferMethod != null ? this.transferMethod.equals(otherObj.transferMethod) : this.transferMethod == otherObj.transferMethod) && (this.usingCompression == otherObj.usingCompression) && (this.usingEncryption == otherObj.usingEncryption);
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
/* 234 */     return (this.esrsGatewayAddress != null ? this.esrsGatewayAddress.hashCode() : 0) ^ (this.includeSystemAlerts ? 1 : 0) ^ (this.includeSystemReports ? 1 : 0) ^ (this.senderEmail != null ? this.senderEmail.hashCode() : 0) ^ (this.transferMethod != null ? this.transferMethod.hashCode() : 0) ^ (this.usingCompression ? 1 : 0) ^ (this.usingEncryption ? 1 : 0);
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
/* 249 */     return "SystemReportSettings [esrsGatewayAddress=" + this.esrsGatewayAddress + ", " + "includeSystemAlerts=" + this.includeSystemAlerts + ", " + "includeSystemReports=" + this.includeSystemReports + ", " + "senderEmail=" + this.senderEmail + ", " + "transferMethod=" + this.transferMethod + ", " + "usingCompression=" + this.usingCompression + ", " + "usingEncryption=" + this.usingEncryption + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SystemReportSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */