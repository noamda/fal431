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
/*    */ @XmlType(name="imageAccessScenario")
/*    */ @XmlEnum
/*    */ public enum ImageAccessScenario
/*    */ {
/* 32 */   NONE, 
/* 33 */   FAILOVER, 
/* 34 */   TEMPORARY_FAILOVER, 
/* 35 */   RECOVER_PRODUCTION, 
/* 36 */   TEST_REPLICA, 
/* 37 */   RESUME_PRODUCTION, 
/* 38 */   UNKNOWN;
/*    */   
/*    */   private ImageAccessScenario() {}
/* 41 */   public String value() { return name(); }
/*    */   
/*    */   public static ImageAccessScenario fromValue(String v)
/*    */   {
/* 45 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ImageAccessScenario.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */