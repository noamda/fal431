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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="exportConsolidatedStatisticsByTimeFrame", propOrder={"timeFrame"})
/*     */ public class ExportConsolidatedStatisticsByTimeFrame
/*     */ {
/*     */   protected LongTermStatisticsTimeFrame timeFrame;
/*     */   
/*     */   public ExportConsolidatedStatisticsByTimeFrame() {}
/*     */   
/*     */   public ExportConsolidatedStatisticsByTimeFrame(LongTermStatisticsTimeFrame timeFrame)
/*     */   {
/*  44 */     this.timeFrame = timeFrame;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public LongTermStatisticsTimeFrame getTimeFrame()
/*     */   {
/*  56 */     return this.timeFrame;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTimeFrame(LongTermStatisticsTimeFrame value)
/*     */   {
/*  68 */     this.timeFrame = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof ExportConsolidatedStatisticsByTimeFrame)) {
/*  79 */       return false;
/*     */     }
/*  81 */     ExportConsolidatedStatisticsByTimeFrame otherObj = (ExportConsolidatedStatisticsByTimeFrame)obj;
/*     */     
/*  83 */     return this.timeFrame == otherObj.timeFrame ? true : this.timeFrame != null ? this.timeFrame.equals(otherObj.timeFrame) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.timeFrame != null ? this.timeFrame.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "ExportConsolidatedStatisticsByTimeFrame [timeFrame=" + this.timeFrame + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ExportConsolidatedStatisticsByTimeFrame.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */