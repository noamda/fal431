package com.emc.fal431;

import com.emc.fal431.exceptions.Rp4vmClientException;
import org.junit.Test;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidn1 on 15-May-16.
 */
public class TestCreateConsistencyGroup {
    private Rp4vmClient client = new Rp4vmClient(Configuration.ipAddress,Configuration.user,Configuration.password);

    public TestCreateConsistencyGroup() throws KeyManagementException, NoSuchAlgorithmException {
    }

    @Test
    public void testCreateCG()  {
        try {



            ClustersVirtualConfiguration clustersVirtualConfiguration = new ClustersVirtualConfiguration();

            //#1
            ClusterVirtualConfiguration productionCluster = new ClusterVirtualConfiguration();
            productionCluster.setClusterId(7389224974694197563l);//GET NAME
            productionCluster.setClusterName("devA1-rp-CLS01");//IRRELEVANT
            productionCluster.setClusterFriendlyName("NY");//IRRELEVANT
            productionCluster.setVcId("C5AF5339-0AF0-40FA-BB56-5BCBB55E5590");//Logical
            productionCluster.setDataCenterId("datacenter-2");
            productionCluster.setDatastoreId("datastore-26");
            productionCluster.setEsxClusterId("C5AF5339-0AF0-40FA-BB56-5BCBB55E5590:c7");
            productionCluster.setEsxId("421c3aa2-c757-407a-3877-c1f5b83bab28");
            clustersVirtualConfiguration.setProductionCluster(productionCluster);

            //#2
            ClusterVirtualConfiguration replicaCluster = new ClusterVirtualConfiguration();
            replicaCluster.setClusterId(5639176933751451868l);
            replicaCluster.setClusterName("DevA3-CLS01");
            replicaCluster.setClusterFriendlyName("London");
            replicaCluster.setVcId("DECF29E0-8992-4DAB-949C-CE32A443235F");
            replicaCluster.setDataCenterId("datacenter-2");
            replicaCluster.setDatastoreId("datastore-27");
            replicaCluster.setEsxClusterId("DECF29E0-8992-4DAB-949C-CE32A443235F:c7");
            replicaCluster.setEsxId("421c0983-9558-be4a-bb06-1d0a37ad0e54");


            List<ClusterVirtualConfiguration> replicaClusters = new ArrayList<ClusterVirtualConfiguration>();
            replicaClusters.add(replicaCluster);
            clustersVirtualConfiguration.setReplicaClusters(replicaClusters);


            List<String> vmIds = new ArrayList<String>();
            vmIds.add("503ad9cb-cd6d-e141-8288-75956eaefded");

            client.createConsistencyGroup("boris-noam-1", vmIds,
                    clustersVirtualConfiguration, 15,
                    true);
        } catch (Rp4vmClientException e) {
            e.printStackTrace();
        }
    }

//    @Test
//    public void createCg(){
//        // Get list of cluster
//        // Pick production cluster
//        // Get list of VMs
//
//        // Pick Vm to protect
//
//        // Get all params
//
//        //Protect
//
//    }
}
