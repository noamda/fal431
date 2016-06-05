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
/*     */ @XmlType(name="rescanSANVolumesInCluster", propOrder={"cluster", "checkExistingVolumesAsWell"})
/*     */ public class RescanSANVolumesInCluster
/*     */ {
/*     */   protected ClusterUID cluster;
/*     */   protected boolean checkExistingVolumesAsWell;
/*     */   
/*     */   public RescanSANVolumesInCluster() {}
/*     */   
/*     */   public RescanSANVolumesInCluster(ClusterUID cluster, boolean checkExistingVolumesAsWell)
/*     */   {
/*  47 */     this.cluster = cluster;
/*  48 */     this.checkExistingVolumesAsWell = checkExistingVolumesAsWell;
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
/*     */   public boolean isCheckExistingVolumesAsWell()
/*     */   {
/*  80 */     return this.checkExistingVolumesAsWell;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCheckExistingVolumesAsWell(boolean value)
/*     */   {
/*  88 */     this.checkExistingVolumesAsWell = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  98 */     if (!(obj instanceof RescanSANVolumesInCluster)) {
/*  99 */       return false;
/*     */     }
/* 101 */     RescanSANVolumesInCluster otherObj = (RescanSANVolumesInCluster)obj;
/*     */     
/* 103 */     return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.checkExistingVolumesAsWell == otherObj.checkExistingVolumesAsWell);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 113 */     return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.checkExistingVolumesAsWell ? 1 : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 123 */     return "RescanSANVolumesInCluster [cluster=" + this.cluster + ", " + "checkExistingVolumesAsWell=" + this.checkExistingVolumesAsWell + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RescanSANVolumesInCluster.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */