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
/*     */ @XmlType(name="TimeFrame", propOrder={"endTime", "startTime"})
/*     */ public class TimeFrame
/*     */ {
/*     */   protected RecoverPointTimeStamp endTime;
/*     */   protected RecoverPointTimeStamp startTime;
/*     */   
/*     */   public TimeFrame() {}
/*     */   
/*     */   public TimeFrame(RecoverPointTimeStamp endTime, RecoverPointTimeStamp startTime)
/*     */   {
/*  47 */     this.endTime = endTime;
/*  48 */     this.startTime = startTime;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointTimeStamp getEndTime()
/*     */   {
/*  60 */     return this.endTime;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEndTime(RecoverPointTimeStamp value)
/*     */   {
/*  72 */     this.endTime = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointTimeStamp getStartTime()
/*     */   {
/*  84 */     return this.startTime;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStartTime(RecoverPointTimeStamp value)
/*     */   {
/*  96 */     this.startTime = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof TimeFrame)) {
/* 107 */       return false;
/*     */     }
/* 109 */     TimeFrame otherObj = (TimeFrame)obj;
/*     */     
/* 111 */     return (this.endTime != null ? this.endTime.equals(otherObj.endTime) : this.endTime == otherObj.endTime) && (this.startTime != null ? this.startTime.equals(otherObj.startTime) : this.startTime == otherObj.startTime);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.endTime != null ? this.endTime.hashCode() : 0) ^ (this.startTime != null ? this.startTime.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "TimeFrame [endTime=" + this.endTime + ", " + "startTime=" + this.startTime + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\TimeFrame.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */