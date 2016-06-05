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
/*    */ 
/*    */ @XmlType(name="groupSetTransferState")
/*    */ @XmlEnum
/*    */ public enum GroupSetTransferState
/*    */ {
/* 40 */   MIXED, 
/* 41 */   INITIALIZING, 
/* 42 */   ACTIVE, 
/* 43 */   STAND_BY, 
/* 44 */   FLUSHING_BUFFER, 
/* 45 */   FLUSHING_REMOTE_BUFFER_TO_JOURNAL, 
/* 46 */   READY_TO_REPLICATE, 
/* 47 */   FLUSHED, 
/* 48 */   PAUSED, 
/* 49 */   PAUSED_BY_SYSTEM, 
/* 50 */   ERROR, 
/* 51 */   IN_HIGH_LOAD, 
/* 52 */   SNAP_SHIPPING, 
/* 53 */   SNAP_IDLE, 
/* 54 */   UNKNOWN;
/*    */   
/*    */   private GroupSetTransferState() {}
/* 57 */   public String value() { return name(); }
/*    */   
/*    */   public static GroupSetTransferState fromValue(String v)
/*    */   {
/* 61 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GroupSetTransferState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */