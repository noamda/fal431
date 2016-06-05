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
/*     */ @XmlType(name="getCandidateEsxClustersForAddition", propOrder={"cluster", "vcUID"})
/*     */ public class GetCandidateEsxClustersForAddition
/*     */ {
/*     */   protected ClusterUID cluster;
/*     */   protected VirtualCenterUID vcUID;
/*     */   
/*     */   public GetCandidateEsxClustersForAddition() {}
/*     */   
/*     */   public GetCandidateEsxClustersForAddition(ClusterUID cluster, VirtualCenterUID vcUID)
/*     */   {
/*  47 */     this.cluster = cluster;
/*  48 */     this.vcUID = vcUID;
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
/*     */   public VirtualCenterUID getVcUID()
/*     */   {
/*  84 */     return this.vcUID;
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
/*  96 */     this.vcUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof GetCandidateEsxClustersForAddition)) {
/* 107 */       return false;
/*     */     }
/* 109 */     GetCandidateEsxClustersForAddition otherObj = (GetCandidateEsxClustersForAddition)obj;
/*     */     
/* 111 */     return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.vcUID != null ? this.vcUID.equals(otherObj.vcUID) : this.vcUID == otherObj.vcUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.vcUID != null ? this.vcUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "GetCandidateEsxClustersForAddition [cluster=" + this.cluster + ", " + "vcUID=" + this.vcUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetCandidateEsxClustersForAddition.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */