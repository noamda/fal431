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
/*    */ @XmlType(name="wanCompression")
/*    */ @XmlEnum
/*    */ public enum WanCompression
/*    */ {
/* 30 */   NONE, 
/* 31 */   LOW, 
/* 32 */   MEDIUM, 
/* 33 */   HIGH, 
/* 34 */   UNKNOWN;
/*    */   
/*    */   private WanCompression() {}
/* 37 */   public String value() { return name(); }
/*    */   
/*    */   public static WanCompression fromValue(String v)
/*    */   {
/* 41 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\WanCompression.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */