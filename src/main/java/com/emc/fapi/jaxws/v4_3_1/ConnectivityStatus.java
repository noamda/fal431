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
/*    */ @XmlType(name="connectivityStatus")
/*    */ @XmlEnum
/*    */ public enum ConnectivityStatus
/*    */ {
/* 31 */   STATUS_OK, 
/* 32 */   AUTHENTICATION_FAILURE, 
/* 33 */   IP_NOT_REACHABLE, 
/* 34 */   INVALID_PORT, 
/* 35 */   UNKNOWN_ERROR, 
/* 36 */   UNKNOWN;
/*    */   
/*    */   private ConnectivityStatus() {}
/* 39 */   public String value() { return name(); }
/*    */   
/*    */   public static ConnectivityStatus fromValue(String v)
/*    */   {
/* 43 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConnectivityStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */