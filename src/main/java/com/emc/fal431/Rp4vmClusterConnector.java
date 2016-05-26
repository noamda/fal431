package com.emc.fal431;

import com.emc.fal431.commons.*;
import retrofit2.Call;
import retrofit2.http.*;
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


    @POST(BASE_URL + "groups/virtual_machines/replicate")
    public Call<ConsistencyGroupUID> replicateVms(@Body ReplicateVmsParam params, @Query("startTransfer") boolean startTransfer);

    @GET(BASE_URL + "settings/defaults/group_link_policy/remote")
    public Call<ConsistencyGroupLinkPolicy> getDefaultRemoteGroupLinkPolicy();

    @GET(BASE_URL + "clusters/{clusterId}/settings")
    public Call<ClusterSettings> getClusterSettings(@Path("clusterId") long clusterId);



}
