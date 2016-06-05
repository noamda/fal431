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
/*    */ 
/*    */ @XmlType(name="splitterType")
/*    */ @XmlEnum
/*    */ public enum SplitterType
/*    */ {
/* 39 */   CLARIION, 
/* 40 */   SYMMETRIX, 
/* 41 */   VPLEX_ARRAY, 
/* 42 */   VPLEX_DIRECTOR, 
/* 43 */   VNX2E, 
/* 44 */   VNX2E_SP, 
/* 45 */   ESX_CLUSTER, 
/* 46 */   ESX, 
/* 47 */   IO_FILTER, 
/* 48 */   IO_FILTER_CLUSTER, 
/* 49 */   SYMMETRIX_ARRAY, 
/* 50 */   SYMMETRIX_DIRECTOR, 
/* 51 */   SCALE_IO, 
/* 52 */   UNKNOWN;
/*    */   
/*    */   private SplitterType() {}
/* 55 */   public String value() { return name(); }
/*    */   
/*    */   public static SplitterType fromValue(String v)
/*    */   {
/* 59 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SplitterType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */