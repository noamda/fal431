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
/*    */ @XmlType(name="controllerType")
/*    */ @XmlEnum
/*    */ public enum ControllerType
/*    */ {
/* 29 */   CONTROLLER_TYPE_SCSI, 
/* 30 */   CONTROLLER_TYPE_SATA, 
/* 31 */   CONTROLLER_TYPE_IDE, 
/* 32 */   CONTROLLER_TYPE_UNKNOWN;
/*    */   
/*    */   private ControllerType() {}
/* 35 */   public String value() { return name(); }
/*    */   
/*    */   public static ControllerType fromValue(String v)
/*    */   {
/* 39 */     return valueOf(v);
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ControllerType.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */