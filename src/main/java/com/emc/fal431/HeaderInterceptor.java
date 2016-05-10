package com.emc.fal431;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.tomcat.util.codec.binary.Base64;

import java.io.IOException;


public class HeaderInterceptor
        implements Interceptor {
    private String user = "admin";
    private String password = "admin";

    @Override
    public Response intercept(Chain chain)
            throws IOException {
        byte[] authEncBytes = Base64.encodeBase64(
                String.format("%s:%s", user, password).getBytes());
        String authStringEnc = new String(authEncBytes);
        Request request = chain.request();
        request = request.newBuilder()
                .addHeader("Authorization", "Basic " + authStringEnc)
                .build();

        Response response = chain.proceed(request);
        return response;
    }
}