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
/*     */ 
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
/*     */ @XmlType(name="ConsistencyGroupSettings", propOrder={"activeLinksSettings", "enabled", "groupCopiesSettings", "groupUID", "latestSourceCopyUID", "name", "passiveLinksSettings", "policy", "productionCopiesUID", "replicationSetsSettings", "vmReplicationSetsSettings"})
/*     */ public class ConsistencyGroupSettings
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupLinkSettings> activeLinksSettings;
/*     */   protected boolean enabled;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopySettings> groupCopiesSettings;
/*     */   protected ConsistencyGroupUID groupUID;
/*     */   protected ConsistencyGroupCopyUID latestSourceCopyUID;
/*     */   protected String name;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupLinkSettings> passiveLinksSettings;
/*     */   protected ConsistencyGroupPolicy policy;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopyUID> productionCopiesUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ReplicationSetSettings> replicationSetsSettings;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VmReplicationSetSettings> vmReplicationSetsSettings;
/*     */   
/*     */   public ConsistencyGroupSettings() {}
/*     */   
/*     */   public ConsistencyGroupSettings(List<ConsistencyGroupLinkSettings> activeLinksSettings, boolean enabled, List<ConsistencyGroupCopySettings> groupCopiesSettings, ConsistencyGroupUID groupUID, ConsistencyGroupCopyUID latestSourceCopyUID, String name, List<ConsistencyGroupLinkSettings> passiveLinksSettings, ConsistencyGroupPolicy policy, List<ConsistencyGroupCopyUID> productionCopiesUID, List<ReplicationSetSettings> replicationSetsSettings, List<VmReplicationSetSettings> vmReplicationSetsSettings)
/*     */   {
/*  83 */     this.activeLinksSettings = activeLinksSettings;
/*  84 */     this.enabled = enabled;
/*  85 */     this.groupCopiesSettings = groupCopiesSettings;
/*  86 */     this.groupUID = groupUID;
/*  87 */     this.latestSourceCopyUID = latestSourceCopyUID;
/*  88 */     this.name = name;
/*  89 */     this.passiveLinksSettings = passiveLinksSettings;
/*  90 */     this.policy = policy;
/*  91 */     this.productionCopiesUID = productionCopiesUID;
/*  92 */     this.replicationSetsSettings = replicationSetsSettings;
/*  93 */     this.vmReplicationSetsSettings = vmReplicationSetsSettings;
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
/*     */   public List<ConsistencyGroupLinkSettings> getActiveLinksSettings()
/*     */   {
/* 119 */     if (this.activeLinksSettings == null) {
/* 120 */       this.activeLinksSettings = new ArrayList();
/*     */     }
/* 122 */     return this.activeLinksSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isEnabled()
/*     */   {
/* 130 */     return this.enabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEnabled(boolean value)
/*     */   {
/* 138 */     this.enabled = value;
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
/*     */   public List<ConsistencyGroupCopySettings> getGroupCopiesSettings()
/*     */   {
/* 164 */     if (this.groupCopiesSettings == null) {
/* 165 */       this.groupCopiesSettings = new ArrayList();
/*     */     }
/* 167 */     return this.groupCopiesSettings;
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
/* 179 */     return this.groupUID;
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
/* 191 */     this.groupUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getLatestSourceCopyUID()
/*     */   {
/* 203 */     return this.latestSourceCopyUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLatestSourceCopyUID(ConsistencyGroupCopyUID value)
/*     */   {
/* 215 */     this.latestSourceCopyUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getName()
/*     */   {
/* 227 */     return this.name;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setName(String value)
/*     */   {
/* 239 */     this.name = value;
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
/*     */   public List<ConsistencyGroupLinkSettings> getPassiveLinksSettings()
/*     */   {
/* 265 */     if (this.passiveLinksSettings == null) {
/* 266 */       this.passiveLinksSettings = new ArrayList();
/*     */     }
/* 268 */     return this.passiveLinksSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupPolicy getPolicy()
/*     */   {
/* 280 */     return this.policy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPolicy(ConsistencyGroupPolicy value)
/*     */   {
/* 292 */     this.policy = value;
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
/*     */   public List<ConsistencyGroupCopyUID> getProductionCopiesUID()
/*     */   {
/* 318 */     if (this.productionCopiesUID == null) {
/* 319 */       this.productionCopiesUID = new ArrayList();
/*     */     }
/* 321 */     return this.productionCopiesUID;
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
/*     */   public List<ReplicationSetSettings> getReplicationSetsSettings()
/*     */   {
/* 347 */     if (this.replicationSetsSettings == null) {
/* 348 */       this.replicationSetsSettings = new ArrayList();
/*     */     }
/* 350 */     return this.replicationSetsSettings;
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
/*     */   public List<VmReplicationSetSettings> getVmReplicationSetsSettings()
/*     */   {
/* 376 */     if (this.vmReplicationSetsSettings == null) {
/* 377 */       this.vmReplicationSetsSettings = new ArrayList();
/*     */     }
/* 379 */     return this.vmReplicationSetsSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 389 */     if (!(obj instanceof ConsistencyGroupSettings)) {
/* 390 */       return false;
/*     */     }
/* 392 */     ConsistencyGroupSettings otherObj = (ConsistencyGroupSettings)obj;
/*     */     
/* 394 */     return (this.activeLinksSettings != null ? this.activeLinksSettings.equals(otherObj.activeLinksSettings) : this.activeLinksSettings == otherObj.activeLinksSettings) && (this.enabled == otherObj.enabled) && (this.groupCopiesSettings != null ? this.groupCopiesSettings.equals(otherObj.groupCopiesSettings) : this.groupCopiesSettings == otherObj.groupCopiesSettings) && (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.latestSourceCopyUID != null ? this.latestSourceCopyUID.equals(otherObj.latestSourceCopyUID) : this.latestSourceCopyUID == otherObj.latestSourceCopyUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.passiveLinksSettings != null ? this.passiveLinksSettings.equals(otherObj.passiveLinksSettings) : this.passiveLinksSettings == otherObj.passiveLinksSettings) && (this.policy != null ? this.policy.equals(otherObj.policy) : this.policy == otherObj.policy) && (this.productionCopiesUID != null ? this.productionCopiesUID.equals(otherObj.productionCopiesUID) : this.productionCopiesUID == otherObj.productionCopiesUID) && (this.replicationSetsSettings != null ? this.replicationSetsSettings.equals(otherObj.replicationSetsSettings) : this.replicationSetsSettings == otherObj.replicationSetsSettings) && (this.vmReplicationSetsSettings != null ? this.vmReplicationSetsSettings.equals(otherObj.vmReplicationSetsSettings) : this.vmReplicationSetsSettings == otherObj.vmReplicationSetsSettings);
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
/*     */   public int hashCode()
/*     */   {
/* 413 */     return (this.activeLinksSettings != null ? this.activeLinksSettings.hashCode() : 0) ^ (this.enabled ? 1 : 0) ^ (this.groupCopiesSettings != null ? this.groupCopiesSettings.hashCode() : 0) ^ (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (this.latestSourceCopyUID != null ? this.latestSourceCopyUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.passiveLinksSettings != null ? this.passiveLinksSettings.hashCode() : 0) ^ (this.policy != null ? this.policy.hashCode() : 0) ^ (this.productionCopiesUID != null ? this.productionCopiesUID.hashCode() : 0) ^ (this.replicationSetsSettings != null ? this.replicationSetsSettings.hashCode() : 0) ^ (this.vmReplicationSetsSettings != null ? this.vmReplicationSetsSettings.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 432 */     return "ConsistencyGroupSettings [activeLinksSettings=" + this.activeLinksSettings + ", " + "enabled=" + this.enabled + ", " + "groupCopiesSettings=" + this.groupCopiesSettings + ", " + "groupUID=" + this.groupUID + ", " + "latestSourceCopyUID=" + this.latestSourceCopyUID + ", " + "name=" + this.name + ", " + "passiveLinksSettings=" + this.passiveLinksSettings + ", " + "policy=" + this.policy + ", " + "productionCopiesUID=" + this.productionCopiesUID + ", " + "replicationSetsSettings=" + this.replicationSetsSettings + ", " + "vmReplicationSetsSettings=" + this.vmReplicationSetsSettings + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */