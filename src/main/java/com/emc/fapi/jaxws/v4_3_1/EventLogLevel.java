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
/*    */ @XmlType(name="eventLogLevel")
/*    */ @XmlEnum
/*    */ public enum EventLogLevel
/*    */ {
/* 34 */   INFO, 
/* 35 */   WARNING, 
/* 36 */   TRANSIENT_WARNING, 
/* 37 */   CLEARED_WARNING, 
/* 38 */   ERROR, 
/* 39 */   TRANSIENT_ERROR, 
/* 40 */   CLEARED_ERROR, 
/* 41 */   CRITICAL, 
/* 42 */   UNKNOWN;
/*    */   
/*    */   private EventLogLevel() {}
/* 45 */   public String value() { return name(); }
/*    */   
/*    */   public static EventLogLevel fromValue(String v)
/*    */   {
/* 49 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EventLogLevel.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */