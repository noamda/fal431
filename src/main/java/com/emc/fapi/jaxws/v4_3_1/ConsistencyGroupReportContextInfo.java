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
/*     */ @XmlType(name="ConsistencyGroupReportContextInfo", propOrder={"reportUID", "context", "inProgress", "reportStatus"})
/*     */ public class ConsistencyGroupReportContextInfo
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ReportUID reportUID;
/*     */   protected long context;
/*     */   protected boolean inProgress;
/*     */   @XmlElement(nillable=true)
/*     */   protected ReportStatus reportStatus;
/*     */   
/*     */   public ConsistencyGroupReportContextInfo() {}
/*     */   
/*     */   public ConsistencyGroupReportContextInfo(ReportUID reportUID, long context, boolean inProgress, ReportStatus reportStatus)
/*     */   {
/*  56 */     this.reportUID = reportUID;
/*  57 */     this.context = context;
/*  58 */     this.inProgress = inProgress;
/*  59 */     this.reportStatus = reportStatus;
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
/*  71 */     return this.reportUID;
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
/*  83 */     this.reportUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getContext()
/*     */   {
/*  91 */     return this.context;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setContext(long value)
/*     */   {
/*  99 */     this.context = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isInProgress()
/*     */   {
/* 107 */     return this.inProgress;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setInProgress(boolean value)
/*     */   {
/* 115 */     this.inProgress = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ReportStatus getReportStatus()
/*     */   {
/* 127 */     return this.reportStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReportStatus(ReportStatus value)
/*     */   {
/* 139 */     this.reportStatus = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 149 */     if (!(obj instanceof ConsistencyGroupReportContextInfo)) {
/* 150 */       return false;
/*     */     }
/* 152 */     ConsistencyGroupReportContextInfo otherObj = (ConsistencyGroupReportContextInfo)obj;
/*     */     
/* 154 */     return (this.reportUID != null ? this.reportUID.equals(otherObj.reportUID) : this.reportUID == otherObj.reportUID) && (this.context == otherObj.context) && (this.inProgress == otherObj.inProgress) && (this.reportStatus != null ? this.reportStatus.equals(otherObj.reportStatus) : this.reportStatus == otherObj.reportStatus);
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
/* 166 */     return (this.reportUID != null ? this.reportUID.hashCode() : 0) ^ (int)this.context ^ (this.inProgress ? 1 : 0) ^ (this.reportStatus != null ? this.reportStatus.hashCode() : 0);
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
/* 178 */     return "ConsistencyGroupReportContextInfo [reportUID=" + this.reportUID + ", " + "context=" + this.context + ", " + "inProgress=" + this.inProgress + ", " + "reportStatus=" + this.reportStatus + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupReportContextInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */