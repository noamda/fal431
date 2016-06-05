/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="LongTermStatisticsTimeFrames", propOrder={"timeFrames"})
/*     */ public class LongTermStatisticsTimeFrames
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected List<LongTermStatisticsTimeFrame> timeFrames;
/*     */   
/*     */   public LongTermStatisticsTimeFrames() {}
/*     */   
/*     */   public LongTermStatisticsTimeFrames(List<LongTermStatisticsTimeFrame> timeFrames)
/*     */   {
/*  48 */     this.timeFrames = timeFrames;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<LongTermStatisticsTimeFrame> getTimeFrames()
/*     */   {
/*  74 */     if (this.timeFrames == null) {
/*  75 */       this.timeFrames = new ArrayList();
/*     */     }
/*  77 */     return this.timeFrames;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof LongTermStatisticsTimeFrames)) {
/*  88 */       return false;
/*     */     }
/*  90 */     LongTermStatisticsTimeFrames otherObj = (LongTermStatisticsTimeFrames)obj;
/*     */     
/*  92 */     return this.timeFrames == otherObj.timeFrames ? true : this.timeFrames != null ? this.timeFrames.equals(otherObj.timeFrames) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.timeFrames != null ? this.timeFrames.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "LongTermStatisticsTimeFrames [timeFrames=" + this.timeFrames + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\LongTermStatisticsTimeFrames.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */