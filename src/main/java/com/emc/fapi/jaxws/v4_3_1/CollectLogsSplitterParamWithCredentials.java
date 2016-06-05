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
/*     */ @JsonTypeName("CollectLogsSplitterParamWithCredentials")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="CollectLogsSplitterParamWithCredentials", propOrder={"credentials", "password"})
/*     */ public class CollectLogsSplitterParamWithCredentials
/*     */   extends CollectLogsSplitterParam
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected BaseSplitterCredentials credentials;
/*     */   protected byte[] password;
/*     */   
/*     */   public CollectLogsSplitterParamWithCredentials() {}
/*     */   
/*     */   public CollectLogsSplitterParamWithCredentials(BaseSplitterCredentials credentials, byte[] password)
/*     */   {
/*  59 */     this.credentials = credentials;
/*  60 */     this.password = password;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public BaseSplitterCredentials getCredentials()
/*     */   {
/*  72 */     return this.credentials;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCredentials(BaseSplitterCredentials value)
/*     */   {
/*  84 */     this.credentials = value;
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
/*  95 */     return this.password;
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
/* 106 */     this.password = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 116 */     if (!(obj instanceof CollectLogsSplitterParamWithCredentials)) {
/* 117 */       return false;
/*     */     }
/* 119 */     CollectLogsSplitterParamWithCredentials otherObj = (CollectLogsSplitterParamWithCredentials)obj;
/*     */     
/* 121 */     return (super.equals(obj)) && (this.credentials != null ? this.credentials.equals(otherObj.credentials) : this.credentials == otherObj.credentials) && (this.password != null ? this.password.equals(otherObj.password) : this.password == otherObj.password);
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
/* 132 */     return super.hashCode() ^ (this.credentials != null ? this.credentials.hashCode() : 0) ^ (this.password != null ? this.password.hashCode() : 0);
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
/* 143 */     return "CollectLogsSplitterParamWithCredentials [super=" + super.toString() + ", " + "credentials=" + this.credentials + ", " + "password=" + this.password + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CollectLogsSplitterParamWithCredentials.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */