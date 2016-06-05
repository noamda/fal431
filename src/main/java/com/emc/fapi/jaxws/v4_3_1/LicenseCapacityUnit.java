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
/*    */ @XmlType(name="licenseCapacityUnit")
/*    */ @XmlEnum
/*    */ public enum LicenseCapacityUnit
/*    */ {
/* 30 */   TERA_BYTE, 
/* 31 */   BYTE, 
/* 32 */   BRICKS, 
/* 33 */   VM, 
/* 34 */   UNKNOWN;
/*    */   
/*    */   private LicenseCapacityUnit() {}
/* 37 */   public String value() { return name(); }
/*    */   
/*    */   public static LicenseCapacityUnit fromValue(String v)
/*    */   {
/* 41 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\LicenseCapacityUnit.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */