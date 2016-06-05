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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="EventLog", propOrder={"eventTime", "systemEventUID", "clusterUID", "rpaUID", "eventID", "roles", "groupCopies", "devices", "replicationSets", "splitterVolumes", "grouplinks", "globalLinks", "arrays", "vms", "rpaViews", "splitterViews", "clusterList", "username", "details", "seDetails", "history", "splittersInfo", "groupsInfo", "eventLogInfo", "description"})
/*     */ public class EventLog
/*     */ {
/*     */   protected RecoverPointTimeStamp eventTime;
/*     */   @XmlElement(nillable=true)
/*     */   protected SystemEventUID systemEventUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected RpaUID rpaUID;
/*     */   protected int eventID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RpaUID> roles;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopyInfo> groupCopies;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<DeviceInfo> devices;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ReplicationSetInfo> replicationSets;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SplitterVolumeInfo> splitterVolumes;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupLinkInfo> grouplinks;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<GlobalLinkUID> globalLinks;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ArrayInfo> arrays;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VMEntitiesInformation> vms;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RpaView> rpaViews;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SplitterView> splitterViews;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClusterUID> clusterList;
/*     */   protected String username;
/*     */   protected String details;
/*     */   protected String seDetails;
/*     */   protected boolean history;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SplitterInfo> splittersInfo;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupInfo> groupsInfo;
/*     */   @XmlElement(nillable=true)
/*     */   protected EventLogInfo eventLogInfo;
/*     */   protected String description;
/*     */   
/*     */   public EventLog() {}
/*     */   
/*     */   public EventLog(RecoverPointTimeStamp eventTime, SystemEventUID systemEventUID, ClusterUID clusterUID, RpaUID rpaUID, int eventID, List<RpaUID> roles, List<ConsistencyGroupCopyInfo> groupCopies, List<DeviceInfo> devices, List<ReplicationSetInfo> replicationSets, List<SplitterVolumeInfo> splitterVolumes, List<ConsistencyGroupLinkInfo> grouplinks, List<GlobalLinkUID> globalLinks, List<ArrayInfo> arrays, List<VMEntitiesInformation> vms, List<RpaView> rpaViews, List<SplitterView> splitterViews, List<ClusterUID> clusterList, String username, String details, String seDetails, boolean history, List<SplitterInfo> splittersInfo, List<ConsistencyGroupInfo> groupsInfo, EventLogInfo eventLogInfo, String description)
/*     */   {
/* 137 */     this.eventTime = eventTime;
/* 138 */     this.systemEventUID = systemEventUID;
/* 139 */     this.clusterUID = clusterUID;
/* 140 */     this.rpaUID = rpaUID;
/* 141 */     this.eventID = eventID;
/* 142 */     this.roles = roles;
/* 143 */     this.groupCopies = groupCopies;
/* 144 */     this.devices = devices;
/* 145 */     this.replicationSets = replicationSets;
/* 146 */     this.splitterVolumes = splitterVolumes;
/* 147 */     this.grouplinks = grouplinks;
/* 148 */     this.globalLinks = globalLinks;
/* 149 */     this.arrays = arrays;
/* 150 */     this.vms = vms;
/* 151 */     this.rpaViews = rpaViews;
/* 152 */     this.splitterViews = splitterViews;
/* 153 */     this.clusterList = clusterList;
/* 154 */     this.username = username;
/* 155 */     this.details = details;
/* 156 */     this.seDetails = seDetails;
/* 157 */     this.history = history;
/* 158 */     this.splittersInfo = splittersInfo;
/* 159 */     this.groupsInfo = groupsInfo;
/* 160 */     this.eventLogInfo = eventLogInfo;
/* 161 */     this.description = description;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointTimeStamp getEventTime()
/*     */   {
/* 173 */     return this.eventTime;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEventTime(RecoverPointTimeStamp value)
/*     */   {
/* 185 */     this.eventTime = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SystemEventUID getSystemEventUID()
/*     */   {
/* 197 */     return this.systemEventUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSystemEventUID(SystemEventUID value)
/*     */   {
/* 209 */     this.systemEventUID = value;
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
/* 221 */     return this.clusterUID;
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
/* 233 */     this.clusterUID = value;
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
/* 245 */     return this.rpaUID;
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
/* 257 */     this.rpaUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getEventID()
/*     */   {
/* 265 */     return this.eventID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEventID(int value)
/*     */   {
/* 273 */     this.eventID = value;
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
/*     */   public List<RpaUID> getRoles()
/*     */   {
/* 299 */     if (this.roles == null) {
/* 300 */       this.roles = new ArrayList();
/*     */     }
/* 302 */     return this.roles;
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
/*     */   public List<ConsistencyGroupCopyInfo> getGroupCopies()
/*     */   {
/* 328 */     if (this.groupCopies == null) {
/* 329 */       this.groupCopies = new ArrayList();
/*     */     }
/* 331 */     return this.groupCopies;
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
/*     */   public List<DeviceInfo> getDevices()
/*     */   {
/* 357 */     if (this.devices == null) {
/* 358 */       this.devices = new ArrayList();
/*     */     }
/* 360 */     return this.devices;
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
/*     */   public List<ReplicationSetInfo> getReplicationSets()
/*     */   {
/* 386 */     if (this.replicationSets == null) {
/* 387 */       this.replicationSets = new ArrayList();
/*     */     }
/* 389 */     return this.replicationSets;
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
/*     */   public List<SplitterVolumeInfo> getSplitterVolumes()
/*     */   {
/* 415 */     if (this.splitterVolumes == null) {
/* 416 */       this.splitterVolumes = new ArrayList();
/*     */     }
/* 418 */     return this.splitterVolumes;
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
/*     */   public List<ConsistencyGroupLinkInfo> getGrouplinks()
/*     */   {
/* 444 */     if (this.grouplinks == null) {
/* 445 */       this.grouplinks = new ArrayList();
/*     */     }
/* 447 */     return this.grouplinks;
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
/*     */   public List<GlobalLinkUID> getGlobalLinks()
/*     */   {
/* 473 */     if (this.globalLinks == null) {
/* 474 */       this.globalLinks = new ArrayList();
/*     */     }
/* 476 */     return this.globalLinks;
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
/*     */   public List<ArrayInfo> getArrays()
/*     */   {
/* 502 */     if (this.arrays == null) {
/* 503 */       this.arrays = new ArrayList();
/*     */     }
/* 505 */     return this.arrays;
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
/*     */   public List<VMEntitiesInformation> getVms()
/*     */   {
/* 531 */     if (this.vms == null) {
/* 532 */       this.vms = new ArrayList();
/*     */     }
/* 534 */     return this.vms;
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
/*     */   public List<RpaView> getRpaViews()
/*     */   {
/* 560 */     if (this.rpaViews == null) {
/* 561 */       this.rpaViews = new ArrayList();
/*     */     }
/* 563 */     return this.rpaViews;
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
/*     */   public List<SplitterView> getSplitterViews()
/*     */   {
/* 589 */     if (this.splitterViews == null) {
/* 590 */       this.splitterViews = new ArrayList();
/*     */     }
/* 592 */     return this.splitterViews;
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
/*     */   public List<ClusterUID> getClusterList()
/*     */   {
/* 618 */     if (this.clusterList == null) {
/* 619 */       this.clusterList = new ArrayList();
/*     */     }
/* 621 */     return this.clusterList;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getUsername()
/*     */   {
/* 633 */     return this.username;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUsername(String value)
/*     */   {
/* 645 */     this.username = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getDetails()
/*     */   {
/* 657 */     return this.details;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDetails(String value)
/*     */   {
/* 669 */     this.details = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSeDetails()
/*     */   {
/* 681 */     return this.seDetails;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSeDetails(String value)
/*     */   {
/* 693 */     this.seDetails = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isHistory()
/*     */   {
/* 701 */     return this.history;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setHistory(boolean value)
/*     */   {
/* 709 */     this.history = value;
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
/*     */   public List<SplitterInfo> getSplittersInfo()
/*     */   {
/* 735 */     if (this.splittersInfo == null) {
/* 736 */       this.splittersInfo = new ArrayList();
/*     */     }
/* 738 */     return this.splittersInfo;
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
/*     */   public List<ConsistencyGroupInfo> getGroupsInfo()
/*     */   {
/* 764 */     if (this.groupsInfo == null) {
/* 765 */       this.groupsInfo = new ArrayList();
/*     */     }
/* 767 */     return this.groupsInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public EventLogInfo getEventLogInfo()
/*     */   {
/* 779 */     return this.eventLogInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEventLogInfo(EventLogInfo value)
/*     */   {
/* 791 */     this.eventLogInfo = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getDescription()
/*     */   {
/* 803 */     return this.description;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDescription(String value)
/*     */   {
/* 815 */     this.description = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 825 */     if (!(obj instanceof EventLog)) {
/* 826 */       return false;
/*     */     }
/* 828 */     EventLog otherObj = (EventLog)obj;
/*     */     
/* 830 */     return (this.eventTime != null ? this.eventTime.equals(otherObj.eventTime) : this.eventTime == otherObj.eventTime) && (this.systemEventUID != null ? this.systemEventUID.equals(otherObj.systemEventUID) : this.systemEventUID == otherObj.systemEventUID) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID) && (this.eventID == otherObj.eventID) && (this.roles != null ? this.roles.equals(otherObj.roles) : this.roles == otherObj.roles) && (this.groupCopies != null ? this.groupCopies.equals(otherObj.groupCopies) : this.groupCopies == otherObj.groupCopies) && (this.devices != null ? this.devices.equals(otherObj.devices) : this.devices == otherObj.devices) && (this.replicationSets != null ? this.replicationSets.equals(otherObj.replicationSets) : this.replicationSets == otherObj.replicationSets) && (this.splitterVolumes != null ? this.splitterVolumes.equals(otherObj.splitterVolumes) : this.splitterVolumes == otherObj.splitterVolumes) && (this.grouplinks != null ? this.grouplinks.equals(otherObj.grouplinks) : this.grouplinks == otherObj.grouplinks) && (this.globalLinks != null ? this.globalLinks.equals(otherObj.globalLinks) : this.globalLinks == otherObj.globalLinks) && (this.arrays != null ? this.arrays.equals(otherObj.arrays) : this.arrays == otherObj.arrays) && (this.vms != null ? this.vms.equals(otherObj.vms) : this.vms == otherObj.vms) && (this.rpaViews != null ? this.rpaViews.equals(otherObj.rpaViews) : this.rpaViews == otherObj.rpaViews) && (this.splitterViews != null ? this.splitterViews.equals(otherObj.splitterViews) : this.splitterViews == otherObj.splitterViews) && (this.clusterList != null ? this.clusterList.equals(otherObj.clusterList) : this.clusterList == otherObj.clusterList) && (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username) && (this.details != null ? this.details.equals(otherObj.details) : this.details == otherObj.details) && (this.seDetails != null ? this.seDetails.equals(otherObj.seDetails) : this.seDetails == otherObj.seDetails) && (this.history == otherObj.history) && (this.splittersInfo != null ? this.splittersInfo.equals(otherObj.splittersInfo) : this.splittersInfo == otherObj.splittersInfo) && (this.groupsInfo != null ? this.groupsInfo.equals(otherObj.groupsInfo) : this.groupsInfo == otherObj.groupsInfo) && (this.eventLogInfo != null ? this.eventLogInfo.equals(otherObj.eventLogInfo) : this.eventLogInfo == otherObj.eventLogInfo) && (this.description != null ? this.description.equals(otherObj.description) : this.description == otherObj.description);
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
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 863 */     return (this.eventTime != null ? this.eventTime.hashCode() : 0) ^ (this.systemEventUID != null ? this.systemEventUID.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.rpaUID != null ? this.rpaUID.hashCode() : 0) ^ this.eventID ^ (this.roles != null ? this.roles.hashCode() : 0) ^ (this.groupCopies != null ? this.groupCopies.hashCode() : 0) ^ (this.devices != null ? this.devices.hashCode() : 0) ^ (this.replicationSets != null ? this.replicationSets.hashCode() : 0) ^ (this.splitterVolumes != null ? this.splitterVolumes.hashCode() : 0) ^ (this.grouplinks != null ? this.grouplinks.hashCode() : 0) ^ (this.globalLinks != null ? this.globalLinks.hashCode() : 0) ^ (this.arrays != null ? this.arrays.hashCode() : 0) ^ (this.vms != null ? this.vms.hashCode() : 0) ^ (this.rpaViews != null ? this.rpaViews.hashCode() : 0) ^ (this.splitterViews != null ? this.splitterViews.hashCode() : 0) ^ (this.clusterList != null ? this.clusterList.hashCode() : 0) ^ (this.username != null ? this.username.hashCode() : 0) ^ (this.details != null ? this.details.hashCode() : 0) ^ (this.seDetails != null ? this.seDetails.hashCode() : 0) ^ (this.history ? 1 : 0) ^ (this.splittersInfo != null ? this.splittersInfo.hashCode() : 0) ^ (this.groupsInfo != null ? this.groupsInfo.hashCode() : 0) ^ (this.eventLogInfo != null ? this.eventLogInfo.hashCode() : 0) ^ (this.description != null ? this.description.hashCode() : 0);
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
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 896 */     return "EventLog [eventTime=" + this.eventTime + ", " + "systemEventUID=" + this.systemEventUID + ", " + "clusterUID=" + this.clusterUID + ", " + "rpaUID=" + this.rpaUID + ", " + "eventID=" + this.eventID + ", " + "roles=" + this.roles + ", " + "groupCopies=" + this.groupCopies + ", " + "devices=" + this.devices + ", " + "replicationSets=" + this.replicationSets + ", " + "splitterVolumes=" + this.splitterVolumes + ", " + "grouplinks=" + this.grouplinks + ", " + "globalLinks=" + this.globalLinks + ", " + "arrays=" + this.arrays + ", " + "vms=" + this.vms + ", " + "rpaViews=" + this.rpaViews + ", " + "splitterViews=" + this.splitterViews + ", " + "clusterList=" + this.clusterList + ", " + "username=" + this.username + ", " + "details=" + this.details + ", " + "seDetails=" + this.seDetails + ", " + "history=" + this.history + ", " + "splittersInfo=" + this.splittersInfo + ", " + "groupsInfo=" + this.groupsInfo + ", " + "eventLogInfo=" + this.eventLogInfo + ", " + "description=" + this.description + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EventLog.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */