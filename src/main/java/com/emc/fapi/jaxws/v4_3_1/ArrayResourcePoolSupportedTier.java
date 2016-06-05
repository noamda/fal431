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
/*    */ @XmlType(name="arrayResourcePoolSupportedTier")
/*    */ @XmlEnum
/*    */ public enum ArrayResourcePoolSupportedTier
/*    */ {
/* 30 */   FC, 
/* 31 */   SSD, 
/* 32 */   SATA, 
/* 33 */   FAST, 
/* 34 */   UNKNOWN;
/*    */   
/*    */   private ArrayResourcePoolSupportedTier() {}
/* 37 */   public String value() { return name(); }
/*    */   
/*    */   public static ArrayResourcePoolSupportedTier fromValue(String v)
/*    */   {
/* 41 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayResourcePoolSupportedTier.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */