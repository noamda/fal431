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
/*    */ @XmlType(name="reportType")
/*    */ @XmlEnum
/*    */ public enum ReportType
/*    */ {
/* 33 */   ENABLE_IMAGE_ACCESS, 
/* 34 */   DISABLE_IMAGE_ACCESS, 
/* 35 */   ACCESS_ANOTHER_IMAGE, 
/* 36 */   FAILOVER, 
/* 37 */   RECOVER_PRODUCTION, 
/* 38 */   RESUME_PRODUCTION, 
/* 39 */   TEST_AND_PROMOTE, 
/* 40 */   UNKNOWN;
/*    */   
/*    */   private ReportType() {}
/* 43 */   public String value() { return name(); }
/*    */   
/*    */   public static ReportType fromValue(String v)
/*    */   {
/* 47 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ReportType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */