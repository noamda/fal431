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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="DetectBottlenecksFilter", propOrder={"workingMode", "timeFrame", "peakDuration", "advancedOverview", "detailedOverview", "groups"})
/*     */ public class DetectBottlenecksFilter
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected BottlenecksDetectionMode workingMode;
/*     */   @XmlElement(nillable=true)
/*     */   protected TimeFrame timeFrame;
/*     */   protected Quantity peakDuration;
/*     */   protected Boolean advancedOverview;
/*     */   protected Boolean detailedOverview;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupUID> groups;
/*     */   
/*     */   public DetectBottlenecksFilter() {}
/*     */   
/*     */   public DetectBottlenecksFilter(BottlenecksDetectionMode workingMode, TimeFrame timeFrame, Quantity peakDuration, Boolean advancedOverview, Boolean detailedOverview, List<ConsistencyGroupUID> groups)
/*     */   {
/*  65 */     this.workingMode = workingMode;
/*  66 */     this.timeFrame = timeFrame;
/*  67 */     this.peakDuration = peakDuration;
/*  68 */     this.advancedOverview = advancedOverview;
/*  69 */     this.detailedOverview = detailedOverview;
/*  70 */     this.groups = groups;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public BottlenecksDetectionMode getWorkingMode()
/*     */   {
/*  82 */     return this.workingMode;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setWorkingMode(BottlenecksDetectionMode value)
/*     */   {
/*  94 */     this.workingMode = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public TimeFrame getTimeFrame()
/*     */   {
/* 106 */     return this.timeFrame;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTimeFrame(TimeFrame value)
/*     */   {
/* 118 */     this.timeFrame = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Quantity getPeakDuration()
/*     */   {
/* 130 */     return this.peakDuration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPeakDuration(Quantity value)
/*     */   {
/* 142 */     this.peakDuration = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isAdvancedOverview()
/*     */   {
/* 154 */     return this.advancedOverview;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAdvancedOverview(Boolean value)
/*     */   {
/* 166 */     this.advancedOverview = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isDetailedOverview()
/*     */   {
/* 178 */     return this.detailedOverview;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDetailedOverview(Boolean value)
/*     */   {
/* 190 */     this.detailedOverview = value;
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
/*     */   public List<ConsistencyGroupUID> getGroups()
/*     */   {
/* 216 */     if (this.groups == null) {
/* 217 */       this.groups = new ArrayList();
/*     */     }
/* 219 */     return this.groups;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 229 */     if (!(obj instanceof DetectBottlenecksFilter)) {
/* 230 */       return false;
/*     */     }
/* 232 */     DetectBottlenecksFilter otherObj = (DetectBottlenecksFilter)obj;
/*     */     
/* 234 */     return (this.workingMode != null ? this.workingMode.equals(otherObj.workingMode) : this.workingMode == otherObj.workingMode) && (this.timeFrame != null ? this.timeFrame.equals(otherObj.timeFrame) : this.timeFrame == otherObj.timeFrame) && (this.peakDuration != null ? this.peakDuration.equals(otherObj.peakDuration) : this.peakDuration == otherObj.peakDuration) && (this.advancedOverview != null ? this.advancedOverview.equals(otherObj.advancedOverview) : this.advancedOverview == otherObj.advancedOverview) && (this.detailedOverview != null ? this.detailedOverview.equals(otherObj.detailedOverview) : this.detailedOverview == otherObj.detailedOverview) && (this.groups != null ? this.groups.equals(otherObj.groups) : this.groups == otherObj.groups);
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
/*     */   public int hashCode()
/*     */   {
/* 248 */     return (this.workingMode != null ? this.workingMode.hashCode() : 0) ^ (this.timeFrame != null ? this.timeFrame.hashCode() : 0) ^ (this.peakDuration != null ? this.peakDuration.hashCode() : 0) ^ (this.advancedOverview != null ? this.advancedOverview.hashCode() : 0) ^ (this.detailedOverview != null ? this.detailedOverview.hashCode() : 0) ^ (this.groups != null ? this.groups.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 262 */     return "DetectBottlenecksFilter [workingMode=" + this.workingMode + ", " + "timeFrame=" + this.timeFrame + ", " + "peakDuration=" + this.peakDuration + ", " + "advancedOverview=" + this.advancedOverview + ", " + "detailedOverview=" + this.detailedOverview + ", " + "groups=" + this.groups + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\DetectBottlenecksFilter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */