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
/*    */ @XmlType(name="rpSupportedArrayCapability")
/*    */ @XmlEnum
/*    */ public enum RpSupportedArrayCapability
/*    */ {
/* 29 */   JVOL_AUTO_PROVISIONING, 
/* 30 */   UVOL_AUTO_PROVISIONING, 
/* 31 */   SNAPSHOT_SHIPPING, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private RpSupportedArrayCapability() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static RpSupportedArrayCapability fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RpSupportedArrayCapability.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */