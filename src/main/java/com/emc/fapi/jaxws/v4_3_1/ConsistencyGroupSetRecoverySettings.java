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
/*     */ @XmlType(name="ConsistencyGroupSetRecoverySettings", propOrder={"clusterUID", "imageAccessScenario"})
/*     */ public class ConsistencyGroupSetRecoverySettings
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected ImageAccessScenario imageAccessScenario;
/*     */   
/*     */   public ConsistencyGroupSetRecoverySettings() {}
/*     */   
/*     */   public ConsistencyGroupSetRecoverySettings(ClusterUID clusterUID, ImageAccessScenario imageAccessScenario)
/*     */   {
/*  50 */     this.clusterUID = clusterUID;
/*  51 */     this.imageAccessScenario = imageAccessScenario;
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
/*  63 */     return this.clusterUID;
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
/*  75 */     this.clusterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ImageAccessScenario getImageAccessScenario()
/*     */   {
/*  87 */     return this.imageAccessScenario;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setImageAccessScenario(ImageAccessScenario value)
/*     */   {
/*  99 */     this.imageAccessScenario = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof ConsistencyGroupSetRecoverySettings)) {
/* 110 */       return false;
/*     */     }
/* 112 */     ConsistencyGroupSetRecoverySettings otherObj = (ConsistencyGroupSetRecoverySettings)obj;
/*     */     
/* 114 */     return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.imageAccessScenario != null ? this.imageAccessScenario.equals(otherObj.imageAccessScenario) : this.imageAccessScenario == otherObj.imageAccessScenario);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.imageAccessScenario != null ? this.imageAccessScenario.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "ConsistencyGroupSetRecoverySettings [clusterUID=" + this.clusterUID + ", " + "imageAccessScenario=" + this.imageAccessScenario + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupSetRecoverySettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */