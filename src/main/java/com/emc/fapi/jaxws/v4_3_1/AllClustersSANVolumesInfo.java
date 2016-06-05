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
/*     */ @XmlType(name="AllClustersSANVolumesInfo", propOrder={"clustersSanVols"})
/*     */ public class AllClustersSANVolumesInfo
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClusterSANVolumes> clustersSanVols;
/*     */   
/*     */   public AllClustersSANVolumesInfo() {}
/*     */   
/*     */   public AllClustersSANVolumesInfo(List<ClusterSANVolumes> clustersSanVols)
/*     */   {
/*  48 */     this.clustersSanVols = clustersSanVols;
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
/*     */   public List<ClusterSANVolumes> getClustersSanVols()
/*     */   {
/*  74 */     if (this.clustersSanVols == null) {
/*  75 */       this.clustersSanVols = new ArrayList();
/*     */     }
/*  77 */     return this.clustersSanVols;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof AllClustersSANVolumesInfo)) {
/*  88 */       return false;
/*     */     }
/*  90 */     AllClustersSANVolumesInfo otherObj = (AllClustersSANVolumesInfo)obj;
/*     */     
/*  92 */     return this.clustersSanVols == otherObj.clustersSanVols ? true : this.clustersSanVols != null ? this.clustersSanVols.equals(otherObj.clustersSanVols) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.clustersSanVols != null ? this.clustersSanVols.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "AllClustersSANVolumesInfo [clustersSanVols=" + this.clustersSanVols + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AllClustersSANVolumesInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */