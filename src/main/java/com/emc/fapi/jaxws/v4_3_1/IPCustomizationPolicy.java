/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=IPv4CustomizationPolicy.class, name="IPv4CustomizationPolicy"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=IPv6CustomizationPolicy.class, name="IPv6CustomizationPolicy")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="IPCustomizationPolicy", propOrder={"ip", "gateways"})
/*     */ @XmlSeeAlso({IPv4CustomizationPolicy.class, IPv6CustomizationPolicy.class})
/*     */ public abstract class IPCustomizationPolicy
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected String ip;
/*     */   @XmlElement(required=true)
/*     */   protected List<String> gateways;
/*     */   
/*     */   public IPCustomizationPolicy() {}
/*     */   
/*     */   public IPCustomizationPolicy(String ip, List<String> gateways)
/*     */   {
/*  69 */     this.ip = ip;
/*  70 */     this.gateways = gateways;
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
/*  82 */     return this.ip;
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
/*  94 */     this.ip = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<String> getGateways()
/*     */   {
/* 120 */     if (this.gateways == null) {
/* 121 */       this.gateways = new ArrayList();
/*     */     }
/* 123 */     return this.gateways;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 133 */     if (!(obj instanceof IPCustomizationPolicy)) {
/* 134 */       return false;
/*     */     }
/* 136 */     IPCustomizationPolicy otherObj = (IPCustomizationPolicy)obj;
/*     */     
/* 138 */     return (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip) && (this.gateways != null ? this.gateways.equals(otherObj.gateways) : this.gateways == otherObj.gateways);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 148 */     return (this.ip != null ? this.ip.hashCode() : 0) ^ (this.gateways != null ? this.gateways.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 158 */     return "IPCustomizationPolicy [ip=" + this.ip + ", " + "gateways=" + this.gateways + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\IPCustomizationPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */