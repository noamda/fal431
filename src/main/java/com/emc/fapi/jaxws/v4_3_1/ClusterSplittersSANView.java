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
/*     */ @XmlType(name="ClusterSplittersSANView", propOrder={"clusterUID", "splittersSANView"})
/*     */ public class ClusterSplittersSANView
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SplitterSANView> splittersSANView;
/*     */   
/*     */   public ClusterSplittersSANView() {}
/*     */   
/*     */   public ClusterSplittersSANView(ClusterUID clusterUID, List<SplitterSANView> splittersSANView)
/*     */   {
/*  52 */     this.clusterUID = clusterUID;
/*  53 */     this.splittersSANView = splittersSANView;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterUID getClusterUID()
/*     */   {
/*  65 */     return this.clusterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setClusterUID(ClusterUID value)
/*     */   {
/*  77 */     this.clusterUID = value;
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
/*     */   public List<SplitterSANView> getSplittersSANView()
/*     */   {
/* 103 */     if (this.splittersSANView == null) {
/* 104 */       this.splittersSANView = new ArrayList();
/*     */     }
/* 106 */     return this.splittersSANView;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 116 */     if (!(obj instanceof ClusterSplittersSANView)) {
/* 117 */       return false;
/*     */     }
/* 119 */     ClusterSplittersSANView otherObj = (ClusterSplittersSANView)obj;
/*     */     
/* 121 */     return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.splittersSANView != null ? this.splittersSANView.equals(otherObj.splittersSANView) : this.splittersSANView == otherObj.splittersSANView);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 131 */     return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.splittersSANView != null ? this.splittersSANView.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 141 */     return "ClusterSplittersSANView [clusterUID=" + this.clusterUID + ", " + "splittersSANView=" + this.splittersSANView + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClusterSplittersSANView.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */