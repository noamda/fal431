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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="OutgoingThroughputStatistics", propOrder={"rpaUID", "numberOfGrids", "outgoingThroughput"})
/*     */ public class OutgoingThroughputStatistics
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected RpaUID rpaUID;
/*     */   protected int numberOfGrids;
/*     */   protected long outgoingThroughput;
/*     */   
/*     */   public OutgoingThroughputStatistics() {}
/*     */   
/*     */   public OutgoingThroughputStatistics(RpaUID rpaUID, int numberOfGrids, long outgoingThroughput)
/*     */   {
/*  52 */     this.rpaUID = rpaUID;
/*  53 */     this.numberOfGrids = numberOfGrids;
/*  54 */     this.outgoingThroughput = outgoingThroughput;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RpaUID getRpaUID()
/*     */   {
/*  66 */     return this.rpaUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRpaUID(RpaUID value)
/*     */   {
/*  78 */     this.rpaUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getNumberOfGrids()
/*     */   {
/*  86 */     return this.numberOfGrids;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNumberOfGrids(int value)
/*     */   {
/*  94 */     this.numberOfGrids = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getOutgoingThroughput()
/*     */   {
/* 102 */     return this.outgoingThroughput;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setOutgoingThroughput(long value)
/*     */   {
/* 110 */     this.outgoingThroughput = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 120 */     if (!(obj instanceof OutgoingThroughputStatistics)) {
/* 121 */       return false;
/*     */     }
/* 123 */     OutgoingThroughputStatistics otherObj = (OutgoingThroughputStatistics)obj;
/*     */     
/* 125 */     return (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID) && (this.numberOfGrids == otherObj.numberOfGrids) && (this.outgoingThroughput == otherObj.outgoingThroughput);
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
/* 136 */     return (this.rpaUID != null ? this.rpaUID.hashCode() : 0) ^ this.numberOfGrids ^ (int)this.outgoingThroughput;
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
/* 147 */     return "OutgoingThroughputStatistics [rpaUID=" + this.rpaUID + ", " + "numberOfGrids=" + this.numberOfGrids + ", " + "outgoingThroughput=" + this.outgoingThroughput + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\OutgoingThroughputStatistics.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */