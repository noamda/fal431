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
/*    */ @XmlType(name="connectHomeMethod")
/*    */ @XmlEnum
/*    */ public enum ConnectHomeMethod
/*    */ {
/* 30 */   CONNECT_HOME_ESRS, 
/* 31 */   CONNECT_HOME_EMAIL, 
/* 32 */   CONNECT_HOME_NOT_ALLOWED, 
/* 33 */   CONNECT_HOME_FTPS, 
/* 34 */   UNKNOWN;
/*    */   
/*    */   private ConnectHomeMethod() {}
/* 37 */   public String value() { return name(); }
/*    */   
/*    */   public static ConnectHomeMethod fromValue(String v)
/*    */   {
/* 41 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConnectHomeMethod.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */