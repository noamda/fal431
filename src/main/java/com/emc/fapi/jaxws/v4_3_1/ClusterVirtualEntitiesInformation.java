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
/*     */ @XmlType(name="ClusterVirtualEntitiesInformation", propOrder={"clusterUID", "virtualCentersEntitiesInformation"})
/*     */ public class ClusterVirtualEntitiesInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VirtualCenterEntitiesInformation> virtualCentersEntitiesInformation;
/*     */   
/*     */   public ClusterVirtualEntitiesInformation() {}
/*     */   
/*     */   public ClusterVirtualEntitiesInformation(ClusterUID clusterUID, List<VirtualCenterEntitiesInformation> virtualCentersEntitiesInformation)
/*     */   {
/*  52 */     this.clusterUID = clusterUID;
/*  53 */     this.virtualCentersEntitiesInformation = virtualCentersEntitiesInformation;
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
/*     */   public List<VirtualCenterEntitiesInformation> getVirtualCentersEntitiesInformation()
/*     */   {
/* 103 */     if (this.virtualCentersEntitiesInformation == null) {
/* 104 */       this.virtualCentersEntitiesInformation = new ArrayList();
/*     */     }
/* 106 */     return this.virtualCentersEntitiesInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 116 */     if (!(obj instanceof ClusterVirtualEntitiesInformation)) {
/* 117 */       return false;
/*     */     }
/* 119 */     ClusterVirtualEntitiesInformation otherObj = (ClusterVirtualEntitiesInformation)obj;
/*     */     
/* 121 */     return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.virtualCentersEntitiesInformation != null ? this.virtualCentersEntitiesInformation.equals(otherObj.virtualCentersEntitiesInformation) : this.virtualCentersEntitiesInformation == otherObj.virtualCentersEntitiesInformation);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 131 */     return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.virtualCentersEntitiesInformation != null ? this.virtualCentersEntitiesInformation.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 141 */     return "ClusterVirtualEntitiesInformation [clusterUID=" + this.clusterUID + ", " + "virtualCentersEntitiesInformation=" + this.virtualCentersEntitiesInformation + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClusterVirtualEntitiesInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */