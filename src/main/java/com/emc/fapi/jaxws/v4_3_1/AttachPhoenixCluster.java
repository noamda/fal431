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
/*     */ @XmlType(name="attachPhoenixCluster", propOrder={"cluster", "phoenixClusterName"})
/*     */ public class AttachPhoenixCluster
/*     */ {
/*     */   protected ClusterUID cluster;
/*     */   protected String phoenixClusterName;
/*     */   
/*     */   public AttachPhoenixCluster() {}
/*     */   
/*     */   public AttachPhoenixCluster(ClusterUID cluster, String phoenixClusterName)
/*     */   {
/*  47 */     this.cluster = cluster;
/*  48 */     this.phoenixClusterName = phoenixClusterName;
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
/*     */   public String getPhoenixClusterName()
/*     */   {
/*  84 */     return this.phoenixClusterName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPhoenixClusterName(String value)
/*     */   {
/*  96 */     this.phoenixClusterName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof AttachPhoenixCluster)) {
/* 107 */       return false;
/*     */     }
/* 109 */     AttachPhoenixCluster otherObj = (AttachPhoenixCluster)obj;
/*     */     
/* 111 */     return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.phoenixClusterName != null ? this.phoenixClusterName.equals(otherObj.phoenixClusterName) : this.phoenixClusterName == otherObj.phoenixClusterName);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.phoenixClusterName != null ? this.phoenixClusterName.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "AttachPhoenixCluster [cluster=" + this.cluster + ", " + "phoenixClusterName=" + this.phoenixClusterName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AttachPhoenixCluster.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */