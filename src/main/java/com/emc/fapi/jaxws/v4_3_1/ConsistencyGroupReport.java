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
/*     */ @XmlType(name="ConsistencyGroupReport", propOrder={"reportUID", "type", "status", "mainGlobalCopy", "startTime", "endTime", "username", "reportSteps", "vmPersistentReportInfo", "context", "progressPercentage"})
/*     */ public class ConsistencyGroupReport
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ReportUID reportUID;
/*     */   protected ReportType type;
/*     */   protected ReportStatus status;
/*     */   protected GlobalCopyUID mainGlobalCopy;
/*     */   protected Long startTime;
/*     */   protected Long endTime;
/*     */   protected String username;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupReportStep> reportSteps;
/*     */   @XmlElement(nillable=true)
/*     */   protected VMPersistentReportInfo vmPersistentReportInfo;
/*     */   protected long context;
/*     */   protected Integer progressPercentage;
/*     */   
/*     */   public ConsistencyGroupReport() {}
/*     */   
/*     */   public ConsistencyGroupReport(ReportUID reportUID, ReportType type, ReportStatus status, GlobalCopyUID mainGlobalCopy, Long startTime, Long endTime, String username, List<ConsistencyGroupReportStep> reportSteps, VMPersistentReportInfo vmPersistentReportInfo, long context, Integer progressPercentage)
/*     */   {
/*  80 */     this.reportUID = reportUID;
/*  81 */     this.type = type;
/*  82 */     this.status = status;
/*  83 */     this.mainGlobalCopy = mainGlobalCopy;
/*  84 */     this.startTime = startTime;
/*  85 */     this.endTime = endTime;
/*  86 */     this.username = username;
/*  87 */     this.reportSteps = reportSteps;
/*  88 */     this.vmPersistentReportInfo = vmPersistentReportInfo;
/*  89 */     this.context = context;
/*  90 */     this.progressPercentage = progressPercentage;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ReportUID getReportUID()
/*     */   {
/* 102 */     return this.reportUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReportUID(ReportUID value)
/*     */   {
/* 114 */     this.reportUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ReportType getType()
/*     */   {
/* 126 */     return this.type;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setType(ReportType value)
/*     */   {
/* 138 */     this.type = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ReportStatus getStatus()
/*     */   {
/* 150 */     return this.status;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStatus(ReportStatus value)
/*     */   {
/* 162 */     this.status = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GlobalCopyUID getMainGlobalCopy()
/*     */   {
/* 174 */     return this.mainGlobalCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMainGlobalCopy(GlobalCopyUID value)
/*     */   {
/* 186 */     this.mainGlobalCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getStartTime()
/*     */   {
/* 198 */     return this.startTime;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStartTime(Long value)
/*     */   {
/* 210 */     this.startTime = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getEndTime()
/*     */   {
/* 222 */     return this.endTime;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEndTime(Long value)
/*     */   {
/* 234 */     this.endTime = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getUsername()
/*     */   {
/* 246 */     return this.username;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUsername(String value)
/*     */   {
/* 258 */     this.username = value;
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
/*     */   public List<ConsistencyGroupReportStep> getReportSteps()
/*     */   {
/* 284 */     if (this.reportSteps == null) {
/* 285 */       this.reportSteps = new ArrayList();
/*     */     }
/* 287 */     return this.reportSteps;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VMPersistentReportInfo getVmPersistentReportInfo()
/*     */   {
/* 299 */     return this.vmPersistentReportInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmPersistentReportInfo(VMPersistentReportInfo value)
/*     */   {
/* 311 */     this.vmPersistentReportInfo = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getContext()
/*     */   {
/* 319 */     return this.context;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setContext(long value)
/*     */   {
/* 327 */     this.context = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Integer getProgressPercentage()
/*     */   {
/* 339 */     return this.progressPercentage;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setProgressPercentage(Integer value)
/*     */   {
/* 351 */     this.progressPercentage = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 361 */     if (!(obj instanceof ConsistencyGroupReport)) {
/* 362 */       return false;
/*     */     }
/* 364 */     ConsistencyGroupReport otherObj = (ConsistencyGroupReport)obj;
/*     */     
/* 366 */     return (this.reportUID != null ? this.reportUID.equals(otherObj.reportUID) : this.reportUID == otherObj.reportUID) && (this.type != null ? this.type.equals(otherObj.type) : this.type == otherObj.type) && (this.status != null ? this.status.equals(otherObj.status) : this.status == otherObj.status) && (this.mainGlobalCopy != null ? this.mainGlobalCopy.equals(otherObj.mainGlobalCopy) : this.mainGlobalCopy == otherObj.mainGlobalCopy) && (this.startTime != null ? this.startTime.equals(otherObj.startTime) : this.startTime == otherObj.startTime) && (this.endTime != null ? this.endTime.equals(otherObj.endTime) : this.endTime == otherObj.endTime) && (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username) && (this.reportSteps != null ? this.reportSteps.equals(otherObj.reportSteps) : this.reportSteps == otherObj.reportSteps) && (this.vmPersistentReportInfo != null ? this.vmPersistentReportInfo.equals(otherObj.vmPersistentReportInfo) : this.vmPersistentReportInfo == otherObj.vmPersistentReportInfo) && (this.context == otherObj.context) && (this.progressPercentage != null ? this.progressPercentage.equals(otherObj.progressPercentage) : this.progressPercentage == otherObj.progressPercentage);
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
/*     */   public int hashCode()
/*     */   {
/* 385 */     return (this.reportUID != null ? this.reportUID.hashCode() : 0) ^ (this.type != null ? this.type.hashCode() : 0) ^ (this.status != null ? this.status.hashCode() : 0) ^ (this.mainGlobalCopy != null ? this.mainGlobalCopy.hashCode() : 0) ^ (this.startTime != null ? this.startTime.hashCode() : 0) ^ (this.endTime != null ? this.endTime.hashCode() : 0) ^ (this.username != null ? this.username.hashCode() : 0) ^ (this.reportSteps != null ? this.reportSteps.hashCode() : 0) ^ (this.vmPersistentReportInfo != null ? this.vmPersistentReportInfo.hashCode() : 0) ^ (int)this.context ^ (this.progressPercentage != null ? this.progressPercentage.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 404 */     return "ConsistencyGroupReport [reportUID=" + this.reportUID + ", " + "type=" + this.type + ", " + "status=" + this.status + ", " + "mainGlobalCopy=" + this.mainGlobalCopy + ", " + "startTime=" + this.startTime + ", " + "endTime=" + this.endTime + ", " + "username=" + this.username + ", " + "reportSteps=" + this.reportSteps + ", " + "vmPersistentReportInfo=" + this.vmPersistentReportInfo + ", " + "context=" + this.context + ", " + "progressPercentage=" + this.progressPercentage + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupReport.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */