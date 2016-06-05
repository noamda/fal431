/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*     */ @XmlType(name="getClustersVirtualInfraConfiguration", propOrder={"clusterUIDs"})
/*     */ public class GetClustersVirtualInfraConfiguration
/*     */ {
/*     */   protected List<ClusterUID> clusterUIDs;
/*     */   
/*     */   public GetClustersVirtualInfraConfiguration() {}
/*     */   
/*     */   public GetClustersVirtualInfraConfiguration(List<ClusterUID> clusterUIDs)
/*     */   {
/*  46 */     this.clusterUIDs = clusterUIDs;
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
/*     */   public List<ClusterUID> getClusterUIDs()
/*     */   {
/*  72 */     if (this.clusterUIDs == null) {
/*  73 */       this.clusterUIDs = new ArrayList();
/*     */     }
/*  75 */     return this.clusterUIDs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  85 */     if (!(obj instanceof GetClustersVirtualInfraConfiguration)) {
/*  86 */       return false;
/*     */     }
/*  88 */     GetClustersVirtualInfraConfiguration otherObj = (GetClustersVirtualInfraConfiguration)obj;
/*     */     
/*  90 */     return this.clusterUIDs == otherObj.clusterUIDs ? true : this.clusterUIDs != null ? this.clusterUIDs.equals(otherObj.clusterUIDs) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  99 */     return this.clusterUIDs != null ? this.clusterUIDs.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 108 */     return "GetClustersVirtualInfraConfiguration [clusterUIDs=" + this.clusterUIDs + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetClustersVirtualInfraConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */