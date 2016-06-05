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
/*    */ @XmlType(name="troubleshootResultSeverity")
/*    */ @XmlEnum
/*    */ public enum TroubleshootResultSeverity
/*    */ {
/* 29 */   SUCCESS, 
/* 30 */   INFO, 
/* 31 */   WARNING, 
/* 32 */   ERROR;
/*    */   
/*    */   private TroubleshootResultSeverity() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static TroubleshootResultSeverity fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\TroubleshootResultSeverity.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */