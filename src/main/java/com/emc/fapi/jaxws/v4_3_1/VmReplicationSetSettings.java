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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VmReplicationSetSettings", propOrder={"replicatedVMs", "vmReplicationSetUID", "autoReplicateNewVirtualDisks", "diskSettings", "vmReplicationSetPolicy"})
/*     */ public class VmReplicationSetSettings
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VmReplicationSettings> replicatedVMs;
/*     */   @XmlElement(nillable=true)
/*     */   protected VmReplicationSetUID vmReplicationSetUID;
/*     */   protected boolean autoReplicateNewVirtualDisks;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VirtualDiskSettings> diskSettings;
/*     */   @XmlElement(nillable=true)
/*     */   protected VmReplicationSetPolicy vmReplicationSetPolicy;
/*     */   
/*     */   public VmReplicationSetSettings() {}
/*     */   
/*     */   public VmReplicationSetSettings(List<VmReplicationSettings> replicatedVMs, VmReplicationSetUID vmReplicationSetUID, boolean autoReplicateNewVirtualDisks, List<VirtualDiskSettings> diskSettings, VmReplicationSetPolicy vmReplicationSetPolicy)
/*     */   {
/*  63 */     this.replicatedVMs = replicatedVMs;
/*  64 */     this.vmReplicationSetUID = vmReplicationSetUID;
/*  65 */     this.autoReplicateNewVirtualDisks = autoReplicateNewVirtualDisks;
/*  66 */     this.diskSettings = diskSettings;
/*  67 */     this.vmReplicationSetPolicy = vmReplicationSetPolicy;
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
/*     */   public List<VmReplicationSettings> getReplicatedVMs()
/*     */   {
/*  93 */     if (this.replicatedVMs == null) {
/*  94 */       this.replicatedVMs = new ArrayList();
/*     */     }
/*  96 */     return this.replicatedVMs;
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
/* 108 */     return this.vmReplicationSetUID;
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
/* 120 */     this.vmReplicationSetUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isAutoReplicateNewVirtualDisks()
/*     */   {
/* 128 */     return this.autoReplicateNewVirtualDisks;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAutoReplicateNewVirtualDisks(boolean value)
/*     */   {
/* 136 */     this.autoReplicateNewVirtualDisks = value;
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
/*     */   public List<VirtualDiskSettings> getDiskSettings()
/*     */   {
/* 162 */     if (this.diskSettings == null) {
/* 163 */       this.diskSettings = new ArrayList();
/*     */     }
/* 165 */     return this.diskSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmReplicationSetPolicy getVmReplicationSetPolicy()
/*     */   {
/* 177 */     return this.vmReplicationSetPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmReplicationSetPolicy(VmReplicationSetPolicy value)
/*     */   {
/* 189 */     this.vmReplicationSetPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 199 */     if (!(obj instanceof VmReplicationSetSettings)) {
/* 200 */       return false;
/*     */     }
/* 202 */     VmReplicationSetSettings otherObj = (VmReplicationSetSettings)obj;
/*     */     
/* 204 */     return (this.replicatedVMs != null ? this.replicatedVMs.equals(otherObj.replicatedVMs) : this.replicatedVMs == otherObj.replicatedVMs) && (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.equals(otherObj.vmReplicationSetUID) : this.vmReplicationSetUID == otherObj.vmReplicationSetUID) && (this.autoReplicateNewVirtualDisks == otherObj.autoReplicateNewVirtualDisks) && (this.diskSettings != null ? this.diskSettings.equals(otherObj.diskSettings) : this.diskSettings == otherObj.diskSettings) && (this.vmReplicationSetPolicy != null ? this.vmReplicationSetPolicy.equals(otherObj.vmReplicationSetPolicy) : this.vmReplicationSetPolicy == otherObj.vmReplicationSetPolicy);
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
/*     */   public int hashCode()
/*     */   {
/* 217 */     return (this.replicatedVMs != null ? this.replicatedVMs.hashCode() : 0) ^ (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.hashCode() : 0) ^ (this.autoReplicateNewVirtualDisks ? 1 : 0) ^ (this.diskSettings != null ? this.diskSettings.hashCode() : 0) ^ (this.vmReplicationSetPolicy != null ? this.vmReplicationSetPolicy.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 230 */     return "VmReplicationSetSettings [replicatedVMs=" + this.replicatedVMs + ", " + "vmReplicationSetUID=" + this.vmReplicationSetUID + ", " + "autoReplicateNewVirtualDisks=" + this.autoReplicateNewVirtualDisks + ", " + "diskSettings=" + this.diskSettings + ", " + "vmReplicationSetPolicy=" + this.vmReplicationSetPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VmReplicationSetSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */