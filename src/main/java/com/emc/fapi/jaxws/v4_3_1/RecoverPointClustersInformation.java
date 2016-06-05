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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="RecoverPointClustersInformation", propOrder={"clustersInformation"})
/*     */ public class RecoverPointClustersInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClusterInfo> clustersInformation;
/*     */   
/*     */   public RecoverPointClustersInformation() {}
/*     */   
/*     */   public RecoverPointClustersInformation(List<ClusterInfo> clustersInformation)
/*     */   {
/*  48 */     this.clustersInformation = clustersInformation;
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
/*     */   public List<ClusterInfo> getClustersInformation()
/*     */   {
/*  74 */     if (this.clustersInformation == null) {
/*  75 */       this.clustersInformation = new ArrayList();
/*     */     }
/*  77 */     return this.clustersInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof RecoverPointClustersInformation)) {
/*  88 */       return false;
/*     */     }
/*  90 */     RecoverPointClustersInformation otherObj = (RecoverPointClustersInformation)obj;
/*     */     
/*  92 */     return this.clustersInformation == otherObj.clustersInformation ? true : this.clustersInformation != null ? this.clustersInformation.equals(otherObj.clustersInformation) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.clustersInformation != null ? this.clustersInformation.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "RecoverPointClustersInformation [clustersInformation=" + this.clustersInformation + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RecoverPointClustersInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */