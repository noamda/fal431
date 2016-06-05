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
/*    */ @XmlType(name="capability")
/*    */ @XmlEnum
/*    */ public enum Capability
/*    */ {
/* 34 */   SYNC_REPLICATION, 
/* 35 */   VOLUMES_GREATER_THAN_TWO_TERA_BYTES, 
/* 36 */   VIRTUAL_ACCESS, 
/* 37 */   VIRTUAL_ACCESS_WITH_ROLL, 
/* 38 */   READ_ONLY_ON_REPLICA, 
/* 39 */   FAKE_VOLUME_SIZE, 
/* 40 */   VOLUME_RESIZE, 
/* 41 */   UNMAP_VOLUME_COMMAND, 
/* 42 */   UNKNOWN;
/*    */   
/*    */   private Capability() {}
/* 45 */   public String value() { return name(); }
/*    */   
/*    */   public static Capability fromValue(String v)
/*    */   {
/* 49 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\Capability.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */