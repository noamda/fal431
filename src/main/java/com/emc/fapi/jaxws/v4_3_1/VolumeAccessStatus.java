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
/*    */ @XmlType(name="volumeAccessStatus")
/*    */ @XmlEnum
/*    */ public enum VolumeAccessStatus
/*    */ {
/* 32 */   OK, 
/* 33 */   ERROR, 
/* 34 */   RESERVED, 
/* 35 */   BAD_SECTOR, 
/* 36 */   READ_ONLY, 
/* 37 */   NA, 
/* 38 */   UNKNOWN;
/*    */   
/*    */   private VolumeAccessStatus() {}
/* 41 */   public String value() { return name(); }
/*    */   
/*    */   public static VolumeAccessStatus fromValue(String v)
/*    */   {
/* 45 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VolumeAccessStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */