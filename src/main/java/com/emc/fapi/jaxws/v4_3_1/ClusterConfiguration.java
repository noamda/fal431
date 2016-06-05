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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ClusterConfiguration", propOrder={"cluster", "rpasConfiguration", "managementIPs", "internalClusterName", "remoteISCSITargetsPortsConfiguration", "remoteClustersConnectionInformation", "gateways", "timeZoneInfo", "clusterName", "domain", "dnsIPs", "productType", "numberOfExposedLUNs", "initiatorOnlyMode", "numberOfVirtualPorts", "numberOfInitiatorIQNs"})
/*     */ public class ClusterConfiguration
/*     */ {
/*     */   protected ClusterUID cluster;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RPAConfiguration> rpasConfiguration;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<IPInformation> managementIPs;
/*     */   protected String internalClusterName;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RemoteISCSIPortsConfiguration> remoteISCSITargetsPortsConfiguration;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RemoteClusterConnectionInformation> remoteClustersConnectionInformation;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<GatewayInformation> gateways;
/*     */   @XmlElement(nillable=true)
/*     */   protected TimeZoneInfo timeZoneInfo;
/*     */   protected String clusterName;
/*     */   protected String domain;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<String> dnsIPs;
/*     */   @XmlElement(nillable=true)
/*     */   protected ProductType productType;
/*     */   protected int numberOfExposedLUNs;
/*     */   protected boolean initiatorOnlyMode;
/*     */   protected int numberOfVirtualPorts;
/*     */   protected int numberOfInitiatorIQNs;
/*     */   
/*     */   public ClusterConfiguration() {}
/*     */   
/*     */   public ClusterConfiguration(ClusterUID cluster, List<RPAConfiguration> rpasConfiguration, List<IPInformation> managementIPs, String internalClusterName, List<RemoteISCSIPortsConfiguration> remoteISCSITargetsPortsConfiguration, List<RemoteClusterConnectionInformation> remoteClustersConnectionInformation, List<GatewayInformation> gateways, TimeZoneInfo timeZoneInfo, String clusterName, String domain, List<String> dnsIPs, ProductType productType, int numberOfExposedLUNs, boolean initiatorOnlyMode, int numberOfVirtualPorts, int numberOfInitiatorIQNs)
/*     */   {
/* 100 */     this.cluster = cluster;
/* 101 */     this.rpasConfiguration = rpasConfiguration;
/* 102 */     this.managementIPs = managementIPs;
/* 103 */     this.internalClusterName = internalClusterName;
/* 104 */     this.remoteISCSITargetsPortsConfiguration = remoteISCSITargetsPortsConfiguration;
/* 105 */     this.remoteClustersConnectionInformation = remoteClustersConnectionInformation;
/* 106 */     this.gateways = gateways;
/* 107 */     this.timeZoneInfo = timeZoneInfo;
/* 108 */     this.clusterName = clusterName;
/* 109 */     this.domain = domain;
/* 110 */     this.dnsIPs = dnsIPs;
/* 111 */     this.productType = productType;
/* 112 */     this.numberOfExposedLUNs = numberOfExposedLUNs;
/* 113 */     this.initiatorOnlyMode = initiatorOnlyMode;
/* 114 */     this.numberOfVirtualPorts = numberOfVirtualPorts;
/* 115 */     this.numberOfInitiatorIQNs = numberOfInitiatorIQNs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterUID getCluster()
/*     */   {
/* 127 */     return this.cluster;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCluster(ClusterUID value)
/*     */   {
/* 139 */     this.cluster = value;
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
/*     */   public List<RPAConfiguration> getRpasConfiguration()
/*     */   {
/* 165 */     if (this.rpasConfiguration == null) {
/* 166 */       this.rpasConfiguration = new ArrayList();
/*     */     }
/* 168 */     return this.rpasConfiguration;
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
/*     */   public List<IPInformation> getManagementIPs()
/*     */   {
/* 194 */     if (this.managementIPs == null) {
/* 195 */       this.managementIPs = new ArrayList();
/*     */     }
/* 197 */     return this.managementIPs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getInternalClusterName()
/*     */   {
/* 209 */     return this.internalClusterName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setInternalClusterName(String value)
/*     */   {
/* 221 */     this.internalClusterName = value;
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
/*     */   public List<RemoteISCSIPortsConfiguration> getRemoteISCSITargetsPortsConfiguration()
/*     */   {
/* 247 */     if (this.remoteISCSITargetsPortsConfiguration == null) {
/* 248 */       this.remoteISCSITargetsPortsConfiguration = new ArrayList();
/*     */     }
/* 250 */     return this.remoteISCSITargetsPortsConfiguration;
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
/*     */   public List<RemoteClusterConnectionInformation> getRemoteClustersConnectionInformation()
/*     */   {
/* 276 */     if (this.remoteClustersConnectionInformation == null) {
/* 277 */       this.remoteClustersConnectionInformation = new ArrayList();
/*     */     }
/* 279 */     return this.remoteClustersConnectionInformation;
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
/*     */   public List<GatewayInformation> getGateways()
/*     */   {
/* 305 */     if (this.gateways == null) {
/* 306 */       this.gateways = new ArrayList();
/*     */     }
/* 308 */     return this.gateways;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public TimeZoneInfo getTimeZoneInfo()
/*     */   {
/* 320 */     return this.timeZoneInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTimeZoneInfo(TimeZoneInfo value)
/*     */   {
/* 332 */     this.timeZoneInfo = value;
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
/* 344 */     return this.clusterName;
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
/* 356 */     this.clusterName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getDomain()
/*     */   {
/* 368 */     return this.domain;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDomain(String value)
/*     */   {
/* 380 */     this.domain = value;
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
/*     */   public List<String> getDnsIPs()
/*     */   {
/* 406 */     if (this.dnsIPs == null) {
/* 407 */       this.dnsIPs = new ArrayList();
/*     */     }
/* 409 */     return this.dnsIPs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ProductType getProductType()
/*     */   {
/* 421 */     return this.productType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setProductType(ProductType value)
/*     */   {
/* 433 */     this.productType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getNumberOfExposedLUNs()
/*     */   {
/* 441 */     return this.numberOfExposedLUNs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNumberOfExposedLUNs(int value)
/*     */   {
/* 449 */     this.numberOfExposedLUNs = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isInitiatorOnlyMode()
/*     */   {
/* 457 */     return this.initiatorOnlyMode;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setInitiatorOnlyMode(boolean value)
/*     */   {
/* 465 */     this.initiatorOnlyMode = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getNumberOfVirtualPorts()
/*     */   {
/* 473 */     return this.numberOfVirtualPorts;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNumberOfVirtualPorts(int value)
/*     */   {
/* 481 */     this.numberOfVirtualPorts = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getNumberOfInitiatorIQNs()
/*     */   {
/* 489 */     return this.numberOfInitiatorIQNs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNumberOfInitiatorIQNs(int value)
/*     */   {
/* 497 */     this.numberOfInitiatorIQNs = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 507 */     if (!(obj instanceof ClusterConfiguration)) {
/* 508 */       return false;
/*     */     }
/* 510 */     ClusterConfiguration otherObj = (ClusterConfiguration)obj;
/*     */     
/* 512 */     return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.rpasConfiguration != null ? this.rpasConfiguration.equals(otherObj.rpasConfiguration) : this.rpasConfiguration == otherObj.rpasConfiguration) && (this.managementIPs != null ? this.managementIPs.equals(otherObj.managementIPs) : this.managementIPs == otherObj.managementIPs) && (this.internalClusterName != null ? this.internalClusterName.equals(otherObj.internalClusterName) : this.internalClusterName == otherObj.internalClusterName) && (this.remoteISCSITargetsPortsConfiguration != null ? this.remoteISCSITargetsPortsConfiguration.equals(otherObj.remoteISCSITargetsPortsConfiguration) : this.remoteISCSITargetsPortsConfiguration == otherObj.remoteISCSITargetsPortsConfiguration) && (this.remoteClustersConnectionInformation != null ? this.remoteClustersConnectionInformation.equals(otherObj.remoteClustersConnectionInformation) : this.remoteClustersConnectionInformation == otherObj.remoteClustersConnectionInformation) && (this.gateways != null ? this.gateways.equals(otherObj.gateways) : this.gateways == otherObj.gateways) && (this.timeZoneInfo != null ? this.timeZoneInfo.equals(otherObj.timeZoneInfo) : this.timeZoneInfo == otherObj.timeZoneInfo) && (this.clusterName != null ? this.clusterName.equals(otherObj.clusterName) : this.clusterName == otherObj.clusterName) && (this.domain != null ? this.domain.equals(otherObj.domain) : this.domain == otherObj.domain) && (this.dnsIPs != null ? this.dnsIPs.equals(otherObj.dnsIPs) : this.dnsIPs == otherObj.dnsIPs) && (this.productType != null ? this.productType.equals(otherObj.productType) : this.productType == otherObj.productType) && (this.numberOfExposedLUNs == otherObj.numberOfExposedLUNs) && (this.initiatorOnlyMode == otherObj.initiatorOnlyMode) && (this.numberOfVirtualPorts == otherObj.numberOfVirtualPorts) && (this.numberOfInitiatorIQNs == otherObj.numberOfInitiatorIQNs);
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
/*     */   public int hashCode()
/*     */   {
/* 536 */     return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.rpasConfiguration != null ? this.rpasConfiguration.hashCode() : 0) ^ (this.managementIPs != null ? this.managementIPs.hashCode() : 0) ^ (this.internalClusterName != null ? this.internalClusterName.hashCode() : 0) ^ (this.remoteISCSITargetsPortsConfiguration != null ? this.remoteISCSITargetsPortsConfiguration.hashCode() : 0) ^ (this.remoteClustersConnectionInformation != null ? this.remoteClustersConnectionInformation.hashCode() : 0) ^ (this.gateways != null ? this.gateways.hashCode() : 0) ^ (this.timeZoneInfo != null ? this.timeZoneInfo.hashCode() : 0) ^ (this.clusterName != null ? this.clusterName.hashCode() : 0) ^ (this.domain != null ? this.domain.hashCode() : 0) ^ (this.dnsIPs != null ? this.dnsIPs.hashCode() : 0) ^ (this.productType != null ? this.productType.hashCode() : 0) ^ this.numberOfExposedLUNs ^ (this.initiatorOnlyMode ? 1 : 0) ^ this.numberOfVirtualPorts ^ this.numberOfInitiatorIQNs;
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
/*     */   public String toString()
/*     */   {
/* 560 */     return "ClusterConfiguration [cluster=" + this.cluster + ", " + "rpasConfiguration=" + this.rpasConfiguration + ", " + "managementIPs=" + this.managementIPs + ", " + "internalClusterName=" + this.internalClusterName + ", " + "remoteISCSITargetsPortsConfiguration=" + this.remoteISCSITargetsPortsConfiguration + ", " + "remoteClustersConnectionInformation=" + this.remoteClustersConnectionInformation + ", " + "gateways=" + this.gateways + ", " + "timeZoneInfo=" + this.timeZoneInfo + ", " + "clusterName=" + this.clusterName + ", " + "domain=" + this.domain + ", " + "dnsIPs=" + this.dnsIPs + ", " + "productType=" + this.productType + ", " + "numberOfExposedLUNs=" + this.numberOfExposedLUNs + ", " + "initiatorOnlyMode=" + this.initiatorOnlyMode + ", " + "numberOfVirtualPorts=" + this.numberOfVirtualPorts + ", " + "numberOfInitiatorIQNs=" + this.numberOfInitiatorIQNs + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClusterConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */