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
/*    */ @XmlType(name="configParamType")
/*    */ @XmlEnum
/*    */ public enum ConfigParamType
/*    */ {
/* 30 */   IP, 
/* 31 */   STRING, 
/* 32 */   PASSWORD, 
/* 33 */   INTEGER, 
/* 34 */   UNKNOWN;
/*    */   
/*    */   private ConfigParamType() {}
/* 37 */   public String value() { return name(); }
/*    */   
/*    */   public static ConfigParamType fromValue(String v)
/*    */   {
/* 41 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConfigParamType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */