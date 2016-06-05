/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VMPersistentReportInfo", propOrder={"vmReportPowerUpStepInfoSet", "vmReportStepInfoSet"})
/*     */ public class VMPersistentReportInfo
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VMReportPowerUpStepInfo> vmReportPowerUpStepInfoSet;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VMReportStepInfo> vmReportStepInfoSet;
/*     */   
/*     */   public VMPersistentReportInfo() {}
/*     */   
/*     */   public VMPersistentReportInfo(List<VMReportPowerUpStepInfo> vmReportPowerUpStepInfoSet, List<VMReportStepInfo> vmReportStepInfoSet)
/*     */   {
/*  52 */     this.vmReportPowerUpStepInfoSet = vmReportPowerUpStepInfoSet;
/*  53 */     this.vmReportStepInfoSet = vmReportStepInfoSet;
/*     */   }
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
/*     */   public List<VMReportPowerUpStepInfo> getVmReportPowerUpStepInfoSet()
/*     */   {
/*  79 */     if (this.vmReportPowerUpStepInfoSet == null) {
/*  80 */       this.vmReportPowerUpStepInfoSet = new ArrayList();
/*     */     }
/*  82 */     return this.vmReportPowerUpStepInfoSet;
/*     */   }
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
/*     */   public List<VMReportStepInfo> getVmReportStepInfoSet()
/*     */   {
/* 108 */     if (this.vmReportStepInfoSet == null) {
/* 109 */       this.vmReportStepInfoSet = new ArrayList();
/*     */     }
/* 111 */     return this.vmReportStepInfoSet;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 121 */     if (!(obj instanceof VMPersistentReportInfo)) {
/* 122 */       return false;
/*     */     }
/* 124 */     VMPersistentReportInfo otherObj = (VMPersistentReportInfo)obj;
/*     */     
/* 126 */     return (this.vmReportPowerUpStepInfoSet != null ? this.vmReportPowerUpStepInfoSet.equals(otherObj.vmReportPowerUpStepInfoSet) : this.vmReportPowerUpStepInfoSet == otherObj.vmReportPowerUpStepInfoSet) && (this.vmReportStepInfoSet != null ? this.vmReportStepInfoSet.equals(otherObj.vmReportStepInfoSet) : this.vmReportStepInfoSet == otherObj.vmReportStepInfoSet);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 136 */     return (this.vmReportPowerUpStepInfoSet != null ? this.vmReportPowerUpStepInfoSet.hashCode() : 0) ^ (this.vmReportStepInfoSet != null ? this.vmReportStepInfoSet.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 146 */     return "VMPersistentReportInfo [vmReportPowerUpStepInfoSet=" + this.vmReportPowerUpStepInfoSet + ", " + "vmReportStepInfoSet=" + this.vmReportStepInfoSet + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VMPersistentReportInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */