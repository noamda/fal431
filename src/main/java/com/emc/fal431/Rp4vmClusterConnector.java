package com.emc.fal431;

import com.emc.fal431.commons.ClusterVirtualInfrastructuresState;
import com.emc.fal431.commons.RecoverPointClustersInformation;
import com.emc.fal431.commons.RecoverPointTimeStamp;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by davidn1 on 09-May-16.
 */
public interface Rp4vmClusterConnector {
    static final String BASE_URL = "";

    @GET(BASE_URL + "time/current_time")
    public Call<RecoverPointTimeStamp> getSystemTime();

    @GET(BASE_URL + "clusters/{clusterId}/virtual_infrastructures/state")
    public Call<ClusterVirtualInfrastructuresState> getVirtualInfrastructuresStateFromCluster(
            @Path("clusterId") long clusterId);

    @GET(BASE_URL + "clusters")
    public Call<RecoverPointClustersInformation> getRpClustersInformation();
}
