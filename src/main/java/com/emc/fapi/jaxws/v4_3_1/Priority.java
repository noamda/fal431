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
/*    */ @XmlType(name="priority")
/*    */ @XmlEnum
/*    */ public enum Priority
/*    */ {
/* 31 */   IDLE, 
/* 32 */   LOW, 
/* 33 */   NORMAL, 
/* 34 */   HIGH, 
/* 35 */   CRITICAL, 
/* 36 */   UNKNOWN;
/*    */   
/*    */   private Priority() {}
/* 39 */   public String value() { return name(); }
/*    */   
/*    */   public static Priority fromValue(String v)
/*    */   {
/* 43 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\Priority.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */