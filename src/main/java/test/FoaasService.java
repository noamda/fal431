package test;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

import java.util.List;

public interface FoaasService {
    @Headers({
            "Accept: application/json"
    })
    @GET("version")
    Call<JsonVersionPojo> version();

    @Headers({
            "Accept: application/json"
    })
    @GET("operations")
    Call<List<JsonPojo>> operations();
}

