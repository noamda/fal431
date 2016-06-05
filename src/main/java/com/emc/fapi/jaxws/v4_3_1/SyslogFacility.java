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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlType(name="syslogFacility")
/*    */ @XmlEnum
/*    */ public enum SyslogFacility
/*    */ {
/* 46 */   AUTH, 
/* 47 */   AUTHPRIV, 
/* 48 */   CRON, 
/* 49 */   DAEMON, 
/* 50 */   FTP, 
/* 51 */   KERN, 
/* 52 */   LOCAL0, 
/* 53 */   LOCAL1, 
/* 54 */   LOCAL2, 
/* 55 */   LOCAL3, 
/* 56 */   LOCAL4, 
/* 57 */   LOCAL5, 
/* 58 */   LOCAL6, 
/* 59 */   LOCAL7, 
/* 60 */   LPR, 
/* 61 */   MAIL, 
/* 62 */   NEWS, 
/* 63 */   SYSLOG, 
/* 64 */   USER, 
/* 65 */   UUCP, 
/* 66 */   UNKNOWN;
/*    */   
/*    */   private SyslogFacility() {}
/* 69 */   public String value() { return name(); }
/*    */   
/*    */   public static SyslogFacility fromValue(String v)
/*    */   {
/* 73 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SyslogFacility.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */