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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VmReplicationTarget", propOrder={"targetClusterUID", "targetVirtualCenterUID", "targetDatacenterUID", "targetEsxClusterUID"})
/*     */ public class VmReplicationTarget
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ClusterUID targetClusterUID;
/*     */   @XmlElement(required=true)
/*     */   protected VirtualCenterUID targetVirtualCenterUID;
/*     */   @XmlElement(required=true)
/*     */   protected DatacenterUID targetDatacenterUID;
/*     */   @XmlElement(required=true)
/*     */   protected EsxClusterUID targetEsxClusterUID;
/*     */   
/*     */   public VmReplicationTarget() {}
/*     */   
/*     */   public VmReplicationTarget(ClusterUID targetClusterUID, VirtualCenterUID targetVirtualCenterUID, DatacenterUID targetDatacenterUID, EsxClusterUID targetEsxClusterUID)
/*     */   {
/*  58 */     this.targetClusterUID = targetClusterUID;
/*  59 */     this.targetVirtualCenterUID = targetVirtualCenterUID;
/*  60 */     this.targetDatacenterUID = targetDatacenterUID;
/*  61 */     this.targetEsxClusterUID = targetEsxClusterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterUID getTargetClusterUID()
/*     */   {
/*  73 */     return this.targetClusterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTargetClusterUID(ClusterUID value)
/*     */   {
/*  85 */     this.targetClusterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VirtualCenterUID getTargetVirtualCenterUID()
/*     */   {
/*  97 */     return this.targetVirtualCenterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTargetVirtualCenterUID(VirtualCenterUID value)
/*     */   {
/* 109 */     this.targetVirtualCenterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DatacenterUID getTargetDatacenterUID()
/*     */   {
/* 121 */     return this.targetDatacenterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTargetDatacenterUID(DatacenterUID value)
/*     */   {
/* 133 */     this.targetDatacenterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public EsxClusterUID getTargetEsxClusterUID()
/*     */   {
/* 145 */     return this.targetEsxClusterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTargetEsxClusterUID(EsxClusterUID value)
/*     */   {
/* 157 */     this.targetEsxClusterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 167 */     if (!(obj instanceof VmReplicationTarget)) {
/* 168 */       return false;
/*     */     }
/* 170 */     VmReplicationTarget otherObj = (VmReplicationTarget)obj;
/*     */     
/* 172 */     return (this.targetClusterUID != null ? this.targetClusterUID.equals(otherObj.targetClusterUID) : this.targetClusterUID == otherObj.targetClusterUID) && (this.targetVirtualCenterUID != null ? this.targetVirtualCenterUID.equals(otherObj.targetVirtualCenterUID) : this.targetVirtualCenterUID == otherObj.targetVirtualCenterUID) && (this.targetDatacenterUID != null ? this.targetDatacenterUID.equals(otherObj.targetDatacenterUID) : this.targetDatacenterUID == otherObj.targetDatacenterUID) && (this.targetEsxClusterUID != null ? this.targetEsxClusterUID.equals(otherObj.targetEsxClusterUID) : this.targetEsxClusterUID == otherObj.targetEsxClusterUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 184 */     return (this.targetClusterUID != null ? this.targetClusterUID.hashCode() : 0) ^ (this.targetVirtualCenterUID != null ? this.targetVirtualCenterUID.hashCode() : 0) ^ (this.targetDatacenterUID != null ? this.targetDatacenterUID.hashCode() : 0) ^ (this.targetEsxClusterUID != null ? this.targetEsxClusterUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 196 */     return "VmReplicationTarget [targetClusterUID=" + this.targetClusterUID + ", " + "targetVirtualCenterUID=" + this.targetVirtualCenterUID + ", " + "targetDatacenterUID=" + this.targetDatacenterUID + ", " + "targetEsxClusterUID=" + this.targetEsxClusterUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VmReplicationTarget.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */