package com.emc.fapi.jaxws.v4_3_1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import java.util.List;

@WebService(name = "FunctionalAPIImpl", targetNamespace = "http:
        @XmlSeeAlso({ObjectFactory.class})
        public abstract interface FunctionalAPIImpl
        {
                @WebMethod
        @RequestWrapper(localName = "clearSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "clearSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void clearSettings()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getGlobalLinksState", targetNamespace = "http:
        @ResponseWrapper(localName = "getGlobalLinksStateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<GlobalLinkState>getGlobalLinksState()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getAllRecoveryActivities", targetNamespace = "http:
        @ResponseWrapper(localName = "getAllRecoveryActivitiesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<BaseRecoveryActivity>getAllRecoveryActivities()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getMonitoredParametersStatus", targetNamespace = "http:
        @ResponseWrapper(localName = "getMonitoredParametersStatusResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract MonitoredParametersStatus getMonitoredParametersStatus()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getRPAsStateFromAllClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "getRPAsStateFromAllClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ClusterRPAsState>getRPAsStateFromAllClusters()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getRPAsStateFromCluster", targetNamespace = "http:
        @ResponseWrapper(localName = "getRPAsStateFromClusterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClusterRPAsState getRPAsStateFromCluster(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getRPAState", targetNamespace = "http:
        @ResponseWrapper(localName = "getRPAStateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract RPAState getRPAState(@WebParam(name = "rpa", targetNamespace = "") RpaUID paramRpaUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSystemSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "getSystemSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SystemSettings getSystemSettings()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSystemSettingsConflicts", targetNamespace = "http:
        @ResponseWrapper(localName = "getSystemSettingsConflictsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SystemSettingsConflicts getSystemSettingsConflicts()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getManagementSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "getManagementSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ManagementSettings getManagementSettings()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSystemStatus", targetNamespace = "http:
        @ResponseWrapper(localName = "getSystemStatusResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SystemStatus getSystemStatus()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "verifyRPAStateWithDefaultTimeout", targetNamespace = "http:
        @ResponseWrapper(localName = "verifyRPAStateWithDefaultTimeoutResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TransactionID verifyRPAStateWithDefaultTimeout(@WebParam(name = "rpa", targetNamespace = "") RpaUID paramRpaUID, @WebParam(name = "state", targetNamespace = "") VerifyRPAStateParam paramVerifyRPAStateParam)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "verifyRPAState", targetNamespace = "http:
        @ResponseWrapper(localName = "verifyRPAStateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TransactionID verifyRPAState(@WebParam(name = "rpa", targetNamespace = "") RpaUID paramRpaUID, @WebParam(name = "state", targetNamespace = "") VerifyRPAStateParam paramVerifyRPAStateParam,@WebParam(name = "timeoutInSeconds", targetNamespace = "")long paramLong)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "collectLogs", targetNamespace = "http:
        @ResponseWrapper(localName = "collectLogsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TransactionID collectLogs(@WebParam(name = "params", targetNamespace = "") CollectLogsParams paramCollectLogsParams)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSystemGlobalPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "getSystemGlobalPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SystemGlobalPolicy getSystemGlobalPolicy()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getDefaultSystemGlobalPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "getDefaultSystemGlobalPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SystemGlobalPolicy getDefaultSystemGlobalPolicy()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setSystemGlobalPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "setSystemGlobalPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setSystemGlobalPolicy(@WebParam(name = "policy", targetNamespace = "") SystemGlobalPolicy paramSystemGlobalPolicy)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "resolveSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "resolveSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void resolveSettings(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getDefaultConsistencyGroupPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "getDefaultConsistencyGroupPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupPolicy getDefaultConsistencyGroupPolicy()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getDefaultConsistencyGroupCopyPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "getDefaultConsistencyGroupCopyPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupCopyPolicy getDefaultConsistencyGroupCopyPolicy()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getDefaultConsistencyGroupLinkPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "getDefaultConsistencyGroupLinkPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupLinkPolicy getDefaultConsistencyGroupLinkPolicy(@WebParam(name = "isLocalLink", targetNamespace = "")boolean paramBoolean)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getAvailableSplittersFromAllClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "getAvailableSplittersFromAllClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ClusterAvailableSplitters>getAvailableSplittersFromAllClusters()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getAvailableSplittersFromCluster", targetNamespace = "http:
        @ResponseWrapper(localName = "getAvailableSplittersFromClusterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClusterAvailableSplitters getAvailableSplittersFromCluster(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getAvailableSplittersToAttachToVolume", targetNamespace = "http:
        @ResponseWrapper(localName = "getAvailableSplittersToAttachToVolumeResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<SplitterUID>getAvailableSplittersToAttachToVolume(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "volumeID", targetNamespace = "")DeviceUID paramDeviceUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getSplittersWithUnattachedVolumes", targetNamespace = "http:
        @ResponseWrapper(localName = "getSplittersWithUnattachedVolumesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<SplitterUID>getSplittersWithUnattachedVolumes(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getAvailableVolumesToAttachToSplitter", targetNamespace = "http:
        @ResponseWrapper(localName = "getAvailableVolumesToAttachToSplitterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<DeviceUID>getAvailableVolumesToAttachToSplitter(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID, @WebParam(name = "filterUnseenVolumes", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getSplitterName", targetNamespace = "http:
        @ResponseWrapper(localName = "getSplitterNameResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract String getSplitterName(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "addSplitter", targetNamespace = "http:
        @ResponseWrapper(localName = "addSplitterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void addSplitter(@WebParam(name = "splitterInfo", targetNamespace = "") SplitterInfo paramSplitterInfo)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "setAttachedVolumesForSplitter", targetNamespace = "http:
        @ResponseWrapper(localName = "setAttachedVolumesForSplitterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setAttachedVolumesForSplitter(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID, @WebParam(name = "volumes", targetNamespace = "")List<SetVolumeParam>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateSetAttachedVolumesForSplitter", targetNamespace = "http:
        @ResponseWrapper(localName = "validateSetAttachedVolumesForSplitterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateSetAttachedVolumesForSplitter(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID, @WebParam(name = "volumes", targetNamespace = "")List<SetVolumeParam>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "attachVolumeToSplitter", targetNamespace = "http:
        @ResponseWrapper(localName = "attachVolumeToSplitterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void attachVolumeToSplitter(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID, @WebParam(name = "volumeParam", targetNamespace = "")SetVolumeParam paramSetVolumeParam)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateAttachVolumeToSplitter", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAttachVolumeToSplitterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAttachVolumeToSplitter(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID, @WebParam(name = "volumeParam", targetNamespace = "")SetVolumeParam paramSetVolumeParam)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "attachVolumesToSplitter", targetNamespace = "http:
        @ResponseWrapper(localName = "attachVolumesToSplitterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void attachVolumesToSplitter(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID, @WebParam(name = "volumesParams", targetNamespace = "")List<SetVolumeParam>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateAttachVolumesToSplitter", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAttachVolumesToSplitterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAttachVolumesToSplitter(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID, @WebParam(name = "volumesParams", targetNamespace = "")List<SetVolumeParam>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "detachVolumeFromSplitter", targetNamespace = "http:
        @ResponseWrapper(localName = "detachVolumeFromSplitterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void detachVolumeFromSplitter(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID, @WebParam(name = "volumeID", targetNamespace = "")DeviceUID paramDeviceUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateDetachVolumeFromSplitter", targetNamespace = "http:
        @ResponseWrapper(localName = "validateDetachVolumeFromSplitterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateDetachVolumeFromSplitter(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID, @WebParam(name = "volumeID", targetNamespace = "")DeviceUID paramDeviceUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "detachVolumesFromSplitter", targetNamespace = "http:
        @ResponseWrapper(localName = "detachVolumesFromSplitterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void detachVolumesFromSplitter(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID, @WebParam(name = "volumesIDs", targetNamespace = "")List<DeviceUID>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateDetachVolumesFromSplitter", targetNamespace = "http:
        @ResponseWrapper(localName = "validateDetachVolumesFromSplitterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateDetachVolumesFromSplitter(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID, @WebParam(name = "volumesIDs", targetNamespace = "")List<DeviceUID>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getSplittersSANViewFromAllClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "getSplittersSANViewFromAllClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ClusterSplittersSANView>getSplittersSANViewFromAllClusters()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSplittersSANViewFromCluster", targetNamespace = "http:
        @ResponseWrapper(localName = "getSplittersSANViewFromClusterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClusterSplittersSANView getSplittersSANViewFromCluster(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSplitterSANView", targetNamespace = "http:
        @ResponseWrapper(localName = "getSplitterSANViewResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SplitterSANView getSplitterSANView(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSplittersSettingsFromAllClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "getSplittersSettingsFromAllClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ClusterSplittersSettings>getSplittersSettingsFromAllClusters()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSplittersSettingsFromCluster", targetNamespace = "http:
        @ResponseWrapper(localName = "getSplittersSettingsFromClusterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClusterSplittersSettings getSplittersSettingsFromCluster(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSplitterSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "getSplitterSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SplitterSettings getSplitterSettings(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSplittersStateFromAllClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "getSplittersStateFromAllClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ClusterSplittersState>getSplittersStateFromAllClusters()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSplittersStateFromCluster", targetNamespace = "http:
        @ResponseWrapper(localName = "getSplittersStateFromClusterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClusterSplittersState getSplittersStateFromCluster(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSplitterState", targetNamespace = "http:
        @ResponseWrapper(localName = "getSplitterStateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SplitterState getSplitterState(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setSplitterAutoRegisterRPAsInitiatorsPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "setSplitterAutoRegisterRPAsInitiatorsPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setSplitterAutoRegisterRPAsInitiatorsPolicy(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID, @WebParam(name = "autoRegisterRPAsInitiatorsPolicy", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "removeSplitter", targetNamespace = "http:
        @ResponseWrapper(localName = "removeSplitterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removeSplitter(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateRemoveSplitter", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRemoveSplitterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRemoveSplitter(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getClusterVirtualEntitiesInformation", targetNamespace = "http:
        @ResponseWrapper(localName = "getClusterVirtualEntitiesInformationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClusterVirtualEntitiesInformation getClusterVirtualEntitiesInformation(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getVirtualEntitiesInformationFromClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "getVirtualEntitiesInformationFromClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ClusterVirtualEntitiesInformation>getVirtualEntitiesInformationFromClusters(@WebParam(name = "clusters", targetNamespace = "") List < ClusterUID > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "verifySplitterStateWithDefaultTimeout", targetNamespace = "http:
        @ResponseWrapper(localName = "verifySplitterStateWithDefaultTimeoutResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TransactionID verifySplitterStateWithDefaultTimeout(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID, @WebParam(name = "state", targetNamespace = "") VerifySplitterStateParam paramVerifySplitterStateParam)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "verifySplitterState", targetNamespace = "http:
        @ResponseWrapper(localName = "verifySplitterStateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TransactionID verifySplitterState(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID, @WebParam(name = "state", targetNamespace = "") VerifySplitterStateParam paramVerifySplitterStateParam,@WebParam(name = "timeoutInSeconds", targetNamespace = "")long paramLong)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "createClariionRaidGroups", targetNamespace = "http:
        @ResponseWrapper(localName = "createClariionRaidGroupsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void createClariionRaidGroups(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "numberOfGroups", targetNamespace = "")int paramInt)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "createBookmark", targetNamespace = "http:
        @ResponseWrapper(localName = "createBookmarkResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void createBookmark(@WebParam(name = "groups", targetNamespace = "") List < ConsistencyGroupUID > paramList, @WebParam(name = "bookmarkName", targetNamespace = "")String paramString, @WebParam(name = "consolidationPolicy", targetNamespace = "")BookmarkConsolidationPolicy paramBookmarkConsolidationPolicy, @WebParam(name = "consistencyType", targetNamespace = "")SnapshotConsistencyType paramSnapshotConsistencyType)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "setBookmarkConsolidationPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "setBookmarkConsolidationPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setBookmarkConsolidationPolicy(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "snapshot", targetNamespace = "")Snapshot paramSnapshot, @WebParam(name = "consolidationPolicy", targetNamespace = "")BookmarkConsolidationPolicy paramBookmarkConsolidationPolicy)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "setBookmarkConsistencyType", targetNamespace = "http:
        @ResponseWrapper(localName = "setBookmarkConsistencyTypeResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setBookmarkConsistencyType(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "snapshot", targetNamespace = "")Snapshot paramSnapshot, @WebParam(name = "consistencyType", targetNamespace = "")SnapshotConsistencyType paramSnapshotConsistencyType)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "setBookmarkSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "setBookmarkSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setBookmarkSettings(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "snapshot", targetNamespace = "")Snapshot paramSnapshot, @WebParam(name = "consistencyType", targetNamespace = "")SnapshotConsistencyType paramSnapshotConsistencyType, @WebParam(name = "consolidationPolicy", targetNamespace = "")BookmarkConsolidationPolicy paramBookmarkConsolidationPolicy)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "markGroupCopyVolumesAsClean", targetNamespace = "http:
        @ResponseWrapper(localName = "markGroupCopyVolumesAsCleanResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void markGroupCopyVolumesAsClean(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "markGroupVolumesAsClean", targetNamespace = "http:
        @ResponseWrapper(localName = "markGroupVolumesAsCleanResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void markGroupVolumesAsClean(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "consolidateSnapshots", targetNamespace = "http:
        @ResponseWrapper(localName = "consolidateSnapshotsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TransactionID consolidateSnapshots(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "start", targetNamespace = "") Snapshot paramSnapshot1, @WebParam(name = "end", targetNamespace = "") Snapshot paramSnapshot2)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateConsolidateSnapshots", targetNamespace = "http:
        @ResponseWrapper(localName = "validateConsolidateSnapshotsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateConsolidateSnapshots(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "start", targetNamespace = "")Snapshot paramSnapshot1, @WebParam(name = "end", targetNamespace = "")Snapshot paramSnapshot2)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "abortSnapshotsConsolidation", targetNamespace = "http:
        @ResponseWrapper(localName = "abortSnapshotsConsolidationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void abortSnapshotsConsolidation(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateAbortSnapshotsConsolidation", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAbortSnapshotsConsolidationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAbortSnapshotsConsolidation(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "addConsistencyGroupSet", targetNamespace = "http:
        @ResponseWrapper(localName = "addConsistencyGroupSetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupSetUID addConsistencyGroupSet(@WebParam(name = "groupSetSettings", targetNamespace = "") ConsistencyGroupSetSettings paramConsistencyGroupSetSettings)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateAddConsistencyGroupSet", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAddConsistencyGroupSetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAddConsistencyGroupSet(@WebParam(name = "groupSetSettings", targetNamespace = "") ConsistencyGroupSetSettings paramConsistencyGroupSetSettings)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "setConsistencyGroupSetSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "setConsistencyGroupSetSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setConsistencyGroupSetSettings(@WebParam(name = "groupSetSettings", targetNamespace = "") ConsistencyGroupSetSettings paramConsistencyGroupSetSettings)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "setBookmarkFrequency", targetNamespace = "http:
        @ResponseWrapper(localName = "setBookmarkFrequencyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setBookmarkFrequency(@WebParam(name = "groupSet", targetNamespace = "") ConsistencyGroupSetUID paramConsistencyGroupSetUID, @WebParam(name = "frequencyInMicroSeconds", targetNamespace = "")long paramLong)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "disableConsistencyGroup", targetNamespace = "http:
        @ResponseWrapper(localName = "disableConsistencyGroupResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void disableConsistencyGroup(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateDisableConsistencyGroup", targetNamespace = "http:
        @ResponseWrapper(localName = "validateDisableConsistencyGroupResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateDisableConsistencyGroup(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "disableConsistencyGroupCopy", targetNamespace = "http:
        @ResponseWrapper(localName = "disableConsistencyGroupCopyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void disableConsistencyGroupCopy(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateDisableConsistencyGroupCopy", targetNamespace = "http:
        @ResponseWrapper(localName = "validateDisableConsistencyGroupCopyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateDisableConsistencyGroupCopy(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "disableImageAccess", targetNamespace = "http:
        @ResponseWrapper(localName = "disableImageAccessResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void disableImageAccess(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateDisableImageAccess", targetNamespace = "http:
        @ResponseWrapper(localName = "validateDisableImageAccessResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateDisableImageAccess(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "enableConsistencyGroup", targetNamespace = "http:
        @ResponseWrapper(localName = "enableConsistencyGroupResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void enableConsistencyGroup(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateEnableConsistencyGroup", targetNamespace = "http:
        @ResponseWrapper(localName = "validateEnableConsistencyGroupResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateEnableConsistencyGroup(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "enableConsistencyGroupCopy", targetNamespace = "http:
        @ResponseWrapper(localName = "enableConsistencyGroupCopyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void enableConsistencyGroupCopy(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateEnableConsistencyGroupCopy", targetNamespace = "http:
        @ResponseWrapper(localName = "validateEnableConsistencyGroupCopyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateEnableConsistencyGroupCopy(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "enableImageAccessWithParams", targetNamespace = "http:
        @ResponseWrapper(localName = "enableImageAccessWithParamsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void enableImageAccessWithParams(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "params", targetNamespace = "")ImageAccessParameters paramImageAccessParameters, @WebParam(name = "scenario", targetNamespace = "")ImageAccessScenario paramImageAccessScenario)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateEnableImageAccessWithParams", targetNamespace = "http:
        @ResponseWrapper(localName = "validateEnableImageAccessWithParamsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateEnableImageAccessWithParams(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "params", targetNamespace = "")ImageAccessParameters paramImageAccessParameters, @WebParam(name = "scenario", targetNamespace = "")ImageAccessScenario paramImageAccessScenario)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "enableImageAccess", targetNamespace = "http:
        @ResponseWrapper(localName = "enableImageAccessResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void enableImageAccess(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "snapshot", targetNamespace = "")Snapshot paramSnapshot, @WebParam(name = "mode", targetNamespace = "")ImageAccessMode paramImageAccessMode, @WebParam(name = "scenario", targetNamespace = "")ImageAccessScenario paramImageAccessScenario)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateEnableImageAccess", targetNamespace = "http:
        @ResponseWrapper(localName = "validateEnableImageAccessResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateEnableImageAccess(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "snapshot", targetNamespace = "")Snapshot paramSnapshot, @WebParam(name = "mode", targetNamespace = "")ImageAccessMode paramImageAccessMode, @WebParam(name = "scenario", targetNamespace = "")ImageAccessScenario paramImageAccessScenario)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "moveToImage", targetNamespace = "http:
        @ResponseWrapper(localName = "moveToImageResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void moveToImage(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "accessType", targetNamespace = "")SpecificImageAccessType paramSpecificImageAccessType, @WebParam(name = "imageType", targetNamespace = "")SearchImageType paramSearchImageType, @WebParam(name = "scenario", targetNamespace = "")ImageAccessScenario paramImageAccessScenario)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateMoveToImage", targetNamespace = "http:
        @ResponseWrapper(localName = "validateMoveToImageResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateMoveToImage(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "accessType", targetNamespace = "")SpecificImageAccessType paramSpecificImageAccessType, @WebParam(name = "imageType", targetNamespace = "")SearchImageType paramSearchImageType, @WebParam(name = "scenario", targetNamespace = "")ImageAccessScenario paramImageAccessScenario)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "failover", targetNamespace = "http:
        @ResponseWrapper(localName = "failoverResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void failover(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateFailover", targetNamespace = "http:
        @ResponseWrapper(localName = "validateFailoverResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateFailover(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getAllGroupCopiesProtectionWindows", targetNamespace = "http:
        @ResponseWrapper(localName = "getAllGroupCopiesProtectionWindowsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ConsistencyGroupCopyProtectionWindowsInfo>getAllGroupCopiesProtectionWindows()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getAllGroupSets", targetNamespace = "http:
        @ResponseWrapper(localName = "getAllGroupSetsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ConsistencyGroupSetSettings>getAllGroupSets()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getAllGroupsSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "getAllGroupsSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ConsistencyGroupSettings>getAllGroupsSettings()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSpecificGroupsSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "getSpecificGroupsSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ConsistencyGroupSettings>getSpecificGroupsSettings(@WebParam(name = "groups", targetNamespace = "") List < ConsistencyGroupUID > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getGroupName", targetNamespace = "http:
        @ResponseWrapper(localName = "getGroupNameResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract String getGroupName(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getGroupCopyName", targetNamespace = "http:
        @ResponseWrapper(localName = "getGroupCopyNameResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract String getGroupCopyName(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getReplicationSetName", targetNamespace = "http:
        @ResponseWrapper(localName = "getReplicationSetNameResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract String getReplicationSetName(@WebParam(name = "replicationSet", targetNamespace = "") ReplicationSetUID paramReplicationSetUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getGroupSetName", targetNamespace = "http:
        @ResponseWrapper(localName = "getGroupSetNameResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract String getGroupSetName(@WebParam(name = "groupSet", targetNamespace = "") ConsistencyGroupSetUID paramConsistencyGroupSetUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getGroupSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "getGroupSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupSettings getGroupSettings(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getFullConsistencyGroupPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "getFullConsistencyGroupPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract FullConsistencyGroupPolicy getFullConsistencyGroupPolicy(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setFullConsistencyGroupPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "setFullConsistencyGroupPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setFullConsistencyGroupPolicy(@WebParam(name = "newPolicy", targetNamespace = "") FullConsistencyGroupPolicy paramFullConsistencyGroupPolicy)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateSetFullConsistencyGroupPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "validateSetFullConsistencyGroupPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateSetFullConsistencyGroupPolicy(@WebParam(name = "newPolicy", targetNamespace = "") FullConsistencyGroupPolicy paramFullConsistencyGroupPolicy)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "setFullConsistencyGroupCopyPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "setFullConsistencyGroupCopyPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setFullConsistencyGroupCopyPolicy(@WebParam(name = "newCopyPolicy", targetNamespace = "") FullConsistencyGroupCopyPolicy paramFullConsistencyGroupCopyPolicy)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateSetFullConsistencyGroupCopyPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "validateSetFullConsistencyGroupCopyPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateSetFullConsistencyGroupCopyPolicy(@WebParam(name = "newCopyPolicy", targetNamespace = "") FullConsistencyGroupCopyPolicy paramFullConsistencyGroupCopyPolicy)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getUserVolumeSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "getUserVolumeSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract UserVolumeSettings getUserVolumeSettings(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "volumeID", targetNamespace = "") DeviceUID paramDeviceUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getVolumeInformation", targetNamespace = "http:
        @ResponseWrapper(localName = "getVolumeInformationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract VolumeInformation getVolumeInformation(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "volumeID", targetNamespace = "") DeviceUID paramDeviceUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getVolumeInformationFromAllClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "getVolumeInformationFromAllClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<VolumeInformation>getVolumeInformationFromAllClusters()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getVolumePaths", targetNamespace = "http:
        @ResponseWrapper(localName = "getVolumePathsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<VolumePath>getVolumePaths(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "volumeID", targetNamespace = "")DeviceUID paramDeviceUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getVolumeInformationAndPaths", targetNamespace = "http:
        @ResponseWrapper(localName = "getVolumeInformationAndPathsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract VolumeInformationAndPaths getVolumeInformationAndPaths(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "volumeID", targetNamespace = "") DeviceUID paramDeviceUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getAllGroupsState", targetNamespace = "http:
        @ResponseWrapper(localName = "getAllGroupsStateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ConsistencyGroupState>getAllGroupsState()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSpecificGroupsState", targetNamespace = "http:
        @ResponseWrapper(localName = "getSpecificGroupsStateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ConsistencyGroupState>getSpecificGroupsState(@WebParam(name = "groups", targetNamespace = "") List < ConsistencyGroupUID > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getGroupState", targetNamespace = "http:
        @ResponseWrapper(localName = "getGroupStateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupState getGroupState(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getGroupsTransferState", targetNamespace = "http:
        @ResponseWrapper(localName = "getGroupsTransferStateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ConsistencyGroupTransferState>getGroupsTransferState()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getAllGroupsStatistics", targetNamespace = "http:
        @ResponseWrapper(localName = "getAllGroupsStatisticsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ConsistencyGroupStatistics>getAllGroupsStatistics()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSpecificGroupsStatistics", targetNamespace = "http:
        @ResponseWrapper(localName = "getSpecificGroupsStatisticsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ConsistencyGroupStatistics>getSpecificGroupsStatistics(@WebParam(name = "groups", targetNamespace = "") List < ConsistencyGroupUID > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getGroupStatistics", targetNamespace = "http:
        @ResponseWrapper(localName = "getGroupStatisticsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupStatistics getGroupStatistics(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getAllConsistencyGroups", targetNamespace = "http:
        @ResponseWrapper(localName = "getAllConsistencyGroupsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ConsistencyGroupUID>getAllConsistencyGroups()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getGroupSnapshots", targetNamespace = "http:
        @ResponseWrapper(localName = "getGroupSnapshotsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupSnapshots getGroupSnapshots(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getGroupSnapshotsForTimeFrameAndName", targetNamespace = "http:
        @ResponseWrapper(localName = "getGroupSnapshotsForTimeFrameAndNameResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupSnapshots getGroupSnapshotsForTimeFrameAndName(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "timeFrame", targetNamespace = "") TimeFrame paramTimeFrame, @WebParam(name = "name", targetNamespace = "") String paramString)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getRecoveryGroupCopySnapshots", targetNamespace = "http:
        @ResponseWrapper(localName = "getRecoveryGroupCopySnapshotsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupCopySnapshots getRecoveryGroupCopySnapshots(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getGroupCopySnapshotsForTimeFrameAndName", targetNamespace = "http:
        @ResponseWrapper(localName = "getGroupCopySnapshotsForTimeFrameAndNameResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupCopySnapshots getGroupCopySnapshotsForTimeFrameAndName(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "timeFrame", targetNamespace = "") TimeFrame paramTimeFrame, @WebParam(name = "name", targetNamespace = "") String paramString)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getGroupCopySnapshots", targetNamespace = "http:
        @ResponseWrapper(localName = "getGroupCopySnapshotsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupCopySnapshots getGroupCopySnapshots(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "pauseGroupTransfer", targetNamespace = "http:
        @ResponseWrapper(localName = "pauseGroupTransferResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void pauseGroupTransfer(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validatePauseGroupTransfer", targetNamespace = "http:
        @ResponseWrapper(localName = "validatePauseGroupTransferResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validatePauseGroupTransfer(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "pauseGroupCopyTransfer", targetNamespace = "http:
        @ResponseWrapper(localName = "pauseGroupCopyTransferResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void pauseGroupCopyTransfer(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validatePauseGroupCopyTransfer", targetNamespace = "http:
        @ResponseWrapper(localName = "validatePauseGroupCopyTransferResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validatePauseGroupCopyTransfer(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "recoverProduction", targetNamespace = "http:
        @ResponseWrapper(localName = "recoverProductionResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void recoverProduction(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateRecoverProduction", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRecoverProductionResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRecoverProduction(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "resumeProduction", targetNamespace = "http:
        @ResponseWrapper(localName = "resumeProductionResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void resumeProduction(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateResumeProduction", targetNamespace = "http:
        @ResponseWrapper(localName = "validateResumeProductionResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateResumeProduction(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "removeConsistencyGroup", targetNamespace = "http:
        @ResponseWrapper(localName = "removeConsistencyGroupResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removeConsistencyGroup(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "removeConsistencyGroupCopy", targetNamespace = "http:
        @ResponseWrapper(localName = "removeConsistencyGroupCopyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removeConsistencyGroupCopy(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateRemoveConsistencyGroupCopy", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRemoveConsistencyGroupCopyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRemoveConsistencyGroupCopy(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "removeConsistencyGroupSet", targetNamespace = "http:
        @ResponseWrapper(localName = "removeConsistencyGroupSetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removeConsistencyGroupSet(@WebParam(name = "getGroupSetName", targetNamespace = "") ConsistencyGroupSetUID paramConsistencyGroupSetUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "renameConsistencyGroup", targetNamespace = "http:
        @ResponseWrapper(localName = "renameConsistencyGroupResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void renameConsistencyGroup(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "newName", targetNamespace = "")String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateRenameConsistencyGroup", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRenameConsistencyGroupResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRenameConsistencyGroup(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "newName", targetNamespace = "")String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "renameConsistencyGroupCopy", targetNamespace = "http:
        @ResponseWrapper(localName = "renameConsistencyGroupCopyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void renameConsistencyGroupCopy(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "newName", targetNamespace = "")String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateRenameConsistencyGroupCopy", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRenameConsistencyGroupCopyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRenameConsistencyGroupCopy(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "newName", targetNamespace = "")String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "rollToImage", targetNamespace = "http:
        @ResponseWrapper(localName = "rollToImageResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void rollToImage(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateRollToImage", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRollToImageResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRollToImage(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "enableDirectAccess", targetNamespace = "http:
        @ResponseWrapper(localName = "enableDirectAccessResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void enableDirectAccess(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateEnableDirectAccess", targetNamespace = "http:
        @ResponseWrapper(localName = "validateEnableDirectAccessResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateEnableDirectAccess(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "markGroupCopyVolumesAsDirty", targetNamespace = "http:
        @ResponseWrapper(localName = "markGroupCopyVolumesAsDirtyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void markGroupCopyVolumesAsDirty(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "replicationSets", targetNamespace = "")List<ReplicationSetUID>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "markGroupVolumesAsDirty", targetNamespace = "http:
        @ResponseWrapper(localName = "markGroupVolumesAsDirtyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void markGroupVolumesAsDirty(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "replicationSets", targetNamespace = "")List<ReplicationSetUID>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "setConsistencyGroupPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "setConsistencyGroupPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setConsistencyGroupPolicy(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "newPolicy", targetNamespace = "")ConsistencyGroupPolicy paramConsistencyGroupPolicy)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateSetConsistencyGroupPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "validateSetConsistencyGroupPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateSetConsistencyGroupPolicy(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "newPolicy", targetNamespace = "")ConsistencyGroupPolicy paramConsistencyGroupPolicy)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "setConsistencyGroupCopyPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "setConsistencyGroupCopyPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setConsistencyGroupCopyPolicy(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "newPolicy", targetNamespace = "")ConsistencyGroupCopyPolicy paramConsistencyGroupCopyPolicy)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateSetConsistencyGroupCopyPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "validateSetConsistencyGroupCopyPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateSetConsistencyGroupCopyPolicy(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "newPolicy", targetNamespace = "")ConsistencyGroupCopyPolicy paramConsistencyGroupCopyPolicy)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "addConsistencyGroupCopies", targetNamespace = "http:
        @ResponseWrapper(localName = "addConsistencyGroupCopiesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void addConsistencyGroupCopies(@WebParam(name = "newCopies", targetNamespace = "") List < NewConsistencyGroupCopySettingsParam > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateAddConsistencyGroupCopies", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAddConsistencyGroupCopiesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAddConsistencyGroupCopies(@WebParam(name = "newCopies", targetNamespace = "") List < NewConsistencyGroupCopySettingsParam > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;

        @WebMethod
        @RequestWrapper(localName = "setConsistencyGroupCopiesSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "setConsistencyGroupCopiesSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setConsistencyGroupCopiesSettings(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "copiesChanges", targetNamespace = "")List<ConsistencyGroupCopySettingsChangesParam>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateSetConsistencyGroupCopiesSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "validateSetConsistencyGroupCopiesSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateSetConsistencyGroupCopiesSettings(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "copiesChanges", targetNamespace = "")List<ConsistencyGroupCopySettingsChangesParam>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "setReplicationSetsSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "setReplicationSetsSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setReplicationSetsSettings(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "replicationSetsChanges", targetNamespace = "")List<ReplicationSetSettingsChangesParam>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateSetReplicationSetsSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "validateSetReplicationSetsSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateSetReplicationSetsSettings(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "replicationSetsChanges", targetNamespace = "")List<ReplicationSetSettingsChangesParam>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "setConsistencyGroupLinkPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "setConsistencyGroupLinkPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setConsistencyGroupLinkPolicy(@WebParam(name = "groupLink", targetNamespace = "") ConsistencyGroupLinkUID paramConsistencyGroupLinkUID, @WebParam(name = "newPolicy", targetNamespace = "")ConsistencyGroupLinkPolicy paramConsistencyGroupLinkPolicy)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateSetConsistencyGroupLinkPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "validateSetConsistencyGroupLinkPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateSetConsistencyGroupLinkPolicy(@WebParam(name = "groupLink", targetNamespace = "") ConsistencyGroupLinkUID paramConsistencyGroupLinkUID, @WebParam(name = "newPolicy", targetNamespace = "")ConsistencyGroupLinkPolicy paramConsistencyGroupLinkPolicy)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "addConsistencyGroupLink", targetNamespace = "http:
        @ResponseWrapper(localName = "addConsistencyGroupLinkResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void addConsistencyGroupLink(@WebParam(name = "groupLink", targetNamespace = "") ConsistencyGroupLinkUID paramConsistencyGroupLinkUID, @WebParam(name = "policy", targetNamespace = "")ConsistencyGroupLinkPolicy paramConsistencyGroupLinkPolicy)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateAddConsistencyGroupLink", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAddConsistencyGroupLinkResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAddConsistencyGroupLink(@WebParam(name = "groupLink", targetNamespace = "") ConsistencyGroupLinkUID paramConsistencyGroupLinkUID, @WebParam(name = "policy", targetNamespace = "")ConsistencyGroupLinkPolicy paramConsistencyGroupLinkPolicy)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "removePassiveConsistencyGroupLink", targetNamespace = "http:
        @ResponseWrapper(localName = "removePassiveConsistencyGroupLinkResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removePassiveConsistencyGroupLink(@WebParam(name = "groupLink", targetNamespace = "") ConsistencyGroupLinkUID paramConsistencyGroupLinkUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateRemovePassiveConsistencyGroupLink", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRemovePassiveConsistencyGroupLinkResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRemovePassiveConsistencyGroupLink(@WebParam(name = "groupLink", targetNamespace = "") ConsistencyGroupLinkUID paramConsistencyGroupLinkUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "setProductionCopy", targetNamespace = "http:
        @ResponseWrapper(localName = "setProductionCopyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setProductionCopy(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateSetProductionCopy", targetNamespace = "http:
        @ResponseWrapper(localName = "validateSetProductionCopyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateSetProductionCopy(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "setProductionAndConsistencyGroupTopology", targetNamespace = "http:
        @ResponseWrapper(localName = "setProductionAndConsistencyGroupTopologyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setProductionAndConsistencyGroupTopology(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "params", targetNamespace = "")ConsistencyGroupTopologyParams paramConsistencyGroupTopologyParams, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateSetProducationAndConsistencyGroupTopology", targetNamespace = "http:
        @ResponseWrapper(localName = "validateSetProducationAndConsistencyGroupTopologyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateSetProducationAndConsistencyGroupTopology(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "params", targetNamespace = "")ConsistencyGroupTopologyParams paramConsistencyGroupTopologyParams, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "startGroupTransfer", targetNamespace = "http:
        @ResponseWrapper(localName = "startGroupTransferResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void startGroupTransfer(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateStartGroupTransfer", targetNamespace = "http:
        @ResponseWrapper(localName = "validateStartGroupTransferResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateStartGroupTransfer(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "startGroupCopyTransfer", targetNamespace = "http:
        @ResponseWrapper(localName = "startGroupCopyTransferResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void startGroupCopyTransfer(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateStartGroupCopyTransfer", targetNamespace = "http:
        @ResponseWrapper(localName = "validateStartGroupCopyTransferResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateStartGroupCopyTransfer(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "undoGroupWrites", targetNamespace = "http:
        @ResponseWrapper(localName = "undoGroupWritesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void undoGroupWrites(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateUndoGroupWrites", targetNamespace = "http:
        @ResponseWrapper(localName = "validateUndoGroupWritesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateUndoGroupWrites(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "forceLongInitialization", targetNamespace = "http:
        @ResponseWrapper(localName = "forceLongInitializationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void forceLongInitialization(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateForceLongInitialization", targetNamespace = "http:
        @ResponseWrapper(localName = "validateForceLongInitializationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateForceLongInitialization(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "verifyConsistencyGroupStateWithDefaultTimeout", targetNamespace = "http:
        @ResponseWrapper(localName = "verifyConsistencyGroupStateWithDefaultTimeoutResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TransactionID verifyConsistencyGroupStateWithDefaultTimeout(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "state", targetNamespace = "") VerifyConsistencyGroupStateParam paramVerifyConsistencyGroupStateParam)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "verifyConsistencyGroupState", targetNamespace = "http:
        @ResponseWrapper(localName = "verifyConsistencyGroupStateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TransactionID verifyConsistencyGroupState(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "state", targetNamespace = "") VerifyConsistencyGroupStateParam paramVerifyConsistencyGroupStateParam,@WebParam(name = "timeoutInSeconds", targetNamespace = "")long paramLong)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "verifyGroupCopySnapshotsWithDefaultTimeout", targetNamespace = "http:
        @ResponseWrapper(localName = "verifyGroupCopySnapshotsWithDefaultTimeoutResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TransactionID verifyGroupCopySnapshotsWithDefaultTimeout(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "state", targetNamespace = "") VerifyGroupCopySnapshotsParam paramVerifyGroupCopySnapshotsParam)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "verifyGroupCopySnapshots", targetNamespace = "http:
        @ResponseWrapper(localName = "verifyGroupCopySnapshotsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TransactionID verifyGroupCopySnapshots(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "state", targetNamespace = "") VerifyGroupCopySnapshotsParam paramVerifyGroupCopySnapshotsParam,@WebParam(name = "timeoutInSeconds", targetNamespace = "")long paramLong)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "unregulateAllConsistencyGroupCopies", targetNamespace = "http:
        @ResponseWrapper(localName = "unregulateAllConsistencyGroupCopiesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void unregulateAllConsistencyGroupCopies()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setSignaturesUsageDuringInitialization", targetNamespace = "http:
        @ResponseWrapper(localName = "setSignaturesUsageDuringInitializationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setSignaturesUsageDuringInitialization(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "useSignatures", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getBalanceLoadRecommendationWithGroupsToExclude", targetNamespace = "http:
        @ResponseWrapper(localName = "getBalanceLoadRecommendationWithGroupsToExcludeResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TransactionID getBalanceLoadRecommendationWithGroupsToExclude(@WebParam(name = "groupsToExclude", targetNamespace = "") List < ConsistencyGroupUID > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getBalanceLoadRecommendation", targetNamespace = "http:
        @ResponseWrapper(localName = "getBalanceLoadRecommendationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TransactionID getBalanceLoadRecommendation()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "applyBalanceLoadRecommendation", targetNamespace = "http:
        @ResponseWrapper(localName = "applyBalanceLoadRecommendationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void applyBalanceLoadRecommendation(@WebParam(name = "recommendation", targetNamespace = "") BalanceLoadRecommendation paramBalanceLoadRecommendation)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateApplyBalanceLoadRecommendation", targetNamespace = "http:
        @ResponseWrapper(localName = "validateApplyBalanceLoadRecommendationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateApplyBalanceLoadRecommendation(@WebParam(name = "recommendation", targetNamespace = "") BalanceLoadRecommendation paramBalanceLoadRecommendation)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "addConsistencyGroupAndCopies", targetNamespace = "http:
        @ResponseWrapper(localName = "addConsistencyGroupAndCopiesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupUID addConsistencyGroupAndCopies(@WebParam(name = "fullGroupPolicy", targetNamespace = "") FullConsistencyGroupPolicy paramFullConsistencyGroupPolicy)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateAddConsistencyGroupAndCopies", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAddConsistencyGroupAndCopiesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAddConsistencyGroupAndCopies(@WebParam(name = "fullGroupPolicy", targetNamespace = "") FullConsistencyGroupPolicy paramFullConsistencyGroupPolicy)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "addConsistencyGroupWithDefaultPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "addConsistencyGroupWithDefaultPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupUID addConsistencyGroupWithDefaultPolicy(@WebParam(name = "groupName", targetNamespace = "") String paramString, @WebParam(name = "primaryRPA", targetNamespace = "") RpaUID paramRpaUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "addConsistencyGroup", targetNamespace = "http:
        @ResponseWrapper(localName = "addConsistencyGroupResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupUID addConsistencyGroup(@WebParam(name = "groupName", targetNamespace = "") String paramString, @WebParam(name = "policy", targetNamespace = "") ConsistencyGroupPolicy paramConsistencyGroupPolicy)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "addDistributedConsistencyGroupWithDefaultPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "addDistributedConsistencyGroupWithDefaultPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupUID addDistributedConsistencyGroupWithDefaultPolicy(@WebParam(name = "groupName", targetNamespace = "") String paramString, @WebParam(name = "primaryRPA", targetNamespace = "") RpaUID paramRpaUID, @WebParam(name = "secondaryRPAsList", targetNamespace = "") List < RpaUID > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateAddConsistencyGroupWithDefaultPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAddConsistencyGroupWithDefaultPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAddConsistencyGroupWithDefaultPolicy(@WebParam(name = "groupName", targetNamespace = "") String paramString, @WebParam(name = "primaryRPA", targetNamespace = "")RpaUID paramRpaUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "validateAddConsistencyGroup", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAddConsistencyGroupResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAddConsistencyGroup(@WebParam(name = "groupName", targetNamespace = "") String paramString, @WebParam(name = "policy", targetNamespace = "")ConsistencyGroupPolicy paramConsistencyGroupPolicy)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "validateAddDistributedConsistencyGroupWithDefaultPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAddDistributedConsistencyGroupWithDefaultPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAddDistributedConsistencyGroupWithDefaultPolicy(@WebParam(name = "groupName", targetNamespace = "") String paramString, @WebParam(name = "primaryRPA", targetNamespace = "")RpaUID paramRpaUID, @WebParam(name = "secondaryRPAsList", targetNamespace = "")List<RpaUID>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "addConsistencyGroupCopy", targetNamespace = "http:
        @ResponseWrapper(localName = "addConsistencyGroupCopyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void addConsistencyGroupCopy(@WebParam(name = "copySettingsParam", targetNamespace = "") ConsistencyGroupCopySettingsParam paramConsistencyGroupCopySettingsParam)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateAddConsistencyGroupCopy", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAddConsistencyGroupCopyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAddConsistencyGroupCopy(@WebParam(name = "copySettingsParam", targetNamespace = "") ConsistencyGroupCopySettingsParam paramConsistencyGroupCopySettingsParam)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "addJournalVolume", targetNamespace = "http:
        @ResponseWrapper(localName = "addJournalVolumeResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void addJournalVolume(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "volumeID", targetNamespace = "")DeviceUID paramDeviceUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateAddJournalVolume", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAddJournalVolumeResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAddJournalVolume(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "volumeID", targetNamespace = "")DeviceUID paramDeviceUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "removeJournalVolume", targetNamespace = "http:
        @ResponseWrapper(localName = "removeJournalVolumeResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removeJournalVolume(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "volumeID", targetNamespace = "")DeviceUID paramDeviceUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateRemoveJournalVolume", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRemoveJournalVolumeResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRemoveJournalVolume(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "volumeID", targetNamespace = "")DeviceUID paramDeviceUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getClusterSANVolumes", targetNamespace = "http:
        @ResponseWrapper(localName = "getClusterSANVolumesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClusterSANVolumes getClusterSANVolumes(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID,@WebParam(name = "refreshView", targetNamespace = "")boolean paramBoolean)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getClusterSANVolumesByVendorAndProduct", targetNamespace = "http:
        @ResponseWrapper(localName = "getClusterSANVolumesByVendorAndProductResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClusterSANVolumes getClusterSANVolumesByVendorAndProduct(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID,@WebParam(name = "refreshView", targetNamespace = "")boolean paramBoolean,@WebParam(name = "vendor", targetNamespace = "")String paramString1,@WebParam(name = "product", targetNamespace = "")String paramString2)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getClusterClariionVolumes", targetNamespace = "http:
        @ResponseWrapper(localName = "getClusterClariionVolumesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClusterClariionVolumes getClusterClariionVolumes(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID,@WebParam(name = "refreshView", targetNamespace = "")boolean paramBoolean)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getAvailableClusterClariionVolumes", targetNamespace = "http:
        @ResponseWrapper(localName = "getAvailableClusterClariionVolumesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClusterClariionVolumes getAvailableClusterClariionVolumes(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID,@WebParam(name = "refreshView", targetNamespace = "")boolean paramBoolean)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "addReplicationSet", targetNamespace = "http:
        @ResponseWrapper(localName = "addReplicationSetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void addReplicationSet(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "replicationSetName", targetNamespace = "")String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateAddReplicationSet", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAddReplicationSetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAddReplicationSet(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "replicationSetName", targetNamespace = "")String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "removeReplicationSet", targetNamespace = "http:
        @ResponseWrapper(localName = "removeReplicationSetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removeReplicationSet(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "replicationSet", targetNamespace = "")ReplicationSetUID paramReplicationSetUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateRemoveReplicationSet", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRemoveReplicationSetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRemoveReplicationSet(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "replicationSet", targetNamespace = "")ReplicationSetUID paramReplicationSetUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "renameReplicationSet", targetNamespace = "http:
        @ResponseWrapper(localName = "renameReplicationSetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void renameReplicationSet(@WebParam(name = "replicationSet", targetNamespace = "") ReplicationSetUID paramReplicationSetUID, @WebParam(name = "newName", targetNamespace = "")String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateRenameReplicationSet", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRenameReplicationSetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRenameReplicationSet(@WebParam(name = "replicationSet", targetNamespace = "") ReplicationSetUID paramReplicationSetUID, @WebParam(name = "newName", targetNamespace = "")String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "rescanSANVolumesInAllClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "rescanSANVolumesInAllClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void rescanSANVolumesInAllClusters(@WebParam(name = "checkExistingVolumesAsWell", targetNamespace = "")boolean paramBoolean)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "rescanSANVolumesInCluster", targetNamespace = "http:
        @ResponseWrapper(localName = "rescanSANVolumesInClusterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void rescanSANVolumesInCluster(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "checkExistingVolumesAsWell", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "rescanSANSplittersInAllClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "rescanSANSplittersInAllClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void rescanSANSplittersInAllClusters()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "rescanSANSplittersInCluster", targetNamespace = "http:
        @ResponseWrapper(localName = "rescanSANSplittersInClusterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void rescanSANSplittersInCluster(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "rescanSplittersVolumesConnectionsInAllClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "rescanSplittersVolumesConnectionsInAllClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void rescanSplittersVolumesConnectionsInAllClusters()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "rescanSplittersVolumesConnectionsInCluster", targetNamespace = "http:
        @ResponseWrapper(localName = "rescanSplittersVolumesConnectionsInClusterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void rescanSplittersVolumesConnectionsInCluster(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "rescanSpecificSplittersVolumesConnections", targetNamespace = "http:
        @ResponseWrapper(localName = "rescanSpecificSplittersVolumesConnectionsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void rescanSpecificSplittersVolumesConnections(@WebParam(name = "splitters", targetNamespace = "") List < SplitterUID > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "rescanSplitterVolumesConnections", targetNamespace = "http:
        @ResponseWrapper(localName = "rescanSplitterVolumesConnectionsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void rescanSplitterVolumesConnections(@WebParam(name = "splitter", targetNamespace = "") SplitterUID paramSplitterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getAllGroupsVolumeStates", targetNamespace = "http:
        @ResponseWrapper(localName = "getAllGroupsVolumeStatesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ConsistencyGroupVolumesState>getAllGroupsVolumeStates()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSpecificGroupsVolumeStates", targetNamespace = "http:
        @ResponseWrapper(localName = "getSpecificGroupsVolumeStatesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ConsistencyGroupVolumesState>getSpecificGroupsVolumeStates(@WebParam(name = "groups", targetNamespace = "") List < ConsistencyGroupUID > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getGroupVolumeStates", targetNamespace = "http:
        @ResponseWrapper(localName = "getGroupVolumeStatesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupVolumesState getGroupVolumeStates(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getRepositoryVolumeStateFromAllClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "getRepositoryVolumeStateFromAllClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<RepositoryVolumeState>getRepositoryVolumeStateFromAllClusters()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getRepositoryVolumeState", targetNamespace = "http:
        @ResponseWrapper(localName = "getRepositoryVolumeStateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract RepositoryVolumeState getRepositoryVolumeState(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setConsistencyGroupSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "setConsistencyGroupSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setConsistencyGroupSettings(@WebParam(name = "settingsParam", targetNamespace = "") ConsistencyGroupSettingsChangesParam paramConsistencyGroupSettingsChangesParam)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateSetConsistencyGroupSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "validateSetConsistencyGroupSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateSetConsistencyGroupSettings(@WebParam(name = "settingsParam", targetNamespace = "") ConsistencyGroupSettingsChangesParam paramConsistencyGroupSettingsChangesParam)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "addUserVolume", targetNamespace = "http:
        @ResponseWrapper(localName = "addUserVolumeResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void addUserVolume(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "replicationSet", targetNamespace = "")ReplicationSetUID paramReplicationSetUID, @WebParam(name = "volumeID", targetNamespace = "")DeviceUID paramDeviceUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateAddUserVolume", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAddUserVolumeResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAddUserVolume(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "replicationSet", targetNamespace = "")ReplicationSetUID paramReplicationSetUID, @WebParam(name = "volumeID", targetNamespace = "")DeviceUID paramDeviceUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "addAndAttachUserVolume", targetNamespace = "http:
        @ResponseWrapper(localName = "addAndAttachUserVolumeResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void addAndAttachUserVolume(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "replicationSet", targetNamespace = "")ReplicationSetUID paramReplicationSetUID, @WebParam(name = "volumeID", targetNamespace = "")DeviceUID paramDeviceUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateAddAndAttachUserVolume", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAddAndAttachUserVolumeResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAddAndAttachUserVolume(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "replicationSet", targetNamespace = "")ReplicationSetUID paramReplicationSetUID, @WebParam(name = "volumeID", targetNamespace = "")DeviceUID paramDeviceUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "removeUserVolume", targetNamespace = "http:
        @ResponseWrapper(localName = "removeUserVolumeResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removeUserVolume(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "replicationSet", targetNamespace = "")ReplicationSetUID paramReplicationSetUID, @WebParam(name = "volumeID", targetNamespace = "")DeviceUID paramDeviceUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateRemoveUserVolume", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRemoveUserVolumeResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRemoveUserVolume(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "replicationSet", targetNamespace = "")ReplicationSetUID paramReplicationSetUID, @WebParam(name = "volumeID", targetNamespace = "")DeviceUID paramDeviceUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getAvailableVolumes", targetNamespace = "http:
        @ResponseWrapper(localName = "getAvailableVolumesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClusterSANVolumes getAvailableVolumes(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID,@WebParam(name = "refreshView", targetNamespace = "")boolean paramBoolean)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getAvailableVolumesFromAllClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "getAvailableVolumesFromAllClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract AllClustersSANVolumesInfo getAvailableVolumesFromAllClusters(@WebParam(name = "refreshView", targetNamespace = "")boolean paramBoolean)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getVCenterServersViewSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "getVCenterServersViewSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract VCenterServersViewSettings getVCenterServersViewSettings()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setVCenterServersViewSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "setVCenterServersViewSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setVCenterServersViewSettings(@WebParam(name = "settings", targetNamespace = "") VCenterServersViewSettings paramVCenterServersViewSettings)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getVCenterServersFromAllClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "getVCenterServersFromAllClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ClusterVCenterServers>getVCenterServersFromAllClusters()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getVCenterServersFromCluster", targetNamespace = "http:
        @ResponseWrapper(localName = "getVCenterServersFromClusterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClusterVCenterServers getVCenterServersFromCluster(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getVCenterServer", targetNamespace = "http:
        @ResponseWrapper(localName = "getVCenterServerResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract VCenterServer getVCenterServer(@WebParam(name = "vCenterServer", targetNamespace = "") VCenterServerUID paramVCenterServerUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getVCenterServersViewFromAllClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "getVCenterServersViewFromAllClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ClusterVCenterServerView>getVCenterServersViewFromAllClusters(@WebParam(name = "shouldRescan", targetNamespace = "")boolean paramBoolean)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getVCenterServersViewFromCluster", targetNamespace = "http:
        @ResponseWrapper(localName = "getVCenterServersViewFromClusterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClusterVCenterServerView getVCenterServersViewFromCluster(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID,@WebParam(name = "shouldRescan", targetNamespace = "")boolean paramBoolean)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getVCenterServerView", targetNamespace = "http:
        @ResponseWrapper(localName = "getVCenterServerViewResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract VCenterServerView getVCenterServerView(@WebParam(name = "vCenterServer", targetNamespace = "") VCenterServerUID paramVCenterServerUID,@WebParam(name = "shouldRescan", targetNamespace = "")boolean paramBoolean)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getVCenterServerFiltersFromCluster", targetNamespace = "http:
        @ResponseWrapper(localName = "getVCenterServerFiltersFromClusterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<VCenterServerFilters>getVCenterServerFiltersFromCluster(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getVCenterServerFilters", targetNamespace = "http:
        @ResponseWrapper(localName = "getVCenterServerFiltersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract VCenterServerFilters getVCenterServerFilters(@WebParam(name = "vCenterServer", targetNamespace = "") VCenterServerUID paramVCenterServerUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "removeAllVCenterServerFilters", targetNamespace = "http:
        @ResponseWrapper(localName = "removeAllVCenterServerFiltersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract VCenterServerFilters removeAllVCenterServerFilters(@WebParam(name = "vCenterServer", targetNamespace = "") VCenterServerUID paramVCenterServerUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "removeVCenterServerFilter", targetNamespace = "http:
        @ResponseWrapper(localName = "removeVCenterServerFilterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removeVCenterServerFilter(@WebParam(name = "vCenterServer", targetNamespace = "") VCenterServerUID paramVCenterServerUID, @WebParam(name = "filter", targetNamespace = "")VCenterServerFilter paramVCenterServerFilter)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "addVCenterServerFilter", targetNamespace = "http:
        @ResponseWrapper(localName = "addVCenterServerFilterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void addVCenterServerFilter(@WebParam(name = "vCenterServer", targetNamespace = "") VCenterServerUID paramVCenterServerUID, @WebParam(name = "filter", targetNamespace = "")VCenterServerFilter paramVCenterServerFilter)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "setVCenterServerFilters", targetNamespace = "http:
        @ResponseWrapper(localName = "setVCenterServerFiltersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setVCenterServerFilters(@WebParam(name = "filters", targetNamespace = "") VCenterServerFilters paramVCenterServerFilters)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "setVCenterServerFilterForUnknownLuns", targetNamespace = "http:
        @ResponseWrapper(localName = "setVCenterServerFilterForUnknownLunsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setVCenterServerFilterForUnknownLuns(@WebParam(name = "vCenterServer", targetNamespace = "") VCenterServerUID paramVCenterServerUID, @WebParam(name = "shouldFilterUnknownLuns", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getConsistencyGroupUIDAccordingToVMBiosUuid", targetNamespace = "http:
        @ResponseWrapper(localName = "getConsistencyGroupUIDAccordingToVMBiosUuidResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupUID getConsistencyGroupUIDAccordingToVMBiosUuid(@WebParam(name = "vmBiosUuid", targetNamespace = "") String paramString)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getAccountSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "getAccountSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract AccountSettings getAccountSettings()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getAccountState", targetNamespace = "http:
        @ResponseWrapper(localName = "getAccountStateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract AccountState getAccountState()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "addSystemEventLogsFilter", targetNamespace = "http:
        @ResponseWrapper(localName = "addSystemEventLogsFilterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SystemEventLogsFilterUID addSystemEventLogsFilter(@WebParam(name = "filter", targetNamespace = "") SystemEventLogsFilter paramSystemEventLogsFilter)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateAddSystemEventLogsFilter", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAddSystemEventLogsFilterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAddSystemEventLogsFilter(@WebParam(name = "filter", targetNamespace = "") SystemEventLogsFilter paramSystemEventLogsFilter)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "setSystemEventLogsFilters", targetNamespace = "http:
        @ResponseWrapper(localName = "setSystemEventLogsFiltersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setSystemEventLogsFilters(@WebParam(name = "filters", targetNamespace = "") List < SystemEventLogsFilter > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateSetSystemEventLogsFilters", targetNamespace = "http:
        @ResponseWrapper(localName = "validateSetSystemEventLogsFiltersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateSetSystemEventLogsFilters(@WebParam(name = "filters", targetNamespace = "") List < SystemEventLogsFilter > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getAllSystemEventLogsFilters", targetNamespace = "http:
        @ResponseWrapper(localName = "getAllSystemEventLogsFiltersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<SystemEventLogsFilter>getAllSystemEventLogsFilters()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "removeSystemEventLogsFilter", targetNamespace = "http:
        @ResponseWrapper(localName = "removeSystemEventLogsFilterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removeSystemEventLogsFilter(@WebParam(name = "filter", targetNamespace = "") SystemEventLogsFilterUID paramSystemEventLogsFilterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateRemoveSystemEventLogsFilter", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRemoveSystemEventLogsFilterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRemoveSystemEventLogsFilter(@WebParam(name = "filter", targetNamespace = "") SystemEventLogsFilterUID paramSystemEventLogsFilterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "renameSystemEventLogsFilter", targetNamespace = "http:
        @ResponseWrapper(localName = "renameSystemEventLogsFilterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void renameSystemEventLogsFilter(@WebParam(name = "filter", targetNamespace = "") SystemEventLogsFilterUID paramSystemEventLogsFilterUID, @WebParam(name = "newName", targetNamespace = "")String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateRenameSystemEventLogsFilter", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRenameSystemEventLogsFilterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRenameSystemEventLogsFilter(@WebParam(name = "filter", targetNamespace = "") SystemEventLogsFilterUID paramSystemEventLogsFilterUID, @WebParam(name = "newName", targetNamespace = "")String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getTrackedEventIDs", targetNamespace = "http:
        @ResponseWrapper(localName = "getTrackedEventIDsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<Integer>getTrackedEventIDs()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getAllEventLogs", targetNamespace = "http:
        @ResponseWrapper(localName = "getAllEventLogsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SystemEventLogs getAllEventLogs()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getEventLogsByFilter", targetNamespace = "http:
        @ResponseWrapper(localName = "getEventLogsByFilterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SystemEventLogs getEventLogsByFilter(@WebParam(name = "filter", targetNamespace = "") UserEventLogsFilter paramUserEventLogsFilter)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getEventLogsWithLargerUID", targetNamespace = "http:
        @ResponseWrapper(localName = "getEventLogsWithLargerUIDResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SystemEventLogs getEventLogsWithLargerUID(@WebParam(name = "eventUID", targetNamespace = "") SystemEventUID paramSystemEventUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getEventLogsByUID", targetNamespace = "http:
        @ResponseWrapper(localName = "getEventLogsByUIDResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SystemEventLogs getEventLogsByUID(@WebParam(name = "eventUID", targetNamespace = "") SystemEventUID paramSystemEventUID,@WebParam(name = "maxEventsLimit", targetNamespace = "")int paramInt)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getSystemStatistics", targetNamespace = "http:
        @ResponseWrapper(localName = "getSystemStatisticsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SystemStatistics getSystemStatistics()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getAllRPAStatistics", targetNamespace = "http:
        @ResponseWrapper(localName = "getAllRPAStatisticsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<RPAStatistics>getAllRPAStatistics()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getClusterStatistics", targetNamespace = "http:
        @ResponseWrapper(localName = "getClusterStatisticsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClusterStatistics getClusterStatistics(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getUsersSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "getUsersSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract UsersSettings getUsersSettings()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setUsersSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "setUsersSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setUsersSettings(@WebParam(name = "settings", targetNamespace = "") UsersSettings paramUsersSettings)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateSetUsersSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "validateSetUsersSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateSetUsersSettings(@WebParam(name = "settings", targetNamespace = "") UsersSettings paramUsersSettings)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "addUserRole", targetNamespace = "http:
        @ResponseWrapper(localName = "addUserRoleResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void addUserRole(@WebParam(name = "role", targetNamespace = "") UserRole paramUserRole)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateAddUserRole", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAddUserRoleResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAddUserRole(@WebParam(name = "role", targetNamespace = "") UserRole paramUserRole)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "editUserRole", targetNamespace = "http:
        @ResponseWrapper(localName = "editUserRoleResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void editUserRole(@WebParam(name = "oldRoleName", targetNamespace = "") String paramString, @WebParam(name = "newRole", targetNamespace = "")UserRole paramUserRole)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateEditUserRole", targetNamespace = "http:
        @ResponseWrapper(localName = "validateEditUserRoleResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateEditUserRole(@WebParam(name = "oldRoleName", targetNamespace = "") String paramString, @WebParam(name = "newRole", targetNamespace = "")UserRole paramUserRole)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "removeUserRole", targetNamespace = "http:
        @ResponseWrapper(localName = "removeUserRoleResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removeUserRole(@WebParam(name = "role", targetNamespace = "") UserRole paramUserRole)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateRemoveUserRole", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRemoveUserRoleResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRemoveUserRole(@WebParam(name = "role", targetNamespace = "") UserRole paramUserRole)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getUserRoles", targetNamespace = "http:
        @ResponseWrapper(localName = "getUserRolesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<UserRole>getUserRoles()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "disableSystemAlerts", targetNamespace = "http:
        @ResponseWrapper(localName = "disableSystemAlertsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void disableSystemAlerts()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "enableSystemAlerts", targetNamespace = "http:
        @ResponseWrapper(localName = "enableSystemAlertsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void enableSystemAlerts()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSystemAlertsSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "getSystemAlertsSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SystemAlertsSettings getSystemAlertsSettings()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setSystemAlertsSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "setSystemAlertsSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setSystemAlertsSettings(@WebParam(name = "settings", targetNamespace = "") SystemAlertsSettings paramSystemAlertsSettings, @WebParam(name = "requestedSmtpServerAddress", targetNamespace = "")String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "disableSystemReport", targetNamespace = "http:
        @ResponseWrapper(localName = "disableSystemReportResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void disableSystemReport()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateDisableSystemReport", targetNamespace = "http:
        @ResponseWrapper(localName = "validateDisableSystemReportResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateDisableSystemReport()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;

        @WebMethod
        @RequestWrapper(localName = "enableSystemReport", targetNamespace = "http:
        @ResponseWrapper(localName = "enableSystemReportResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void enableSystemReport()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateEnableSystemReport", targetNamespace = "http:
        @ResponseWrapper(localName = "validateEnableSystemReportResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateEnableSystemReport()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSystemReportSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "getSystemReportSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SystemReportSettings getSystemReportSettings()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setSystemReportSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "setSystemReportSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setSystemReportSettings(@WebParam(name = "settings", targetNamespace = "") SystemReportSettings paramSystemReportSettings, @WebParam(name = "requestedSmtpServerAddress", targetNamespace = "")String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateSetSystemReportSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "validateSetSystemReportSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateSetSystemReportSettings(@WebParam(name = "settings", targetNamespace = "") SystemReportSettings paramSystemReportSettings, @WebParam(name = "requestedSmtpServerAddress", targetNamespace = "")String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getUserDefinedProperties", targetNamespace = "http:
        @ResponseWrapper(localName = "getUserDefinedPropertiesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract UserDefinedProperties getUserDefinedProperties()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setUserDefinedProperties", targetNamespace = "http:
        @ResponseWrapper(localName = "setUserDefinedPropertiesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setUserDefinedProperties(@WebParam(name = "userDefinedProperties", targetNamespace = "") UserDefinedProperties paramUserDefinedProperties)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "addSSHKey", targetNamespace = "http:
        @ResponseWrapper(localName = "addSSHKeyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void addSSHKey(@WebParam(name = "key", targetNamespace = "") SSHKey paramSSHKey)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "removeSSHKey", targetNamespace = "http:
        @ResponseWrapper(localName = "removeSSHKeyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removeSSHKey(@WebParam(name = "key", targetNamespace = "") SSHKey paramSSHKey)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getAllSSHKeys", targetNamespace = "http:
        @ResponseWrapper(localName = "getAllSSHKeysResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<SSHKey>getAllSSHKeys()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "addSNMPUser", targetNamespace = "http:
        @ResponseWrapper(localName = "addSNMPUserResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void addSNMPUser(@WebParam(name = "user", targetNamespace = "") SNMPUser paramSNMPUser)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "removeSNMPUser", targetNamespace = "http:
        @ResponseWrapper(localName = "removeSNMPUserResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removeSNMPUser(@WebParam(name = "user", targetNamespace = "") SNMPUser paramSNMPUser)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "enableSNMP", targetNamespace = "http:
        @ResponseWrapper(localName = "enableSNMPResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void enableSNMP()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "disableSNMP", targetNamespace = "http:
        @ResponseWrapper(localName = "disableSNMPResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void disableSNMP()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSNMPSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "getSNMPSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SNMPSettings getSNMPSettings()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setSNMPSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "setSNMPSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setSNMPSettings(@WebParam(name = "settings", targetNamespace = "") SNMPSettings paramSNMPSettings)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getLDAPSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "getLDAPSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract LDAPSettings getLDAPSettings()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateSetLDAPSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "validateSetLDAPSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateSetLDAPSettings(@WebParam(name = "settings", targetNamespace = "") LDAPSettings paramLDAPSettings)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "setLDAPSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "setLDAPSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setLDAPSettings(@WebParam(name = "settings", targetNamespace = "") LDAPSettings paramLDAPSettings)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getLDAPServerInfo", targetNamespace = "http:
        @ResponseWrapper(localName = "getLDAPServerInfoResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract LDAPServerInfo getLDAPServerInfo()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "enableLDAP", targetNamespace = "http:
        @ResponseWrapper(localName = "enableLDAPResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void enableLDAP()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "disableLDAP", targetNamespace = "http:
        @ResponseWrapper(localName = "disableLDAPResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void disableLDAP()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "clearLDAPSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "clearLDAPSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void clearLDAPSettings()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "testCurrentLDAPSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "testCurrentLDAPSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void testCurrentLDAPSettings()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "testLDAPSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "testLDAPSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void testLDAPSettings(@WebParam(name = "settings", targetNamespace = "") LDAPSettings paramLDAPSettings)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "addRecoverPointUser", targetNamespace = "http:
        @ResponseWrapper(localName = "addRecoverPointUserResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void addRecoverPointUser(@WebParam(name = "user", targetNamespace = "") RecoverPointUser paramRecoverPointUser)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateAddRecoverPointUser", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAddRecoverPointUserResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAddRecoverPointUser(@WebParam(name = "user", targetNamespace = "") RecoverPointUser paramRecoverPointUser)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "editRecoverPointUser", targetNamespace = "http:
        @ResponseWrapper(localName = "editRecoverPointUserResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void editRecoverPointUser(@WebParam(name = "oldUserName", targetNamespace = "") String paramString, @WebParam(name = "user", targetNamespace = "")RecoverPointUser paramRecoverPointUser)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateEditRecoverPointUser", targetNamespace = "http:
        @ResponseWrapper(localName = "validateEditRecoverPointUserResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateEditRecoverPointUser(@WebParam(name = "oldUserName", targetNamespace = "") String paramString, @WebParam(name = "user", targetNamespace = "")RecoverPointUser paramRecoverPointUser)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "addRecoverPointUsers", targetNamespace = "http:
        @ResponseWrapper(localName = "addRecoverPointUsersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void addRecoverPointUsers(@WebParam(name = "users", targetNamespace = "") List < RecoverPointUser > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateAddRecoverPointUsers", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAddRecoverPointUsersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAddRecoverPointUsers(@WebParam(name = "users", targetNamespace = "") List < RecoverPointUser > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;

        @WebMethod
        @RequestWrapper(localName = "removeRecoverPointUser", targetNamespace = "http:
        @ResponseWrapper(localName = "removeRecoverPointUserResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removeRecoverPointUser(@WebParam(name = "user", targetNamespace = "") RecoverPointUser paramRecoverPointUser)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateRemoveRecoverPointUser", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRemoveRecoverPointUserResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRemoveRecoverPointUser(@WebParam(name = "user", targetNamespace = "") RecoverPointUser paramRecoverPointUser)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "removeRecoverPointUsers", targetNamespace = "http:
        @ResponseWrapper(localName = "removeRecoverPointUsersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removeRecoverPointUsers(@WebParam(name = "users", targetNamespace = "") List < RecoverPointUser > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateRemoveRecoverPointUsers", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRemoveRecoverPointUsersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRemoveRecoverPointUsers(@WebParam(name = "users", targetNamespace = "") List < RecoverPointUser > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getCurrentUserEventLogsFilter", targetNamespace = "http:
        @ResponseWrapper(localName = "getCurrentUserEventLogsFilterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract UserEventLogsFilter getCurrentUserEventLogsFilter()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setCurrentUserEventLogsFilter", targetNamespace = "http:
        @ResponseWrapper(localName = "setCurrentUserEventLogsFilterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setCurrentUserEventLogsFilter(@WebParam(name = "filter", targetNamespace = "") UserEventLogsFilter paramUserEventLogsFilter)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getAllRecoverPointUsers", targetNamespace = "http:
        @ResponseWrapper(localName = "getAllRecoverPointUsersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<RecoverPointUser>getAllRecoverPointUsers()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getTimeSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "getTimeSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TimeSettings getTimeSettings()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setTimeSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "setTimeSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setTimeSettings(@WebParam(name = "settings", targetNamespace = "") TimeSettings paramTimeSettings)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getSyslogSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "getSyslogSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SyslogSettings getSyslogSettings()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setSyslogSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "setSyslogSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setSyslogSettings(@WebParam(name = "settings", targetNamespace = "") SyslogSettings paramSyslogSettings)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "enableSyslog", targetNamespace = "http:
        @ResponseWrapper(localName = "enableSyslogResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void enableSyslog()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "disableSyslog", targetNamespace = "http:
        @ResponseWrapper(localName = "disableSyslogResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void disableSyslog()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSystemMiscellaneousSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "getSystemMiscellaneousSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SystemMiscellaneousSettings getSystemMiscellaneousSettings()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setSystemMiscellaneousSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "setSystemMiscellaneousSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setSystemMiscellaneousSettings(@WebParam(name = "settings", targetNamespace = "") SystemMiscellaneousSettings paramSystemMiscellaneousSettings)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateSetSystemMiscellaneousSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "validateSetSystemMiscellaneousSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateSetSystemMiscellaneousSettings(@WebParam(name = "settings", targetNamespace = "") SystemMiscellaneousSettings paramSystemMiscellaneousSettings)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "setSystemSecurityLevel", targetNamespace = "http:
        @ResponseWrapper(localName = "setSystemSecurityLevelResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setSystemSecurityLevel(@WebParam(name = "securityLevel", targetNamespace = "") SystemSecurityLevel paramSystemSecurityLevel)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateSetSystemSecurityLevel", targetNamespace = "http:
        @ResponseWrapper(localName = "validateSetSystemSecurityLevelResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateSetSystemSecurityLevel(@WebParam(name = "securityLevel", targetNamespace = "") SystemSecurityLevel paramSystemSecurityLevel)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "detectBottlenecks", targetNamespace = "http:
        @ResponseWrapper(localName = "detectBottlenecksResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TransactionID detectBottlenecks(@WebParam(name = "filter", targetNamespace = "") DetectBottlenecksFilter paramDetectBottlenecksFilter)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getAvailablePhoenixClustersForCluster", targetNamespace = "http:
        @ResponseWrapper(localName = "getAvailablePhoenixClustersForClusterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<String>getAvailablePhoenixClustersForCluster(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getPhoenixClusterState", targetNamespace = "http:
        @ResponseWrapper(localName = "getPhoenixClusterStateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract PhoenixClusterState getPhoenixClusterState(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getPhoenixClustersStateForAllClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "getPhoenixClustersStateForAllClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<PhoenixClusterState>getPhoenixClustersStateForAllClusters()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "attachPhoenixCluster", targetNamespace = "http:
        @ResponseWrapper(localName = "attachPhoenixClusterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void attachPhoenixCluster(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "phoenixClusterName", targetNamespace = "")String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "detachPhoenixCluster", targetNamespace = "http:
        @ResponseWrapper(localName = "detachPhoenixClusterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void detachPhoenixCluster(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getAllStatisticsCategories", targetNamespace = "http:
        @ResponseWrapper(localName = "getAllStatisticsCategoriesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<String>getAllStatisticsCategories()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "exportStatistics", targetNamespace = "http:
        @ResponseWrapper(localName = "exportStatisticsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TransactionID exportStatistics(@WebParam(name = "filter", targetNamespace = "") StatisticsFilter paramStatisticsFilter, @WebParam(name = "fileName", targetNamespace = "") String paramString)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "exportStatisticsToDefaultFile", targetNamespace = "http:
        @ResponseWrapper(localName = "exportStatisticsToDefaultFileResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TransactionID exportStatisticsToDefaultFile(@WebParam(name = "filter", targetNamespace = "") StatisticsFilter paramStatisticsFilter)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getAvailableLongTermStatisticsTimeFrames", targetNamespace = "http:
        @ResponseWrapper(localName = "getAvailableLongTermStatisticsTimeFramesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract LongTermStatisticsTimeFrames getAvailableLongTermStatisticsTimeFrames()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "exportConsolidatedStatisticsByTimeFrame", targetNamespace = "http:
        @ResponseWrapper(localName = "exportConsolidatedStatisticsByTimeFrameResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TransactionID exportConsolidatedStatisticsByTimeFrame(@WebParam(name = "timeFrame", targetNamespace = "") LongTermStatisticsTimeFrame paramLongTermStatisticsTimeFrame)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "exportConsolidatedStatisticsByTimeFrames", targetNamespace = "http:
        @ResponseWrapper(localName = "exportConsolidatedStatisticsByTimeFramesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TransactionID exportConsolidatedStatisticsByTimeFrames(@WebParam(name = "timeFrames", targetNamespace = "") LongTermStatisticsTimeFrames paramLongTermStatisticsTimeFrames)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "clearLongTermStatistics", targetNamespace = "http:
        @ResponseWrapper(localName = "clearLongTermStatisticsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void clearLongTermStatistics()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "suspendConsistencyGroup", targetNamespace = "http:
        @ResponseWrapper(localName = "suspendConsistencyGroupResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void suspendConsistencyGroup(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "resumeConsistencyGroup", targetNamespace = "http:
        @ResponseWrapper(localName = "resumeConsistencyGroupResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void resumeConsistencyGroup(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "acquireClusterManagementIP", targetNamespace = "http:
        @ResponseWrapper(localName = "acquireClusterManagementIPResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void acquireClusterManagementIP(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "releaseClusterManagementIP", targetNamespace = "http:
        @ResponseWrapper(localName = "releaseClusterManagementIPResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void releaseClusterManagementIP(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "startClusterMaintenance", targetNamespace = "http:
        @ResponseWrapper(localName = "startClusterMaintenanceResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void startClusterMaintenance(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "maintenanceMode", targetNamespace = "")ClusterMaintenanceMode paramClusterMaintenanceMode)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "finishClusterMaintenance", targetNamespace = "http:
        @ResponseWrapper(localName = "finishClusterMaintenanceResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void finishClusterMaintenance(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "startRPAMaintenance", targetNamespace = "http:
        @ResponseWrapper(localName = "startRPAMaintenanceResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void startRPAMaintenance(@WebParam(name = "rpa", targetNamespace = "") RpaUID paramRpaUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "finishRPAMaintenance", targetNamespace = "http:
        @ResponseWrapper(localName = "finishRPAMaintenanceResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void finishRPAMaintenance(@WebParam(name = "rpa", targetNamespace = "") RpaUID paramRpaUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getLocalCluster", targetNamespace = "http:
        @ResponseWrapper(localName = "getLocalClusterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClusterUID getLocalCluster()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getCurrentRPA", targetNamespace = "http:
        @ResponseWrapper(localName = "getCurrentRPAResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract RpaUID getCurrentRPA()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getCurrentTime", targetNamespace = "http:
        @ResponseWrapper(localName = "getCurrentTimeResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract RecoverPointTimeStamp getCurrentTime()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSystemInternalConfigParams", targetNamespace = "http:
        @ResponseWrapper(localName = "getSystemInternalConfigParamsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SystemInternalConfigParams getSystemInternalConfigParams()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSystemInternalConfigParamsConflicts", targetNamespace = "http:
        @ResponseWrapper(localName = "getSystemInternalConfigParamsConflictsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract String getSystemInternalConfigParamsConflicts()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getRecoverPointVersion", targetNamespace = "http:
        @ResponseWrapper(localName = "getRecoverPointVersionResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract RecoverPointVersion getRecoverPointVersion()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getTransactionStatus", targetNamespace = "http:
        @ResponseWrapper(localName = "getTransactionStatusResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TransactionStatus getTransactionStatus(@WebParam(name = "transactionID", targetNamespace = "") TransactionID paramTransactionID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getTransactionResult", targetNamespace = "http:
        @ResponseWrapper(localName = "getTransactionResultResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TransactionResult getTransactionResult(@WebParam(name = "transactionID", targetNamespace = "") TransactionID paramTransactionID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "abortTransaction", targetNamespace = "http:
        @ResponseWrapper(localName = "abortTransactionResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void abortTransaction(@WebParam(name = "transactionID", targetNamespace = "") TransactionID paramTransactionID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateAbortTransaction", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAbortTransactionResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAbortTransaction(@WebParam(name = "transactionID", targetNamespace = "") TransactionID paramTransactionID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getFullRecoverPointContext", targetNamespace = "http:
        @ResponseWrapper(localName = "getFullRecoverPointContextResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract FullRecoverPointContext getFullRecoverPointContext()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getClariionVolumesContext", targetNamespace = "http:
        @ResponseWrapper(localName = "getClariionVolumesContextResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClariionVolumesContext getClariionVolumesContext(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSystemStatusContext", targetNamespace = "http:
        @ResponseWrapper(localName = "getSystemStatusContextResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SystemStatusContext getSystemStatusContext()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getFullRecoverPointStateContext", targetNamespace = "http:
        @ResponseWrapper(localName = "getFullRecoverPointStateContextResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract FullRecoverPointStateContext getFullRecoverPointStateContext()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getFullRecoverPointSettingsContext", targetNamespace = "http:
        @ResponseWrapper(localName = "getFullRecoverPointSettingsContextResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract FullRecoverPointSettingsContext getFullRecoverPointSettingsContext()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getFullRecoverPointSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "getFullRecoverPointSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract FullRecoverPointSettings getFullRecoverPointSettings()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "areThereSystemSettingsConflicts", targetNamespace = "http:
        @ResponseWrapper(localName = "areThereSystemSettingsConflictsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract boolean areThereSystemSettingsConflicts()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getFullRecoverPointState", targetNamespace = "http:
        @ResponseWrapper(localName = "getFullRecoverPointStateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract FullRecoverPointState getFullRecoverPointState()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getProtectedVmCount", targetNamespace = "http:
        @ResponseWrapper(localName = "getProtectedVmCountResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<VirtualCenterProtectedVmCountState>getProtectedVmCount()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getVCenterServerViewContext", targetNamespace = "http:
        @ResponseWrapper(localName = "getVCenterServerViewContextResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract VCenterServerViewContext getVCenterServerViewContext(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getClusterSANVolumesContext", targetNamespace = "http:
        @ResponseWrapper(localName = "getClusterSANVolumesContextResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClusterSANVolumesContext getClusterSANVolumesContext(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getConnectionInfo", targetNamespace = "http:
        @ResponseWrapper(localName = "getConnectionInfoResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConnectionInfo getConnectionInfo()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getCurrentUserInformation", targetNamespace = "http:
        @ResponseWrapper(localName = "getCurrentUserInformationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract UserInformation getCurrentUserInformation()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setPassword", targetNamespace = "http:
        @ResponseWrapper(localName = "setPasswordResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setPassword(@WebParam(name = "username", targetNamespace = "") String paramString, @WebParam(name = "currentPassword", targetNamespace = "")byte[]paramArrayOfByte1, @WebParam(name = "newPassword", targetNamespace = "")byte[]paramArrayOfByte2)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getServerCharsetName", targetNamespace = "http:
        @ResponseWrapper(localName = "getServerCharsetNameResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract String getServerCharsetName()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "disableFirstTimeWizard", targetNamespace = "http:
        @ResponseWrapper(localName = "disableFirstTimeWizardResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void disableFirstTimeWizard()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getDefaultUserEventLogsFilter", targetNamespace = "http:
        @ResponseWrapper(localName = "getDefaultUserEventLogsFilterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract UserEventLogsFilter getDefaultUserEventLogsFilter()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getDefaultUsersNames", targetNamespace = "http:
        @ResponseWrapper(localName = "getDefaultUsersNamesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<String>getDefaultUsersNames()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getDefaultRolesNames", targetNamespace = "http:
        @ResponseWrapper(localName = "getDefaultRolesNamesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<String>getDefaultRolesNames()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getAvailableSymmetrixArrays", targetNamespace = "http:
        @ResponseWrapper(localName = "getAvailableSymmetrixArraysResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SymmetrixArrayList getAvailableSymmetrixArrays(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSymmetrixGateKeepersInfo", targetNamespace = "http:
        @ResponseWrapper(localName = "getSymmetrixGateKeepersInfoResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SymmetrixGateKeepersInfo getSymmetrixGateKeepersInfo(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "symmetrixID", targetNamespace = "") String paramString)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getAccessIdsForSymmetrix", targetNamespace = "http:
        @ResponseWrapper(localName = "getAccessIdsForSymmetrixResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SymmetrixHostIDsInfo getAccessIdsForSymmetrix(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "runCallHomeEvent", targetNamespace = "http:
        @ResponseWrapper(localName = "runCallHomeEventResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void runCallHomeEvent()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getCallHomeEvents", targetNamespace = "http:
        @ResponseWrapper(localName = "getCallHomeEventsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract CallHomeEvents getCallHomeEvents()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "generateCallHomeEvents", targetNamespace = "http:
        @ResponseWrapper(localName = "generateCallHomeEventsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract CallHomeEvents generateCallHomeEvents(@WebParam(name = "script", targetNamespace = "") String paramString)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setCallHomeEvents", targetNamespace = "http:
        @ResponseWrapper(localName = "setCallHomeEventsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setCallHomeEvents(@WebParam(name = "callHomeEvents", targetNamespace = "") CallHomeEvents paramCallHomeEvents)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "setArrayIRThrottlingPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "setArrayIRThrottlingPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setArrayIRThrottlingPolicy(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "policy", targetNamespace = "")ArrayIRThrottlingPolicyParams paramArrayIRThrottlingPolicyParams)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "setClusterIRThrottlingPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "setClusterIRThrottlingPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setClusterIRThrottlingPolicy(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "policy", targetNamespace = "")ArrayIRThrottlingPolicy paramArrayIRThrottlingPolicy)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getArrayIRThrottlingPolicy", targetNamespace = "http:
        @ResponseWrapper(localName = "getArrayIRThrottlingPolicyResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ArrayIRThrottlingPolicy getArrayIRThrottlingPolicy(@WebParam(name = "array", targetNamespace = "") String paramString, @WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSystemVersionState", targetNamespace = "http:
        @ResponseWrapper(localName = "getSystemVersionStateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SystemVersionState getSystemVersionState()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "resizeReplicationSet", targetNamespace = "http:
        @ResponseWrapper(localName = "resizeReplicationSetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void resizeReplicationSet(@WebParam(name = "replicationSet", targetNamespace = "") ReplicationSetUID paramReplicationSetUID, @WebParam(name = "resizeReplicationSetParam", targetNamespace = "")ResizeReplicationSetParam paramResizeReplicationSetParam)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateResizeReplicationSet", targetNamespace = "http:
        @ResponseWrapper(localName = "validateResizeReplicationSetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateResizeReplicationSet(@WebParam(name = "replicationSet", targetNamespace = "") ReplicationSetUID paramReplicationSetUID, @WebParam(name = "resizeReplicationSetParam", targetNamespace = "")ResizeReplicationSetParam paramResizeReplicationSetParam)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getRecommendedPrimaryRPANumber", targetNamespace = "http:
        @ResponseWrapper(localName = "getRecommendedPrimaryRPANumberResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract Integer getRecommendedPrimaryRPANumber()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;

        @WebMethod
        @RequestWrapper(localName = "testSyRConnectivity", targetNamespace = "http:
        @ResponseWrapper(localName = "testSyRConnectivityResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void testSyRConnectivity(@WebParam(name = "contactEmail", targetNamespace = "") String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getVCCertificateInformation", targetNamespace = "http:
        @ResponseWrapper(localName = "getVCCertificateInformationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract CertificateInformation getVCCertificateInformation(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "ip", targetNamespace = "") String paramString,@WebParam(name = "port", targetNamespace = "")int paramInt)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "addLicense", targetNamespace = "http:
        @ResponseWrapper(localName = "addLicenseResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void addLicense(@WebParam(name = "license", targetNamespace = "") String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateAddLicense", targetNamespace = "http:
        @ResponseWrapper(localName = "validateAddLicenseResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateAddLicense(@WebParam(name = "license", targetNamespace = "") String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "removeLicense", targetNamespace = "http:
        @ResponseWrapper(localName = "removeLicenseResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removeLicense(@WebParam(name = "license", targetNamespace = "") LicenseUID paramLicenseUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateRemoveLicense", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRemoveLicenseResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRemoveLicense(@WebParam(name = "license", targetNamespace = "") LicenseUID paramLicenseUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getLicenseReport", targetNamespace = "http:
        @ResponseWrapper(localName = "getLicenseReportResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ClusterLicenseReport>getLicenseReport()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "sendLoginEvent", targetNamespace = "http:
        @ResponseWrapper(localName = "sendLoginEventResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void sendLoginEvent(@WebParam(name = "isLoginSuccessful", targetNamespace = "")boolean paramBoolean)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getTargetVmCandidates", targetNamespace = "http:
        @ResponseWrapper(localName = "getTargetVmCandidatesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract TargetVmCandidates getTargetVmCandidates(@WebParam(name = "sourceVmParam", targetNamespace = "") SourceVmParam paramSourceVmParam, @WebParam(name = "vmReplicationTarget", targetNamespace = "") VmReplicationTarget paramVmReplicationTarget)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "addVmsToCG", targetNamespace = "http:
        @ResponseWrapper(localName = "addVmsToCGResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void addVmsToCG(@WebParam(name = "vms", targetNamespace = "") List < VMReplicationSetParam > paramList, @WebParam(name = "cgUID", targetNamespace = "")ConsistencyGroupUID paramConsistencyGroupUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "removeVmsFromCG", targetNamespace = "http:
        @ResponseWrapper(localName = "removeVmsFromCGResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removeVmsFromCG(@WebParam(name = "vms", targetNamespace = "") List < VmUID > paramList, @WebParam(name = "cgUID", targetNamespace = "")ConsistencyGroupUID paramConsistencyGroupUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "replicateVms", targetNamespace = "http:
        @ResponseWrapper(localName = "replicateVmsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupUID replicateVms(@WebParam(name = "params", targetNamespace = "") ReplicateVmsParam paramReplicateVmsParam)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateReplicateVms", targetNamespace = "http:
        @ResponseWrapper(localName = "validateReplicateVmsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateReplicateVms(@WebParam(name = "vms", targetNamespace = "") ReplicateVmsParam paramReplicateVmsParam)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "changeGroupPowerUpSequence", targetNamespace = "http:
        @ResponseWrapper(localName = "changeGroupPowerUpSequenceResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void changeGroupPowerUpSequence(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "powerUpGroup", targetNamespace = "")Long paramLong)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "editVMsReplicationParams", targetNamespace = "http:
        @ResponseWrapper(localName = "editVMsReplicationParamsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void editVMsReplicationParams(@WebParam(name = "params", targetNamespace = "") ConsistencyGroupVMReplicationParams paramConsistencyGroupVMReplicationParams)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateEditVMsReplicationParams", targetNamespace = "http:
        @ResponseWrapper(localName = "validateEditVMsReplicationParamsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateEditVMsReplicationParams(@WebParam(name = "params", targetNamespace = "") ConsistencyGroupVMReplicationParams paramConsistencyGroupVMReplicationParams)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "editVMsHardwareReplicationParams", targetNamespace = "http:
        @ResponseWrapper(localName = "editVMsHardwareReplicationParamsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void editVMsHardwareReplicationParams(@WebParam(name = "params", targetNamespace = "") ConsistencyGroupVMHardwareReplicationParams paramConsistencyGroupVMHardwareReplicationParams)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateEditVMsHardwareReplicationParams", targetNamespace = "http:
        @ResponseWrapper(localName = "validateEditVMsHardwareReplicationParamsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateEditVMsHardwareReplicationParams(@WebParam(name = "params", targetNamespace = "") ConsistencyGroupVMHardwareReplicationParams paramConsistencyGroupVMHardwareReplicationParams)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getClusterSpecificVMsEntitiesInformation", targetNamespace = "http:
        @ResponseWrapper(localName = "getClusterSpecificVMsEntitiesInformationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<VMEntitiesInformation>getClusterSpecificVMsEntitiesInformation(@WebParam(name = "clusterUID", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "vmUIDs", targetNamespace = "")List<VmUID>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getClusterSpecificVMsState", targetNamespace = "http:
        @ResponseWrapper(localName = "getClusterSpecificVMsStateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<VmState>getClusterSpecificVMsState(@WebParam(name = "clusterUID", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "vmUIDs", targetNamespace = "")List<VmUID>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getVmReplicationCandidateClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "getVmReplicationCandidateClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract VmReplicationCandidateClusters getVmReplicationCandidateClusters(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "existingVmsParams", targetNamespace = "") List < ExistingVMParam > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getRecoverPointClustersInformation", targetNamespace = "http:
        @ResponseWrapper(localName = "getRecoverPointClustersInformationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract RecoverPointClustersInformation getRecoverPointClustersInformation()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getVirtualInfrastructuresStateFromAllClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "getVirtualInfrastructuresStateFromAllClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ClusterVirtualInfrastructuresState>getVirtualInfrastructuresStateFromAllClusters()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getVirtualInfrastructuresStateFromCluster", targetNamespace = "http:
        @ResponseWrapper(localName = "getVirtualInfrastructuresStateFromClusterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClusterVirtualInfrastructuresState getVirtualInfrastructuresStateFromCluster(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "enableImageAccessWithGeneralParameters", targetNamespace = "http:
        @ResponseWrapper(localName = "enableImageAccessWithGeneralParametersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void enableImageAccessWithGeneralParameters(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "params", targetNamespace = "")ImageAccessGeneralParameters paramImageAccessGeneralParameters)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateEnableImageAccessWithGeneralParameters", targetNamespace = "http:
        @ResponseWrapper(localName = "validateEnableImageAccessWithGeneralParametersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateEnableImageAccessWithGeneralParameters(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "params", targetNamespace = "")ImageAccessGeneralParameters paramImageAccessGeneralParameters)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getAvailableVirtualNetworksForVm", targetNamespace = "http:
        @ResponseWrapper(localName = "getAvailableVirtualNetworksForVmResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<VirtualNetworkConfiguration>getAvailableVirtualNetworksForVm(@WebParam(name = "vmUid", targetNamespace = "") VmUID paramVmUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getAvailableVirtualNetworksForVms", targetNamespace = "http:
        @ResponseWrapper(localName = "getAvailableVirtualNetworksForVmsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<VirtualNetworkConfiguration>getAvailableVirtualNetworksForVms(@WebParam(name = "vmUids", targetNamespace = "") List < VmUID > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateRemoveConsistencyGroup", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRemoveConsistencyGroupResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRemoveConsistencyGroup(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "addConsistencyGroupCopyPolicyTemplate", targetNamespace = "http:
        @ResponseWrapper(localName = "addConsistencyGroupCopyPolicyTemplateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void addConsistencyGroupCopyPolicyTemplate(@WebParam(name = "template", targetNamespace = "") ConsistencyGroupCopyPolicyTemplate paramConsistencyGroupCopyPolicyTemplate)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "setConsistencyGroupCopyPolicyTemplate", targetNamespace = "http:
        @ResponseWrapper(localName = "setConsistencyGroupCopyPolicyTemplateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setConsistencyGroupCopyPolicyTemplate(@WebParam(name = "template", targetNamespace = "") ConsistencyGroupCopyPolicyTemplate paramConsistencyGroupCopyPolicyTemplate, @WebParam(name = "newTemplateName", targetNamespace = "")String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "removeConsistencyGroupCopyPolicyTemplate", targetNamespace = "http:
        @ResponseWrapper(localName = "removeConsistencyGroupCopyPolicyTemplateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removeConsistencyGroupCopyPolicyTemplate(@WebParam(name = "name", targetNamespace = "") String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "addConsistencyGroupLinkPolicyTemplate", targetNamespace = "http:
        @ResponseWrapper(localName = "addConsistencyGroupLinkPolicyTemplateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void addConsistencyGroupLinkPolicyTemplate(@WebParam(name = "template", targetNamespace = "") ConsistencyGroupLinkPolicyTemplate paramConsistencyGroupLinkPolicyTemplate)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "setConsistencyGroupLinkPolicyTemplate", targetNamespace = "http:
        @ResponseWrapper(localName = "setConsistencyGroupLinkPolicyTemplateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setConsistencyGroupLinkPolicyTemplate(@WebParam(name = "template", targetNamespace = "") ConsistencyGroupLinkPolicyTemplate paramConsistencyGroupLinkPolicyTemplate, @WebParam(name = "newTemplateName", targetNamespace = "")String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "removeConsistencyGroupLinkPolicyTemplate", targetNamespace = "http:
        @ResponseWrapper(localName = "removeConsistencyGroupLinkPolicyTemplateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removeConsistencyGroupLinkPolicyTemplate(@WebParam(name = "name", targetNamespace = "") String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getVPLEXCertificateInformation", targetNamespace = "http:
        @ResponseWrapper(localName = "getVPLEXCertificateInformationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract CertificateInformation getVPLEXCertificateInformation(@WebParam(name = "ip", targetNamespace = "") String paramString, @WebParam(name = "clusterUID", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getArrayCertificateInformation", targetNamespace = "http:
        @ResponseWrapper(localName = "getArrayCertificateInformationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract CertificateInformation getArrayCertificateInformation(@WebParam(name = "certificateInfoParam", targetNamespace = "") ArrayCertificateInformationParam paramArrayCertificateInformationParam)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getArrayCapabilitiesByType", targetNamespace = "http:
        @ResponseWrapper(localName = "getArrayCapabilitiesByTypeResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ArrayCapabilities getArrayCapabilitiesByType(@WebParam(name = "clusterUID", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "arrayType", targetNamespace = "") ArrayType paramArrayType)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getArrayCapabilitiesByID", targetNamespace = "http:
        @ResponseWrapper(localName = "getArrayCapabilitiesByIDResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ArrayCapabilities getArrayCapabilitiesByID(@WebParam(name = "arrayUID", targetNamespace = "") ArrayUID paramArrayUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getArrayConfigurationRequirements", targetNamespace = "http:
        @ResponseWrapper(localName = "getArrayConfigurationRequirementsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ArrayConfigRequirement>getArrayConfigurationRequirements(@WebParam(name = "clusterUID", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "arrayType", targetNamespace = "")ArrayType paramArrayType)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getAvailableArraysFromCluster", targetNamespace = "http:
        @ResponseWrapper(localName = "getAvailableArraysFromClusterResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClusterAvailableArrays getAvailableArraysFromCluster(@WebParam(name = "clusterUID", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "addArray", targetNamespace = "http:
        @ResponseWrapper(localName = "addArrayResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void addArray(@WebParam(name = "addArrayParams", targetNamespace = "") AddArrayParams paramAddArrayParams)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "removeArray", targetNamespace = "http:
        @ResponseWrapper(localName = "removeArrayResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removeArray(@WebParam(name = "arrayUID", targetNamespace = "") ArrayUID paramArrayUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateRemoveArray", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRemoveArrayResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRemoveArray(@WebParam(name = "arrayUID", targetNamespace = "") ArrayUID paramArrayUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getArrayName", targetNamespace = "http:
        @ResponseWrapper(localName = "getArrayNameResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract String getArrayName(@WebParam(name = "arrayUID", targetNamespace = "") ArrayUID paramArrayUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setArraySettings", targetNamespace = "http:
        @ResponseWrapper(localName = "setArraySettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setArraySettings(@WebParam(name = "params", targetNamespace = "") SetArraySettingsParams paramSetArraySettingsParams)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getArraySettings", targetNamespace = "http:
        @ResponseWrapper(localName = "getArraySettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ArraySettings getArraySettings(@WebParam(name = "arrayUID", targetNamespace = "") ArrayUID paramArrayUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getArrayState", targetNamespace = "http:
        @ResponseWrapper(localName = "getArrayStateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ArrayState getArrayState(@WebParam(name = "arrayUID", targetNamespace = "") ArrayUID paramArrayUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getAvailableArrayResourcePools", targetNamespace = "http:
        @ResponseWrapper(localName = "getAvailableArrayResourcePoolsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract AvailableArrayResourcePools getAvailableArrayResourcePools(@WebParam(name = "arrayUID", targetNamespace = "") ArrayUID paramArrayUID,@WebParam(name = "useCache", targetNamespace = "")boolean paramBoolean1,@WebParam(name = "filterManaged", targetNamespace = "")boolean paramBoolean2)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "registerArrayResourcePools", targetNamespace = "http:
        @ResponseWrapper(localName = "registerArrayResourcePoolsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void registerArrayResourcePools(@WebParam(name = "resourcePools", targetNamespace = "") List < RegisterArrayResourcePoolParams > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "unregisterArrayResourcePools", targetNamespace = "http:
        @ResponseWrapper(localName = "unregisterArrayResourcePoolsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void unregisterArrayResourcePools(@WebParam(name = "resourcePools", targetNamespace = "") List < ResourcePoolUID > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateUnregisterArrayResourcePools", targetNamespace = "http:
        @ResponseWrapper(localName = "validateUnregisterArrayResourcePoolsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateUnregisterArrayResourcePools(@WebParam(name = "resourcePools", targetNamespace = "") List < ResourcePoolUID > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getDefaultArrayResourcePool", targetNamespace = "http:
        @ResponseWrapper(localName = "getDefaultArrayResourcePoolResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract DefaultArrayResourcePool getDefaultArrayResourcePool(@WebParam(name = "clusterUID", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "params", targetNamespace = "") DefaultArrayResourcePoolParams paramDefaultArrayResourcePoolParams)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "checkArrayConnectivity", targetNamespace = "http:
        @ResponseWrapper(localName = "checkArrayConnectivityResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void checkArrayConnectivity(@WebParam(name = "clusterUID", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "arrayType", targetNamespace = "")ArrayType paramArrayType, @WebParam(name = "configurationParams", targetNamespace = "http:
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSupportedArrayManagementProviderAndArrayTypesForAllClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "getSupportedArrayManagementProviderAndArrayTypesForAllClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ClusterSupportedArrayManagementProviderAndArrayTypes>getSupportedArrayManagementProviderAndArrayTypesForAllClusters()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getSupportedArrayManagementProviderAndArrayTypes", targetNamespace = "http:
        @ResponseWrapper(localName = "getSupportedArrayManagementProviderAndArrayTypesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract SupportedArrayManagementProviderAndArrayTypes getSupportedArrayManagementProviderAndArrayTypes(@WebParam(name = "clusterUID", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getArrayManagementProviderState", targetNamespace = "http:
        @ResponseWrapper(localName = "getArrayManagementProviderStateResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ArrayManagementProviderState getArrayManagementProviderState(@WebParam(name = "ampUID", targetNamespace = "") ArrayManagementProviderUID paramArrayManagementProviderUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getArrayManagementProviderSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "getArrayManagementProviderSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ArrayManagementProviderSettings getArrayManagementProviderSettings(@WebParam(name = "ampUID", targetNamespace = "") ArrayManagementProviderUID paramArrayManagementProviderUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getArrayManagementProviderStateFromAllClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "getArrayManagementProviderStateFromAllClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ClusterArrayManagementProvidersState>getArrayManagementProviderStateFromAllClusters()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getArrayMamagementProviderSettingsFromAllClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "getArrayMamagementProviderSettingsFromAllClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ClusterArrayManagementProviderSettings>getArrayMamagementProviderSettingsFromAllClusters()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "enableImageAccessForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "enableImageAccessForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void enableImageAccessForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "clusterUID", targetNamespace = "")ClusterUID paramClusterUID, @WebParam(name = "params", targetNamespace = "")ImageAccessParameters paramImageAccessParameters, @WebParam(name = "scenario", targetNamespace = "")ImageAccessScenario paramImageAccessScenario)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getIllegalEnableImageAccessGroupSetProblems", targetNamespace = "http:
        @ResponseWrapper(localName = "getIllegalEnableImageAccessGroupSetProblemsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupSetProblems getIllegalEnableImageAccessGroupSetProblems(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "params", targetNamespace = "") ImageAccessParameters paramImageAccessParameters, @WebParam(name = "scenario", targetNamespace = "") ImageAccessScenario paramImageAccessScenario)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateEnableImageAccessForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "validateEnableImageAccessForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateEnableImageAccessForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "")ClusterUID paramClusterUID, @WebParam(name = "params", targetNamespace = "")ImageAccessParameters paramImageAccessParameters, @WebParam(name = "scenario", targetNamespace = "")ImageAccessScenario paramImageAccessScenario)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "enableImageAccessForGroupSetSubsetWithGeneralParameters", targetNamespace = "http:
        @ResponseWrapper(localName = "enableImageAccessForGroupSetSubsetWithGeneralParametersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void enableImageAccessForGroupSetSubsetWithGeneralParameters(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "clusterUID", targetNamespace = "")ClusterUID paramClusterUID, @WebParam(name = "params", targetNamespace = "")ImageAccessGeneralParameters paramImageAccessGeneralParameters)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getIllegalEnableImageAccessGroupSetProblemsWithGeneralParameters", targetNamespace = "http:
        @ResponseWrapper(localName = "getIllegalEnableImageAccessGroupSetProblemsWithGeneralParametersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupSetProblems getIllegalEnableImageAccessGroupSetProblemsWithGeneralParameters(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "params", targetNamespace = "") ImageAccessGeneralParameters paramImageAccessGeneralParameters)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateEnableImageAccessForGroupSetSubsetWithGeneralParameters", targetNamespace = "http:
        @ResponseWrapper(localName = "validateEnableImageAccessForGroupSetSubsetWithGeneralParametersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateEnableImageAccessForGroupSetSubsetWithGeneralParameters(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "")ClusterUID paramClusterUID, @WebParam(name = "params", targetNamespace = "")ImageAccessGeneralParameters paramImageAccessGeneralParameters)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "disableImageAccessForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "disableImageAccessForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void disableImageAccessForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "")ClusterUID paramClusterUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getIllegalDisableImageAccessGroupSetProblems", targetNamespace = "http:
        @ResponseWrapper(localName = "getIllegalDisableImageAccessGroupSetProblemsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupSetProblems getIllegalDisableImageAccessGroupSetProblems(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID,@WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "validateDisableImageAccessForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "validateDisableImageAccessForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateDisableImageAccessForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "")ClusterUID paramClusterUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "enableDirectAccessForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "enableDirectAccessForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void enableDirectAccessForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "")ClusterUID paramClusterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getIllegalEnableDirectAccessForGroupSetProblems", targetNamespace = "http:
        @ResponseWrapper(localName = "getIllegalEnableDirectAccessForGroupSetProblemsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupSetProblems getIllegalEnableDirectAccessForGroupSetProblems(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateEnableDirectAccessForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "validateEnableDirectAccessForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateEnableDirectAccessForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "")ClusterUID paramClusterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "failoverGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "failoverGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void failoverGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "")ClusterUID paramClusterUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getIllegalFailoverGroupSetProblems", targetNamespace = "http:
        @ResponseWrapper(localName = "getIllegalFailoverGroupSetProblemsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupSetProblems getIllegalFailoverGroupSetProblems(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID,@WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "validateFailoverGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "validateFailoverGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateFailoverGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "")ClusterUID paramClusterUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "recoverProductionForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "recoverProductionForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void recoverProductionForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "")ClusterUID paramClusterUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getIllegalRecoverProductionForGroupSetProblems", targetNamespace = "http:
        @ResponseWrapper(localName = "getIllegalRecoverProductionForGroupSetProblemsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupSetProblems getIllegalRecoverProductionForGroupSetProblems(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID,@WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "validateRecoverProductionForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRecoverProductionForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRecoverProductionForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "")ClusterUID paramClusterUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "rollToImageForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "rollToImageForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void rollToImageForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "")ClusterUID paramClusterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getIllegalRollToImageForGroupSetProblems", targetNamespace = "http:
        @ResponseWrapper(localName = "getIllegalRollToImageForGroupSetProblemsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupSetProblems getIllegalRollToImageForGroupSetProblems(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateRollToImageForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRollToImageForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRollToImageForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "")ClusterUID paramClusterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "createBookmarkForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "createBookmarkForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void createBookmarkForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "bookmarkName", targetNamespace = "")String paramString, @WebParam(name = "consolidationPolicy", targetNamespace = "")BookmarkConsolidationPolicy paramBookmarkConsolidationPolicy, @WebParam(name = "consistencyType", targetNamespace = "")SnapshotConsistencyType paramSnapshotConsistencyType)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "resumeProductionForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "resumeProductionForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void resumeProductionForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "clusterUID", targetNamespace = "")ClusterUID paramClusterUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getIllegalResumeProductionForGroupSetProblems", targetNamespace = "http:
        @ResponseWrapper(localName = "getIllegalResumeProductionForGroupSetProblemsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupSetProblems getIllegalResumeProductionForGroupSetProblems(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "clusterUID", targetNamespace = "") ClusterUID paramClusterUID,@WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "validateResumeProductionForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "validateResumeProductionForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateResumeProductionForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "clusterUID", targetNamespace = "")ClusterUID paramClusterUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "setProductionForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "setProductionForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setProductionForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "clusterUID", targetNamespace = "")ClusterUID paramClusterUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getIllegalSetProductionForGroupSetProblems", targetNamespace = "http:
        @ResponseWrapper(localName = "getIllegalSetProductionForGroupSetProblemsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupSetProblems getIllegalSetProductionForGroupSetProblems(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "clusterUID", targetNamespace = "") ClusterUID paramClusterUID,@WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "validateSetProductionForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "validateSetProductionForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateSetProductionForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "clusterUID", targetNamespace = "")ClusterUID paramClusterUID, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "undoWritesForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "undoWritesForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void undoWritesForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "")ClusterUID paramClusterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getIllegalUndoWritesForGroupSetProblems", targetNamespace = "http:
        @ResponseWrapper(localName = "getIllegalUndoWritesForGroupSetProblemsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupSetProblems getIllegalUndoWritesForGroupSetProblems(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateUndoWritesForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "validateUndoWritesForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateUndoWritesForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "")ClusterUID paramClusterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "disableGroupsForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "disableGroupsForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void disableGroupsForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getIllegalDisableGroupsForGroupSetProblems", targetNamespace = "http:
        @ResponseWrapper(localName = "getIllegalDisableGroupsForGroupSetProblemsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupSetProblems getIllegalDisableGroupsForGroupSetProblems(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateDisableGroupsForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "validateDisableGroupsForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateDisableGroupsForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "enableGroupsForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "enableGroupsForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void enableGroupsForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getIllegalEnableGroupsForGroupSetProblems", targetNamespace = "http:
        @ResponseWrapper(localName = "getIllegalEnableGroupsForGroupSetProblemsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupSetProblems getIllegalEnableGroupsForGroupSetProblems(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset,@WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "suppressCallHomeEvents", targetNamespace = "http:
        @ResponseWrapper(localName = "suppressCallHomeEventsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void suppressCallHomeEvents(@WebParam(name = "suppressUntilInGmt", targetNamespace = "")long paramLong)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateEnableGroupsForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "validateEnableGroupsForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateEnableGroupsForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "startTransfer", targetNamespace = "")boolean paramBoolean)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "pauseTransferForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "pauseTransferForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void pauseTransferForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getIllegalPauseTransferForGroupSetProblems", targetNamespace = "http:
        @ResponseWrapper(localName = "getIllegalPauseTransferForGroupSetProblemsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupSetProblems getIllegalPauseTransferForGroupSetProblems(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;

        @WebMethod
        @RequestWrapper(localName = "validatePauseTransferForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "validatePauseTransferForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validatePauseTransferForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "startTransferForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "startTransferForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void startTransferForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getIllegalStartTransferForGroupSetProblems", targetNamespace = "http:
        @ResponseWrapper(localName = "getIllegalStartTransferForGroupSetProblemsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupSetProblems getIllegalStartTransferForGroupSetProblems(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateStartTransferForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "validateStartTransferForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateStartTransferForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "enableLatestImageAccessForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "enableLatestImageAccessForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void enableLatestImageAccessForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "")ClusterUID paramClusterUID, @WebParam(name = "mode", targetNamespace = "")ImageAccessMode paramImageAccessMode, @WebParam(name = "scenario", targetNamespace = "")ImageAccessScenario paramImageAccessScenario)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getIllegalEnableLatestImageAccessForGroupSetProblems", targetNamespace = "http:
        @ResponseWrapper(localName = "getIllegalEnableLatestImageAccessForGroupSetProblemsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupSetProblems getIllegalEnableLatestImageAccessForGroupSetProblems(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "mode", targetNamespace = "") ImageAccessMode paramImageAccessMode, @WebParam(name = "scenario", targetNamespace = "") ImageAccessScenario paramImageAccessScenario)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateEnableLatestImageAccessForGroupSetSubset", targetNamespace = "http:
        @ResponseWrapper(localName = "validateEnableLatestImageAccessForGroupSetSubsetResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateEnableLatestImageAccessForGroupSetSubset(@WebParam(name = "groupSetSubset", targetNamespace = "") ConsistencyGroupSetSubset paramConsistencyGroupSetSubset, @WebParam(name = "cluster", targetNamespace = "")ClusterUID paramClusterUID, @WebParam(name = "mode", targetNamespace = "")ImageAccessMode paramImageAccessMode, @WebParam(name = "scenario", targetNamespace = "")ImageAccessScenario paramImageAccessScenario)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "enableLatestImageAccess", targetNamespace = "http:
        @ResponseWrapper(localName = "enableLatestImageAccessResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void enableLatestImageAccess(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "mode", targetNamespace = "")ImageAccessMode paramImageAccessMode, @WebParam(name = "scenario", targetNamespace = "")ImageAccessScenario paramImageAccessScenario)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateEnableLatestImageAccess", targetNamespace = "http:
        @ResponseWrapper(localName = "validateEnableLatestImageAccessResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateEnableLatestImageAccess(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "mode", targetNamespace = "")ImageAccessMode paramImageAccessMode, @WebParam(name = "scenario", targetNamespace = "")ImageAccessScenario paramImageAccessScenario)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "calculateVolumeSize", targetNamespace = "http:
        @ResponseWrapper(localName = "calculateVolumeSizeResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract Long calculateVolumeSize(@WebParam(name = "isDistributedCg", targetNamespace = "")boolean paramBoolean,@WebParam(name = "calculateVolumeSizeParams", targetNamespace = "http:
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setClusterAutoRegistrationInformation", targetNamespace = "http:
        @ResponseWrapper(localName = "setClusterAutoRegistrationInformationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setClusterAutoRegistrationInformation(@WebParam(name = "clusterUID", targetNamespace = "http:
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setSuppressAutoRegistrationWarning", targetNamespace = "http:
        @ResponseWrapper(localName = "setSuppressAutoRegistrationWarningResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setSuppressAutoRegistrationWarning(@WebParam(name = "shouldSuppress", targetNamespace = "")boolean paramBoolean)
        throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "registerContactEmail", targetNamespace = "http:
        @ResponseWrapper(localName = "registerContactEmailResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void registerContactEmail(@WebParam(name = "email", targetNamespace = "") String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "dismissVmStartUpPrompts", targetNamespace = "http:
        @ResponseWrapper(localName = "dismissVmStartUpPromptsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void dismissVmStartUpPrompts(@WebParam(name = "groupCopy", targetNamespace = "") ConsistencyGroupCopyUID paramConsistencyGroupCopyUID, @WebParam(name = "actionUIDs", targetNamespace = "")List<VmStartUpActionUID>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "checkConnectivityToExternalHost", targetNamespace = "http:
        @ResponseWrapper(localName = "checkConnectivityToExternalHostResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract HostConnectivityStatus checkConnectivityToExternalHost(@WebParam(name = "hostParams", targetNamespace = "") ExternalHostParams paramExternalHostParams)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "checkConnectivityToExistingExternalHost", targetNamespace = "http:
        @ResponseWrapper(localName = "checkConnectivityToExistingExternalHostResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract HostConnectivityStatus checkConnectivityToExistingExternalHost(@WebParam(name = "externalHost", targetNamespace = "") ExternalHostUID paramExternalHostUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "addExternalHost", targetNamespace = "http:
        @ResponseWrapper(localName = "addExternalHostResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ExternalHostUID addExternalHost(@WebParam(name = "hostParams", targetNamespace = "") ExternalHostParams paramExternalHostParams)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "setExternalHostSettings", targetNamespace = "http:
        @ResponseWrapper(localName = "setExternalHostSettingsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setExternalHostSettings(@WebParam(name = "hostSettings", targetNamespace = "") ExternalHostSettings paramExternalHostSettings)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "removeExternalHost", targetNamespace = "http:
        @ResponseWrapper(localName = "removeExternalHostResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void removeExternalHost(@WebParam(name = "externalHost", targetNamespace = "") ExternalHostUID paramExternalHostUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateRemoveExternalHost", targetNamespace = "http:
        @ResponseWrapper(localName = "validateRemoveExternalHostResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateRemoveExternalHost(@WebParam(name = "externalHost", targetNamespace = "") ExternalHostUID paramExternalHostUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getConsistencyGroupReports", targetNamespace = "http:
        @ResponseWrapper(localName = "getConsistencyGroupReportsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ConsistencyGroupReport>getConsistencyGroupReports(@WebParam(name = "reportsUIDs", targetNamespace = "") List < ReportUID > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getConsistencyGroupReportStats", targetNamespace = "http:
        @ResponseWrapper(localName = "getConsistencyGroupReportStatsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ConsistencyGroupReportStats>getConsistencyGroupReportStats(@WebParam(name = "reportsUIDs", targetNamespace = "") List < ReportUID > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getConsistencyGroupReportsContexts", targetNamespace = "http:
        @ResponseWrapper(localName = "getConsistencyGroupReportsContextsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ConsistencyGroupReportContextInfo>getConsistencyGroupReportsContexts(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "deleteConsistencyGroupReports", targetNamespace = "http:
        @ResponseWrapper(localName = "deleteConsistencyGroupReportsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void deleteConsistencyGroupReports(@WebParam(name = "reportUID", targetNamespace = "") ReportUID paramReportUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getAllConsistencyGroupsInformation", targetNamespace = "http:
        @ResponseWrapper(localName = "getAllConsistencyGroupsInformationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<ConsistencyGroupInformation>getAllConsistencyGroupsInformation()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getConsistencyGroupInformation", targetNamespace = "http:
        @ResponseWrapper(localName = "getConsistencyGroupInformationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ConsistencyGroupInformation getConsistencyGroupInformation(@WebParam(name = "groupUID", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getAvailableVMsForReplication", targetNamespace = "http:
        @ResponseWrapper(localName = "getAvailableVMsForReplicationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<VMEntitiesInformation>getAvailableVMsForReplication(@WebParam(name = "replicationTarget", targetNamespace = "") VmReplicationTarget paramVmReplicationTarget)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "changeVmsPowerUpSequence", targetNamespace = "http:
        @ResponseWrapper(localName = "changeVmsPowerUpSequenceResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void changeVmsPowerUpSequence(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "powerUpSequenceParams", targetNamespace = "")List<VmPowerUpSequenceParam>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getClustersVirtualInfraConfiguration", targetNamespace = "http:
        @ResponseWrapper(localName = "getClustersVirtualInfraConfigurationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClustersVirtualInfraConfiguration getClustersVirtualInfraConfiguration(@WebParam(name = "clusterUIDs", targetNamespace = "") List < ClusterUID > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getClusterVirtualInfraConfiguration", targetNamespace = "http:
        @ResponseWrapper(localName = "getClusterVirtualInfraConfigurationResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract ClusterVirtualInfraConfiguration getClusterVirtualInfraConfiguration(@WebParam(name = "clusterUID", targetNamespace = "") ClusterUID paramClusterUID)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "validateSetVMsReplicationSetsPolicies", targetNamespace = "http:
        @ResponseWrapper(localName = "validateSetVMsReplicationSetsPoliciesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateSetVMsReplicationSetsPolicies(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "vmReplicationSetsPolicies", targetNamespace = "")List<FullVmReplicationSetPolicy>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@RequestWrapper(localName = "setVMsReplicationSetsPolicies", targetNamespace = "http:
        @ResponseWrapper(localName = "setVMsReplicationSetsPoliciesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setVMsReplicationSetsPolicies(@WebParam(name = "group", targetNamespace = "") ConsistencyGroupUID paramConsistencyGroupUID, @WebParam(name = "vmReplicationSetsPolicies", targetNamespace = "")List<FullVmReplicationSetPolicy>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception,FunctionalAPIValidationException_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getAvailablePluginVersions", targetNamespace = "http:
        @ResponseWrapper(localName = "getAvailablePluginVersionsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<String>getAvailablePluginVersions()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "changePluginVersion", targetNamespace = "http:
        @ResponseWrapper(localName = "changePluginVersionResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void changePluginVersion(@WebParam(name = "vcuid", targetNamespace = "") VirtualCenterUID paramVirtualCenterUID, @WebParam(name = "newVersion", targetNamespace = "")String paramString)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "validateSetVMsNetworkPolicies", targetNamespace = "http:
        @ResponseWrapper(localName = "validateSetVMsNetworkPoliciesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void validateSetVMsNetworkPolicies(@WebParam(name = "networkSettingsForVMs", targetNamespace = "") List < VmNetworkPolicy > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;

        @WebMethod
        @RequestWrapper(localName = "setVMsNetworkPolicies", targetNamespace = "http:
        @ResponseWrapper(localName = "setVMsNetworkPoliciesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void setVMsNetworkPolicies(@WebParam(name = "networkSettingsForVMs", targetNamespace = "") List < VmNetworkPolicy > paramList)
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception, FunctionalAPIValidationException_Exception;

        @WebMethod
        @WebResult(targetNamespace = "")
        @RequestWrapper(localName = "getIsTrialVersion", targetNamespace = "http:
        @ResponseWrapper(localName = "getIsTrialVersionResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract boolean getIsTrialVersion()
        throws FunctionalAPIActionFailedException_Exception, FunctionalAPIInternalError_Exception;

        @WebMethod
        @RequestWrapper(localName = "registerEsxClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "registerEsxClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void registerEsxClusters(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "vcUID", targetNamespace = "")VirtualCenterUID paramVirtualCenterUID, @WebParam(name = "esxClusterUIDs", targetNamespace = "")List<EsxClusterUID>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "unregisterEsxClusters", targetNamespace = "http:
        @ResponseWrapper(localName = "unregisterEsxClustersResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void unregisterEsxClusters(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "vcUID", targetNamespace = "")VirtualCenterUID paramVirtualCenterUID, @WebParam(name = "esxClusterUIDs", targetNamespace = "")List<EsxClusterUID>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getCandidateEsxClustersForAddition", targetNamespace = "http:
        @ResponseWrapper(localName = "getCandidateEsxClustersForAdditionResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<EsxCluster>getCandidateEsxClustersForAddition(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID, @WebParam(name = "vcUID", targetNamespace = "")VirtualCenterUID paramVirtualCenterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "getCandidateEsxClustersForAdditionFromAllVcs", targetNamespace = "http:
        @ResponseWrapper(localName = "getCandidateEsxClustersForAdditionFromAllVcsResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<EsxCluster>getCandidateEsxClustersForAdditionFromAllVcs(@WebParam(name = "cluster", targetNamespace = "") ClusterUID paramClusterUID)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@WebResult(targetNamespace = "")
@RequestWrapper(localName = "troubleshootEntities", targetNamespace = "http:
        @ResponseWrapper(localName = "troubleshootEntitiesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract List<TroubleshootResult>troubleshootEntities(@WebParam(name = "arrayUID", targetNamespace = "") ArrayUID paramArrayUID, @WebParam(name = "entities", targetNamespace = "")List<Entity>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "fixIssues", targetNamespace = "http:
        @ResponseWrapper(localName = "fixIssuesResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void fixIssues(@WebParam(name = "arrayUID", targetNamespace = "") ArrayUID paramArrayUID, @WebParam(name = "entities", targetNamespace = "")List<Entity>paramList)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;

@WebMethod
@RequestWrapper(localName = "fixIssue", targetNamespace = "http:
        @ResponseWrapper(localName = "fixIssueResponse", targetNamespace = "http:
        @Action(input = "http:
        public abstract void fixIssue(@WebParam(name = "arrayUID", targetNamespace = "") ArrayUID paramArrayUID, @WebParam(name = "entities", targetNamespace = "")List<Entity>paramList, @WebParam(name = "issueType", targetNamespace = "")IssueType paramIssueType)
throws FunctionalAPIActionFailedException_Exception,FunctionalAPIInternalError_Exception;
        }


