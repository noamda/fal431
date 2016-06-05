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
/*    */ @XmlType(name="problemCategory")
/*    */ @XmlEnum
/*    */ public enum ProblemCategory
/*    */ {
/* 32 */   SPLITTER, 
/* 33 */   DEVICE, 
/* 34 */   RPA, 
/* 35 */   LINK, 
/* 36 */   SYSTEM, 
/* 37 */   CONSISTENCY_GROUP, 
/* 38 */   UNKNOWN;
/*    */   
/*    */   private ProblemCategory() {}
/* 41 */   public String value() { return name(); }
/*    */   
/*    */   public static ProblemCategory fromValue(String v)
/*    */   {
/* 45 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ProblemCategory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */