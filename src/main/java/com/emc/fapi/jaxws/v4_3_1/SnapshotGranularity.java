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
/*    */ @XmlType(name="snapshotGranularity")
/*    */ @XmlEnum
/*    */ public enum SnapshotGranularity
/*    */ {
/* 29 */   DYNAMIC, 
/* 30 */   FIXED_PER_SECOND, 
/* 31 */   FIXED_PER_WRITE, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private SnapshotGranularity() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static SnapshotGranularity fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SnapshotGranularity.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */