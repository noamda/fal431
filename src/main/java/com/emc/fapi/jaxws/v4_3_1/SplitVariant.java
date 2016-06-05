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
/*    */ @XmlType(name="splitVariant")
/*    */ @XmlEnum
/*    */ public enum SplitVariant
/*    */ {
/* 29 */   STANDARD, 
/* 30 */   TSP, 
/* 31 */   REDIRECT, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private SplitVariant() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static SplitVariant fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SplitVariant.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */