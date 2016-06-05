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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlType(name="reportStepStatus")
/*    */ @XmlEnum
/*    */ public enum ReportStepStatus
/*    */ {
/* 34 */   IN_PROGRESS, 
/* 35 */   COMPLETED, 
/* 36 */   SKIPPED, 
/* 37 */   FAILED, 
/* 38 */   FAILED_TIMEOUT, 
/* 39 */   COMPLETED_WITH_FAILURES, 
/* 40 */   UNKNOWN, 
/* 41 */   COMPLETED_FUTURE_USE_1, 
/* 42 */   NOTCOMPLETED_FUTURE_USE_2;
/*    */   
/*    */   private ReportStepStatus() {}
/* 45 */   public String value() { return name(); }
/*    */   
/*    */   public static ReportStepStatus fromValue(String v)
/*    */   {
/* 49 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ReportStepStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */