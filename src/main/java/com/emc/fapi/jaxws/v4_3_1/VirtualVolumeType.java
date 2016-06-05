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
/*    */ @XmlType(name="virtualVolumeType")
/*    */ @XmlEnum
/*    */ public enum VirtualVolumeType
/*    */ {
/* 29 */   VIRTUAL_DISK, 
/* 30 */   VIRTUAL_RDM, 
/* 31 */   PHYSICAL_RDM, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private VirtualVolumeType() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static VirtualVolumeType fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VirtualVolumeType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */