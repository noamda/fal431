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
/*    */ @XmlType(name="VCenterServersViewSettings", propOrder={"vcenterServersFiltersEnabled"})
/*    */ public class VCenterServersViewSettings
/*    */ {
/*    */   protected boolean vcenterServersFiltersEnabled;
/*    */   
/*    */   public VCenterServersViewSettings() {}
/*    */   
/*    */   public VCenterServersViewSettings(boolean vcenterServersFiltersEnabled)
/*    */   {
/* 44 */     this.vcenterServersFiltersEnabled = vcenterServersFiltersEnabled;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean isVcenterServersFiltersEnabled()
/*    */   {
/* 52 */     return this.vcenterServersFiltersEnabled;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setVcenterServersFiltersEnabled(boolean value)
/*    */   {
/* 60 */     this.vcenterServersFiltersEnabled = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 70 */     if (!(obj instanceof VCenterServersViewSettings)) {
/* 71 */       return false;
/*    */     }
/* 73 */     VCenterServersViewSettings otherObj = (VCenterServersViewSettings)obj;
/*    */     
/* 75 */     return this.vcenterServersFiltersEnabled == otherObj.vcenterServersFiltersEnabled;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 84 */     return this.vcenterServersFiltersEnabled ? 1 : 0;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 93 */     return "VCenterServersViewSettings [vcenterServersFiltersEnabled=" + this.vcenterServersFiltersEnabled + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VCenterServersViewSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */