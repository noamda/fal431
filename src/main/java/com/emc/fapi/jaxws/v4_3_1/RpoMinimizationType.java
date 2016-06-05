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
/*    */ @XmlType(name="rpoMinimizationType")
/*    */ @XmlEnum
/*    */ public enum RpoMinimizationType
/*    */ {
/* 29 */   MINIMIZE_LAG, 
/* 30 */   MINIMIZE_BANDWIDTH, 
/* 31 */   IRRELEVANT, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private RpoMinimizationType() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static RpoMinimizationType fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RpoMinimizationType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */