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
/*    */ @XmlType(name="splitterStatus")
/*    */ @XmlEnum
/*    */ public enum SplitterStatus
/*    */ {
/* 31 */   OK, 
/* 32 */   DOWN, 
/* 33 */   UNSUPPORTED_VERSION, 
/* 34 */   UNCONTROLLABLE, 
/* 35 */   WARNING, 
/* 36 */   UNKNOWN;
/*    */   
/*    */   private SplitterStatus() {}
/* 39 */   public String value() { return name(); }
/*    */   
/*    */   public static SplitterStatus fromValue(String v)
/*    */   {
/* 43 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SplitterStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */