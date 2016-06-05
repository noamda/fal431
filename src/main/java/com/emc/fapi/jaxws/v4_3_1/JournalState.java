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
/*    */ @XmlType(name="journalState")
/*    */ @XmlEnum
/*    */ public enum JournalState
/*    */ {
/* 37 */   DISTRIBUTING, 
/* 38 */   ENABLING_LOGGED_ACCESS, 
/* 39 */   ENABLING_VIRTUAL_ACCESS, 
/* 40 */   SNAPSHOT_ACCESS, 
/* 41 */   ERROR_ACCESSING_VIRTUAL_IMAGE, 
/* 42 */   ERROR_ACCESSING_PHYSICAL_IMAGE, 
/* 43 */   LOCKING, 
/* 44 */   LOCKED, 
/* 45 */   LONG_RESYNC, 
/* 46 */   RECOVERING, 
/* 47 */   INACCESSIBLE, 
/* 48 */   UNKNOWN;
/*    */   
/*    */   private JournalState() {}
/* 51 */   public String value() { return name(); }
/*    */   
/*    */   public static JournalState fromValue(String v)
/*    */   {
/* 55 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\JournalState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */