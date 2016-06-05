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
/*    */ @XmlType(name="snapshotConsolidationType")
/*    */ @XmlEnum
/*    */ public enum SnapshotConsolidationType
/*    */ {
/* 31 */   NO_CONSOLIDATION, 
/* 32 */   MANUAL, 
/* 33 */   DAILY, 
/* 34 */   WEEKLY, 
/* 35 */   MONTHLY, 
/* 36 */   UNKNOWN;
/*    */   
/*    */   private SnapshotConsolidationType() {}
/* 39 */   public String value() { return name(); }
/*    */   
/*    */   public static SnapshotConsolidationType fromValue(String v)
/*    */   {
/* 43 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SnapshotConsolidationType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */