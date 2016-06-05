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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsolidationProgress", propOrder={"consolidationType", "firstSnapshotTime", "lastSnapshotTime", "pending", "progress"})
/*     */ public class ConsolidationProgress
/*     */ {
/*     */   protected SnapshotConsolidationType consolidationType;
/*     */   protected RecoverPointTimeStamp firstSnapshotTime;
/*     */   protected RecoverPointTimeStamp lastSnapshotTime;
/*     */   protected boolean pending;
/*     */   protected double progress;
/*     */   
/*     */   public ConsolidationProgress() {}
/*     */   
/*     */   public ConsolidationProgress(SnapshotConsolidationType consolidationType, RecoverPointTimeStamp firstSnapshotTime, RecoverPointTimeStamp lastSnapshotTime, boolean pending, double progress)
/*     */   {
/*  56 */     this.consolidationType = consolidationType;
/*  57 */     this.firstSnapshotTime = firstSnapshotTime;
/*  58 */     this.lastSnapshotTime = lastSnapshotTime;
/*  59 */     this.pending = pending;
/*  60 */     this.progress = progress;
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
/*  72 */     return this.consolidationType;
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
/*  84 */     this.consolidationType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointTimeStamp getFirstSnapshotTime()
/*     */   {
/*  96 */     return this.firstSnapshotTime;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFirstSnapshotTime(RecoverPointTimeStamp value)
/*     */   {
/* 108 */     this.firstSnapshotTime = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointTimeStamp getLastSnapshotTime()
/*     */   {
/* 120 */     return this.lastSnapshotTime;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLastSnapshotTime(RecoverPointTimeStamp value)
/*     */   {
/* 132 */     this.lastSnapshotTime = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isPending()
/*     */   {
/* 140 */     return this.pending;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPending(boolean value)
/*     */   {
/* 148 */     this.pending = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public double getProgress()
/*     */   {
/* 156 */     return this.progress;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setProgress(double value)
/*     */   {
/* 164 */     this.progress = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 174 */     if (!(obj instanceof ConsolidationProgress)) {
/* 175 */       return false;
/*     */     }
/* 177 */     ConsolidationProgress otherObj = (ConsolidationProgress)obj;
/*     */     
/* 179 */     return (this.consolidationType != null ? this.consolidationType.equals(otherObj.consolidationType) : this.consolidationType == otherObj.consolidationType) && (this.firstSnapshotTime != null ? this.firstSnapshotTime.equals(otherObj.firstSnapshotTime) : this.firstSnapshotTime == otherObj.firstSnapshotTime) && (this.lastSnapshotTime != null ? this.lastSnapshotTime.equals(otherObj.lastSnapshotTime) : this.lastSnapshotTime == otherObj.lastSnapshotTime) && (this.pending == otherObj.pending) && (this.progress == otherObj.progress);
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
/*     */   public int hashCode()
/*     */   {
/* 192 */     return (this.consolidationType != null ? this.consolidationType.hashCode() : 0) ^ (this.firstSnapshotTime != null ? this.firstSnapshotTime.hashCode() : 0) ^ (this.lastSnapshotTime != null ? this.lastSnapshotTime.hashCode() : 0) ^ (this.pending ? 1 : 0) ^ (int)this.progress;
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
/*     */   public String toString()
/*     */   {
/* 205 */     return "ConsolidationProgress [consolidationType=" + this.consolidationType + ", " + "firstSnapshotTime=" + this.firstSnapshotTime + ", " + "lastSnapshotTime=" + this.lastSnapshotTime + ", " + "pending=" + this.pending + ", " + "progress=" + this.progress + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsolidationProgress.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */