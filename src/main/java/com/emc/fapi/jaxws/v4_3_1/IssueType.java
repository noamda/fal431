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
/*    */ @XmlType(name="issueType")
/*    */ @XmlEnum
/*    */ public enum IssueType
/*    */ {
/* 32 */   ISCSI_SOFTWARE_ADAPTER, 
/* 33 */   SPLITTER_CONNECTIVITY, 
/* 34 */   PING_SPLITTER, 
/* 35 */   VRPA_VNICS_CONFIGURATION, 
/* 36 */   MULTI_BROADCAST_DOMAINS, 
/* 37 */   RPA_ISCSI_IPS, 
/* 38 */   UNKNOWN;
/*    */   
/*    */   private IssueType() {}
/* 41 */   public String value() { return name(); }
/*    */   
/*    */   public static IssueType fromValue(String v)
/*    */   {
/* 45 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\IssueType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */