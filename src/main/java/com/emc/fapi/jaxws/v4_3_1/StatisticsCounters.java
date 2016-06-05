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
/*     */ @XmlType(name="StatisticsCounters", propOrder={"dataCounter", "timeCounter", "transactionCounter"})
/*     */ public class StatisticsCounters
/*     */ {
/*     */   protected long dataCounter;
/*     */   protected long timeCounter;
/*     */   protected long transactionCounter;
/*     */   
/*     */   public StatisticsCounters() {}
/*     */   
/*     */   public StatisticsCounters(long dataCounter, long timeCounter, long transactionCounter)
/*     */   {
/*  50 */     this.dataCounter = dataCounter;
/*  51 */     this.timeCounter = timeCounter;
/*  52 */     this.transactionCounter = transactionCounter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getDataCounter()
/*     */   {
/*  60 */     return this.dataCounter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDataCounter(long value)
/*     */   {
/*  68 */     this.dataCounter = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getTimeCounter()
/*     */   {
/*  76 */     return this.timeCounter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTimeCounter(long value)
/*     */   {
/*  84 */     this.timeCounter = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getTransactionCounter()
/*     */   {
/*  92 */     return this.transactionCounter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTransactionCounter(long value)
/*     */   {
/* 100 */     this.transactionCounter = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 110 */     if (!(obj instanceof StatisticsCounters)) {
/* 111 */       return false;
/*     */     }
/* 113 */     StatisticsCounters otherObj = (StatisticsCounters)obj;
/*     */     
/* 115 */     return (this.dataCounter == otherObj.dataCounter) && (this.timeCounter == otherObj.timeCounter) && (this.transactionCounter == otherObj.transactionCounter);
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
/* 126 */     return (int)this.dataCounter ^ (int)this.timeCounter ^ (int)this.transactionCounter;
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
/* 137 */     return "StatisticsCounters [dataCounter=" + this.dataCounter + ", " + "timeCounter=" + this.timeCounter + ", " + "transactionCounter=" + this.transactionCounter + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\StatisticsCounters.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */