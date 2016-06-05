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
/*    */ @XmlType(name="reportStepType")
/*    */ @XmlEnum
/*    */ public enum ReportStepType
/*    */ {
/* 38 */   VM_POWER_ON, 
/* 39 */   VM_POWER_OFF, 
/* 40 */   PREPARE_STORAGE, 
/* 41 */   PREPARE_REPLICA, 
/* 42 */   PREPARE_SOURCE, 
/* 43 */   PREPARE_REPLICATION, 
/* 44 */   PAUSE_TRANSFER, 
/* 45 */   VM_STARTUP_SEQUENCE, 
/* 46 */   VM_STARTUP_SCRIPT, 
/* 47 */   VM_STARTUP_PROMPT, 
/* 48 */   POWER_ON_VMS, 
/* 49 */   POWER_OFF_VMS, 
/* 50 */   UNKNOWN;
/*    */   
/*    */   private ReportStepType() {}
/* 53 */   public String value() { return name(); }
/*    */   
/*    */   public static ReportStepType fromValue(String v)
/*    */   {
/* 57 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ReportStepType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */