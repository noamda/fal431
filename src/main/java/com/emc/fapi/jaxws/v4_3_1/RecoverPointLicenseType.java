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
/*    */ @XmlType(name="recoverPointLicenseType")
/*    */ @XmlEnum
/*    */ public enum RecoverPointLicenseType
/*    */ {
/* 31 */   SE, 
/* 32 */   EX, 
/* 33 */   CL, 
/* 34 */   VE, 
/* 35 */   VC, 
/* 36 */   UNKNOWN;
/*    */   
/*    */   private RecoverPointLicenseType() {}
/* 39 */   public String value() { return name(); }
/*    */   
/*    */   public static RecoverPointLicenseType fromValue(String v)
/*    */   {
/* 43 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RecoverPointLicenseType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */