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
/*    */ @XmlType(name="systemReportTransferMethod")
/*    */ @XmlEnum
/*    */ public enum SystemReportTransferMethod
/*    */ {
/* 29 */   ESRS, 
/* 30 */   SMTP, 
/* 31 */   FTPS, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private SystemReportTransferMethod() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static SystemReportTransferMethod fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SystemReportTransferMethod.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */