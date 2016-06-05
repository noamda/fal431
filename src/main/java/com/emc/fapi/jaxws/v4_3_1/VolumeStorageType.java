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
/*    */ @XmlType(name="volumeStorageType")
/*    */ @XmlEnum
/*    */ public enum VolumeStorageType
/*    */ {
/* 32 */   VNX_OR_CLARIION, 
/* 33 */   SYMMETRIX, 
/* 34 */   VPLEX, 
/* 35 */   XTREME_IO, 
/* 36 */   OTHER, 
/* 37 */   VIRTUAL, 
/* 38 */   UNKNOWN;
/*    */   
/*    */   private VolumeStorageType() {}
/* 41 */   public String value() { return name(); }
/*    */   
/*    */   public static VolumeStorageType fromValue(String v)
/*    */   {
/* 45 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VolumeStorageType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */