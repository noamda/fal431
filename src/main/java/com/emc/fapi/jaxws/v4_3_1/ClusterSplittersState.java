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
/*     */ @XmlType(name="ClusterSplittersState", propOrder={"clusterUID", "splittersState"})
/*     */ public class ClusterSplittersState
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SplitterState> splittersState;
/*     */   
/*     */   public ClusterSplittersState() {}
/*     */   
/*     */   public ClusterSplittersState(ClusterUID clusterUID, List<SplitterState> splittersState)
/*     */   {
/*  52 */     this.clusterUID = clusterUID;
/*  53 */     this.splittersState = splittersState;
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
/*     */   public List<SplitterState> getSplittersState()
/*     */   {
/* 103 */     if (this.splittersState == null) {
/* 104 */       this.splittersState = new ArrayList();
/*     */     }
/* 106 */     return this.splittersState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 116 */     if (!(obj instanceof ClusterSplittersState)) {
/* 117 */       return false;
/*     */     }
/* 119 */     ClusterSplittersState otherObj = (ClusterSplittersState)obj;
/*     */     
/* 121 */     return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.splittersState != null ? this.splittersState.equals(otherObj.splittersState) : this.splittersState == otherObj.splittersState);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 131 */     return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.splittersState != null ? this.splittersState.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 141 */     return "ClusterSplittersState [clusterUID=" + this.clusterUID + ", " + "splittersState=" + this.splittersState + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClusterSplittersState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */