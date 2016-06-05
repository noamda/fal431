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
/*     */ @XmlType(name="CertificateInformation", propOrder={"issuerDN", "md5", "pemCertificate", "sha1", "subjectDN", "validNotAfter", "validNotBefore"})
/*     */ public class CertificateInformation
/*     */ {
/*     */   protected String issuerDN;
/*     */   protected String md5;
/*     */   protected String pemCertificate;
/*     */   protected String sha1;
/*     */   protected String subjectDN;
/*     */   protected String validNotAfter;
/*     */   protected String validNotBefore;
/*     */   
/*     */   public CertificateInformation() {}
/*     */   
/*     */   public CertificateInformation(String issuerDN, String md5, String pemCertificate, String sha1, String subjectDN, String validNotAfter, String validNotBefore)
/*     */   {
/*  62 */     this.issuerDN = issuerDN;
/*  63 */     this.md5 = md5;
/*  64 */     this.pemCertificate = pemCertificate;
/*  65 */     this.sha1 = sha1;
/*  66 */     this.subjectDN = subjectDN;
/*  67 */     this.validNotAfter = validNotAfter;
/*  68 */     this.validNotBefore = validNotBefore;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getIssuerDN()
/*     */   {
/*  80 */     return this.issuerDN;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIssuerDN(String value)
/*     */   {
/*  92 */     this.issuerDN = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getMd5()
/*     */   {
/* 104 */     return this.md5;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMd5(String value)
/*     */   {
/* 116 */     this.md5 = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getPemCertificate()
/*     */   {
/* 128 */     return this.pemCertificate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPemCertificate(String value)
/*     */   {
/* 140 */     this.pemCertificate = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSha1()
/*     */   {
/* 152 */     return this.sha1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSha1(String value)
/*     */   {
/* 164 */     this.sha1 = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSubjectDN()
/*     */   {
/* 176 */     return this.subjectDN;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSubjectDN(String value)
/*     */   {
/* 188 */     this.subjectDN = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getValidNotAfter()
/*     */   {
/* 200 */     return this.validNotAfter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setValidNotAfter(String value)
/*     */   {
/* 212 */     this.validNotAfter = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getValidNotBefore()
/*     */   {
/* 224 */     return this.validNotBefore;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setValidNotBefore(String value)
/*     */   {
/* 236 */     this.validNotBefore = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 246 */     if (!(obj instanceof CertificateInformation)) {
/* 247 */       return false;
/*     */     }
/* 249 */     CertificateInformation otherObj = (CertificateInformation)obj;
/*     */     
/* 251 */     return (this.issuerDN != null ? this.issuerDN.equals(otherObj.issuerDN) : this.issuerDN == otherObj.issuerDN) && (this.md5 != null ? this.md5.equals(otherObj.md5) : this.md5 == otherObj.md5) && (this.pemCertificate != null ? this.pemCertificate.equals(otherObj.pemCertificate) : this.pemCertificate == otherObj.pemCertificate) && (this.sha1 != null ? this.sha1.equals(otherObj.sha1) : this.sha1 == otherObj.sha1) && (this.subjectDN != null ? this.subjectDN.equals(otherObj.subjectDN) : this.subjectDN == otherObj.subjectDN) && (this.validNotAfter != null ? this.validNotAfter.equals(otherObj.validNotAfter) : this.validNotAfter == otherObj.validNotAfter) && (this.validNotBefore != null ? this.validNotBefore.equals(otherObj.validNotBefore) : this.validNotBefore == otherObj.validNotBefore);
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
/* 266 */     return (this.issuerDN != null ? this.issuerDN.hashCode() : 0) ^ (this.md5 != null ? this.md5.hashCode() : 0) ^ (this.pemCertificate != null ? this.pemCertificate.hashCode() : 0) ^ (this.sha1 != null ? this.sha1.hashCode() : 0) ^ (this.subjectDN != null ? this.subjectDN.hashCode() : 0) ^ (this.validNotAfter != null ? this.validNotAfter.hashCode() : 0) ^ (this.validNotBefore != null ? this.validNotBefore.hashCode() : 0);
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
/* 281 */     return "CertificateInformation [issuerDN=" + this.issuerDN + ", " + "md5=" + this.md5 + ", " + "pemCertificate=" + this.pemCertificate + ", " + "sha1=" + this.sha1 + ", " + "subjectDN=" + this.subjectDN + ", " + "validNotAfter=" + this.validNotAfter + ", " + "validNotBefore=" + this.validNotBefore + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CertificateInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */