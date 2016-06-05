/*    */ package com.emc.fapi.jaxws.v4_3_1;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="ConsistentGroupSetConsistencyPolicy", propOrder={"bookmarkFrequencyInMicroSeconds"})
/*    */ public class ConsistentGroupSetConsistencyPolicy
/*    */ {
/*    */   protected long bookmarkFrequencyInMicroSeconds;
/*    */   
/*    */   public ConsistentGroupSetConsistencyPolicy() {}
/*    */   
/*    */   public ConsistentGroupSetConsistencyPolicy(long bookmarkFrequencyInMicroSeconds)
/*    */   {
/* 44 */     this.bookmarkFrequencyInMicroSeconds = bookmarkFrequencyInMicroSeconds;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public long getBookmarkFrequencyInMicroSeconds()
/*    */   {
/* 52 */     return this.bookmarkFrequencyInMicroSeconds;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setBookmarkFrequencyInMicroSeconds(long value)
/*    */   {
/* 60 */     this.bookmarkFrequencyInMicroSeconds = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 70 */     if (!(obj instanceof ConsistentGroupSetConsistencyPolicy)) {
/* 71 */       return false;
/*    */     }
/* 73 */     ConsistentGroupSetConsistencyPolicy otherObj = (ConsistentGroupSetConsistencyPolicy)obj;
/*    */     
/* 75 */     return this.bookmarkFrequencyInMicroSeconds == otherObj.bookmarkFrequencyInMicroSeconds;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 84 */     return (int)this.bookmarkFrequencyInMicroSeconds;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 93 */     return "ConsistentGroupSetConsistencyPolicy [bookmarkFrequencyInMicroSeconds=" + this.bookmarkFrequencyInMicroSeconds + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistentGroupSetConsistencyPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */