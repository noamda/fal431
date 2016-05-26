package com.emc.fal431;

import java.util.List;

/**
 * Created by davidn1 on 18-May-16.
 */
public class ClustersVirtualConfiguration {

    private ClusterVirtualConfiguration productionCluster;
    private List<ClusterVirtualConfiguration> replicaClusters;

    public ClusterVirtualConfiguration getProductionCluster() {
        return productionCluster;
    }

    public void setProductionCluster(ClusterVirtualConfiguration productionCluster) {
        this.productionCluster = productionCluster;
    }

    public List<ClusterVirtualConfiguration> getReplicaClusters() {
        return replicaClusters;
    }

    public void setReplicaClusters(List<ClusterVirtualConfiguration> replicaCluster) {
        this.replicaClusters = replicaCluster;
    }
}
