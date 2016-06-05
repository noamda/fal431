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
/*    */ @XmlType(name="arrayResourcePoolType")
/*    */ @XmlEnum
/*    */ public enum ArrayResourcePoolType
/*    */ {
/* 29 */   STORAGE_POOL, 
/* 30 */   RAID_GROUP, 
/* 31 */   VC_DATASTORE, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private ArrayResourcePoolType() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static ArrayResourcePoolType fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayResourcePoolType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */