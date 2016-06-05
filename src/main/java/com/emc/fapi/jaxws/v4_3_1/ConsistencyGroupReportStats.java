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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupReportStats", propOrder={"reportUID", "type", "status", "startTime", "endTime", "mainGlobalCopy", "username"})
/*     */ public class ConsistencyGroupReportStats
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ReportUID reportUID;
/*     */   protected ReportType type;
/*     */   protected ReportStatus status;
/*     */   protected Long startTime;
/*     */   protected Long endTime;
/*     */   protected GlobalCopyUID mainGlobalCopy;
/*     */   protected String username;
/*     */   
/*     */   public ConsistencyGroupReportStats() {}
/*     */   
/*     */   public ConsistencyGroupReportStats(ReportUID reportUID, ReportType type, ReportStatus status, Long startTime, Long endTime, GlobalCopyUID mainGlobalCopy, String username)
/*     */   {
/*  64 */     this.reportUID = reportUID;
/*  65 */     this.type = type;
/*  66 */     this.status = status;
/*  67 */     this.startTime = startTime;
/*  68 */     this.endTime = endTime;
/*  69 */     this.mainGlobalCopy = mainGlobalCopy;
/*  70 */     this.username = username;
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
/*  82 */     return this.reportUID;
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
/*  94 */     this.reportUID = value;
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
/* 106 */     return this.type;
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
/* 118 */     this.type = value;
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
/* 130 */     return this.status;
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
/* 142 */     this.status = value;
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
/* 154 */     return this.startTime;
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
/* 166 */     this.startTime = value;
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
/* 178 */     return this.endTime;
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
/* 190 */     this.endTime = value;
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
/* 202 */     return this.mainGlobalCopy;
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
/* 214 */     this.mainGlobalCopy = value;
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
/* 226 */     return this.username;
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
/* 238 */     this.username = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 248 */     if (!(obj instanceof ConsistencyGroupReportStats)) {
/* 249 */       return false;
/*     */     }
/* 251 */     ConsistencyGroupReportStats otherObj = (ConsistencyGroupReportStats)obj;
/*     */     
/* 253 */     return (this.reportUID != null ? this.reportUID.equals(otherObj.reportUID) : this.reportUID == otherObj.reportUID) && (this.type != null ? this.type.equals(otherObj.type) : this.type == otherObj.type) && (this.status != null ? this.status.equals(otherObj.status) : this.status == otherObj.status) && (this.startTime != null ? this.startTime.equals(otherObj.startTime) : this.startTime == otherObj.startTime) && (this.endTime != null ? this.endTime.equals(otherObj.endTime) : this.endTime == otherObj.endTime) && (this.mainGlobalCopy != null ? this.mainGlobalCopy.equals(otherObj.mainGlobalCopy) : this.mainGlobalCopy == otherObj.mainGlobalCopy) && (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username);
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
/*     */   public int hashCode()
/*     */   {
/* 268 */     return (this.reportUID != null ? this.reportUID.hashCode() : 0) ^ (this.type != null ? this.type.hashCode() : 0) ^ (this.status != null ? this.status.hashCode() : 0) ^ (this.startTime != null ? this.startTime.hashCode() : 0) ^ (this.endTime != null ? this.endTime.hashCode() : 0) ^ (this.mainGlobalCopy != null ? this.mainGlobalCopy.hashCode() : 0) ^ (this.username != null ? this.username.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 283 */     return "ConsistencyGroupReportStats [reportUID=" + this.reportUID + ", " + "type=" + this.type + ", " + "status=" + this.status + ", " + "startTime=" + this.startTime + ", " + "endTime=" + this.endTime + ", " + "mainGlobalCopy=" + this.mainGlobalCopy + ", " + "username=" + this.username + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupReportStats.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */