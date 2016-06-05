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
/*     */ @XmlType(name="LongTermStatisticsTimeFrame", propOrder={"granularity", "timeFrame"})
/*     */ public class LongTermStatisticsTimeFrame
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected StatisticsGranularity granularity;
/*     */   @XmlElement(nillable=true)
/*     */   protected TimeFrame timeFrame;
/*     */   
/*     */   public LongTermStatisticsTimeFrame() {}
/*     */   
/*     */   public LongTermStatisticsTimeFrame(StatisticsGranularity granularity, TimeFrame timeFrame)
/*     */   {
/*  50 */     this.granularity = granularity;
/*  51 */     this.timeFrame = timeFrame;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public StatisticsGranularity getGranularity()
/*     */   {
/*  63 */     return this.granularity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGranularity(StatisticsGranularity value)
/*     */   {
/*  75 */     this.granularity = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public TimeFrame getTimeFrame()
/*     */   {
/*  87 */     return this.timeFrame;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTimeFrame(TimeFrame value)
/*     */   {
/*  99 */     this.timeFrame = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof LongTermStatisticsTimeFrame)) {
/* 110 */       return false;
/*     */     }
/* 112 */     LongTermStatisticsTimeFrame otherObj = (LongTermStatisticsTimeFrame)obj;
/*     */     
/* 114 */     return (this.granularity != null ? this.granularity.equals(otherObj.granularity) : this.granularity == otherObj.granularity) && (this.timeFrame != null ? this.timeFrame.equals(otherObj.timeFrame) : this.timeFrame == otherObj.timeFrame);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.granularity != null ? this.granularity.hashCode() : 0) ^ (this.timeFrame != null ? this.timeFrame.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "LongTermStatisticsTimeFrame [granularity=" + this.granularity + ", " + "timeFrame=" + this.timeFrame + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\LongTermStatisticsTimeFrame.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */