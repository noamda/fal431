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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SystemStatistics", propOrder={"clusterStatistics", "consistencyGroupStatistics", "currentRPATime", "rpaStatistics"})
/*     */ public class SystemStatistics
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClusterStatistics> clusterStatistics;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupStatistics> consistencyGroupStatistics;
/*     */   protected RecoverPointTimeStamp currentRPATime;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RPAStatistics> rpaStatistics;
/*     */   
/*     */   public SystemStatistics() {}
/*     */   
/*     */   public SystemStatistics(List<ClusterStatistics> clusterStatistics, List<ConsistencyGroupStatistics> consistencyGroupStatistics, RecoverPointTimeStamp currentRPATime, List<RPAStatistics> rpaStatistics)
/*     */   {
/*  59 */     this.clusterStatistics = clusterStatistics;
/*  60 */     this.consistencyGroupStatistics = consistencyGroupStatistics;
/*  61 */     this.currentRPATime = currentRPATime;
/*  62 */     this.rpaStatistics = rpaStatistics;
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
/*     */   public List<ClusterStatistics> getClusterStatistics()
/*     */   {
/*  88 */     if (this.clusterStatistics == null) {
/*  89 */       this.clusterStatistics = new ArrayList();
/*     */     }
/*  91 */     return this.clusterStatistics;
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
/*     */   public List<ConsistencyGroupStatistics> getConsistencyGroupStatistics()
/*     */   {
/* 117 */     if (this.consistencyGroupStatistics == null) {
/* 118 */       this.consistencyGroupStatistics = new ArrayList();
/*     */     }
/* 120 */     return this.consistencyGroupStatistics;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointTimeStamp getCurrentRPATime()
/*     */   {
/* 132 */     return this.currentRPATime;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCurrentRPATime(RecoverPointTimeStamp value)
/*     */   {
/* 144 */     this.currentRPATime = value;
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
/*     */   public List<RPAStatistics> getRpaStatistics()
/*     */   {
/* 170 */     if (this.rpaStatistics == null) {
/* 171 */       this.rpaStatistics = new ArrayList();
/*     */     }
/* 173 */     return this.rpaStatistics;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 183 */     if (!(obj instanceof SystemStatistics)) {
/* 184 */       return false;
/*     */     }
/* 186 */     SystemStatistics otherObj = (SystemStatistics)obj;
/*     */     
/* 188 */     return (this.clusterStatistics != null ? this.clusterStatistics.equals(otherObj.clusterStatistics) : this.clusterStatistics == otherObj.clusterStatistics) && (this.consistencyGroupStatistics != null ? this.consistencyGroupStatistics.equals(otherObj.consistencyGroupStatistics) : this.consistencyGroupStatistics == otherObj.consistencyGroupStatistics) && (this.currentRPATime != null ? this.currentRPATime.equals(otherObj.currentRPATime) : this.currentRPATime == otherObj.currentRPATime) && (this.rpaStatistics != null ? this.rpaStatistics.equals(otherObj.rpaStatistics) : this.rpaStatistics == otherObj.rpaStatistics);
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
/* 200 */     return (this.clusterStatistics != null ? this.clusterStatistics.hashCode() : 0) ^ (this.consistencyGroupStatistics != null ? this.consistencyGroupStatistics.hashCode() : 0) ^ (this.currentRPATime != null ? this.currentRPATime.hashCode() : 0) ^ (this.rpaStatistics != null ? this.rpaStatistics.hashCode() : 0);
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
/* 212 */     return "SystemStatistics [clusterStatistics=" + this.clusterStatistics + ", " + "consistencyGroupStatistics=" + this.consistencyGroupStatistics + ", " + "currentRPATime=" + this.currentRPATime + ", " + "rpaStatistics=" + this.rpaStatistics + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SystemStatistics.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */