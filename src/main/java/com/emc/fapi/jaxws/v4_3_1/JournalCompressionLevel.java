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
/*    */ @XmlType(name="journalCompressionLevel")
/*    */ @XmlEnum
/*    */ public enum JournalCompressionLevel
/*    */ {
/* 29 */   NONE, 
/* 30 */   MEDIUM, 
/* 31 */   HIGH, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private JournalCompressionLevel() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static JournalCompressionLevel fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\JournalCompressionLevel.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */