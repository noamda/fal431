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
/*    */ @XmlType(name="clusterMaintenanceMode")
/*    */ @XmlEnum
/*    */ public enum ClusterMaintenanceMode
/*    */ {
/* 36 */   NONE, 
/* 37 */   MINOR_UPGRADE, 
/* 38 */   MAJOR_UPGRADE, 
/* 39 */   HW_REPLACEMENT, 
/* 40 */   CLUSTER_UPGRADE, 
/* 41 */   REPOSITORY_CHANGE, 
/* 42 */   RPSE_CONVERSION, 
/* 43 */   SYSTEM_MODIFICATION, 
/* 44 */   USER_INITIATED_MAINTENANCE_MODE, 
/* 45 */   CLUSTER_CONNECTION, 
/* 46 */   UNKNOWN;
/*    */   
/*    */   private ClusterMaintenanceMode() {}
/* 49 */   public String value() { return name(); }
/*    */   
/*    */   public static ClusterMaintenanceMode fromValue(String v)
/*    */   {
/* 53 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClusterMaintenanceMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */