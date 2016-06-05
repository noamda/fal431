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
/*    */ 
/*    */ @XmlType(name="arrayManagementProviderType")
/*    */ @XmlEnum
/*    */ public enum ArrayManagementProviderType
/*    */ {
/* 32 */   NAVISECCLI, 
/* 33 */   XTREMIO, 
/* 34 */   VC, 
/* 35 */   VPLEX, 
/* 36 */   SMIS, 
/* 37 */   SCALEIO, 
/* 38 */   UNKNOWN;
/*    */   
/*    */   private ArrayManagementProviderType() {}
/* 41 */   public String value() { return name(); }
/*    */   
/*    */   public static ArrayManagementProviderType fromValue(String v)
/*    */   {
/* 45 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayManagementProviderType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */