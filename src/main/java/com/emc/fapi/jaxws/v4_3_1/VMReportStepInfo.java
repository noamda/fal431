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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VMReportStepInfo", propOrder={"vmUid", "vmName", "priority", "critical"})
/*     */ public class VMReportStepInfo
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected VmUID vmUid;
/*     */   protected String vmName;
/*     */   protected Integer priority;
/*     */   protected Boolean critical;
/*     */   
/*     */   public VMReportStepInfo() {}
/*     */   
/*     */   public VMReportStepInfo(VmUID vmUid, String vmName, Integer priority, Boolean critical)
/*     */   {
/*  55 */     this.vmUid = vmUid;
/*  56 */     this.vmName = vmName;
/*  57 */     this.priority = priority;
/*  58 */     this.critical = critical;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmUID getVmUid()
/*     */   {
/*  70 */     return this.vmUid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmUid(VmUID value)
/*     */   {
/*  82 */     this.vmUid = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getVmName()
/*     */   {
/*  94 */     return this.vmName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmName(String value)
/*     */   {
/* 106 */     this.vmName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Integer getPriority()
/*     */   {
/* 118 */     return this.priority;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPriority(Integer value)
/*     */   {
/* 130 */     this.priority = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isCritical()
/*     */   {
/* 142 */     return this.critical;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCritical(Boolean value)
/*     */   {
/* 154 */     this.critical = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 164 */     if (!(obj instanceof VMReportStepInfo)) {
/* 165 */       return false;
/*     */     }
/* 167 */     VMReportStepInfo otherObj = (VMReportStepInfo)obj;
/*     */     
/* 169 */     return (this.vmUid != null ? this.vmUid.equals(otherObj.vmUid) : this.vmUid == otherObj.vmUid) && (this.vmName != null ? this.vmName.equals(otherObj.vmName) : this.vmName == otherObj.vmName) && (this.priority != null ? this.priority.equals(otherObj.priority) : this.priority == otherObj.priority) && (this.critical != null ? this.critical.equals(otherObj.critical) : this.critical == otherObj.critical);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 181 */     return (this.vmUid != null ? this.vmUid.hashCode() : 0) ^ (this.vmName != null ? this.vmName.hashCode() : 0) ^ (this.priority != null ? this.priority.hashCode() : 0) ^ (this.critical != null ? this.critical.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 193 */     return "VMReportStepInfo [vmUid=" + this.vmUid + ", " + "vmName=" + this.vmName + ", " + "priority=" + this.priority + ", " + "critical=" + this.critical + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VMReportStepInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */