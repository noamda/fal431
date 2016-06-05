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
/*    */ @XmlType(name="hardwareChangesPolicy")
/*    */ @XmlEnum
/*    */ public enum HardwareChangesPolicy
/*    */ {
/* 28 */   DONT_REPLICATE_HW_CHANGES, 
/* 29 */   REPLICATE_HW_CHANGES, 
/* 30 */   UNKNOWN;
/*    */   
/*    */   private HardwareChangesPolicy() {}
/* 33 */   public String value() { return name(); }
/*    */   
/*    */   public static HardwareChangesPolicy fromValue(String v)
/*    */   {
/* 37 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\HardwareChangesPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */