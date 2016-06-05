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
/*    */ @XmlType(name="generalStatus")
/*    */ @XmlEnum
/*    */ public enum GeneralStatus
/*    */ {
/* 29 */   OK, 
/* 30 */   ERROR, 
/* 31 */   UNKNOWN, 
/* 32 */   WARNING;
/*    */   
/*    */   private GeneralStatus() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static GeneralStatus fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GeneralStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */