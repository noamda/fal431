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
/*    */ @XmlType(name="bottlenecksDetectionMode")
/*    */ @XmlEnum
/*    */ public enum BottlenecksDetectionMode
/*    */ {
/* 32 */   SYSTEM_OVERVIEW_AND_BOTTLENECK_ANALYSIS, 
/* 33 */   DETECTION_OF_INITIALIZATION_PERIODS, 
/* 34 */   DETECTION_OF_HIGH_LOAD_PERIODS, 
/* 35 */   GENERAL_DETECTION_INCLUDING_INITIALIZATION_AND_HIGH_LOAD_PERIODS_WITH_PEAK_WRITING_ANALYSIS, 
/* 36 */   ADVANCED_AND_DETAILED_GENERAL_DETECTION, 
/* 37 */   PEAK_WRITING_ANALYSIS, 
/* 38 */   UNKNOWN;
/*    */   
/*    */   private BottlenecksDetectionMode() {}
/* 41 */   public String value() { return name(); }
/*    */   
/*    */   public static BottlenecksDetectionMode fromValue(String v)
/*    */   {
/* 45 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\BottlenecksDetectionMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */