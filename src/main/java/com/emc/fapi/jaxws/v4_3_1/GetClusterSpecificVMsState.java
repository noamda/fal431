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
/*     */ @XmlType(name="getClusterSpecificVMsState", propOrder={"clusterUID", "vmUIDs"})
/*     */ public class GetClusterSpecificVMsState
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   protected List<VmUID> vmUIDs;
/*     */   
/*     */   public GetClusterSpecificVMsState() {}
/*     */   
/*     */   public GetClusterSpecificVMsState(ClusterUID clusterUID, List<VmUID> vmUIDs)
/*     */   {
/*  51 */     this.clusterUID = clusterUID;
/*  52 */     this.vmUIDs = vmUIDs;
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
/*  64 */     return this.clusterUID;
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
/*  76 */     this.clusterUID = value;
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
/*     */   public List<VmUID> getVmUIDs()
/*     */   {
/* 102 */     if (this.vmUIDs == null) {
/* 103 */       this.vmUIDs = new ArrayList();
/*     */     }
/* 105 */     return this.vmUIDs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 115 */     if (!(obj instanceof GetClusterSpecificVMsState)) {
/* 116 */       return false;
/*     */     }
/* 118 */     GetClusterSpecificVMsState otherObj = (GetClusterSpecificVMsState)obj;
/*     */     
/* 120 */     return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.vmUIDs != null ? this.vmUIDs.equals(otherObj.vmUIDs) : this.vmUIDs == otherObj.vmUIDs);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 130 */     return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.vmUIDs != null ? this.vmUIDs.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 140 */     return "GetClusterSpecificVMsState [clusterUID=" + this.clusterUID + ", " + "vmUIDs=" + this.vmUIDs + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetClusterSpecificVMsState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */