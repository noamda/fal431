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
/*    */ @XmlType(name="hostOS")
/*    */ @XmlEnum
/*    */ public enum HostOS
/*    */ {
/* 35 */   AIX, 
/* 36 */   HPUX, 
/* 37 */   LINUX_2_4, 
/* 38 */   LINUX_2_6, 
/* 39 */   SOLARIS, 
/* 40 */   VMWARE_ESX, 
/* 41 */   VMWARE_ESX_WINDOWS, 
/* 42 */   WINDOWS, 
/* 43 */   OTHER_MIXED, 
/* 44 */   UNKNOWN;
/*    */   
/*    */   private HostOS() {}
/* 47 */   public String value() { return name(); }
/*    */   
/*    */   public static HostOS fromValue(String v)
/*    */   {
/* 51 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\HostOS.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */