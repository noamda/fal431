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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SnapshotConsolidationInfo", propOrder={"consolidationPolicy", "consolidationType", "savedSpaceInBytes"})
/*     */ public class SnapshotConsolidationInfo
/*     */ {
/*     */   protected BookmarkConsolidationPolicy consolidationPolicy;
/*     */   protected SnapshotConsolidationType consolidationType;
/*     */   protected long savedSpaceInBytes;
/*     */   
/*     */   public SnapshotConsolidationInfo() {}
/*     */   
/*     */   public SnapshotConsolidationInfo(BookmarkConsolidationPolicy consolidationPolicy, SnapshotConsolidationType consolidationType, long savedSpaceInBytes)
/*     */   {
/*  50 */     this.consolidationPolicy = consolidationPolicy;
/*  51 */     this.consolidationType = consolidationType;
/*  52 */     this.savedSpaceInBytes = savedSpaceInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public BookmarkConsolidationPolicy getConsolidationPolicy()
/*     */   {
/*  64 */     return this.consolidationPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConsolidationPolicy(BookmarkConsolidationPolicy value)
/*     */   {
/*  76 */     this.consolidationPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SnapshotConsolidationType getConsolidationType()
/*     */   {
/*  88 */     return this.consolidationType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConsolidationType(SnapshotConsolidationType value)
/*     */   {
/* 100 */     this.consolidationType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getSavedSpaceInBytes()
/*     */   {
/* 108 */     return this.savedSpaceInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSavedSpaceInBytes(long value)
/*     */   {
/* 116 */     this.savedSpaceInBytes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 126 */     if (!(obj instanceof SnapshotConsolidationInfo)) {
/* 127 */       return false;
/*     */     }
/* 129 */     SnapshotConsolidationInfo otherObj = (SnapshotConsolidationInfo)obj;
/*     */     
/* 131 */     return (this.consolidationPolicy != null ? this.consolidationPolicy.equals(otherObj.consolidationPolicy) : this.consolidationPolicy == otherObj.consolidationPolicy) && (this.consolidationType != null ? this.consolidationType.equals(otherObj.consolidationType) : this.consolidationType == otherObj.consolidationType) && (this.savedSpaceInBytes == otherObj.savedSpaceInBytes);
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
/* 142 */     return (this.consolidationPolicy != null ? this.consolidationPolicy.hashCode() : 0) ^ (this.consolidationType != null ? this.consolidationType.hashCode() : 0) ^ (int)this.savedSpaceInBytes;
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
/* 153 */     return "SnapshotConsolidationInfo [consolidationPolicy=" + this.consolidationPolicy + ", " + "consolidationType=" + this.consolidationType + ", " + "savedSpaceInBytes=" + this.savedSpaceInBytes + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SnapshotConsolidationInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */