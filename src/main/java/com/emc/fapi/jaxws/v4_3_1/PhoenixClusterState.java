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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="PhoenixClusterState", propOrder={"availableDisk", "cluster", "clusterName", "diskCapacity", "status"})
/*     */ public class PhoenixClusterState
/*     */ {
/*     */   protected Long availableDisk;
/*     */   protected ClusterUID cluster;
/*     */   protected String clusterName;
/*     */   protected long diskCapacity;
/*     */   protected PhoenixClusterStatus status;
/*     */   
/*     */   public PhoenixClusterState() {}
/*     */   
/*     */   public PhoenixClusterState(Long availableDisk, ClusterUID cluster, String clusterName, long diskCapacity, PhoenixClusterStatus status)
/*     */   {
/*  56 */     this.availableDisk = availableDisk;
/*  57 */     this.cluster = cluster;
/*  58 */     this.clusterName = clusterName;
/*  59 */     this.diskCapacity = diskCapacity;
/*  60 */     this.status = status;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getAvailableDisk()
/*     */   {
/*  72 */     return this.availableDisk;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAvailableDisk(Long value)
/*     */   {
/*  84 */     this.availableDisk = value;
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
/*  96 */     return this.cluster;
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
/* 108 */     this.cluster = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getClusterName()
/*     */   {
/* 120 */     return this.clusterName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setClusterName(String value)
/*     */   {
/* 132 */     this.clusterName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getDiskCapacity()
/*     */   {
/* 140 */     return this.diskCapacity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDiskCapacity(long value)
/*     */   {
/* 148 */     this.diskCapacity = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public PhoenixClusterStatus getStatus()
/*     */   {
/* 160 */     return this.status;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStatus(PhoenixClusterStatus value)
/*     */   {
/* 172 */     this.status = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 182 */     if (!(obj instanceof PhoenixClusterState)) {
/* 183 */       return false;
/*     */     }
/* 185 */     PhoenixClusterState otherObj = (PhoenixClusterState)obj;
/*     */     
/* 187 */     return (this.availableDisk != null ? this.availableDisk.equals(otherObj.availableDisk) : this.availableDisk == otherObj.availableDisk) && (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.clusterName != null ? this.clusterName.equals(otherObj.clusterName) : this.clusterName == otherObj.clusterName) && (this.diskCapacity == otherObj.diskCapacity) && (this.status != null ? this.status.equals(otherObj.status) : this.status == otherObj.status);
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
/*     */   public int hashCode()
/*     */   {
/* 200 */     return (this.availableDisk != null ? this.availableDisk.hashCode() : 0) ^ (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.clusterName != null ? this.clusterName.hashCode() : 0) ^ (int)this.diskCapacity ^ (this.status != null ? this.status.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 213 */     return "PhoenixClusterState [availableDisk=" + this.availableDisk + ", " + "cluster=" + this.cluster + ", " + "clusterName=" + this.clusterName + ", " + "diskCapacity=" + this.diskCapacity + ", " + "status=" + this.status + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\PhoenixClusterState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */