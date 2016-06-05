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
/*    */ @XmlType(name="irThrottleType")
/*    */ @XmlEnum
/*    */ public enum IrThrottleType
/*    */ {
/* 30 */   LOW, 
/* 31 */   HIGH, 
/* 32 */   CUSTOM, 
/* 33 */   NONE, 
/* 34 */   UNKNOWN;
/*    */   
/*    */   private IrThrottleType() {}
/* 37 */   public String value() { return name(); }
/*    */   
/*    */   public static IrThrottleType fromValue(String v)
/*    */   {
/* 41 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\IrThrottleType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */