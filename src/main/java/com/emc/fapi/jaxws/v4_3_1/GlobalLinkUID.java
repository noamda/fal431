/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
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
/*     */ @XmlType(name="GlobalLinkUID", propOrder={"firstCluster", "secondCluster"})
/*     */ public class GlobalLinkUID
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ClusterUID firstCluster;
/*     */   @XmlElement(required=true)
/*     */   protected ClusterUID secondCluster;
/*     */   
/*     */   public GlobalLinkUID() {}
/*     */   
/*     */   public GlobalLinkUID(ClusterUID firstCluster, ClusterUID secondCluster)
/*     */   {
/*  50 */     this.firstCluster = firstCluster;
/*  51 */     this.secondCluster = secondCluster;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterUID getFirstCluster()
/*     */   {
/*  63 */     return this.firstCluster;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFirstCluster(ClusterUID value)
/*     */   {
/*  75 */     this.firstCluster = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterUID getSecondCluster()
/*     */   {
/*  87 */     return this.secondCluster;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSecondCluster(ClusterUID value)
/*     */   {
/*  99 */     this.secondCluster = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof GlobalLinkUID)) {
/* 110 */       return false;
/*     */     }
/* 112 */     GlobalLinkUID otherObj = (GlobalLinkUID)obj;
/*     */     
/* 114 */     return (this.firstCluster != null ? this.firstCluster.equals(otherObj.firstCluster) : this.firstCluster == otherObj.firstCluster) && (this.secondCluster != null ? this.secondCluster.equals(otherObj.secondCluster) : this.secondCluster == otherObj.secondCluster);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.firstCluster != null ? this.firstCluster.hashCode() : 0) ^ (this.secondCluster != null ? this.secondCluster.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "GlobalLinkUID [firstCluster=" + this.firstCluster + ", " + "secondCluster=" + this.secondCluster + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GlobalLinkUID.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */