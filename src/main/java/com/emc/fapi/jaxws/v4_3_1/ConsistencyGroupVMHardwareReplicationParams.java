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
/*     */ @XmlType(name="ConsistencyGroupVMHardwareReplicationParams", propOrder={"groupUID", "virtualHardwareReplicationPolicyParams"})
/*     */ public class ConsistencyGroupVMHardwareReplicationParams
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupUID groupUID;
/*     */   @XmlElement(required=true)
/*     */   protected List<VirtualHardwareReplicationPolicyParam> virtualHardwareReplicationPolicyParams;
/*     */   
/*     */   public ConsistencyGroupVMHardwareReplicationParams() {}
/*     */   
/*     */   public ConsistencyGroupVMHardwareReplicationParams(ConsistencyGroupUID groupUID, List<VirtualHardwareReplicationPolicyParam> virtualHardwareReplicationPolicyParams)
/*     */   {
/*  52 */     this.groupUID = groupUID;
/*  53 */     this.virtualHardwareReplicationPolicyParams = virtualHardwareReplicationPolicyParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupUID getGroupUID()
/*     */   {
/*  65 */     return this.groupUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupUID(ConsistencyGroupUID value)
/*     */   {
/*  77 */     this.groupUID = value;
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
/*     */   public List<VirtualHardwareReplicationPolicyParam> getVirtualHardwareReplicationPolicyParams()
/*     */   {
/* 103 */     if (this.virtualHardwareReplicationPolicyParams == null) {
/* 104 */       this.virtualHardwareReplicationPolicyParams = new ArrayList();
/*     */     }
/* 106 */     return this.virtualHardwareReplicationPolicyParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 116 */     if (!(obj instanceof ConsistencyGroupVMHardwareReplicationParams)) {
/* 117 */       return false;
/*     */     }
/* 119 */     ConsistencyGroupVMHardwareReplicationParams otherObj = (ConsistencyGroupVMHardwareReplicationParams)obj;
/*     */     
/* 121 */     return (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.virtualHardwareReplicationPolicyParams != null ? this.virtualHardwareReplicationPolicyParams.equals(otherObj.virtualHardwareReplicationPolicyParams) : this.virtualHardwareReplicationPolicyParams == otherObj.virtualHardwareReplicationPolicyParams);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 131 */     return (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (this.virtualHardwareReplicationPolicyParams != null ? this.virtualHardwareReplicationPolicyParams.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 141 */     return "ConsistencyGroupVMHardwareReplicationParams [groupUID=" + this.groupUID + ", " + "virtualHardwareReplicationPolicyParams=" + this.virtualHardwareReplicationPolicyParams + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupVMHardwareReplicationParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */