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
/*    */ @XmlType(name="clariionCredentialsType")
/*    */ @XmlEnum
/*    */ public enum ClariionCredentialsType
/*    */ {
/* 29 */   PASSWORD, 
/* 30 */   SECURE_FILES, 
/* 31 */   VNX2E, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private ClariionCredentialsType() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static ClariionCredentialsType fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClariionCredentialsType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */