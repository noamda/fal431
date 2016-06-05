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
/*    */ @XmlType(name="installationPerformingResource")
/*    */ @XmlEnum
/*    */ public enum InstallationPerformingResource
/*    */ {
/* 29 */   CUSTOMER, 
/* 30 */   EMC_EMPLOYEE, 
/* 31 */   EMC_PARTNER, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private InstallationPerformingResource() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static InstallationPerformingResource fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\InstallationPerformingResource.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */