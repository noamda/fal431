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
/*    */ @XmlType(name="hostConnectivityStatus")
/*    */ @XmlEnum
/*    */ public enum HostConnectivityStatus
/*    */ {
/* 30 */   SUCCESS, 
/* 31 */   AUTHENTICATION_FAILED, 
/* 32 */   NO_CONNECTION, 
/* 33 */   COMMAND_TIMED_OUT, 
/* 34 */   UNKNOWN;
/*    */   
/*    */   private HostConnectivityStatus() {}
/* 37 */   public String value() { return name(); }
/*    */   
/*    */   public static HostConnectivityStatus fromValue(String v)
/*    */   {
/* 41 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\HostConnectivityStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */