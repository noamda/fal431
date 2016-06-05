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
/*    */ @XmlType(name="snapshotConsistencyType")
/*    */ @XmlEnum
/*    */ public enum SnapshotConsistencyType
/*    */ {
/* 28 */   CONSISTENCY_UNKNOWN, 
/* 29 */   APPLICATION_CONSISTENT, 
/* 30 */   UNKNOWN;
/*    */   
/*    */   private SnapshotConsistencyType() {}
/* 33 */   public String value() { return name(); }
/*    */   
/*    */   public static SnapshotConsistencyType fromValue(String v)
/*    */   {
/* 37 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SnapshotConsistencyType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */