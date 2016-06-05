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
/*    */ @XmlType(name="imageAccessMode")
/*    */ @XmlEnum
/*    */ public enum ImageAccessMode
/*    */ {
/* 29 */   LOGGED_ACCESS, 
/* 30 */   VIRTUAL_ACCESS, 
/* 31 */   VIRTUAL_ACCESS_WITH_ROLL, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private ImageAccessMode() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static ImageAccessMode fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ImageAccessMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */