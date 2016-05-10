package com.emc.fal431;

import com.emc.fal431.commons.RecoverPointTimeStamp;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * Created by davidn1 on 04-May-16.
 */
public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException, KeyManagementException {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        // Install the all-trusting trust manager
        final SSLContext sslContext = SSLContext.getInstance("TLS");
        TrustManager[] trustManagers = new TrustManager[]{new TrustEveryoneManager()};
        //sslContext.init(null, trustManagers, null);
        sslContext.init(null, trustManagers, new SecureRandom());
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(loggingInterceptor);
        httpClient.addInterceptor(new HeaderInterceptor());
        httpClient.sslSocketFactory(sslContext.getSocketFactory()).hostnameVerifier(new HostnameVerifier() {
            @Override
            public boolean verify(final String hostname, final SSLSession session) {
                return true;
            }
        });


        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(JacksonConverterFactory.create())
                .baseUrl("https://10.64.125.39:7225/fapi/rest/4_3_1/")
                .client(httpClient.build())
                .build();

        Rp4vmClusterConnector service = retrofit.create(Rp4vmClusterConnector.class);



        try {
            Response<RecoverPointTimeStamp> response = service.getSystemTime().execute();
            response.code();
            response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        try {
//            Response<List<JsonPojo>> response = service.operations().execute();
//            response.code();
//            response.body();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


}
