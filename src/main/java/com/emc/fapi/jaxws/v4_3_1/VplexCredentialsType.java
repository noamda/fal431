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
/*    */ @XmlType(name="vplexCredentialsType")
/*    */ @XmlEnum
/*    */ public enum VplexCredentialsType
/*    */ {
/* 28 */   VPLEX, 
/* 29 */   VPLEX_IC, 
/* 30 */   UNKNOWN;
/*    */   
/*    */   private VplexCredentialsType() {}
/* 33 */   public String value() { return name(); }
/*    */   
/*    */   public static VplexCredentialsType fromValue(String v)
/*    */   {
/* 37 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VplexCredentialsType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */