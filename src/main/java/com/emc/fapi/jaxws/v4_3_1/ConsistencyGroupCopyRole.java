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
/*    */ @XmlType(name="consistencyGroupCopyRole")
/*    */ @XmlEnum
/*    */ public enum ConsistencyGroupCopyRole
/*    */ {
/* 29 */   ACTIVE, 
/* 30 */   TEMPORARY_ACTIVE, 
/* 31 */   REPLICA, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private ConsistencyGroupCopyRole() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static ConsistencyGroupCopyRole fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupCopyRole.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */