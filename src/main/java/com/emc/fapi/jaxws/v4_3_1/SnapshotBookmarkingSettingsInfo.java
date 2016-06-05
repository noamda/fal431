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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SnapshotBookmarkingSettingsInfo", propOrder={"consistencyType", "consolidationPolicy"})
/*     */ public class SnapshotBookmarkingSettingsInfo
/*     */ {
/*     */   protected SnapshotConsistencyType consistencyType;
/*     */   protected BookmarkConsolidationPolicy consolidationPolicy;
/*     */   
/*     */   public SnapshotBookmarkingSettingsInfo() {}
/*     */   
/*     */   public SnapshotBookmarkingSettingsInfo(SnapshotConsistencyType consistencyType, BookmarkConsolidationPolicy consolidationPolicy)
/*     */   {
/*  54 */     this.consistencyType = consistencyType;
/*  55 */     this.consolidationPolicy = consolidationPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SnapshotConsistencyType getConsistencyType()
/*     */   {
/*  67 */     return this.consistencyType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConsistencyType(SnapshotConsistencyType value)
/*     */   {
/*  79 */     this.consistencyType = value;
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
/*  91 */     return this.consolidationPolicy;
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
/* 103 */     this.consolidationPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 113 */     if (!(obj instanceof SnapshotBookmarkingSettingsInfo)) {
/* 114 */       return false;
/*     */     }
/* 116 */     SnapshotBookmarkingSettingsInfo otherObj = (SnapshotBookmarkingSettingsInfo)obj;
/*     */     
/* 118 */     return (this.consistencyType != null ? this.consistencyType.equals(otherObj.consistencyType) : this.consistencyType == otherObj.consistencyType) && (this.consolidationPolicy != null ? this.consolidationPolicy.equals(otherObj.consolidationPolicy) : this.consolidationPolicy == otherObj.consolidationPolicy);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 128 */     return (this.consistencyType != null ? this.consistencyType.hashCode() : 0) ^ (this.consolidationPolicy != null ? this.consolidationPolicy.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 138 */     return "SnapshotBookmarkingSettingsInfo [consistencyType=" + this.consistencyType + ", " + "consolidationPolicy=" + this.consolidationPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SnapshotBookmarkingSettingsInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */