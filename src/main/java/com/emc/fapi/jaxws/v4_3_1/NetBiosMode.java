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
/*    */ @XmlType(name="netBiosMode")
/*    */ @XmlEnum
/*    */ public enum NetBiosMode
/*    */ {
/* 29 */   DISABLED, 
/* 30 */   ENABLED, 
/* 31 */   ENABLED_VIA_DHCP, 
/* 32 */   UNKNOWN;
/*    */   
/*    */   private NetBiosMode() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static NetBiosMode fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\NetBiosMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */