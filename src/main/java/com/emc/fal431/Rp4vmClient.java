package com.emc.fal431;

import com.emc.fal431.commons.*;
import com.emc.fal431.exceptions.Rp4vmClientException;
import com.emc.fal431.exceptions.Rp4vmClientUnAuthorizedException;
import org.springframework.http.HttpStatus;
import retrofit2.Response;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * Created by davidn1 on 15-May-16.
 */
public class Rp4vmClient {

    private Rp4vmClusterConnector service;

    public Rp4vmClient(String ipAddress, String user, String password) throws NoSuchAlgorithmException, KeyManagementException {
        this.service = Rp4vmClusterConnectorFactory.getConnector(ipAddress, user, password);
    }

    public Date getRp4vmTime() throws Rp4vmClientException {
        try {
            Response<RecoverPointTimeStamp> response = service.getSystemTime().execute();
            validateResponse(response);
            RecoverPointTimeStamp res = response.body();
            Date date = new Date(res.getTimeInMicroSeconds() / 1000);
            return date;
        } catch (IOException e) {
            throw new Rp4vmClientException(e);
        }
    }

    /**
     * @return Map of vmId => vmName in the cluster
     */
    public Map<String, String> getVmNamesInCluster(long clusterId) throws Rp4vmClientException {

        try {
            Response<ClusterVirtualInfrastructuresState> response =
                    service.getVirtualInfrastructuresStateFromCluster(clusterId).execute();
            validateResponse(response);
            ClusterVirtualInfrastructuresState state =response.body();

            Collection<VmState> vmStateList =
                    state.getVirtualInfrastructuresState().getVmsState();
            Map<String, String> res = new HashMap<>();
            for (VmState vmState : vmStateList) {
                String vmId = vmState.getVmUID().getUuid();
                String vmName = vmState.getName();
                res.put(vmId, vmName);
            }
            return res;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @return Map of clusterId => clusterName
     */
    public Map<Long, String> getClusterNames() throws Rp4vmClientException {
        try {

            Response<RecoverPointClustersInformation> response = service.getRpClustersInformation().execute();
            validateResponse(response);
            RecoverPointClustersInformation rpClusters = response.body();

            Map<Long, String> res = new HashMap<>();
            for (ClusterInfo clusterInfo : rpClusters.getClustersInformation())
                res.put(clusterInfo.getClusterUID().getId(),
                        clusterInfo.getClusterName());
            return res;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void validateResponse(Response<?> response) throws Rp4vmClientException {
        if (HttpStatus.UNAUTHORIZED.value() == response.code()) {
            throw new Rp4vmClientUnAuthorizedException();
        }
        if (HttpStatus.OK.value() != response.code()) {
            throw new Rp4vmClientException("Couldn't get time, error " + response.code());
        }
    }

//    //Create consisteny group
//    public long createConsistencyGroup(String cgName, List<String> vmIds,
//                                       List<PackageConfig> accountConfigList, int rpo,
//                                       boolean startReplication) {
//        Map<Long, PackageConfig> accountConfigsMap = getAccountConfigsMap(accountConfigList);
//        ReplicateVmsParam replicateVmsParam = new ReplicateVmsParam();
//
//        // CG name
//        replicateVmsParam.setCgName(cgName);
//        replicateVmsParam.setStartTransfer(startReplication);
//
//        // production copy ID
//        PackageConfig productionConfig = null;
//        // List<AccountConfig> replicasConfig = new LinkedList<AccountConfig>();
//        for (PackageConfig accountConfig : accountConfigList) {
//            if (accountConfig.getIsProductionCluster()) {
//                productionConfig = accountConfig;
//            }
//        }
//
//        GlobalCopyUID productionCopy = new GlobalCopyUID();
//        productionCopy.setCopyUID(0);
//        Long productionClusterId = productionConfig.getClusterId();
//        productionCopy.setClusterUID(new ClusterUID(productionClusterId));
//        replicateVmsParam.setProductionCopy(productionCopy);
//
//        // replication sets
//        Collection<VMReplicationSetParam> vmReplicationSets = replicateVmsParam
//                .getVmReplicationSets();
//
//        for (String vmId : vmIds) {
//            List<ReplicatedVMParams> replicatedVmParams = new LinkedList<ReplicatedVMParams>();
//
//            // create source vm parameter
//            ReplicatedVMParams sourceReplicatedVMParam = new ReplicatedVMParams();
//
//            SourceVmParam sourceVmParam = new SourceVmParam();
//            VmUID vmUID = new VmUID();
//            vmUID.setUuid(vmId);
//            String prodVcId = accountConfigsMap.get(productionClusterId)
//                    .getVcId();
//            VirtualCenterUID virtualCenterUID = new VirtualCenterUID(prodVcId);
//            vmUID.setVirtualCenterUID(virtualCenterUID);
//            sourceVmParam.setVmUID(vmUID);
//            sourceVmParam.setClusterUID(new ClusterUID(productionClusterId));
//
//            sourceReplicatedVMParam.setVmParam(sourceVmParam);
//            sourceReplicatedVMParam.setCopyUID(productionCopy);
//
//            // replicatedVmParams.add(sourceReplicatedVMParam);
//
//            // add source and targets
//            for (PackageConfig accountConfig : accountConfigList) {
//                if (!accountConfig.getIsProductionCluster()) {
//                    // add source vm parameter
//                    replicatedVmParams.add(sourceReplicatedVMParam);
//                    // add target vm parameter
//                    ReplicatedVMParams targetReplicatedVMParam = new ReplicatedVMParams();
//                    CreateVMParam createVMParam = new CreateVMParam();
//                    GlobalCopyUID targetGlobalCopyUID = new GlobalCopyUID(
//                            new ClusterUID(accountConfig.getClusterId()), 0);
//                    String replicaVcId = accountConfigsMap.get(
//                            targetGlobalCopyUID.getClusterUID().getId())
//                            .getVcId();
//                    String replicaDataStoreId = accountConfigsMap.get(
//                            targetGlobalCopyUID.getClusterUID().getId())
//                            .getDatastoreId();
//                    String replicaEsxId = accountConfigsMap.get(
//                            targetGlobalCopyUID.getClusterUID().getId())
//                            .getEsxId();
//                    createVMParam
//                            .setTargetVirtualCenterUID(new VirtualCenterUID(
//                                    replicaVcId));
//                    createVMParam.setTargetDatastoreUID(new DatastoreUID(
//                            replicaDataStoreId));
//                    createVMParam
//                            .setTargetResourcePlacementParam(new CreateTargetVMManualResourcePlacementParam(
//                                    new EsxUID(replicaEsxId)));
//
//                    targetReplicatedVMParam.setVmParam(createVMParam);
//                    targetReplicatedVMParam.setCopyUID(targetGlobalCopyUID);
//
//                    replicatedVmParams.add(targetReplicatedVMParam);
//                }
//            }
//
//            VirtualHardwareReplicationPolicy virtualHardwareReplicationPolicy = new VirtualHardwareReplicationPolicy();
//            virtualHardwareReplicationPolicy
//                    .setProvisionPolicy(DiskProvisionPolicy.SAME_AS_SOURCE);
//            virtualHardwareReplicationPolicy
//                    .setHwChangesPolicy(HardwareChangesPolicy.REPLICATE_HW_CHANGES);
//
//            VirtualDisksReplicationPolicy virtualDisksReplicationPolicy = new VirtualDisksReplicationPolicy();
//            virtualDisksReplicationPolicy.setAutoReplicateNewVirtualDisks(true);
//
//            // create and add new replication set
//            VMReplicationSetParam replicationSetParam = new VMReplicationSetParam(
//                    replicatedVmParams, virtualHardwareReplicationPolicy,
//                    virtualDisksReplicationPolicy);
//            vmReplicationSets.add(replicationSetParam);
//
//        }
//
//        // create copies
//        Collection<ConsistencyGroupCopyParam> copiesList = replicateVmsParam.getCopies();
//        for (PackageConfig accountConfig : accountConfigList) {
//            GlobalCopyUID copyUID = new GlobalCopyUID(new ClusterUID(
//                    accountConfig.getClusterId()), 0);
//            ConsistencyGroupCopyParam consistencyGroupCopyParam = new ConsistencyGroupCopyParam();
//            consistencyGroupCopyParam.setCopyUID(copyUID);
//            consistencyGroupCopyParam.setCopyName(accountConfig
//                    .getClusterFriendlyName());
//
//            ConsistencyGroupCopyVolumeCreationParams consistencyGroupCopyVolumeCreationParams = new ConsistencyGroupCopyVolumeCreationParams();
//            VolumeCreationParams volumeCreationParams = new VolumeCreationParams();
//
//            volumeCreationParams.setVolumeSize(new VolumeSize(
//                    10l * 1024l * 1024l * 1024l));
//
//            ResourcePoolUID resourcePoolUID = getRelevantResourcePool(
//                    accountConfig.getClusterId(), accountConfig.getVcId(),
//                    accountConfig.getDatastoreId());
//
//            volumeCreationParams.setPoolUid(resourcePoolUID);
//            volumeCreationParams
//                    .setResourcePoolType(ArrayResourcePoolType.VC_DATASTORE);
//            volumeCreationParams.setArrayUid(resourcePoolUID.getArrayUid());
//
//            consistencyGroupCopyVolumeCreationParams.getVolumeParams().add(
//                    volumeCreationParams);
//            consistencyGroupCopyParam
//                    .setVolumeCreationParams(consistencyGroupCopyVolumeCreationParams);
//            copiesList.add(consistencyGroupCopyParam);
//
//        }
//
//        // create links
//        Collection<FullConsistencyGroupLinkPolicy> linkPoliciesList = replicateVmsParam.getLinks();
//        ConsistencyGroupLinkPolicy remoteDefaultLinkPolicy = connector
//                .getDefaultRemoteGroupLinkPolicy();
//        remoteDefaultLinkPolicy.getProtectionPolicy().getRpoPolicy()
//                .setMaximumAllowedLag(new Quantity(rpo, QuantityType.MINUTES));
//        for (PackageConfig accountConfig : accountConfigList) {
//            if (!accountConfig.getIsProductionCluster()) {
//                ConsistencyGroupLinkUID linkUID = new ConsistencyGroupLinkUID();
//                linkUID.setGroupUID(new ConsistencyGroupUID(0));
//                linkUID.setFirstCopy(productionCopy);
//                GlobalCopyUID copyUID = new GlobalCopyUID(new ClusterUID(
//                        accountConfig.getClusterId()), 0);
//                linkUID.setSecondCopy(copyUID);
//                FullConsistencyGroupLinkPolicy fullConsistencyGroupLinkPolicy = new FullConsistencyGroupLinkPolicy();
//                fullConsistencyGroupLinkPolicy
//                        .setLinkPolicy(remoteDefaultLinkPolicy);
//                fullConsistencyGroupLinkPolicy.setLinkUID(linkUID);
//                linkPoliciesList.add(fullConsistencyGroupLinkPolicy);
//            }
//        }
//
//        ConsistencyGroupUID consistencyGroupUID = connector.replicateVms(
//                replicateVmsParam, true);
//        return consistencyGroupUID.getId();
//    }
}