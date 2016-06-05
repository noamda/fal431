/*    */ package com.emc.fapi.jaxws.v4_3_1;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="TimeSettings", propOrder={"useClustersTimeZones"})
/*    */ public class TimeSettings
/*    */ {
/*    */   protected boolean useClustersTimeZones;
/*    */   
/*    */   public TimeSettings() {}
/*    */   
/*    */   public TimeSettings(boolean useClustersTimeZones)
/*    */   {
/* 44 */     this.useClustersTimeZones = useClustersTimeZones;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean isUseClustersTimeZones()
/*    */   {
/* 52 */     return this.useClustersTimeZones;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setUseClustersTimeZones(boolean value)
/*    */   {
/* 60 */     this.useClustersTimeZones = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 70 */     if (!(obj instanceof TimeSettings)) {
/* 71 */       return false;
/*    */     }
/* 73 */     TimeSettings otherObj = (TimeSettings)obj;
/*    */     
/* 75 */     return this.useClustersTimeZones == otherObj.useClustersTimeZones;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 84 */     return this.useClustersTimeZones ? 1 : 0;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 93 */     return "TimeSettings [useClustersTimeZones=" + this.useClustersTimeZones + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\TimeSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */