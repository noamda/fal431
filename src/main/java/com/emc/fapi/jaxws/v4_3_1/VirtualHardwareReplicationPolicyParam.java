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
/*     */ @XmlType(name="VirtualHardwareReplicationPolicyParam", propOrder={"vmReplicationSetUID", "virtualDisksReplicationPolicy"})
/*     */ public class VirtualHardwareReplicationPolicyParam
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected VmReplicationSetUID vmReplicationSetUID;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected VirtualHardwareReplicationPolicy virtualDisksReplicationPolicy;
/*     */   
/*     */   public VirtualHardwareReplicationPolicyParam() {}
/*     */   
/*     */   public VirtualHardwareReplicationPolicyParam(VmReplicationSetUID vmReplicationSetUID, VirtualHardwareReplicationPolicy virtualDisksReplicationPolicy)
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
/*     */   public VirtualHardwareReplicationPolicy getVirtualDisksReplicationPolicy()
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
/*     */   public void setVirtualDisksReplicationPolicy(VirtualHardwareReplicationPolicy value)
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
/* 109 */     if (!(obj instanceof VirtualHardwareReplicationPolicyParam)) {
/* 110 */       return false;
/*     */     }
/* 112 */     VirtualHardwareReplicationPolicyParam otherObj = (VirtualHardwareReplicationPolicyParam)obj;
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
/* 134 */     return "VirtualHardwareReplicationPolicyParam [vmReplicationSetUID=" + this.vmReplicationSetUID + ", " + "virtualDisksReplicationPolicy=" + this.virtualDisksReplicationPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VirtualHardwareReplicationPolicyParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */