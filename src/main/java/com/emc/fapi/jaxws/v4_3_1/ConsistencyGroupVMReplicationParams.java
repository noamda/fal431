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
/*     */ @XmlType(name="ConsistencyGroupVMReplicationParams", propOrder={"groupUID", "virtualDisksReplicationPolicyParams"})
/*     */ public class ConsistencyGroupVMReplicationParams
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupUID groupUID;
/*     */   @XmlElement(required=true)
/*     */   protected List<VirtualDisksReplicationPolicyParam> virtualDisksReplicationPolicyParams;
/*     */   
/*     */   public ConsistencyGroupVMReplicationParams() {}
/*     */   
/*     */   public ConsistencyGroupVMReplicationParams(ConsistencyGroupUID groupUID, List<VirtualDisksReplicationPolicyParam> virtualDisksReplicationPolicyParams)
/*     */   {
/*  52 */     this.groupUID = groupUID;
/*  53 */     this.virtualDisksReplicationPolicyParams = virtualDisksReplicationPolicyParams;
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
/*     */   public List<VirtualDisksReplicationPolicyParam> getVirtualDisksReplicationPolicyParams()
/*     */   {
/* 103 */     if (this.virtualDisksReplicationPolicyParams == null) {
/* 104 */       this.virtualDisksReplicationPolicyParams = new ArrayList();
/*     */     }
/* 106 */     return this.virtualDisksReplicationPolicyParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 116 */     if (!(obj instanceof ConsistencyGroupVMReplicationParams)) {
/* 117 */       return false;
/*     */     }
/* 119 */     ConsistencyGroupVMReplicationParams otherObj = (ConsistencyGroupVMReplicationParams)obj;
/*     */     
/* 121 */     return (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.virtualDisksReplicationPolicyParams != null ? this.virtualDisksReplicationPolicyParams.equals(otherObj.virtualDisksReplicationPolicyParams) : this.virtualDisksReplicationPolicyParams == otherObj.virtualDisksReplicationPolicyParams);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 131 */     return (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (this.virtualDisksReplicationPolicyParams != null ? this.virtualDisksReplicationPolicyParams.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 141 */     return "ConsistencyGroupVMReplicationParams [groupUID=" + this.groupUID + ", " + "virtualDisksReplicationPolicyParams=" + this.virtualDisksReplicationPolicyParams + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupVMReplicationParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */