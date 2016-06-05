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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="unregisterEsxClusters", propOrder={"cluster", "vcUID", "esxClusterUIDs"})
/*     */ public class UnregisterEsxClusters
/*     */ {
/*     */   protected ClusterUID cluster;
/*     */   protected VirtualCenterUID vcUID;
/*     */   protected List<EsxClusterUID> esxClusterUIDs;
/*     */   
/*     */   public UnregisterEsxClusters() {}
/*     */   
/*     */   public UnregisterEsxClusters(ClusterUID cluster, VirtualCenterUID vcUID, List<EsxClusterUID> esxClusterUIDs)
/*     */   {
/*  52 */     this.cluster = cluster;
/*  53 */     this.vcUID = vcUID;
/*  54 */     this.esxClusterUIDs = esxClusterUIDs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterUID getCluster()
/*     */   {
/*  66 */     return this.cluster;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCluster(ClusterUID value)
/*     */   {
/*  78 */     this.cluster = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VirtualCenterUID getVcUID()
/*     */   {
/*  90 */     return this.vcUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVcUID(VirtualCenterUID value)
/*     */   {
/* 102 */     this.vcUID = value;
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
/*     */   public List<EsxClusterUID> getEsxClusterUIDs()
/*     */   {
/* 128 */     if (this.esxClusterUIDs == null) {
/* 129 */       this.esxClusterUIDs = new ArrayList();
/*     */     }
/* 131 */     return this.esxClusterUIDs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 141 */     if (!(obj instanceof UnregisterEsxClusters)) {
/* 142 */       return false;
/*     */     }
/* 144 */     UnregisterEsxClusters otherObj = (UnregisterEsxClusters)obj;
/*     */     
/* 146 */     return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.vcUID != null ? this.vcUID.equals(otherObj.vcUID) : this.vcUID == otherObj.vcUID) && (this.esxClusterUIDs != null ? this.esxClusterUIDs.equals(otherObj.esxClusterUIDs) : this.esxClusterUIDs == otherObj.esxClusterUIDs);
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
/* 157 */     return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.vcUID != null ? this.vcUID.hashCode() : 0) ^ (this.esxClusterUIDs != null ? this.esxClusterUIDs.hashCode() : 0);
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
/* 168 */     return "UnregisterEsxClusters [cluster=" + this.cluster + ", " + "vcUID=" + this.vcUID + ", " + "esxClusterUIDs=" + this.esxClusterUIDs + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\UnregisterEsxClusters.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */