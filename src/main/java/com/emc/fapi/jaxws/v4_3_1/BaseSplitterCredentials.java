/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlSeeAlso;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonSubTypes;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.As;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ClariionSplitterCredentials.class, name="ClariionSplitterCredentials"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=VplexSplitterCredentials.class, name="VplexSplitterCredentials"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=VnxSplitterCredentials.class, name="VnxSplitterCredentials")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="BaseSplitterCredentials", propOrder={"username", "passwordConfigured", "ip"})
/*     */ @XmlSeeAlso({ClariionSplitterCredentials.class, VnxSplitterCredentials.class, VplexSplitterCredentials.class})
/*     */ public abstract class BaseSplitterCredentials
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected String username;
/*     */   protected boolean passwordConfigured;
/*     */   @XmlElement(required=true)
/*     */   protected String ip;
/*     */   
/*     */   public BaseSplitterCredentials() {}
/*     */   
/*     */   public BaseSplitterCredentials(String username, boolean passwordConfigured, String ip)
/*     */   {
/*  72 */     this.username = username;
/*  73 */     this.passwordConfigured = passwordConfigured;
/*  74 */     this.ip = ip;
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
/*  86 */     return this.username;
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
/*  98 */     this.username = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isPasswordConfigured()
/*     */   {
/* 106 */     return this.passwordConfigured;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPasswordConfigured(boolean value)
/*     */   {
/* 114 */     this.passwordConfigured = value;
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
/* 126 */     return this.ip;
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
/* 138 */     this.ip = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 148 */     if (!(obj instanceof BaseSplitterCredentials)) {
/* 149 */       return false;
/*     */     }
/* 151 */     BaseSplitterCredentials otherObj = (BaseSplitterCredentials)obj;
/*     */     
/* 153 */     return (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username) && (this.passwordConfigured == otherObj.passwordConfigured) && (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip);
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
/* 164 */     return (this.username != null ? this.username.hashCode() : 0) ^ (this.passwordConfigured ? 1 : 0) ^ (this.ip != null ? this.ip.hashCode() : 0);
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
/* 175 */     return "BaseSplitterCredentials [username=" + this.username + ", " + "passwordConfigured=" + this.passwordConfigured + ", " + "ip=" + this.ip + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\BaseSplitterCredentials.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */