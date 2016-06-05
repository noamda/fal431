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
/*    */ @XmlType(name="authenticationType")
/*    */ @XmlEnum
/*    */ public enum AuthenticationType
/*    */ {
/* 29 */   GLOBAL, 
/* 30 */   LOCAL, 
/* 31 */   LDAP, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private AuthenticationType() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static AuthenticationType fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AuthenticationType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */