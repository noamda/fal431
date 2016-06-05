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
/*     */ @XmlType(name="ConsistencyGroupLinkInitStatistics", propOrder={"initCompletionPortion", "initIncomingThroughput", "initOutgoingThroughput", "numberOfGrids"})
/*     */ public class ConsistencyGroupLinkInitStatistics
/*     */ {
/*     */   protected double initCompletionPortion;
/*     */   protected long initIncomingThroughput;
/*     */   protected long initOutgoingThroughput;
/*     */   protected int numberOfGrids;
/*     */   
/*     */   public ConsistencyGroupLinkInitStatistics() {}
/*     */   
/*     */   public ConsistencyGroupLinkInitStatistics(double initCompletionPortion, long initIncomingThroughput, long initOutgoingThroughput, int numberOfGrids)
/*     */   {
/*  53 */     this.initCompletionPortion = initCompletionPortion;
/*  54 */     this.initIncomingThroughput = initIncomingThroughput;
/*  55 */     this.initOutgoingThroughput = initOutgoingThroughput;
/*  56 */     this.numberOfGrids = numberOfGrids;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public double getInitCompletionPortion()
/*     */   {
/*  64 */     return this.initCompletionPortion;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setInitCompletionPortion(double value)
/*     */   {
/*  72 */     this.initCompletionPortion = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getInitIncomingThroughput()
/*     */   {
/*  80 */     return this.initIncomingThroughput;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setInitIncomingThroughput(long value)
/*     */   {
/*  88 */     this.initIncomingThroughput = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getInitOutgoingThroughput()
/*     */   {
/*  96 */     return this.initOutgoingThroughput;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setInitOutgoingThroughput(long value)
/*     */   {
/* 104 */     this.initOutgoingThroughput = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getNumberOfGrids()
/*     */   {
/* 112 */     return this.numberOfGrids;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNumberOfGrids(int value)
/*     */   {
/* 120 */     this.numberOfGrids = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 130 */     if (!(obj instanceof ConsistencyGroupLinkInitStatistics)) {
/* 131 */       return false;
/*     */     }
/* 133 */     ConsistencyGroupLinkInitStatistics otherObj = (ConsistencyGroupLinkInitStatistics)obj;
/*     */     
/* 135 */     return (this.initCompletionPortion == otherObj.initCompletionPortion) && (this.initIncomingThroughput == otherObj.initIncomingThroughput) && (this.initOutgoingThroughput == otherObj.initOutgoingThroughput) && (this.numberOfGrids == otherObj.numberOfGrids);
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
/* 147 */     return (int)this.initCompletionPortion ^ (int)this.initIncomingThroughput ^ (int)this.initOutgoingThroughput ^ this.numberOfGrids;
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
/* 159 */     return "ConsistencyGroupLinkInitStatistics [initCompletionPortion=" + this.initCompletionPortion + ", " + "initIncomingThroughput=" + this.initIncomingThroughput + ", " + "initOutgoingThroughput=" + this.initOutgoingThroughput + ", " + "numberOfGrids=" + this.numberOfGrids + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupLinkInitStatistics.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */