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
/*     */ @XmlType(name="exportConsolidatedStatisticsByTimeFrames", propOrder={"timeFrames"})
/*     */ public class ExportConsolidatedStatisticsByTimeFrames
/*     */ {
/*     */   protected LongTermStatisticsTimeFrames timeFrames;
/*     */   
/*     */   public ExportConsolidatedStatisticsByTimeFrames() {}
/*     */   
/*     */   public ExportConsolidatedStatisticsByTimeFrames(LongTermStatisticsTimeFrames timeFrames)
/*     */   {
/*  44 */     this.timeFrames = timeFrames;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public LongTermStatisticsTimeFrames getTimeFrames()
/*     */   {
/*  56 */     return this.timeFrames;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTimeFrames(LongTermStatisticsTimeFrames value)
/*     */   {
/*  68 */     this.timeFrames = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof ExportConsolidatedStatisticsByTimeFrames)) {
/*  79 */       return false;
/*     */     }
/*  81 */     ExportConsolidatedStatisticsByTimeFrames otherObj = (ExportConsolidatedStatisticsByTimeFrames)obj;
/*     */     
/*  83 */     return this.timeFrames == otherObj.timeFrames ? true : this.timeFrames != null ? this.timeFrames.equals(otherObj.timeFrames) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.timeFrames != null ? this.timeFrames.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "ExportConsolidatedStatisticsByTimeFrames [timeFrames=" + this.timeFrames + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ExportConsolidatedStatisticsByTimeFrames.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */