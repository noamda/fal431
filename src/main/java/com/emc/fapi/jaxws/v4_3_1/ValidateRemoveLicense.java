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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="validateRemoveLicense", propOrder={"license"})
/*     */ public class ValidateRemoveLicense
/*     */ {
/*     */   protected LicenseUID license;
/*     */   
/*     */   public ValidateRemoveLicense() {}
/*     */   
/*     */   public ValidateRemoveLicense(LicenseUID license)
/*     */   {
/*  44 */     this.license = license;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public LicenseUID getLicense()
/*     */   {
/*  56 */     return this.license;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLicense(LicenseUID value)
/*     */   {
/*  68 */     this.license = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof ValidateRemoveLicense)) {
/*  79 */       return false;
/*     */     }
/*  81 */     ValidateRemoveLicense otherObj = (ValidateRemoveLicense)obj;
/*     */     
/*  83 */     return this.license == otherObj.license ? true : this.license != null ? this.license.equals(otherObj.license) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.license != null ? this.license.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "ValidateRemoveLicense [license=" + this.license + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateRemoveLicense.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */