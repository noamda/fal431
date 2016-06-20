package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullRecoverPointState", propOrder = {"groupsState", "groupsVolumesState", "splittersState", "arrayManagementProvidersState", "rpasState", "accountState", "repositoriesState", "clustersPhoenixClustersState", "monitoredParametersStatus", "internalConfigParamsConflict", "linksState", "systemVersionState", "virtualInfrastructuresState", "protectedVMsCount"})
public class FullRecoverPointState {
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupState> groupsState;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupVolumesState> groupsVolumesState;
    @XmlElement(nillable = true)
    protected List<ClusterSplittersState> splittersState;
    @XmlElement(nillable = true)
    protected List<ClusterArrayManagementProvidersState> arrayManagementProvidersState;
    @XmlElement(nillable = true)
    protected List<ClusterRPAsState> rpasState;
    @XmlElement(nillable = true)
    protected AccountState accountState;
    @XmlElement(nillable = true)
    protected List<RepositoryVolumeState> repositoriesState;
    @XmlElement(nillable = true)
    protected List<PhoenixClusterState> clustersPhoenixClustersState;
    @XmlElement(nillable = true)
    protected MonitoredParametersStatus monitoredParametersStatus;
    protected boolean internalConfigParamsConflict;
    @XmlElement(nillable = true)
    protected List<GlobalLinkState> linksState;
    @XmlElement(nillable = true)
    protected SystemVersionState systemVersionState;
    @XmlElement(nillable = true)
    protected List<ClusterVirtualInfrastructuresState> virtualInfrastructuresState;
    @XmlElement(nillable = true)
    protected List<VirtualCenterProtectedVmCountState> protectedVMsCount;

    public FullRecoverPointState() {
    }

    public FullRecoverPointState(List<ConsistencyGroupState> groupsState, List<ConsistencyGroupVolumesState> groupsVolumesState, List<ClusterSplittersState> splittersState, List<ClusterArrayManagementProvidersState> arrayManagementProvidersState, List<ClusterRPAsState> rpasState, AccountState accountState, List<RepositoryVolumeState> repositoriesState, List<PhoenixClusterState> clustersPhoenixClustersState, MonitoredParametersStatus monitoredParametersStatus, boolean internalConfigParamsConflict, List<GlobalLinkState> linksState, SystemVersionState systemVersionState, List<ClusterVirtualInfrastructuresState> virtualInfrastructuresState, List<VirtualCenterProtectedVmCountState> protectedVMsCount) {
        this.groupsState = groupsState;
        this.groupsVolumesState = groupsVolumesState;
        this.splittersState = splittersState;
        this.arrayManagementProvidersState = arrayManagementProvidersState;
        this.rpasState = rpasState;
        this.accountState = accountState;
        this.repositoriesState = repositoriesState;
        this.clustersPhoenixClustersState = clustersPhoenixClustersState;
        this.monitoredParametersStatus = monitoredParametersStatus;
        this.internalConfigParamsConflict = internalConfigParamsConflict;
        this.linksState = linksState;
        this.systemVersionState = systemVersionState;
        this.virtualInfrastructuresState = virtualInfrastructuresState;
        this.protectedVMsCount = protectedVMsCount;
    }


    public List<ConsistencyGroupState> getGroupsState() {
        if (this.groupsState == null) {
            this.groupsState = new ArrayList();
        }
        return this.groupsState;
    }


    public List<ConsistencyGroupVolumesState> getGroupsVolumesState() {
        if (this.groupsVolumesState == null) {
            this.groupsVolumesState = new ArrayList();
        }
        return this.groupsVolumesState;
    }


    public List<ClusterSplittersState> getSplittersState() {
        if (this.splittersState == null) {
            this.splittersState = new ArrayList();
        }
        return this.splittersState;
    }


    public List<ClusterArrayManagementProvidersState> getArrayManagementProvidersState() {
        if (this.arrayManagementProvidersState == null) {
            this.arrayManagementProvidersState = new ArrayList();
        }
        return this.arrayManagementProvidersState;
    }


    public List<ClusterRPAsState> getRpasState() {
        if (this.rpasState == null) {
            this.rpasState = new ArrayList();
        }
        return this.rpasState;
    }


    public AccountState getAccountState() {
        return this.accountState;
    }


    public void setAccountState(AccountState value) {
        this.accountState = value;
    }


    public List<RepositoryVolumeState> getRepositoriesState() {
        if (this.repositoriesState == null) {
            this.repositoriesState = new ArrayList();
        }
        return this.repositoriesState;
    }


    public List<PhoenixClusterState> getClustersPhoenixClustersState() {
        if (this.clustersPhoenixClustersState == null) {
            this.clustersPhoenixClustersState = new ArrayList();
        }
        return this.clustersPhoenixClustersState;
    }


    public MonitoredParametersStatus getMonitoredParametersStatus() {
        return this.monitoredParametersStatus;
    }


    public void setMonitoredParametersStatus(MonitoredParametersStatus value) {
        this.monitoredParametersStatus = value;
    }


    public boolean isInternalConfigParamsConflict() {
        return this.internalConfigParamsConflict;
    }


    public void setInternalConfigParamsConflict(boolean value) {
        this.internalConfigParamsConflict = value;
    }


    public List<GlobalLinkState> getLinksState() {
        if (this.linksState == null) {
            this.linksState = new ArrayList();
        }
        return this.linksState;
    }


    public SystemVersionState getSystemVersionState() {
        return this.systemVersionState;
    }


    public void setSystemVersionState(SystemVersionState value) {
        this.systemVersionState = value;
    }


    public List<ClusterVirtualInfrastructuresState> getVirtualInfrastructuresState() {
        if (this.virtualInfrastructuresState == null) {
            this.virtualInfrastructuresState = new ArrayList();
        }
        return this.virtualInfrastructuresState;
    }


    public List<VirtualCenterProtectedVmCountState> getProtectedVMsCount() {
        if (this.protectedVMsCount == null) {
            this.protectedVMsCount = new ArrayList();
        }
        return this.protectedVMsCount;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FullRecoverPointState)) {
            return false;
        }
        FullRecoverPointState otherObj = (FullRecoverPointState) obj;

        return (this.groupsState != null ? this.groupsState.equals(otherObj.groupsState) : this.groupsState == otherObj.groupsState) && (this.groupsVolumesState != null ? this.groupsVolumesState.equals(otherObj.groupsVolumesState) : this.groupsVolumesState == otherObj.groupsVolumesState) && (this.splittersState != null ? this.splittersState.equals(otherObj.splittersState) : this.splittersState == otherObj.splittersState) && (this.arrayManagementProvidersState != null ? this.arrayManagementProvidersState.equals(otherObj.arrayManagementProvidersState) : this.arrayManagementProvidersState == otherObj.arrayManagementProvidersState) && (this.rpasState != null ? this.rpasState.equals(otherObj.rpasState) : this.rpasState == otherObj.rpasState) && (this.accountState != null ? this.accountState.equals(otherObj.accountState) : this.accountState == otherObj.accountState) && (this.repositoriesState != null ? this.repositoriesState.equals(otherObj.repositoriesState) : this.repositoriesState == otherObj.repositoriesState) && (this.clustersPhoenixClustersState != null ? this.clustersPhoenixClustersState.equals(otherObj.clustersPhoenixClustersState) : this.clustersPhoenixClustersState == otherObj.clustersPhoenixClustersState) && (this.monitoredParametersStatus != null ? this.monitoredParametersStatus.equals(otherObj.monitoredParametersStatus) : this.monitoredParametersStatus == otherObj.monitoredParametersStatus) && (this.internalConfigParamsConflict == otherObj.internalConfigParamsConflict) && (this.linksState != null ? this.linksState.equals(otherObj.linksState) : this.linksState == otherObj.linksState) && (this.systemVersionState != null ? this.systemVersionState.equals(otherObj.systemVersionState) : this.systemVersionState == otherObj.systemVersionState) && (this.virtualInfrastructuresState != null ? this.virtualInfrastructuresState.equals(otherObj.virtualInfrastructuresState) : this.virtualInfrastructuresState == otherObj.virtualInfrastructuresState) && (this.protectedVMsCount != null ? this.protectedVMsCount.equals(otherObj.protectedVMsCount) : this.protectedVMsCount == otherObj.protectedVMsCount);
    }


    public int hashCode() {
        return (this.groupsState != null ? this.groupsState.hashCode() : 0) ^ (this.groupsVolumesState != null ? this.groupsVolumesState.hashCode() : 0) ^ (this.splittersState != null ? this.splittersState.hashCode() : 0) ^ (this.arrayManagementProvidersState != null ? this.arrayManagementProvidersState.hashCode() : 0) ^ (this.rpasState != null ? this.rpasState.hashCode() : 0) ^ (this.accountState != null ? this.accountState.hashCode() : 0) ^ (this.repositoriesState != null ? this.repositoriesState.hashCode() : 0) ^ (this.clustersPhoenixClustersState != null ? this.clustersPhoenixClustersState.hashCode() : 0) ^ (this.monitoredParametersStatus != null ? this.monitoredParametersStatus.hashCode() : 0) ^ (this.internalConfigParamsConflict ? 1 : 0) ^ (this.linksState != null ? this.linksState.hashCode() : 0) ^ (this.systemVersionState != null ? this.systemVersionState.hashCode() : 0) ^ (this.virtualInfrastructuresState != null ? this.virtualInfrastructuresState.hashCode() : 0) ^ (this.protectedVMsCount != null ? this.protectedVMsCount.hashCode() : 0);
    }


    public String toString() {
        return "FullRecoverPointState [groupsState=" + this.groupsState + ", " + "groupsVolumesState=" + this.groupsVolumesState + ", " + "splittersState=" + this.splittersState + ", " + "arrayManagementProvidersState=" + this.arrayManagementProvidersState + ", " + "rpasState=" + this.rpasState + ", " + "accountState=" + this.accountState + ", " + "repositoriesState=" + this.repositoriesState + ", " + "clustersPhoenixClustersState=" + this.clustersPhoenixClustersState + ", " + "monitoredParametersStatus=" + this.monitoredParametersStatus + ", " + "internalConfigParamsConflict=" + this.internalConfigParamsConflict + ", " + "linksState=" + this.linksState + ", " + "systemVersionState=" + this.systemVersionState + ", " + "virtualInfrastructuresState=" + this.virtualInfrastructuresState + ", " + "protectedVMsCount=" + this.protectedVMsCount + "]";
    }
}


