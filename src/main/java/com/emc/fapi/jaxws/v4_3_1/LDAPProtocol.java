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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="LDAPProtocol", propOrder={"protocolType", "certificate", "useCertificate"})
/*     */ public class LDAPProtocol
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected LdapProtocolType protocolType;
/*     */   @XmlElement(required=true)
/*     */   protected String certificate;
/*     */   protected boolean useCertificate;
/*     */   
/*     */   public LDAPProtocol() {}
/*     */   
/*     */   public LDAPProtocol(LdapProtocolType protocolType, String certificate, boolean useCertificate)
/*     */   {
/*  53 */     this.protocolType = protocolType;
/*  54 */     this.certificate = certificate;
/*  55 */     this.useCertificate = useCertificate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public LdapProtocolType getProtocolType()
/*     */   {
/*  67 */     return this.protocolType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setProtocolType(LdapProtocolType value)
/*     */   {
/*  79 */     this.protocolType = value;
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
/*  91 */     return this.certificate;
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
/* 103 */     this.certificate = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isUseCertificate()
/*     */   {
/* 111 */     return this.useCertificate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUseCertificate(boolean value)
/*     */   {
/* 119 */     this.useCertificate = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 129 */     if (!(obj instanceof LDAPProtocol)) {
/* 130 */       return false;
/*     */     }
/* 132 */     LDAPProtocol otherObj = (LDAPProtocol)obj;
/*     */     
/* 134 */     return (this.protocolType != null ? this.protocolType.equals(otherObj.protocolType) : this.protocolType == otherObj.protocolType) && (this.certificate != null ? this.certificate.equals(otherObj.certificate) : this.certificate == otherObj.certificate) && (this.useCertificate == otherObj.useCertificate);
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
/* 145 */     return (this.protocolType != null ? this.protocolType.hashCode() : 0) ^ (this.certificate != null ? this.certificate.hashCode() : 0) ^ (this.useCertificate ? 1 : 0);
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
/* 156 */     return "LDAPProtocol [protocolType=" + this.protocolType + ", " + "certificate=" + this.certificate + ", " + "useCertificate=" + this.useCertificate + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\LDAPProtocol.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */