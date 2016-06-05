/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlEnum;
/*     */ import javax.xml.bind.annotation.XmlEnumValue;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlType(name="monitoredParameterType")
/*     */ @XmlEnum
/*     */ public enum MonitoredParameterType
/*     */ {
/*  80 */   NUMBER_OF_GROUPS("NUMBER_OF_GROUPS"), 
/*  81 */   NUMBER_OF_TRANSFERRING_GROUPS("NUMBER_OF_TRANSFERRING_GROUPS"), 
/*  82 */   NUMBER_OF_REPLICATING_SETS("NUMBER_OF_REPLICATING_SETS"), 
/*  83 */   NUMBER_OF_SPLITTING_HOSTS("NUMBER_OF_SPLITTING_HOSTS"), 
/*  84 */   NUMBER_OF_CLARIION_HOSTS("NUMBER_OF_CLARIION_HOSTS"), 
/*  85 */   DAYS_LICENSE_LEFT("DAYS_LICENSE_LEFT"), 
/*  86 */   LOCAL_REPLICATED_ARRAY("LOCAL_REPLICATED_ARRAY"), 
/*  87 */   REMOTE_REPLICATED_ARRAY("REMOTE_REPLICATED_ARRAY"), 
/*  88 */   LOCAL_REPLICATED_CLUSTER("LOCAL_REPLICATED_CLUSTER"), 
/*  89 */   REMOTE_REPLICATED_CLUSTER("REMOTE_REPLICATED_CLUSTER"), 
/*  90 */   NUMBER_OF_GRID_GROUPS("NUMBER_OF_GRID_GROUPS"), 
/*  91 */   LAG_TRANSACTION("LAG_TRANSACTION"), 
/*  92 */   LAG_TIME("LAG_TIME"), 
/*  93 */   LAG_DATA("LAG_DATA"), 
/*  94 */   PAUSE_JOURNAL_TSP_USAGE("PAUSE_JOURNAL_TSP_USAGE"), 
/*  95 */   PAUSE_VIRTUAL_MEMORY_USAGE("PAUSE_VIRTUAL_MEMORY_USAGE"), 
/*  96 */   NUMBER_OF_SPLITTER_CLUSTERS("NUMBER_OF_SPLITTER_CLUSTERS"), 
/*  97 */   TOTAL_NUMBER_OF_SPLITTER_LUNS("TOTAL_NUMBER_OF_SPLITTER_LUNS"), 
/*  98 */   SYMMETRIX_PROTECTED_VOLUMES("SYMMETRIX_PROTECTED_VOLUMES"), 
/*  99 */   NUMBER_OF_VPLEX_HOSTS("NUMBER_OF_VPLEX_HOSTS"), 
/* 100 */   NUMBER_OF_VPLEX_DIRECTORS("NUMBER_OF_VPLEX_DIRECTORS"), 
/* 101 */   NUMBER_OF_SYMMETRIX_HOSTS("NUMBER_OF_SYMMETRIX_HOSTS"), 
/* 102 */   SYMMETRIX_SESSIONS("SYMMETRIX_SESSIONS"), 
/* 103 */   NUMBER_OF_WLPS("NUMBER_OF_WLPS"), 
/* 104 */   NUMBER_OF_GUIDS("NUMBER_OF_GUIDS"), 
/* 105 */   NUMBER_OF_ESX_CLUSTERS("NUMBER_OF_ESX_CLUSTERS"), 
/* 106 */   MAX_NUMBER_OF_CX_ARRAYS("MAX_NUMBER_OF_CX_ARRAYS"), 
/* 107 */   MAX_NUMBER_OF_VNX_ARRAYS("MAX_NUMBER_OF_VNX_ARRAYS"), 
/* 108 */   MAX_NUMBER_OF_VC_ARRAYS("MAX_NUMBER_OF_VC_ARRAYS"), 
/* 109 */   MAX_NUMBER_OF_VPLEX_ARRAYS("MAX_NUMBER_OF_VPLEX_ARRAYS"), 
/* 110 */   MAX_NUMBER_OF_XTREME_ARRAYS("MAX_NUMBER_OF_XTREME_ARRAYS"), 
/* 111 */   MAX_NUMBER_OF_SCALE_IO_ARRAYS("MAX_NUMBER_OF_SCALE_IO_ARRAYS"), 
/* 112 */   MAX_NUMBER_OF_SNAPSHOTS("MAX_NUMBER_OF_SNAPSHOTS"), 
/* 113 */   MAX_NUMBER_OF_SNAPSHOT_MOUNT_POINTS("MAX_NUMBER_OF_SNAPSHOT_MOUNT_POINTS"), 
/* 114 */   MAX_NUMBER_OF_SNAPSHOTS_PER_DEVICE("MAX_NUMBER_OF_SNAPSHOTS_PER_DEVICE"), 
/* 115 */   MAX_NUMBER_OF_DEVICES("MAX_NUMBER_OF_DEVICES"), 
/* 116 */   MAX_NUMBER_OF_DEVICES_PER_RESOURCE_POOL("MAX_NUMBER_OF_DEVICES_PER_RESOURCE_POOL"), 
/* 117 */   MAX_NUMBER_OF_DEVICES_PER_MASKING_GROUP("MAX_NUMBER_OF_DEVICES_PER_MASKING_GROUP"), 
/* 118 */   MAX_NUMBER_OF_MEMBERS_PER_ARRAY_CGS("MAX_NUMBER_OF_MEMBERS_PER_ARRAY_CGS"), 
/* 119 */   MAX_NUMBER_OF_ARRAY_CGS("MAX_NUMBER_OF_ARRAY_CGS"), 
/* 120 */   MAX_NUMBER_OF_BRICKS("MAX_NUMBER_OF_BRICKS"), 
/* 121 */   MAX_DEVICE_SIZE_GB("MAX_DEVICE_SIZE_GB"), 
/* 122 */   NUMBER_OF_EXTERNAL_AMPS_PER_CLUSER("NUMBER_OF_EXTERNAL_AMPS_PER_CLUSER"), 
/* 123 */   NUMBER_OF_SYMM_V_3_HOSTS("NUMBER_OF_SYMM_V3_HOSTS"), 
/*     */   
/* 125 */   NUMBER_OF_VIRTUAL_JOURNALS("NUMBER_OF_VIRTUAL_JOURNALS"), 
/* 126 */   NUMBER_OF_ESX_HOSTS_WITH_SPLITTER("NUMBER_OF_ESX_HOSTS_WITH_SPLITTER"), 
/* 127 */   NUMBER_OF_PROTECTED_VMS("NUMBER_OF_PROTECTED_VMS"), 
/* 128 */   NUMBER_OF_PROTECTED_VMDKS("NUMBER_OF_PROTECTED_VMDKS"), 
/* 129 */   NUMBER_OF_SITES("NUMBER_OF_SITES"), 
/* 130 */   NUMBER_OF_VMS_PER_GROUP("NUMBER_OF_VMS_PER_GROUP"), 
/* 131 */   NUMBER_OF_REPLICA_COPIES_PER_GROUP("NUMBER_OF_REPLICA_COPIES_PER_GROUP"), 
/* 132 */   NUMBER_OF_SITES_CONNECTED_TO_VC("NUMBER_OF_SITES_CONNECTED_TO_VC"), 
/* 133 */   NUMBER_OF_VMS_PROTECTED_PER_VC("NUMBER_OF_VMS_PROTECTED_PER_VC"), 
/* 134 */   UNKNOWN("UNKNOWN");
/*     */   
/*     */   private final String value;
/*     */   
/* 138 */   private MonitoredParameterType(String v) { this.value = v; }
/*     */   
/*     */   public String value()
/*     */   {
/* 142 */     return this.value;
/*     */   }
/*     */   
/*     */   public static MonitoredParameterType fromValue(String v) {
/* 146 */     for (MonitoredParameterType c : MonitoredParameterType.values()) {
/* 147 */       if (c.value.equals(v)) {
/* 148 */         return c;
/*     */       }
/*     */     }
/* 151 */     throw new IllegalArgumentException(v);
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\MonitoredParameterType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */