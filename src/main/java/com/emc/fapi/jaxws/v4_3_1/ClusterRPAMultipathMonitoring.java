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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ClusterRPAMultipathMonitoring", propOrder={"clusterUID", "monitoringStorage", "monitoringSplitters"})
/*     */ public class ClusterRPAMultipathMonitoring
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   protected boolean monitoringStorage;
/*     */   protected boolean monitoringSplitters;
/*     */   
/*     */   public ClusterRPAMultipathMonitoring() {}
/*     */   
/*     */   public ClusterRPAMultipathMonitoring(ClusterUID clusterUID, boolean monitoringStorage, boolean monitoringSplitters)
/*     */   {
/*  52 */     this.clusterUID = clusterUID;
/*  53 */     this.monitoringStorage = monitoringStorage;
/*  54 */     this.monitoringSplitters = monitoringSplitters;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterUID getClusterUID()
/*     */   {
/*  66 */     return this.clusterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setClusterUID(ClusterUID value)
/*     */   {
/*  78 */     this.clusterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isMonitoringStorage()
/*     */   {
/*  86 */     return this.monitoringStorage;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMonitoringStorage(boolean value)
/*     */   {
/*  94 */     this.monitoringStorage = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isMonitoringSplitters()
/*     */   {
/* 102 */     return this.monitoringSplitters;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMonitoringSplitters(boolean value)
/*     */   {
/* 110 */     this.monitoringSplitters = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 120 */     if (!(obj instanceof ClusterRPAMultipathMonitoring)) {
/* 121 */       return false;
/*     */     }
/* 123 */     ClusterRPAMultipathMonitoring otherObj = (ClusterRPAMultipathMonitoring)obj;
/*     */     
/* 125 */     return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.monitoringStorage == otherObj.monitoringStorage) && (this.monitoringSplitters == otherObj.monitoringSplitters);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 136 */     return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.monitoringStorage ? 1 : 0) ^ (this.monitoringSplitters ? 1 : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 147 */     return "ClusterRPAMultipathMonitoring [clusterUID=" + this.clusterUID + ", " + "monitoringStorage=" + this.monitoringStorage + ", " + "monitoringSplitters=" + this.monitoringSplitters + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClusterRPAMultipathMonitoring.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */