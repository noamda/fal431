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
/*    */ @XmlType(name="diskProvisionPolicy")
/*    */ @XmlEnum
/*    */ public enum DiskProvisionPolicy
/*    */ {
/* 28 */   SAME_AS_SOURCE, 
/* 29 */   AS_THICK, 
/* 30 */   AS_THIN;
/*    */   
/*    */   private DiskProvisionPolicy() {}
/* 33 */   public String value() { return name(); }
/*    */   
/*    */   public static DiskProvisionPolicy fromValue(String v)
/*    */   {
/* 37 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\DiskProvisionPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */