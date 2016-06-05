/*    */ package com.emc.fapi.jaxws.v4_3_1;
/*    */ 
/*    */ import javax.xml.ws.WebFault;
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
/*    */ @WebFault(name="FunctionalAPIValidationException", targetNamespace="http://impl.version4_3_1.fapi.emc.com/")
/*    */ public class FunctionalAPIValidationException_Exception
/*    */   extends Exception
/*    */ {
/*    */   private FunctionalAPIValidationException faultInfo;
/*    */   
/*    */   public FunctionalAPIValidationException_Exception(String message, FunctionalAPIValidationException faultInfo)
/*    */   {
/* 30 */     super(message);
/* 31 */     this.faultInfo = faultInfo;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public FunctionalAPIValidationException_Exception(String message, FunctionalAPIValidationException faultInfo, Throwable cause)
/*    */   {
/* 41 */     super(message, cause);
/* 42 */     this.faultInfo = faultInfo;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public FunctionalAPIValidationException getFaultInfo()
/*    */   {
/* 51 */     return this.faultInfo;
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FunctionalAPIValidationException_Exception.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */