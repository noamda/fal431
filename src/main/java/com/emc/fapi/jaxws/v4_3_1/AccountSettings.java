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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="AccountSettings", propOrder={"contactInfo", "licenses"})
/*     */ public class AccountSettings
/*     */ {
/*     */   protected String contactInfo;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<LicenseSettings> licenses;
/*     */   
/*     */   public AccountSettings() {}
/*     */   
/*     */   public AccountSettings(String contactInfo, List<LicenseSettings> licenses)
/*     */   {
/*  51 */     this.contactInfo = contactInfo;
/*  52 */     this.licenses = licenses;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getContactInfo()
/*     */   {
/*  64 */     return this.contactInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setContactInfo(String value)
/*     */   {
/*  76 */     this.contactInfo = value;
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
/*     */   public List<LicenseSettings> getLicenses()
/*     */   {
/* 102 */     if (this.licenses == null) {
/* 103 */       this.licenses = new ArrayList();
/*     */     }
/* 105 */     return this.licenses;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 115 */     if (!(obj instanceof AccountSettings)) {
/* 116 */       return false;
/*     */     }
/* 118 */     AccountSettings otherObj = (AccountSettings)obj;
/*     */     
/* 120 */     return (this.contactInfo != null ? this.contactInfo.equals(otherObj.contactInfo) : this.contactInfo == otherObj.contactInfo) && (this.licenses != null ? this.licenses.equals(otherObj.licenses) : this.licenses == otherObj.licenses);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 130 */     return (this.contactInfo != null ? this.contactInfo.hashCode() : 0) ^ (this.licenses != null ? this.licenses.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 140 */     return "AccountSettings [contactInfo=" + this.contactInfo + ", " + "licenses=" + this.licenses + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AccountSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */