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
/*    */ @XmlType(name="connectInMethod")
/*    */ @XmlEnum
/*    */ public enum ConnectInMethod
/*    */ {
/* 29 */   CONNECT_IN_ESRS, 
/* 30 */   CONNECT_IN_WEBEX, 
/* 31 */   CONNECT_IN_NOT_ALLOWED, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private ConnectInMethod() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static ConnectInMethod fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConnectInMethod.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */