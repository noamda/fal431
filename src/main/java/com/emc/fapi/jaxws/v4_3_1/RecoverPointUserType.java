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
/*    */ @XmlType(name="recoverPointUserType")
/*    */ @XmlEnum
/*    */ public enum RecoverPointUserType
/*    */ {
/* 29 */   LOCAL_USER, 
/* 30 */   LDAP_USER, 
/* 31 */   LDAP_GROUP, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private RecoverPointUserType() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static RecoverPointUserType fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RecoverPointUserType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */