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
/*     */ @XmlType(name="SystemVersionState", propOrder={"clustersVersionState", "supportedFeatures"})
/*     */ public class SystemVersionState
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClusterVersionState> clustersVersionState;
/*     */   protected Features supportedFeatures;
/*     */   
/*     */   public SystemVersionState() {}
/*     */   
/*     */   public SystemVersionState(List<ClusterVersionState> clustersVersionState, Features supportedFeatures)
/*     */   {
/*  51 */     this.clustersVersionState = clustersVersionState;
/*  52 */     this.supportedFeatures = supportedFeatures;
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
/*     */   public List<ClusterVersionState> getClustersVersionState()
/*     */   {
/*  78 */     if (this.clustersVersionState == null) {
/*  79 */       this.clustersVersionState = new ArrayList();
/*     */     }
/*  81 */     return this.clustersVersionState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Features getSupportedFeatures()
/*     */   {
/*  93 */     return this.supportedFeatures;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSupportedFeatures(Features value)
/*     */   {
/* 105 */     this.supportedFeatures = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 115 */     if (!(obj instanceof SystemVersionState)) {
/* 116 */       return false;
/*     */     }
/* 118 */     SystemVersionState otherObj = (SystemVersionState)obj;
/*     */     
/* 120 */     return (this.clustersVersionState != null ? this.clustersVersionState.equals(otherObj.clustersVersionState) : this.clustersVersionState == otherObj.clustersVersionState) && (this.supportedFeatures != null ? this.supportedFeatures.equals(otherObj.supportedFeatures) : this.supportedFeatures == otherObj.supportedFeatures);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 130 */     return (this.clustersVersionState != null ? this.clustersVersionState.hashCode() : 0) ^ (this.supportedFeatures != null ? this.supportedFeatures.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 140 */     return "SystemVersionState [clustersVersionState=" + this.clustersVersionState + ", " + "supportedFeatures=" + this.supportedFeatures + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SystemVersionState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */