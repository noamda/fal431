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
/*    */ @XmlType(name="reportStatus")
/*    */ @XmlEnum
/*    */ public enum ReportStatus
/*    */ {
/* 31 */   IN_PROGRESS, 
/* 32 */   COMPLETED, 
/* 33 */   COMPLETED_WITH_FAILURES, 
/* 34 */   ABORTED, 
/* 35 */   INITIALIZING, 
/* 36 */   UNKNOWN;
/*    */   
/*    */   private ReportStatus() {}
/* 39 */   public String value() { return name(); }
/*    */   
/*    */   public static ReportStatus fromValue(String v)
/*    */   {
/* 43 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ReportStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */