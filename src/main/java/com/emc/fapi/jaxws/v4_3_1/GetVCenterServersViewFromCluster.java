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
/*     */ @XmlType(name="getVCenterServersViewFromCluster", propOrder={"cluster", "shouldRescan"})
/*     */ public class GetVCenterServersViewFromCluster
/*     */ {
/*     */   protected ClusterUID cluster;
/*     */   protected boolean shouldRescan;
/*     */   
/*     */   public GetVCenterServersViewFromCluster() {}
/*     */   
/*     */   public GetVCenterServersViewFromCluster(ClusterUID cluster, boolean shouldRescan)
/*     */   {
/*  47 */     this.cluster = cluster;
/*  48 */     this.shouldRescan = shouldRescan;
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
/*     */   public boolean isShouldRescan()
/*     */   {
/*  80 */     return this.shouldRescan;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setShouldRescan(boolean value)
/*     */   {
/*  88 */     this.shouldRescan = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  98 */     if (!(obj instanceof GetVCenterServersViewFromCluster)) {
/*  99 */       return false;
/*     */     }
/* 101 */     GetVCenterServersViewFromCluster otherObj = (GetVCenterServersViewFromCluster)obj;
/*     */     
/* 103 */     return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.shouldRescan == otherObj.shouldRescan);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 113 */     return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.shouldRescan ? 1 : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 123 */     return "GetVCenterServersViewFromCluster [cluster=" + this.cluster + ", " + "shouldRescan=" + this.shouldRescan + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetVCenterServersViewFromCluster.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */