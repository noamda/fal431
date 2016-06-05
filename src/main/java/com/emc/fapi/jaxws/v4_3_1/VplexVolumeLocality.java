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
/*    */ @XmlType(name="vplexVolumeLocality")
/*    */ @XmlEnum
/*    */ public enum VplexVolumeLocality
/*    */ {
/* 30 */   LOCAL, 
/* 31 */   METRO_DR1, 
/* 32 */   GEO, 
/* 33 */   REMOTE_EXPORTED, 
/* 34 */   UNKNOWN;
/*    */   
/*    */   private VplexVolumeLocality() {}
/* 37 */   public String value() { return name(); }
/*    */   
/*    */   public static VplexVolumeLocality fromValue(String v)
/*    */   {
/* 41 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VplexVolumeLocality.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */