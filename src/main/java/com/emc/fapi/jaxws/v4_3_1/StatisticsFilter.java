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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="StatisticsFilter", propOrder={"timeFrame", "includeGlobalStatistics", "groups", "rpasNumbers", "clusters", "categories", "granularity"})
/*     */ public class StatisticsFilter
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected TimeFrame timeFrame;
/*     */   protected boolean includeGlobalStatistics;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupUID> groups;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<Integer> rpasNumbers;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClusterUID> clusters;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<String> categories;
/*     */   @XmlElement(required=true)
/*     */   protected Quantity granularity;
/*     */   
/*     */   public StatisticsFilter() {}
/*     */   
/*     */   public StatisticsFilter(TimeFrame timeFrame, boolean includeGlobalStatistics, List<ConsistencyGroupUID> groups, List<Integer> rpasNumbers, List<ClusterUID> clusters, List<String> categories, Quantity granularity)
/*     */   {
/*  71 */     this.timeFrame = timeFrame;
/*  72 */     this.includeGlobalStatistics = includeGlobalStatistics;
/*  73 */     this.groups = groups;
/*  74 */     this.rpasNumbers = rpasNumbers;
/*  75 */     this.clusters = clusters;
/*  76 */     this.categories = categories;
/*  77 */     this.granularity = granularity;
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
/*  89 */     return this.timeFrame;
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
/* 101 */     this.timeFrame = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isIncludeGlobalStatistics()
/*     */   {
/* 109 */     return this.includeGlobalStatistics;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIncludeGlobalStatistics(boolean value)
/*     */   {
/* 117 */     this.includeGlobalStatistics = value;
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
/* 143 */     if (this.groups == null) {
/* 144 */       this.groups = new ArrayList();
/*     */     }
/* 146 */     return this.groups;
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
/*     */   public List<Integer> getRpasNumbers()
/*     */   {
/* 172 */     if (this.rpasNumbers == null) {
/* 173 */       this.rpasNumbers = new ArrayList();
/*     */     }
/* 175 */     return this.rpasNumbers;
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
/*     */   public List<ClusterUID> getClusters()
/*     */   {
/* 201 */     if (this.clusters == null) {
/* 202 */       this.clusters = new ArrayList();
/*     */     }
/* 204 */     return this.clusters;
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
/*     */   public List<String> getCategories()
/*     */   {
/* 230 */     if (this.categories == null) {
/* 231 */       this.categories = new ArrayList();
/*     */     }
/* 233 */     return this.categories;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Quantity getGranularity()
/*     */   {
/* 245 */     return this.granularity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGranularity(Quantity value)
/*     */   {
/* 257 */     this.granularity = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 267 */     if (!(obj instanceof StatisticsFilter)) {
/* 268 */       return false;
/*     */     }
/* 270 */     StatisticsFilter otherObj = (StatisticsFilter)obj;
/*     */     
/* 272 */     return (this.timeFrame != null ? this.timeFrame.equals(otherObj.timeFrame) : this.timeFrame == otherObj.timeFrame) && (this.includeGlobalStatistics == otherObj.includeGlobalStatistics) && (this.groups != null ? this.groups.equals(otherObj.groups) : this.groups == otherObj.groups) && (this.rpasNumbers != null ? this.rpasNumbers.equals(otherObj.rpasNumbers) : this.rpasNumbers == otherObj.rpasNumbers) && (this.clusters != null ? this.clusters.equals(otherObj.clusters) : this.clusters == otherObj.clusters) && (this.categories != null ? this.categories.equals(otherObj.categories) : this.categories == otherObj.categories) && (this.granularity != null ? this.granularity.equals(otherObj.granularity) : this.granularity == otherObj.granularity);
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
/* 287 */     return (this.timeFrame != null ? this.timeFrame.hashCode() : 0) ^ (this.includeGlobalStatistics ? 1 : 0) ^ (this.groups != null ? this.groups.hashCode() : 0) ^ (this.rpasNumbers != null ? this.rpasNumbers.hashCode() : 0) ^ (this.clusters != null ? this.clusters.hashCode() : 0) ^ (this.categories != null ? this.categories.hashCode() : 0) ^ (this.granularity != null ? this.granularity.hashCode() : 0);
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
/* 302 */     return "StatisticsFilter [timeFrame=" + this.timeFrame + ", " + "includeGlobalStatistics=" + this.includeGlobalStatistics + ", " + "groups=" + this.groups + ", " + "rpasNumbers=" + this.rpasNumbers + ", " + "clusters=" + this.clusters + ", " + "categories=" + this.categories + ", " + "granularity=" + this.granularity + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\StatisticsFilter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */