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
/*    */ @XmlType(name="searchImageType")
/*    */ @XmlEnum
/*    */ public enum SearchImageType
/*    */ {
/* 30 */   ALL, 
/* 31 */   ALL_BOOKMARKS, 
/* 32 */   SYSTEM_BOOKMARKS, 
/* 33 */   USER_BOOKMARKS, 
/* 34 */   UNKNOWN;
/*    */   
/*    */   private SearchImageType() {}
/* 37 */   public String value() { return name(); }
/*    */   
/*    */   public static SearchImageType fromValue(String v)
/*    */   {
/* 41 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SearchImageType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */