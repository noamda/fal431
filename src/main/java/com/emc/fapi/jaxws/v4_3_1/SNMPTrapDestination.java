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
/*     */ @XmlType(name="SNMPTrapDestination", propOrder={"clusterUID", "targetHostAddress"})
/*     */ public class SNMPTrapDestination
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   @XmlElement(required=true)
/*     */   protected String targetHostAddress;
/*     */   
/*     */   public SNMPTrapDestination() {}
/*     */   
/*     */   public SNMPTrapDestination(ClusterUID clusterUID, String targetHostAddress)
/*     */   {
/*  50 */     this.clusterUID = clusterUID;
/*  51 */     this.targetHostAddress = targetHostAddress;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterUID getClusterUID()
/*     */   {
/*  63 */     return this.clusterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setClusterUID(ClusterUID value)
/*     */   {
/*  75 */     this.clusterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getTargetHostAddress()
/*     */   {
/*  87 */     return this.targetHostAddress;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTargetHostAddress(String value)
/*     */   {
/*  99 */     this.targetHostAddress = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof SNMPTrapDestination)) {
/* 110 */       return false;
/*     */     }
/* 112 */     SNMPTrapDestination otherObj = (SNMPTrapDestination)obj;
/*     */     
/* 114 */     return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.targetHostAddress != null ? this.targetHostAddress.equals(otherObj.targetHostAddress) : this.targetHostAddress == otherObj.targetHostAddress);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.targetHostAddress != null ? this.targetHostAddress.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "SNMPTrapDestination [clusterUID=" + this.clusterUID + ", " + "targetHostAddress=" + this.targetHostAddress + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SNMPTrapDestination.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */