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
/*    */ @XmlType(name="pipeState")
/*    */ @XmlEnum
/*    */ public enum PipeState
/*    */ {
/* 39 */   INITIALIZING, 
/* 40 */   ACTIVE, 
/* 41 */   STAND_BY, 
/* 42 */   FLUSHING_BUFFER, 
/* 43 */   FLUSHING_REMOTE_BUFFER_TO_JOURNAL, 
/* 44 */   READY_TO_REPLICATE, 
/* 45 */   FLUSHED, 
/* 46 */   PAUSED, 
/* 47 */   PAUSED_BY_SYSTEM, 
/* 48 */   ERROR, 
/* 49 */   IN_HIGH_LOAD, 
/* 50 */   SNAP_SHIPPING, 
/* 51 */   SNAP_IDLE, 
/* 52 */   UNKNOWN;
/*    */   
/*    */   private PipeState() {}
/* 55 */   public String value() { return name(); }
/*    */   
/*    */   public static PipeState fromValue(String v)
/*    */   {
/* 59 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\PipeState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */