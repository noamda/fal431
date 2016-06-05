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
/*    */ @XmlType(name="vCenterServerConnectionStatus")
/*    */ @XmlEnum
/*    */ public enum VCenterServerConnectionStatus
/*    */ {
/* 33 */   CONNECTED, 
/* 34 */   AUTHENTICATION_FAILURE, 
/* 35 */   IP_UNREACHABLE, 
/* 36 */   UNSUPPORTED_VERSION, 
/* 37 */   INVALID_PORT, 
/* 38 */   INVALID_PORT_OR_CERTIFICATE, 
/* 39 */   UNKNOWN_ERROR, 
/* 40 */   UNKNOWN;
/*    */   
/*    */   private VCenterServerConnectionStatus() {}
/* 43 */   public String value() { return name(); }
/*    */   
/*    */   public static VCenterServerConnectionStatus fromValue(String v)
/*    */   {
/* 47 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VCenterServerConnectionStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */