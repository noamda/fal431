/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
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
/*     */ @XmlType(name="VmReplicationCandidateClusters", propOrder={"nonCandidateClustersReasons", "replicationCandidateClusters"})
/*     */ public class VmReplicationCandidateClusters
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VmReplicationNonCandidateClusterReasons> nonCandidateClustersReasons;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VmReplicationCandidateCluster> replicationCandidateClusters;
/*     */   
/*     */   public VmReplicationCandidateClusters() {}
/*     */   
/*     */   public VmReplicationCandidateClusters(List<VmReplicationNonCandidateClusterReasons> nonCandidateClustersReasons, List<VmReplicationCandidateCluster> replicationCandidateClusters)
/*     */   {
/*  52 */     this.nonCandidateClustersReasons = nonCandidateClustersReasons;
/*  53 */     this.replicationCandidateClusters = replicationCandidateClusters;
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
/*     */   public List<VmReplicationNonCandidateClusterReasons> getNonCandidateClustersReasons()
/*     */   {
/*  79 */     if (this.nonCandidateClustersReasons == null) {
/*  80 */       this.nonCandidateClustersReasons = new ArrayList();
/*     */     }
/*  82 */     return this.nonCandidateClustersReasons;
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
/*     */   public List<VmReplicationCandidateCluster> getReplicationCandidateClusters()
/*     */   {
/* 108 */     if (this.replicationCandidateClusters == null) {
/* 109 */       this.replicationCandidateClusters = new ArrayList();
/*     */     }
/* 111 */     return this.replicationCandidateClusters;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 121 */     if (!(obj instanceof VmReplicationCandidateClusters)) {
/* 122 */       return false;
/*     */     }
/* 124 */     VmReplicationCandidateClusters otherObj = (VmReplicationCandidateClusters)obj;
/*     */     
/* 126 */     return (this.nonCandidateClustersReasons != null ? this.nonCandidateClustersReasons.equals(otherObj.nonCandidateClustersReasons) : this.nonCandidateClustersReasons == otherObj.nonCandidateClustersReasons) && (this.replicationCandidateClusters != null ? this.replicationCandidateClusters.equals(otherObj.replicationCandidateClusters) : this.replicationCandidateClusters == otherObj.replicationCandidateClusters);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 136 */     return (this.nonCandidateClustersReasons != null ? this.nonCandidateClustersReasons.hashCode() : 0) ^ (this.replicationCandidateClusters != null ? this.replicationCandidateClusters.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 146 */     return "VmReplicationCandidateClusters [nonCandidateClustersReasons=" + this.nonCandidateClustersReasons + ", " + "replicationCandidateClusters=" + this.replicationCandidateClusters + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VmReplicationCandidateClusters.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */