package test;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.List;

/**
 * Created by davidn1 on 04-May-16.
 */
public class Main {
    public static void main(String[] args) {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(loggingInterceptor);



        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(JacksonConverterFactory.create())
                .baseUrl("http://foaas.com/")
                .client(httpClient.build())
                .build();

        FoaasService service = retrofit.create(FoaasService.class);

        try {
            Response<JsonVersionPojo> response = service.version().execute();
            response.code();
            response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Response<List<JsonPojo>> response = service.operations().execute();
            response.code();
            response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
