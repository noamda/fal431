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
/*    */ @XmlType(name="systemSecurityLevel")
/*    */ @XmlEnum
/*    */ public enum SystemSecurityLevel
/*    */ {
/* 28 */   LOW, 
/* 29 */   HIGH, 
/* 30 */   UNKNOWN;
/*    */   
/*    */   private SystemSecurityLevel() {}
/* 33 */   public String value() { return name(); }
/*    */   
/*    */   public static SystemSecurityLevel fromValue(String v)
/*    */   {
/* 37 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SystemSecurityLevel.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */