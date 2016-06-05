/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*     */ @XmlType(name="ResourcePoolUsageStats", propOrder={"capacityInBytes", "usedSpaceInBytes"})
/*     */ public class ResourcePoolUsageStats
/*     */ {
/*     */   protected long capacityInBytes;
/*     */   protected long usedSpaceInBytes;
/*     */   
/*     */   public ResourcePoolUsageStats() {}
/*     */   
/*     */   public ResourcePoolUsageStats(long capacityInBytes, long usedSpaceInBytes)
/*     */   {
/*  47 */     this.capacityInBytes = capacityInBytes;
/*  48 */     this.usedSpaceInBytes = usedSpaceInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getCapacityInBytes()
/*     */   {
/*  56 */     return this.capacityInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCapacityInBytes(long value)
/*     */   {
/*  64 */     this.capacityInBytes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getUsedSpaceInBytes()
/*     */   {
/*  72 */     return this.usedSpaceInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUsedSpaceInBytes(long value)
/*     */   {
/*  80 */     this.usedSpaceInBytes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  90 */     if (!(obj instanceof ResourcePoolUsageStats)) {
/*  91 */       return false;
/*     */     }
/*  93 */     ResourcePoolUsageStats otherObj = (ResourcePoolUsageStats)obj;
/*     */     
/*  95 */     return (this.capacityInBytes == otherObj.capacityInBytes) && (this.usedSpaceInBytes == otherObj.usedSpaceInBytes);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return (int)this.capacityInBytes ^ (int)this.usedSpaceInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 115 */     return "ResourcePoolUsageStats [capacityInBytes=" + this.capacityInBytes + ", " + "usedSpaceInBytes=" + this.usedSpaceInBytes + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ResourcePoolUsageStats.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */