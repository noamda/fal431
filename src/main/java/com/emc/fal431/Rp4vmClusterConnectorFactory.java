package com.emc.fal431;

import com.emc.fal431.convertor.JacksonConverterFactory;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;


import javax.net.ssl.*;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * Created by davidn1 on 10-May-16.
 */
public class Rp4vmClusterConnectorFactory {

    public static Rp4vmClusterConnector getConnector(String ipAddress, String user, String password) throws NoSuchAlgorithmException, KeyManagementException {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);


        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(loggingInterceptor);
        httpClient.addInterceptor(new HeaderInterceptor(user, password));
        httpClient.sslSocketFactory(getSslContext());
        httpClient.hostnameVerifier(getHostnameVerifier());

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(JacksonConverterFactory.create())
                .baseUrl("https://"+ipAddress+":7225/fapi/rest/4_3_1/")
                .client(httpClient.build())
                .build();

        Rp4vmClusterConnector service = retrofit.create(Rp4vmClusterConnector.class);
        return service;


    }

    private static SSLSocketFactory getSslContext() throws KeyManagementException, NoSuchAlgorithmException {
        // Install the all-trusting trust manager
        final SSLContext sslContext = SSLContext.getInstance("TLS");
        TrustManager[] trustManagers = new TrustManager[]{new TrustEveryoneManager()};
        sslContext.init(null, trustManagers, new SecureRandom());
        return sslContext.getSocketFactory();
    }

    private static HostnameVerifier getHostnameVerifier(){
        return new HostnameVerifier() {
            @Override
            public boolean verify(final String hostname, final SSLSession session) {
                return true;
            }
        };
    }
}
