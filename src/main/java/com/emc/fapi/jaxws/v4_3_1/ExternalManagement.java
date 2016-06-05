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
/*    */ @XmlType(name="externalManagement")
/*    */ @XmlEnum
/*    */ public enum ExternalManagement
/*    */ {
/* 30 */   NONE, 
/* 31 */   RPCE, 
/* 32 */   SRM, 
/* 33 */   REE, 
/* 34 */   UNKNOWN;
/*    */   
/*    */   private ExternalManagement() {}
/* 37 */   public String value() { return name(); }
/*    */   
/*    */   public static ExternalManagement fromValue(String v)
/*    */   {
/* 41 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ExternalManagement.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */