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
/*    */ @XmlType(name="connectionStatus")
/*    */ @XmlEnum
/*    */ public enum ConnectionStatus
/*    */ {
/* 30 */   SUCCESS, 
/* 31 */   PASSWORD_EXPIRED, 
/* 32 */   TOO_MANY_CONNECTIONS, 
/* 33 */   NO_PERMISSION, 
/* 34 */   ERROR;
/*    */   
/*    */   private ConnectionStatus() {}
/* 37 */   public String value() { return name(); }
/*    */   
/*    */   public static ConnectionStatus fromValue(String v)
/*    */   {
/* 41 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConnectionStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */