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
/*     */ @XmlType(name="setBookmarkFrequency", propOrder={"groupSet", "frequencyInMicroSeconds"})
/*     */ public class SetBookmarkFrequency
/*     */ {
/*     */   protected ConsistencyGroupSetUID groupSet;
/*     */   protected long frequencyInMicroSeconds;
/*     */   
/*     */   public SetBookmarkFrequency() {}
/*     */   
/*     */   public SetBookmarkFrequency(ConsistencyGroupSetUID groupSet, long frequencyInMicroSeconds)
/*     */   {
/*  47 */     this.groupSet = groupSet;
/*  48 */     this.frequencyInMicroSeconds = frequencyInMicroSeconds;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupSetUID getGroupSet()
/*     */   {
/*  60 */     return this.groupSet;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupSet(ConsistencyGroupSetUID value)
/*     */   {
/*  72 */     this.groupSet = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getFrequencyInMicroSeconds()
/*     */   {
/*  80 */     return this.frequencyInMicroSeconds;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFrequencyInMicroSeconds(long value)
/*     */   {
/*  88 */     this.frequencyInMicroSeconds = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  98 */     if (!(obj instanceof SetBookmarkFrequency)) {
/*  99 */       return false;
/*     */     }
/* 101 */     SetBookmarkFrequency otherObj = (SetBookmarkFrequency)obj;
/*     */     
/* 103 */     return (this.groupSet != null ? this.groupSet.equals(otherObj.groupSet) : this.groupSet == otherObj.groupSet) && (this.frequencyInMicroSeconds == otherObj.frequencyInMicroSeconds);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 113 */     return (this.groupSet != null ? this.groupSet.hashCode() : 0) ^ (int)this.frequencyInMicroSeconds;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 123 */     return "SetBookmarkFrequency [groupSet=" + this.groupSet + ", " + "frequencyInMicroSeconds=" + this.frequencyInMicroSeconds + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetBookmarkFrequency.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */