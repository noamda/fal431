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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="getVirtualEntitiesInformationFromClusters", propOrder={"clusters"})
/*     */ public class GetVirtualEntitiesInformationFromClusters
/*     */ {
/*     */   protected List<ClusterUID> clusters;
/*     */   
/*     */   public GetVirtualEntitiesInformationFromClusters() {}
/*     */   
/*     */   public GetVirtualEntitiesInformationFromClusters(List<ClusterUID> clusters)
/*     */   {
/*  46 */     this.clusters = clusters;
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
/*     */   public List<ClusterUID> getClusters()
/*     */   {
/*  72 */     if (this.clusters == null) {
/*  73 */       this.clusters = new ArrayList();
/*     */     }
/*  75 */     return this.clusters;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  85 */     if (!(obj instanceof GetVirtualEntitiesInformationFromClusters)) {
/*  86 */       return false;
/*     */     }
/*  88 */     GetVirtualEntitiesInformationFromClusters otherObj = (GetVirtualEntitiesInformationFromClusters)obj;
/*     */     
/*  90 */     return this.clusters == otherObj.clusters ? true : this.clusters != null ? this.clusters.equals(otherObj.clusters) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  99 */     return this.clusters != null ? this.clusters.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 108 */     return "GetVirtualEntitiesInformationFromClusters [clusters=" + this.clusters + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetVirtualEntitiesInformationFromClusters.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */