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
/*    */ @XmlType(name="arrayConnectivityStatus")
/*    */ @XmlEnum
/*    */ public enum ArrayConnectivityStatus
/*    */ {
/* 31 */   OK, 
/* 32 */   DEGRADED, 
/* 33 */   BAD_CREDENTIALS, 
/* 34 */   BAD_CONNECTION_PARAMETERS, 
/* 35 */   FAILURE, 
/* 36 */   UNKNOWN;
/*    */   
/*    */   private ArrayConnectivityStatus() {}
/* 39 */   public String value() { return name(); }
/*    */   
/*    */   public static ArrayConnectivityStatus fromValue(String v)
/*    */   {
/* 43 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayConnectivityStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */