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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="getClusterVirtualEntitiesInformation", propOrder={"cluster"})
/*     */ public class GetClusterVirtualEntitiesInformation
/*     */ {
/*     */   protected ClusterUID cluster;
/*     */   
/*     */   public GetClusterVirtualEntitiesInformation() {}
/*     */   
/*     */   public GetClusterVirtualEntitiesInformation(ClusterUID cluster)
/*     */   {
/*  44 */     this.cluster = cluster;
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
/*  56 */     return this.cluster;
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
/*  68 */     this.cluster = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof GetClusterVirtualEntitiesInformation)) {
/*  79 */       return false;
/*     */     }
/*  81 */     GetClusterVirtualEntitiesInformation otherObj = (GetClusterVirtualEntitiesInformation)obj;
/*     */     
/*  83 */     return this.cluster == otherObj.cluster ? true : this.cluster != null ? this.cluster.equals(otherObj.cluster) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.cluster != null ? this.cluster.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "GetClusterVirtualEntitiesInformation [cluster=" + this.cluster + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetClusterVirtualEntitiesInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */