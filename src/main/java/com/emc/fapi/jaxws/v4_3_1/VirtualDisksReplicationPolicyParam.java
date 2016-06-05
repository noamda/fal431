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
/*     */ @XmlType(name="VirtualDisksReplicationPolicyParam", propOrder={"vmReplicationSetUID", "virtualDisksReplicationPolicy"})
/*     */ public class VirtualDisksReplicationPolicyParam
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected VmReplicationSetUID vmReplicationSetUID;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected VirtualDisksReplicationPolicy virtualDisksReplicationPolicy;
/*     */   
/*     */   public VirtualDisksReplicationPolicyParam() {}
/*     */   
/*     */   public VirtualDisksReplicationPolicyParam(VmReplicationSetUID vmReplicationSetUID, VirtualDisksReplicationPolicy virtualDisksReplicationPolicy)
/*     */   {
/*  50 */     this.vmReplicationSetUID = vmReplicationSetUID;
/*  51 */     this.virtualDisksReplicationPolicy = virtualDisksReplicationPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmReplicationSetUID getVmReplicationSetUID()
/*     */   {
/*  63 */     return this.vmReplicationSetUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmReplicationSetUID(VmReplicationSetUID value)
/*     */   {
/*  75 */     this.vmReplicationSetUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VirtualDisksReplicationPolicy getVirtualDisksReplicationPolicy()
/*     */   {
/*  87 */     return this.virtualDisksReplicationPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVirtualDisksReplicationPolicy(VirtualDisksReplicationPolicy value)
/*     */   {
/*  99 */     this.virtualDisksReplicationPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof VirtualDisksReplicationPolicyParam)) {
/* 110 */       return false;
/*     */     }
/* 112 */     VirtualDisksReplicationPolicyParam otherObj = (VirtualDisksReplicationPolicyParam)obj;
/*     */     
/* 114 */     return (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.equals(otherObj.vmReplicationSetUID) : this.vmReplicationSetUID == otherObj.vmReplicationSetUID) && (this.virtualDisksReplicationPolicy != null ? this.virtualDisksReplicationPolicy.equals(otherObj.virtualDisksReplicationPolicy) : this.virtualDisksReplicationPolicy == otherObj.virtualDisksReplicationPolicy);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.hashCode() : 0) ^ (this.virtualDisksReplicationPolicy != null ? this.virtualDisksReplicationPolicy.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "VirtualDisksReplicationPolicyParam [vmReplicationSetUID=" + this.vmReplicationSetUID + ", " + "virtualDisksReplicationPolicy=" + this.virtualDisksReplicationPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VirtualDisksReplicationPolicyParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */