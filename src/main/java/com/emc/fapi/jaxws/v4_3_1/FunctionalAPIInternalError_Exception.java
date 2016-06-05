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
/*    */ @WebFault(name="FunctionalAPIInternalError", targetNamespace="http://impl.version4_3_1.fapi.emc.com/")
/*    */ public class FunctionalAPIInternalError_Exception
/*    */   extends Exception
/*    */ {
/*    */   private FunctionalAPIInternalError faultInfo;
/*    */   
/*    */   public FunctionalAPIInternalError_Exception(String message, FunctionalAPIInternalError faultInfo)
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
/*    */   public FunctionalAPIInternalError_Exception(String message, FunctionalAPIInternalError faultInfo, Throwable cause)
/*    */   {
/* 41 */     super(message, cause);
/* 42 */     this.faultInfo = faultInfo;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public FunctionalAPIInternalError getFaultInfo()
/*    */   {
/* 51 */     return this.faultInfo;
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FunctionalAPIInternalError_Exception.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */