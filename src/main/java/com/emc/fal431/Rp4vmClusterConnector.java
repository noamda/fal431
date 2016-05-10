package com.emc.fal431;

import com.emc.fal431.commons.RecoverPointTimeStamp;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by davidn1 on 09-May-16.
 */
public interface Rp4vmClusterConnector {
    static final String BASE_URL = "";

    @GET(BASE_URL + "time/current_time")
    public Call<RecoverPointTimeStamp> getSystemTime();
}
