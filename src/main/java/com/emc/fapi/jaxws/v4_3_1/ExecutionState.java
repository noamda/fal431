/*    */ package com.emc.fapi.jaxws.v4_3_1;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
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
/*    */ @XmlType(name="executionState")
/*    */ @XmlEnum
/*    */ public enum ExecutionState
/*    */ {
/* 30 */   UNKNOWN, 
/* 31 */   RUNNING, 
/* 32 */   FINISHED, 
/* 33 */   ABORTED, 
/* 34 */   UNKNOWN_TRANSACTION;
/*    */   
/*    */   private ExecutionState() {}
/* 37 */   public String value() { return name(); }
/*    */   
/*    */   public static ExecutionState fromValue(String v)
/*    */   {
/* 41 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ExecutionState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */