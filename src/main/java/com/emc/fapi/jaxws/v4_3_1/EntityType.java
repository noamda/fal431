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
/*    */ @XmlType(name="EntityType")
/*    */ @XmlEnum
/*    */ public enum EntityType
/*    */ {
/* 27 */   ESX, 
/* 28 */   ESX_CLUSTER;
/*    */   
/*    */   private EntityType() {}
/* 31 */   public String value() { return name(); }
/*    */   
/*    */   public static EntityType fromValue(String v)
/*    */   {
/* 35 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EntityType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */