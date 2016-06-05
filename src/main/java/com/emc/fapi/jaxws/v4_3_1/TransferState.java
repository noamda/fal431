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
/*    */ @XmlType(name="transferState")
/*    */ @XmlEnum
/*    */ public enum TransferState
/*    */ {
/* 31 */   ACTIVE, 
/* 32 */   ERROR, 
/* 33 */   INIT, 
/* 34 */   PAUSED, 
/* 35 */   DISABLED, 
/* 36 */   OTHER;
/*    */   
/*    */   private TransferState() {}
/* 39 */   public String value() { return name(); }
/*    */   
/*    */   public static TransferState fromValue(String v)
/*    */   {
/* 43 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\TransferState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */