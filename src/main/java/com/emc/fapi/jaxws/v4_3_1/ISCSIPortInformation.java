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
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=LocalISCSIPortInformation.class, name="LocalISCSIPortInformation"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=RemoteISCSIPortInformation.class, name="RemoteISCSIPortInformation")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ISCSIPortInformation", propOrder={"port", "chap"})
/*     */ @XmlSeeAlso({RemoteISCSIPortInformation.class, LocalISCSIPortInformation.class})
/*     */ public abstract class ISCSIPortInformation
/*     */ {
/*     */   protected int port;
/*     */   @XmlElement(nillable=true)
/*     */   protected Chap chap;
/*     */   
/*     */   public ISCSIPortInformation() {}
/*     */   
/*     */   public ISCSIPortInformation(int port, Chap chap)
/*     */   {
/*  66 */     this.port = port;
/*  67 */     this.chap = chap;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getPort()
/*     */   {
/*  75 */     return this.port;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPort(int value)
/*     */   {
/*  83 */     this.port = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Chap getChap()
/*     */   {
/*  95 */     return this.chap;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setChap(Chap value)
/*     */   {
/* 107 */     this.chap = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 117 */     if (!(obj instanceof ISCSIPortInformation)) {
/* 118 */       return false;
/*     */     }
/* 120 */     ISCSIPortInformation otherObj = (ISCSIPortInformation)obj;
/*     */     
/* 122 */     return (this.port == otherObj.port) && (this.chap != null ? this.chap.equals(otherObj.chap) : this.chap == otherObj.chap);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 132 */     return this.port ^ (this.chap != null ? this.chap.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 142 */     return "ISCSIPortInformation [port=" + this.port + ", " + "chap=" + this.chap + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ISCSIPortInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */