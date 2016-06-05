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
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlType(name="arrayCapability")
/*    */ @XmlEnum
/*    */ public enum ArrayCapability
/*    */ {
/* 35 */   DISCOVERY, 
/* 36 */   DEVICE_MANAGEMENT, 
/* 37 */   INITIATOR_MANAGEMENT, 
/* 38 */   CONSISTENT_SNAPSHOT, 
/* 39 */   EXTENDED_DEVICE_MANAGEMENT, 
/* 40 */   FAKE_SIZE, 
/* 41 */   JOURNAL_VOLUME_PROVISIONING, 
/* 42 */   USER_VOLUME_PROVISIONING, 
/* 43 */   RESOURCE_POOL_REGISTRATION, 
/* 44 */   UNKNOWN;
/*    */   
/*    */   private ArrayCapability() {}
/* 47 */   public String value() { return name(); }
/*    */   
/*    */   public static ArrayCapability fromValue(String v)
/*    */   {
/* 51 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayCapability.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */