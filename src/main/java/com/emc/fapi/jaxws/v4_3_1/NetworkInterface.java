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
/*    */ @XmlType(name="networkInterface")
/*    */ @XmlEnum
/*    */ public enum NetworkInterface
/*    */ {
/* 30 */   WAN, 
/* 31 */   LAN, 
/* 32 */   ISCSI1, 
/* 33 */   ISCSI2, 
/* 34 */   UNKNOWN;
/*    */   
/*    */   private NetworkInterface() {}
/* 37 */   public String value() { return name(); }
/*    */   
/*    */   public static NetworkInterface fromValue(String v)
/*    */   {
/* 41 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\NetworkInterface.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */