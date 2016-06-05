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
/*    */ @XmlType(name="arrayType")
/*    */ @XmlEnum
/*    */ public enum ArrayType
/*    */ {
/* 34 */   VNX, 
/* 35 */   VNXE, 
/* 36 */   SYMMETRIX, 
/* 37 */   CX, 
/* 38 */   VPLEX, 
/* 39 */   VC, 
/* 40 */   XTREMEIO, 
/* 41 */   SCALEIO, 
/* 42 */   UNKNOWN;
/*    */   
/*    */   private ArrayType() {}
/* 45 */   public String value() { return name(); }
/*    */   
/*    */   public static ArrayType fromValue(String v)
/*    */   {
/* 49 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */