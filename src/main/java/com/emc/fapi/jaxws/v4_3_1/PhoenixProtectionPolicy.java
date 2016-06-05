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
/*     */ @XmlType(name="PhoenixProtectionPolicy", propOrder={"phoenixClusterProtectionPolicy", "phoenixProctectedCopyUID"})
/*     */ public class PhoenixProtectionPolicy
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected PhoenixClusterProtectionPolicy phoenixClusterProtectionPolicy;
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupCopyUID phoenixProctectedCopyUID;
/*     */   
/*     */   public PhoenixProtectionPolicy() {}
/*     */   
/*     */   public PhoenixProtectionPolicy(PhoenixClusterProtectionPolicy phoenixClusterProtectionPolicy, ConsistencyGroupCopyUID phoenixProctectedCopyUID)
/*     */   {
/*  50 */     this.phoenixClusterProtectionPolicy = phoenixClusterProtectionPolicy;
/*  51 */     this.phoenixProctectedCopyUID = phoenixProctectedCopyUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public PhoenixClusterProtectionPolicy getPhoenixClusterProtectionPolicy()
/*     */   {
/*  63 */     return this.phoenixClusterProtectionPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPhoenixClusterProtectionPolicy(PhoenixClusterProtectionPolicy value)
/*     */   {
/*  75 */     this.phoenixClusterProtectionPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getPhoenixProctectedCopyUID()
/*     */   {
/*  87 */     return this.phoenixProctectedCopyUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPhoenixProctectedCopyUID(ConsistencyGroupCopyUID value)
/*     */   {
/*  99 */     this.phoenixProctectedCopyUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof PhoenixProtectionPolicy)) {
/* 110 */       return false;
/*     */     }
/* 112 */     PhoenixProtectionPolicy otherObj = (PhoenixProtectionPolicy)obj;
/*     */     
/* 114 */     return (this.phoenixClusterProtectionPolicy != null ? this.phoenixClusterProtectionPolicy.equals(otherObj.phoenixClusterProtectionPolicy) : this.phoenixClusterProtectionPolicy == otherObj.phoenixClusterProtectionPolicy) && (this.phoenixProctectedCopyUID != null ? this.phoenixProctectedCopyUID.equals(otherObj.phoenixProctectedCopyUID) : this.phoenixProctectedCopyUID == otherObj.phoenixProctectedCopyUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.phoenixClusterProtectionPolicy != null ? this.phoenixClusterProtectionPolicy.hashCode() : 0) ^ (this.phoenixProctectedCopyUID != null ? this.phoenixProctectedCopyUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "PhoenixProtectionPolicy [phoenixClusterProtectionPolicy=" + this.phoenixClusterProtectionPolicy + ", " + "phoenixProctectedCopyUID=" + this.phoenixProctectedCopyUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\PhoenixProtectionPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */