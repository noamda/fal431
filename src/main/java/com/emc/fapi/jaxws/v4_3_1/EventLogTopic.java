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
/*    */ @XmlType(name="eventLogTopic")
/*    */ @XmlEnum
/*    */ public enum EventLogTopic
/*    */ {
/* 32 */   ALL, 
/* 33 */   MANAGEMENT, 
/* 34 */   CLUSTER, 
/* 35 */   RPA, 
/* 36 */   CONSISTENCY_GROUP, 
/* 37 */   SPLITTER, 
/* 38 */   UNKNOWN;
/*    */   
/*    */   private EventLogTopic() {}
/* 41 */   public String value() { return name(); }
/*    */   
/*    */   public static EventLogTopic fromValue(String v)
/*    */   {
/* 45 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EventLogTopic.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */