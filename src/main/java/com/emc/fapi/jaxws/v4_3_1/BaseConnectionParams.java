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
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ScaleIoConnectionParams.class, name="ScaleIoConnectionParams"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=VcConnectionParams.class, name="VcConnectionParams"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ClariionConnectionParams.class, name="ClariionConnectionParams")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="BaseConnectionParams", propOrder={"mgmtIP"})
/*     */ @XmlSeeAlso({ClariionConnectionParams.class, ScaleIoConnectionParams.class, VcConnectionParams.class})
/*     */ public class BaseConnectionParams
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected IPInformation mgmtIP;
/*     */   
/*     */   public BaseConnectionParams() {}
/*     */   
/*     */   public BaseConnectionParams(IPInformation mgmtIP)
/*     */   {
/*  65 */     this.mgmtIP = mgmtIP;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public IPInformation getMgmtIP()
/*     */   {
/*  77 */     return this.mgmtIP;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMgmtIP(IPInformation value)
/*     */   {
/*  89 */     this.mgmtIP = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  99 */     if (!(obj instanceof BaseConnectionParams)) {
/* 100 */       return false;
/*     */     }
/* 102 */     BaseConnectionParams otherObj = (BaseConnectionParams)obj;
/*     */     
/* 104 */     return this.mgmtIP == otherObj.mgmtIP ? true : this.mgmtIP != null ? this.mgmtIP.equals(otherObj.mgmtIP) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 113 */     return this.mgmtIP != null ? this.mgmtIP.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 122 */     return "BaseConnectionParams [mgmtIP=" + this.mgmtIP + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\BaseConnectionParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */