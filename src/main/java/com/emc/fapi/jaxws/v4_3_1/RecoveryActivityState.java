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
/*    */ @XmlType(name="recoveryActivityState")
/*    */ @XmlEnum
/*    */ public enum RecoveryActivityState
/*    */ {
/* 38 */   RECOVER_PRODUCTION, 
/* 39 */   FAILOVER, 
/* 40 */   DIRECT_ACCESS, 
/* 41 */   LOGGED_ACCESS, 
/* 42 */   VIRTUAL_ACCESS, 
/* 43 */   ENABLING_LOGGED_ACCESS, 
/* 44 */   ENABLING_VIRTUAL_ACCESS, 
/* 45 */   VIRTUAL_ACCESS_ROLLING_IMAGE, 
/* 46 */   LOGGED_ACCESS_ROLL_COMPLETE, 
/* 47 */   VIRTUAL_ACCESS_CANNOT_ROLL_IMAGE, 
/* 48 */   NO_ACCESS_SPACE_FULL, 
/* 49 */   NO_ACCESS_UNDOING_WRITES, 
/* 50 */   UNKNOWN;
/*    */   
/*    */   private RecoveryActivityState() {}
/* 53 */   public String value() { return name(); }
/*    */   
/*    */   public static RecoveryActivityState fromValue(String v)
/*    */   {
/* 57 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RecoveryActivityState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */