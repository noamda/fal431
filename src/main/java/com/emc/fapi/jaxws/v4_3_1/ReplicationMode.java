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
/*    */ @XmlType(name="replicationMode")
/*    */ @XmlEnum
/*    */ public enum ReplicationMode
/*    */ {
/* 30 */   UNKNOWN, 
/* 31 */   NA, 
/* 32 */   SNAPSHOT, 
/* 33 */   ASYNCHRONOUS, 
/* 34 */   PING_PONG;
/*    */   
/*    */   private ReplicationMode() {}
/* 37 */   public String value() { return name(); }
/*    */   
/*    */   public static ReplicationMode fromValue(String v)
/*    */   {
/* 41 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ReplicationMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */