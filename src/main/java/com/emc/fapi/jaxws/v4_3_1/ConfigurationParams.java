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
/*     */ @XmlType(name="ConfigurationParams", propOrder={"connectionParams", "credentials"})
/*     */ public class ConfigurationParams
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected BaseConnectionParams connectionParams;
/*     */   @XmlElement(required=true)
/*     */   protected BaseCredentials credentials;
/*     */   
/*     */   public ConfigurationParams() {}
/*     */   
/*     */   public ConfigurationParams(BaseConnectionParams connectionParams, BaseCredentials credentials)
/*     */   {
/*  50 */     this.connectionParams = connectionParams;
/*  51 */     this.credentials = credentials;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public BaseConnectionParams getConnectionParams()
/*     */   {
/*  63 */     return this.connectionParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConnectionParams(BaseConnectionParams value)
/*     */   {
/*  75 */     this.connectionParams = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public BaseCredentials getCredentials()
/*     */   {
/*  87 */     return this.credentials;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCredentials(BaseCredentials value)
/*     */   {
/*  99 */     this.credentials = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof ConfigurationParams)) {
/* 110 */       return false;
/*     */     }
/* 112 */     ConfigurationParams otherObj = (ConfigurationParams)obj;
/*     */     
/* 114 */     return (this.connectionParams != null ? this.connectionParams.equals(otherObj.connectionParams) : this.connectionParams == otherObj.connectionParams) && (this.credentials != null ? this.credentials.equals(otherObj.credentials) : this.credentials == otherObj.credentials);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.connectionParams != null ? this.connectionParams.hashCode() : 0) ^ (this.credentials != null ? this.credentials.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "ConfigurationParams [connectionParams=" + this.connectionParams + ", " + "credentials=" + this.credentials + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConfigurationParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */