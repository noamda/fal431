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
/*    */ @XmlType(name="storageAccessState")
/*    */ @XmlEnum
/*    */ public enum StorageAccessState
/*    */ {
/* 39 */   DIRECT_ACCESS, 
/* 40 */   LOGGED_ACCESS, 
/* 41 */   VIRTUAL_ACCESS, 
/* 42 */   ENABLING_LOGGED_ACCESS, 
/* 43 */   ENABLING_VIRTUAL_ACCESS, 
/* 44 */   VIRTUAL_ACCESS_ROLLING_IMAGE, 
/* 45 */   LOGGED_ACCESS_ROLL_COMPLETE, 
/* 46 */   NO_ACCESS, 
/* 47 */   NO_ACCESS_UNDOING_WRITES, 
/* 48 */   NO_ACCESS_SPACE_FULL, 
/* 49 */   NO_ACCESS_JOURNAL_PRESERVED, 
/* 50 */   NO_ACCESS_BFS_GROUP, 
/* 51 */   VIRTUAL_ACCESS_CANNOT_ROLL_IMAGE, 
/* 52 */   UNKNOWN;
/*    */   
/*    */   private StorageAccessState() {}
/* 55 */   public String value() { return name(); }
/*    */   
/*    */   public static StorageAccessState fromValue(String v)
/*    */   {
/* 59 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\StorageAccessState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */