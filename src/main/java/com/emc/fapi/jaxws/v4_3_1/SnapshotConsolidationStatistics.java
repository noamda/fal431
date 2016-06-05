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
/*     */ @XmlType(name="SnapshotConsolidationStatistics", propOrder={"percentageOfSavedSpace", "savedSpace"})
/*     */ public class SnapshotConsolidationStatistics
/*     */ {
/*     */   protected double percentageOfSavedSpace;
/*     */   protected long savedSpace;
/*     */   
/*     */   public SnapshotConsolidationStatistics() {}
/*     */   
/*     */   public SnapshotConsolidationStatistics(double percentageOfSavedSpace, long savedSpace)
/*     */   {
/*  47 */     this.percentageOfSavedSpace = percentageOfSavedSpace;
/*  48 */     this.savedSpace = savedSpace;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public double getPercentageOfSavedSpace()
/*     */   {
/*  56 */     return this.percentageOfSavedSpace;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPercentageOfSavedSpace(double value)
/*     */   {
/*  64 */     this.percentageOfSavedSpace = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getSavedSpace()
/*     */   {
/*  72 */     return this.savedSpace;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSavedSpace(long value)
/*     */   {
/*  80 */     this.savedSpace = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  90 */     if (!(obj instanceof SnapshotConsolidationStatistics)) {
/*  91 */       return false;
/*     */     }
/*  93 */     SnapshotConsolidationStatistics otherObj = (SnapshotConsolidationStatistics)obj;
/*     */     
/*  95 */     return (this.percentageOfSavedSpace == otherObj.percentageOfSavedSpace) && (this.savedSpace == otherObj.savedSpace);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return (int)this.percentageOfSavedSpace ^ (int)this.savedSpace;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 115 */     return "SnapshotConsolidationStatistics [percentageOfSavedSpace=" + this.percentageOfSavedSpace + ", " + "savedSpace=" + this.savedSpace + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SnapshotConsolidationStatistics.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */