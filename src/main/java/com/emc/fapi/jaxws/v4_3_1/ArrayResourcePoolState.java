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
/*     */ @XmlType(name="ArrayResourcePoolState", propOrder={"resourcePoolUID", "resourcePoolUsageStats"})
/*     */ public class ArrayResourcePoolState
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ResourcePoolUID resourcePoolUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected ResourcePoolUsageStats resourcePoolUsageStats;
/*     */   
/*     */   public ArrayResourcePoolState() {}
/*     */   
/*     */   public ArrayResourcePoolState(ResourcePoolUID resourcePoolUID, ResourcePoolUsageStats resourcePoolUsageStats)
/*     */   {
/*  50 */     this.resourcePoolUID = resourcePoolUID;
/*  51 */     this.resourcePoolUsageStats = resourcePoolUsageStats;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ResourcePoolUID getResourcePoolUID()
/*     */   {
/*  63 */     return this.resourcePoolUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setResourcePoolUID(ResourcePoolUID value)
/*     */   {
/*  75 */     this.resourcePoolUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ResourcePoolUsageStats getResourcePoolUsageStats()
/*     */   {
/*  87 */     return this.resourcePoolUsageStats;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setResourcePoolUsageStats(ResourcePoolUsageStats value)
/*     */   {
/*  99 */     this.resourcePoolUsageStats = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof ArrayResourcePoolState)) {
/* 110 */       return false;
/*     */     }
/* 112 */     ArrayResourcePoolState otherObj = (ArrayResourcePoolState)obj;
/*     */     
/* 114 */     return (this.resourcePoolUID != null ? this.resourcePoolUID.equals(otherObj.resourcePoolUID) : this.resourcePoolUID == otherObj.resourcePoolUID) && (this.resourcePoolUsageStats != null ? this.resourcePoolUsageStats.equals(otherObj.resourcePoolUsageStats) : this.resourcePoolUsageStats == otherObj.resourcePoolUsageStats);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.resourcePoolUID != null ? this.resourcePoolUID.hashCode() : 0) ^ (this.resourcePoolUsageStats != null ? this.resourcePoolUsageStats.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "ArrayResourcePoolState [resourcePoolUID=" + this.resourcePoolUID + ", " + "resourcePoolUsageStats=" + this.resourcePoolUsageStats + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayResourcePoolState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */