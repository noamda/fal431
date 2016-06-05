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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VnxCredentials", propOrder={"username", "password", "certificate", "authenticationType"})
/*     */ public class VnxCredentials
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected String username;
/*     */   @XmlElement(required=true)
/*     */   protected byte[] password;
/*     */   @XmlElement(required=true)
/*     */   protected String certificate;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected AuthenticationType authenticationType;
/*     */   
/*     */   public VnxCredentials() {}
/*     */   
/*     */   public VnxCredentials(String username, byte[] password, String certificate, AuthenticationType authenticationType)
/*     */   {
/*  58 */     this.username = username;
/*  59 */     this.password = password;
/*  60 */     this.certificate = certificate;
/*  61 */     this.authenticationType = authenticationType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getUsername()
/*     */   {
/*  73 */     return this.username;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUsername(String value)
/*     */   {
/*  85 */     this.username = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public byte[] getPassword()
/*     */   {
/*  96 */     return this.password;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPassword(byte[] value)
/*     */   {
/* 107 */     this.password = value;
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
/* 119 */     return this.certificate;
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
/* 131 */     this.certificate = value;
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
/* 143 */     return this.authenticationType;
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
/* 155 */     this.authenticationType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 165 */     if (!(obj instanceof VnxCredentials)) {
/* 166 */       return false;
/*     */     }
/* 168 */     VnxCredentials otherObj = (VnxCredentials)obj;
/*     */     
/* 170 */     return (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username) && (this.password != null ? this.password.equals(otherObj.password) : this.password == otherObj.password) && (this.certificate != null ? this.certificate.equals(otherObj.certificate) : this.certificate == otherObj.certificate) && (this.authenticationType != null ? this.authenticationType.equals(otherObj.authenticationType) : this.authenticationType == otherObj.authenticationType);
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
/* 182 */     return (this.username != null ? this.username.hashCode() : 0) ^ (this.password != null ? this.password.hashCode() : 0) ^ (this.certificate != null ? this.certificate.hashCode() : 0) ^ (this.authenticationType != null ? this.authenticationType.hashCode() : 0);
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
/* 194 */     return "VnxCredentials [username=" + this.username + ", " + "password=" + this.password + ", " + "certificate=" + this.certificate + ", " + "authenticationType=" + this.authenticationType + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VnxCredentials.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */