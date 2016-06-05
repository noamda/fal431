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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VmReplicationSettings", propOrder={"vmUID", "groupCopyUID", "replicationPolicy"})
/*     */ public class VmReplicationSettings
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected VmUID vmUID;
/*     */   protected ConsistencyGroupCopyUID groupCopyUID;
/*     */   protected VmReplicationPolicy replicationPolicy;
/*     */   
/*     */   public VmReplicationSettings() {}
/*     */   
/*     */   public VmReplicationSettings(VmUID vmUID, ConsistencyGroupCopyUID groupCopyUID, VmReplicationPolicy replicationPolicy)
/*     */   {
/*  52 */     this.vmUID = vmUID;
/*  53 */     this.groupCopyUID = groupCopyUID;
/*  54 */     this.replicationPolicy = replicationPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmUID getVmUID()
/*     */   {
/*  66 */     return this.vmUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmUID(VmUID value)
/*     */   {
/*  78 */     this.vmUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getGroupCopyUID()
/*     */   {
/*  90 */     return this.groupCopyUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupCopyUID(ConsistencyGroupCopyUID value)
/*     */   {
/* 102 */     this.groupCopyUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmReplicationPolicy getReplicationPolicy()
/*     */   {
/* 114 */     return this.replicationPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReplicationPolicy(VmReplicationPolicy value)
/*     */   {
/* 126 */     this.replicationPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 136 */     if (!(obj instanceof VmReplicationSettings)) {
/* 137 */       return false;
/*     */     }
/* 139 */     VmReplicationSettings otherObj = (VmReplicationSettings)obj;
/*     */     
/* 141 */     return (this.vmUID != null ? this.vmUID.equals(otherObj.vmUID) : this.vmUID == otherObj.vmUID) && (this.groupCopyUID != null ? this.groupCopyUID.equals(otherObj.groupCopyUID) : this.groupCopyUID == otherObj.groupCopyUID) && (this.replicationPolicy != null ? this.replicationPolicy.equals(otherObj.replicationPolicy) : this.replicationPolicy == otherObj.replicationPolicy);
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
/* 152 */     return (this.vmUID != null ? this.vmUID.hashCode() : 0) ^ (this.groupCopyUID != null ? this.groupCopyUID.hashCode() : 0) ^ (this.replicationPolicy != null ? this.replicationPolicy.hashCode() : 0);
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
/* 163 */     return "VmReplicationSettings [vmUID=" + this.vmUID + ", " + "groupCopyUID=" + this.groupCopyUID + ", " + "replicationPolicy=" + this.replicationPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VmReplicationSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */