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
/*    */ @XmlType(name="bookmarkConsolidationPolicy")
/*    */ @XmlEnum
/*    */ public enum BookmarkConsolidationPolicy
/*    */ {
/* 31 */   ALWAYS_CONSOLIDATE, 
/* 32 */   SURVIVE_DAILY, 
/* 33 */   SURVIVE_WEEKLY, 
/* 34 */   SURVIVE_MONTHLY, 
/* 35 */   NEVER_CONSOLIDATE, 
/* 36 */   UNKNOWN;
/*    */   
/*    */   private BookmarkConsolidationPolicy() {}
/* 39 */   public String value() { return name(); }
/*    */   
/*    */   public static BookmarkConsolidationPolicy fromValue(String v)
/*    */   {
/* 43 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\BookmarkConsolidationPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */