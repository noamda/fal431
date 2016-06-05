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
/*    */ @XmlType(name="sendLoginEvent", propOrder={"isLoginSuccessful"})
/*    */ public class SendLoginEvent
/*    */ {
/*    */   protected boolean isLoginSuccessful;
/*    */   
/*    */   public SendLoginEvent() {}
/*    */   
/*    */   public SendLoginEvent(boolean isLoginSuccessful)
/*    */   {
/* 44 */     this.isLoginSuccessful = isLoginSuccessful;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean isIsLoginSuccessful()
/*    */   {
/* 52 */     return this.isLoginSuccessful;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setIsLoginSuccessful(boolean value)
/*    */   {
/* 60 */     this.isLoginSuccessful = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 70 */     if (!(obj instanceof SendLoginEvent)) {
/* 71 */       return false;
/*    */     }
/* 73 */     SendLoginEvent otherObj = (SendLoginEvent)obj;
/*    */     
/* 75 */     return this.isLoginSuccessful == otherObj.isLoginSuccessful;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 84 */     return this.isLoginSuccessful ? 1 : 0;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 93 */     return "SendLoginEvent [isLoginSuccessful=" + this.isLoginSuccessful + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SendLoginEvent.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */