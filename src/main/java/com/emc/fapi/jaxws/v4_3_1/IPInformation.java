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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="IPInformation", propOrder={"ipVersion", "ip"})
/*     */ public class IPInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected IpVersion ipVersion;
/*     */   @XmlElement(required=true)
/*     */   protected String ip;
/*     */   
/*     */   public IPInformation() {}
/*     */   
/*     */   public IPInformation(IpVersion ipVersion, String ip)
/*     */   {
/*  50 */     this.ipVersion = ipVersion;
/*  51 */     this.ip = ip;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public IpVersion getIpVersion()
/*     */   {
/*  63 */     return this.ipVersion;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIpVersion(IpVersion value)
/*     */   {
/*  75 */     this.ipVersion = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getIp()
/*     */   {
/*  87 */     return this.ip;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIp(String value)
/*     */   {
/*  99 */     this.ip = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof IPInformation)) {
/* 110 */       return false;
/*     */     }
/* 112 */     IPInformation otherObj = (IPInformation)obj;
/*     */     
/* 114 */     return (this.ipVersion != null ? this.ipVersion.equals(otherObj.ipVersion) : this.ipVersion == otherObj.ipVersion) && (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.ipVersion != null ? this.ipVersion.hashCode() : 0) ^ (this.ip != null ? this.ip.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "IPInformation [ipVersion=" + this.ipVersion + ", " + "ip=" + this.ip + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\IPInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */