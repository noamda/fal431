package com.emc.fal431;


import com.emc.fal431.convertor.JacksonConverterFactory;
import com.emc.fal431.exceptions.Rp4vmClusterNotFoundException;
import com.emc.fal431.exceptions.Rp4vmEsxNotFoundException;
import com.emc.fapi.jaxws.v4_3_1.*;
import com.emc.fal431.exceptions.Rp4vmClientException;
import com.emc.fal431.exceptions.Rp4vmClientUnAuthorizedException;
import org.springframework.http.HttpStatus;
import retrofit2.Response;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import static javax.swing.UIManager.get;
import static org.apache.coyote.http11.Constants.a;

/**
 * Created by davidn1 on 15-May-16.
 */
public class Rp4vmClient {

    private Rp4vmClusterConnector service;
    private String ipAddress;

    public Rp4vmClient(String ipAddress, String user, String password) throws NoSuchAlgorithmException, KeyManagementException {
        this.ipAddress = ipAddress;
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
            ClusterVirtualInfrastructuresState state = response.body();

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
            throw new Rp4vmClientException(e);
        }

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
            throw new Rp4vmClientException(e);
        }

    }

    private void validateResponse(Response<?> response) throws Rp4vmClientException {
        if (HttpStatus.UNAUTHORIZED.value() == response.code()) {
            throw new Rp4vmClientUnAuthorizedException();
        }
        if (HttpStatus.OK.value() != response.code()) {
            throw new Rp4vmClientException("Couldn't get time, error " + response.code());
        }
    }

    //Create consisteny group
    public long createConsistencyGroup(String cgName, List<String> vmIds,
                                       ClustersVirtualConfiguration clustersVirtualConfiguration, int rpo,
                                       boolean startReplication) throws Rp4vmClientException {

        ReplicateVmsParam replicateVmsParam = new ReplicateVmsParam();

        // CG name
        replicateVmsParam.setCgName(cgName);
        replicateVmsParam.setStartTransfer(startReplication);

        // production copy ID
        ClusterVirtualConfiguration productionConfig = clustersVirtualConfiguration.getProductionCluster();


        GlobalCopyUID productionCopy = new GlobalCopyUID();
        productionCopy.setCopyUID(0);
        Long productionClusterId = productionConfig.getClusterId();
        productionCopy.setClusterUID(new ClusterUID(productionClusterId));
        replicateVmsParam.setProductionCopy(productionCopy);

        // replication sets
        Collection<VMReplicationSetParam> vmReplicationSets = replicateVmsParam
                .getVmReplicationSets();

        for (String vmId : vmIds) {
            List<ReplicatedVMParams> replicatedVmParams = new LinkedList<ReplicatedVMParams>();

            // create source vm parameter
            ReplicatedVMParams sourceReplicatedVMParam = new ReplicatedVMParams();

            SourceVmParam sourceVmParam = new SourceVmParam();
            VmUID vmUID = new VmUID();
            vmUID.setUuid(vmId);
            String prodVcId = productionConfig.getVcId();
            VirtualCenterUID virtualCenterUID = new VirtualCenterUID(prodVcId);
            vmUID.setVirtualCenterUID(virtualCenterUID);
            sourceVmParam.setVmUID(vmUID);
            sourceVmParam.setClusterUID(new ClusterUID(productionClusterId));

            sourceReplicatedVMParam.setVmParam(sourceVmParam);
            sourceReplicatedVMParam.setCopyUID(productionCopy);

            // replicatedVmParams.add(sourceReplicatedVMParam);

            // add source and targets
            for (ClusterVirtualConfiguration accountConfig : clustersVirtualConfiguration.getReplicaClusters()) {
                // add source vm parameter
                replicatedVmParams.add(sourceReplicatedVMParam);
                // add target vm parameter
                ReplicatedVMParams targetReplicatedVMParam = new ReplicatedVMParams();
                CreateVMParam createVMParam = new CreateVMParam();
                GlobalCopyUID targetGlobalCopyUID = new GlobalCopyUID(
                        new ClusterUID(accountConfig.getClusterId()), 0);
                String replicaVcId = accountConfig
                        .getVcId();
                String replicaDataStoreId = accountConfig
                        .getDatastoreId();
                String replicaEsxId = accountConfig
                        .getEsxId();
                createVMParam
                        .setTargetVirtualCenterUID(new VirtualCenterUID(
                                replicaVcId));
                createVMParam.setTargetDatastoreUID(new DatastoreUID(
                        replicaDataStoreId));
                createVMParam
                        .setTargetResourcePlacementParam(new CreateTargetVMManualResourcePlacementParam(
                                new EsxUID(replicaEsxId)));

                targetReplicatedVMParam.setVmParam(createVMParam);
                targetReplicatedVMParam.setCopyUID(targetGlobalCopyUID);

                replicatedVmParams.add(targetReplicatedVMParam);

            }

            VirtualHardwareReplicationPolicy virtualHardwareReplicationPolicy = new VirtualHardwareReplicationPolicy();
            virtualHardwareReplicationPolicy
                    .setProvisionPolicy(DiskProvisionPolicy.SAME_AS_SOURCE);
            virtualHardwareReplicationPolicy
                    .setHwChangesPolicy(HardwareChangesPolicy.REPLICATE_HW_CHANGES);

            VirtualDisksReplicationPolicy virtualDisksReplicationPolicy = new VirtualDisksReplicationPolicy();
            virtualDisksReplicationPolicy.setAutoReplicateNewVirtualDisks(true);

            // create and add new replication set
            VMReplicationSetParam replicationSetParam = new VMReplicationSetParam(
                    replicatedVmParams, virtualHardwareReplicationPolicy,
                    virtualDisksReplicationPolicy);
            vmReplicationSets.add(replicationSetParam);

        }

        // create copies
        Collection<ConsistencyGroupCopyParam> copiesList = replicateVmsParam.getCopies();
        List<ClusterVirtualConfiguration> joinedProductionReplicaConfigs = new ArrayList<ClusterVirtualConfiguration>();
        joinedProductionReplicaConfigs.add(productionConfig);
        joinedProductionReplicaConfigs.addAll(clustersVirtualConfiguration.getReplicaClusters());
        for (ClusterVirtualConfiguration accountConfig : joinedProductionReplicaConfigs) {
            GlobalCopyUID copyUID = new GlobalCopyUID(new ClusterUID(
                    accountConfig.getClusterId()), 0);
            ConsistencyGroupCopyParam consistencyGroupCopyParam = new ConsistencyGroupCopyParam();
            consistencyGroupCopyParam.setCopyUID(copyUID);
            consistencyGroupCopyParam.setCopyName(accountConfig
                    .getClusterFriendlyName());

            ConsistencyGroupCopyVolumeCreationParams consistencyGroupCopyVolumeCreationParams = new ConsistencyGroupCopyVolumeCreationParams();
            VolumeCreationParams volumeCreationParams = new VolumeCreationParams();

            volumeCreationParams.setVolumeSize(new VolumeSize(
                    10l * 1024l * 1024l * 1024l));

            ResourcePoolUID resourcePoolUID = getRelevantResourcePool(
                    accountConfig.getClusterId(), accountConfig.getVcId(),
                    accountConfig.getDatastoreId());

            volumeCreationParams.setPoolUid(resourcePoolUID);
            volumeCreationParams
                    .setResourcePoolType(ArrayResourcePoolType.VC_DATASTORE);
            volumeCreationParams.setArrayUid(resourcePoolUID.getArrayUid());

            consistencyGroupCopyVolumeCreationParams.getVolumeParams().add(
                    volumeCreationParams);
            consistencyGroupCopyParam
                    .setVolumeCreationParams(consistencyGroupCopyVolumeCreationParams);
            copiesList.add(consistencyGroupCopyParam);

        }

        // create links
        Collection<FullConsistencyGroupLinkPolicy> linkPoliciesList = replicateVmsParam.getLinks();
        ConsistencyGroupLinkPolicy remoteDefaultLinkPolicy = getDefaultRemoteGroupLinkPolicy();
        remoteDefaultLinkPolicy.getProtectionPolicy().getRpoPolicy()
                .setMaximumAllowedLag(new Quantity(rpo, QuantityType.MINUTES));
        for (ClusterVirtualConfiguration accountConfig : clustersVirtualConfiguration.getReplicaClusters()) {
            ConsistencyGroupLinkUID linkUID = new ConsistencyGroupLinkUID();
            linkUID.setGroupUID(new ConsistencyGroupUID(0));
            linkUID.setFirstCopy(productionCopy);
            GlobalCopyUID copyUID = new GlobalCopyUID(new ClusterUID(
                    accountConfig.getClusterId()), 0);
            linkUID.setSecondCopy(copyUID);
            FullConsistencyGroupLinkPolicy fullConsistencyGroupLinkPolicy = new FullConsistencyGroupLinkPolicy();
            fullConsistencyGroupLinkPolicy
                    .setLinkPolicy(remoteDefaultLinkPolicy);
            fullConsistencyGroupLinkPolicy.setLinkUID(linkUID);
            linkPoliciesList.add(fullConsistencyGroupLinkPolicy);
        }

        ConsistencyGroupUID consistencyGroupUID = replicateVms(
                replicateVmsParam, true);
        return consistencyGroupUID.getId();
    }

    //Create consisteny group
    public long createConsistencyGroupnew(String cgName, String vmId,
                                          Long prodClusterId, Long targetClusterId, String esxName,String targetDatastoreId, int rpo,
                                          boolean startReplication) throws Rp4vmClientException, Rp4vmClusterNotFoundException, Rp4vmEsxNotFoundException {
        ReplicateVmsParam json = new ReplicateVmsParam();
        //Set CG name
        json.setCgName(cgName);
        //Set start Transfer
        json.setStartTransfer(startReplication);
        // production copy ID
        GlobalCopyUID prodCopyUid = new GlobalCopyUID(new ClusterUID(prodClusterId), 0);
        //Set production copy in replicateVmsparam
        json.setProductionCopy(prodCopyUid);
        // replication sets
        // replication sets
        Collection<VMReplicationSetParam> vmReplicationSets = json
                .getVmReplicationSets();


        // create target vm parameters
        ReplicatedVMParams targetReplicatedVMParam = new ReplicatedVMParams();
        GlobalCopyUID targetCopyUid = new GlobalCopyUID(new ClusterUID(targetClusterId),0);
        CreateVMParam createTargetVMParam = new CreateVMParam();
        // get target VcId
        String targetVcId = getVcenterUuid(targetClusterId);
        // create target EsxId
        String targetEsxUID = getEsxId(targetClusterId,esxName);
        // insert VcID DatastoreID and EsxId to createVMparam
        createTargetVMParam.setTargetVirtualCenterUID(new VirtualCenterUID(targetVcId));
        createTargetVMParam.setTargetDatastoreUID(new DatastoreUID(targetDatastoreId));
        createTargetVMParam.setTargetResourcePlacementParam( new CreateTargetVMManualResourcePlacementParam(new EsxUID(targetEsxUID)));
        targetReplicatedVMParam.setVmParam(createTargetVMParam);
        targetReplicatedVMParam.setCopyUID(targetCopyUid);

        // create source vm parameter
        ReplicatedVMParams sourceReplicatedVMParam = new ReplicatedVMParams();
        //set copyUID for replicationSetVms
        sourceReplicatedVMParam.setCopyUID(prodCopyUid);
        SourceVmParam sourceVmParam = new SourceVmParam();
        VmUID vmUID = new VmUID();
        vmUID.setUuid(vmId);
        String prodVcId = getVcenterUuid(prodClusterId);
        VirtualCenterUID virtualCenterUID = new VirtualCenterUID(prodVcId);
        vmUID.setVirtualCenterUID(virtualCenterUID);
        sourceVmParam.setVmUID(vmUID);
        sourceVmParam.setClusterUID(new ClusterUID(prodClusterId));

        sourceReplicatedVMParam.setVmParam(sourceVmParam);
        VMReplicationSetParam vmReplicationSetParam = new VMReplicationSetParam();
        vmReplicationSetParam.getReplicationSetVms().add(targetReplicatedVMParam);
        vmReplicationSetParam.getReplicationSetVms().add(sourceReplicatedVMParam);
        json.getVmReplicationSets().add(vmReplicationSetParam);
        //add VirtualHardwareReplicationPolicy
        VirtualHardwareReplicationPolicy virtualHardwareReplicationPolicy = new VirtualHardwareReplicationPolicy();
        virtualHardwareReplicationPolicy
                .setProvisionPolicy(DiskProvisionPolicy.SAME_AS_SOURCE);
        virtualHardwareReplicationPolicy
                .setHwChangesPolicy(HardwareChangesPolicy.REPLICATE_HW_CHANGES);

        VirtualDisksReplicationPolicy virtualDisksReplicationPolicy = new VirtualDisksReplicationPolicy();
        virtualDisksReplicationPolicy.setAutoReplicateNewVirtualDisks(true);
        // add to vmReplicationSetParam
        vmReplicationSetParam.setVirtualDisksReplicationPolicy(virtualDisksReplicationPolicy);
        vmReplicationSetParam.setVirtualHardwareReplicationPolicy(virtualHardwareReplicationPolicy);
        json.getVmReplicationSets().add(vmReplicationSetParam);





        ConsistencyGroupUID consistencyGroupUID = replicateVms(json, true);
        return consistencyGroupUID.getId();

    }

    public ResourcePoolUID getRelevantResourcePool(long clusterId, String vcId,
                                                   String datastoreId) throws Rp4vmClientException {
        ResourcePoolUID res = null;
        ClusterSettings clusterSettings = getClusterSettings(clusterId);
        Collection<ArrayManagementProviderSettings> arrayManagementProviderSettings = clusterSettings
                .getAmpsSettings();
        for (ArrayManagementProviderSettings currProviderSettings : arrayManagementProviderSettings) {
            if (currProviderSettings.getType().equals(
                    ArrayManagementProviderType.VC)) {
                Collection<ArraySettings> managedArrays = currProviderSettings
                        .getManagedArrays();
                for (ArraySettings currArraySettings : managedArrays) {
                    String serialNumber = currArraySettings.getSerialNumber();
                    if (vcId.equals(serialNumber)) {
                        Collection<ArrayResourcePoolSettings> resourcePools = currArraySettings
                                .getResourcePools();
                        for (ArrayResourcePoolSettings currArrayResourcePoolSettings : resourcePools) {
                            ResourcePoolUID resourcePoolUid = currArrayResourcePoolSettings
                                    .getResourcePoolUID();
                            if (resourcePoolUid.getStorageResourcePoolId()
                                    .equals(datastoreId)) {
                                res = resourcePoolUid;
                            }
                        }
                    }
                }
            }
        }
        return res;
    }


    public ClusterSettings getClusterSettings(long clusterId) throws Rp4vmClientException {
        try {
            Response<ClusterSettings> response = service.getClusterSettings(clusterId).execute();
            validateResponse(response);
            ClusterSettings clusterConfig = response.body();
            return clusterConfig;
        } catch (IOException e) {
            throw new Rp4vmClientException(e);
        }
    }


    public ConsistencyGroupLinkPolicy getDefaultRemoteGroupLinkPolicy() throws Rp4vmClientException {
        try {
            Response<ConsistencyGroupLinkPolicy> response = service.getDefaultRemoteGroupLinkPolicy().execute();
            validateResponse(response);
            ConsistencyGroupLinkPolicy consistencyGroupLinkPolicy = response.body();
            return consistencyGroupLinkPolicy;
        } catch (IOException e) {
            throw new Rp4vmClientException(e);
        }
    }

    public ConsistencyGroupUID replicateVms(ReplicateVmsParam params, boolean startTransfer) throws Rp4vmClientException {
        try {
            Response<ConsistencyGroupUID> response = service.replicateVms(params, startTransfer).execute();
            validateResponse(response);
            ConsistencyGroupUID groupUID = response.body();
            return groupUID;
        } catch (IOException e) {
            throw new Rp4vmClientException(e);
        }
    }


    public Long getClusterUID(String clusterName) throws Rp4vmClientException, Rp4vmClusterNotFoundException {
        try {
            Response<RecoverPointClustersInformation> response = service.getClusters().execute();
            RecoverPointClustersInformation clustersInformation = response.body();
            for (ClusterInfo clusterInfo : clustersInformation.getClustersInformation()) {
                if (clusterInfo.getClusterName().equals(clusterName)) {
                    return clusterInfo.getClusterUID().getId();
                }
            }
            throw new Rp4vmClusterNotFoundException("Cluster " + clusterName + " not found in system " + this.ipAddress);
        } catch (IOException e) {
            throw new Rp4vmClientException(e);
        }
    }


    public String getVcenterUuid(long clusterId) throws Rp4vmClientException, Rp4vmClusterNotFoundException {
        try {
            Response<ClusterVirtualInfraConfiguration> response = service.getClusterInfrastructureConfiguration(clusterId).execute();
            if (HttpStatus.INTERNAL_SERVER_ERROR.value() == response.code()) {
                throw new Rp4vmClusterNotFoundException(clusterId, ipAddress);
            }
            ClusterVirtualInfraConfiguration clusterVirtualInfraConfiguration = response.body();
            List<VirtualCenterConfiguration> virtualCenterConfigurationList = clusterVirtualInfraConfiguration.getVirtualCentersConfiguration();
            if (virtualCenterConfigurationList.size() != 1) {
                throw new Rp4vmClientException("Cluster " + clusterId + " has " + virtualCenterConfigurationList.size() + " vCenter configurations");
            }
            String vCenterUuid = virtualCenterConfigurationList.get(0).getVirtualCenterUID().getUuid();
            return vCenterUuid;
        } catch (IOException e) {
            throw new Rp4vmClientException(e);
        }
    }


    public String getEsxId(long clusterId, String esxName) throws Rp4vmClusterNotFoundException, Rp4vmClientException, Rp4vmEsxNotFoundException {
        try {
            Response<ClusterVirtualInfraConfiguration> response = service.getClusterInfrastructureConfiguration(clusterId).execute();
            if (HttpStatus.INTERNAL_SERVER_ERROR.value() == response.code()) {
                throw new Rp4vmClusterNotFoundException(clusterId, ipAddress);
            }
            ClusterVirtualInfraConfiguration clusterVirtualInfraConfiguration = response.body();
            List<VirtualCenterConfiguration> virtualCenterConfigurationList = clusterVirtualInfraConfiguration.getVirtualCentersConfiguration();
            if (virtualCenterConfigurationList.size() != 1) {
                throw new Rp4vmClientException("Cluster " + clusterId + " has " + virtualCenterConfigurationList.size() + " vCenter configurations");
            }
            List<DatacenterConfiguration> datacenterConfigurations = virtualCenterConfigurationList.get(0).getDatacentersConfiguration();

            for (DatacenterConfiguration datacenterConfiguration : datacenterConfigurations) {
                   List<EsxClusterConfiguration> esxClusterConfigurations= datacenterConfiguration.getEsxClustersConfiguration();
                for (EsxClusterConfiguration esxClusterConfiguration :esxClusterConfigurations) {
                    for (EsxConfiguration esxConfiguration : esxClusterConfiguration.getEsxsConfiguration())
                        if (esxName.equals(esxConfiguration.getName()))
                            return esxConfiguration.getEsxUID().toString();
                }

            }
            throw new Rp4vmEsxNotFoundException(esxName + " not found in Cluster "+ clusterId);
        } catch (IOException e) {
            throw new Rp4vmClientException(e);
        }
    }

    public String getEsxId(String clusterName, String esxName) throws Rp4vmClientException, Rp4vmClusterNotFoundException, Rp4vmEsxNotFoundException {
        return getEsxId(getClusterUID(clusterName), esxName);
    }
}
