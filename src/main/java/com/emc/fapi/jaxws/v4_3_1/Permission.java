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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlType(name="permission")
/*    */ @XmlEnum
/*    */ public enum Permission
/*    */ {
/* 39 */   ARRAY_MANAGEMENT, 
/* 40 */   BOX_MANAGEMENT, 
/* 41 */   FAILOVER, 
/* 42 */   GROUP, 
/* 43 */   TRANSFER, 
/* 44 */   TARGET_IMAGE, 
/* 45 */   SE, 
/* 46 */   SECURITY, 
/* 47 */   SPLITTER, 
/* 48 */   SYSTEM, 
/* 49 */   UPGRADE, 
/* 50 */   MONITOR, 
/* 51 */   WEB_DOWNLOAD, 
/* 52 */   UNKNOWN;
/*    */   
/*    */   private Permission() {}
/* 55 */   public String value() { return name(); }
/*    */   
/*    */   public static Permission fromValue(String v)
/*    */   {
/* 59 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\Permission.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */