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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="AutomaticSnapshotConsolidationPolicy", propOrder={"dailyConsolidations", "enabled", "unconsolidatedDurationInSeconds", "weeklyConsolidations"})
/*     */ public class AutomaticSnapshotConsolidationPolicy
/*     */ {
/*     */   protected long dailyConsolidations;
/*     */   protected boolean enabled;
/*     */   protected long unconsolidatedDurationInSeconds;
/*     */   protected long weeklyConsolidations;
/*     */   
/*     */   public AutomaticSnapshotConsolidationPolicy() {}
/*     */   
/*     */   public AutomaticSnapshotConsolidationPolicy(long dailyConsolidations, boolean enabled, long unconsolidatedDurationInSeconds, long weeklyConsolidations)
/*     */   {
/*  53 */     this.dailyConsolidations = dailyConsolidations;
/*  54 */     this.enabled = enabled;
/*  55 */     this.unconsolidatedDurationInSeconds = unconsolidatedDurationInSeconds;
/*  56 */     this.weeklyConsolidations = weeklyConsolidations;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getDailyConsolidations()
/*     */   {
/*  64 */     return this.dailyConsolidations;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDailyConsolidations(long value)
/*     */   {
/*  72 */     this.dailyConsolidations = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isEnabled()
/*     */   {
/*  80 */     return this.enabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEnabled(boolean value)
/*     */   {
/*  88 */     this.enabled = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getUnconsolidatedDurationInSeconds()
/*     */   {
/*  96 */     return this.unconsolidatedDurationInSeconds;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUnconsolidatedDurationInSeconds(long value)
/*     */   {
/* 104 */     this.unconsolidatedDurationInSeconds = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getWeeklyConsolidations()
/*     */   {
/* 112 */     return this.weeklyConsolidations;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setWeeklyConsolidations(long value)
/*     */   {
/* 120 */     this.weeklyConsolidations = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 130 */     if (!(obj instanceof AutomaticSnapshotConsolidationPolicy)) {
/* 131 */       return false;
/*     */     }
/* 133 */     AutomaticSnapshotConsolidationPolicy otherObj = (AutomaticSnapshotConsolidationPolicy)obj;
/*     */     
/* 135 */     return (this.dailyConsolidations == otherObj.dailyConsolidations) && (this.enabled == otherObj.enabled) && (this.unconsolidatedDurationInSeconds == otherObj.unconsolidatedDurationInSeconds) && (this.weeklyConsolidations == otherObj.weeklyConsolidations);
/*     */   }
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
/* 147 */     return (int)this.dailyConsolidations ^ (this.enabled ? 1 : 0) ^ (int)this.unconsolidatedDurationInSeconds ^ (int)this.weeklyConsolidations;
/*     */   }
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
/* 159 */     return "AutomaticSnapshotConsolidationPolicy [dailyConsolidations=" + this.dailyConsolidations + ", " + "enabled=" + this.enabled + ", " + "unconsolidatedDurationInSeconds=" + this.unconsolidatedDurationInSeconds + ", " + "weeklyConsolidations=" + this.weeklyConsolidations + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AutomaticSnapshotConsolidationPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */