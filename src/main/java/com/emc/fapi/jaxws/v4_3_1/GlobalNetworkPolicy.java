/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name="GlobalNetworkPolicy", propOrder={"dnsServers", "dnsSuffixes"})
/*     */ public class GlobalNetworkPolicy
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected List<String> dnsServers;
/*     */   @XmlElement(required=true)
/*     */   protected List<String> dnsSuffixes;
/*     */   
/*     */   public GlobalNetworkPolicy() {}
/*     */   
/*     */   public GlobalNetworkPolicy(List<String> dnsServers, List<String> dnsSuffixes)
/*     */   {
/*  52 */     this.dnsServers = dnsServers;
/*  53 */     this.dnsSuffixes = dnsSuffixes;
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
/*     */   public List<String> getDnsServers()
/*     */   {
/*  79 */     if (this.dnsServers == null) {
/*  80 */       this.dnsServers = new ArrayList();
/*     */     }
/*  82 */     return this.dnsServers;
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
/*     */   public List<String> getDnsSuffixes()
/*     */   {
/* 108 */     if (this.dnsSuffixes == null) {
/* 109 */       this.dnsSuffixes = new ArrayList();
/*     */     }
/* 111 */     return this.dnsSuffixes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 121 */     if (!(obj instanceof GlobalNetworkPolicy)) {
/* 122 */       return false;
/*     */     }
/* 124 */     GlobalNetworkPolicy otherObj = (GlobalNetworkPolicy)obj;
/*     */     
/* 126 */     return (this.dnsServers != null ? this.dnsServers.equals(otherObj.dnsServers) : this.dnsServers == otherObj.dnsServers) && (this.dnsSuffixes != null ? this.dnsSuffixes.equals(otherObj.dnsSuffixes) : this.dnsSuffixes == otherObj.dnsSuffixes);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 136 */     return (this.dnsServers != null ? this.dnsServers.hashCode() : 0) ^ (this.dnsSuffixes != null ? this.dnsSuffixes.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 146 */     return "GlobalNetworkPolicy [dnsServers=" + this.dnsServers + ", " + "dnsSuffixes=" + this.dnsSuffixes + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GlobalNetworkPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */