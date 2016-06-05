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
/*    */ @XmlType(name="vCenterServerFilterType")
/*    */ @XmlEnum
/*    */ public enum VCenterServerFilterType
/*    */ {
/* 29 */   ESX, 
/* 30 */   VM, 
/* 31 */   LUN, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private VCenterServerFilterType() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static VCenterServerFilterType fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VCenterServerFilterType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */