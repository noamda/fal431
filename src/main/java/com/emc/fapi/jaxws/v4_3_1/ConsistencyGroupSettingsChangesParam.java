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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupSettingsChangesParam", propOrder={"groupUID", "replicationSetsChanges", "vmReplicationSetsChanges", "removedReplicationSets", "copiesChanges", "activationParams"})
/*     */ public class ConsistencyGroupSettingsChangesParam
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupUID groupUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ReplicationSetSettingsChangesParam> replicationSetsChanges;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VmReplicationSetSettingsChangesParam> vmReplicationSetsChanges;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ReplicationSetUID> removedReplicationSets;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopySettingsChangesParam> copiesChanges;
/*     */   protected ActivationSettingsChangesParams activationParams;
/*     */   
/*     */   public ConsistencyGroupSettingsChangesParam() {}
/*     */   
/*     */   public ConsistencyGroupSettingsChangesParam(ConsistencyGroupUID groupUID, List<ReplicationSetSettingsChangesParam> replicationSetsChanges, List<VmReplicationSetSettingsChangesParam> vmReplicationSetsChanges, List<ReplicationSetUID> removedReplicationSets, List<ConsistencyGroupCopySettingsChangesParam> copiesChanges, ActivationSettingsChangesParams activationParams)
/*     */   {
/*  67 */     this.groupUID = groupUID;
/*  68 */     this.replicationSetsChanges = replicationSetsChanges;
/*  69 */     this.vmReplicationSetsChanges = vmReplicationSetsChanges;
/*  70 */     this.removedReplicationSets = removedReplicationSets;
/*  71 */     this.copiesChanges = copiesChanges;
/*  72 */     this.activationParams = activationParams;
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
/*  84 */     return this.groupUID;
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
/*  96 */     this.groupUID = value;
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
/*     */   public List<ReplicationSetSettingsChangesParam> getReplicationSetsChanges()
/*     */   {
/* 122 */     if (this.replicationSetsChanges == null) {
/* 123 */       this.replicationSetsChanges = new ArrayList();
/*     */     }
/* 125 */     return this.replicationSetsChanges;
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
/*     */   public List<VmReplicationSetSettingsChangesParam> getVmReplicationSetsChanges()
/*     */   {
/* 151 */     if (this.vmReplicationSetsChanges == null) {
/* 152 */       this.vmReplicationSetsChanges = new ArrayList();
/*     */     }
/* 154 */     return this.vmReplicationSetsChanges;
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
/*     */   public List<ReplicationSetUID> getRemovedReplicationSets()
/*     */   {
/* 180 */     if (this.removedReplicationSets == null) {
/* 181 */       this.removedReplicationSets = new ArrayList();
/*     */     }
/* 183 */     return this.removedReplicationSets;
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
/*     */   public List<ConsistencyGroupCopySettingsChangesParam> getCopiesChanges()
/*     */   {
/* 209 */     if (this.copiesChanges == null) {
/* 210 */       this.copiesChanges = new ArrayList();
/*     */     }
/* 212 */     return this.copiesChanges;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ActivationSettingsChangesParams getActivationParams()
/*     */   {
/* 224 */     return this.activationParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setActivationParams(ActivationSettingsChangesParams value)
/*     */   {
/* 236 */     this.activationParams = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 246 */     if (!(obj instanceof ConsistencyGroupSettingsChangesParam)) {
/* 247 */       return false;
/*     */     }
/* 249 */     ConsistencyGroupSettingsChangesParam otherObj = (ConsistencyGroupSettingsChangesParam)obj;
/*     */     
/* 251 */     return (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.replicationSetsChanges != null ? this.replicationSetsChanges.equals(otherObj.replicationSetsChanges) : this.replicationSetsChanges == otherObj.replicationSetsChanges) && (this.vmReplicationSetsChanges != null ? this.vmReplicationSetsChanges.equals(otherObj.vmReplicationSetsChanges) : this.vmReplicationSetsChanges == otherObj.vmReplicationSetsChanges) && (this.removedReplicationSets != null ? this.removedReplicationSets.equals(otherObj.removedReplicationSets) : this.removedReplicationSets == otherObj.removedReplicationSets) && (this.copiesChanges != null ? this.copiesChanges.equals(otherObj.copiesChanges) : this.copiesChanges == otherObj.copiesChanges) && (this.activationParams != null ? this.activationParams.equals(otherObj.activationParams) : this.activationParams == otherObj.activationParams);
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
/*     */   public int hashCode()
/*     */   {
/* 265 */     return (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (this.replicationSetsChanges != null ? this.replicationSetsChanges.hashCode() : 0) ^ (this.vmReplicationSetsChanges != null ? this.vmReplicationSetsChanges.hashCode() : 0) ^ (this.removedReplicationSets != null ? this.removedReplicationSets.hashCode() : 0) ^ (this.copiesChanges != null ? this.copiesChanges.hashCode() : 0) ^ (this.activationParams != null ? this.activationParams.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 279 */     return "ConsistencyGroupSettingsChangesParam [groupUID=" + this.groupUID + ", " + "replicationSetsChanges=" + this.replicationSetsChanges + ", " + "vmReplicationSetsChanges=" + this.vmReplicationSetsChanges + ", " + "removedReplicationSets=" + this.removedReplicationSets + ", " + "copiesChanges=" + this.copiesChanges + ", " + "activationParams=" + this.activationParams + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupSettingsChangesParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */