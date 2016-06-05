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
/*     */ @XmlType(name="startClusterMaintenance", propOrder={"cluster", "maintenanceMode"})
/*     */ public class StartClusterMaintenance
/*     */ {
/*     */   protected ClusterUID cluster;
/*     */   protected ClusterMaintenanceMode maintenanceMode;
/*     */   
/*     */   public StartClusterMaintenance() {}
/*     */   
/*     */   public StartClusterMaintenance(ClusterUID cluster, ClusterMaintenanceMode maintenanceMode)
/*     */   {
/*  47 */     this.cluster = cluster;
/*  48 */     this.maintenanceMode = maintenanceMode;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterMaintenanceMode getMaintenanceMode()
/*     */   {
/*  84 */     return this.maintenanceMode;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMaintenanceMode(ClusterMaintenanceMode value)
/*     */   {
/*  96 */     this.maintenanceMode = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof StartClusterMaintenance)) {
/* 107 */       return false;
/*     */     }
/* 109 */     StartClusterMaintenance otherObj = (StartClusterMaintenance)obj;
/*     */     
/* 111 */     return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.maintenanceMode != null ? this.maintenanceMode.equals(otherObj.maintenanceMode) : this.maintenanceMode == otherObj.maintenanceMode);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.maintenanceMode != null ? this.maintenanceMode.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "StartClusterMaintenance [cluster=" + this.cluster + ", " + "maintenanceMode=" + this.maintenanceMode + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\StartClusterMaintenance.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */