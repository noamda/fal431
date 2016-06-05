/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="getAvailableClusterClariionVolumes", propOrder={"cluster", "refreshView"})
/*     */ public class GetAvailableClusterClariionVolumes
/*     */ {
/*     */   protected ClusterUID cluster;
/*     */   protected boolean refreshView;
/*     */   
/*     */   public GetAvailableClusterClariionVolumes() {}
/*     */   
/*     */   public GetAvailableClusterClariionVolumes(ClusterUID cluster, boolean refreshView)
/*     */   {
/*  47 */     this.cluster = cluster;
/*  48 */     this.refreshView = refreshView;
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
/*  60 */     return this.cluster;
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
/*  72 */     this.cluster = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isRefreshView()
/*     */   {
/*  80 */     return this.refreshView;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRefreshView(boolean value)
/*     */   {
/*  88 */     this.refreshView = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  98 */     if (!(obj instanceof GetAvailableClusterClariionVolumes)) {
/*  99 */       return false;
/*     */     }
/* 101 */     GetAvailableClusterClariionVolumes otherObj = (GetAvailableClusterClariionVolumes)obj;
/*     */     
/* 103 */     return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.refreshView == otherObj.refreshView);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 113 */     return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.refreshView ? 1 : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 123 */     return "GetAvailableClusterClariionVolumes [cluster=" + this.cluster + ", " + "refreshView=" + this.refreshView + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetAvailableClusterClariionVolumes.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */