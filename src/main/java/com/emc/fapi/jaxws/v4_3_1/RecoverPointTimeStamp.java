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
/*    */ @XmlType(name="RecoverPointTimeStamp", propOrder={"timeInMicroSeconds"})
/*    */ public class RecoverPointTimeStamp
/*    */ {
/*    */   protected long timeInMicroSeconds;
/*    */   
/*    */   public RecoverPointTimeStamp() {}
/*    */   
/*    */   public RecoverPointTimeStamp(long timeInMicroSeconds)
/*    */   {
/* 44 */     this.timeInMicroSeconds = timeInMicroSeconds;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public long getTimeInMicroSeconds()
/*    */   {
/* 52 */     return this.timeInMicroSeconds;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setTimeInMicroSeconds(long value)
/*    */   {
/* 60 */     this.timeInMicroSeconds = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 70 */     if (!(obj instanceof RecoverPointTimeStamp)) {
/* 71 */       return false;
/*    */     }
/* 73 */     RecoverPointTimeStamp otherObj = (RecoverPointTimeStamp)obj;
/*    */     
/* 75 */     return this.timeInMicroSeconds == otherObj.timeInMicroSeconds;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 84 */     return (int)this.timeInMicroSeconds;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 93 */     return "RecoverPointTimeStamp [timeInMicroSeconds=" + this.timeInMicroSeconds + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RecoverPointTimeStamp.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */