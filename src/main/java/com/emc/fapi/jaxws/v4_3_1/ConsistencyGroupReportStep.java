/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlSeeAlso;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonSubTypes;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.As;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
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
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ConsistencyGroupReportVMStep.class, name="ConsistencyGroupReportVMStep")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupReportStep", propOrder={"endTime", "ownerCopy", "startTime", "stepStatus", "stepType", "stepUID", "subSteps"})
/*     */ @XmlSeeAlso({ConsistencyGroupReportVMStep.class})
/*     */ public class ConsistencyGroupReportStep
/*     */ {
/*     */   protected Long endTime;
/*     */   protected GlobalCopyUID ownerCopy;
/*     */   protected Long startTime;
/*     */   protected ReportStepStatus stepStatus;
/*     */   protected ReportStepType stepType;
/*     */   protected ReportStepUID stepUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupReportStep> subSteps;
/*     */   
/*     */   public ConsistencyGroupReportStep() {}
/*     */   
/*     */   public ConsistencyGroupReportStep(Long endTime, GlobalCopyUID ownerCopy, Long startTime, ReportStepStatus stepStatus, ReportStepType stepType, ReportStepUID stepUID, List<ConsistencyGroupReportStep> subSteps)
/*     */   {
/*  81 */     this.endTime = endTime;
/*  82 */     this.ownerCopy = ownerCopy;
/*  83 */     this.startTime = startTime;
/*  84 */     this.stepStatus = stepStatus;
/*  85 */     this.stepType = stepType;
/*  86 */     this.stepUID = stepUID;
/*  87 */     this.subSteps = subSteps;
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
/*  99 */     return this.endTime;
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
/* 111 */     this.endTime = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GlobalCopyUID getOwnerCopy()
/*     */   {
/* 123 */     return this.ownerCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setOwnerCopy(GlobalCopyUID value)
/*     */   {
/* 135 */     this.ownerCopy = value;
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
/* 147 */     return this.startTime;
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
/* 159 */     this.startTime = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ReportStepStatus getStepStatus()
/*     */   {
/* 171 */     return this.stepStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStepStatus(ReportStepStatus value)
/*     */   {
/* 183 */     this.stepStatus = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ReportStepType getStepType()
/*     */   {
/* 195 */     return this.stepType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStepType(ReportStepType value)
/*     */   {
/* 207 */     this.stepType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ReportStepUID getStepUID()
/*     */   {
/* 219 */     return this.stepUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStepUID(ReportStepUID value)
/*     */   {
/* 231 */     this.stepUID = value;
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
/*     */   public List<ConsistencyGroupReportStep> getSubSteps()
/*     */   {
/* 257 */     if (this.subSteps == null) {
/* 258 */       this.subSteps = new ArrayList();
/*     */     }
/* 260 */     return this.subSteps;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 270 */     if (!(obj instanceof ConsistencyGroupReportStep)) {
/* 271 */       return false;
/*     */     }
/* 273 */     ConsistencyGroupReportStep otherObj = (ConsistencyGroupReportStep)obj;
/*     */     
/* 275 */     return (this.endTime != null ? this.endTime.equals(otherObj.endTime) : this.endTime == otherObj.endTime) && (this.ownerCopy != null ? this.ownerCopy.equals(otherObj.ownerCopy) : this.ownerCopy == otherObj.ownerCopy) && (this.startTime != null ? this.startTime.equals(otherObj.startTime) : this.startTime == otherObj.startTime) && (this.stepStatus != null ? this.stepStatus.equals(otherObj.stepStatus) : this.stepStatus == otherObj.stepStatus) && (this.stepType != null ? this.stepType.equals(otherObj.stepType) : this.stepType == otherObj.stepType) && (this.stepUID != null ? this.stepUID.equals(otherObj.stepUID) : this.stepUID == otherObj.stepUID) && (this.subSteps != null ? this.subSteps.equals(otherObj.subSteps) : this.subSteps == otherObj.subSteps);
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
/* 290 */     return (this.endTime != null ? this.endTime.hashCode() : 0) ^ (this.ownerCopy != null ? this.ownerCopy.hashCode() : 0) ^ (this.startTime != null ? this.startTime.hashCode() : 0) ^ (this.stepStatus != null ? this.stepStatus.hashCode() : 0) ^ (this.stepType != null ? this.stepType.hashCode() : 0) ^ (this.stepUID != null ? this.stepUID.hashCode() : 0) ^ (this.subSteps != null ? this.subSteps.hashCode() : 0);
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
/* 305 */     return "ConsistencyGroupReportStep [endTime=" + this.endTime + ", " + "ownerCopy=" + this.ownerCopy + ", " + "startTime=" + this.startTime + ", " + "stepStatus=" + this.stepStatus + ", " + "stepType=" + this.stepType + ", " + "stepUID=" + this.stepUID + ", " + "subSteps=" + this.subSteps + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupReportStep.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */