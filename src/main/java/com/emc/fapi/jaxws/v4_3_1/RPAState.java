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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @XmlType(name="RPAState", propOrder={"rpaUID", "status", "repositoryConnectivityStatus", "remoteRPAsDataLinkStatus", "runningClusterControl", "remoteRPAsConnectivityStatus", "localRPAsFiberConnectivityStatus", "volumesConnectivityStatus", "interfacesStatus", "splittersConnectivityStatus", "globalSystemConfiguation", "version", "hardwareSerialID", "wanIP", "managementIPv4", "managementIPv6", "initiatorsState", "vendor", "hardwarePlatform", "hbaType", "systemMemory", "numberOfCores", "type"})
/*     */ public class RPAState
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected RpaUID rpaUID;
/*     */   protected RpaStatus status;
/*     */   protected VolumeStatus repositoryConnectivityStatus;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RPAConnectivityStatus> remoteRPAsDataLinkStatus;
/*     */   protected boolean runningClusterControl;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RPAConnectivityStatus> remoteRPAsConnectivityStatus;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RPAConnectivityStatus> localRPAsFiberConnectivityStatus;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VolumeConnectivityStatus> volumesConnectivityStatus;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RPAInterfaceStatus> interfacesStatus;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SplitterConnectivityStatus> splittersConnectivityStatus;
/*     */   protected GlobalSystemConfiguration globalSystemConfiguation;
/*     */   protected RecoverPointVersion version;
/*     */   protected String hardwareSerialID;
/*     */   protected String wanIP;
/*     */   protected String managementIPv4;
/*     */   protected String managementIPv6;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<InitiatorInformation> initiatorsState;
/*     */   protected String vendor;
/*     */   protected String hardwarePlatform;
/*     */   protected long hbaType;
/*     */   protected long systemMemory;
/*     */   protected long numberOfCores;
/*     */   protected RpaType type;
/*     */   
/*     */   public RPAState() {}
/*     */   
/*     */   public RPAState(RpaUID rpaUID, RpaStatus status, VolumeStatus repositoryConnectivityStatus, List<RPAConnectivityStatus> remoteRPAsDataLinkStatus, boolean runningClusterControl, List<RPAConnectivityStatus> remoteRPAsConnectivityStatus, List<RPAConnectivityStatus> localRPAsFiberConnectivityStatus, List<VolumeConnectivityStatus> volumesConnectivityStatus, List<RPAInterfaceStatus> interfacesStatus, List<SplitterConnectivityStatus> splittersConnectivityStatus, GlobalSystemConfiguration globalSystemConfiguation, RecoverPointVersion version, String hardwareSerialID, String wanIP, String managementIPv4, String managementIPv6, List<InitiatorInformation> initiatorsState, String vendor, String hardwarePlatform, long hbaType, long systemMemory, long numberOfCores, RpaType type)
/*     */   {
/* 121 */     this.rpaUID = rpaUID;
/* 122 */     this.status = status;
/* 123 */     this.repositoryConnectivityStatus = repositoryConnectivityStatus;
/* 124 */     this.remoteRPAsDataLinkStatus = remoteRPAsDataLinkStatus;
/* 125 */     this.runningClusterControl = runningClusterControl;
/* 126 */     this.remoteRPAsConnectivityStatus = remoteRPAsConnectivityStatus;
/* 127 */     this.localRPAsFiberConnectivityStatus = localRPAsFiberConnectivityStatus;
/* 128 */     this.volumesConnectivityStatus = volumesConnectivityStatus;
/* 129 */     this.interfacesStatus = interfacesStatus;
/* 130 */     this.splittersConnectivityStatus = splittersConnectivityStatus;
/* 131 */     this.globalSystemConfiguation = globalSystemConfiguation;
/* 132 */     this.version = version;
/* 133 */     this.hardwareSerialID = hardwareSerialID;
/* 134 */     this.wanIP = wanIP;
/* 135 */     this.managementIPv4 = managementIPv4;
/* 136 */     this.managementIPv6 = managementIPv6;
/* 137 */     this.initiatorsState = initiatorsState;
/* 138 */     this.vendor = vendor;
/* 139 */     this.hardwarePlatform = hardwarePlatform;
/* 140 */     this.hbaType = hbaType;
/* 141 */     this.systemMemory = systemMemory;
/* 142 */     this.numberOfCores = numberOfCores;
/* 143 */     this.type = type;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RpaUID getRpaUID()
/*     */   {
/* 155 */     return this.rpaUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRpaUID(RpaUID value)
/*     */   {
/* 167 */     this.rpaUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RpaStatus getStatus()
/*     */   {
/* 179 */     return this.status;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStatus(RpaStatus value)
/*     */   {
/* 191 */     this.status = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VolumeStatus getRepositoryConnectivityStatus()
/*     */   {
/* 203 */     return this.repositoryConnectivityStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRepositoryConnectivityStatus(VolumeStatus value)
/*     */   {
/* 215 */     this.repositoryConnectivityStatus = value;
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
/*     */   public List<RPAConnectivityStatus> getRemoteRPAsDataLinkStatus()
/*     */   {
/* 241 */     if (this.remoteRPAsDataLinkStatus == null) {
/* 242 */       this.remoteRPAsDataLinkStatus = new ArrayList();
/*     */     }
/* 244 */     return this.remoteRPAsDataLinkStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isRunningClusterControl()
/*     */   {
/* 252 */     return this.runningClusterControl;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRunningClusterControl(boolean value)
/*     */   {
/* 260 */     this.runningClusterControl = value;
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
/*     */   public List<RPAConnectivityStatus> getRemoteRPAsConnectivityStatus()
/*     */   {
/* 286 */     if (this.remoteRPAsConnectivityStatus == null) {
/* 287 */       this.remoteRPAsConnectivityStatus = new ArrayList();
/*     */     }
/* 289 */     return this.remoteRPAsConnectivityStatus;
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
/*     */   public List<RPAConnectivityStatus> getLocalRPAsFiberConnectivityStatus()
/*     */   {
/* 315 */     if (this.localRPAsFiberConnectivityStatus == null) {
/* 316 */       this.localRPAsFiberConnectivityStatus = new ArrayList();
/*     */     }
/* 318 */     return this.localRPAsFiberConnectivityStatus;
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
/*     */   public List<VolumeConnectivityStatus> getVolumesConnectivityStatus()
/*     */   {
/* 344 */     if (this.volumesConnectivityStatus == null) {
/* 345 */       this.volumesConnectivityStatus = new ArrayList();
/*     */     }
/* 347 */     return this.volumesConnectivityStatus;
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
/*     */   public List<RPAInterfaceStatus> getInterfacesStatus()
/*     */   {
/* 373 */     if (this.interfacesStatus == null) {
/* 374 */       this.interfacesStatus = new ArrayList();
/*     */     }
/* 376 */     return this.interfacesStatus;
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
/*     */   public List<SplitterConnectivityStatus> getSplittersConnectivityStatus()
/*     */   {
/* 402 */     if (this.splittersConnectivityStatus == null) {
/* 403 */       this.splittersConnectivityStatus = new ArrayList();
/*     */     }
/* 405 */     return this.splittersConnectivityStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GlobalSystemConfiguration getGlobalSystemConfiguation()
/*     */   {
/* 417 */     return this.globalSystemConfiguation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGlobalSystemConfiguation(GlobalSystemConfiguration value)
/*     */   {
/* 429 */     this.globalSystemConfiguation = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointVersion getVersion()
/*     */   {
/* 441 */     return this.version;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVersion(RecoverPointVersion value)
/*     */   {
/* 453 */     this.version = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getHardwareSerialID()
/*     */   {
/* 465 */     return this.hardwareSerialID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setHardwareSerialID(String value)
/*     */   {
/* 477 */     this.hardwareSerialID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getWanIP()
/*     */   {
/* 489 */     return this.wanIP;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setWanIP(String value)
/*     */   {
/* 501 */     this.wanIP = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getManagementIPv4()
/*     */   {
/* 513 */     return this.managementIPv4;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setManagementIPv4(String value)
/*     */   {
/* 525 */     this.managementIPv4 = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getManagementIPv6()
/*     */   {
/* 537 */     return this.managementIPv6;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setManagementIPv6(String value)
/*     */   {
/* 549 */     this.managementIPv6 = value;
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
/*     */   public List<InitiatorInformation> getInitiatorsState()
/*     */   {
/* 575 */     if (this.initiatorsState == null) {
/* 576 */       this.initiatorsState = new ArrayList();
/*     */     }
/* 578 */     return this.initiatorsState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getVendor()
/*     */   {
/* 590 */     return this.vendor;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVendor(String value)
/*     */   {
/* 602 */     this.vendor = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getHardwarePlatform()
/*     */   {
/* 614 */     return this.hardwarePlatform;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setHardwarePlatform(String value)
/*     */   {
/* 626 */     this.hardwarePlatform = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getHbaType()
/*     */   {
/* 634 */     return this.hbaType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setHbaType(long value)
/*     */   {
/* 642 */     this.hbaType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getSystemMemory()
/*     */   {
/* 650 */     return this.systemMemory;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSystemMemory(long value)
/*     */   {
/* 658 */     this.systemMemory = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getNumberOfCores()
/*     */   {
/* 666 */     return this.numberOfCores;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNumberOfCores(long value)
/*     */   {
/* 674 */     this.numberOfCores = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RpaType getType()
/*     */   {
/* 686 */     return this.type;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setType(RpaType value)
/*     */   {
/* 698 */     this.type = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 708 */     if (!(obj instanceof RPAState)) {
/* 709 */       return false;
/*     */     }
/* 711 */     RPAState otherObj = (RPAState)obj;
/*     */     
/* 713 */     return (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID) && (this.status != null ? this.status.equals(otherObj.status) : this.status == otherObj.status) && (this.repositoryConnectivityStatus != null ? this.repositoryConnectivityStatus.equals(otherObj.repositoryConnectivityStatus) : this.repositoryConnectivityStatus == otherObj.repositoryConnectivityStatus) && (this.remoteRPAsDataLinkStatus != null ? this.remoteRPAsDataLinkStatus.equals(otherObj.remoteRPAsDataLinkStatus) : this.remoteRPAsDataLinkStatus == otherObj.remoteRPAsDataLinkStatus) && (this.runningClusterControl == otherObj.runningClusterControl) && (this.remoteRPAsConnectivityStatus != null ? this.remoteRPAsConnectivityStatus.equals(otherObj.remoteRPAsConnectivityStatus) : this.remoteRPAsConnectivityStatus == otherObj.remoteRPAsConnectivityStatus) && (this.localRPAsFiberConnectivityStatus != null ? this.localRPAsFiberConnectivityStatus.equals(otherObj.localRPAsFiberConnectivityStatus) : this.localRPAsFiberConnectivityStatus == otherObj.localRPAsFiberConnectivityStatus) && (this.volumesConnectivityStatus != null ? this.volumesConnectivityStatus.equals(otherObj.volumesConnectivityStatus) : this.volumesConnectivityStatus == otherObj.volumesConnectivityStatus) && (this.interfacesStatus != null ? this.interfacesStatus.equals(otherObj.interfacesStatus) : this.interfacesStatus == otherObj.interfacesStatus) && (this.splittersConnectivityStatus != null ? this.splittersConnectivityStatus.equals(otherObj.splittersConnectivityStatus) : this.splittersConnectivityStatus == otherObj.splittersConnectivityStatus) && (this.globalSystemConfiguation != null ? this.globalSystemConfiguation.equals(otherObj.globalSystemConfiguation) : this.globalSystemConfiguation == otherObj.globalSystemConfiguation) && (this.version != null ? this.version.equals(otherObj.version) : this.version == otherObj.version) && (this.hardwareSerialID != null ? this.hardwareSerialID.equals(otherObj.hardwareSerialID) : this.hardwareSerialID == otherObj.hardwareSerialID) && (this.wanIP != null ? this.wanIP.equals(otherObj.wanIP) : this.wanIP == otherObj.wanIP) && (this.managementIPv4 != null ? this.managementIPv4.equals(otherObj.managementIPv4) : this.managementIPv4 == otherObj.managementIPv4) && (this.managementIPv6 != null ? this.managementIPv6.equals(otherObj.managementIPv6) : this.managementIPv6 == otherObj.managementIPv6) && (this.initiatorsState != null ? this.initiatorsState.equals(otherObj.initiatorsState) : this.initiatorsState == otherObj.initiatorsState) && (this.vendor != null ? this.vendor.equals(otherObj.vendor) : this.vendor == otherObj.vendor) && (this.hardwarePlatform != null ? this.hardwarePlatform.equals(otherObj.hardwarePlatform) : this.hardwarePlatform == otherObj.hardwarePlatform) && (this.hbaType == otherObj.hbaType) && (this.systemMemory == otherObj.systemMemory) && (this.numberOfCores == otherObj.numberOfCores) && (this.type != null ? this.type.equals(otherObj.type) : this.type == otherObj.type);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 744 */     return (this.rpaUID != null ? this.rpaUID.hashCode() : 0) ^ (this.status != null ? this.status.hashCode() : 0) ^ (this.repositoryConnectivityStatus != null ? this.repositoryConnectivityStatus.hashCode() : 0) ^ (this.remoteRPAsDataLinkStatus != null ? this.remoteRPAsDataLinkStatus.hashCode() : 0) ^ (this.runningClusterControl ? 1 : 0) ^ (this.remoteRPAsConnectivityStatus != null ? this.remoteRPAsConnectivityStatus.hashCode() : 0) ^ (this.localRPAsFiberConnectivityStatus != null ? this.localRPAsFiberConnectivityStatus.hashCode() : 0) ^ (this.volumesConnectivityStatus != null ? this.volumesConnectivityStatus.hashCode() : 0) ^ (this.interfacesStatus != null ? this.interfacesStatus.hashCode() : 0) ^ (this.splittersConnectivityStatus != null ? this.splittersConnectivityStatus.hashCode() : 0) ^ (this.globalSystemConfiguation != null ? this.globalSystemConfiguation.hashCode() : 0) ^ (this.version != null ? this.version.hashCode() : 0) ^ (this.hardwareSerialID != null ? this.hardwareSerialID.hashCode() : 0) ^ (this.wanIP != null ? this.wanIP.hashCode() : 0) ^ (this.managementIPv4 != null ? this.managementIPv4.hashCode() : 0) ^ (this.managementIPv6 != null ? this.managementIPv6.hashCode() : 0) ^ (this.initiatorsState != null ? this.initiatorsState.hashCode() : 0) ^ (this.vendor != null ? this.vendor.hashCode() : 0) ^ (this.hardwarePlatform != null ? this.hardwarePlatform.hashCode() : 0) ^ (int)this.hbaType ^ (int)this.systemMemory ^ (int)this.numberOfCores ^ (this.type != null ? this.type.hashCode() : 0);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 775 */     return "RPAState [rpaUID=" + this.rpaUID + ", " + "status=" + this.status + ", " + "repositoryConnectivityStatus=" + this.repositoryConnectivityStatus + ", " + "remoteRPAsDataLinkStatus=" + this.remoteRPAsDataLinkStatus + ", " + "runningClusterControl=" + this.runningClusterControl + ", " + "remoteRPAsConnectivityStatus=" + this.remoteRPAsConnectivityStatus + ", " + "localRPAsFiberConnectivityStatus=" + this.localRPAsFiberConnectivityStatus + ", " + "volumesConnectivityStatus=" + this.volumesConnectivityStatus + ", " + "interfacesStatus=" + this.interfacesStatus + ", " + "splittersConnectivityStatus=" + this.splittersConnectivityStatus + ", " + "globalSystemConfiguation=" + this.globalSystemConfiguation + ", " + "version=" + this.version + ", " + "hardwareSerialID=" + this.hardwareSerialID + ", " + "wanIP=" + this.wanIP + ", " + "managementIPv4=" + this.managementIPv4 + ", " + "managementIPv6=" + this.managementIPv6 + ", " + "initiatorsState=" + this.initiatorsState + ", " + "vendor=" + this.vendor + ", " + "hardwarePlatform=" + this.hardwarePlatform + ", " + "hbaType=" + this.hbaType + ", " + "systemMemory=" + this.systemMemory + ", " + "numberOfCores=" + this.numberOfCores + ", " + "type=" + this.type + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RPAState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */