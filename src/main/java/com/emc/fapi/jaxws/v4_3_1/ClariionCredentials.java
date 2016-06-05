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
/*     */ 
/*     */ 
/*     */ @JsonTypeName("ClariionCredentials")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ClariionCredentials", propOrder={"credentialsType", "authenticationType", "certificate"})
/*     */ public class ClariionCredentials
/*     */   extends BaseCredentials
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ClariionCredentialsType credentialsType;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected AuthenticationType authenticationType;
/*     */   protected String certificate;
/*     */   
/*     */   public ClariionCredentials() {}
/*     */   
/*     */   public ClariionCredentials(ClariionCredentialsType credentialsType, AuthenticationType authenticationType, String certificate)
/*     */   {
/*  63 */     this.credentialsType = credentialsType;
/*  64 */     this.authenticationType = authenticationType;
/*  65 */     this.certificate = certificate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClariionCredentialsType getCredentialsType()
/*     */   {
/*  77 */     return this.credentialsType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCredentialsType(ClariionCredentialsType value)
/*     */   {
/*  89 */     this.credentialsType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public AuthenticationType getAuthenticationType()
/*     */   {
/* 101 */     return this.authenticationType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAuthenticationType(AuthenticationType value)
/*     */   {
/* 113 */     this.authenticationType = value;
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
/* 125 */     return this.certificate;
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
/* 137 */     this.certificate = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 147 */     if (!(obj instanceof ClariionCredentials)) {
/* 148 */       return false;
/*     */     }
/* 150 */     ClariionCredentials otherObj = (ClariionCredentials)obj;
/*     */     
/* 152 */     return (super.equals(obj)) && (this.credentialsType != null ? this.credentialsType.equals(otherObj.credentialsType) : this.credentialsType == otherObj.credentialsType) && (this.authenticationType != null ? this.authenticationType.equals(otherObj.authenticationType) : this.authenticationType == otherObj.authenticationType) && (this.certificate != null ? this.certificate.equals(otherObj.certificate) : this.certificate == otherObj.certificate);
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
/* 164 */     return super.hashCode() ^ (this.credentialsType != null ? this.credentialsType.hashCode() : 0) ^ (this.authenticationType != null ? this.authenticationType.hashCode() : 0) ^ (this.certificate != null ? this.certificate.hashCode() : 0);
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
/* 176 */     return "ClariionCredentials [super=" + super.toString() + ", " + "credentialsType=" + this.credentialsType + ", " + "authenticationType=" + this.authenticationType + ", " + "certificate=" + this.certificate + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClariionCredentials.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */