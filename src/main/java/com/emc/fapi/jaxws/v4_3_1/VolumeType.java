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
/*    */ @XmlType(name="volumeType")
/*    */ @XmlEnum
/*    */ public enum VolumeType
/*    */ {
/* 29 */   USER, 
/* 30 */   JOURNAL, 
/* 31 */   REPOSITORY, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private VolumeType() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static VolumeType fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VolumeType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */