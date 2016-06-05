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
/*    */ @XmlType(name="vmProtectionStatus")
/*    */ @XmlEnum
/*    */ public enum VmProtectionStatus
/*    */ {
/* 30 */   NOT_PROTECTED, 
/* 31 */   PARTIALLY_PROTECTED, 
/* 32 */   FULLY_PROTECTED, 
/* 33 */   NO_LUNS, 
/* 34 */   UNKNOWN;
/*    */   
/*    */   private VmProtectionStatus() {}
/* 37 */   public String value() { return name(); }
/*    */   
/*    */   public static VmProtectionStatus fromValue(String v)
/*    */   {
/* 41 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VmProtectionStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */