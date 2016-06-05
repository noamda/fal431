/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
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
/*     */ @XmlType(name="VMReportPowerUpStepInfo", propOrder={"vmStartUpActionUID", "title"})
/*     */ public class VMReportPowerUpStepInfo
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected VmStartUpActionUID vmStartUpActionUID;
/*     */   protected String title;
/*     */   
/*     */   public VMReportPowerUpStepInfo() {}
/*     */   
/*     */   public VMReportPowerUpStepInfo(VmStartUpActionUID vmStartUpActionUID, String title)
/*     */   {
/*  49 */     this.vmStartUpActionUID = vmStartUpActionUID;
/*  50 */     this.title = title;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmStartUpActionUID getVmStartUpActionUID()
/*     */   {
/*  62 */     return this.vmStartUpActionUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmStartUpActionUID(VmStartUpActionUID value)
/*     */   {
/*  74 */     this.vmStartUpActionUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getTitle()
/*     */   {
/*  86 */     return this.title;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTitle(String value)
/*     */   {
/*  98 */     this.title = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 108 */     if (!(obj instanceof VMReportPowerUpStepInfo)) {
/* 109 */       return false;
/*     */     }
/* 111 */     VMReportPowerUpStepInfo otherObj = (VMReportPowerUpStepInfo)obj;
/*     */     
/* 113 */     return (this.vmStartUpActionUID != null ? this.vmStartUpActionUID.equals(otherObj.vmStartUpActionUID) : this.vmStartUpActionUID == otherObj.vmStartUpActionUID) && (this.title != null ? this.title.equals(otherObj.title) : this.title == otherObj.title);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 123 */     return (this.vmStartUpActionUID != null ? this.vmStartUpActionUID.hashCode() : 0) ^ (this.title != null ? this.title.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 133 */     return "VMReportPowerUpStepInfo [vmStartUpActionUID=" + this.vmStartUpActionUID + ", " + "title=" + this.title + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VMReportPowerUpStepInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */