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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @XmlType(name="ConsistencyGroupCopyJournalStatistics", propOrder={"actualJournalSizeInBytes", "actualJournalUsageInBytes", "consolidationStatistics", "distributionFinished", "fastForward", "imageAccessSizeLeftInBytes", "imageAccessTimeLeftInSeconds", "imageAccessTotalSizeInBytes", "journalLagInBytes", "movingFrom", "movingTo", "tspUsageInBytes", "tspUsagePercentage", "usagePercentFromDistributionCapacity"})
/*     */ public class ConsistencyGroupCopyJournalStatistics
/*     */ {
/*     */   protected long actualJournalSizeInBytes;
/*     */   protected long actualJournalUsageInBytes;
/*     */   protected SnapshotConsolidationStatistics consolidationStatistics;
/*     */   protected Boolean distributionFinished;
/*     */   protected boolean fastForward;
/*     */   protected Long imageAccessSizeLeftInBytes;
/*     */   protected Long imageAccessTimeLeftInSeconds;
/*     */   protected Long imageAccessTotalSizeInBytes;
/*     */   protected Long journalLagInBytes;
/*     */   protected RecoverPointTimeStamp movingFrom;
/*     */   protected RecoverPointTimeStamp movingTo;
/*     */   protected Long tspUsageInBytes;
/*     */   protected Double tspUsagePercentage;
/*     */   protected double usagePercentFromDistributionCapacity;
/*     */   
/*     */   public ConsistencyGroupCopyJournalStatistics() {}
/*     */   
/*     */   public ConsistencyGroupCopyJournalStatistics(long actualJournalSizeInBytes, long actualJournalUsageInBytes, SnapshotConsolidationStatistics consolidationStatistics, Boolean distributionFinished, boolean fastForward, Long imageAccessSizeLeftInBytes, Long imageAccessTimeLeftInSeconds, Long imageAccessTotalSizeInBytes, Long journalLagInBytes, RecoverPointTimeStamp movingFrom, RecoverPointTimeStamp movingTo, Long tspUsageInBytes, Double tspUsagePercentage, double usagePercentFromDistributionCapacity)
/*     */   {
/*  83 */     this.actualJournalSizeInBytes = actualJournalSizeInBytes;
/*  84 */     this.actualJournalUsageInBytes = actualJournalUsageInBytes;
/*  85 */     this.consolidationStatistics = consolidationStatistics;
/*  86 */     this.distributionFinished = distributionFinished;
/*  87 */     this.fastForward = fastForward;
/*  88 */     this.imageAccessSizeLeftInBytes = imageAccessSizeLeftInBytes;
/*  89 */     this.imageAccessTimeLeftInSeconds = imageAccessTimeLeftInSeconds;
/*  90 */     this.imageAccessTotalSizeInBytes = imageAccessTotalSizeInBytes;
/*  91 */     this.journalLagInBytes = journalLagInBytes;
/*  92 */     this.movingFrom = movingFrom;
/*  93 */     this.movingTo = movingTo;
/*  94 */     this.tspUsageInBytes = tspUsageInBytes;
/*  95 */     this.tspUsagePercentage = tspUsagePercentage;
/*  96 */     this.usagePercentFromDistributionCapacity = usagePercentFromDistributionCapacity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getActualJournalSizeInBytes()
/*     */   {
/* 104 */     return this.actualJournalSizeInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setActualJournalSizeInBytes(long value)
/*     */   {
/* 112 */     this.actualJournalSizeInBytes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getActualJournalUsageInBytes()
/*     */   {
/* 120 */     return this.actualJournalUsageInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setActualJournalUsageInBytes(long value)
/*     */   {
/* 128 */     this.actualJournalUsageInBytes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SnapshotConsolidationStatistics getConsolidationStatistics()
/*     */   {
/* 140 */     return this.consolidationStatistics;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConsolidationStatistics(SnapshotConsolidationStatistics value)
/*     */   {
/* 152 */     this.consolidationStatistics = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isDistributionFinished()
/*     */   {
/* 164 */     return this.distributionFinished;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDistributionFinished(Boolean value)
/*     */   {
/* 176 */     this.distributionFinished = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isFastForward()
/*     */   {
/* 184 */     return this.fastForward;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFastForward(boolean value)
/*     */   {
/* 192 */     this.fastForward = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getImageAccessSizeLeftInBytes()
/*     */   {
/* 204 */     return this.imageAccessSizeLeftInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setImageAccessSizeLeftInBytes(Long value)
/*     */   {
/* 216 */     this.imageAccessSizeLeftInBytes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getImageAccessTimeLeftInSeconds()
/*     */   {
/* 228 */     return this.imageAccessTimeLeftInSeconds;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setImageAccessTimeLeftInSeconds(Long value)
/*     */   {
/* 240 */     this.imageAccessTimeLeftInSeconds = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getImageAccessTotalSizeInBytes()
/*     */   {
/* 252 */     return this.imageAccessTotalSizeInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setImageAccessTotalSizeInBytes(Long value)
/*     */   {
/* 264 */     this.imageAccessTotalSizeInBytes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getJournalLagInBytes()
/*     */   {
/* 276 */     return this.journalLagInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setJournalLagInBytes(Long value)
/*     */   {
/* 288 */     this.journalLagInBytes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointTimeStamp getMovingFrom()
/*     */   {
/* 300 */     return this.movingFrom;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMovingFrom(RecoverPointTimeStamp value)
/*     */   {
/* 312 */     this.movingFrom = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointTimeStamp getMovingTo()
/*     */   {
/* 324 */     return this.movingTo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMovingTo(RecoverPointTimeStamp value)
/*     */   {
/* 336 */     this.movingTo = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getTspUsageInBytes()
/*     */   {
/* 348 */     return this.tspUsageInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTspUsageInBytes(Long value)
/*     */   {
/* 360 */     this.tspUsageInBytes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Double getTspUsagePercentage()
/*     */   {
/* 372 */     return this.tspUsagePercentage;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTspUsagePercentage(Double value)
/*     */   {
/* 384 */     this.tspUsagePercentage = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public double getUsagePercentFromDistributionCapacity()
/*     */   {
/* 392 */     return this.usagePercentFromDistributionCapacity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUsagePercentFromDistributionCapacity(double value)
/*     */   {
/* 400 */     this.usagePercentFromDistributionCapacity = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 410 */     if (!(obj instanceof ConsistencyGroupCopyJournalStatistics)) {
/* 411 */       return false;
/*     */     }
/* 413 */     ConsistencyGroupCopyJournalStatistics otherObj = (ConsistencyGroupCopyJournalStatistics)obj;
/*     */     
/* 415 */     return (this.actualJournalSizeInBytes == otherObj.actualJournalSizeInBytes) && (this.actualJournalUsageInBytes == otherObj.actualJournalUsageInBytes) && (this.consolidationStatistics != null ? this.consolidationStatistics.equals(otherObj.consolidationStatistics) : this.consolidationStatistics == otherObj.consolidationStatistics) && (this.distributionFinished != null ? this.distributionFinished.equals(otherObj.distributionFinished) : this.distributionFinished == otherObj.distributionFinished) && (this.fastForward == otherObj.fastForward) && (this.imageAccessSizeLeftInBytes != null ? this.imageAccessSizeLeftInBytes.equals(otherObj.imageAccessSizeLeftInBytes) : this.imageAccessSizeLeftInBytes == otherObj.imageAccessSizeLeftInBytes) && (this.imageAccessTimeLeftInSeconds != null ? this.imageAccessTimeLeftInSeconds.equals(otherObj.imageAccessTimeLeftInSeconds) : this.imageAccessTimeLeftInSeconds == otherObj.imageAccessTimeLeftInSeconds) && (this.imageAccessTotalSizeInBytes != null ? this.imageAccessTotalSizeInBytes.equals(otherObj.imageAccessTotalSizeInBytes) : this.imageAccessTotalSizeInBytes == otherObj.imageAccessTotalSizeInBytes) && (this.journalLagInBytes != null ? this.journalLagInBytes.equals(otherObj.journalLagInBytes) : this.journalLagInBytes == otherObj.journalLagInBytes) && (this.movingFrom != null ? this.movingFrom.equals(otherObj.movingFrom) : this.movingFrom == otherObj.movingFrom) && (this.movingTo != null ? this.movingTo.equals(otherObj.movingTo) : this.movingTo == otherObj.movingTo) && (this.tspUsageInBytes != null ? this.tspUsageInBytes.equals(otherObj.tspUsageInBytes) : this.tspUsageInBytes == otherObj.tspUsageInBytes) && (this.tspUsagePercentage != null ? this.tspUsagePercentage.equals(otherObj.tspUsagePercentage) : this.tspUsagePercentage == otherObj.tspUsagePercentage) && (this.usagePercentFromDistributionCapacity == otherObj.usagePercentFromDistributionCapacity);
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
/*     */   public int hashCode()
/*     */   {
/* 437 */     return (int)this.actualJournalSizeInBytes ^ (int)this.actualJournalUsageInBytes ^ (this.consolidationStatistics != null ? this.consolidationStatistics.hashCode() : 0) ^ (this.distributionFinished != null ? this.distributionFinished.hashCode() : 0) ^ (this.fastForward ? 1 : 0) ^ (this.imageAccessSizeLeftInBytes != null ? this.imageAccessSizeLeftInBytes.hashCode() : 0) ^ (this.imageAccessTimeLeftInSeconds != null ? this.imageAccessTimeLeftInSeconds.hashCode() : 0) ^ (this.imageAccessTotalSizeInBytes != null ? this.imageAccessTotalSizeInBytes.hashCode() : 0) ^ (this.journalLagInBytes != null ? this.journalLagInBytes.hashCode() : 0) ^ (this.movingFrom != null ? this.movingFrom.hashCode() : 0) ^ (this.movingTo != null ? this.movingTo.hashCode() : 0) ^ (this.tspUsageInBytes != null ? this.tspUsageInBytes.hashCode() : 0) ^ (this.tspUsagePercentage != null ? this.tspUsagePercentage.hashCode() : 0) ^ (int)this.usagePercentFromDistributionCapacity;
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
/*     */   public String toString()
/*     */   {
/* 459 */     return "ConsistencyGroupCopyJournalStatistics [actualJournalSizeInBytes=" + this.actualJournalSizeInBytes + ", " + "actualJournalUsageInBytes=" + this.actualJournalUsageInBytes + ", " + "consolidationStatistics=" + this.consolidationStatistics + ", " + "distributionFinished=" + this.distributionFinished + ", " + "fastForward=" + this.fastForward + ", " + "imageAccessSizeLeftInBytes=" + this.imageAccessSizeLeftInBytes + ", " + "imageAccessTimeLeftInSeconds=" + this.imageAccessTimeLeftInSeconds + ", " + "imageAccessTotalSizeInBytes=" + this.imageAccessTotalSizeInBytes + ", " + "journalLagInBytes=" + this.journalLagInBytes + ", " + "movingFrom=" + this.movingFrom + ", " + "movingTo=" + this.movingTo + ", " + "tspUsageInBytes=" + this.tspUsageInBytes + ", " + "tspUsagePercentage=" + this.tspUsagePercentage + ", " + "usagePercentFromDistributionCapacity=" + this.usagePercentFromDistributionCapacity + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupCopyJournalStatistics.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */