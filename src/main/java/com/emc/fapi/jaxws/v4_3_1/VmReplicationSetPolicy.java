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
/*     */ @XmlType(name="VmReplicationSetPolicy", propOrder={"powerUpSequenceNumber", "critical", "virtualHardwareReplicationPolicy", "startUpActionsPolicy"})
/*     */ public class VmReplicationSetPolicy
/*     */ {
/*     */   protected int powerUpSequenceNumber;
/*     */   protected boolean critical;
/*     */   @XmlElement(nillable=true)
/*     */   protected VirtualHardwareReplicationPolicy virtualHardwareReplicationPolicy;
/*     */   protected VmStartUpActionsPolicy startUpActionsPolicy;
/*     */   
/*     */   public VmReplicationSetPolicy() {}
/*     */   
/*     */   public VmReplicationSetPolicy(int powerUpSequenceNumber, boolean critical, VirtualHardwareReplicationPolicy virtualHardwareReplicationPolicy, VmStartUpActionsPolicy startUpActionsPolicy)
/*     */   {
/*  55 */     this.powerUpSequenceNumber = powerUpSequenceNumber;
/*  56 */     this.critical = critical;
/*  57 */     this.virtualHardwareReplicationPolicy = virtualHardwareReplicationPolicy;
/*  58 */     this.startUpActionsPolicy = startUpActionsPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getPowerUpSequenceNumber()
/*     */   {
/*  66 */     return this.powerUpSequenceNumber;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPowerUpSequenceNumber(int value)
/*     */   {
/*  74 */     this.powerUpSequenceNumber = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isCritical()
/*     */   {
/*  82 */     return this.critical;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCritical(boolean value)
/*     */   {
/*  90 */     this.critical = value;
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
/* 102 */     return this.virtualHardwareReplicationPolicy;
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
/* 114 */     this.virtualHardwareReplicationPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmStartUpActionsPolicy getStartUpActionsPolicy()
/*     */   {
/* 126 */     return this.startUpActionsPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStartUpActionsPolicy(VmStartUpActionsPolicy value)
/*     */   {
/* 138 */     this.startUpActionsPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 148 */     if (!(obj instanceof VmReplicationSetPolicy)) {
/* 149 */       return false;
/*     */     }
/* 151 */     VmReplicationSetPolicy otherObj = (VmReplicationSetPolicy)obj;
/*     */     
/* 153 */     return (this.powerUpSequenceNumber == otherObj.powerUpSequenceNumber) && (this.critical == otherObj.critical) && (this.virtualHardwareReplicationPolicy != null ? this.virtualHardwareReplicationPolicy.equals(otherObj.virtualHardwareReplicationPolicy) : this.virtualHardwareReplicationPolicy == otherObj.virtualHardwareReplicationPolicy) && (this.startUpActionsPolicy != null ? this.startUpActionsPolicy.equals(otherObj.startUpActionsPolicy) : this.startUpActionsPolicy == otherObj.startUpActionsPolicy);
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
/* 165 */     return this.powerUpSequenceNumber ^ (this.critical ? 1 : 0) ^ (this.virtualHardwareReplicationPolicy != null ? this.virtualHardwareReplicationPolicy.hashCode() : 0) ^ (this.startUpActionsPolicy != null ? this.startUpActionsPolicy.hashCode() : 0);
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
/* 177 */     return "VmReplicationSetPolicy [powerUpSequenceNumber=" + this.powerUpSequenceNumber + ", " + "critical=" + this.critical + ", " + "virtualHardwareReplicationPolicy=" + this.virtualHardwareReplicationPolicy + ", " + "startUpActionsPolicy=" + this.startUpActionsPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VmReplicationSetPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */