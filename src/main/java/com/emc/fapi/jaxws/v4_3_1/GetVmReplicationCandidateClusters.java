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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="getVmReplicationCandidateClusters", propOrder={"cluster", "existingVmsParams"})
/*     */ public class GetVmReplicationCandidateClusters
/*     */ {
/*     */   protected ClusterUID cluster;
/*     */   protected List<ExistingVMParam> existingVmsParams;
/*     */   
/*     */   public GetVmReplicationCandidateClusters() {}
/*     */   
/*     */   public GetVmReplicationCandidateClusters(ClusterUID cluster, List<ExistingVMParam> existingVmsParams)
/*     */   {
/*  49 */     this.cluster = cluster;
/*  50 */     this.existingVmsParams = existingVmsParams;
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
/*  62 */     return this.cluster;
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
/*  74 */     this.cluster = value;
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
/*     */   public List<ExistingVMParam> getExistingVmsParams()
/*     */   {
/* 100 */     if (this.existingVmsParams == null) {
/* 101 */       this.existingVmsParams = new ArrayList();
/*     */     }
/* 103 */     return this.existingVmsParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 113 */     if (!(obj instanceof GetVmReplicationCandidateClusters)) {
/* 114 */       return false;
/*     */     }
/* 116 */     GetVmReplicationCandidateClusters otherObj = (GetVmReplicationCandidateClusters)obj;
/*     */     
/* 118 */     return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.existingVmsParams != null ? this.existingVmsParams.equals(otherObj.existingVmsParams) : this.existingVmsParams == otherObj.existingVmsParams);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 128 */     return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.existingVmsParams != null ? this.existingVmsParams.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 138 */     return "GetVmReplicationCandidateClusters [cluster=" + this.cluster + ", " + "existingVmsParams=" + this.existingVmsParams + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetVmReplicationCandidateClusters.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */