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
/*    */ @XmlType(name="installationActivityType")
/*    */ @XmlEnum
/*    */ public enum InstallationActivityType
/*    */ {
/* 31 */   NEW_INSTALL, 
/* 32 */   SOFTWARE_UPGRADE, 
/* 33 */   HARDWARE_UPGRADE, 
/* 34 */   RE_INSTALL, 
/* 35 */   GENERAL_UPDATE, 
/* 36 */   UNKNOWN;
/*    */   
/*    */   private InstallationActivityType() {}
/* 39 */   public String value() { return name(); }
/*    */   
/*    */   public static InstallationActivityType fromValue(String v)
/*    */   {
/* 43 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\InstallationActivityType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */