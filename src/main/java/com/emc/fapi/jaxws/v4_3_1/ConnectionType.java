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
/*    */ @XmlType(name="connectionType")
/*    */ @XmlEnum
/*    */ public enum ConnectionType
/*    */ {
/* 29 */   FIBER_CHANNEL, 
/* 30 */   IP, 
/* 31 */   NO_CONNECTION, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private ConnectionType() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static ConnectionType fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConnectionType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */