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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="FullRecoverPointState", propOrder={"groupsState", "groupsVolumesState", "splittersState", "arrayManagementProvidersState", "rpasState", "accountState", "repositoriesState", "clustersPhoenixClustersState", "monitoredParametersStatus", "internalConfigParamsConflict", "linksState", "systemVersionState", "virtualInfrastructuresState", "protectedVMsCount"})
/*     */ public class FullRecoverPointState
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupState> groupsState;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupVolumesState> groupsVolumesState;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClusterSplittersState> splittersState;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClusterArrayManagementProvidersState> arrayManagementProvidersState;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClusterRPAsState> rpasState;
/*     */   @XmlElement(nillable=true)
/*     */   protected AccountState accountState;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RepositoryVolumeState> repositoriesState;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<PhoenixClusterState> clustersPhoenixClustersState;
/*     */   @XmlElement(nillable=true)
/*     */   protected MonitoredParametersStatus monitoredParametersStatus;
/*     */   protected boolean internalConfigParamsConflict;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<GlobalLinkState> linksState;
/*     */   @XmlElement(nillable=true)
/*     */   protected SystemVersionState systemVersionState;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClusterVirtualInfrastructuresState> virtualInfrastructuresState;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VirtualCenterProtectedVmCountState> protectedVMsCount;
/*     */   
/*     */   public FullRecoverPointState() {}
/*     */   
/*     */   public FullRecoverPointState(List<ConsistencyGroupState> groupsState, List<ConsistencyGroupVolumesState> groupsVolumesState, List<ClusterSplittersState> splittersState, List<ClusterArrayManagementProvidersState> arrayManagementProvidersState, List<ClusterRPAsState> rpasState, AccountState accountState, List<RepositoryVolumeState> repositoriesState, List<PhoenixClusterState> clustersPhoenixClustersState, MonitoredParametersStatus monitoredParametersStatus, boolean internalConfigParamsConflict, List<GlobalLinkState> linksState, SystemVersionState systemVersionState, List<ClusterVirtualInfrastructuresState> virtualInfrastructuresState, List<VirtualCenterProtectedVmCountState> protectedVMsCount)
/*     */   {
/*  99 */     this.groupsState = groupsState;
/* 100 */     this.groupsVolumesState = groupsVolumesState;
/* 101 */     this.splittersState = splittersState;
/* 102 */     this.arrayManagementProvidersState = arrayManagementProvidersState;
/* 103 */     this.rpasState = rpasState;
/* 104 */     this.accountState = accountState;
/* 105 */     this.repositoriesState = repositoriesState;
/* 106 */     this.clustersPhoenixClustersState = clustersPhoenixClustersState;
/* 107 */     this.monitoredParametersStatus = monitoredParametersStatus;
/* 108 */     this.internalConfigParamsConflict = internalConfigParamsConflict;
/* 109 */     this.linksState = linksState;
/* 110 */     this.systemVersionState = systemVersionState;
/* 111 */     this.virtualInfrastructuresState = virtualInfrastructuresState;
/* 112 */     this.protectedVMsCount = protectedVMsCount;
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
/*     */   public List<ConsistencyGroupState> getGroupsState()
/*     */   {
/* 138 */     if (this.groupsState == null) {
/* 139 */       this.groupsState = new ArrayList();
/*     */     }
/* 141 */     return this.groupsState;
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
/*     */   public List<ConsistencyGroupVolumesState> getGroupsVolumesState()
/*     */   {
/* 167 */     if (this.groupsVolumesState == null) {
/* 168 */       this.groupsVolumesState = new ArrayList();
/*     */     }
/* 170 */     return this.groupsVolumesState;
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
/*     */   public List<ClusterSplittersState> getSplittersState()
/*     */   {
/* 196 */     if (this.splittersState == null) {
/* 197 */       this.splittersState = new ArrayList();
/*     */     }
/* 199 */     return this.splittersState;
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
/*     */   public List<ClusterArrayManagementProvidersState> getArrayManagementProvidersState()
/*     */   {
/* 225 */     if (this.arrayManagementProvidersState == null) {
/* 226 */       this.arrayManagementProvidersState = new ArrayList();
/*     */     }
/* 228 */     return this.arrayManagementProvidersState;
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
/*     */   public List<ClusterRPAsState> getRpasState()
/*     */   {
/* 254 */     if (this.rpasState == null) {
/* 255 */       this.rpasState = new ArrayList();
/*     */     }
/* 257 */     return this.rpasState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public AccountState getAccountState()
/*     */   {
/* 269 */     return this.accountState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAccountState(AccountState value)
/*     */   {
/* 281 */     this.accountState = value;
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
/*     */   public List<RepositoryVolumeState> getRepositoriesState()
/*     */   {
/* 307 */     if (this.repositoriesState == null) {
/* 308 */       this.repositoriesState = new ArrayList();
/*     */     }
/* 310 */     return this.repositoriesState;
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
/*     */   public List<PhoenixClusterState> getClustersPhoenixClustersState()
/*     */   {
/* 336 */     if (this.clustersPhoenixClustersState == null) {
/* 337 */       this.clustersPhoenixClustersState = new ArrayList();
/*     */     }
/* 339 */     return this.clustersPhoenixClustersState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public MonitoredParametersStatus getMonitoredParametersStatus()
/*     */   {
/* 351 */     return this.monitoredParametersStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMonitoredParametersStatus(MonitoredParametersStatus value)
/*     */   {
/* 363 */     this.monitoredParametersStatus = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isInternalConfigParamsConflict()
/*     */   {
/* 371 */     return this.internalConfigParamsConflict;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setInternalConfigParamsConflict(boolean value)
/*     */   {
/* 379 */     this.internalConfigParamsConflict = value;
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
/*     */   public List<GlobalLinkState> getLinksState()
/*     */   {
/* 405 */     if (this.linksState == null) {
/* 406 */       this.linksState = new ArrayList();
/*     */     }
/* 408 */     return this.linksState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SystemVersionState getSystemVersionState()
/*     */   {
/* 420 */     return this.systemVersionState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSystemVersionState(SystemVersionState value)
/*     */   {
/* 432 */     this.systemVersionState = value;
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
/*     */   public List<ClusterVirtualInfrastructuresState> getVirtualInfrastructuresState()
/*     */   {
/* 458 */     if (this.virtualInfrastructuresState == null) {
/* 459 */       this.virtualInfrastructuresState = new ArrayList();
/*     */     }
/* 461 */     return this.virtualInfrastructuresState;
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
/*     */   public List<VirtualCenterProtectedVmCountState> getProtectedVMsCount()
/*     */   {
/* 487 */     if (this.protectedVMsCount == null) {
/* 488 */       this.protectedVMsCount = new ArrayList();
/*     */     }
/* 490 */     return this.protectedVMsCount;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 500 */     if (!(obj instanceof FullRecoverPointState)) {
/* 501 */       return false;
/*     */     }
/* 503 */     FullRecoverPointState otherObj = (FullRecoverPointState)obj;
/*     */     
/* 505 */     return (this.groupsState != null ? this.groupsState.equals(otherObj.groupsState) : this.groupsState == otherObj.groupsState) && (this.groupsVolumesState != null ? this.groupsVolumesState.equals(otherObj.groupsVolumesState) : this.groupsVolumesState == otherObj.groupsVolumesState) && (this.splittersState != null ? this.splittersState.equals(otherObj.splittersState) : this.splittersState == otherObj.splittersState) && (this.arrayManagementProvidersState != null ? this.arrayManagementProvidersState.equals(otherObj.arrayManagementProvidersState) : this.arrayManagementProvidersState == otherObj.arrayManagementProvidersState) && (this.rpasState != null ? this.rpasState.equals(otherObj.rpasState) : this.rpasState == otherObj.rpasState) && (this.accountState != null ? this.accountState.equals(otherObj.accountState) : this.accountState == otherObj.accountState) && (this.repositoriesState != null ? this.repositoriesState.equals(otherObj.repositoriesState) : this.repositoriesState == otherObj.repositoriesState) && (this.clustersPhoenixClustersState != null ? this.clustersPhoenixClustersState.equals(otherObj.clustersPhoenixClustersState) : this.clustersPhoenixClustersState == otherObj.clustersPhoenixClustersState) && (this.monitoredParametersStatus != null ? this.monitoredParametersStatus.equals(otherObj.monitoredParametersStatus) : this.monitoredParametersStatus == otherObj.monitoredParametersStatus) && (this.internalConfigParamsConflict == otherObj.internalConfigParamsConflict) && (this.linksState != null ? this.linksState.equals(otherObj.linksState) : this.linksState == otherObj.linksState) && (this.systemVersionState != null ? this.systemVersionState.equals(otherObj.systemVersionState) : this.systemVersionState == otherObj.systemVersionState) && (this.virtualInfrastructuresState != null ? this.virtualInfrastructuresState.equals(otherObj.virtualInfrastructuresState) : this.virtualInfrastructuresState == otherObj.virtualInfrastructuresState) && (this.protectedVMsCount != null ? this.protectedVMsCount.equals(otherObj.protectedVMsCount) : this.protectedVMsCount == otherObj.protectedVMsCount);
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
/*     */   public int hashCode()
/*     */   {
/* 527 */     return (this.groupsState != null ? this.groupsState.hashCode() : 0) ^ (this.groupsVolumesState != null ? this.groupsVolumesState.hashCode() : 0) ^ (this.splittersState != null ? this.splittersState.hashCode() : 0) ^ (this.arrayManagementProvidersState != null ? this.arrayManagementProvidersState.hashCode() : 0) ^ (this.rpasState != null ? this.rpasState.hashCode() : 0) ^ (this.accountState != null ? this.accountState.hashCode() : 0) ^ (this.repositoriesState != null ? this.repositoriesState.hashCode() : 0) ^ (this.clustersPhoenixClustersState != null ? this.clustersPhoenixClustersState.hashCode() : 0) ^ (this.monitoredParametersStatus != null ? this.monitoredParametersStatus.hashCode() : 0) ^ (this.internalConfigParamsConflict ? 1 : 0) ^ (this.linksState != null ? this.linksState.hashCode() : 0) ^ (this.systemVersionState != null ? this.systemVersionState.hashCode() : 0) ^ (this.virtualInfrastructuresState != null ? this.virtualInfrastructuresState.hashCode() : 0) ^ (this.protectedVMsCount != null ? this.protectedVMsCount.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 549 */     return "FullRecoverPointState [groupsState=" + this.groupsState + ", " + "groupsVolumesState=" + this.groupsVolumesState + ", " + "splittersState=" + this.splittersState + ", " + "arrayManagementProvidersState=" + this.arrayManagementProvidersState + ", " + "rpasState=" + this.rpasState + ", " + "accountState=" + this.accountState + ", " + "repositoriesState=" + this.repositoriesState + ", " + "clustersPhoenixClustersState=" + this.clustersPhoenixClustersState + ", " + "monitoredParametersStatus=" + this.monitoredParametersStatus + ", " + "internalConfigParamsConflict=" + this.internalConfigParamsConflict + ", " + "linksState=" + this.linksState + ", " + "systemVersionState=" + this.systemVersionState + ", " + "virtualInfrastructuresState=" + this.virtualInfrastructuresState + ", " + "protectedVMsCount=" + this.protectedVMsCount + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FullRecoverPointState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */