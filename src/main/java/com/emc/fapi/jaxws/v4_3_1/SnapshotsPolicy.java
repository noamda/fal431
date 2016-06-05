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
/*     */ @XmlType(name="SnapshotsPolicy", propOrder={"numOfDesiredSnapshots", "snapshotTimeLimitInSeconds"})
/*     */ public class SnapshotsPolicy
/*     */ {
/*     */   protected Integer numOfDesiredSnapshots;
/*     */   protected Long snapshotTimeLimitInSeconds;
/*     */   
/*     */   public SnapshotsPolicy() {}
/*     */   
/*     */   public SnapshotsPolicy(Integer numOfDesiredSnapshots, Long snapshotTimeLimitInSeconds)
/*     */   {
/*  47 */     this.numOfDesiredSnapshots = numOfDesiredSnapshots;
/*  48 */     this.snapshotTimeLimitInSeconds = snapshotTimeLimitInSeconds;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Integer getNumOfDesiredSnapshots()
/*     */   {
/*  60 */     return this.numOfDesiredSnapshots;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNumOfDesiredSnapshots(Integer value)
/*     */   {
/*  72 */     this.numOfDesiredSnapshots = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getSnapshotTimeLimitInSeconds()
/*     */   {
/*  84 */     return this.snapshotTimeLimitInSeconds;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSnapshotTimeLimitInSeconds(Long value)
/*     */   {
/*  96 */     this.snapshotTimeLimitInSeconds = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof SnapshotsPolicy)) {
/* 107 */       return false;
/*     */     }
/* 109 */     SnapshotsPolicy otherObj = (SnapshotsPolicy)obj;
/*     */     
/* 111 */     return (this.numOfDesiredSnapshots != null ? this.numOfDesiredSnapshots.equals(otherObj.numOfDesiredSnapshots) : this.numOfDesiredSnapshots == otherObj.numOfDesiredSnapshots) && (this.snapshotTimeLimitInSeconds != null ? this.snapshotTimeLimitInSeconds.equals(otherObj.snapshotTimeLimitInSeconds) : this.snapshotTimeLimitInSeconds == otherObj.snapshotTimeLimitInSeconds);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.numOfDesiredSnapshots != null ? this.numOfDesiredSnapshots.hashCode() : 0) ^ (this.snapshotTimeLimitInSeconds != null ? this.snapshotTimeLimitInSeconds.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "SnapshotsPolicy [numOfDesiredSnapshots=" + this.numOfDesiredSnapshots + ", " + "snapshotTimeLimitInSeconds=" + this.snapshotTimeLimitInSeconds + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SnapshotsPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */