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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="MonitoredParameterWaterMarks", propOrder={"highWaterMark", "limit", "lowWaterMark"})
/*     */ public class MonitoredParameterWaterMarks
/*     */ {
/*     */   protected long highWaterMark;
/*     */   protected long limit;
/*     */   protected long lowWaterMark;
/*     */   
/*     */   public MonitoredParameterWaterMarks() {}
/*     */   
/*     */   public MonitoredParameterWaterMarks(long highWaterMark, long limit, long lowWaterMark)
/*     */   {
/*  50 */     this.highWaterMark = highWaterMark;
/*  51 */     this.limit = limit;
/*  52 */     this.lowWaterMark = lowWaterMark;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getHighWaterMark()
/*     */   {
/*  60 */     return this.highWaterMark;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setHighWaterMark(long value)
/*     */   {
/*  68 */     this.highWaterMark = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getLimit()
/*     */   {
/*  76 */     return this.limit;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLimit(long value)
/*     */   {
/*  84 */     this.limit = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getLowWaterMark()
/*     */   {
/*  92 */     return this.lowWaterMark;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLowWaterMark(long value)
/*     */   {
/* 100 */     this.lowWaterMark = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 110 */     if (!(obj instanceof MonitoredParameterWaterMarks)) {
/* 111 */       return false;
/*     */     }
/* 113 */     MonitoredParameterWaterMarks otherObj = (MonitoredParameterWaterMarks)obj;
/*     */     
/* 115 */     return (this.highWaterMark == otherObj.highWaterMark) && (this.limit == otherObj.limit) && (this.lowWaterMark == otherObj.lowWaterMark);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 126 */     return (int)this.highWaterMark ^ (int)this.limit ^ (int)this.lowWaterMark;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 137 */     return "MonitoredParameterWaterMarks [highWaterMark=" + this.highWaterMark + ", " + "limit=" + this.limit + ", " + "lowWaterMark=" + this.lowWaterMark + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\MonitoredParameterWaterMarks.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */