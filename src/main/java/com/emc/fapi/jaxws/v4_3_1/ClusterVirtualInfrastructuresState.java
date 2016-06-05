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
/*     */ @XmlType(name="ClusterVirtualInfrastructuresState", propOrder={"clusterUID", "virtualInfrastructuresState"})
/*     */ public class ClusterVirtualInfrastructuresState
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected VirtualInfrastructuresState virtualInfrastructuresState;
/*     */   
/*     */   public ClusterVirtualInfrastructuresState() {}
/*     */   
/*     */   public ClusterVirtualInfrastructuresState(ClusterUID clusterUID, VirtualInfrastructuresState virtualInfrastructuresState)
/*     */   {
/*  50 */     this.clusterUID = clusterUID;
/*  51 */     this.virtualInfrastructuresState = virtualInfrastructuresState;
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
/*     */   public VirtualInfrastructuresState getVirtualInfrastructuresState()
/*     */   {
/*  87 */     return this.virtualInfrastructuresState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVirtualInfrastructuresState(VirtualInfrastructuresState value)
/*     */   {
/*  99 */     this.virtualInfrastructuresState = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof ClusterVirtualInfrastructuresState)) {
/* 110 */       return false;
/*     */     }
/* 112 */     ClusterVirtualInfrastructuresState otherObj = (ClusterVirtualInfrastructuresState)obj;
/*     */     
/* 114 */     return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.virtualInfrastructuresState != null ? this.virtualInfrastructuresState.equals(otherObj.virtualInfrastructuresState) : this.virtualInfrastructuresState == otherObj.virtualInfrastructuresState);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.virtualInfrastructuresState != null ? this.virtualInfrastructuresState.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "ClusterVirtualInfrastructuresState [clusterUID=" + this.clusterUID + ", " + "virtualInfrastructuresState=" + this.virtualInfrastructuresState + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClusterVirtualInfrastructuresState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */