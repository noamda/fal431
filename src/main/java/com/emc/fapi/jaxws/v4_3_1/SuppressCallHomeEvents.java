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
/*    */ @XmlType(name="suppressCallHomeEvents", propOrder={"suppressUntilInGmt"})
/*    */ public class SuppressCallHomeEvents
/*    */ {
/*    */   protected long suppressUntilInGmt;
/*    */   
/*    */   public SuppressCallHomeEvents() {}
/*    */   
/*    */   public SuppressCallHomeEvents(long suppressUntilInGmt)
/*    */   {
/* 44 */     this.suppressUntilInGmt = suppressUntilInGmt;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public long getSuppressUntilInGmt()
/*    */   {
/* 52 */     return this.suppressUntilInGmt;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setSuppressUntilInGmt(long value)
/*    */   {
/* 60 */     this.suppressUntilInGmt = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 70 */     if (!(obj instanceof SuppressCallHomeEvents)) {
/* 71 */       return false;
/*    */     }
/* 73 */     SuppressCallHomeEvents otherObj = (SuppressCallHomeEvents)obj;
/*    */     
/* 75 */     return this.suppressUntilInGmt == otherObj.suppressUntilInGmt;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 84 */     return (int)this.suppressUntilInGmt;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 93 */     return "SuppressCallHomeEvents [suppressUntilInGmt=" + this.suppressUntilInGmt + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SuppressCallHomeEvents.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */