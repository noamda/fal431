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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlType(name="quantityType")
/*    */ @XmlEnum
/*    */ public enum QuantityType
/*    */ {
/* 38 */   MICROSECONDS, 
/* 39 */   MILLISECONDS, 
/* 40 */   SECONDS, 
/* 41 */   MINUTES, 
/* 42 */   HOURS, 
/* 43 */   DAYS, 
/* 44 */   BYTES, 
/* 45 */   KB, 
/* 46 */   MB, 
/* 47 */   GB, 
/* 48 */   TB, 
/* 49 */   WRITES, 
/* 50 */   UNKNOWN;
/*    */   
/*    */   private QuantityType() {}
/* 53 */   public String value() { return name(); }
/*    */   
/*    */   public static QuantityType fromValue(String v)
/*    */   {
/* 57 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\QuantityType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */