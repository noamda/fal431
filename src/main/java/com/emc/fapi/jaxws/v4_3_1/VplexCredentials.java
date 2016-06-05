/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonTypeName;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeName("VplexCredentials")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VplexCredentials", propOrder={"credentialsType", "certificate"})
/*     */ public class VplexCredentials
/*     */   extends BaseCredentials
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected VplexCredentialsType credentialsType;
/*     */   @XmlElement(required=true)
/*     */   protected String certificate;
/*     */   
/*     */   public VplexCredentials() {}
/*     */   
/*     */   public VplexCredentials(VplexCredentialsType credentialsType, String certificate)
/*     */   {
/*  60 */     this.credentialsType = credentialsType;
/*  61 */     this.certificate = certificate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VplexCredentialsType getCredentialsType()
/*     */   {
/*  73 */     return this.credentialsType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCredentialsType(VplexCredentialsType value)
/*     */   {
/*  85 */     this.credentialsType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getCertificate()
/*     */   {
/*  97 */     return this.certificate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCertificate(String value)
/*     */   {
/* 109 */     this.certificate = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 119 */     if (!(obj instanceof VplexCredentials)) {
/* 120 */       return false;
/*     */     }
/* 122 */     VplexCredentials otherObj = (VplexCredentials)obj;
/*     */     
/* 124 */     return (super.equals(obj)) && (this.credentialsType != null ? this.credentialsType.equals(otherObj.credentialsType) : this.credentialsType == otherObj.credentialsType) && (this.certificate != null ? this.certificate.equals(otherObj.certificate) : this.certificate == otherObj.certificate);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 135 */     return super.hashCode() ^ (this.credentialsType != null ? this.credentialsType.hashCode() : 0) ^ (this.certificate != null ? this.certificate.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 146 */     return "VplexCredentials [super=" + super.toString() + ", " + "credentialsType=" + this.credentialsType + ", " + "certificate=" + this.certificate + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VplexCredentials.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */