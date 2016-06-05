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
/*    */ @XmlType(name="rpaStatus")
/*    */ @XmlEnum
/*    */ public enum RpaStatus
/*    */ {
/* 29 */   OK, 
/* 30 */   DOWN, 
/* 31 */   REMOVED_FOR_MAINTENANCE, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private RpaStatus() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static RpaStatus fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RpaStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */