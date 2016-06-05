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
/*    */ @XmlType(name="axxanaCopyStatus")
/*    */ @XmlEnum
/*    */ public enum AxxanaCopyStatus
/*    */ {
/* 33 */   OK, 
/* 34 */   DISABLED, 
/* 35 */   INITIALIZING, 
/* 36 */   DOWN, 
/* 37 */   EXCEEDING_LAG_POLICY, 
/* 38 */   FAILED_TO_CREATE, 
/* 39 */   MEMORY_PROBLEM, 
/* 40 */   UNKNOWN;
/*    */   
/*    */   private AxxanaCopyStatus() {}
/* 43 */   public String value() { return name(); }
/*    */   
/*    */   public static AxxanaCopyStatus fromValue(String v)
/*    */   {
/* 47 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AxxanaCopyStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */