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
/*    */ @XmlType(name="problemSeverity")
/*    */ @XmlEnum
/*    */ public enum ProblemSeverity
/*    */ {
/* 30 */   ERROR, 
/* 31 */   CRITICAL, 
/* 32 */   WARNING, 
/* 33 */   UNKNOWN, 
/* 34 */   OK;
/*    */   
/*    */   private ProblemSeverity() {}
/* 37 */   public String value() { return name(); }
/*    */   
/*    */   public static ProblemSeverity fromValue(String v)
/*    */   {
/* 41 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ProblemSeverity.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */