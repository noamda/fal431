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
/*    */ @XmlType(name="shareType")
/*    */ @XmlEnum
/*    */ public enum ShareType
/*    */ {
/* 29 */   NFS23, 
/* 30 */   NFS4, 
/* 31 */   CIFS, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private ShareType() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static ShareType fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ShareType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */