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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ClusterSettings", propOrder={"clusterName", "clusterUID", "rpasUIDs", "vcenterServers", "vcenterServersFilters", "repositoryVolume", "attachedPhoenixClusterName", "throttlePolicy", "clusterIndex", "maintenanceMode", "locationID", "softwareSerialId", "ampsSettings", "autoRegistrationInfo", "externalHostsSettings"})
/*     */ public class ClusterSettings
/*     */ {
/*     */   protected String clusterName;
/*     */   @XmlElement(nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RpaUID> rpasUIDs;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VCenterServer> vcenterServers;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VCenterServerFilters> vcenterServersFilters;
/*     */   protected RepositoryVolumeSettings repositoryVolume;
/*     */   protected String attachedPhoenixClusterName;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ArrayIRThrottlingPolicyInfo> throttlePolicy;
/*     */   protected int clusterIndex;
/*     */   protected ClusterMaintenanceMode maintenanceMode;
/*     */   protected String locationID;
/*     */   protected String softwareSerialId;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ArrayManagementProviderSettings> ampsSettings;
/*     */   protected ClusterAutoRegistrationInformation autoRegistrationInfo;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ExternalHostSettings> externalHostsSettings;
/*     */   
/*     */   public ClusterSettings() {}
/*     */   
/*     */   public ClusterSettings(String clusterName, ClusterUID clusterUID, List<RpaUID> rpasUIDs, List<VCenterServer> vcenterServers, List<VCenterServerFilters> vcenterServersFilters, RepositoryVolumeSettings repositoryVolume, String attachedPhoenixClusterName, List<ArrayIRThrottlingPolicyInfo> throttlePolicy, int clusterIndex, ClusterMaintenanceMode maintenanceMode, String locationID, String softwareSerialId, List<ArrayManagementProviderSettings> ampsSettings, ClusterAutoRegistrationInformation autoRegistrationInfo, List<ExternalHostSettings> externalHostsSettings)
/*     */   {
/*  96 */     this.clusterName = clusterName;
/*  97 */     this.clusterUID = clusterUID;
/*  98 */     this.rpasUIDs = rpasUIDs;
/*  99 */     this.vcenterServers = vcenterServers;
/* 100 */     this.vcenterServersFilters = vcenterServersFilters;
/* 101 */     this.repositoryVolume = repositoryVolume;
/* 102 */     this.attachedPhoenixClusterName = attachedPhoenixClusterName;
/* 103 */     this.throttlePolicy = throttlePolicy;
/* 104 */     this.clusterIndex = clusterIndex;
/* 105 */     this.maintenanceMode = maintenanceMode;
/* 106 */     this.locationID = locationID;
/* 107 */     this.softwareSerialId = softwareSerialId;
/* 108 */     this.ampsSettings = ampsSettings;
/* 109 */     this.autoRegistrationInfo = autoRegistrationInfo;
/* 110 */     this.externalHostsSettings = externalHostsSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getClusterName()
/*     */   {
/* 122 */     return this.clusterName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setClusterName(String value)
/*     */   {
/* 134 */     this.clusterName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterUID getClusterUID()
/*     */   {
/* 146 */     return this.clusterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setClusterUID(ClusterUID value)
/*     */   {
/* 158 */     this.clusterUID = value;
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
/*     */   public List<RpaUID> getRpasUIDs()
/*     */   {
/* 184 */     if (this.rpasUIDs == null) {
/* 185 */       this.rpasUIDs = new ArrayList();
/*     */     }
/* 187 */     return this.rpasUIDs;
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
/*     */   public List<VCenterServer> getVcenterServers()
/*     */   {
/* 213 */     if (this.vcenterServers == null) {
/* 214 */       this.vcenterServers = new ArrayList();
/*     */     }
/* 216 */     return this.vcenterServers;
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
/*     */   public List<VCenterServerFilters> getVcenterServersFilters()
/*     */   {
/* 242 */     if (this.vcenterServersFilters == null) {
/* 243 */       this.vcenterServersFilters = new ArrayList();
/*     */     }
/* 245 */     return this.vcenterServersFilters;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RepositoryVolumeSettings getRepositoryVolume()
/*     */   {
/* 257 */     return this.repositoryVolume;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRepositoryVolume(RepositoryVolumeSettings value)
/*     */   {
/* 269 */     this.repositoryVolume = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getAttachedPhoenixClusterName()
/*     */   {
/* 281 */     return this.attachedPhoenixClusterName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAttachedPhoenixClusterName(String value)
/*     */   {
/* 293 */     this.attachedPhoenixClusterName = value;
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
/*     */   public List<ArrayIRThrottlingPolicyInfo> getThrottlePolicy()
/*     */   {
/* 319 */     if (this.throttlePolicy == null) {
/* 320 */       this.throttlePolicy = new ArrayList();
/*     */     }
/* 322 */     return this.throttlePolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getClusterIndex()
/*     */   {
/* 330 */     return this.clusterIndex;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setClusterIndex(int value)
/*     */   {
/* 338 */     this.clusterIndex = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterMaintenanceMode getMaintenanceMode()
/*     */   {
/* 350 */     return this.maintenanceMode;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMaintenanceMode(ClusterMaintenanceMode value)
/*     */   {
/* 362 */     this.maintenanceMode = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getLocationID()
/*     */   {
/* 374 */     return this.locationID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLocationID(String value)
/*     */   {
/* 386 */     this.locationID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSoftwareSerialId()
/*     */   {
/* 398 */     return this.softwareSerialId;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSoftwareSerialId(String value)
/*     */   {
/* 410 */     this.softwareSerialId = value;
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
/*     */   public List<ArrayManagementProviderSettings> getAmpsSettings()
/*     */   {
/* 436 */     if (this.ampsSettings == null) {
/* 437 */       this.ampsSettings = new ArrayList();
/*     */     }
/* 439 */     return this.ampsSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterAutoRegistrationInformation getAutoRegistrationInfo()
/*     */   {
/* 451 */     return this.autoRegistrationInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAutoRegistrationInfo(ClusterAutoRegistrationInformation value)
/*     */   {
/* 463 */     this.autoRegistrationInfo = value;
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
/*     */   public List<ExternalHostSettings> getExternalHostsSettings()
/*     */   {
/* 489 */     if (this.externalHostsSettings == null) {
/* 490 */       this.externalHostsSettings = new ArrayList();
/*     */     }
/* 492 */     return this.externalHostsSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 502 */     if (!(obj instanceof ClusterSettings)) {
/* 503 */       return false;
/*     */     }
/* 505 */     ClusterSettings otherObj = (ClusterSettings)obj;
/*     */     
/* 507 */     return (this.clusterName != null ? this.clusterName.equals(otherObj.clusterName) : this.clusterName == otherObj.clusterName) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.rpasUIDs != null ? this.rpasUIDs.equals(otherObj.rpasUIDs) : this.rpasUIDs == otherObj.rpasUIDs) && (this.vcenterServers != null ? this.vcenterServers.equals(otherObj.vcenterServers) : this.vcenterServers == otherObj.vcenterServers) && (this.vcenterServersFilters != null ? this.vcenterServersFilters.equals(otherObj.vcenterServersFilters) : this.vcenterServersFilters == otherObj.vcenterServersFilters) && (this.repositoryVolume != null ? this.repositoryVolume.equals(otherObj.repositoryVolume) : this.repositoryVolume == otherObj.repositoryVolume) && (this.attachedPhoenixClusterName != null ? this.attachedPhoenixClusterName.equals(otherObj.attachedPhoenixClusterName) : this.attachedPhoenixClusterName == otherObj.attachedPhoenixClusterName) && (this.throttlePolicy != null ? this.throttlePolicy.equals(otherObj.throttlePolicy) : this.throttlePolicy == otherObj.throttlePolicy) && (this.clusterIndex == otherObj.clusterIndex) && (this.maintenanceMode != null ? this.maintenanceMode.equals(otherObj.maintenanceMode) : this.maintenanceMode == otherObj.maintenanceMode) && (this.locationID != null ? this.locationID.equals(otherObj.locationID) : this.locationID == otherObj.locationID) && (this.softwareSerialId != null ? this.softwareSerialId.equals(otherObj.softwareSerialId) : this.softwareSerialId == otherObj.softwareSerialId) && (this.ampsSettings != null ? this.ampsSettings.equals(otherObj.ampsSettings) : this.ampsSettings == otherObj.ampsSettings) && (this.autoRegistrationInfo != null ? this.autoRegistrationInfo.equals(otherObj.autoRegistrationInfo) : this.autoRegistrationInfo == otherObj.autoRegistrationInfo) && (this.externalHostsSettings != null ? this.externalHostsSettings.equals(otherObj.externalHostsSettings) : this.externalHostsSettings == otherObj.externalHostsSettings);
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
/*     */   public int hashCode()
/*     */   {
/* 530 */     return (this.clusterName != null ? this.clusterName.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.rpasUIDs != null ? this.rpasUIDs.hashCode() : 0) ^ (this.vcenterServers != null ? this.vcenterServers.hashCode() : 0) ^ (this.vcenterServersFilters != null ? this.vcenterServersFilters.hashCode() : 0) ^ (this.repositoryVolume != null ? this.repositoryVolume.hashCode() : 0) ^ (this.attachedPhoenixClusterName != null ? this.attachedPhoenixClusterName.hashCode() : 0) ^ (this.throttlePolicy != null ? this.throttlePolicy.hashCode() : 0) ^ this.clusterIndex ^ (this.maintenanceMode != null ? this.maintenanceMode.hashCode() : 0) ^ (this.locationID != null ? this.locationID.hashCode() : 0) ^ (this.softwareSerialId != null ? this.softwareSerialId.hashCode() : 0) ^ (this.ampsSettings != null ? this.ampsSettings.hashCode() : 0) ^ (this.autoRegistrationInfo != null ? this.autoRegistrationInfo.hashCode() : 0) ^ (this.externalHostsSettings != null ? this.externalHostsSettings.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 553 */     return "ClusterSettings [clusterName=" + this.clusterName + ", " + "clusterUID=" + this.clusterUID + ", " + "rpasUIDs=" + this.rpasUIDs + ", " + "vcenterServers=" + this.vcenterServers + ", " + "vcenterServersFilters=" + this.vcenterServersFilters + ", " + "repositoryVolume=" + this.repositoryVolume + ", " + "attachedPhoenixClusterName=" + this.attachedPhoenixClusterName + ", " + "throttlePolicy=" + this.throttlePolicy + ", " + "clusterIndex=" + this.clusterIndex + ", " + "maintenanceMode=" + this.maintenanceMode + ", " + "locationID=" + this.locationID + ", " + "softwareSerialId=" + this.softwareSerialId + ", " + "ampsSettings=" + this.ampsSettings + ", " + "autoRegistrationInfo=" + this.autoRegistrationInfo + ", " + "externalHostsSettings=" + this.externalHostsSettings + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClusterSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */