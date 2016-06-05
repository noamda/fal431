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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ClustersVirtualInfraConfiguration", propOrder={"clustersConfigurationSet"})
/*     */ public class ClustersVirtualInfraConfiguration
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClusterVirtualInfraConfiguration> clustersConfigurationSet;
/*     */   
/*     */   public ClustersVirtualInfraConfiguration() {}
/*     */   
/*     */   public ClustersVirtualInfraConfiguration(List<ClusterVirtualInfraConfiguration> clustersConfigurationSet)
/*     */   {
/*  48 */     this.clustersConfigurationSet = clustersConfigurationSet;
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
/*     */   public List<ClusterVirtualInfraConfiguration> getClustersConfigurationSet()
/*     */   {
/*  74 */     if (this.clustersConfigurationSet == null) {
/*  75 */       this.clustersConfigurationSet = new ArrayList();
/*     */     }
/*  77 */     return this.clustersConfigurationSet;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof ClustersVirtualInfraConfiguration)) {
/*  88 */       return false;
/*     */     }
/*  90 */     ClustersVirtualInfraConfiguration otherObj = (ClustersVirtualInfraConfiguration)obj;
/*     */     
/*  92 */     return this.clustersConfigurationSet == otherObj.clustersConfigurationSet ? true : this.clustersConfigurationSet != null ? this.clustersConfigurationSet.equals(otherObj.clustersConfigurationSet) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.clustersConfigurationSet != null ? this.clustersConfigurationSet.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "ClustersVirtualInfraConfiguration [clustersConfigurationSet=" + this.clustersConfigurationSet + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClustersVirtualInfraConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */