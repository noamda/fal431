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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VMReplicationSetParam", propOrder={"replicationSetVms", "virtualHardwareReplicationPolicy", "virtualDisksReplicationPolicy"})
/*     */ public class VMReplicationSetParam
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected List<ReplicatedVMParams> replicationSetVms;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected VirtualHardwareReplicationPolicy virtualHardwareReplicationPolicy;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected VirtualDisksReplicationPolicy virtualDisksReplicationPolicy;
/*     */   
/*     */   public VMReplicationSetParam() {}
/*     */   
/*     */   public VMReplicationSetParam(List<ReplicatedVMParams> replicationSetVms, VirtualHardwareReplicationPolicy virtualHardwareReplicationPolicy, VirtualDisksReplicationPolicy virtualDisksReplicationPolicy)
/*     */   {
/*  56 */     this.replicationSetVms = replicationSetVms;
/*  57 */     this.virtualHardwareReplicationPolicy = virtualHardwareReplicationPolicy;
/*  58 */     this.virtualDisksReplicationPolicy = virtualDisksReplicationPolicy;
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
/*     */   public List<ReplicatedVMParams> getReplicationSetVms()
/*     */   {
/*  84 */     if (this.replicationSetVms == null) {
/*  85 */       this.replicationSetVms = new ArrayList();
/*     */     }
/*  87 */     return this.replicationSetVms;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VirtualHardwareReplicationPolicy getVirtualHardwareReplicationPolicy()
/*     */   {
/*  99 */     return this.virtualHardwareReplicationPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVirtualHardwareReplicationPolicy(VirtualHardwareReplicationPolicy value)
/*     */   {
/* 111 */     this.virtualHardwareReplicationPolicy = value;
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
/* 123 */     return this.virtualDisksReplicationPolicy;
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
/* 135 */     this.virtualDisksReplicationPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 145 */     if (!(obj instanceof VMReplicationSetParam)) {
/* 146 */       return false;
/*     */     }
/* 148 */     VMReplicationSetParam otherObj = (VMReplicationSetParam)obj;
/*     */     
/* 150 */     return (this.replicationSetVms != null ? this.replicationSetVms.equals(otherObj.replicationSetVms) : this.replicationSetVms == otherObj.replicationSetVms) && (this.virtualHardwareReplicationPolicy != null ? this.virtualHardwareReplicationPolicy.equals(otherObj.virtualHardwareReplicationPolicy) : this.virtualHardwareReplicationPolicy == otherObj.virtualHardwareReplicationPolicy) && (this.virtualDisksReplicationPolicy != null ? this.virtualDisksReplicationPolicy.equals(otherObj.virtualDisksReplicationPolicy) : this.virtualDisksReplicationPolicy == otherObj.virtualDisksReplicationPolicy);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 161 */     return (this.replicationSetVms != null ? this.replicationSetVms.hashCode() : 0) ^ (this.virtualHardwareReplicationPolicy != null ? this.virtualHardwareReplicationPolicy.hashCode() : 0) ^ (this.virtualDisksReplicationPolicy != null ? this.virtualDisksReplicationPolicy.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 172 */     return "VMReplicationSetParam [replicationSetVms=" + this.replicationSetVms + ", " + "virtualHardwareReplicationPolicy=" + this.virtualHardwareReplicationPolicy + ", " + "virtualDisksReplicationPolicy=" + this.virtualDisksReplicationPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VMReplicationSetParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */